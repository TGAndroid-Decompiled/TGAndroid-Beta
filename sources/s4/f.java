package s4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import d5.y;
import d5.z;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f extends i {

    public final z f47779g = new z();
    public final y h = new y();

    public int f47780i = -1;

    public final int f47781j;

    public final e[] f47782k;

    public e f47783l;

    public List f47784m;

    public List f47785n;

    public y f47786o;

    public int f47787p;

    public f(int i10, List list) {
        this.f47781j = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.f47782k = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f47782k[i11] = new e();
        }
        this.f47783l = this.f47782k[0];
    }

    @Override
    public final a5.b b() {
        List list = this.f47784m;
        this.f47785n = list;
        list.getClass();
        return new a5.b(1, list);
    }

    @Override
    public final void c(g gVar) {
        ByteBuffer byteBuffer = gVar.f14429b;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        z zVar = this.f47779g;
        zVar.A(iLimit, bArrArray);
        while (zVar.a() >= 3) {
            int iR = zVar.r();
            int i10 = iR & 3;
            boolean z10 = (iR & 4) == 4;
            byte bR = (byte) zVar.r();
            byte bR2 = (byte) zVar.r();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        f();
                        int i11 = (bR & 192) >> 6;
                        int i12 = this.f47780i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            h();
                            d5.a.K("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f47780i + " current=" + i11);
                        }
                        this.f47780i = i11;
                        int i13 = bR & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        y yVar = new y(i11, i13);
                        this.f47786o = yVar;
                        byte[] bArr = yVar.f4853b;
                        yVar.f4855e = 1;
                        bArr[0] = bR2;
                    } else {
                        d5.a.f(i10 == 2);
                        y yVar2 = this.f47786o;
                        if (yVar2 == null) {
                            d5.a.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = yVar2.f4853b;
                            int i14 = yVar2.f4855e;
                            int i15 = i14 + 1;
                            yVar2.f4855e = i15;
                            bArr2[i14] = bR;
                            yVar2.f4855e = i14 + 2;
                            bArr2[i15] = bR2;
                        }
                    }
                    y yVar3 = this.f47786o;
                    if (yVar3.f4855e == (yVar3.d * 2) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override
    public final boolean e() {
        return this.f47784m != this.f47785n;
    }

    public final void f() {
        y yVar = this.f47786o;
        if (yVar == null) {
            return;
        }
        int i10 = 2;
        if (yVar.f4855e != (yVar.d * 2) - 1) {
            d5.a.n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f47786o.d * 2) - 1) + ", but current index is " + this.f47786o.f4855e + " (sequence number " + this.f47786o.f4854c + ");");
        }
        y yVar2 = this.f47786o;
        byte[] bArr = yVar2.f4853b;
        int i11 = yVar2.f4855e;
        y yVar3 = this.h;
        yVar3.n(i11, bArr);
        boolean z10 = false;
        while (yVar3.b() > 0) {
            int i12 = 3;
            int i13 = yVar3.i(3);
            int i14 = yVar3.i(5);
            if (i13 == 7) {
                yVar3.s(i10);
                i13 = yVar3.i(6);
                if (i13 < 7) {
                    com.google.android.recaptcha.internal.a.s(i13, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (i14 == 0) {
                if (i13 != 0) {
                    d5.a.K("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                }
                if (z10) {
                    this.f47784m = g();
                }
                this.f47786o = null;
            }
            if (i13 != this.f47781j) {
                yVar3.t(i14);
            } else {
                int iG = (i14 * 8) + yVar3.g();
                while (yVar3.g() < iG) {
                    int i15 = yVar3.i(8);
                    if (i15 == 16) {
                        iG = iG;
                        int i16 = yVar3.i(8);
                        if (i16 <= 31) {
                            if (i16 > 7) {
                                if (i16 <= 15) {
                                    yVar3.s(8);
                                } else if (i16 <= 23) {
                                    yVar3.s(16);
                                } else if (i16 <= 31) {
                                    yVar3.s(24);
                                }
                            }
                        } else if (i16 <= 127) {
                            if (i16 == 32) {
                                this.f47783l.a(' ');
                            } else if (i16 == 33) {
                                this.f47783l.a((char) 160);
                            } else if (i16 == 37) {
                                this.f47783l.a((char) 8230);
                            } else if (i16 == 42) {
                                this.f47783l.a((char) 352);
                            } else if (i16 == 44) {
                                this.f47783l.a((char) 338);
                            } else if (i16 == 63) {
                                this.f47783l.a((char) 376);
                            } else if (i16 == 57) {
                                this.f47783l.a((char) 8482);
                            } else if (i16 == 58) {
                                this.f47783l.a((char) 353);
                            } else if (i16 == 60) {
                                this.f47783l.a((char) 339);
                            } else if (i16 != 61) {
                                switch (i16) {
                                    case 48:
                                        this.f47783l.a((char) 9608);
                                        break;
                                    case 49:
                                        this.f47783l.a((char) 8216);
                                        break;
                                    case 50:
                                        this.f47783l.a((char) 8217);
                                        break;
                                    case 51:
                                        this.f47783l.a((char) 8220);
                                        break;
                                    case 52:
                                        this.f47783l.a((char) 8221);
                                        break;
                                    case 53:
                                        this.f47783l.a((char) 8226);
                                        break;
                                    default:
                                        switch (i16) {
                                            case 118:
                                                this.f47783l.a((char) 8539);
                                                break;
                                            case 119:
                                                this.f47783l.a((char) 8540);
                                                break;
                                            case 120:
                                                this.f47783l.a((char) 8541);
                                                break;
                                            case 121:
                                                this.f47783l.a((char) 8542);
                                                break;
                                            case 122:
                                                this.f47783l.a((char) 9474);
                                                break;
                                            case 123:
                                                this.f47783l.a((char) 9488);
                                                break;
                                            case 124:
                                                this.f47783l.a((char) 9492);
                                                break;
                                            case 125:
                                                this.f47783l.a((char) 9472);
                                                break;
                                            case 126:
                                                this.f47783l.a((char) 9496);
                                                break;
                                            case 127:
                                                this.f47783l.a((char) 9484);
                                                break;
                                            default:
                                                com.google.android.recaptcha.internal.a.s(i16, "Invalid G2 character: ", "Cea708Decoder");
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                this.f47783l.a((char) 8480);
                            }
                            z10 = true;
                        } else if (i16 <= 159) {
                            if (i16 <= 135) {
                                yVar3.s(32);
                            } else if (i16 <= 143) {
                                yVar3.s(40);
                            } else if (i16 <= 159) {
                                yVar3.s(2);
                                yVar3.s(yVar3.i(6) * 8);
                            }
                        } else if (i16 <= 255) {
                            if (i16 == 160) {
                                this.f47783l.a((char) 13252);
                            } else {
                                com.google.android.recaptcha.internal.a.s(i16, "Invalid G3 character: ", "Cea708Decoder");
                                this.f47783l.a('_');
                            }
                            z10 = true;
                        } else {
                            com.google.android.recaptcha.internal.a.s(i16, "Invalid extended command: ", "Cea708Decoder");
                        }
                    } else if (i15 <= 31) {
                        if (i15 != 0) {
                            if (i15 == i12) {
                                this.f47784m = g();
                            } else if (i15 != 8) {
                                switch (i15) {
                                    case 12:
                                        h();
                                        break;
                                    case 13:
                                        this.f47783l.a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (i15 >= 17 && i15 <= 23) {
                                            d5.a.K("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                            yVar3.s(8);
                                        } else if (i15 < 24 || i15 > 31) {
                                            com.google.android.recaptcha.internal.a.s(i15, "Invalid C0 command: ", "Cea708Decoder");
                                        } else {
                                            d5.a.K("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                            yVar3.s(16);
                                        }
                                        break;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = this.f47783l.f47761b;
                                int length = spannableStringBuilder.length();
                                if (length > 0) {
                                    spannableStringBuilder.delete(length - 1, length);
                                }
                            }
                        }
                    } else if (i15 <= 127) {
                        if (i15 == 127) {
                            this.f47783l.a((char) 9835);
                        } else {
                            this.f47783l.a((char) (i15 & 255));
                        }
                        z10 = true;
                    } else {
                        if (i15 <= 159) {
                            e[] eVarArr = this.f47782k;
                            switch (i15) {
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    iG = iG;
                                    int i17 = i15 - 128;
                                    if (this.f47787p != i17) {
                                        this.f47787p = i17;
                                        this.f47783l = eVarArr[i17];
                                    }
                                    break;
                                case 136:
                                    iG = iG;
                                    for (int i18 = 1; i18 <= 8; i18++) {
                                        if (yVar3.h()) {
                                            e eVar = eVarArr[8 - i18];
                                            eVar.f47760a.clear();
                                            eVar.f47761b.clear();
                                            eVar.f47773p = -1;
                                            eVar.f47774q = -1;
                                            eVar.f47775r = -1;
                                            eVar.f47777t = -1;
                                            eVar.v = 0;
                                        }
                                    }
                                    break;
                                case 137:
                                    iG = iG;
                                    for (int i19 = 1; i19 <= 8; i19++) {
                                        if (yVar3.h()) {
                                            eVarArr[8 - i19].d = true;
                                        }
                                    }
                                    break;
                                case 138:
                                    iG = iG;
                                    for (int i20 = 1; i20 <= 8; i20++) {
                                        if (yVar3.h()) {
                                            eVarArr[8 - i20].d = false;
                                        }
                                    }
                                    break;
                                case 139:
                                    iG = iG;
                                    for (int i21 = 1; i21 <= 8; i21++) {
                                        if (yVar3.h()) {
                                            e eVar2 = eVarArr[8 - i21];
                                            eVar2.d = !eVar2.d;
                                        }
                                    }
                                    break;
                                case 140:
                                    iG = iG;
                                    for (int i22 = 1; i22 <= 8; i22++) {
                                        if (yVar3.h()) {
                                            eVarArr[8 - i22].d();
                                        }
                                    }
                                    break;
                                case 141:
                                    iG = iG;
                                    yVar3.s(8);
                                    break;
                                case 142:
                                    iG = iG;
                                    break;
                                case 143:
                                    iG = iG;
                                    h();
                                    break;
                                case 144:
                                    iG = iG;
                                    if (this.f47783l.f47762c) {
                                        yVar3.i(4);
                                        yVar3.i(2);
                                        yVar3.i(2);
                                        boolean zH = yVar3.h();
                                        boolean zH2 = yVar3.h();
                                        yVar3.i(3);
                                        yVar3.i(3);
                                        this.f47783l.e(zH, zH2);
                                    } else {
                                        yVar3.s(16);
                                    }
                                    break;
                                case 145:
                                    iG = iG;
                                    if (this.f47783l.f47762c) {
                                        int iC = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                        int iC2 = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                        yVar3.s(2);
                                        e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), 0);
                                        this.f47783l.f(iC, iC2);
                                    } else {
                                        yVar3.s(24);
                                    }
                                    break;
                                case 146:
                                    iG = iG;
                                    if (this.f47783l.f47762c) {
                                        yVar3.s(4);
                                        int i23 = yVar3.i(4);
                                        yVar3.s(2);
                                        yVar3.i(6);
                                        e eVar3 = this.f47783l;
                                        if (eVar3.v != i23) {
                                            eVar3.a('\n');
                                        }
                                        eVar3.v = i23;
                                    } else {
                                        yVar3.s(16);
                                    }
                                    break;
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                default:
                                    com.google.android.recaptcha.internal.a.s(i15, "Invalid C1 command: ", "Cea708Decoder");
                                    iG = iG;
                                    break;
                                case 151:
                                    iG = iG;
                                    if (this.f47783l.f47762c) {
                                        int iC3 = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                        yVar3.i(2);
                                        e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), 0);
                                        yVar3.h();
                                        yVar3.h();
                                        yVar3.i(2);
                                        yVar3.i(2);
                                        int i24 = yVar3.i(2);
                                        yVar3.s(8);
                                        e eVar4 = this.f47783l;
                                        eVar4.f47772o = iC3;
                                        eVar4.f47769l = i24;
                                    } else {
                                        yVar3.s(32);
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
                                    int i25 = i15 - 152;
                                    e eVar5 = eVarArr[i25];
                                    yVar3.s(i10);
                                    boolean zH3 = yVar3.h();
                                    boolean zH4 = yVar3.h();
                                    yVar3.h();
                                    int i26 = yVar3.i(i12);
                                    boolean zH5 = yVar3.h();
                                    int i27 = yVar3.i(7);
                                    int i28 = yVar3.i(8);
                                    int i29 = yVar3.i(4);
                                    int i30 = yVar3.i(4);
                                    yVar3.s(i10);
                                    yVar3.i(6);
                                    yVar3.s(i10);
                                    int i31 = yVar3.i(3);
                                    int i32 = yVar3.i(3);
                                    ArrayList arrayList = eVar5.f47760a;
                                    iG = iG;
                                    eVar5.f47762c = true;
                                    eVar5.d = zH3;
                                    eVar5.f47768k = zH4;
                                    eVar5.f47763e = i26;
                                    eVar5.f47764f = zH5;
                                    eVar5.f47765g = i27;
                                    eVar5.h = i28;
                                    eVar5.f47766i = i29;
                                    int i33 = i30 + 1;
                                    if (eVar5.f47767j != i33) {
                                        eVar5.f47767j = i33;
                                        while (true) {
                                            if ((zH4 && arrayList.size() >= eVar5.f47767j) || arrayList.size() >= 15) {
                                                arrayList.remove(0);
                                            }
                                        }
                                    }
                                    if (i31 != 0 && eVar5.f47770m != i31) {
                                        eVar5.f47770m = i31;
                                        int i34 = i31 - 1;
                                        int i35 = e.C[i34];
                                        boolean z11 = e.B[i34];
                                        int i36 = e.f47759z[i34];
                                        int i37 = e.A[i34];
                                        int i38 = e.f47758y[i34];
                                        eVar5.f47772o = i35;
                                        eVar5.f47769l = i38;
                                    }
                                    if (i32 != 0 && eVar5.f47771n != i32) {
                                        eVar5.f47771n = i32;
                                        int i39 = i32 - 1;
                                        int i40 = e.E[i39];
                                        int i41 = e.D[i39];
                                        eVar5.e(false, false);
                                        eVar5.f(e.f47756w, e.F[i39]);
                                    }
                                    if (this.f47787p != i25) {
                                        this.f47787p = i25;
                                        this.f47783l = eVarArr[i25];
                                    }
                                    break;
                            }
                        } else {
                            iG = iG;
                            if (i15 <= 255) {
                                this.f47783l.a((char) (i15 & 255));
                            } else {
                                com.google.android.recaptcha.internal.a.s(i15, "Invalid base command: ", "Cea708Decoder");
                            }
                        }
                        z10 = true;
                    }
                    iG = iG;
                    i10 = 2;
                    i12 = 3;
                }
            }
        }
        if (z10) {
            this.f47784m = g();
        }
        this.f47786o = null;
    }

    @Override
    public final void flush() {
        super.flush();
        this.f47784m = null;
        this.f47785n = null;
        this.f47787p = 0;
        this.f47783l = this.f47782k[0];
        h();
        this.f47786o = null;
    }

    public final List g() {
        d dVar;
        Layout.Alignment alignment;
        float f10;
        float f11;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            e[] eVarArr = this.f47782k;
            e eVar = eVarArr[i10];
            if (eVar.f47762c && (!eVar.f47760a.isEmpty() || eVar.f47761b.length() != 0)) {
                e eVar2 = eVarArr[i10];
                if (eVar2.d) {
                    ArrayList arrayList2 = eVar2.f47760a;
                    if (!eVar2.f47762c || (arrayList2.isEmpty() && eVar2.f47761b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i11));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i12 = eVar2.f47769l;
                        if (i12 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i12 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.f47769l);
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (eVar2.f47764f) {
                            f10 = eVar2.h / 99.0f;
                            f11 = eVar2.f47765g / 99.0f;
                        } else {
                            f10 = eVar2.h / 209.0f;
                            f11 = eVar2.f47765g / 74.0f;
                        }
                        float f12 = (f10 * 0.9f) + 0.05f;
                        float f13 = (f11 * 0.9f) + 0.05f;
                        int i13 = eVar2.f47766i;
                        int i14 = i13 / 3;
                        int i15 = i14 == 0 ? 0 : i14 == 1 ? 1 : 2;
                        int i16 = i13 % 3;
                        int i17 = i16 == 0 ? 0 : i16 == 1 ? 1 : 2;
                        int i18 = eVar2.f47772o;
                        dVar = new d(spannableStringBuilder, alignment2, f13, i15, f12, i17, i18 != e.f47757x, i18, eVar2.f47763e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.f47753c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            arrayList3.add(((d) arrayList.get(i19)).f47754a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    @Override
    public final String getName() {
        return "Cea708Decoder";
    }

    public final void h() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f47782k[i10].d();
        }
    }
}
