package org.hravemzdy.pzoroptimula.registry.factories

import org.hravemzdy.procezor.interfaces.IConceptSpec
import org.hravemzdy.procezor.registry.factories.{ConceptSpecFactory, SpecFactory}
import org.hravemzdy.procezor.registry.providers.{ConceptSpec, ConceptSpecProvider, IConceptSpecProvider}
import org.hravemzdy.procezor.registry.factories.FactoryTypes.CODE
import org.hravemzdy.procezor.service.types.ConceptCode

class OptimulaConceptFactory() extends ConceptSpecFactory() {
  override val providers: Map[CODE, IConceptSpecProvider] =
    SpecFactory.buildProvidersFromAssembly[IConceptSpecProvider, IConceptSpec, ConceptCode]("org.hravemzdy.procezor.example")
}