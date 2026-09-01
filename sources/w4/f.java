package w4;

import android.text.SpannableStringBuilder;
import h5.v;
import h5.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import oh.h4;
public final class f extends i {
    public final w f49404g = new w();
    public final v h = new v();
    public int f49405i = -1;
    public final int f49406j;
    public final e[] f49407k;
    public e f49408l;
    public List f49409m;
    public List f49410n;
    public v f49411o;
    public int f49412p;

    public f(int i10, List list) {
        this.f49406j = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.f49407k = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f49407k[i11] = new e();
        }
        this.f49408l = this.f49407k[0];
    }

    @Override
    public final h4 e() {
        List list = this.f49409m;
        this.f49410n = list;
        list.getClass();
        return new h4(list, 24);
    }

    @Override
    public final void f(g gVar) {
        boolean z4;
        ByteBuffer byteBuffer = gVar.d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = this.f49404g;
        wVar.D(limit, array);
        while (wVar.a() >= 3) {
            int u10 = wVar.u();
            int i10 = u10 & 3;
            boolean z10 = false;
            if ((u10 & 4) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            byte u11 = (byte) wVar.u();
            byte u12 = (byte) wVar.u();
            if (i10 == 2 || i10 == 3) {
                if (z4) {
                    if (i10 == 3) {
                        i();
                        int i11 = (u11 & 192) >> 6;
                        int i12 = this.f49405i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            k();
                            h5.a.K("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f49405i + " current=" + i11);
                        }
                        this.f49405i = i11;
                        int i13 = u11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        v vVar = new v(i11, i13);
                        this.f49411o = vVar;
                        byte[] bArr = vVar.f7303b;
                        vVar.f7305e = 1;
                        bArr[0] = u12;
                    } else {
                        if (i10 == 2) {
                            z10 = true;
                        }
                        h5.a.f(z10);
                        v vVar2 = this.f49411o;
                        if (vVar2 == null) {
                            h5.a.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = vVar2.f7303b;
                            int i14 = vVar2.f7305e;
                            int i15 = i14 + 1;
                            vVar2.f7305e = i15;
                            bArr2[i14] = u11;
                            vVar2.f7305e = i14 + 2;
                            bArr2[i15] = u12;
                        }
                    }
                    v vVar3 = this.f49411o;
                    if (vVar3.f7305e == (vVar3.d * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override
    public final void flush() {
        super.flush();
        this.f49409m = null;
        this.f49410n = null;
        this.f49412p = 0;
        this.f49408l = this.f49407k[0];
        k();
        this.f49411o = null;
    }

    @Override
    public final boolean h() {
        if (this.f49409m != this.f49410n) {
            return true;
        }
        return false;
    }

    public final void i() {
        int i10;
        e eVar;
        v vVar = this.f49411o;
        if (vVar == null) {
            return;
        }
        int i11 = 2;
        if (vVar.f7305e != (vVar.d * 2) - 1) {
            h5.a.n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f49411o.d * 2) - 1) + ", but current index is " + this.f49411o.f7305e + " (sequence number " + this.f49411o.f7304c + ");");
        }
        v vVar2 = this.f49411o;
        byte[] bArr = vVar2.f7303b;
        int i12 = vVar2.f7305e;
        v vVar3 = this.h;
        vVar3.n(i12, bArr);
        boolean z4 = false;
        while (true) {
            if (vVar3.b() > 0) {
                int i13 = 3;
                int i14 = vVar3.i(3);
                int i15 = vVar3.i(5);
                if (i14 == 7) {
                    vVar3.s(i11);
                    i14 = vVar3.i(6);
                    if (i14 < 7) {
                        e2.c.q(i14, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i15 == 0) {
                    if (i14 != 0) {
                        h5.a.K("Cea708Decoder", "serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                    }
                } else if (i14 != this.f49406j) {
                    vVar3.t(i15);
                } else {
                    int g10 = (i15 * 8) + vVar3.g();
                    while (vVar3.g() < g10) {
                        int i16 = vVar3.i(8);
                        if (i16 != 16) {
                            if (i16 <= 31) {
                                if (i16 != 0) {
                                    if (i16 != i13) {
                                        if (i16 != 8) {
                                            switch (i16) {
                                                case 12:
                                                    k();
                                                    break;
                                                case 13:
                                                    this.f49408l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i16 >= 17 && i16 <= 23) {
                                                        h5.a.K("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                        vVar3.s(8);
                                                        break;
                                                    } else if (i16 >= 24 && i16 <= 31) {
                                                        h5.a.K("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i16);
                                                        vVar3.s(16);
                                                        break;
                                                    } else {
                                                        e2.c.q(i16, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f49408l.f49386b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f49409m = j();
                                    }
                                }
                                i10 = g10;
                            } else if (i16 <= 127) {
                                if (i16 == 127) {
                                    this.f49408l.a((char) 9835);
                                } else {
                                    this.f49408l.a((char) (i16 & 255));
                                }
                                i10 = g10;
                                z4 = true;
                            } else {
                                if (i16 <= 159) {
                                    e[] eVarArr = this.f49407k;
                                    switch (i16) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i10 = g10;
                                            int i17 = i16 - 128;
                                            if (this.f49412p != i17) {
                                                this.f49412p = i17;
                                                this.f49408l = eVarArr[i17];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i10 = g10;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (vVar3.h()) {
                                                    e eVar2 = eVarArr[8 - i18];
                                                    eVar2.f49385a.clear();
                                                    eVar2.f49386b.clear();
                                                    eVar2.f49398p = -1;
                                                    eVar2.f49399q = -1;
                                                    eVar2.f49400r = -1;
                                                    eVar2.f49402t = -1;
                                                    eVar2.v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i10 = g10;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (vVar3.h()) {
                                                    eVarArr[8 - i19].d = true;
                                                }
                                            }
                                            break;
                                        case 138:
                                            i10 = g10;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (vVar3.h()) {
                                                    eVarArr[8 - i20].d = false;
                                                }
                                            }
                                            break;
                                        case 139:
                                            i10 = g10;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (vVar3.h()) {
                                                    eVarArr[8 - i21].d = !eVar.d;
                                                }
                                            }
                                            break;
                                        case 140:
                                            i10 = g10;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (vVar3.h()) {
                                                    eVarArr[8 - i22].d();
                                                }
                                            }
                                            break;
                                        case 141:
                                            i10 = g10;
                                            vVar3.s(8);
                                            break;
                                        case 142:
                                            i10 = g10;
                                            break;
                                        case 143:
                                            i10 = g10;
                                            k();
                                            break;
                                        case 144:
                                            i10 = g10;
                                            if (!this.f49408l.f49387c) {
                                                vVar3.s(16);
                                                break;
                                            } else {
                                                vVar3.i(4);
                                                vVar3.i(2);
                                                vVar3.i(2);
                                                boolean h = vVar3.h();
                                                boolean h9 = vVar3.h();
                                                vVar3.i(3);
                                                vVar3.i(3);
                                                this.f49408l.e(h, h9);
                                            }
                                        case 145:
                                            i10 = g10;
                                            if (!this.f49408l.f49387c) {
                                                vVar3.s(24);
                                            } else {
                                                int c3 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                                int c10 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                                vVar3.s(2);
                                                e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                                this.f49408l.f(c3, c10);
                                            }
                                            break;
                                        case 146:
                                            i10 = g10;
                                            if (!this.f49408l.f49387c) {
                                                vVar3.s(16);
                                            } else {
                                                vVar3.s(4);
                                                int i23 = vVar3.i(4);
                                                vVar3.s(2);
                                                vVar3.i(6);
                                                e eVar3 = this.f49408l;
                                                if (eVar3.v != i23) {
                                                    eVar3.a('\n');
                                                }
                                                eVar3.v = i23;
                                            }
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            e2.c.q(i16, "Invalid C1 command: ", "Cea708Decoder");
                                            i10 = g10;
                                            break;
                                        case 151:
                                            i10 = g10;
                                            if (!this.f49408l.f49387c) {
                                                vVar3.s(32);
                                            } else {
                                                int c11 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                                vVar3.i(2);
                                                e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                                vVar3.h();
                                                vVar3.h();
                                                vVar3.i(2);
                                                vVar3.i(2);
                                                int i24 = vVar3.i(2);
                                                vVar3.s(8);
                                                e eVar4 = this.f49408l;
                                                eVar4.f49397o = c11;
                                                eVar4.f49394l = i24;
                                            }
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i25 = i16 - 152;
                                            e eVar5 = eVarArr[i25];
                                            vVar3.s(i11);
                                            boolean h10 = vVar3.h();
                                            boolean h11 = vVar3.h();
                                            vVar3.h();
                                            int i26 = vVar3.i(i13);
                                            boolean h12 = vVar3.h();
                                            int i27 = vVar3.i(7);
                                            int i28 = vVar3.i(8);
                                            int i29 = vVar3.i(4);
                                            int i30 = vVar3.i(4);
                                            vVar3.s(i11);
                                            vVar3.i(6);
                                            vVar3.s(i11);
                                            int i31 = vVar3.i(3);
                                            int i32 = vVar3.i(3);
                                            ArrayList arrayList = eVar5.f49385a;
                                            i10 = g10;
                                            eVar5.f49387c = true;
                                            eVar5.d = h10;
                                            eVar5.f49393k = h11;
                                            eVar5.f49388e = i26;
                                            eVar5.f49389f = h12;
                                            eVar5.f49390g = i27;
                                            eVar5.h = i28;
                                            eVar5.f49391i = i29;
                                            int i33 = i30 + 1;
                                            if (eVar5.f49392j != i33) {
                                                eVar5.f49392j = i33;
                                                while (true) {
                                                    if ((h11 && arrayList.size() >= eVar5.f49392j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i31 != 0 && eVar5.f49395m != i31) {
                                                eVar5.f49395m = i31;
                                                int i34 = i31 - 1;
                                                int i35 = e.C[i34];
                                                boolean z10 = e.B[i34];
                                                int i36 = e.f49384z[i34];
                                                int i37 = e.A[i34];
                                                int i38 = e.f49383y[i34];
                                                eVar5.f49397o = i35;
                                                eVar5.f49394l = i38;
                                            }
                                            if (i32 != 0 && eVar5.f49396n != i32) {
                                                eVar5.f49396n = i32;
                                                int i39 = i32 - 1;
                                                int i40 = e.E[i39];
                                                int i41 = e.D[i39];
                                                eVar5.e(false, false);
                                                eVar5.f(e.f49381w, e.F[i39]);
                                            }
                                            if (this.f49412p != i25) {
                                                this.f49412p = i25;
                                                this.f49408l = eVarArr[i25];
                                            }
                                            break;
                                    }
                                } else {
                                    i10 = g10;
                                    if (i16 <= 255) {
                                        this.f49408l.a((char) (i16 & 255));
                                    } else {
                                        e2.c.q(i16, "Invalid base command: ", "Cea708Decoder");
                                    }
                                }
                                z4 = true;
                            }
                        } else {
                            i10 = g10;
                            int i42 = vVar3.i(8);
                            if (i42 <= 31) {
                                if (i42 > 7) {
                                    if (i42 <= 15) {
                                        vVar3.s(8);
                                    } else if (i42 <= 23) {
                                        vVar3.s(16);
                                    } else if (i42 <= 31) {
                                        vVar3.s(24);
                                    }
                                }
                            } else if (i42 <= 127) {
                                if (i42 != 32) {
                                    if (i42 != 33) {
                                        if (i42 != 37) {
                                            if (i42 != 42) {
                                                if (i42 != 44) {
                                                    if (i42 != 63) {
                                                        if (i42 != 57) {
                                                            if (i42 != 58) {
                                                                if (i42 != 60) {
                                                                    if (i42 != 61) {
                                                                        switch (i42) {
                                                                            case 48:
                                                                                this.f49408l.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.f49408l.a((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.f49408l.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.f49408l.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.f49408l.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.f49408l.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (i42) {
                                                                                    case 118:
                                                                                        this.f49408l.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.f49408l.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.f49408l.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.f49408l.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.f49408l.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.f49408l.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.f49408l.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.f49408l.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.f49408l.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.f49408l.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        e2.c.q(i42, "Invalid G2 character: ", "Cea708Decoder");
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.f49408l.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.f49408l.a((char) 339);
                                                                }
                                                            } else {
                                                                this.f49408l.a((char) 353);
                                                            }
                                                        } else {
                                                            this.f49408l.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.f49408l.a((char) 376);
                                                    }
                                                } else {
                                                    this.f49408l.a((char) 338);
                                                }
                                            } else {
                                                this.f49408l.a((char) 352);
                                            }
                                        } else {
                                            this.f49408l.a((char) 8230);
                                        }
                                    } else {
                                        this.f49408l.a((char) 160);
                                    }
                                } else {
                                    this.f49408l.a(' ');
                                }
                                z4 = true;
                            } else if (i42 <= 159) {
                                if (i42 <= 135) {
                                    vVar3.s(32);
                                } else if (i42 <= 143) {
                                    vVar3.s(40);
                                } else if (i42 <= 159) {
                                    vVar3.s(2);
                                    vVar3.s(vVar3.i(6) * 8);
                                }
                            } else if (i42 <= 255) {
                                if (i42 == 160) {
                                    this.f49408l.a((char) 13252);
                                } else {
                                    e2.c.q(i42, "Invalid G3 character: ", "Cea708Decoder");
                                    this.f49408l.a('_');
                                }
                                z4 = true;
                            } else {
                                e2.c.q(i42, "Invalid extended command: ", "Cea708Decoder");
                            }
                        }
                        g10 = i10;
                        i11 = 2;
                        i13 = 3;
                    }
                }
            }
        }
        if (z4) {
            this.f49409m = j();
        }
        this.f49411o = null;
    }

    public final java.util.List j() {
        throw new UnsupportedOperationException("Method not decompiled: w4.f.j():java.util.List");
    }

    public final void k() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f49407k[i10].d();
        }
    }
}
