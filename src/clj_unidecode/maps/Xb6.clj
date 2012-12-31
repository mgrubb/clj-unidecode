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

(ns clj-unidecode.maps.Xb6)
(def decode [
  "ddyels" ;; 0x00
  "ddyelt" ;; 0x01
  "ddyelp" ;; 0x02
  "ddyelh" ;; 0x03
  "ddyem" ;; 0x04
  "ddyeb" ;; 0x05
  "ddyebs" ;; 0x06
  "ddyes" ;; 0x07
  "ddyess" ;; 0x08
  "ddyeng" ;; 0x09
  "ddyej" ;; 0x0a
  "ddyec" ;; 0x0b
  "ddyek" ;; 0x0c
  "ddyet" ;; 0x0d
  "ddyep" ;; 0x0e
  "ddyeh" ;; 0x0f
  "ddo" ;; 0x10
  "ddog" ;; 0x11
  "ddogg" ;; 0x12
  "ddogs" ;; 0x13
  "ddon" ;; 0x14
  "ddonj" ;; 0x15
  "ddonh" ;; 0x16
  "ddod" ;; 0x17
  "ddol" ;; 0x18
  "ddolg" ;; 0x19
  "ddolm" ;; 0x1a
  "ddolb" ;; 0x1b
  "ddols" ;; 0x1c
  "ddolt" ;; 0x1d
  "ddolp" ;; 0x1e
  "ddolh" ;; 0x1f
  "ddom" ;; 0x20
  "ddob" ;; 0x21
  "ddobs" ;; 0x22
  "ddos" ;; 0x23
  "ddoss" ;; 0x24
  "ddong" ;; 0x25
  "ddoj" ;; 0x26
  "ddoc" ;; 0x27
  "ddok" ;; 0x28
  "ddot" ;; 0x29
  "ddop" ;; 0x2a
  "ddoh" ;; 0x2b
  "ddwa" ;; 0x2c
  "ddwag" ;; 0x2d
  "ddwagg" ;; 0x2e
  "ddwags" ;; 0x2f
  "ddwan" ;; 0x30
  "ddwanj" ;; 0x31
  "ddwanh" ;; 0x32
  "ddwad" ;; 0x33
  "ddwal" ;; 0x34
  "ddwalg" ;; 0x35
  "ddwalm" ;; 0x36
  "ddwalb" ;; 0x37
  "ddwals" ;; 0x38
  "ddwalt" ;; 0x39
  "ddwalp" ;; 0x3a
  "ddwalh" ;; 0x3b
  "ddwam" ;; 0x3c
  "ddwab" ;; 0x3d
  "ddwabs" ;; 0x3e
  "ddwas" ;; 0x3f
  "ddwass" ;; 0x40
  "ddwang" ;; 0x41
  "ddwaj" ;; 0x42
  "ddwac" ;; 0x43
  "ddwak" ;; 0x44
  "ddwat" ;; 0x45
  "ddwap" ;; 0x46
  "ddwah" ;; 0x47
  "ddwae" ;; 0x48
  "ddwaeg" ;; 0x49
  "ddwaegg" ;; 0x4a
  "ddwaegs" ;; 0x4b
  "ddwaen" ;; 0x4c
  "ddwaenj" ;; 0x4d
  "ddwaenh" ;; 0x4e
  "ddwaed" ;; 0x4f
  "ddwael" ;; 0x50
  "ddwaelg" ;; 0x51
  "ddwaelm" ;; 0x52
  "ddwaelb" ;; 0x53
  "ddwaels" ;; 0x54
  "ddwaelt" ;; 0x55
  "ddwaelp" ;; 0x56
  "ddwaelh" ;; 0x57
  "ddwaem" ;; 0x58
  "ddwaeb" ;; 0x59
  "ddwaebs" ;; 0x5a
  "ddwaes" ;; 0x5b
  "ddwaess" ;; 0x5c
  "ddwaeng" ;; 0x5d
  "ddwaej" ;; 0x5e
  "ddwaec" ;; 0x5f
  "ddwaek" ;; 0x60
  "ddwaet" ;; 0x61
  "ddwaep" ;; 0x62
  "ddwaeh" ;; 0x63
  "ddoe" ;; 0x64
  "ddoeg" ;; 0x65
  "ddoegg" ;; 0x66
  "ddoegs" ;; 0x67
  "ddoen" ;; 0x68
  "ddoenj" ;; 0x69
  "ddoenh" ;; 0x6a
  "ddoed" ;; 0x6b
  "ddoel" ;; 0x6c
  "ddoelg" ;; 0x6d
  "ddoelm" ;; 0x6e
  "ddoelb" ;; 0x6f
  "ddoels" ;; 0x70
  "ddoelt" ;; 0x71
  "ddoelp" ;; 0x72
  "ddoelh" ;; 0x73
  "ddoem" ;; 0x74
  "ddoeb" ;; 0x75
  "ddoebs" ;; 0x76
  "ddoes" ;; 0x77
  "ddoess" ;; 0x78
  "ddoeng" ;; 0x79
  "ddoej" ;; 0x7a
  "ddoec" ;; 0x7b
  "ddoek" ;; 0x7c
  "ddoet" ;; 0x7d
  "ddoep" ;; 0x7e
  "ddoeh" ;; 0x7f
  "ddyo" ;; 0x80
  "ddyog" ;; 0x81
  "ddyogg" ;; 0x82
  "ddyogs" ;; 0x83
  "ddyon" ;; 0x84
  "ddyonj" ;; 0x85
  "ddyonh" ;; 0x86
  "ddyod" ;; 0x87
  "ddyol" ;; 0x88
  "ddyolg" ;; 0x89
  "ddyolm" ;; 0x8a
  "ddyolb" ;; 0x8b
  "ddyols" ;; 0x8c
  "ddyolt" ;; 0x8d
  "ddyolp" ;; 0x8e
  "ddyolh" ;; 0x8f
  "ddyom" ;; 0x90
  "ddyob" ;; 0x91
  "ddyobs" ;; 0x92
  "ddyos" ;; 0x93
  "ddyoss" ;; 0x94
  "ddyong" ;; 0x95
  "ddyoj" ;; 0x96
  "ddyoc" ;; 0x97
  "ddyok" ;; 0x98
  "ddyot" ;; 0x99
  "ddyop" ;; 0x9a
  "ddyoh" ;; 0x9b
  "ddu" ;; 0x9c
  "ddug" ;; 0x9d
  "ddugg" ;; 0x9e
  "ddugs" ;; 0x9f
  "ddun" ;; 0xa0
  "ddunj" ;; 0xa1
  "ddunh" ;; 0xa2
  "ddud" ;; 0xa3
  "ddul" ;; 0xa4
  "ddulg" ;; 0xa5
  "ddulm" ;; 0xa6
  "ddulb" ;; 0xa7
  "dduls" ;; 0xa8
  "ddult" ;; 0xa9
  "ddulp" ;; 0xaa
  "ddulh" ;; 0xab
  "ddum" ;; 0xac
  "ddub" ;; 0xad
  "ddubs" ;; 0xae
  "ddus" ;; 0xaf
  "dduss" ;; 0xb0
  "ddung" ;; 0xb1
  "dduj" ;; 0xb2
  "dduc" ;; 0xb3
  "dduk" ;; 0xb4
  "ddut" ;; 0xb5
  "ddup" ;; 0xb6
  "dduh" ;; 0xb7
  "ddweo" ;; 0xb8
  "ddweog" ;; 0xb9
  "ddweogg" ;; 0xba
  "ddweogs" ;; 0xbb
  "ddweon" ;; 0xbc
  "ddweonj" ;; 0xbd
  "ddweonh" ;; 0xbe
  "ddweod" ;; 0xbf
  "ddweol" ;; 0xc0
  "ddweolg" ;; 0xc1
  "ddweolm" ;; 0xc2
  "ddweolb" ;; 0xc3
  "ddweols" ;; 0xc4
  "ddweolt" ;; 0xc5
  "ddweolp" ;; 0xc6
  "ddweolh" ;; 0xc7
  "ddweom" ;; 0xc8
  "ddweob" ;; 0xc9
  "ddweobs" ;; 0xca
  "ddweos" ;; 0xcb
  "ddweoss" ;; 0xcc
  "ddweong" ;; 0xcd
  "ddweoj" ;; 0xce
  "ddweoc" ;; 0xcf
  "ddweok" ;; 0xd0
  "ddweot" ;; 0xd1
  "ddweop" ;; 0xd2
  "ddweoh" ;; 0xd3
  "ddwe" ;; 0xd4
  "ddweg" ;; 0xd5
  "ddwegg" ;; 0xd6
  "ddwegs" ;; 0xd7
  "ddwen" ;; 0xd8
  "ddwenj" ;; 0xd9
  "ddwenh" ;; 0xda
  "ddwed" ;; 0xdb
  "ddwel" ;; 0xdc
  "ddwelg" ;; 0xdd
  "ddwelm" ;; 0xde
  "ddwelb" ;; 0xdf
  "ddwels" ;; 0xe0
  "ddwelt" ;; 0xe1
  "ddwelp" ;; 0xe2
  "ddwelh" ;; 0xe3
  "ddwem" ;; 0xe4
  "ddweb" ;; 0xe5
  "ddwebs" ;; 0xe6
  "ddwes" ;; 0xe7
  "ddwess" ;; 0xe8
  "ddweng" ;; 0xe9
  "ddwej" ;; 0xea
  "ddwec" ;; 0xeb
  "ddwek" ;; 0xec
  "ddwet" ;; 0xed
  "ddwep" ;; 0xee
  "ddweh" ;; 0xef
  "ddwi" ;; 0xf0
  "ddwig" ;; 0xf1
  "ddwigg" ;; 0xf2
  "ddwigs" ;; 0xf3
  "ddwin" ;; 0xf4
  "ddwinj" ;; 0xf5
  "ddwinh" ;; 0xf6
  "ddwid" ;; 0xf7
  "ddwil" ;; 0xf8
  "ddwilg" ;; 0xf9
  "ddwilm" ;; 0xfa
  "ddwilb" ;; 0xfb
  "ddwils" ;; 0xfc
  "ddwilt" ;; 0xfd
  "ddwilp" ;; 0xfe
  "ddwilh" ;; 0xff
])
