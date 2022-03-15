package org.hravemzdy.pzoroptimula.registry.factories

import org.hravemzdy.procezor.registry.factories.{ArticleSpecFactory, ProviderRecord, SpecFactory}
import org.hravemzdy.procezor.registry.providers.{IArticleSpecProvider}
import org.hravemzdy.procezor.registry.factories.FactoryTypes.CODE

class OptimulaArticleFactory() extends ArticleSpecFactory() {
  private val ARTICLE_DEFAULT_SEQUENS: Int = 0
  private val providersConfig = Array[ProviderRecord](
  )

  override val providers: Map[CODE, IArticleSpecProvider] =
    ArticleSpecFactory.buildProvidersFromRecords(providersConfig.toArray)
}

