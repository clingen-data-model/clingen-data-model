---
title: GenomicReferenceCoordinate
layout: conceptual
model: allele
description: GenomicReferenceCoordinate defines a location with respect to a <a href="/conceptual/reference_sequence/genomic_reference_sequence.html">GenomicReferenceSequence</a>.  

---

Scope and Usage
---------------

[ReferenceCoordinate](reference_coordinate.html) represents a particular contiguous location at which different alleles may be defined with [ContextualAllele](index.html).  GenomicReferenceCoordinate is a [ReferenceCoordinate](reference_coordinate.html) where the underlying reference sequence is a [GenomicReferenceSequence](/conceptual/reference_sequence/genomic_reference_sequence.html)

Attributes 
----------

None beyond those provided by [ReferenceCoordinate](reference_coordinate.html).

Related Entities
----------------

{:.table}
|  Relation Name | Entity Type | Cardinality |
|----------------|-------------|-------------|
| referenceSequence | [GenomicReferenceSequence](/conceptual/reference_sequence/genomic_reference_sequence.html) | 1 |

referenceSequence: points to the [GenomicReferenceSequence](/conceptual/reference_sequence/genomic_reference_sequence.html)  on which this GenomicReferenceCoordinate is located.
