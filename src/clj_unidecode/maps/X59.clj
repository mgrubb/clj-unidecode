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

(ns clj-unidecode.maps.X59)
(def decode [
  "Shou " ;; 0x00
  "Yi " ;; 0x01
  "Zhi " ;; 0x02
  "Gu " ;; 0x03
  "Chu " ;; 0x04
  "Jiang " ;; 0x05
  "Feng " ;; 0x06
  "Bei " ;; 0x07
  "Cay " ;; 0x08
  "Bian " ;; 0x09
  "Sui " ;; 0x0a
  "Qun " ;; 0x0b
  "Ling " ;; 0x0c
  "Fu " ;; 0x0d
  "Zuo " ;; 0x0e
  "Xia " ;; 0x0f
  "Xiong " ;; 0x10
  "[?] " ;; 0x11
  "Nao " ;; 0x12
  "Xia " ;; 0x13
  "Kui " ;; 0x14
  "Xi " ;; 0x15
  "Wai " ;; 0x16
  "Yuan " ;; 0x17
  "Mao " ;; 0x18
  "Su " ;; 0x19
  "Duo " ;; 0x1a
  "Duo " ;; 0x1b
  "Ye " ;; 0x1c
  "Qing " ;; 0x1d
  "Uys " ;; 0x1e
  "Gou " ;; 0x1f
  "Gou " ;; 0x20
  "Qi " ;; 0x21
  "Meng " ;; 0x22
  "Meng " ;; 0x23
  "Yin " ;; 0x24
  "Huo " ;; 0x25
  "Chen " ;; 0x26
  "Da " ;; 0x27
  "Ze " ;; 0x28
  "Tian " ;; 0x29
  "Tai " ;; 0x2a
  "Fu " ;; 0x2b
  "Guai " ;; 0x2c
  "Yao " ;; 0x2d
  "Yang " ;; 0x2e
  "Hang " ;; 0x2f
  "Gao " ;; 0x30
  "Shi " ;; 0x31
  "Ben " ;; 0x32
  "Tai " ;; 0x33
  "Tou " ;; 0x34
  "Yan " ;; 0x35
  "Bi " ;; 0x36
  "Yi " ;; 0x37
  "Kua " ;; 0x38
  "Jia " ;; 0x39
  "Duo " ;; 0x3a
  "Kwu " ;; 0x3b
  "Kuang " ;; 0x3c
  "Yun " ;; 0x3d
  "Jia " ;; 0x3e
  "Pa " ;; 0x3f
  "En " ;; 0x40
  "Lian " ;; 0x41
  "Huan " ;; 0x42
  "Di " ;; 0x43
  "Yan " ;; 0x44
  "Pao " ;; 0x45
  "Quan " ;; 0x46
  "Qi " ;; 0x47
  "Nai " ;; 0x48
  "Feng " ;; 0x49
  "Xie " ;; 0x4a
  "Fen " ;; 0x4b
  "Dian " ;; 0x4c
  "[?] " ;; 0x4d
  "Kui " ;; 0x4e
  "Zou " ;; 0x4f
  "Huan " ;; 0x50
  "Qi " ;; 0x51
  "Kai " ;; 0x52
  "Zha " ;; 0x53
  "Ben " ;; 0x54
  "Yi " ;; 0x55
  "Jiang " ;; 0x56
  "Tao " ;; 0x57
  "Zang " ;; 0x58
  "Ben " ;; 0x59
  "Xi " ;; 0x5a
  "Xiang " ;; 0x5b
  "Fei " ;; 0x5c
  "Diao " ;; 0x5d
  "Xun " ;; 0x5e
  "Keng " ;; 0x5f
  "Dian " ;; 0x60
  "Ao " ;; 0x61
  "She " ;; 0x62
  "Weng " ;; 0x63
  "Pan " ;; 0x64
  "Ao " ;; 0x65
  "Wu " ;; 0x66
  "Ao " ;; 0x67
  "Jiang " ;; 0x68
  "Lian " ;; 0x69
  "Duo " ;; 0x6a
  "Yun " ;; 0x6b
  "Jiang " ;; 0x6c
  "Shi " ;; 0x6d
  "Fen " ;; 0x6e
  "Huo " ;; 0x6f
  "Bi " ;; 0x70
  "Lian " ;; 0x71
  "Duo " ;; 0x72
  "Nu " ;; 0x73
  "Nu " ;; 0x74
  "Ding " ;; 0x75
  "Nai " ;; 0x76
  "Qian " ;; 0x77
  "Jian " ;; 0x78
  "Ta " ;; 0x79
  "Jiu " ;; 0x7a
  "Nan " ;; 0x7b
  "Cha " ;; 0x7c
  "Hao " ;; 0x7d
  "Xian " ;; 0x7e
  "Fan " ;; 0x7f
  "Ji " ;; 0x80
  "Shuo " ;; 0x81
  "Ru " ;; 0x82
  "Fei " ;; 0x83
  "Wang " ;; 0x84
  "Hong " ;; 0x85
  "Zhuang " ;; 0x86
  "Fu " ;; 0x87
  "Ma " ;; 0x88
  "Dan " ;; 0x89
  "Ren " ;; 0x8a
  "Fu " ;; 0x8b
  "Jing " ;; 0x8c
  "Yan " ;; 0x8d
  "Xie " ;; 0x8e
  "Wen " ;; 0x8f
  "Zhong " ;; 0x90
  "Pa " ;; 0x91
  "Du " ;; 0x92
  "Ji " ;; 0x93
  "Keng " ;; 0x94
  "Zhong " ;; 0x95
  "Yao " ;; 0x96
  "Jin " ;; 0x97
  "Yun " ;; 0x98
  "Miao " ;; 0x99
  "Pei " ;; 0x9a
  "Shi " ;; 0x9b
  "Yue " ;; 0x9c
  "Zhuang " ;; 0x9d
  "Niu " ;; 0x9e
  "Yan " ;; 0x9f
  "Na " ;; 0xa0
  "Xin " ;; 0xa1
  "Fen " ;; 0xa2
  "Bi " ;; 0xa3
  "Yu " ;; 0xa4
  "Tuo " ;; 0xa5
  "Feng " ;; 0xa6
  "Yuan " ;; 0xa7
  "Fang " ;; 0xa8
  "Wu " ;; 0xa9
  "Yu " ;; 0xaa
  "Gui " ;; 0xab
  "Du " ;; 0xac
  "Ba " ;; 0xad
  "Ni " ;; 0xae
  "Zhou " ;; 0xaf
  "Zhuo " ;; 0xb0
  "Zhao " ;; 0xb1
  "Da " ;; 0xb2
  "Nai " ;; 0xb3
  "Yuan " ;; 0xb4
  "Tou " ;; 0xb5
  "Xuan " ;; 0xb6
  "Zhi " ;; 0xb7
  "E " ;; 0xb8
  "Mei " ;; 0xb9
  "Mo " ;; 0xba
  "Qi " ;; 0xbb
  "Bi " ;; 0xbc
  "Shen " ;; 0xbd
  "Qie " ;; 0xbe
  "E " ;; 0xbf
  "He " ;; 0xc0
  "Xu " ;; 0xc1
  "Fa " ;; 0xc2
  "Zheng " ;; 0xc3
  "Min " ;; 0xc4
  "Ban " ;; 0xc5
  "Mu " ;; 0xc6
  "Fu " ;; 0xc7
  "Ling " ;; 0xc8
  "Zi " ;; 0xc9
  "Zi " ;; 0xca
  "Shi " ;; 0xcb
  "Ran " ;; 0xcc
  "Shan " ;; 0xcd
  "Yang " ;; 0xce
  "Man " ;; 0xcf
  "Jie " ;; 0xd0
  "Gu " ;; 0xd1
  "Si " ;; 0xd2
  "Xing " ;; 0xd3
  "Wei " ;; 0xd4
  "Zi " ;; 0xd5
  "Ju " ;; 0xd6
  "Shan " ;; 0xd7
  "Pin " ;; 0xd8
  "Ren " ;; 0xd9
  "Yao " ;; 0xda
  "Tong " ;; 0xdb
  "Jiang " ;; 0xdc
  "Shu " ;; 0xdd
  "Ji " ;; 0xde
  "Gai " ;; 0xdf
  "Shang " ;; 0xe0
  "Kuo " ;; 0xe1
  "Juan " ;; 0xe2
  "Jiao " ;; 0xe3
  "Gou " ;; 0xe4
  "Mu " ;; 0xe5
  "Jian " ;; 0xe6
  "Jian " ;; 0xe7
  "Yi " ;; 0xe8
  "Nian " ;; 0xe9
  "Zhi " ;; 0xea
  "Ji " ;; 0xeb
  "Ji " ;; 0xec
  "Xian " ;; 0xed
  "Heng " ;; 0xee
  "Guang " ;; 0xef
  "Jun " ;; 0xf0
  "Kua " ;; 0xf1
  "Yan " ;; 0xf2
  "Ming " ;; 0xf3
  "Lie " ;; 0xf4
  "Pei " ;; 0xf5
  "Yan " ;; 0xf6
  "You " ;; 0xf7
  "Yan " ;; 0xf8
  "Cha " ;; 0xf9
  "Shen " ;; 0xfa
  "Yin " ;; 0xfb
  "Chi " ;; 0xfc
  "Gui " ;; 0xfd
  "Quan " ;; 0xfe
  "Zi " ;; 0xff
])
