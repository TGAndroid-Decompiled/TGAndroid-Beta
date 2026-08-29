package u4;

import android.text.SpannableStringBuilder;
import f5.v;
import f5.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class f extends i {
    public final w f49079g = new w();
    public final v h = new v();
    public int f49080i = -1;
    public final int f49081j;
    public final e[] f49082k;
    public e f49083l;
    public List f49084m;
    public List f49085n;
    public v f49086o;
    public int f49087p;

    public f(int i10, List list) {
        this.f49081j = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.f49082k = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f49082k[i11] = new e();
        }
        this.f49083l = this.f49082k[0];
    }

    @Override
    public final j b() {
        List list = this.f49084m;
        this.f49085n = list;
        list.getClass();
        return new j(0, list);
    }

    @Override
    public final void c(g gVar) {
        boolean z10;
        ByteBuffer byteBuffer = gVar.f16828b;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = this.f49079g;
        wVar.A(limit, array);
        while (wVar.a() >= 3) {
            int r6 = wVar.r();
            int i10 = r6 & 3;
            boolean z11 = false;
            if ((r6 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte r9 = (byte) wVar.r();
            byte r10 = (byte) wVar.r();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        f();
                        int i11 = (r9 & 192) >> 6;
                        int i12 = this.f49080i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            h();
                            f5.a.K("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f49080i + " current=" + i11);
                        }
                        this.f49080i = i11;
                        int i13 = r9 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        v vVar = new v(i11, i13);
                        this.f49086o = vVar;
                        byte[] bArr = vVar.f6635b;
                        vVar.f6637e = 1;
                        bArr[0] = r10;
                    } else {
                        if (i10 == 2) {
                            z11 = true;
                        }
                        f5.a.f(z11);
                        v vVar2 = this.f49086o;
                        if (vVar2 == null) {
                            f5.a.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = vVar2.f6635b;
                            int i14 = vVar2.f6637e;
                            int i15 = i14 + 1;
                            vVar2.f6637e = i15;
                            bArr2[i14] = r9;
                            vVar2.f6637e = i14 + 2;
                            bArr2[i15] = r10;
                        }
                    }
                    v vVar3 = this.f49086o;
                    if (vVar3.f6637e == (vVar3.d * 2) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override
    public final boolean e() {
        if (this.f49084m != this.f49085n) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        e eVar;
        v vVar = this.f49086o;
        if (vVar == null) {
            return;
        }
        int i11 = 2;
        if (vVar.f6637e != (vVar.d * 2) - 1) {
            f5.a.n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f49086o.d * 2) - 1) + ", but current index is " + this.f49086o.f6637e + " (sequence number " + this.f49086o.f6636c + ");");
        }
        v vVar2 = this.f49086o;
        byte[] bArr = vVar2.f6635b;
        int i12 = vVar2.f6637e;
        v vVar3 = this.h;
        vVar3.n(i12, bArr);
        boolean z10 = false;
        while (true) {
            if (vVar3.b() > 0) {
                int i13 = 3;
                int i14 = vVar3.i(3);
                int i15 = vVar3.i(5);
                if (i14 == 7) {
                    vVar3.s(i11);
                    i14 = vVar3.i(6);
                    if (i14 < 7) {
                        com.google.android.recaptcha.internal.a.s(i14, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i15 == 0) {
                    if (i14 != 0) {
                        f5.a.K("Cea708Decoder", "serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                    }
                } else if (i14 != this.f49081j) {
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
                                                    h();
                                                    break;
                                                case 13:
                                                    this.f49083l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i16 >= 17 && i16 <= 23) {
                                                        f5.a.K("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                        vVar3.s(8);
                                                        break;
                                                    } else if (i16 >= 24 && i16 <= 31) {
                                                        f5.a.K("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i16);
                                                        vVar3.s(16);
                                                        break;
                                                    } else {
                                                        com.google.android.recaptcha.internal.a.s(i16, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f49083l.f49061b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f49084m = g();
                                    }
                                }
                                i10 = g10;
                            } else if (i16 <= 127) {
                                if (i16 == 127) {
                                    this.f49083l.a((char) 9835);
                                } else {
                                    this.f49083l.a((char) (i16 & 255));
                                }
                                i10 = g10;
                                z10 = true;
                            } else {
                                if (i16 <= 159) {
                                    e[] eVarArr = this.f49082k;
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
                                            if (this.f49087p != i17) {
                                                this.f49087p = i17;
                                                this.f49083l = eVarArr[i17];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i10 = g10;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (vVar3.h()) {
                                                    e eVar2 = eVarArr[8 - i18];
                                                    eVar2.f49060a.clear();
                                                    eVar2.f49061b.clear();
                                                    eVar2.f49073p = -1;
                                                    eVar2.f49074q = -1;
                                                    eVar2.f49075r = -1;
                                                    eVar2.f49077t = -1;
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
                                            h();
                                            break;
                                        case 144:
                                            i10 = g10;
                                            if (!this.f49083l.f49062c) {
                                                vVar3.s(16);
                                                break;
                                            } else {
                                                vVar3.i(4);
                                                vVar3.i(2);
                                                vVar3.i(2);
                                                boolean h = vVar3.h();
                                                boolean h10 = vVar3.h();
                                                vVar3.i(3);
                                                vVar3.i(3);
                                                this.f49083l.e(h, h10);
                                            }
                                        case 145:
                                            i10 = g10;
                                            if (!this.f49083l.f49062c) {
                                                vVar3.s(24);
                                            } else {
                                                int c3 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                                int c6 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                                vVar3.s(2);
                                                e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                                this.f49083l.f(c3, c6);
                                            }
                                            break;
                                        case 146:
                                            i10 = g10;
                                            if (!this.f49083l.f49062c) {
                                                vVar3.s(16);
                                            } else {
                                                vVar3.s(4);
                                                int i23 = vVar3.i(4);
                                                vVar3.s(2);
                                                vVar3.i(6);
                                                e eVar3 = this.f49083l;
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
                                            com.google.android.recaptcha.internal.a.s(i16, "Invalid C1 command: ", "Cea708Decoder");
                                            i10 = g10;
                                            break;
                                        case 151:
                                            i10 = g10;
                                            if (!this.f49083l.f49062c) {
                                                vVar3.s(32);
                                            } else {
                                                int c10 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                                vVar3.i(2);
                                                e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                                vVar3.h();
                                                vVar3.h();
                                                vVar3.i(2);
                                                vVar3.i(2);
                                                int i24 = vVar3.i(2);
                                                vVar3.s(8);
                                                e eVar4 = this.f49083l;
                                                eVar4.f49072o = c10;
                                                eVar4.f49069l = i24;
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
                                            boolean h11 = vVar3.h();
                                            boolean h12 = vVar3.h();
                                            vVar3.h();
                                            int i26 = vVar3.i(i13);
                                            boolean h13 = vVar3.h();
                                            int i27 = vVar3.i(7);
                                            int i28 = vVar3.i(8);
                                            int i29 = vVar3.i(4);
                                            int i30 = vVar3.i(4);
                                            vVar3.s(i11);
                                            vVar3.i(6);
                                            vVar3.s(i11);
                                            int i31 = vVar3.i(3);
                                            int i32 = vVar3.i(3);
                                            ArrayList arrayList = eVar5.f49060a;
                                            i10 = g10;
                                            eVar5.f49062c = true;
                                            eVar5.d = h11;
                                            eVar5.f49068k = h12;
                                            eVar5.f49063e = i26;
                                            eVar5.f49064f = h13;
                                            eVar5.f49065g = i27;
                                            eVar5.h = i28;
                                            eVar5.f49066i = i29;
                                            int i33 = i30 + 1;
                                            if (eVar5.f49067j != i33) {
                                                eVar5.f49067j = i33;
                                                while (true) {
                                                    if ((h12 && arrayList.size() >= eVar5.f49067j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i31 != 0 && eVar5.f49070m != i31) {
                                                eVar5.f49070m = i31;
                                                int i34 = i31 - 1;
                                                int i35 = e.C[i34];
                                                boolean z11 = e.B[i34];
                                                int i36 = e.f49059z[i34];
                                                int i37 = e.A[i34];
                                                int i38 = e.f49058y[i34];
                                                eVar5.f49072o = i35;
                                                eVar5.f49069l = i38;
                                            }
                                            if (i32 != 0 && eVar5.f49071n != i32) {
                                                eVar5.f49071n = i32;
                                                int i39 = i32 - 1;
                                                int i40 = e.E[i39];
                                                int i41 = e.D[i39];
                                                eVar5.e(false, false);
                                                eVar5.f(e.f49056w, e.F[i39]);
                                            }
                                            if (this.f49087p != i25) {
                                                this.f49087p = i25;
                                                this.f49083l = eVarArr[i25];
                                            }
                                            break;
                                    }
                                } else {
                                    i10 = g10;
                                    if (i16 <= 255) {
                                        this.f49083l.a((char) (i16 & 255));
                                    } else {
                                        com.google.android.recaptcha.internal.a.s(i16, "Invalid base command: ", "Cea708Decoder");
                                    }
                                }
                                z10 = true;
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
                                                                                this.f49083l.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.f49083l.a((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.f49083l.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.f49083l.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.f49083l.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.f49083l.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (i42) {
                                                                                    case 118:
                                                                                        this.f49083l.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.f49083l.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.f49083l.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.f49083l.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.f49083l.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.f49083l.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.f49083l.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.f49083l.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.f49083l.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.f49083l.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        com.google.android.recaptcha.internal.a.s(i42, "Invalid G2 character: ", "Cea708Decoder");
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.f49083l.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.f49083l.a((char) 339);
                                                                }
                                                            } else {
                                                                this.f49083l.a((char) 353);
                                                            }
                                                        } else {
                                                            this.f49083l.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.f49083l.a((char) 376);
                                                    }
                                                } else {
                                                    this.f49083l.a((char) 338);
                                                }
                                            } else {
                                                this.f49083l.a((char) 352);
                                            }
                                        } else {
                                            this.f49083l.a((char) 8230);
                                        }
                                    } else {
                                        this.f49083l.a((char) 160);
                                    }
                                } else {
                                    this.f49083l.a(' ');
                                }
                                z10 = true;
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
                                    this.f49083l.a((char) 13252);
                                } else {
                                    com.google.android.recaptcha.internal.a.s(i42, "Invalid G3 character: ", "Cea708Decoder");
                                    this.f49083l.a('_');
                                }
                                z10 = true;
                            } else {
                                com.google.android.recaptcha.internal.a.s(i42, "Invalid extended command: ", "Cea708Decoder");
                            }
                        }
                        g10 = i10;
                        i11 = 2;
                        i13 = 3;
                    }
                }
            }
        }
        if (z10) {
            this.f49084m = g();
        }
        this.f49086o = null;
    }

    @Override
    public final void flush() {
        super.flush();
        this.f49084m = null;
        this.f49085n = null;
        this.f49087p = 0;
        this.f49083l = this.f49082k[0];
        h();
        this.f49086o = null;
    }

    public final java.util.List g() {
        throw new UnsupportedOperationException("Method not decompiled: u4.f.g():java.util.List");
    }

    @Override
    public final String getName() {
        return "Cea708Decoder";
    }

    public final void h() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f49082k[i10].d();
        }
    }
}
