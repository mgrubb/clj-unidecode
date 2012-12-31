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

(ns clj-unidecode.maps.X98)
(def decode [
  "Hu " ;; 0x00
  "Ye " ;; 0x01
  "Ding " ;; 0x02
  "Qing " ;; 0x03
  "Pan " ;; 0x04
  "Xiang " ;; 0x05
  "Shun " ;; 0x06
  "Han " ;; 0x07
  "Xu " ;; 0x08
  "Yi " ;; 0x09
  "Xu " ;; 0x0a
  "Gu " ;; 0x0b
  "Song " ;; 0x0c
  "Kui " ;; 0x0d
  "Qi " ;; 0x0e
  "Hang " ;; 0x0f
  "Yu " ;; 0x10
  "Wan " ;; 0x11
  "Ban " ;; 0x12
  "Dun " ;; 0x13
  "Di " ;; 0x14
  "Dan " ;; 0x15
  "Pan " ;; 0x16
  "Po " ;; 0x17
  "Ling " ;; 0x18
  "Ce " ;; 0x19
  "Jing " ;; 0x1a
  "Lei " ;; 0x1b
  "He " ;; 0x1c
  "Qiao " ;; 0x1d
  "E " ;; 0x1e
  "E " ;; 0x1f
  "Wei " ;; 0x20
  "Jie " ;; 0x21
  "Gua " ;; 0x22
  "Shen " ;; 0x23
  "Yi " ;; 0x24
  "Shen " ;; 0x25
  "Hai " ;; 0x26
  "Dui " ;; 0x27
  "Pian " ;; 0x28
  "Ping " ;; 0x29
  "Lei " ;; 0x2a
  "Fu " ;; 0x2b
  "Jia " ;; 0x2c
  "Tou " ;; 0x2d
  "Hui " ;; 0x2e
  "Kui " ;; 0x2f
  "Jia " ;; 0x30
  "Le " ;; 0x31
  "Tian " ;; 0x32
  "Cheng " ;; 0x33
  "Ying " ;; 0x34
  "Jun " ;; 0x35
  "Hu " ;; 0x36
  "Han " ;; 0x37
  "Jing " ;; 0x38
  "Tui " ;; 0x39
  "Tui " ;; 0x3a
  "Pin " ;; 0x3b
  "Lai " ;; 0x3c
  "Tui " ;; 0x3d
  "Zi " ;; 0x3e
  "Zi " ;; 0x3f
  "Chui " ;; 0x40
  "Ding " ;; 0x41
  "Lai " ;; 0x42
  "Yan " ;; 0x43
  "Han " ;; 0x44
  "Jian " ;; 0x45
  "Ke " ;; 0x46
  "Cui " ;; 0x47
  "Jiong " ;; 0x48
  "Qin " ;; 0x49
  "Yi " ;; 0x4a
  "Sai " ;; 0x4b
  "Ti " ;; 0x4c
  "E " ;; 0x4d
  "E " ;; 0x4e
  "Yan " ;; 0x4f
  "Hun " ;; 0x50
  "Kan " ;; 0x51
  "Yong " ;; 0x52
  "Zhuan " ;; 0x53
  "Yan " ;; 0x54
  "Xian " ;; 0x55
  "Xin " ;; 0x56
  "Yi " ;; 0x57
  "Yuan " ;; 0x58
  "Sang " ;; 0x59
  "Dian " ;; 0x5a
  "Dian " ;; 0x5b
  "Jiang " ;; 0x5c
  "Ku " ;; 0x5d
  "Lei " ;; 0x5e
  "Liao " ;; 0x5f
  "Piao " ;; 0x60
  "Yi " ;; 0x61
  "Man " ;; 0x62
  "Qi " ;; 0x63
  "Rao " ;; 0x64
  "Hao " ;; 0x65
  "Qiao " ;; 0x66
  "Gu " ;; 0x67
  "Xun " ;; 0x68
  "Qian " ;; 0x69
  "Hui " ;; 0x6a
  "Zhan " ;; 0x6b
  "Ru " ;; 0x6c
  "Hong " ;; 0x6d
  "Bin " ;; 0x6e
  "Xian " ;; 0x6f
  "Pin " ;; 0x70
  "Lu " ;; 0x71
  "Lan " ;; 0x72
  "Nie " ;; 0x73
  "Quan " ;; 0x74
  "Ye " ;; 0x75
  "Ding " ;; 0x76
  "Qing " ;; 0x77
  "Han " ;; 0x78
  "Xiang " ;; 0x79
  "Shun " ;; 0x7a
  "Xu " ;; 0x7b
  "Xu " ;; 0x7c
  "Wan " ;; 0x7d
  "Gu " ;; 0x7e
  "Dun " ;; 0x7f
  "Qi " ;; 0x80
  "Ban " ;; 0x81
  "Song " ;; 0x82
  "Hang " ;; 0x83
  "Yu " ;; 0x84
  "Lu " ;; 0x85
  "Ling " ;; 0x86
  "Po " ;; 0x87
  "Jing " ;; 0x88
  "Jie " ;; 0x89
  "Jia " ;; 0x8a
  "Tian " ;; 0x8b
  "Han " ;; 0x8c
  "Ying " ;; 0x8d
  "Jiong " ;; 0x8e
  "Hai " ;; 0x8f
  "Yi " ;; 0x90
  "Pin " ;; 0x91
  "Hui " ;; 0x92
  "Tui " ;; 0x93
  "Han " ;; 0x94
  "Ying " ;; 0x95
  "Ying " ;; 0x96
  "Ke " ;; 0x97
  "Ti " ;; 0x98
  "Yong " ;; 0x99
  "E " ;; 0x9a
  "Zhuan " ;; 0x9b
  "Yan " ;; 0x9c
  "E " ;; 0x9d
  "Nie " ;; 0x9e
  "Man " ;; 0x9f
  "Dian " ;; 0xa0
  "Sang " ;; 0xa1
  "Hao " ;; 0xa2
  "Lei " ;; 0xa3
  "Zhan " ;; 0xa4
  "Ru " ;; 0xa5
  "Pin " ;; 0xa6
  "Quan " ;; 0xa7
  "Feng " ;; 0xa8
  "Biao " ;; 0xa9
  "Oroshi " ;; 0xaa
  "Fu " ;; 0xab
  "Xia " ;; 0xac
  "Zhan " ;; 0xad
  "Biao " ;; 0xae
  "Sa " ;; 0xaf
  "Ba " ;; 0xb0
  "Tai " ;; 0xb1
  "Lie " ;; 0xb2
  "Gua " ;; 0xb3
  "Xuan " ;; 0xb4
  "Shao " ;; 0xb5
  "Ju " ;; 0xb6
  "Bi " ;; 0xb7
  "Si " ;; 0xb8
  "Wei " ;; 0xb9
  "Yang " ;; 0xba
  "Yao " ;; 0xbb
  "Sou " ;; 0xbc
  "Kai " ;; 0xbd
  "Sao " ;; 0xbe
  "Fan " ;; 0xbf
  "Liu " ;; 0xc0
  "Xi " ;; 0xc1
  "Liao " ;; 0xc2
  "Piao " ;; 0xc3
  "Piao " ;; 0xc4
  "Liu " ;; 0xc5
  "Biao " ;; 0xc6
  "Biao " ;; 0xc7
  "Biao " ;; 0xc8
  "Liao " ;; 0xc9
  "[?] " ;; 0xca
  "Se " ;; 0xcb
  "Feng " ;; 0xcc
  "Biao " ;; 0xcd
  "Feng " ;; 0xce
  "Yang " ;; 0xcf
  "Zhan " ;; 0xd0
  "Biao " ;; 0xd1
  "Sa " ;; 0xd2
  "Ju " ;; 0xd3
  "Si " ;; 0xd4
  "Sou " ;; 0xd5
  "Yao " ;; 0xd6
  "Liu " ;; 0xd7
  "Piao " ;; 0xd8
  "Biao " ;; 0xd9
  "Biao " ;; 0xda
  "Fei " ;; 0xdb
  "Fan " ;; 0xdc
  "Fei " ;; 0xdd
  "Fei " ;; 0xde
  "Shi " ;; 0xdf
  "Shi " ;; 0xe0
  "Can " ;; 0xe1
  "Ji " ;; 0xe2
  "Ding " ;; 0xe3
  "Si " ;; 0xe4
  "Tuo " ;; 0xe5
  "Zhan " ;; 0xe6
  "Sun " ;; 0xe7
  "Xiang " ;; 0xe8
  "Tun " ;; 0xe9
  "Ren " ;; 0xea
  "Yu " ;; 0xeb
  "Juan " ;; 0xec
  "Chi " ;; 0xed
  "Yin " ;; 0xee
  "Fan " ;; 0xef
  "Fan " ;; 0xf0
  "Sun " ;; 0xf1
  "Yin " ;; 0xf2
  "Zhu " ;; 0xf3
  "Yi " ;; 0xf4
  "Zhai " ;; 0xf5
  "Bi " ;; 0xf6
  "Jie " ;; 0xf7
  "Tao " ;; 0xf8
  "Liu " ;; 0xf9
  "Ci " ;; 0xfa
  "Tie " ;; 0xfb
  "Si " ;; 0xfc
  "Bao " ;; 0xfd
  "Shi " ;; 0xfe
  "Duo " ;; 0xff
])
