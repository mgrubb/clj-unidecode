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

(ns clj-unidecode.maps.X53)
(def decode [
  "Yun " ;; 0x00
  "Mwun " ;; 0x01
  "Nay " ;; 0x02
  "Gai " ;; 0x03
  "Gai " ;; 0x04
  "Bao " ;; 0x05
  "Cong " ;; 0x06
  "[?] " ;; 0x07
  "Xiong " ;; 0x08
  "Peng " ;; 0x09
  "Ju " ;; 0x0a
  "Tao " ;; 0x0b
  "Ge " ;; 0x0c
  "Pu " ;; 0x0d
  "An " ;; 0x0e
  "Pao " ;; 0x0f
  "Fu " ;; 0x10
  "Gong " ;; 0x11
  "Da " ;; 0x12
  "Jiu " ;; 0x13
  "Qiong " ;; 0x14
  "Bi " ;; 0x15
  "Hua " ;; 0x16
  "Bei " ;; 0x17
  "Nao " ;; 0x18
  "Chi " ;; 0x19
  "Fang " ;; 0x1a
  "Jiu " ;; 0x1b
  "Yi " ;; 0x1c
  "Za " ;; 0x1d
  "Jiang " ;; 0x1e
  "Kang " ;; 0x1f
  "Jiang " ;; 0x20
  "Kuang " ;; 0x21
  "Hu " ;; 0x22
  "Xia " ;; 0x23
  "Qu " ;; 0x24
  "Bian " ;; 0x25
  "Gui " ;; 0x26
  "Qie " ;; 0x27
  "Zang " ;; 0x28
  "Kuang " ;; 0x29
  "Fei " ;; 0x2a
  "Hu " ;; 0x2b
  "Tou " ;; 0x2c
  "Gui " ;; 0x2d
  "Gui " ;; 0x2e
  "Hui " ;; 0x2f
  "Dan " ;; 0x30
  "Gui " ;; 0x31
  "Lian " ;; 0x32
  "Lian " ;; 0x33
  "Suan " ;; 0x34
  "Du " ;; 0x35
  "Jiu " ;; 0x36
  "Qu " ;; 0x37
  "Xi " ;; 0x38
  "Pi " ;; 0x39
  "Qu " ;; 0x3a
  "Yi " ;; 0x3b
  "Qia " ;; 0x3c
  "Yan " ;; 0x3d
  "Bian " ;; 0x3e
  "Ni " ;; 0x3f
  "Qu " ;; 0x40
  "Shi " ;; 0x41
  "Xin " ;; 0x42
  "Qian " ;; 0x43
  "Nian " ;; 0x44
  "Sa " ;; 0x45
  "Zu " ;; 0x46
  "Sheng " ;; 0x47
  "Wu " ;; 0x48
  "Hui " ;; 0x49
  "Ban " ;; 0x4a
  "Shi " ;; 0x4b
  "Xi " ;; 0x4c
  "Wan " ;; 0x4d
  "Hua " ;; 0x4e
  "Xie " ;; 0x4f
  "Wan " ;; 0x50
  "Bei " ;; 0x51
  "Zu " ;; 0x52
  "Zhuo " ;; 0x53
  "Xie " ;; 0x54
  "Dan " ;; 0x55
  "Mai " ;; 0x56
  "Nan " ;; 0x57
  "Dan " ;; 0x58
  "Ji " ;; 0x59
  "Bo " ;; 0x5a
  "Shuai " ;; 0x5b
  "Bu " ;; 0x5c
  "Kuang " ;; 0x5d
  "Bian " ;; 0x5e
  "Bu " ;; 0x5f
  "Zhan " ;; 0x60
  "Qia " ;; 0x61
  "Lu " ;; 0x62
  "You " ;; 0x63
  "Lu " ;; 0x64
  "Xi " ;; 0x65
  "Gua " ;; 0x66
  "Wo " ;; 0x67
  "Xie " ;; 0x68
  "Jie " ;; 0x69
  "Jie " ;; 0x6a
  "Wei " ;; 0x6b
  "Ang " ;; 0x6c
  "Qiong " ;; 0x6d
  "Zhi " ;; 0x6e
  "Mao " ;; 0x6f
  "Yin " ;; 0x70
  "Wei " ;; 0x71
  "Shao " ;; 0x72
  "Ji " ;; 0x73
  "Que " ;; 0x74
  "Luan " ;; 0x75
  "Shi " ;; 0x76
  "Juan " ;; 0x77
  "Xie " ;; 0x78
  "Xu " ;; 0x79
  "Jin " ;; 0x7a
  "Que " ;; 0x7b
  "Wu " ;; 0x7c
  "Ji " ;; 0x7d
  "E " ;; 0x7e
  "Qing " ;; 0x7f
  "Xi " ;; 0x80
  "[?] " ;; 0x81
  "Han " ;; 0x82
  "Zhan " ;; 0x83
  "E " ;; 0x84
  "Ting " ;; 0x85
  "Li " ;; 0x86
  "Zhe " ;; 0x87
  "Han " ;; 0x88
  "Li " ;; 0x89
  "Ya " ;; 0x8a
  "Ya " ;; 0x8b
  "Yan " ;; 0x8c
  "She " ;; 0x8d
  "Zhi " ;; 0x8e
  "Zha " ;; 0x8f
  "Pang " ;; 0x90
  "[?] " ;; 0x91
  "He " ;; 0x92
  "Ya " ;; 0x93
  "Zhi " ;; 0x94
  "Ce " ;; 0x95
  "Pang " ;; 0x96
  "Ti " ;; 0x97
  "Li " ;; 0x98
  "She " ;; 0x99
  "Hou " ;; 0x9a
  "Ting " ;; 0x9b
  "Zui " ;; 0x9c
  "Cuo " ;; 0x9d
  "Fei " ;; 0x9e
  "Yuan " ;; 0x9f
  "Ce " ;; 0xa0
  "Yuan " ;; 0xa1
  "Xiang " ;; 0xa2
  "Yan " ;; 0xa3
  "Li " ;; 0xa4
  "Jue " ;; 0xa5
  "Sha " ;; 0xa6
  "Dian " ;; 0xa7
  "Chu " ;; 0xa8
  "Jiu " ;; 0xa9
  "Qin " ;; 0xaa
  "Ao " ;; 0xab
  "Gui " ;; 0xac
  "Yan " ;; 0xad
  "Si " ;; 0xae
  "Li " ;; 0xaf
  "Chang " ;; 0xb0
  "Lan " ;; 0xb1
  "Li " ;; 0xb2
  "Yan " ;; 0xb3
  "Yan " ;; 0xb4
  "Yuan " ;; 0xb5
  "Si " ;; 0xb6
  "Gong " ;; 0xb7
  "Lin " ;; 0xb8
  "Qiu " ;; 0xb9
  "Qu " ;; 0xba
  "Qu " ;; 0xbb
  "Uk " ;; 0xbc
  "Lei " ;; 0xbd
  "Du " ;; 0xbe
  "Xian " ;; 0xbf
  "Zhuan " ;; 0xc0
  "San " ;; 0xc1
  "Can " ;; 0xc2
  "Can " ;; 0xc3
  "Can " ;; 0xc4
  "Can " ;; 0xc5
  "Ai " ;; 0xc6
  "Dai " ;; 0xc7
  "You " ;; 0xc8
  "Cha " ;; 0xc9
  "Ji " ;; 0xca
  "You " ;; 0xcb
  "Shuang " ;; 0xcc
  "Fan " ;; 0xcd
  "Shou " ;; 0xce
  "Guai " ;; 0xcf
  "Ba " ;; 0xd0
  "Fa " ;; 0xd1
  "Ruo " ;; 0xd2
  "Shi " ;; 0xd3
  "Shu " ;; 0xd4
  "Zhuo " ;; 0xd5
  "Qu " ;; 0xd6
  "Shou " ;; 0xd7
  "Bian " ;; 0xd8
  "Xu " ;; 0xd9
  "Jia " ;; 0xda
  "Pan " ;; 0xdb
  "Sou " ;; 0xdc
  "Gao " ;; 0xdd
  "Wei " ;; 0xde
  "Sou " ;; 0xdf
  "Die " ;; 0xe0
  "Rui " ;; 0xe1
  "Cong " ;; 0xe2
  "Kou " ;; 0xe3
  "Gu " ;; 0xe4
  "Ju " ;; 0xe5
  "Ling " ;; 0xe6
  "Gua " ;; 0xe7
  "Tao " ;; 0xe8
  "Kou " ;; 0xe9
  "Zhi " ;; 0xea
  "Jiao " ;; 0xeb
  "Zhao " ;; 0xec
  "Ba " ;; 0xed
  "Ding " ;; 0xee
  "Ke " ;; 0xef
  "Tai " ;; 0xf0
  "Chi " ;; 0xf1
  "Shi " ;; 0xf2
  "You " ;; 0xf3
  "Qiu " ;; 0xf4
  "Po " ;; 0xf5
  "Xie " ;; 0xf6
  "Hao " ;; 0xf7
  "Si " ;; 0xf8
  "Tan " ;; 0xf9
  "Chi " ;; 0xfa
  "Le " ;; 0xfb
  "Diao " ;; 0xfc
  "Ji " ;; 0xfd
  "[?] " ;; 0xfe
  "Hong " ;; 0xff
])
