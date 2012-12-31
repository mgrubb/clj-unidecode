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

(ns clj-unidecode.maps.Xb1)
(def decode [
  "nyaess" ;; 0x00
  "nyaeng" ;; 0x01
  "nyaej" ;; 0x02
  "nyaec" ;; 0x03
  "nyaek" ;; 0x04
  "nyaet" ;; 0x05
  "nyaep" ;; 0x06
  "nyaeh" ;; 0x07
  "neo" ;; 0x08
  "neog" ;; 0x09
  "neogg" ;; 0x0a
  "neogs" ;; 0x0b
  "neon" ;; 0x0c
  "neonj" ;; 0x0d
  "neonh" ;; 0x0e
  "neod" ;; 0x0f
  "neol" ;; 0x10
  "neolg" ;; 0x11
  "neolm" ;; 0x12
  "neolb" ;; 0x13
  "neols" ;; 0x14
  "neolt" ;; 0x15
  "neolp" ;; 0x16
  "neolh" ;; 0x17
  "neom" ;; 0x18
  "neob" ;; 0x19
  "neobs" ;; 0x1a
  "neos" ;; 0x1b
  "neoss" ;; 0x1c
  "neong" ;; 0x1d
  "neoj" ;; 0x1e
  "neoc" ;; 0x1f
  "neok" ;; 0x20
  "neot" ;; 0x21
  "neop" ;; 0x22
  "neoh" ;; 0x23
  "ne" ;; 0x24
  "neg" ;; 0x25
  "negg" ;; 0x26
  "negs" ;; 0x27
  "nen" ;; 0x28
  "nenj" ;; 0x29
  "nenh" ;; 0x2a
  "ned" ;; 0x2b
  "nel" ;; 0x2c
  "nelg" ;; 0x2d
  "nelm" ;; 0x2e
  "nelb" ;; 0x2f
  "nels" ;; 0x30
  "nelt" ;; 0x31
  "nelp" ;; 0x32
  "nelh" ;; 0x33
  "nem" ;; 0x34
  "neb" ;; 0x35
  "nebs" ;; 0x36
  "nes" ;; 0x37
  "ness" ;; 0x38
  "neng" ;; 0x39
  "nej" ;; 0x3a
  "nec" ;; 0x3b
  "nek" ;; 0x3c
  "net" ;; 0x3d
  "nep" ;; 0x3e
  "neh" ;; 0x3f
  "nyeo" ;; 0x40
  "nyeog" ;; 0x41
  "nyeogg" ;; 0x42
  "nyeogs" ;; 0x43
  "nyeon" ;; 0x44
  "nyeonj" ;; 0x45
  "nyeonh" ;; 0x46
  "nyeod" ;; 0x47
  "nyeol" ;; 0x48
  "nyeolg" ;; 0x49
  "nyeolm" ;; 0x4a
  "nyeolb" ;; 0x4b
  "nyeols" ;; 0x4c
  "nyeolt" ;; 0x4d
  "nyeolp" ;; 0x4e
  "nyeolh" ;; 0x4f
  "nyeom" ;; 0x50
  "nyeob" ;; 0x51
  "nyeobs" ;; 0x52
  "nyeos" ;; 0x53
  "nyeoss" ;; 0x54
  "nyeong" ;; 0x55
  "nyeoj" ;; 0x56
  "nyeoc" ;; 0x57
  "nyeok" ;; 0x58
  "nyeot" ;; 0x59
  "nyeop" ;; 0x5a
  "nyeoh" ;; 0x5b
  "nye" ;; 0x5c
  "nyeg" ;; 0x5d
  "nyegg" ;; 0x5e
  "nyegs" ;; 0x5f
  "nyen" ;; 0x60
  "nyenj" ;; 0x61
  "nyenh" ;; 0x62
  "nyed" ;; 0x63
  "nyel" ;; 0x64
  "nyelg" ;; 0x65
  "nyelm" ;; 0x66
  "nyelb" ;; 0x67
  "nyels" ;; 0x68
  "nyelt" ;; 0x69
  "nyelp" ;; 0x6a
  "nyelh" ;; 0x6b
  "nyem" ;; 0x6c
  "nyeb" ;; 0x6d
  "nyebs" ;; 0x6e
  "nyes" ;; 0x6f
  "nyess" ;; 0x70
  "nyeng" ;; 0x71
  "nyej" ;; 0x72
  "nyec" ;; 0x73
  "nyek" ;; 0x74
  "nyet" ;; 0x75
  "nyep" ;; 0x76
  "nyeh" ;; 0x77
  "no" ;; 0x78
  "nog" ;; 0x79
  "nogg" ;; 0x7a
  "nogs" ;; 0x7b
  "non" ;; 0x7c
  "nonj" ;; 0x7d
  "nonh" ;; 0x7e
  "nod" ;; 0x7f
  "nol" ;; 0x80
  "nolg" ;; 0x81
  "nolm" ;; 0x82
  "nolb" ;; 0x83
  "nols" ;; 0x84
  "nolt" ;; 0x85
  "nolp" ;; 0x86
  "nolh" ;; 0x87
  "nom" ;; 0x88
  "nob" ;; 0x89
  "nobs" ;; 0x8a
  "nos" ;; 0x8b
  "noss" ;; 0x8c
  "nong" ;; 0x8d
  "noj" ;; 0x8e
  "noc" ;; 0x8f
  "nok" ;; 0x90
  "not" ;; 0x91
  "nop" ;; 0x92
  "noh" ;; 0x93
  "nwa" ;; 0x94
  "nwag" ;; 0x95
  "nwagg" ;; 0x96
  "nwags" ;; 0x97
  "nwan" ;; 0x98
  "nwanj" ;; 0x99
  "nwanh" ;; 0x9a
  "nwad" ;; 0x9b
  "nwal" ;; 0x9c
  "nwalg" ;; 0x9d
  "nwalm" ;; 0x9e
  "nwalb" ;; 0x9f
  "nwals" ;; 0xa0
  "nwalt" ;; 0xa1
  "nwalp" ;; 0xa2
  "nwalh" ;; 0xa3
  "nwam" ;; 0xa4
  "nwab" ;; 0xa5
  "nwabs" ;; 0xa6
  "nwas" ;; 0xa7
  "nwass" ;; 0xa8
  "nwang" ;; 0xa9
  "nwaj" ;; 0xaa
  "nwac" ;; 0xab
  "nwak" ;; 0xac
  "nwat" ;; 0xad
  "nwap" ;; 0xae
  "nwah" ;; 0xaf
  "nwae" ;; 0xb0
  "nwaeg" ;; 0xb1
  "nwaegg" ;; 0xb2
  "nwaegs" ;; 0xb3
  "nwaen" ;; 0xb4
  "nwaenj" ;; 0xb5
  "nwaenh" ;; 0xb6
  "nwaed" ;; 0xb7
  "nwael" ;; 0xb8
  "nwaelg" ;; 0xb9
  "nwaelm" ;; 0xba
  "nwaelb" ;; 0xbb
  "nwaels" ;; 0xbc
  "nwaelt" ;; 0xbd
  "nwaelp" ;; 0xbe
  "nwaelh" ;; 0xbf
  "nwaem" ;; 0xc0
  "nwaeb" ;; 0xc1
  "nwaebs" ;; 0xc2
  "nwaes" ;; 0xc3
  "nwaess" ;; 0xc4
  "nwaeng" ;; 0xc5
  "nwaej" ;; 0xc6
  "nwaec" ;; 0xc7
  "nwaek" ;; 0xc8
  "nwaet" ;; 0xc9
  "nwaep" ;; 0xca
  "nwaeh" ;; 0xcb
  "noe" ;; 0xcc
  "noeg" ;; 0xcd
  "noegg" ;; 0xce
  "noegs" ;; 0xcf
  "noen" ;; 0xd0
  "noenj" ;; 0xd1
  "noenh" ;; 0xd2
  "noed" ;; 0xd3
  "noel" ;; 0xd4
  "noelg" ;; 0xd5
  "noelm" ;; 0xd6
  "noelb" ;; 0xd7
  "noels" ;; 0xd8
  "noelt" ;; 0xd9
  "noelp" ;; 0xda
  "noelh" ;; 0xdb
  "noem" ;; 0xdc
  "noeb" ;; 0xdd
  "noebs" ;; 0xde
  "noes" ;; 0xdf
  "noess" ;; 0xe0
  "noeng" ;; 0xe1
  "noej" ;; 0xe2
  "noec" ;; 0xe3
  "noek" ;; 0xe4
  "noet" ;; 0xe5
  "noep" ;; 0xe6
  "noeh" ;; 0xe7
  "nyo" ;; 0xe8
  "nyog" ;; 0xe9
  "nyogg" ;; 0xea
  "nyogs" ;; 0xeb
  "nyon" ;; 0xec
  "nyonj" ;; 0xed
  "nyonh" ;; 0xee
  "nyod" ;; 0xef
  "nyol" ;; 0xf0
  "nyolg" ;; 0xf1
  "nyolm" ;; 0xf2
  "nyolb" ;; 0xf3
  "nyols" ;; 0xf4
  "nyolt" ;; 0xf5
  "nyolp" ;; 0xf6
  "nyolh" ;; 0xf7
  "nyom" ;; 0xf8
  "nyob" ;; 0xf9
  "nyobs" ;; 0xfa
  "nyos" ;; 0xfb
  "nyoss" ;; 0xfc
  "nyong" ;; 0xfd
  "nyoj" ;; 0xfe
  "nyoc" ;; 0xff
])
