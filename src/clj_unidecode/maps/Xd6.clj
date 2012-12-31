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

(ns clj-unidecode.maps.Xd6)
(def decode [
  "hyeo" ;; 0x00
  "hyeog" ;; 0x01
  "hyeogg" ;; 0x02
  "hyeogs" ;; 0x03
  "hyeon" ;; 0x04
  "hyeonj" ;; 0x05
  "hyeonh" ;; 0x06
  "hyeod" ;; 0x07
  "hyeol" ;; 0x08
  "hyeolg" ;; 0x09
  "hyeolm" ;; 0x0a
  "hyeolb" ;; 0x0b
  "hyeols" ;; 0x0c
  "hyeolt" ;; 0x0d
  "hyeolp" ;; 0x0e
  "hyeolh" ;; 0x0f
  "hyeom" ;; 0x10
  "hyeob" ;; 0x11
  "hyeobs" ;; 0x12
  "hyeos" ;; 0x13
  "hyeoss" ;; 0x14
  "hyeong" ;; 0x15
  "hyeoj" ;; 0x16
  "hyeoc" ;; 0x17
  "hyeok" ;; 0x18
  "hyeot" ;; 0x19
  "hyeop" ;; 0x1a
  "hyeoh" ;; 0x1b
  "hye" ;; 0x1c
  "hyeg" ;; 0x1d
  "hyegg" ;; 0x1e
  "hyegs" ;; 0x1f
  "hyen" ;; 0x20
  "hyenj" ;; 0x21
  "hyenh" ;; 0x22
  "hyed" ;; 0x23
  "hyel" ;; 0x24
  "hyelg" ;; 0x25
  "hyelm" ;; 0x26
  "hyelb" ;; 0x27
  "hyels" ;; 0x28
  "hyelt" ;; 0x29
  "hyelp" ;; 0x2a
  "hyelh" ;; 0x2b
  "hyem" ;; 0x2c
  "hyeb" ;; 0x2d
  "hyebs" ;; 0x2e
  "hyes" ;; 0x2f
  "hyess" ;; 0x30
  "hyeng" ;; 0x31
  "hyej" ;; 0x32
  "hyec" ;; 0x33
  "hyek" ;; 0x34
  "hyet" ;; 0x35
  "hyep" ;; 0x36
  "hyeh" ;; 0x37
  "ho" ;; 0x38
  "hog" ;; 0x39
  "hogg" ;; 0x3a
  "hogs" ;; 0x3b
  "hon" ;; 0x3c
  "honj" ;; 0x3d
  "honh" ;; 0x3e
  "hod" ;; 0x3f
  "hol" ;; 0x40
  "holg" ;; 0x41
  "holm" ;; 0x42
  "holb" ;; 0x43
  "hols" ;; 0x44
  "holt" ;; 0x45
  "holp" ;; 0x46
  "holh" ;; 0x47
  "hom" ;; 0x48
  "hob" ;; 0x49
  "hobs" ;; 0x4a
  "hos" ;; 0x4b
  "hoss" ;; 0x4c
  "hong" ;; 0x4d
  "hoj" ;; 0x4e
  "hoc" ;; 0x4f
  "hok" ;; 0x50
  "hot" ;; 0x51
  "hop" ;; 0x52
  "hoh" ;; 0x53
  "hwa" ;; 0x54
  "hwag" ;; 0x55
  "hwagg" ;; 0x56
  "hwags" ;; 0x57
  "hwan" ;; 0x58
  "hwanj" ;; 0x59
  "hwanh" ;; 0x5a
  "hwad" ;; 0x5b
  "hwal" ;; 0x5c
  "hwalg" ;; 0x5d
  "hwalm" ;; 0x5e
  "hwalb" ;; 0x5f
  "hwals" ;; 0x60
  "hwalt" ;; 0x61
  "hwalp" ;; 0x62
  "hwalh" ;; 0x63
  "hwam" ;; 0x64
  "hwab" ;; 0x65
  "hwabs" ;; 0x66
  "hwas" ;; 0x67
  "hwass" ;; 0x68
  "hwang" ;; 0x69
  "hwaj" ;; 0x6a
  "hwac" ;; 0x6b
  "hwak" ;; 0x6c
  "hwat" ;; 0x6d
  "hwap" ;; 0x6e
  "hwah" ;; 0x6f
  "hwae" ;; 0x70
  "hwaeg" ;; 0x71
  "hwaegg" ;; 0x72
  "hwaegs" ;; 0x73
  "hwaen" ;; 0x74
  "hwaenj" ;; 0x75
  "hwaenh" ;; 0x76
  "hwaed" ;; 0x77
  "hwael" ;; 0x78
  "hwaelg" ;; 0x79
  "hwaelm" ;; 0x7a
  "hwaelb" ;; 0x7b
  "hwaels" ;; 0x7c
  "hwaelt" ;; 0x7d
  "hwaelp" ;; 0x7e
  "hwaelh" ;; 0x7f
  "hwaem" ;; 0x80
  "hwaeb" ;; 0x81
  "hwaebs" ;; 0x82
  "hwaes" ;; 0x83
  "hwaess" ;; 0x84
  "hwaeng" ;; 0x85
  "hwaej" ;; 0x86
  "hwaec" ;; 0x87
  "hwaek" ;; 0x88
  "hwaet" ;; 0x89
  "hwaep" ;; 0x8a
  "hwaeh" ;; 0x8b
  "hoe" ;; 0x8c
  "hoeg" ;; 0x8d
  "hoegg" ;; 0x8e
  "hoegs" ;; 0x8f
  "hoen" ;; 0x90
  "hoenj" ;; 0x91
  "hoenh" ;; 0x92
  "hoed" ;; 0x93
  "hoel" ;; 0x94
  "hoelg" ;; 0x95
  "hoelm" ;; 0x96
  "hoelb" ;; 0x97
  "hoels" ;; 0x98
  "hoelt" ;; 0x99
  "hoelp" ;; 0x9a
  "hoelh" ;; 0x9b
  "hoem" ;; 0x9c
  "hoeb" ;; 0x9d
  "hoebs" ;; 0x9e
  "hoes" ;; 0x9f
  "hoess" ;; 0xa0
  "hoeng" ;; 0xa1
  "hoej" ;; 0xa2
  "hoec" ;; 0xa3
  "hoek" ;; 0xa4
  "hoet" ;; 0xa5
  "hoep" ;; 0xa6
  "hoeh" ;; 0xa7
  "hyo" ;; 0xa8
  "hyog" ;; 0xa9
  "hyogg" ;; 0xaa
  "hyogs" ;; 0xab
  "hyon" ;; 0xac
  "hyonj" ;; 0xad
  "hyonh" ;; 0xae
  "hyod" ;; 0xaf
  "hyol" ;; 0xb0
  "hyolg" ;; 0xb1
  "hyolm" ;; 0xb2
  "hyolb" ;; 0xb3
  "hyols" ;; 0xb4
  "hyolt" ;; 0xb5
  "hyolp" ;; 0xb6
  "hyolh" ;; 0xb7
  "hyom" ;; 0xb8
  "hyob" ;; 0xb9
  "hyobs" ;; 0xba
  "hyos" ;; 0xbb
  "hyoss" ;; 0xbc
  "hyong" ;; 0xbd
  "hyoj" ;; 0xbe
  "hyoc" ;; 0xbf
  "hyok" ;; 0xc0
  "hyot" ;; 0xc1
  "hyop" ;; 0xc2
  "hyoh" ;; 0xc3
  "hu" ;; 0xc4
  "hug" ;; 0xc5
  "hugg" ;; 0xc6
  "hugs" ;; 0xc7
  "hun" ;; 0xc8
  "hunj" ;; 0xc9
  "hunh" ;; 0xca
  "hud" ;; 0xcb
  "hul" ;; 0xcc
  "hulg" ;; 0xcd
  "hulm" ;; 0xce
  "hulb" ;; 0xcf
  "huls" ;; 0xd0
  "hult" ;; 0xd1
  "hulp" ;; 0xd2
  "hulh" ;; 0xd3
  "hum" ;; 0xd4
  "hub" ;; 0xd5
  "hubs" ;; 0xd6
  "hus" ;; 0xd7
  "huss" ;; 0xd8
  "hung" ;; 0xd9
  "huj" ;; 0xda
  "huc" ;; 0xdb
  "huk" ;; 0xdc
  "hut" ;; 0xdd
  "hup" ;; 0xde
  "huh" ;; 0xdf
  "hweo" ;; 0xe0
  "hweog" ;; 0xe1
  "hweogg" ;; 0xe2
  "hweogs" ;; 0xe3
  "hweon" ;; 0xe4
  "hweonj" ;; 0xe5
  "hweonh" ;; 0xe6
  "hweod" ;; 0xe7
  "hweol" ;; 0xe8
  "hweolg" ;; 0xe9
  "hweolm" ;; 0xea
  "hweolb" ;; 0xeb
  "hweols" ;; 0xec
  "hweolt" ;; 0xed
  "hweolp" ;; 0xee
  "hweolh" ;; 0xef
  "hweom" ;; 0xf0
  "hweob" ;; 0xf1
  "hweobs" ;; 0xf2
  "hweos" ;; 0xf3
  "hweoss" ;; 0xf4
  "hweong" ;; 0xf5
  "hweoj" ;; 0xf6
  "hweoc" ;; 0xf7
  "hweok" ;; 0xf8
  "hweot" ;; 0xf9
  "hweop" ;; 0xfa
  "hweoh" ;; 0xfb
  "hwe" ;; 0xfc
  "hweg" ;; 0xfd
  "hwegg" ;; 0xfe
  "hwegs" ;; 0xff
])
