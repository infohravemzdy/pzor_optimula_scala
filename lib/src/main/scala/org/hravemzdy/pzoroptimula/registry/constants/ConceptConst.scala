package org.hravemzdy.pzoroptimula.registry.constants

object OptimulaConceptConst extends Enumeration {
    type OptimulaConceptConst = Value

    val CONCEPT_TIMESHEETS_PLAN = Value(1001)
    val CONCEPT_TIMESHEETS_WORK = Value(1002)
    val CONCEPT_TIMEACTUAL_WORK = Value(1003)
    val CONCEPT_PAYMENT_BASIS   = Value(2001)
    val CONCEPT_PAYMENT_HOURS   = Value(2002)
    val CONCEPT_PAYMENT_FIXED   = Value(2003)
    val CONCEPT_OPTIMUS_BASIS   = Value(2011)
    val CONCEPT_OPTIMUS_HOURS   = Value(2012)
    val CONCEPT_OPTIMUS_FIXED   = Value(2013)
    val CONCEPT_OPTIMUS_NETTO   = Value(2014)
    val CONCEPT_REDUCED_BASIS   = Value(2021)
    val CONCEPT_REDUCED_HOURS   = Value(2022)
    val CONCEPT_REDUCED_FIXED   = Value(2023)
    val CONCEPT_REDUCED_NETTO   = Value(2024)
    val CONCEPT_AGRWORK_HOURS   = Value(2031)
    val CONCEPT_AGRTASK_HOURS   = Value(2032)
    val CONCEPT_ALLOWCE_MFULL   = Value(3001)
    val CONCEPT_ALLOWCE_HFULL   = Value(3002)
    val CONCEPT_ALLOWCE_HOURS   = Value(3003)
    val CONCEPT_ALLOWCE_DAILY   = Value(3004)
    val CONCEPT_ALLDOWN_DAILY   = Value(3005)
    val CONCEPT_OFFWORK_HOURS   = Value(3011)
    val CONCEPT_OFFTASK_HOURS   = Value(3012)
    val CONCEPT_OFFSETS_HFULL   = Value(3013)
    val CONCEPT_OFFSETS_HOURS   = Value(3014)
    val CONCEPT_OFFSETS_DAILY   = Value(3015)
    val CONCEPT_OFFDOWN_DAILY   = Value(3016)
    val CONCEPT_SETTLEM_TARGETS = Value(4001)
    val CONCEPT_SETTLEM_TARNETT = Value(4002)
    val CONCEPT_SETTLEM_AGRWORK = Value(4003)
    val CONCEPT_SETTLEM_AGRTASK = Value(4004)
    val CONCEPT_SETTLEM_ALLOWCE = Value(4005)
    val CONCEPT_SETTLEM_ALLNETT = Value(4006)
    val CONCEPT_SETTLEM_OFFWORK = Value(4011)
    val CONCEPT_SETTLEM_OFFTASK = Value(4012)
    val CONCEPT_SETTLEM_OFFSETS = Value(4013)
    val CONCEPT_SETTLEM_RESULTS = Value(4014)
    val CONCEPT_SETTLEM_RESNETT = Value(4015)
    val CONCEPT_INCOMES_TAXFREE = Value(5001)
    val CONCEPT_INCOMES_TAXBASE = Value(5002)
    val CONCEPT_INCOMES_TAXWINS = Value(5003)
    val CONCEPT_INCOMES_SUMMARY = Value(5004)

    def getConceptSymbol(item: Int): String = {
        val optionConst =  OptimulaConceptConst.values.find(x => x.id == item)
        optionConst match {
            case Some(exists) => s"${exists}"
            case None => s"ConceptCode for ${item}"
        }
    }
}

