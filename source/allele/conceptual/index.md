Overview
---------

Each entity in the conceptual model has related documentation; the purpose of this section is to provide an overall overview of the way in which the different entitles interact.  For details, view the entity documentation.

The most important entity in the conceptual allele model is the CanonicalAllele.  This entity provides a stable identifier, independent of sequence version.  This stable identifier is the identifier that is used in statements about the allele, such as its population frequency or pathogenicity.  

A canonical allele may be either a simple allele, meaning that it occurs at a contiguous locus, or a complex allele, meaning that it is a collection of simple alleles that occur together in cis.

A simple canonical allele is an aggregation of simple alleles, each of which can be defined as the choice of a particular genetic sequence at a given coordinate on a given reference sequence.   With this definition a simple allele may contains essentially the information that can be encoded in a particular HGVS expression.  

The conceptual model independently models different subtypes of reference sequence, reference coordinate, and simple allele.  For example, genomic simple alleles occur at genomic reference coordinates on genomic reference sequences. With this parallel construction, the conceptual model allows type-specific attributes to be associated with type-specific entities.

Complex alleles are defined only at the canonical level, because they are defined as sets of canonical simple alleles that occur together.


[![Conceptual model diagram](/images/AlleleConceptual.svg){: .img-responsive}](/images/AlleleConceptual.svg)