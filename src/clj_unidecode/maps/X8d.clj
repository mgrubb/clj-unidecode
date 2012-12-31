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

(ns clj-unidecode.maps.X8d)
(def decode [
  "Wei " ;; 0x00
  "Bai " ;; 0x01
  "Chen " ;; 0x02
  "Zhuan " ;; 0x03
  "Zhi " ;; 0x04
  "Zhui " ;; 0x05
  "Biao " ;; 0x06
  "Yun " ;; 0x07
  "Zeng " ;; 0x08
  "Tan " ;; 0x09
  "Zan " ;; 0x0a
  "Yan " ;; 0x0b
  "[?] " ;; 0x0c
  "Shan " ;; 0x0d
  "Wan " ;; 0x0e
  "Ying " ;; 0x0f
  "Jin " ;; 0x10
  "Gan " ;; 0x11
  "Xian " ;; 0x12
  "Zang " ;; 0x13
  "Bi " ;; 0x14
  "Du " ;; 0x15
  "Shu " ;; 0x16
  "Yan " ;; 0x17
  "[?] " ;; 0x18
  "Xuan " ;; 0x19
  "Long " ;; 0x1a
  "Gan " ;; 0x1b
  "Zang " ;; 0x1c
  "Bei " ;; 0x1d
  "Zhen " ;; 0x1e
  "Fu " ;; 0x1f
  "Yuan " ;; 0x20
  "Gong " ;; 0x21
  "Cai " ;; 0x22
  "Ze " ;; 0x23
  "Xian " ;; 0x24
  "Bai " ;; 0x25
  "Zhang " ;; 0x26
  "Huo " ;; 0x27
  "Zhi " ;; 0x28
  "Fan " ;; 0x29
  "Tan " ;; 0x2a
  "Pin " ;; 0x2b
  "Bian " ;; 0x2c
  "Gou " ;; 0x2d
  "Zhu " ;; 0x2e
  "Guan " ;; 0x2f
  "Er " ;; 0x30
  "Jian " ;; 0x31
  "Bi " ;; 0x32
  "Shi " ;; 0x33
  "Tie " ;; 0x34
  "Gui " ;; 0x35
  "Kuang " ;; 0x36
  "Dai " ;; 0x37
  "Mao " ;; 0x38
  "Fei " ;; 0x39
  "He " ;; 0x3a
  "Yi " ;; 0x3b
  "Zei " ;; 0x3c
  "Zhi " ;; 0x3d
  "Jia " ;; 0x3e
  "Hui " ;; 0x3f
  "Zi " ;; 0x40
  "Ren " ;; 0x41
  "Lu " ;; 0x42
  "Zang " ;; 0x43
  "Zi " ;; 0x44
  "Gai " ;; 0x45
  "Jin " ;; 0x46
  "Qiu " ;; 0x47
  "Zhen " ;; 0x48
  "Lai " ;; 0x49
  "She " ;; 0x4a
  "Fu " ;; 0x4b
  "Du " ;; 0x4c
  "Ji " ;; 0x4d
  "Shu " ;; 0x4e
  "Shang " ;; 0x4f
  "Si " ;; 0x50
  "Bi " ;; 0x51
  "Zhou " ;; 0x52
  "Geng " ;; 0x53
  "Pei " ;; 0x54
  "Tan " ;; 0x55
  "Lai " ;; 0x56
  "Feng " ;; 0x57
  "Zhui " ;; 0x58
  "Fu " ;; 0x59
  "Zhuan " ;; 0x5a
  "Sai " ;; 0x5b
  "Ze " ;; 0x5c
  "Yan " ;; 0x5d
  "Zan " ;; 0x5e
  "Yun " ;; 0x5f
  "Zeng " ;; 0x60
  "Shan " ;; 0x61
  "Ying " ;; 0x62
  "Gan " ;; 0x63
  "Chi " ;; 0x64
  "Xi " ;; 0x65
  "She " ;; 0x66
  "Nan " ;; 0x67
  "Xiong " ;; 0x68
  "Xi " ;; 0x69
  "Cheng " ;; 0x6a
  "He " ;; 0x6b
  "Cheng " ;; 0x6c
  "Zhe " ;; 0x6d
  "Xia " ;; 0x6e
  "Tang " ;; 0x6f
  "Zou " ;; 0x70
  "Zou " ;; 0x71
  "Li " ;; 0x72
  "Jiu " ;; 0x73
  "Fu " ;; 0x74
  "Zhao " ;; 0x75
  "Gan " ;; 0x76
  "Qi " ;; 0x77
  "Shan " ;; 0x78
  "Qiong " ;; 0x79
  "Qin " ;; 0x7a
  "Xian " ;; 0x7b
  "Ci " ;; 0x7c
  "Jue " ;; 0x7d
  "Qin " ;; 0x7e
  "Chi " ;; 0x7f
  "Ci " ;; 0x80
  "Chen " ;; 0x81
  "Chen " ;; 0x82
  "Die " ;; 0x83
  "Ju " ;; 0x84
  "Chao " ;; 0x85
  "Di " ;; 0x86
  "Se " ;; 0x87
  "Zhan " ;; 0x88
  "Zhu " ;; 0x89
  "Yue " ;; 0x8a
  "Qu " ;; 0x8b
  "Jie " ;; 0x8c
  "Chi " ;; 0x8d
  "Chu " ;; 0x8e
  "Gua " ;; 0x8f
  "Xue " ;; 0x90
  "Ci " ;; 0x91
  "Tiao " ;; 0x92
  "Duo " ;; 0x93
  "Lie " ;; 0x94
  "Gan " ;; 0x95
  "Suo " ;; 0x96
  "Cu " ;; 0x97
  "Xi " ;; 0x98
  "Zhao " ;; 0x99
  "Su " ;; 0x9a
  "Yin " ;; 0x9b
  "Ju " ;; 0x9c
  "Jian " ;; 0x9d
  "Que " ;; 0x9e
  "Tang " ;; 0x9f
  "Chuo " ;; 0xa0
  "Cui " ;; 0xa1
  "Lu " ;; 0xa2
  "Qu " ;; 0xa3
  "Dang " ;; 0xa4
  "Qiu " ;; 0xa5
  "Zi " ;; 0xa6
  "Ti " ;; 0xa7
  "Qu " ;; 0xa8
  "Chi " ;; 0xa9
  "Huang " ;; 0xaa
  "Qiao " ;; 0xab
  "Qiao " ;; 0xac
  "Yao " ;; 0xad
  "Zao " ;; 0xae
  "Ti " ;; 0xaf
  "[?] " ;; 0xb0
  "Zan " ;; 0xb1
  "Zan " ;; 0xb2
  "Zu " ;; 0xb3
  "Pa " ;; 0xb4
  "Bao " ;; 0xb5
  "Ku " ;; 0xb6
  "Ke " ;; 0xb7
  "Dun " ;; 0xb8
  "Jue " ;; 0xb9
  "Fu " ;; 0xba
  "Chen " ;; 0xbb
  "Jian " ;; 0xbc
  "Fang " ;; 0xbd
  "Zhi " ;; 0xbe
  "Sa " ;; 0xbf
  "Yue " ;; 0xc0
  "Pa " ;; 0xc1
  "Qi " ;; 0xc2
  "Yue " ;; 0xc3
  "Qiang " ;; 0xc4
  "Tuo " ;; 0xc5
  "Tai " ;; 0xc6
  "Yi " ;; 0xc7
  "Nian " ;; 0xc8
  "Ling " ;; 0xc9
  "Mei " ;; 0xca
  "Ba " ;; 0xcb
  "Die " ;; 0xcc
  "Ku " ;; 0xcd
  "Tuo " ;; 0xce
  "Jia " ;; 0xcf
  "Ci " ;; 0xd0
  "Pao " ;; 0xd1
  "Qia " ;; 0xd2
  "Zhu " ;; 0xd3
  "Ju " ;; 0xd4
  "Die " ;; 0xd5
  "Zhi " ;; 0xd6
  "Fu " ;; 0xd7
  "Pan " ;; 0xd8
  "Ju " ;; 0xd9
  "Shan " ;; 0xda
  "Bo " ;; 0xdb
  "Ni " ;; 0xdc
  "Ju " ;; 0xdd
  "Li " ;; 0xde
  "Gen " ;; 0xdf
  "Yi " ;; 0xe0
  "Ji " ;; 0xe1
  "Dai " ;; 0xe2
  "Xian " ;; 0xe3
  "Jiao " ;; 0xe4
  "Duo " ;; 0xe5
  "Zhu " ;; 0xe6
  "Zhuan " ;; 0xe7
  "Kua " ;; 0xe8
  "Zhuai " ;; 0xe9
  "Gui " ;; 0xea
  "Qiong " ;; 0xeb
  "Kui " ;; 0xec
  "Xiang " ;; 0xed
  "Chi " ;; 0xee
  "Lu " ;; 0xef
  "Beng " ;; 0xf0
  "Zhi " ;; 0xf1
  "Jia " ;; 0xf2
  "Tiao " ;; 0xf3
  "Cai " ;; 0xf4
  "Jian " ;; 0xf5
  "Ta " ;; 0xf6
  "Qiao " ;; 0xf7
  "Bi " ;; 0xf8
  "Xian " ;; 0xf9
  "Duo " ;; 0xfa
  "Ji " ;; 0xfb
  "Ju " ;; 0xfc
  "Ji " ;; 0xfd
  "Shu " ;; 0xfe
  "Tu " ;; 0xff
])
