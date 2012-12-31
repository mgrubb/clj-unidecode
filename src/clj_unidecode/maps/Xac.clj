;;;
;;; Copyright (c) 2012 Michael Grubb
;;; All rights reserved.
;;; 
;;; Redistribution and use in source and binary forms, with or without
;;; modification, are permitted provided that the following conditions
;;; are met:
;;; 1. Redistributions of source code must retain the above copyright
;;;    notice, this list of conditions and the following disclaimer.
;;; 2. Redistributions in binary form must reproduce the above copyright
;;;    notice, this list of conditions and the following disclaimer in the
;;;    documentation and/or other materials provided with the distribution.
;;; 3. The name of the author may not be used to endorse or promote products
;;;    derived from this software without specific prior written permission.
;;; 
;;; THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
;;; IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
;;; OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
;;; IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
;;; INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
;;; NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
;;; DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
;;; THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
;;; (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
;;; THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
;;;

(ns clj-unidecode.maps.Xac)
(def decode [
  "ga" ;; 0x00
  "gag" ;; 0x01
  "gagg" ;; 0x02
  "gags" ;; 0x03
  "gan" ;; 0x04
  "ganj" ;; 0x05
  "ganh" ;; 0x06
  "gad" ;; 0x07
  "gal" ;; 0x08
  "galg" ;; 0x09
  "galm" ;; 0x0a
  "galb" ;; 0x0b
  "gals" ;; 0x0c
  "galt" ;; 0x0d
  "galp" ;; 0x0e
  "galh" ;; 0x0f
  "gam" ;; 0x10
  "gab" ;; 0x11
  "gabs" ;; 0x12
  "gas" ;; 0x13
  "gass" ;; 0x14
  "gang" ;; 0x15
  "gaj" ;; 0x16
  "gac" ;; 0x17
  "gak" ;; 0x18
  "gat" ;; 0x19
  "gap" ;; 0x1a
  "gah" ;; 0x1b
  "gae" ;; 0x1c
  "gaeg" ;; 0x1d
  "gaegg" ;; 0x1e
  "gaegs" ;; 0x1f
  "gaen" ;; 0x20
  "gaenj" ;; 0x21
  "gaenh" ;; 0x22
  "gaed" ;; 0x23
  "gael" ;; 0x24
  "gaelg" ;; 0x25
  "gaelm" ;; 0x26
  "gaelb" ;; 0x27
  "gaels" ;; 0x28
  "gaelt" ;; 0x29
  "gaelp" ;; 0x2a
  "gaelh" ;; 0x2b
  "gaem" ;; 0x2c
  "gaeb" ;; 0x2d
  "gaebs" ;; 0x2e
  "gaes" ;; 0x2f
  "gaess" ;; 0x30
  "gaeng" ;; 0x31
  "gaej" ;; 0x32
  "gaec" ;; 0x33
  "gaek" ;; 0x34
  "gaet" ;; 0x35
  "gaep" ;; 0x36
  "gaeh" ;; 0x37
  "gya" ;; 0x38
  "gyag" ;; 0x39
  "gyagg" ;; 0x3a
  "gyags" ;; 0x3b
  "gyan" ;; 0x3c
  "gyanj" ;; 0x3d
  "gyanh" ;; 0x3e
  "gyad" ;; 0x3f
  "gyal" ;; 0x40
  "gyalg" ;; 0x41
  "gyalm" ;; 0x42
  "gyalb" ;; 0x43
  "gyals" ;; 0x44
  "gyalt" ;; 0x45
  "gyalp" ;; 0x46
  "gyalh" ;; 0x47
  "gyam" ;; 0x48
  "gyab" ;; 0x49
  "gyabs" ;; 0x4a
  "gyas" ;; 0x4b
  "gyass" ;; 0x4c
  "gyang" ;; 0x4d
  "gyaj" ;; 0x4e
  "gyac" ;; 0x4f
  "gyak" ;; 0x50
  "gyat" ;; 0x51
  "gyap" ;; 0x52
  "gyah" ;; 0x53
  "gyae" ;; 0x54
  "gyaeg" ;; 0x55
  "gyaegg" ;; 0x56
  "gyaegs" ;; 0x57
  "gyaen" ;; 0x58
  "gyaenj" ;; 0x59
  "gyaenh" ;; 0x5a
  "gyaed" ;; 0x5b
  "gyael" ;; 0x5c
  "gyaelg" ;; 0x5d
  "gyaelm" ;; 0x5e
  "gyaelb" ;; 0x5f
  "gyaels" ;; 0x60
  "gyaelt" ;; 0x61
  "gyaelp" ;; 0x62
  "gyaelh" ;; 0x63
  "gyaem" ;; 0x64
  "gyaeb" ;; 0x65
  "gyaebs" ;; 0x66
  "gyaes" ;; 0x67
  "gyaess" ;; 0x68
  "gyaeng" ;; 0x69
  "gyaej" ;; 0x6a
  "gyaec" ;; 0x6b
  "gyaek" ;; 0x6c
  "gyaet" ;; 0x6d
  "gyaep" ;; 0x6e
  "gyaeh" ;; 0x6f
  "geo" ;; 0x70
  "geog" ;; 0x71
  "geogg" ;; 0x72
  "geogs" ;; 0x73
  "geon" ;; 0x74
  "geonj" ;; 0x75
  "geonh" ;; 0x76
  "geod" ;; 0x77
  "geol" ;; 0x78
  "geolg" ;; 0x79
  "geolm" ;; 0x7a
  "geolb" ;; 0x7b
  "geols" ;; 0x7c
  "geolt" ;; 0x7d
  "geolp" ;; 0x7e
  "geolh" ;; 0x7f
  "geom" ;; 0x80
  "geob" ;; 0x81
  "geobs" ;; 0x82
  "geos" ;; 0x83
  "geoss" ;; 0x84
  "geong" ;; 0x85
  "geoj" ;; 0x86
  "geoc" ;; 0x87
  "geok" ;; 0x88
  "geot" ;; 0x89
  "geop" ;; 0x8a
  "geoh" ;; 0x8b
  "ge" ;; 0x8c
  "geg" ;; 0x8d
  "gegg" ;; 0x8e
  "gegs" ;; 0x8f
  "gen" ;; 0x90
  "genj" ;; 0x91
  "genh" ;; 0x92
  "ged" ;; 0x93
  "gel" ;; 0x94
  "gelg" ;; 0x95
  "gelm" ;; 0x96
  "gelb" ;; 0x97
  "gels" ;; 0x98
  "gelt" ;; 0x99
  "gelp" ;; 0x9a
  "gelh" ;; 0x9b
  "gem" ;; 0x9c
  "geb" ;; 0x9d
  "gebs" ;; 0x9e
  "ges" ;; 0x9f
  "gess" ;; 0xa0
  "geng" ;; 0xa1
  "gej" ;; 0xa2
  "gec" ;; 0xa3
  "gek" ;; 0xa4
  "get" ;; 0xa5
  "gep" ;; 0xa6
  "geh" ;; 0xa7
  "gyeo" ;; 0xa8
  "gyeog" ;; 0xa9
  "gyeogg" ;; 0xaa
  "gyeogs" ;; 0xab
  "gyeon" ;; 0xac
  "gyeonj" ;; 0xad
  "gyeonh" ;; 0xae
  "gyeod" ;; 0xaf
  "gyeol" ;; 0xb0
  "gyeolg" ;; 0xb1
  "gyeolm" ;; 0xb2
  "gyeolb" ;; 0xb3
  "gyeols" ;; 0xb4
  "gyeolt" ;; 0xb5
  "gyeolp" ;; 0xb6
  "gyeolh" ;; 0xb7
  "gyeom" ;; 0xb8
  "gyeob" ;; 0xb9
  "gyeobs" ;; 0xba
  "gyeos" ;; 0xbb
  "gyeoss" ;; 0xbc
  "gyeong" ;; 0xbd
  "gyeoj" ;; 0xbe
  "gyeoc" ;; 0xbf
  "gyeok" ;; 0xc0
  "gyeot" ;; 0xc1
  "gyeop" ;; 0xc2
  "gyeoh" ;; 0xc3
  "gye" ;; 0xc4
  "gyeg" ;; 0xc5
  "gyegg" ;; 0xc6
  "gyegs" ;; 0xc7
  "gyen" ;; 0xc8
  "gyenj" ;; 0xc9
  "gyenh" ;; 0xca
  "gyed" ;; 0xcb
  "gyel" ;; 0xcc
  "gyelg" ;; 0xcd
  "gyelm" ;; 0xce
  "gyelb" ;; 0xcf
  "gyels" ;; 0xd0
  "gyelt" ;; 0xd1
  "gyelp" ;; 0xd2
  "gyelh" ;; 0xd3
  "gyem" ;; 0xd4
  "gyeb" ;; 0xd5
  "gyebs" ;; 0xd6
  "gyes" ;; 0xd7
  "gyess" ;; 0xd8
  "gyeng" ;; 0xd9
  "gyej" ;; 0xda
  "gyec" ;; 0xdb
  "gyek" ;; 0xdc
  "gyet" ;; 0xdd
  "gyep" ;; 0xde
  "gyeh" ;; 0xdf
  "go" ;; 0xe0
  "gog" ;; 0xe1
  "gogg" ;; 0xe2
  "gogs" ;; 0xe3
  "gon" ;; 0xe4
  "gonj" ;; 0xe5
  "gonh" ;; 0xe6
  "god" ;; 0xe7
  "gol" ;; 0xe8
  "golg" ;; 0xe9
  "golm" ;; 0xea
  "golb" ;; 0xeb
  "gols" ;; 0xec
  "golt" ;; 0xed
  "golp" ;; 0xee
  "golh" ;; 0xef
  "gom" ;; 0xf0
  "gob" ;; 0xf1
  "gobs" ;; 0xf2
  "gos" ;; 0xf3
  "goss" ;; 0xf4
  "gong" ;; 0xf5
  "goj" ;; 0xf6
  "goc" ;; 0xf7
  "gok" ;; 0xf8
  "got" ;; 0xf9
  "gop" ;; 0xfa
  "goh" ;; 0xfb
  "gwa" ;; 0xfc
  "gwag" ;; 0xfd
  "gwagg" ;; 0xfe
  "gwags" ;; 0xff
])
