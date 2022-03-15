package org.hravemzdy.pzoroptimula.service

import org.hravemzdy.procezor.service.ServiceProcezor
import org.hravemzdy.procezor.service.types.{ArticleCode, VersionCode}
import org.hravemzdy.pzoroptimula.registry.constants.OptimulaArticleConst
import org.hravemzdy.pzoroptimula.registry.factories.{OptimulaArticleFactory, OptimulaConceptFactory}

class ServiceOptimula() extends ServiceProcezor(ServiceOptimula.OPTIMULA_VERSION_SCM, ServiceOptimula.TEST_CALCS_ARTICLE) {
    override def buildArticleFactory(): Boolean = {
        this.articleFactory = new OptimulaArticleFactory()

        true
    }

    override def buildConceptFactory(): Boolean = {
        this.conceptFactory = new OptimulaConceptFactory()

        true
    }
}

object ServiceOptimula {
    private val OPTIMULA_VERSION_SCM: VersionCode = VersionCode.get(100)
    private val OPTIMULA_VERSION_EPS: VersionCode = VersionCode.get(200)
    private val OPTIMULA_VERSION_PUZZLE: VersionCode = VersionCode.get(300)

    private val ARTICLE_DEFAULT_SEQUENS: Int = 0

    private val TEST_CALCS_ARTICLE: Array[ArticleCode] = Array[ArticleCode](
        ArticleCode.get(OptimulaArticleConst.ARTICLE_SETTLEM_TARGETS.id),
        ArticleCode.get(OptimulaArticleConst.ARTICLE_SETTLEM_RESULTS.id),
        ArticleCode.get(OptimulaArticleConst.ARTICLE_SETTLEM_ALLOWCE.id),
        ArticleCode.get(OptimulaArticleConst.ARTICLE_SETTLEM_AGRWORK.id),
        ArticleCode.get(OptimulaArticleConst.ARTICLE_INCOMES_TAXFREE.id),
        ArticleCode.get(OptimulaArticleConst.ARTICLE_INCOMES_TAXBASE.id),
        ArticleCode.get(OptimulaArticleConst.ARTICLE_INCOMES_TAXWINS.id),
        ArticleCode.get(OptimulaArticleConst.ARTICLE_INCOMES_SUMMARY.id),
    )

    def getNew(): ServiceOptimula = {
        val service = new ServiceOptimula()
        val buildSuccess = service.buildFactories()
        if (buildSuccess == false) {
            println(s"Version: ${service.version}, build factories failed")
        }
        service
    }
}
