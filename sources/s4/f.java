package s4;

import android.text.SpannableStringBuilder;
import d5.x;
import d5.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class f extends i {
    public final y f47415g = new y();
    public final x h = new x();
    public int f47416i = -1;
    public final int f47417j;
    public final e[] f47418k;
    public e f47419l;
    public List f47420m;
    public List f47421n;
    public x f47422o;
    public int f47423p;

    public f(int i9, List list) {
        this.f47417j = i9 == -1 ? 1 : i9;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.f47418k = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f47418k[i10] = new e();
        }
        this.f47419l = this.f47418k[0];
    }

    @Override
    public final j b() {
        List list = this.f47420m;
        this.f47421n = list;
        list.getClass();
        return new j(0, list);
    }

    @Override
    public final void c(g gVar) {
        boolean z10;
        ByteBuffer byteBuffer = gVar.f14608b;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.f47415g;
        yVar.A(limit, array);
        while (yVar.a() >= 3) {
            int r10 = yVar.r();
            int i9 = r10 & 3;
            boolean z11 = false;
            if ((r10 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte r11 = (byte) yVar.r();
            byte r12 = (byte) yVar.r();
            if (i9 == 2 || i9 == 3) {
                if (z10) {
                    if (i9 == 3) {
                        f();
                        int i10 = (r11 & 192) >> 6;
                        int i11 = this.f47416i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            h();
                            d5.a.K("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f47416i + " current=" + i10);
                        }
                        this.f47416i = i10;
                        int i12 = r11 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        x xVar = new x(i10, i12);
                        this.f47422o = xVar;
                        byte[] bArr = xVar.f4405b;
                        xVar.f4407e = 1;
                        bArr[0] = r12;
                    } else {
                        if (i9 == 2) {
                            z11 = true;
                        }
                        d5.a.f(z11);
                        x xVar2 = this.f47422o;
                        if (xVar2 == null) {
                            d5.a.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = xVar2.f4405b;
                            int i13 = xVar2.f4407e;
                            int i14 = i13 + 1;
                            xVar2.f4407e = i14;
                            bArr2[i13] = r11;
                            xVar2.f4407e = i13 + 2;
                            bArr2[i14] = r12;
                        }
                    }
                    x xVar3 = this.f47422o;
                    if (xVar3.f4407e == (xVar3.d * 2) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override
    public final boolean e() {
        if (this.f47420m != this.f47421n) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i9;
        e eVar;
        x xVar = this.f47422o;
        if (xVar == null) {
            return;
        }
        int i10 = 2;
        if (xVar.f4407e != (xVar.d * 2) - 1) {
            d5.a.n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f47422o.d * 2) - 1) + ", but current index is " + this.f47422o.f4407e + " (sequence number " + this.f47422o.f4406c + ");");
        }
        x xVar2 = this.f47422o;
        byte[] bArr = xVar2.f4405b;
        int i11 = xVar2.f4407e;
        x xVar3 = this.h;
        xVar3.n(i11, bArr);
        boolean z10 = false;
        while (true) {
            if (xVar3.b() > 0) {
                int i12 = 3;
                int i13 = xVar3.i(3);
                int i14 = xVar3.i(5);
                if (i13 == 7) {
                    xVar3.s(i10);
                    i13 = xVar3.i(6);
                    if (i13 < 7) {
                        e2.c.t(i13, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        d5.a.K("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f47417j) {
                    xVar3.t(i14);
                } else {
                    int g10 = (i14 * 8) + xVar3.g();
                    while (xVar3.g() < g10) {
                        int i15 = xVar3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 != i12) {
                                        if (i15 != 8) {
                                            switch (i15) {
                                                case 12:
                                                    h();
                                                    break;
                                                case 13:
                                                    this.f47419l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i15 >= 17 && i15 <= 23) {
                                                        d5.a.K("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                        xVar3.s(8);
                                                        break;
                                                    } else if (i15 >= 24 && i15 <= 31) {
                                                        d5.a.K("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                        xVar3.s(16);
                                                        break;
                                                    } else {
                                                        e2.c.t(i15, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f47419l.f47397b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f47420m = g();
                                    }
                                }
                                i9 = g10;
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    this.f47419l.a((char) 9835);
                                } else {
                                    this.f47419l.a((char) (i15 & 255));
                                }
                                i9 = g10;
                                z10 = true;
                            } else {
                                if (i15 <= 159) {
                                    e[] eVarArr = this.f47418k;
                                    switch (i15) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i9 = g10;
                                            int i16 = i15 - 128;
                                            if (this.f47423p != i16) {
                                                this.f47423p = i16;
                                                this.f47419l = eVarArr[i16];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i9 = g10;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (xVar3.h()) {
                                                    e eVar2 = eVarArr[8 - i17];
                                                    eVar2.f47396a.clear();
                                                    eVar2.f47397b.clear();
                                                    eVar2.f47409p = -1;
                                                    eVar2.f47410q = -1;
                                                    eVar2.f47411r = -1;
                                                    eVar2.f47413t = -1;
                                                    eVar2.v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i9 = g10;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (xVar3.h()) {
                                                    eVarArr[8 - i18].d = true;
                                                }
                                            }
                                            break;
                                        case 138:
                                            i9 = g10;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (xVar3.h()) {
                                                    eVarArr[8 - i19].d = false;
                                                }
                                            }
                                            break;
                                        case 139:
                                            i9 = g10;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (xVar3.h()) {
                                                    eVarArr[8 - i20].d = !eVar.d;
                                                }
                                            }
                                            break;
                                        case 140:
                                            i9 = g10;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (xVar3.h()) {
                                                    eVarArr[8 - i21].d();
                                                }
                                            }
                                            break;
                                        case 141:
                                            i9 = g10;
                                            xVar3.s(8);
                                            break;
                                        case 142:
                                            i9 = g10;
                                            break;
                                        case 143:
                                            i9 = g10;
                                            h();
                                            break;
                                        case 144:
                                            i9 = g10;
                                            if (!this.f47419l.f47398c) {
                                                xVar3.s(16);
                                                break;
                                            } else {
                                                xVar3.i(4);
                                                xVar3.i(2);
                                                xVar3.i(2);
                                                boolean h = xVar3.h();
                                                boolean h10 = xVar3.h();
                                                xVar3.i(3);
                                                xVar3.i(3);
                                                this.f47419l.e(h, h10);
                                            }
                                        case 145:
                                            i9 = g10;
                                            if (!this.f47419l.f47398c) {
                                                xVar3.s(24);
                                            } else {
                                                int c10 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                                int c11 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                                xVar3.s(2);
                                                e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), 0);
                                                this.f47419l.f(c10, c11);
                                            }
                                            break;
                                        case 146:
                                            i9 = g10;
                                            if (!this.f47419l.f47398c) {
                                                xVar3.s(16);
                                            } else {
                                                xVar3.s(4);
                                                int i22 = xVar3.i(4);
                                                xVar3.s(2);
                                                xVar3.i(6);
                                                e eVar3 = this.f47419l;
                                                if (eVar3.v != i22) {
                                                    eVar3.a('\n');
                                                }
                                                eVar3.v = i22;
                                            }
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            e2.c.t(i15, "Invalid C1 command: ", "Cea708Decoder");
                                            i9 = g10;
                                            break;
                                        case 151:
                                            i9 = g10;
                                            if (!this.f47419l.f47398c) {
                                                xVar3.s(32);
                                            } else {
                                                int c12 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                                xVar3.i(2);
                                                e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), 0);
                                                xVar3.h();
                                                xVar3.h();
                                                xVar3.i(2);
                                                xVar3.i(2);
                                                int i23 = xVar3.i(2);
                                                xVar3.s(8);
                                                e eVar4 = this.f47419l;
                                                eVar4.f47408o = c12;
                                                eVar4.f47405l = i23;
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
                                            int i24 = i15 - 152;
                                            e eVar5 = eVarArr[i24];
                                            xVar3.s(i10);
                                            boolean h11 = xVar3.h();
                                            boolean h12 = xVar3.h();
                                            xVar3.h();
                                            int i25 = xVar3.i(i12);
                                            boolean h13 = xVar3.h();
                                            int i26 = xVar3.i(7);
                                            int i27 = xVar3.i(8);
                                            int i28 = xVar3.i(4);
                                            int i29 = xVar3.i(4);
                                            xVar3.s(i10);
                                            xVar3.i(6);
                                            xVar3.s(i10);
                                            int i30 = xVar3.i(3);
                                            int i31 = xVar3.i(3);
                                            ArrayList arrayList = eVar5.f47396a;
                                            i9 = g10;
                                            eVar5.f47398c = true;
                                            eVar5.d = h11;
                                            eVar5.f47404k = h12;
                                            eVar5.f47399e = i25;
                                            eVar5.f47400f = h13;
                                            eVar5.f47401g = i26;
                                            eVar5.h = i27;
                                            eVar5.f47402i = i28;
                                            int i32 = i29 + 1;
                                            if (eVar5.f47403j != i32) {
                                                eVar5.f47403j = i32;
                                                while (true) {
                                                    if ((h12 && arrayList.size() >= eVar5.f47403j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i30 != 0 && eVar5.f47406m != i30) {
                                                eVar5.f47406m = i30;
                                                int i33 = i30 - 1;
                                                int i34 = e.C[i33];
                                                boolean z11 = e.B[i33];
                                                int i35 = e.f47395z[i33];
                                                int i36 = e.A[i33];
                                                int i37 = e.f47394y[i33];
                                                eVar5.f47408o = i34;
                                                eVar5.f47405l = i37;
                                            }
                                            if (i31 != 0 && eVar5.f47407n != i31) {
                                                eVar5.f47407n = i31;
                                                int i38 = i31 - 1;
                                                int i39 = e.E[i38];
                                                int i40 = e.D[i38];
                                                eVar5.e(false, false);
                                                eVar5.f(e.f47392w, e.F[i38]);
                                            }
                                            if (this.f47423p != i24) {
                                                this.f47423p = i24;
                                                this.f47419l = eVarArr[i24];
                                            }
                                            break;
                                    }
                                } else {
                                    i9 = g10;
                                    if (i15 <= 255) {
                                        this.f47419l.a((char) (i15 & 255));
                                    } else {
                                        e2.c.t(i15, "Invalid base command: ", "Cea708Decoder");
                                    }
                                }
                                z10 = true;
                            }
                        } else {
                            i9 = g10;
                            int i41 = xVar3.i(8);
                            if (i41 <= 31) {
                                if (i41 > 7) {
                                    if (i41 <= 15) {
                                        xVar3.s(8);
                                    } else if (i41 <= 23) {
                                        xVar3.s(16);
                                    } else if (i41 <= 31) {
                                        xVar3.s(24);
                                    }
                                }
                            } else if (i41 <= 127) {
                                if (i41 != 32) {
                                    if (i41 != 33) {
                                        if (i41 != 37) {
                                            if (i41 != 42) {
                                                if (i41 != 44) {
                                                    if (i41 != 63) {
                                                        if (i41 != 57) {
                                                            if (i41 != 58) {
                                                                if (i41 != 60) {
                                                                    if (i41 != 61) {
                                                                        switch (i41) {
                                                                            case 48:
                                                                                this.f47419l.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.f47419l.a((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.f47419l.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.f47419l.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.f47419l.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.f47419l.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (i41) {
                                                                                    case 118:
                                                                                        this.f47419l.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.f47419l.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.f47419l.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.f47419l.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.f47419l.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.f47419l.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.f47419l.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.f47419l.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.f47419l.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.f47419l.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        e2.c.t(i41, "Invalid G2 character: ", "Cea708Decoder");
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.f47419l.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.f47419l.a((char) 339);
                                                                }
                                                            } else {
                                                                this.f47419l.a((char) 353);
                                                            }
                                                        } else {
                                                            this.f47419l.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.f47419l.a((char) 376);
                                                    }
                                                } else {
                                                    this.f47419l.a((char) 338);
                                                }
                                            } else {
                                                this.f47419l.a((char) 352);
                                            }
                                        } else {
                                            this.f47419l.a((char) 8230);
                                        }
                                    } else {
                                        this.f47419l.a((char) 160);
                                    }
                                } else {
                                    this.f47419l.a(' ');
                                }
                                z10 = true;
                            } else if (i41 <= 159) {
                                if (i41 <= 135) {
                                    xVar3.s(32);
                                } else if (i41 <= 143) {
                                    xVar3.s(40);
                                } else if (i41 <= 159) {
                                    xVar3.s(2);
                                    xVar3.s(xVar3.i(6) * 8);
                                }
                            } else if (i41 <= 255) {
                                if (i41 == 160) {
                                    this.f47419l.a((char) 13252);
                                } else {
                                    e2.c.t(i41, "Invalid G3 character: ", "Cea708Decoder");
                                    this.f47419l.a('_');
                                }
                                z10 = true;
                            } else {
                                e2.c.t(i41, "Invalid extended command: ", "Cea708Decoder");
                            }
                        }
                        g10 = i9;
                        i10 = 2;
                        i12 = 3;
                    }
                }
            }
        }
        if (z10) {
            this.f47420m = g();
        }
        this.f47422o = null;
    }

    @Override
    public final void flush() {
        super.flush();
        this.f47420m = null;
        this.f47421n = null;
        this.f47423p = 0;
        this.f47419l = this.f47418k[0];
        h();
        this.f47422o = null;
    }

    public final java.util.List g() {
        throw new UnsupportedOperationException("Method not decompiled: s4.f.g():java.util.List");
    }

    @Override
    public final String getName() {
        return "Cea708Decoder";
    }

    public final void h() {
        for (int i9 = 0; i9 < 8; i9++) {
            this.f47418k[i9].d();
        }
    }
}
