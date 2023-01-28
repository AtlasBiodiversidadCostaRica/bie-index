package cr.org.crbio.vocab;

import org.gbif.dwc.terms.Term;
import org.gbif.dwc.terms.TermFactory;

/**
 * @authors William Ulate, Manuel Vargas;
 */
public enum CRBioTerm implements Term {
    /** Unique identifier of the record within the database. */
    TaxonRecordID,
    /** An Uniform Resource Name (URN) used as an unique identifier of the taxon record. */
    GlobalUniqueIdentifier,
    /** General description of the taxon. This concept could point out any information about the taxon. Its main goal is summarize the most relevant or attractive characteristics of this taxon to the general public. */
    Abstract,
    /** Language used to write the species information, ISO 639-2 according to GBIF Metadata Profile, Reference Guide http://links.gbif.org/gbif_metadata_profile_guide_en_v1. */
    Language,
    /** Users to which the information is addressed. The defined audiences are: Biodiversity researchers, teachers and students, decision makers, professionals from another areas and general public.This list audience codes has to be separated by means of comma or /. */
    AudiencesUnstructured,
    /** A list of scientific names used for this taxon as a text block */
    SynonymsUnstructured,
    /** Unstructured information regarding the names of the species or taxon, whether these are scientific or not. */
    DetailUnstructured,
    /** Brief description, presented in a simple technical language, to distinguish the species from other close or similar ones. */
    BriefDescription,
    /** Complete and detailed account of the taxonomic and systematic characters, usually comprising several sections, and not limited to the diagnostic features. */
    FullDescriptionUnstructured,
    /** Tool for the identification of organisms, comprising a series of steps, each of which represents a question about one or more characters of the organism. Each step offers multiple alternatives, choosing one of them will lead us to the next step until reaching, finally, the name of the organism. Most of the keys only offer two alternatives, the so called dichotomous keys. A taxon can include an identification key for the subordinate taxa. */
    Keys,
    /** General appearance. Characteristic mode of growth or occurrence associated to its environment, particularly for plants. Comprising its size, shape, texture and orientation. In block text format */
    LifeFormUnstructured,
    /** Life history of a living organism: The course of developmental changes in an organism from fertilized zygote to maturity or stages through which an organism passes. In block text format. */
    LifeCycleUnstructured,
    /** All data related to the production of offspring as a  block of text. */
    ReproductionUnstructured,
    /** An action in the natural history of the species that occurs at some location during some time. A controlled vocabulary is recommended. */
    Event,
    /** The date-time or interval at which an event starts. Recommended best practice is to use an encoding scheme, such as ISO 8601:2004(E). A controlled vocabulary is recommended. */
    StartTimeInterval,
    /** The date-time or interval at which an event ends. Recommended best practice is to use an encoding scheme, such as ISO 8601:2004(E).A controlled vocabulary is recommended. */
    EndTimeInterval,
    /** Set of changes or events that recurrently take place at the same time of year and are influenced by seasonal and inter-annual climate variations. For example: reproduction, flowering, fruiting, emergence of insects, etc. Also called phenology, mainly in plants. In the case of migration, refers only to the timing of it; other data about this are gathered in MigratoryData. In block text format. */
    AnnualCycleUnstructured,
    /** Primary diet source. A controlled vocabulary is recommended. */
    FeedingType,
    /** Tactic used to obtain energy or nutrients. A controlled vocabulary is recommended. */
    TrophicStrategy,
    /** Unstructure notes about feeding strategies. */
    TrophicStrategyRemarks,
    /** Information related to supply food for the development and sustenance of the individual and-or its offspring as  text block. */
    FeedingUnstructured,
    /** Means or vector of dispersal. A controlled vocabulary is recommend. */
    DispersalType,
    /** Mechanism or structure which seeds are dispersed. A controlled vocabulary is recommend. */
    StructureDispersed,
    /** The permanent spreading of individuals away from each other not including return. Dispersal determines the range over which genetic mixing occurs, and thus, the degree of homogeneity and inbreeding in a population. In block text format. */
    DispersalUnstructured,
    /** Responses, reactions or movements made by an organism in a particular situation. In block text format. */
    BehaviorUnstructured,
    /** String with the type of interaction. Each element is seperated by comma and each list of elements by ;. A controlled vocabulary is recommended. */
    InteractionSpeciesType,
    /** Mutual or reciprocal actions or influences. For example, predation, parasitism, mutualism, etc. Relations with products grown and stored by man (plagues) are also included. In block text format. */
    InteractionUnstructured,
    /** Information on the chemical structures and biological processes at the molecular level: DNA and proteins sequences, protein structures, expression profiles of genes protein domains, families of genes, mutations, polymorphisms, involvement in disease, ... Undeveloped. Placeholder for connecting with standards developed by specialists. For example, Standards for Data Exchange and Management from Scalalife (http://www.scalalife.eu/content/data.html). As free text. */
    MolecularDataUnstructured,
    /** The regular, usually seasonal, movement of all or part of an animal population to and from a given area, which can occur in variable periods of time and even involve more than one generation. In block text format. */
    MigratoryUnstructured,
    /** Ecological importance of the taxon. (Placeholder). In block text format.  */
    EcologicalSignificanceUnstructured,
    /** Set of environmental conditions within which it is believed that the species can persist; that is where its environmental requirements can be satisfied. In block text format. */
    EnvironmentalEnvelopeUnstructured,
    /** An indication of the actual impact as a free text string. */
    WhatImpact,
    /** By which means a species occupies a new territory. */
    Vector,
    /** This is equivalent and probably replaceable by gisin:route. */
    Route,
    /** This is equivalent and probably replaceable by gisin:target */
    impactTarget,
    /** Mechanism of introduction or impact to a new location. This is equivalent and probably replaceable by gisin:impactMechanism. */
    impactMechanism,
    /** Information about invasive exotic species that could threaten to ecosystem, habitats and species. As a text block */
    InvasivenessUnstructured,
    /** General description of the sites where the species is found (ecosystem, forest, environment or micro-habitat). (Placeholder). In block text format */
    HabitatUnstructured,
    /** Comment about the distribution of the species based on information from the collection sites of the studied specimens. A a text block. */
    DistributionUnstructured,
    /** Organism that lives exclusively in a particular territory and not found anywhere else. As a text block. */
    EndemicUnstructured,
    /** Information associated mostly to vertebrates, referring to the territorial extension of the individual or group in terms of its activities (feeding, mating, etc.). As a text block. */
    TerritoryUnstructured,
    /** Study of the variations in time and space as well as size and density of populations, and the factors that cause such variations. As a text block. */
    PopulationBiologyUnstructured,
    /** Information about the status of the taxon.As a text block. */
    ThreatStatusUnstructured,
    /** A free text describing sources of stress and proximate pressures that are impacting or may impact the threat status of the taxon. Threats can be past (historical), ongoing, and/or likely to occur in the future. */
    DirectThreatUnstructured,
    /** A national proposed law or group of laws. A regional proposed law or group of laws. In block text format. */
    LegislationUnstructured,
    /** Ways in which species are utilized by people. Including Folklore. As a text block. */
    UsesUnstructured,
    /** Management: actions directed at conserving or restoring species / Conservation: interventions undertaken designed to preserve species. As a text block. */
    ManagementAndConservationUnstructured,
    /** Record type describing Plinian Core Simple taxon descriptions */
    PlinianCore;




    public static final String NS = "http://purl.org/plic/terms/3.2.1/";
    public static final String PREFIX = "plic:";

    public String qualifiedName() {
        return NS + this.simpleName();
    }

    public String simpleName() {
        return this.name();
    }

    public String toString() {
         return PREFIX + name();
    }

    static {
        TermFactory factory = TermFactory.instance();
        for (Term term : CRBioTerm.values()) {
            factory.addTerm(term.simpleName(), term, true);
            factory.addTerm(term.qualifiedName(), term);
            factory.addTerm(PREFIX + term.simpleName(), term);
        }
    }

}
