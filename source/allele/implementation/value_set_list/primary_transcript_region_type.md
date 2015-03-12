---
title: primary-transcript-region-type
description: This value set includes only the transcript associated regions that is associated with a transcript simple allele reference coordinate.
source: Sequence Ontology
id: TBD
usage: core
---

A controlled vocabulary term used to describe a single effected transcript feature. Currently constraint to be a child of [transcript_region](http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [VAT](http://www.yandell-lab.org/software/vaast.html) or [SnpEff](http://snpeff.sourceforge.net/) as well as tools which operate on [GFF3 files](http://www.sequenceontology.org/resources/gff3.html)

Sequence Ontology (SO) Codes
-------------------------

A constrained list Sequence Ontology (SO) terms to be used when annotating the SimpleAllele.ReferenceCoordinate.primaryRegionType for a transcript simple allele.  This list is explicitly developed to define the top level of terms from SO region types, enriching the ability to preform logic and algorithm based operations across larger groups of region types.

This value set can be used in conjunction with the [ancillary-transcript-region-type](ancillary_transcript_region_type.html), which can provide optional detail associated to the primary region type.

{:.table}
| SO Name | Code[ID] | 
|----------------|----------------|
| exon | [SO:0000147](http://www.sequenceontology.org/browser/current_svn/term/SO:0000147) |
| intron | [SO:0000188](http://www.sequenceontology.org/browser/current_svn/term/SO:0000188) |
| splice_site | [SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) |
| five_prime_UTR | [SO:0000204](http://www.sequenceontology.org/browser/current_svn/term/SO:0000204) |
| three_prime_UTR | [SO:0000205](http://www.sequenceontology.org/browser/current_svn/term/SO:0000205) |
| transcription_start_site | [SO:0000315](http://www.sequenceontology.org/browser/current_svn/term/SO:0000315) |
| transcription_end_site | [SO:0000616](http://www.sequenceontology.org/browser/current_svn/term/SO:0000616) |


This value set is used in the following places:

* [SimpleAllele.ReferenceCoordinate.primaryTranscriptRegionType (Resource)](/allele/resource/simple_allele)
* [TranscriptReferenceCoordinate.primaryRegionType (Conceptual)](/allele/conceptual/simple_allele/transcript_reference_coordinate.html)

**primaryRegionType:** (cardinality of 1)

* Annotations done using the primaryRegionType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `primaryRegionType` | `exon` | [SO:0000147](http://www.sequenceontology.org/browser/current_svn/term/SO:0000147) |
