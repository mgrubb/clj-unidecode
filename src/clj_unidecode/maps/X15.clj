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

(ns clj-unidecode.maps.X15)
(def decode [
  "swa" ;; 0x00
  "swa" ;; 0x01
  "swaa" ;; 0x02
  "swaa" ;; 0x03
  "swaa" ;; 0x04
  "s" ;; 0x05
  "s" ;; 0x06
  "sw" ;; 0x07
  "s" ;; 0x08
  "sk" ;; 0x09
  "skw" ;; 0x0a
  "sW" ;; 0x0b
  "spwa" ;; 0x0c
  "stwa" ;; 0x0d
  "skwa" ;; 0x0e
  "scwa" ;; 0x0f
  "she" ;; 0x10
  "shi" ;; 0x11
  "shii" ;; 0x12
  "sho" ;; 0x13
  "shoo" ;; 0x14
  "sha" ;; 0x15
  "shaa" ;; 0x16
  "shwe" ;; 0x17
  "shwe" ;; 0x18
  "shwi" ;; 0x19
  "shwi" ;; 0x1a
  "shwii" ;; 0x1b
  "shwii" ;; 0x1c
  "shwo" ;; 0x1d
  "shwo" ;; 0x1e
  "shwoo" ;; 0x1f
  "shwoo" ;; 0x20
  "shwa" ;; 0x21
  "shwa" ;; 0x22
  "shwaa" ;; 0x23
  "shwaa" ;; 0x24
  "sh" ;; 0x25
  "ye" ;; 0x26
  "yaai" ;; 0x27
  "yi" ;; 0x28
  "yii" ;; 0x29
  "yo" ;; 0x2a
  "yoo" ;; 0x2b
  "yoo" ;; 0x2c
  "ya" ;; 0x2d
  "yaa" ;; 0x2e
  "ywe" ;; 0x2f
  "ywe" ;; 0x30
  "ywi" ;; 0x31
  "ywi" ;; 0x32
  "ywii" ;; 0x33
  "ywii" ;; 0x34
  "ywo" ;; 0x35
  "ywo" ;; 0x36
  "ywoo" ;; 0x37
  "ywoo" ;; 0x38
  "ywa" ;; 0x39
  "ywa" ;; 0x3a
  "ywaa" ;; 0x3b
  "ywaa" ;; 0x3c
  "ywaa" ;; 0x3d
  "y" ;; 0x3e
  "y" ;; 0x3f
  "y" ;; 0x40
  "yi" ;; 0x41
  "re" ;; 0x42
  "re" ;; 0x43
  "le" ;; 0x44
  "raai" ;; 0x45
  "ri" ;; 0x46
  "rii" ;; 0x47
  "ro" ;; 0x48
  "roo" ;; 0x49
  "lo" ;; 0x4a
  "ra" ;; 0x4b
  "raa" ;; 0x4c
  "la" ;; 0x4d
  "rwaa" ;; 0x4e
  "rwaa" ;; 0x4f
  "r" ;; 0x50
  "r" ;; 0x51
  "r" ;; 0x52
  "fe" ;; 0x53
  "faai" ;; 0x54
  "fi" ;; 0x55
  "fii" ;; 0x56
  "fo" ;; 0x57
  "foo" ;; 0x58
  "fa" ;; 0x59
  "faa" ;; 0x5a
  "fwaa" ;; 0x5b
  "fwaa" ;; 0x5c
  "f" ;; 0x5d
  "the" ;; 0x5e
  "the" ;; 0x5f
  "thi" ;; 0x60
  "thi" ;; 0x61
  "thii" ;; 0x62
  "thii" ;; 0x63
  "tho" ;; 0x64
  "thoo" ;; 0x65
  "tha" ;; 0x66
  "thaa" ;; 0x67
  "thwaa" ;; 0x68
  "thwaa" ;; 0x69
  "th" ;; 0x6a
  "tthe" ;; 0x6b
  "tthi" ;; 0x6c
  "ttho" ;; 0x6d
  "ttha" ;; 0x6e
  "tth" ;; 0x6f
  "tye" ;; 0x70
  "tyi" ;; 0x71
  "tyo" ;; 0x72
  "tya" ;; 0x73
  "he" ;; 0x74
  "hi" ;; 0x75
  "hii" ;; 0x76
  "ho" ;; 0x77
  "hoo" ;; 0x78
  "ha" ;; 0x79
  "haa" ;; 0x7a
  "h" ;; 0x7b
  "h" ;; 0x7c
  "hk" ;; 0x7d
  "qaai" ;; 0x7e
  "qi" ;; 0x7f
  "qii" ;; 0x80
  "qo" ;; 0x81
  "qoo" ;; 0x82
  "qa" ;; 0x83
  "qaa" ;; 0x84
  "q" ;; 0x85
  "tlhe" ;; 0x86
  "tlhi" ;; 0x87
  "tlho" ;; 0x88
  "tlha" ;; 0x89
  "re" ;; 0x8a
  "ri" ;; 0x8b
  "ro" ;; 0x8c
  "ra" ;; 0x8d
  "ngaai" ;; 0x8e
  "ngi" ;; 0x8f
  "ngii" ;; 0x90
  "ngo" ;; 0x91
  "ngoo" ;; 0x92
  "nga" ;; 0x93
  "ngaa" ;; 0x94
  "ng" ;; 0x95
  "nng" ;; 0x96
  "she" ;; 0x97
  "shi" ;; 0x98
  "sho" ;; 0x99
  "sha" ;; 0x9a
  "the" ;; 0x9b
  "thi" ;; 0x9c
  "tho" ;; 0x9d
  "tha" ;; 0x9e
  "th" ;; 0x9f
  "lhi" ;; 0xa0
  "lhii" ;; 0xa1
  "lho" ;; 0xa2
  "lhoo" ;; 0xa3
  "lha" ;; 0xa4
  "lhaa" ;; 0xa5
  "lh" ;; 0xa6
  "the" ;; 0xa7
  "thi" ;; 0xa8
  "thii" ;; 0xa9
  "tho" ;; 0xaa
  "thoo" ;; 0xab
  "tha" ;; 0xac
  "thaa" ;; 0xad
  "th" ;; 0xae
  "b" ;; 0xaf
  "e" ;; 0xb0
  "i" ;; 0xb1
  "o" ;; 0xb2
  "a" ;; 0xb3
  "we" ;; 0xb4
  "wi" ;; 0xb5
  "wo" ;; 0xb6
  "wa" ;; 0xb7
  "ne" ;; 0xb8
  "ni" ;; 0xb9
  "no" ;; 0xba
  "na" ;; 0xbb
  "ke" ;; 0xbc
  "ki" ;; 0xbd
  "ko" ;; 0xbe
  "ka" ;; 0xbf
  "he" ;; 0xc0
  "hi" ;; 0xc1
  "ho" ;; 0xc2
  "ha" ;; 0xc3
  "ghu" ;; 0xc4
  "gho" ;; 0xc5
  "ghe" ;; 0xc6
  "ghee" ;; 0xc7
  "ghi" ;; 0xc8
  "gha" ;; 0xc9
  "ru" ;; 0xca
  "ro" ;; 0xcb
  "re" ;; 0xcc
  "ree" ;; 0xcd
  "ri" ;; 0xce
  "ra" ;; 0xcf
  "wu" ;; 0xd0
  "wo" ;; 0xd1
  "we" ;; 0xd2
  "wee" ;; 0xd3
  "wi" ;; 0xd4
  "wa" ;; 0xd5
  "hwu" ;; 0xd6
  "hwo" ;; 0xd7
  "hwe" ;; 0xd8
  "hwee" ;; 0xd9
  "hwi" ;; 0xda
  "hwa" ;; 0xdb
  "thu" ;; 0xdc
  "tho" ;; 0xdd
  "the" ;; 0xde
  "thee" ;; 0xdf
  "thi" ;; 0xe0
  "tha" ;; 0xe1
  "ttu" ;; 0xe2
  "tto" ;; 0xe3
  "tte" ;; 0xe4
  "ttee" ;; 0xe5
  "tti" ;; 0xe6
  "tta" ;; 0xe7
  "pu" ;; 0xe8
  "po" ;; 0xe9
  "pe" ;; 0xea
  "pee" ;; 0xeb
  "pi" ;; 0xec
  "pa" ;; 0xed
  "p" ;; 0xee
  "gu" ;; 0xef
  "go" ;; 0xf0
  "ge" ;; 0xf1
  "gee" ;; 0xf2
  "gi" ;; 0xf3
  "ga" ;; 0xf4
  "khu" ;; 0xf5
  "kho" ;; 0xf6
  "khe" ;; 0xf7
  "khee" ;; 0xf8
  "khi" ;; 0xf9
  "kha" ;; 0xfa
  "kku" ;; 0xfb
  "kko" ;; 0xfc
  "kke" ;; 0xfd
  "kkee" ;; 0xfe
  "kki" ;; 0xff
])
