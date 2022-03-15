package org.hravemzdy.pzoroptimula.registry.constants

object OptimulaArticleConst extends Enumeration {
    type OptimulaArticleConst = Value

    val ARTICLE_TIMESHEETS_PLAN = Value(1001)     // Full Timesheets Hours
    val ARTICLE_TIMESHEETS_WORK = Value(1002)     // Work Timesheets Hours
    val ARTICLE_TIMEACTUAL_WORK = Value(1003)     // Work Timeactual Hours
    val ARTICLE_MSALARY_TARGETS = Value(2001)     // Base Salary
    val ARTICLE_HSALARY_TARGETS = Value(2002)     // Base Salary
    val ARTICLE_MAWARDS_TARGETS = Value(2003)     // Personal  Salary - Targets
    val ARTICLE_HAWARDS_TARGETS = Value(2004)     // Personal  Salary - Targets
    val ARTICLE_PREMIUM_TARGETS = Value(2005)     // Premium Bonus    - Targets
    val ARTICLE_PREMADV_TARGETS = Value(2006)     // Premium Boss     - Targets
    val ARTICLE_PREMEXT_TARGETS = Value(2007)     // Premium Personal - Targets
    val ARTICLE_AGRWORK_TARGETS = Value(2010)     // Agreement Work Tariff - Targets
    val ARTICLE_AGRTASK_TARGETS = Value(2011)     // Agreement Task Tariff - Targets
    val ARTICLE_OFFWORK_TARGETS = Value(2012)     // Agreement Work Tariff - Targets Plus
    val ARTICLE_OFFTASK_TARGETS = Value(2013)     // Agreement Task Tariff - Targets Plus
    val ARTICLE_SETTLEM_TARGETS = Value(3001)     // Setlement - Targets
    val ARTICLE_SETTLEM_TARNETT = Value(3002)     // Setlement - Targets
    val ARTICLE_SETTLEM_AGRWORK = Value(3003)     // Setlement - Agreement Work
    val ARTICLE_SETTLEM_AGRTASK = Value(3004)     // Setlement - Agreement Task
    val ARTICLE_SETTLEM_ALLOWCE = Value(3005)     // Setlement - Allowance
    val ARTICLE_SETTLEM_ALLNETT = Value(3006)     // Setlement - Allowance Netto
    val ARTICLE_SETTLEM_OFFWORK = Value(3007)     // Setlement - Agreement Work Plus
    val ARTICLE_SETTLEM_OFFTASK = Value(3008)     // Setlement - Agreement Task Plus
    val ARTICLE_SETTLEM_OFFSETS = Value(3009)     // Setlement - Allowance Plus
    val ARTICLE_PREMEXT_RESULTS = Value(4001)     // Premium Personal - Results
    val ARTICLE_PREMADV_RESULTS = Value(4002)     // Premium Boss     - Results
    val ARTICLE_PREMIUM_RESULTS = Value(4003)     // Premium Bonus    - Results
    val ARTICLE_MAWARDS_RESULTS = Value(4004)     // Personal Award   - Results
    val ARTICLE_HAWARDS_RESULTS = Value(4005)     // Personal Award   - Results
    val ARTICLE_SETTLEM_RESULTS = Value(4011)     // Setlement - Results
    val ARTICLE_SETTLEM_RESNETT = Value(4012)     // Setlement - Results
    val ARTICLE_ALLOWCE_HOFFICE = Value(4021)     // HomeOffice Tariff
    val ARTICLE_ALLOWCE_CLOTDAY = Value(4022)     // Clothing Daily Tarrif
    val ARTICLE_ALLOWCE_CLOTHRS = Value(4023)     // Clothing Hours Tarrif
    val ARTICLE_ALLOWCE_MEALDAY = Value(4024)     // Meal Contribution Tariff
    val ARTICLE_OFFSETS_HOFFICE = Value(4031)     // HomeOffice Tariff
    val ARTICLE_OFFSETS_CLOTDAY = Value(4032)     // Clothing Daily Tarrif
    val ARTICLE_OFFSETS_CLOTHRS = Value(4033)     // Clothing Hours Tarrif
    val ARTICLE_OFFSETS_MEALDAY = Value(4034)     // Meal Contribution Tariff
    val ARTICLE_INCOMES_TAXFREE = Value(5001)     // Incomes Tax Free
    val ARTICLE_INCOMES_TAXBASE = Value(5002)     // Incomes Tax
    val ARTICLE_INCOMES_TAXWINS = Value(5003)     // Incomes Tax and Insurance
    val ARTICLE_INCOMES_SUMMARY = Value(5004)     // Incomes Summary

    def getArticleSymbol(item: Int): String = {
        val optionConst =  OptimulaArticleConst.values.find(x => x.id == item)
        optionConst match {
            case Some(exists) => s"${exists}"
            case None => s"ArticleCode for ${item}"
        }
    }
}
