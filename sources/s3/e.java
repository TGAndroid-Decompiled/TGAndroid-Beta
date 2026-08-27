package s3;

import android.util.Pair;
import android.util.SparseArray;
import d5.g0;
import d5.q;
import d5.y;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.t;
import m3.w;
import m3.x;
import n2.b0;
import n2.v;

public final class e implements k {

    public static final byte[] f47692c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    public static final byte[] f47693d0;

    public static final byte[] f47694e0;

    public static final byte[] f47695f0;

    public static final UUID f47696g0;

    public static final Map f47697h0;
    public long A;
    public long B;
    public v C;
    public v D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    public final b f47698a;

    public boolean f47699a0;

    public final f f47700b;

    public m f47701b0;

    public final SparseArray f47702c;
    public final boolean d;

    public final z f47703e;

    public final z f47704f;

    public final z f47705g;
    public final z h;

    public final z f47706i;

    public final z f47707j;

    public final z f47708k;

    public final z f47709l;

    public final z f47710m;

    public final z f47711n;

    public ByteBuffer f47712o;

    public long f47713p;

    public long f47714q;

    public long f47715r;

    public long f47716s;

    public long f47717t;

    public d f47718u;
    public boolean v;

    public int f47719w;

    public long f47720x;

    public boolean f47721y;

    public long f47722z;

    static {
        int i10 = g0.f4795a;
        f47693d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(o8.d.f19363c);
        f47694e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f47695f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f47696g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        c.i(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        c.i(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f47697h0 = DesugarCollections.unmodifiableMap(map);
    }

    public e(int i10) {
        b bVar = new b();
        this.f47714q = -1L;
        this.f47715r = -9223372036854775807L;
        this.f47716s = -9223372036854775807L;
        this.f47717t = -9223372036854775807L;
        this.f47722z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f47698a = bVar;
        bVar.d = new b0(this, 21);
        this.d = (i10 & 1) == 0;
        this.f47700b = new f();
        this.f47702c = new SparseArray();
        this.f47705g = new z(4);
        this.h = new z(ByteBuffer.allocate(4).putInt(-1).array());
        this.f47706i = new z(4);
        this.f47703e = new z(d5.a.d);
        this.f47704f = new z(4);
        this.f47707j = new z();
        this.f47708k = new z();
        this.f47709l = new z(8);
        this.f47710m = new z();
        this.f47711n = new z();
        this.L = new int[1];
    }

    public static byte[] h(long j10, long j11, String str) {
        d5.a.f(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        int i13 = g0.f4795a;
        return str2.getBytes(o8.d.f19363c);
    }

    public final void a(int i10) {
        if (this.C == null || this.D == null) {
            throw t1.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    @Override
    public final int b(l lVar, n nVar) throws t1, EOFException, InterruptedIOException {
        l lVar2;
        boolean z10;
        int i10;
        boolean z11;
        String str;
        ?? r10;
        int i11;
        int iA;
        e eVar;
        byte b10;
        List listSingletonList;
        int iU;
        ArrayList arrayList;
        int i12;
        Exception exc;
        Pair pair;
        String str2;
        String str3;
        List listY;
        List list;
        String str4;
        int i13;
        s0 s0Var;
        boolean zH;
        int i14;
        int i15;
        int i16;
        float f10;
        e5.b bVar;
        String str5;
        int iIntValue;
        byte[] bArr;
        int i17;
        int i18;
        int i19;
        String str6;
        com.google.android.gms.internal.clearcut.e eVarA;
        t oVar;
        int i20;
        e eVar2 = this;
        eVar2.F = false;
        boolean z12 = true;
        boolean z13 = true;
        while (z13 && !eVar2.F) {
            b bVar2 = eVar2.f47698a;
            f fVar = bVar2.f47665c;
            ArrayDeque arrayDeque = bVar2.f47664b;
            d5.a.j(bVar2.d);
            int i21 = z12;
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || ((h) lVar).d < aVar.f47662b) {
                    ?? r11 = 0;
                    if (bVar2.f47666e == 0) {
                        lVar2 = lVar;
                        int i22 = 4;
                        long jB = fVar.b(lVar2, true, false, 4);
                        if (jB == -2) {
                            byte[] bArr2 = bVar2.f47663a;
                            ((h) lVar2).f17614f = 0;
                            while (true) {
                                r10 = (h) lVar2;
                                r10.g(bArr2, r11, i22, r11);
                                byte b11 = bArr2[r11];
                                int i23 = 0;
                                while (true) {
                                    if (i23 >= 8) {
                                        i11 = -1;
                                    } else if ((f.d[i23] & ((long) b11)) != 0) {
                                        i11 = i23 + 1;
                                    } else {
                                        i23++;
                                    }
                                }
                                if (i11 != -1 && i11 <= 4) {
                                    iA = (int) f.a(i11, false, bArr2);
                                    Object obj = bVar2.d.f18130b;
                                    if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                    }
                                }
                                r10.t(1);
                                r11 = 0;
                                i22 = 4;
                            }
                            r10.t(i11);
                            jB = iA;
                        }
                        z10 = true;
                        if (jB == -1) {
                            z13 = false;
                        } else {
                            bVar2.f47667f = (int) jB;
                            bVar2.f47666e = 1;
                        }
                    } else {
                        lVar2 = lVar;
                        z10 = true;
                    }
                    if (bVar2.f47666e == z10) {
                        bVar2.f47668g = fVar.b(lVar2, false, z10, 8);
                        bVar2.f47666e = 2;
                    }
                    b0 b0Var = bVar2.d;
                    int i24 = bVar2.f47667f;
                    Object obj2 = b0Var.f18130b;
                    switch (i24) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i10 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i10 = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i10 = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i10 = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i10 = 5;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            long j10 = ((h) lVar2).d;
                            arrayDeque.push(new a(i24, bVar2.f47668g + j10));
                            b0 b0Var2 = bVar2.d;
                            int i25 = bVar2.f47667f;
                            long j11 = bVar2.f47668g;
                            e eVar3 = (e) b0Var2.f18130b;
                            d5.a.j(eVar3.f47701b0);
                            if (i25 != 160) {
                                if (i25 == 174) {
                                    d dVar = new d();
                                    dVar.f47679m = -1;
                                    dVar.f47680n = -1;
                                    dVar.f47681o = -1;
                                    dVar.f47682p = -1;
                                    dVar.f47683q = 0;
                                    dVar.f47684r = -1;
                                    dVar.f47685s = 0.0f;
                                    dVar.f47686t = 0.0f;
                                    dVar.f47687u = 0.0f;
                                    dVar.v = null;
                                    dVar.f47688w = -1;
                                    dVar.f47689x = false;
                                    dVar.f47690y = -1;
                                    dVar.f47691z = -1;
                                    dVar.A = -1;
                                    dVar.B = 1000;
                                    dVar.C = 200;
                                    dVar.D = -1.0f;
                                    dVar.E = -1.0f;
                                    dVar.F = -1.0f;
                                    dVar.G = -1.0f;
                                    dVar.H = -1.0f;
                                    dVar.I = -1.0f;
                                    dVar.J = -1.0f;
                                    dVar.K = -1.0f;
                                    dVar.L = -1.0f;
                                    dVar.M = -1.0f;
                                    dVar.O = 1;
                                    dVar.P = -1;
                                    dVar.Q = 8000;
                                    dVar.R = 0L;
                                    dVar.S = 0L;
                                    dVar.V = true;
                                    dVar.W = "eng";
                                    eVar3.f47718u = dVar;
                                } else if (i25 == 187) {
                                    z11 = false;
                                    eVar3.E = false;
                                } else if (i25 == 19899) {
                                    eVar3.f47719w = -1;
                                    eVar3.f47720x = -1L;
                                } else if (i25 == 20533) {
                                    eVar3.d(i25);
                                    eVar3.f47718u.h = true;
                                } else if (i25 == 21968) {
                                    eVar3.d(i25);
                                    eVar3.f47718u.f47689x = true;
                                } else if (i25 == 408125543) {
                                    long j12 = eVar3.f47714q;
                                    if (j12 != -1 && j12 != j10) {
                                        throw t1.a("Multiple Segment elements not supported", null);
                                    }
                                    eVar3.f47714q = j10;
                                    eVar3.f47713p = j11;
                                } else if (i25 == 475249515) {
                                    eVar3.C = new v(3, (byte) 0);
                                    eVar3.D = new v(3, (byte) 0);
                                } else if (i25 == 524531317 && !eVar3.v) {
                                    if (!eVar3.d || eVar3.f47722z == -1) {
                                        eVar3.f47701b0.n(new o(eVar3.f47717t));
                                        eVar3.v = true;
                                    } else {
                                        eVar3.f47721y = true;
                                    }
                                }
                                z11 = false;
                            } else {
                                z11 = false;
                                eVar3.Q = false;
                                eVar3.R = 0L;
                            }
                            bVar2.f47666e = z11 ? 1 : 0;
                        } else if (i10 == 2) {
                            long j13 = bVar2.f47668g;
                            if (j13 > 8) {
                                throw t1.a("Invalid integer size: " + bVar2.f47668g, null);
                            }
                            b0Var.j(i24, bVar2.a(lVar2, (int) j13));
                            z11 = false;
                            bVar2.f47666e = 0;
                        } else if (i10 == 3) {
                            long j14 = bVar2.f47668g;
                            if (j14 > 2147483647L) {
                                throw t1.a("String element size: " + bVar2.f47668g, null);
                            }
                            int i26 = (int) j14;
                            if (i26 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i26];
                                ((h) lVar2).d(bArr3, 0, i26, false);
                                while (i26 > 0 && bArr3[i26 - 1] == 0) {
                                    i26--;
                                }
                                str = new String(bArr3, 0, i26);
                            }
                            e eVar4 = (e) b0Var.f18130b;
                            if (i24 == 134) {
                                eVar4.d(i24);
                                eVar4.f47718u.f47670b = str;
                            } else if (i24 != 17026) {
                                if (i24 == 21358) {
                                    eVar4.d(i24);
                                    eVar4.f47718u.f47669a = str;
                                } else if (i24 == 2274716) {
                                    eVar4.d(i24);
                                    eVar4.f47718u.W = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw t1.a("DocType " + str + " not supported", null);
                            }
                            z11 = false;
                            bVar2.f47666e = 0;
                        } else if (i10 == 4) {
                            b0Var.e(i24, (int) bVar2.f47668g, lVar2);
                            z11 = false;
                            bVar2.f47666e = 0;
                        } else {
                            if (i10 != 5) {
                                throw t1.a("Invalid element type " + i10, null);
                            }
                            long j15 = bVar2.f47668g;
                            if (j15 != 4 && j15 != 8) {
                                throw t1.a("Invalid float size: " + bVar2.f47668g, null);
                            }
                            int i27 = (int) j15;
                            long jA = bVar2.a(lVar2, i27);
                            double dIntBitsToFloat = i27 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                            e eVar5 = (e) b0Var.f18130b;
                            if (i24 == 181) {
                                eVar5.d(i24);
                                eVar5.f47718u.Q = (int) dIntBitsToFloat;
                            } else if (i24 != 17545) {
                                switch (i24) {
                                    case 21969:
                                        eVar5.d(i24);
                                        eVar5.f47718u.D = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        eVar5.d(i24);
                                        eVar5.f47718u.E = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        eVar5.d(i24);
                                        eVar5.f47718u.F = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        eVar5.d(i24);
                                        eVar5.f47718u.G = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        eVar5.d(i24);
                                        eVar5.f47718u.H = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        eVar5.d(i24);
                                        eVar5.f47718u.I = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        eVar5.d(i24);
                                        eVar5.f47718u.J = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        eVar5.d(i24);
                                        eVar5.f47718u.K = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        eVar5.d(i24);
                                        eVar5.f47718u.L = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        eVar5.d(i24);
                                        eVar5.f47718u.M = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i24) {
                                            case 30323:
                                                eVar5.d(i24);
                                                eVar5.f47718u.f47685s = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                eVar5.d(i24);
                                                eVar5.f47718u.f47686t = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                eVar5.d(i24);
                                                eVar5.f47718u.f47687u = (float) dIntBitsToFloat;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                eVar5.f47716s = (long) dIntBitsToFloat;
                            }
                            z11 = false;
                            bVar2.f47666e = 0;
                        }
                        z13 = true;
                    } else {
                        ((h) lVar2).t((int) bVar2.f47668g);
                        bVar2.f47666e = 0;
                        i21 = 1;
                    }
                } else {
                    b0 b0Var3 = bVar2.d;
                    int i28 = ((a) arrayDeque.pop()).f47661a;
                    e eVar6 = (e) b0Var3.f18130b;
                    SparseArray sparseArray = eVar6.f47702c;
                    d5.a.j(eVar6.f47701b0);
                    if (i28 == 160) {
                        if (eVar6.G == 2) {
                            d dVar2 = (d) sparseArray.get(eVar6.M);
                            dVar2.X.getClass();
                            if (eVar6.R > 0 && "A_OPUS".equals(dVar2.f47670b)) {
                                z zVar = eVar6.f47711n;
                                byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(eVar6.R).array();
                                zVar.getClass();
                                zVar.A(bArrArray.length, bArrArray);
                            }
                            int i29 = 0;
                            for (int i30 = 0; i30 < eVar6.K; i30++) {
                                i29 += eVar6.L[i30];
                            }
                            int i31 = 0;
                            while (i31 < eVar6.K) {
                                long j16 = eVar6.H + ((long) ((dVar2.f47672e * i31) / 1000));
                                int i32 = eVar6.O;
                                if (i31 == 0 && !eVar6.Q) {
                                    i32 |= 1;
                                }
                                int i33 = eVar6.L[i31];
                                int i34 = i29 - i33;
                                eVar6.e(dVar2, j16, i32, i33, i34);
                                i31++;
                                i29 = i34;
                            }
                            eVar6.G = 0;
                        }
                        lVar2 = lVar;
                        z13 = true;
                    } else if (i28 == 174) {
                        d dVar3 = eVar6.f47718u;
                        d5.a.j(dVar3);
                        String str7 = dVar3.f47670b;
                        if (str7 == null) {
                            throw t1.a("CodecId is missing in TrackEntry element", null);
                        }
                        switch (str7) {
                            case "V_MPEG4/ISO/AP":
                            case "V_MPEG4/ISO/SP":
                            case "A_MS/ACM":
                            case "A_TRUEHD":
                            case "A_VORBIS":
                            case "A_MPEG/L2":
                            case "A_MPEG/L3":
                            case "V_MS/VFW/FOURCC":
                            case "S_DVBSUB":
                            case "V_MPEG4/ISO/ASP":
                            case "V_MPEG4/ISO/AVC":
                            case "S_VOBSUB":
                            case "A_DTS/LOSSLESS":
                            case "A_AAC":
                            case "A_AC3":
                            case "A_DTS":
                            case "V_AV1":
                            case "V_VP8":
                            case "V_VP9":
                            case "S_HDMV/PGS":
                            case "V_THEORA":
                            case "A_DTS/EXPRESS":
                            case "A_PCM/FLOAT/IEEE":
                            case "A_PCM/INT/BIG":
                            case "A_PCM/INT/LIT":
                            case "S_TEXT/ASS":
                            case "V_MPEGH/ISO/HEVC":
                            case "S_TEXT/WEBVTT":
                            case "S_TEXT/UTF8":
                            case "V_MPEG2":
                            case "A_EAC3":
                            case "A_FLAC":
                            case "A_OPUS":
                                m mVar = eVar6.f47701b0;
                                int i35 = dVar3.f47671c;
                                switch (str7) {
                                    case "V_MPEG4/ISO/AP":
                                        b10 = 0;
                                        break;
                                    case "V_MPEG4/ISO/SP":
                                        b10 = 1;
                                        break;
                                    case "A_MS/ACM":
                                        b10 = 2;
                                        break;
                                    case "A_TRUEHD":
                                        b10 = 3;
                                        break;
                                    case "A_VORBIS":
                                        b10 = 4;
                                        break;
                                    case "A_MPEG/L2":
                                        b10 = 5;
                                        break;
                                    case "A_MPEG/L3":
                                        b10 = 6;
                                        break;
                                    case "V_MS/VFW/FOURCC":
                                        b10 = 7;
                                        break;
                                    case "S_DVBSUB":
                                        b10 = 8;
                                        break;
                                    case "V_MPEG4/ISO/ASP":
                                        b10 = 9;
                                        break;
                                    case "V_MPEG4/ISO/AVC":
                                        b10 = 10;
                                        break;
                                    case "S_VOBSUB":
                                        b10 = 11;
                                        break;
                                    case "A_DTS/LOSSLESS":
                                        b10 = 12;
                                        break;
                                    case "A_AAC":
                                        b10 = 13;
                                        break;
                                    case "A_AC3":
                                        b10 = 14;
                                        break;
                                    case "A_DTS":
                                        b10 = 15;
                                        break;
                                    case "V_AV1":
                                        b10 = 16;
                                        break;
                                    case "V_VP8":
                                        b10 = 17;
                                        break;
                                    case "V_VP9":
                                        b10 = 18;
                                        break;
                                    case "S_HDMV/PGS":
                                        b10 = 19;
                                        break;
                                    case "V_THEORA":
                                        b10 = 20;
                                        break;
                                    case "A_DTS/EXPRESS":
                                        b10 = 21;
                                        break;
                                    case "A_PCM/FLOAT/IEEE":
                                        b10 = 22;
                                        break;
                                    case "A_PCM/INT/BIG":
                                        b10 = 23;
                                        break;
                                    case "A_PCM/INT/LIT":
                                        b10 = 24;
                                        break;
                                    case "S_TEXT/ASS":
                                        b10 = 25;
                                        break;
                                    case "V_MPEGH/ISO/HEVC":
                                        b10 = 26;
                                        break;
                                    case "S_TEXT/WEBVTT":
                                        b10 = 27;
                                        break;
                                    case "S_TEXT/UTF8":
                                        b10 = 28;
                                        break;
                                    case "V_MPEG2":
                                        b10 = 29;
                                        break;
                                    case "A_EAC3":
                                        b10 = 30;
                                        break;
                                    case "A_FLAC":
                                        b10 = 31;
                                        break;
                                    case "A_OPUS":
                                        b10 = 32;
                                        break;
                                    default:
                                        b10 = -1;
                                        break;
                                }
                                String str8 = "video/x-unknown";
                                switch (b10) {
                                    case 0:
                                    case 1:
                                    case 9:
                                        byte[] bArr4 = dVar3.f47677k;
                                        listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                        str8 = "video/mp4v-es";
                                        listY = listSingletonList;
                                        iU = -1;
                                        i12 = -1;
                                        str3 = null;
                                        if (dVar3.N != null && (eVarA = com.google.android.gms.internal.clearcut.e.a(new z(dVar3.N))) != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z14 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i36 = (z14 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15 || (i17 = dVar3.f47682p) == i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = (dVar3.f47680n * i16) / (dVar3.f47679m * i17);
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f || dVar3.E == -1.0f || dVar3.F == -1.0f || dVar3.G == -1.0f || dVar3.H == -1.0f || dVar3.I == -1.0f || dVar3.J == -1.0f || dVar3.K == -1.0f || dVar3.L == -1.0f || dVar3.M == -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = new byte[25];
                                                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                    byteBufferOrder.put((byte) 0);
                                                    byteBufferOrder.putShort((short) ((dVar3.D * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((dVar3.E * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((dVar3.F * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((dVar3.G * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((dVar3.H * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((dVar3.I * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((dVar3.J * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) ((dVar3.K * 50000.0f) + 0.5f));
                                                    byteBufferOrder.putShort((short) (dVar3.L + 0.5f));
                                                    byteBufferOrder.putShort((short) (dVar3.M + 0.5f));
                                                    byteBufferOrder.putShort((short) dVar3.B);
                                                    byteBufferOrder.putShort((short) dVar3.C);
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null && map.containsKey(str5)) {
                                                iIntValue = ((Integer) map.get(dVar3.f47669a)).intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0 && Float.compare(dVar3.f47685s, 0.0f) == 0 && Float.compare(dVar3.f47686t, 0.0f) == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0 || Float.compare(dVar3.f47686t, 180.0f) == 0) {
                                                    iIntValue = 180;
                                                } else if (Float.compare(dVar3.f47686t, -90.0f) == 0) {
                                                    iIntValue = 270;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8) && !"text/x-ssa".equals(str8) && !"text/vtt".equals(str8) && !"application/vobsub".equals(str8) && !"application/pgs".equals(str8) && !"application/dvbsubs".equals(str8)) {
                                                throw t1.a("Unexpected MIME type.", null);
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null && !map.containsKey(str6)) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i36;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var = new t0(s0Var);
                                        w wVarC = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC;
                                        wVarC.c(t0Var);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 2:
                                        mVar = mVar;
                                        z zVar2 = new z(dVar3.a(dVar3.f47670b));
                                        try {
                                            int iK = zVar2.k();
                                            if (iK != 1) {
                                                if (iK == 65534) {
                                                    zVar2.C(24);
                                                    long jL = zVar2.l();
                                                    UUID uuid = f47696g0;
                                                    if (jL != uuid.getMostSignificantBits() || zVar2.l() != uuid.getLeastSignificantBits()) {
                                                    }
                                                    str8 = "audio/x-unknown";
                                                    iU = -1;
                                                    i12 = -1;
                                                    listY = null;
                                                    str3 = null;
                                                    if (dVar3.N != null) {
                                                        str3 = eVarA.f3807a;
                                                        str8 = "video/dolby-vision";
                                                    }
                                                    boolean z15 = dVar3.V;
                                                    if (dVar3.U) {
                                                        i13 = 2;
                                                    } else {
                                                        i13 = 0;
                                                    }
                                                    int i37 = (z15 ? 1 : 0) | i13;
                                                    s0Var = new s0();
                                                    zH = q.h(str8);
                                                    Map map2 = f47697h0;
                                                    if (zH) {
                                                        s0Var.B = dVar3.O;
                                                        s0Var.C = dVar3.Q;
                                                        s0Var.D = iU;
                                                        i14 = 1;
                                                    } else if (q.j(str8)) {
                                                        if (dVar3.f47683q == 0) {
                                                            i18 = dVar3.f47681o;
                                                            i15 = -1;
                                                            if (i18 == -1) {
                                                                i18 = dVar3.f47679m;
                                                            }
                                                            dVar3.f47681o = i18;
                                                            i19 = dVar3.f47682p;
                                                            if (i19 == -1) {
                                                                i19 = dVar3.f47680n;
                                                            }
                                                            dVar3.f47682p = i19;
                                                        } else {
                                                            i15 = -1;
                                                        }
                                                        i16 = dVar3.f47681o;
                                                        if (i16 != i15) {
                                                            f10 = -1.0f;
                                                        } else {
                                                            f10 = -1.0f;
                                                        }
                                                        if (dVar3.f47689x) {
                                                            if (dVar3.D != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                                        } else {
                                                            bVar = null;
                                                        }
                                                        str5 = dVar3.f47669a;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (dVar3.f47684r == 0) {
                                                            if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        s0Var.f8140t = dVar3.f47679m;
                                                        s0Var.f8141u = dVar3.f47680n;
                                                        s0Var.f8143x = f10;
                                                        s0Var.f8142w = iIntValue;
                                                        s0Var.f8144y = dVar3.v;
                                                        s0Var.f8145z = dVar3.f47688w;
                                                        s0Var.A = bVar;
                                                        i14 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str8)) {
                                                        }
                                                        i14 = 3;
                                                    }
                                                    str6 = dVar3.f47669a;
                                                    if (str6 != null) {
                                                        s0Var.f8124b = dVar3.f47669a;
                                                    }
                                                    s0Var.f8123a = Integer.toString(i35);
                                                    s0Var.f8135o = str8;
                                                    s0Var.f8136p = i12;
                                                    s0Var.f8125c = dVar3.W;
                                                    s0Var.d = i37;
                                                    s0Var.f8137q = listY;
                                                    s0Var.h = str3;
                                                    s0Var.f8138r = dVar3.f47678l;
                                                    t0 t0Var2 = new t0(s0Var);
                                                    w wVarC2 = mVar.C(dVar3.f47671c, i14);
                                                    dVar3.X = wVarC2;
                                                    wVarC2.c(t0Var2);
                                                    sparseArray.put(dVar3.f47671c, dVar3);
                                                    eVar6 = eVar6;
                                                }
                                                d5.a.K("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                str8 = "audio/x-unknown";
                                                iU = -1;
                                                i12 = -1;
                                                listY = null;
                                                str3 = null;
                                                if (dVar3.N != null) {
                                                    str3 = eVarA.f3807a;
                                                    str8 = "video/dolby-vision";
                                                }
                                                boolean z16 = dVar3.V;
                                                if (dVar3.U) {
                                                    i13 = 2;
                                                } else {
                                                    i13 = 0;
                                                }
                                                int i38 = (z16 ? 1 : 0) | i13;
                                                s0Var = new s0();
                                                zH = q.h(str8);
                                                Map map3 = f47697h0;
                                                if (zH) {
                                                    s0Var.B = dVar3.O;
                                                    s0Var.C = dVar3.Q;
                                                    s0Var.D = iU;
                                                    i14 = 1;
                                                } else if (q.j(str8)) {
                                                    if (dVar3.f47683q == 0) {
                                                        i18 = dVar3.f47681o;
                                                        i15 = -1;
                                                        if (i18 == -1) {
                                                            i18 = dVar3.f47679m;
                                                        }
                                                        dVar3.f47681o = i18;
                                                        i19 = dVar3.f47682p;
                                                        if (i19 == -1) {
                                                            i19 = dVar3.f47680n;
                                                        }
                                                        dVar3.f47682p = i19;
                                                    } else {
                                                        i15 = -1;
                                                    }
                                                    i16 = dVar3.f47681o;
                                                    if (i16 != i15) {
                                                        f10 = -1.0f;
                                                    } else {
                                                        f10 = -1.0f;
                                                    }
                                                    if (dVar3.f47689x) {
                                                        if (dVar3.D != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                                    } else {
                                                        bVar = null;
                                                    }
                                                    str5 = dVar3.f47669a;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dVar3.f47684r == 0) {
                                                        if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    s0Var.f8140t = dVar3.f47679m;
                                                    s0Var.f8141u = dVar3.f47680n;
                                                    s0Var.f8143x = f10;
                                                    s0Var.f8142w = iIntValue;
                                                    s0Var.f8144y = dVar3.v;
                                                    s0Var.f8145z = dVar3.f47688w;
                                                    s0Var.A = bVar;
                                                    i14 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str8)) {
                                                    }
                                                    i14 = 3;
                                                }
                                                str6 = dVar3.f47669a;
                                                if (str6 != null) {
                                                    s0Var.f8124b = dVar3.f47669a;
                                                }
                                                s0Var.f8123a = Integer.toString(i35);
                                                s0Var.f8135o = str8;
                                                s0Var.f8136p = i12;
                                                s0Var.f8125c = dVar3.W;
                                                s0Var.d = i38;
                                                s0Var.f8137q = listY;
                                                s0Var.h = str3;
                                                s0Var.f8138r = dVar3.f47678l;
                                                t0 t0Var3 = new t0(s0Var);
                                                w wVarC3 = mVar.C(dVar3.f47671c, i14);
                                                dVar3.X = wVarC3;
                                                wVarC3.c(t0Var3);
                                                sparseArray.put(dVar3.f47671c, dVar3);
                                                eVar6 = eVar6;
                                                break;
                                            }
                                            iU = g0.u(dVar3.P);
                                            if (iU == 0) {
                                                d5.a.K("MatroskaExtractor", "Unsupported PCM bit depth: " + dVar3.P + ". Setting mimeType to audio/x-unknown");
                                                str8 = "audio/x-unknown";
                                                iU = -1;
                                            } else {
                                                str8 = "audio/raw";
                                            }
                                            i12 = -1;
                                            listY = null;
                                            str3 = null;
                                            if (dVar3.N != null) {
                                                str3 = eVarA.f3807a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z17 = dVar3.V;
                                            if (dVar3.U) {
                                                i13 = 2;
                                            } else {
                                                i13 = 0;
                                            }
                                            int i39 = (z17 ? 1 : 0) | i13;
                                            s0Var = new s0();
                                            zH = q.h(str8);
                                            Map map4 = f47697h0;
                                            if (zH) {
                                                s0Var.B = dVar3.O;
                                                s0Var.C = dVar3.Q;
                                                s0Var.D = iU;
                                                i14 = 1;
                                            } else if (q.j(str8)) {
                                                if (dVar3.f47683q == 0) {
                                                    i18 = dVar3.f47681o;
                                                    i15 = -1;
                                                    if (i18 == -1) {
                                                        i18 = dVar3.f47679m;
                                                    }
                                                    dVar3.f47681o = i18;
                                                    i19 = dVar3.f47682p;
                                                    if (i19 == -1) {
                                                        i19 = dVar3.f47680n;
                                                    }
                                                    dVar3.f47682p = i19;
                                                } else {
                                                    i15 = -1;
                                                }
                                                i16 = dVar3.f47681o;
                                                if (i16 != i15) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar3.f47689x) {
                                                    if (dVar3.D != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                                } else {
                                                    bVar = null;
                                                }
                                                str5 = dVar3.f47669a;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar3.f47684r == 0) {
                                                    if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                s0Var.f8140t = dVar3.f47679m;
                                                s0Var.f8141u = dVar3.f47680n;
                                                s0Var.f8143x = f10;
                                                s0Var.f8142w = iIntValue;
                                                s0Var.f8144y = dVar3.v;
                                                s0Var.f8145z = dVar3.f47688w;
                                                s0Var.A = bVar;
                                                i14 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i14 = 3;
                                            }
                                            str6 = dVar3.f47669a;
                                            if (str6 != null) {
                                                s0Var.f8124b = dVar3.f47669a;
                                            }
                                            s0Var.f8123a = Integer.toString(i35);
                                            s0Var.f8135o = str8;
                                            s0Var.f8136p = i12;
                                            s0Var.f8125c = dVar3.W;
                                            s0Var.d = i39;
                                            s0Var.f8137q = listY;
                                            s0Var.h = str3;
                                            s0Var.f8138r = dVar3.f47678l;
                                            t0 t0Var4 = new t0(s0Var);
                                            w wVarC4 = mVar.C(dVar3.f47671c, i14);
                                            dVar3.X = wVarC4;
                                            wVarC4.c(t0Var4);
                                            sparseArray.put(dVar3.f47671c, dVar3);
                                            eVar6 = eVar6;
                                        } catch (ArrayIndexOutOfBoundsException unused) {
                                            throw t1.a("Error parsing MS/ACM codec private", null);
                                        }
                                        break;
                                    case 3:
                                        mVar = mVar;
                                        dVar3.T = new x();
                                        str8 = "audio/true-hd";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z18 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i310 = (z18 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map5 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i310;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var5 = new t0(s0Var);
                                        w wVarC5 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC5;
                                        wVarC5.c(t0Var5);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 4:
                                        byte[] bArrA = dVar3.a(str7);
                                        try {
                                            try {
                                                if (bArrA[0] != 2) {
                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                }
                                                int i40 = 0;
                                                int i41 = 1;
                                                while (true) {
                                                    int i42 = bArrA[i41] & 255;
                                                    if (i42 != 255) {
                                                        int i43 = i41 + 1;
                                                        int i44 = i40 + i42;
                                                        int i45 = 0;
                                                        while (true) {
                                                            int i46 = bArrA[i43] & 255;
                                                            if (i46 != 255) {
                                                                int i47 = i43 + 1;
                                                                int i48 = i45 + i46;
                                                                if (bArrA[i47] != 1) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr5 = new byte[i44];
                                                                System.arraycopy(bArrA, i47, bArr5, 0, i44);
                                                                int i49 = i47 + i44;
                                                                if (bArrA[i49] != 3) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                int i50 = i49 + i48;
                                                                if (bArrA[i50] != 5) {
                                                                    throw t1.a("Error parsing vorbis codec private", null);
                                                                }
                                                                byte[] bArr6 = new byte[bArrA.length - i50];
                                                                System.arraycopy(bArrA, i50, bArr6, 0, bArrA.length - i50);
                                                                arrayList = new ArrayList(2);
                                                                arrayList.add(bArr5);
                                                                arrayList.add(bArr6);
                                                                str8 = "audio/vorbis";
                                                                i12 = 8192;
                                                                listY = arrayList;
                                                                iU = -1;
                                                                str3 = null;
                                                                if (dVar3.N != null) {
                                                                    str3 = eVarA.f3807a;
                                                                    str8 = "video/dolby-vision";
                                                                }
                                                                boolean z19 = dVar3.V;
                                                                if (dVar3.U) {
                                                                    i13 = 2;
                                                                } else {
                                                                    i13 = 0;
                                                                }
                                                                int i311 = (z19 ? 1 : 0) | i13;
                                                                s0Var = new s0();
                                                                zH = q.h(str8);
                                                                Map map6 = f47697h0;
                                                                if (zH) {
                                                                    s0Var.B = dVar3.O;
                                                                    s0Var.C = dVar3.Q;
                                                                    s0Var.D = iU;
                                                                    i14 = 1;
                                                                } else if (q.j(str8)) {
                                                                    if (dVar3.f47683q == 0) {
                                                                        i18 = dVar3.f47681o;
                                                                        i15 = -1;
                                                                        if (i18 == -1) {
                                                                            i18 = dVar3.f47679m;
                                                                        }
                                                                        dVar3.f47681o = i18;
                                                                        i19 = dVar3.f47682p;
                                                                        if (i19 == -1) {
                                                                            i19 = dVar3.f47680n;
                                                                        }
                                                                        dVar3.f47682p = i19;
                                                                    } else {
                                                                        i15 = -1;
                                                                    }
                                                                    i16 = dVar3.f47681o;
                                                                    if (i16 != i15) {
                                                                        f10 = -1.0f;
                                                                    } else {
                                                                        f10 = -1.0f;
                                                                    }
                                                                    if (dVar3.f47689x) {
                                                                        if (dVar3.D != -1.0f) {
                                                                            bArr = null;
                                                                        } else {
                                                                            bArr = null;
                                                                        }
                                                                        bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                                                    } else {
                                                                        bVar = null;
                                                                    }
                                                                    str5 = dVar3.f47669a;
                                                                    if (str5 == null) {
                                                                        iIntValue = -1;
                                                                    } else {
                                                                        iIntValue = -1;
                                                                    }
                                                                    if (dVar3.f47684r == 0) {
                                                                        if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                                            iIntValue = 0;
                                                                        } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                                            iIntValue = 90;
                                                                        } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                                            iIntValue = 180;
                                                                        } else {
                                                                            iIntValue = 180;
                                                                        }
                                                                    }
                                                                    s0Var.f8140t = dVar3.f47679m;
                                                                    s0Var.f8141u = dVar3.f47680n;
                                                                    s0Var.f8143x = f10;
                                                                    s0Var.f8142w = iIntValue;
                                                                    s0Var.f8144y = dVar3.v;
                                                                    s0Var.f8145z = dVar3.f47688w;
                                                                    s0Var.A = bVar;
                                                                    i14 = 2;
                                                                } else {
                                                                    if ("application/x-subrip".equals(str8)) {
                                                                    }
                                                                    i14 = 3;
                                                                }
                                                                str6 = dVar3.f47669a;
                                                                if (str6 != null) {
                                                                    s0Var.f8124b = dVar3.f47669a;
                                                                }
                                                                s0Var.f8123a = Integer.toString(i35);
                                                                s0Var.f8135o = str8;
                                                                s0Var.f8136p = i12;
                                                                s0Var.f8125c = dVar3.W;
                                                                s0Var.d = i311;
                                                                s0Var.f8137q = listY;
                                                                s0Var.h = str3;
                                                                s0Var.f8138r = dVar3.f47678l;
                                                                t0 t0Var6 = new t0(s0Var);
                                                                w wVarC6 = mVar.C(dVar3.f47671c, i14);
                                                                dVar3.X = wVarC6;
                                                                wVarC6.c(t0Var6);
                                                                sparseArray.put(dVar3.f47671c, dVar3);
                                                                eVar6 = eVar6;
                                                            } else {
                                                                i45 += 255;
                                                                i43++;
                                                            }
                                                        }
                                                    } else {
                                                        i40 += 255;
                                                        i41++;
                                                    }
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                throw t1.a("Error parsing vorbis codec private", bArrA);
                                            }
                                        } catch (ArrayIndexOutOfBoundsException unused3) {
                                            bArrA = 0;
                                        }
                                        break;
                                    case 5:
                                        str8 = "audio/mpeg-L2";
                                        iU = -1;
                                        i12 = 4096;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z110 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i312 = (z110 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map7 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i312;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var7 = new t0(s0Var);
                                        w wVarC7 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC7;
                                        wVarC7.c(t0Var7);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 6:
                                        str8 = "audio/mpeg";
                                        iU = -1;
                                        i12 = 4096;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z111 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i313 = (z111 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map8 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i313;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var8 = new t0(s0Var);
                                        w wVarC8 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC8;
                                        wVarC8.c(t0Var8);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 7:
                                        mVar = mVar;
                                        z zVar3 = new z(dVar3.a(dVar3.f47670b));
                                        try {
                                            zVar3.D(16);
                                            long jI = zVar3.i();
                                            if (jI == 1482049860) {
                                                exc = null;
                                                try {
                                                    pair = new Pair("video/divx", null);
                                                    str2 = null;
                                                } catch (ArrayIndexOutOfBoundsException unused4) {
                                                }
                                            } else {
                                                if (jI == 859189832) {
                                                    pair = new Pair("video/3gpp", null);
                                                } else {
                                                    if (jI == 826496599) {
                                                        int i51 = zVar3.f4859b + 20;
                                                        byte[] bArr7 = zVar3.f4858a;
                                                        while (true) {
                                                            if (i51 < bArr7.length - 4) {
                                                                if (bArr7[i51] == 0 && bArr7[i51 + 1] == 0 && bArr7[i51 + 2] == 1) {
                                                                    if (bArr7[i51 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr7, i51, bArr7.length)));
                                                                    }
                                                                }
                                                                i51++;
                                                            } else {
                                                                try {
                                                                    throw t1.a("Failed to find FourCC VC1 initialization data", null);
                                                                } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                    exc = null;
                                                                }
                                                            }
                                                            throw t1.a("Error parsing FourCC private data", exc);
                                                        }
                                                    }
                                                    d5.a.K("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str2 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                }
                                                str2 = null;
                                            }
                                            str8 = (String) pair.first;
                                            str3 = str2;
                                            listY = (List) pair.second;
                                            iU = -1;
                                            i12 = -1;
                                            if (dVar3.N != null) {
                                                str3 = eVarA.f3807a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z112 = dVar3.V;
                                            if (dVar3.U) {
                                                i13 = 2;
                                            } else {
                                                i13 = 0;
                                            }
                                            int i314 = (z112 ? 1 : 0) | i13;
                                            s0Var = new s0();
                                            zH = q.h(str8);
                                            Map map9 = f47697h0;
                                            if (zH) {
                                                s0Var.B = dVar3.O;
                                                s0Var.C = dVar3.Q;
                                                s0Var.D = iU;
                                                i14 = 1;
                                            } else if (q.j(str8)) {
                                                if (dVar3.f47683q == 0) {
                                                    i18 = dVar3.f47681o;
                                                    i15 = -1;
                                                    if (i18 == -1) {
                                                        i18 = dVar3.f47679m;
                                                    }
                                                    dVar3.f47681o = i18;
                                                    i19 = dVar3.f47682p;
                                                    if (i19 == -1) {
                                                        i19 = dVar3.f47680n;
                                                    }
                                                    dVar3.f47682p = i19;
                                                } else {
                                                    i15 = -1;
                                                }
                                                i16 = dVar3.f47681o;
                                                if (i16 != i15) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar3.f47689x) {
                                                    if (dVar3.D != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                                } else {
                                                    bVar = null;
                                                }
                                                str5 = dVar3.f47669a;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar3.f47684r == 0) {
                                                    if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                s0Var.f8140t = dVar3.f47679m;
                                                s0Var.f8141u = dVar3.f47680n;
                                                s0Var.f8143x = f10;
                                                s0Var.f8142w = iIntValue;
                                                s0Var.f8144y = dVar3.v;
                                                s0Var.f8145z = dVar3.f47688w;
                                                s0Var.A = bVar;
                                                i14 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i14 = 3;
                                            }
                                            str6 = dVar3.f47669a;
                                            if (str6 != null) {
                                                s0Var.f8124b = dVar3.f47669a;
                                            }
                                            s0Var.f8123a = Integer.toString(i35);
                                            s0Var.f8135o = str8;
                                            s0Var.f8136p = i12;
                                            s0Var.f8125c = dVar3.W;
                                            s0Var.d = i314;
                                            s0Var.f8137q = listY;
                                            s0Var.h = str3;
                                            s0Var.f8138r = dVar3.f47678l;
                                            t0 t0Var9 = new t0(s0Var);
                                            w wVarC9 = mVar.C(dVar3.f47671c, i14);
                                            dVar3.X = wVarC9;
                                            wVarC9.c(t0Var9);
                                            sparseArray.put(dVar3.f47671c, dVar3);
                                            eVar6 = eVar6;
                                        } catch (ArrayIndexOutOfBoundsException unused6) {
                                            exc = null;
                                        }
                                        break;
                                    case 8:
                                        mVar = mVar;
                                        byte[] bArr8 = new byte[4];
                                        System.arraycopy(dVar3.a(str7), 0, bArr8, 0, 4);
                                        listY = p8.z.y(bArr8);
                                        str8 = "application/dvbsubs";
                                        iU = -1;
                                        i12 = -1;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z113 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i315 = (z113 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map10 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i315;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var10 = new t0(s0Var);
                                        w wVarC10 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC10;
                                        wVarC10.c(t0Var10);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 10:
                                        e5.a aVarA = e5.a.a(new z(dVar3.a(dVar3.f47670b)));
                                        list = aVarA.f5222a;
                                        dVar3.Y = aVarA.f5223b;
                                        str4 = aVarA.f5226f;
                                        str8 = "video/avc";
                                        str3 = str4;
                                        listY = list;
                                        iU = -1;
                                        i12 = -1;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z114 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i316 = (z114 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map11 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i316;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var11 = new t0(s0Var);
                                        w wVarC11 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC11;
                                        wVarC11.c(t0Var11);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 11:
                                        mVar = mVar;
                                        listY = p8.z.y(dVar3.a(str7));
                                        str8 = "application/vobsub";
                                        iU = -1;
                                        i12 = -1;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z115 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i317 = (z115 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map12 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i317;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var12 = new t0(s0Var);
                                        w wVarC12 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC12;
                                        wVarC12.c(t0Var12);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 12:
                                        mVar = mVar;
                                        str8 = "audio/vnd.dts.hd";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z116 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i318 = (z116 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map13 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i318;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var13 = new t0(s0Var);
                                        w wVarC13 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC13;
                                        wVarC13.c(t0Var13);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 13:
                                        mVar = mVar;
                                        List listSingletonList2 = Collections.singletonList(dVar3.a(str7));
                                        byte[] bArr9 = dVar3.f47677k;
                                        j3.a aVarH = j3.b.h(new y(bArr9, bArr9.length), false);
                                        dVar3.Q = aVarH.f12301a;
                                        dVar3.O = aVarH.f12302b;
                                        String str9 = aVarH.f12303c;
                                        str8 = "audio/mp4a-latm";
                                        listY = listSingletonList2;
                                        str3 = str9;
                                        iU = -1;
                                        i12 = -1;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z117 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i319 = (z117 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map14 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i319;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var14 = new t0(s0Var);
                                        w wVarC14 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC14;
                                        wVarC14.c(t0Var14);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 14:
                                        mVar = mVar;
                                        str8 = "audio/ac3";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z118 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3110 = (z118 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map15 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3110;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var15 = new t0(s0Var);
                                        w wVarC15 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC15;
                                        wVarC15.c(t0Var15);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 15:
                                    case 21:
                                        mVar = mVar;
                                        str8 = "audio/vnd.dts";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z119 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3111 = (z119 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map16 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3111;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var16 = new t0(s0Var);
                                        w wVarC16 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC16;
                                        wVarC16.c(t0Var16);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 16:
                                        mVar = mVar;
                                        str8 = "video/av01";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1110 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3112 = (z1110 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map17 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3112;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var17 = new t0(s0Var);
                                        w wVarC17 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC17;
                                        wVarC17.c(t0Var17);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 17:
                                        mVar = mVar;
                                        str8 = "video/x-vnd.on2.vp8";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1111 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3113 = (z1111 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map18 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3113;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var18 = new t0(s0Var);
                                        w wVarC18 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC18;
                                        wVarC18.c(t0Var18);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 18:
                                        mVar = mVar;
                                        str8 = "video/x-vnd.on2.vp9";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1112 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3114 = (z1112 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map19 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3114;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var19 = new t0(s0Var);
                                        w wVarC19 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC19;
                                        wVarC19.c(t0Var19);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 19:
                                        mVar = mVar;
                                        str8 = "application/pgs";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1113 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3115 = (z1113 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map110 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3115;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var110 = new t0(s0Var);
                                        w wVarC110 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC110;
                                        wVarC110.c(t0Var110);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 20:
                                        mVar = mVar;
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1114 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3116 = (z1114 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map111 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3116;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var111 = new t0(s0Var);
                                        w wVarC111 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC111;
                                        wVarC111.c(t0Var111);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 22:
                                        mVar = mVar;
                                        if (dVar3.P == 32) {
                                            str8 = "audio/raw";
                                            iU = 4;
                                        } else {
                                            d5.a.K("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + dVar3.P + ". Setting mimeType to audio/x-unknown");
                                            str8 = "audio/x-unknown";
                                            iU = -1;
                                        }
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1115 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3117 = (z1115 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map112 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3117;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var112 = new t0(s0Var);
                                        w wVarC112 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC112;
                                        wVarC112.c(t0Var112);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 23:
                                        mVar = mVar;
                                        int i52 = dVar3.P;
                                        if (i52 == 8) {
                                            str8 = "audio/raw";
                                            iU = 3;
                                        } else if (i52 == 16) {
                                            iU = 268435456;
                                            str8 = "audio/raw";
                                        } else {
                                            d5.a.K("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + dVar3.P + ". Setting mimeType to audio/x-unknown");
                                            str8 = "audio/x-unknown";
                                            iU = -1;
                                        }
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1116 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3118 = (z1116 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map113 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3118;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var113 = new t0(s0Var);
                                        w wVarC113 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC113;
                                        wVarC113.c(t0Var113);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 24:
                                        mVar = mVar;
                                        iU = g0.u(dVar3.P);
                                        if (iU == 0) {
                                            d5.a.K("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + dVar3.P + ". Setting mimeType to audio/x-unknown");
                                            str8 = "audio/x-unknown";
                                            iU = -1;
                                        } else {
                                            str8 = "audio/raw";
                                        }
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1117 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i3119 = (z1117 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map114 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i3119;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var114 = new t0(s0Var);
                                        w wVarC114 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC114;
                                        wVarC114.c(t0Var114);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 25:
                                        mVar = mVar;
                                        listY = p8.z.t(f47693d0, dVar3.a(str7));
                                        str8 = "text/x-ssa";
                                        iU = -1;
                                        i12 = -1;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1118 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31110 = (z1118 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map115 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i31110;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var115 = new t0(s0Var);
                                        w wVarC115 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC115;
                                        wVarC115.c(t0Var115);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 26:
                                        e5.e eVarA2 = e5.e.a(new z(dVar3.a(dVar3.f47670b)));
                                        list = eVarA2.f5245a;
                                        dVar3.Y = eVarA2.f5246b;
                                        str4 = eVarA2.d;
                                        str8 = "video/hevc";
                                        str3 = str4;
                                        listY = list;
                                        iU = -1;
                                        i12 = -1;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z1119 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31111 = (z1119 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map116 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i31111;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var116 = new t0(s0Var);
                                        w wVarC116 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC116;
                                        wVarC116.c(t0Var116);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 27:
                                        mVar = mVar;
                                        str8 = "text/vtt";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z11110 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31112 = (z11110 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map117 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i31112;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var117 = new t0(s0Var);
                                        w wVarC117 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC117;
                                        wVarC117.c(t0Var117);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 28:
                                        mVar = mVar;
                                        str8 = "application/x-subrip";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z11111 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31113 = (z11111 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map118 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i31113;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var118 = new t0(s0Var);
                                        w wVarC118 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC118;
                                        wVarC118.c(t0Var118);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 29:
                                        mVar = mVar;
                                        str8 = "video/mpeg2";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z11112 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31114 = (z11112 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map119 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i31114;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var119 = new t0(s0Var);
                                        w wVarC119 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC119;
                                        wVarC119.c(t0Var119);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 30:
                                        mVar = mVar;
                                        str8 = "audio/eac3";
                                        iU = -1;
                                        i12 = -1;
                                        listY = null;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z11113 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31115 = (z11113 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map1110 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i31115;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var1110 = new t0(s0Var);
                                        w wVarC1110 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC1110;
                                        wVarC1110.c(t0Var1110);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 31:
                                        listSingletonList = Collections.singletonList(dVar3.a(str7));
                                        str8 = "audio/flac";
                                        listY = listSingletonList;
                                        iU = -1;
                                        i12 = -1;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z11114 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31116 = (z11114 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map1111 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i31116;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var1111 = new t0(s0Var);
                                        w wVarC1111 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC1111;
                                        wVarC1111.c(t0Var1111);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    case 32:
                                        arrayList = new ArrayList(3);
                                        arrayList.add(dVar3.a(dVar3.f47670b));
                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                        arrayList.add(byteBufferAllocate.order(byteOrder).putLong(dVar3.R).array());
                                        arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(dVar3.S).array());
                                        str8 = "audio/opus";
                                        i12 = 5760;
                                        listY = arrayList;
                                        iU = -1;
                                        str3 = null;
                                        if (dVar3.N != null) {
                                            str3 = eVarA.f3807a;
                                            str8 = "video/dolby-vision";
                                        }
                                        boolean z11115 = dVar3.V;
                                        if (dVar3.U) {
                                            i13 = 2;
                                        } else {
                                            i13 = 0;
                                        }
                                        int i31117 = (z11115 ? 1 : 0) | i13;
                                        s0Var = new s0();
                                        zH = q.h(str8);
                                        Map map1112 = f47697h0;
                                        if (zH) {
                                            s0Var.B = dVar3.O;
                                            s0Var.C = dVar3.Q;
                                            s0Var.D = iU;
                                            i14 = 1;
                                        } else if (q.j(str8)) {
                                            if (dVar3.f47683q == 0) {
                                                i18 = dVar3.f47681o;
                                                i15 = -1;
                                                if (i18 == -1) {
                                                    i18 = dVar3.f47679m;
                                                }
                                                dVar3.f47681o = i18;
                                                i19 = dVar3.f47682p;
                                                if (i19 == -1) {
                                                    i19 = dVar3.f47680n;
                                                }
                                                dVar3.f47682p = i19;
                                            } else {
                                                i15 = -1;
                                            }
                                            i16 = dVar3.f47681o;
                                            if (i16 != i15) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (dVar3.f47689x) {
                                                if (dVar3.D != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                bVar = new e5.b(dVar3.f47690y, dVar3.A, dVar3.f47691z, bArr);
                                            } else {
                                                bVar = null;
                                            }
                                            str5 = dVar3.f47669a;
                                            if (str5 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (dVar3.f47684r == 0) {
                                                if (Float.compare(dVar3.f47687u, 0.0f) == 0) {
                                                    iIntValue = 0;
                                                } else if (Float.compare(dVar3.f47686t, 90.0f) == 0) {
                                                    iIntValue = 90;
                                                } else if (Float.compare(dVar3.f47686t, -180.0f) != 0) {
                                                    iIntValue = 180;
                                                } else {
                                                    iIntValue = 180;
                                                }
                                            }
                                            s0Var.f8140t = dVar3.f47679m;
                                            s0Var.f8141u = dVar3.f47680n;
                                            s0Var.f8143x = f10;
                                            s0Var.f8142w = iIntValue;
                                            s0Var.f8144y = dVar3.v;
                                            s0Var.f8145z = dVar3.f47688w;
                                            s0Var.A = bVar;
                                            i14 = 2;
                                        } else {
                                            if ("application/x-subrip".equals(str8)) {
                                            }
                                            i14 = 3;
                                        }
                                        str6 = dVar3.f47669a;
                                        if (str6 != null) {
                                            s0Var.f8124b = dVar3.f47669a;
                                        }
                                        s0Var.f8123a = Integer.toString(i35);
                                        s0Var.f8135o = str8;
                                        s0Var.f8136p = i12;
                                        s0Var.f8125c = dVar3.W;
                                        s0Var.d = i31117;
                                        s0Var.f8137q = listY;
                                        s0Var.h = str3;
                                        s0Var.f8138r = dVar3.f47678l;
                                        t0 t0Var1112 = new t0(s0Var);
                                        w wVarC1112 = mVar.C(dVar3.f47671c, i14);
                                        dVar3.X = wVarC1112;
                                        wVarC1112.c(t0Var1112);
                                        sparseArray.put(dVar3.f47671c, dVar3);
                                        eVar6 = eVar6;
                                        break;
                                    default:
                                        throw t1.a("Unrecognized codec identifier.", null);
                                }
                            default:
                                eVar6.f47718u = null;
                                break;
                        }
                    } else {
                        if (i28 == 19899) {
                            int i53 = eVar6.f47719w;
                            if (i53 != -1) {
                                long j17 = eVar6.f47720x;
                                if (j17 != -1) {
                                    if (i53 == 475249515) {
                                        eVar6.f47722z = j17;
                                    }
                                }
                            }
                            throw t1.a("Mandatory element SeekID or SeekPosition not found", null);
                        }
                        if (i28 == 25152) {
                            eVar6.d(i28);
                            d dVar4 = eVar6.f47718u;
                            if (dVar4.h) {
                                m3.v vVar = dVar4.f47676j;
                                if (vVar == null) {
                                    throw t1.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                }
                                l3.c cVar = new l3.c(h3.h.f7866a, null, "video/webm", vVar.f17638b);
                                l3.c[] cVarArr = new l3.c[i21];
                                cVarArr[0] = cVar;
                                dVar4.f47678l = new l3.d(null, i21, cVarArr);
                            }
                        } else if (i28 == 28032) {
                            eVar6.d(i28);
                            d dVar5 = eVar6.f47718u;
                            if (dVar5.h && dVar5.f47675i != null) {
                                throw t1.a("Combining encryption and compression is not supported", null);
                            }
                        } else if (i28 == 357149030) {
                            if (eVar6.f47715r == -9223372036854775807L) {
                                eVar6.f47715r = 1000000L;
                            }
                            long j18 = eVar6.f47716s;
                            if (j18 != -9223372036854775807L) {
                                eVar6.f47717t = eVar6.k(j18);
                            }
                        } else if (i28 == 374648427) {
                            if (sparseArray.size() == 0) {
                                throw t1.a("No valid tracks were found", null);
                            }
                            eVar6.f47701b0.A();
                        } else if (i28 == 475249515) {
                            if (!eVar6.v) {
                                m mVar2 = eVar6.f47701b0;
                                v vVar2 = eVar6.C;
                                v vVar3 = eVar6.D;
                                if (eVar6.f47714q == -1 || eVar6.f47717t == -9223372036854775807L || vVar2 == null || (i20 = vVar2.f18186b) == 0 || vVar3 == null || vVar3.f18186b != i20) {
                                    oVar = new o(eVar6.f47717t);
                                } else {
                                    int[] iArrCopyOf = new int[i20];
                                    long[] jArrCopyOf = new long[i20];
                                    long[] jArrCopyOf2 = new long[i20];
                                    long[] jArrCopyOf3 = new long[i20];
                                    for (int i54 = 0; i54 < i20; i54++) {
                                        jArrCopyOf3[i54] = vVar2.f(i54);
                                        jArrCopyOf[i54] = vVar3.f(i54) + eVar6.f47714q;
                                    }
                                    int i55 = 0;
                                    while (true) {
                                        int i56 = i20 - 1;
                                        if (i55 < i56) {
                                            int i57 = i55 + 1;
                                            iArrCopyOf[i55] = (int) (jArrCopyOf[i57] - jArrCopyOf[i55]);
                                            jArrCopyOf2[i55] = jArrCopyOf3[i57] - jArrCopyOf3[i55];
                                            i55 = i57;
                                        } else {
                                            iArrCopyOf[i56] = (int) ((eVar6.f47714q + eVar6.f47713p) - jArrCopyOf[i56]);
                                            long j19 = eVar6.f47717t - jArrCopyOf3[i56];
                                            jArrCopyOf2[i56] = j19;
                                            if (j19 <= 0) {
                                                d5.a.K("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j19);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i56);
                                                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i56);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i56);
                                                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i56);
                                            }
                                            oVar = new m3.f(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                        }
                                    }
                                }
                                mVar2.n(oVar);
                                eVar6.v = i21;
                            }
                            eVar6.C = null;
                            eVar6.D = null;
                        }
                    }
                    lVar2 = lVar;
                    z13 = true;
                }
                z11 = false;
            }
            if (z13) {
                long j20 = ((h) lVar2).d;
                eVar = this;
                if (eVar.f47721y) {
                    eVar.A = j20;
                    nVar.f17620a = eVar.f47722z;
                    eVar.f47721y = z11;
                    return 1;
                }
                if (eVar.v) {
                    long j21 = eVar.A;
                    if (j21 != -1) {
                        nVar.f17620a = j21;
                        eVar.A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                eVar = this;
            }
            eVar2 = eVar;
            z12 = true;
        }
        e eVar7 = eVar2;
        if (z13) {
            return 0;
        }
        int i58 = 0;
        while (true) {
            SparseArray sparseArray2 = eVar7.f47702c;
            if (i58 >= sparseArray2.size()) {
                return -1;
            }
            d dVar6 = (d) sparseArray2.valueAt(i58);
            dVar6.X.getClass();
            x xVar = dVar6.T;
            if (xVar != null) {
                xVar.a(dVar6.X, dVar6.f47676j);
            }
            i58++;
        }
    }

    @Override
    public final void c(m mVar) {
        this.f47701b0 = mVar;
    }

    public final void d(int i10) {
        if (this.f47718u != null) {
            return;
        }
        throw t1.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    public final void e(d dVar, long j10, int i10, int i11, int i12) {
        byte[] bArrH;
        int i13;
        int i14;
        x xVar = dVar.T;
        if (xVar != null) {
            xVar.b(dVar.X, j10, i10, i11, i12, dVar.f47676j);
        } else {
            if ("S_TEXT/UTF8".equals(dVar.f47670b) || "S_TEXT/ASS".equals(dVar.f47670b) || "S_TEXT/WEBVTT".equals(dVar.f47670b)) {
                if (this.K > 1) {
                    d5.a.K("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        d5.a.K("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = dVar.f47670b;
                        z zVar = this.f47708k;
                        byte[] bArr = zVar.f4858a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrH = h(j11, 10000L, "%01d:%02d:%02d:%02d");
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrH = h(j11, 1000L, "%02d:%02d:%02d.%03d");
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrH = h(j11, 1000L, "%02d:%02d:%02d,%03d");
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrH, 0, bArr, i13, bArrH.length);
                        for (int i15 = zVar.f4859b; i15 < zVar.f4860c; i15++) {
                            if (zVar.f4858a[i15] == 0) {
                                zVar.B(i15);
                                dVar.X.a(zVar.f4860c, zVar);
                                i14 = i11 + zVar.f4860c;
                            }
                        }
                        dVar.X.a(zVar.f4860c, zVar);
                        i14 = i11 + zVar.f4860c;
                    }
                }
                i14 = i11;
            } else {
                i14 = i11;
            }
            if ((i10 & 268435456) != 0) {
                int i16 = this.K;
                z zVar2 = this.f47711n;
                if (i16 > 1) {
                    zVar2.z(0);
                } else {
                    int i17 = zVar2.f4860c;
                    dVar.X.d(i17, zVar2);
                    i14 += i17;
                }
            }
            dVar.X.e(j10, i10, i14, i12, dVar.f47676j);
        }
        this.F = true;
    }

    @Override
    public final boolean f(l lVar) throws EOFException, InterruptedIOException {
        v vVar = new v(10, (byte) 0);
        z zVar = (z) vVar.f18187c;
        h hVar = (h) lVar;
        long j10 = hVar.f17612c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        hVar.g(zVar.f4858a, 0, 4, false);
        vVar.f18186b = 4;
        for (long jS = zVar.s(); jS != 440786851; jS = ((jS << 8) & (-256)) | ((long) (zVar.f4858a[0] & 255))) {
            int i11 = vVar.f18186b + 1;
            vVar.f18186b = i11;
            if (i11 == i10) {
                return false;
            }
            hVar.g(zVar.f4858a, 0, 1, false);
        }
        long jH = vVar.h(hVar);
        long j12 = vVar.f18186b;
        if (jH != Long.MIN_VALUE && (j10 == -1 || j12 + jH < j10)) {
            while (true) {
                long j13 = vVar.f18186b;
                long j14 = j12 + jH;
                if (j13 < j14) {
                    if (vVar.h(hVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jH2 = vVar.h(hVar);
                    if (jH2 < 0 || jH2 > 2147483647L) {
                        break;
                    }
                    if (jH2 != 0) {
                        int i12 = (int) jH2;
                        hVar.a(i12, false);
                        vVar.f18186b += i12;
                    }
                } else if (j13 == j14) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        b bVar = this.f47698a;
        bVar.f47666e = 0;
        bVar.f47664b.clear();
        f fVar = bVar.f47665c;
        fVar.f47724b = 0;
        fVar.f47725c = 0;
        f fVar2 = this.f47700b;
        fVar2.f47724b = 0;
        fVar2.f47725c = 0;
        j();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f47702c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            x xVar = ((d) sparseArray.valueAt(i10)).T;
            if (xVar != null) {
                xVar.f17641b = false;
                xVar.f17642c = 0;
            }
            i10++;
        }
    }

    public final void i(l lVar, int i10) {
        z zVar = this.f47705g;
        if (zVar.f4860c >= i10) {
            return;
        }
        byte[] bArr = zVar.f4858a;
        if (bArr.length < i10) {
            zVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = zVar.f4858a;
        int i11 = zVar.f4860c;
        lVar.readFully(bArr2, i11, i10 - i11);
        zVar.B(i10);
    }

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f47699a0 = false;
        this.f47707j.z(0);
    }

    public final long k(long j10) throws t1 {
        long j11 = this.f47715r;
        if (j11 != -9223372036854775807L) {
            return g0.O(j10, j11, 1000L);
        }
        throw t1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(l lVar, d dVar, int i10, boolean z10) {
        int iB;
        int iB2;
        boolean z11;
        int i11;
        if ("S_TEXT/UTF8".equals(dVar.f47670b)) {
            m(lVar, f47692c0, i10);
            int i12 = this.T;
            j();
            return i12;
        }
        if ("S_TEXT/ASS".equals(dVar.f47670b)) {
            m(lVar, f47694e0, i10);
            int i13 = this.T;
            j();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(dVar.f47670b)) {
            m(lVar, f47695f0, i10);
            int i14 = this.T;
            j();
            return i14;
        }
        w wVar = dVar.X;
        boolean z12 = this.V;
        z zVar = this.f47707j;
        if (!z12) {
            boolean z13 = dVar.h;
            z zVar2 = this.f47705g;
            if (z13) {
                this.O &= -1073741825;
                if (!this.W) {
                    lVar.readFully(zVar2.f4858a, 0, 1);
                    this.S++;
                    byte b10 = zVar2.f4858a[0];
                    if ((b10 & 128) == 128) {
                        throw t1.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = b10;
                    this.W = true;
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    boolean z14 = (b11 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f47699a0) {
                        z zVar3 = this.f47709l;
                        lVar.readFully(zVar3.f4858a, 0, 8);
                        this.S += 8;
                        this.f47699a0 = true;
                        zVar2.f4858a[0] = (byte) ((z14 ? 128 : 0) | 8);
                        zVar2.C(0);
                        wVar.d(1, zVar2);
                        this.T++;
                        zVar3.C(0);
                        wVar.d(8, zVar3);
                        this.T += 8;
                    }
                    if (z14) {
                        if (!this.X) {
                            lVar.readFully(zVar2.f4858a, 0, 1);
                            this.S++;
                            zVar2.C(0);
                            this.Y = zVar2.r();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        zVar2.z(i15);
                        lVar.readFully(zVar2.f4858a, 0, i15);
                        this.S += i15;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f47712o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f47712o = ByteBuffer.allocate(i16);
                        }
                        this.f47712o.position(0);
                        this.f47712o.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i17 >= i11) {
                                break;
                            }
                            int iU = zVar2.u();
                            if (i17 % 2 == 0) {
                                this.f47712o.putShort((short) (iU - i18));
                            } else {
                                this.f47712o.putInt(iU - i18);
                            }
                            i17++;
                            i18 = iU;
                        }
                        int i19 = (i10 - this.S) - i18;
                        if (i11 % 2 == 1) {
                            this.f47712o.putInt(i19);
                        } else {
                            this.f47712o.putShort((short) i19);
                            this.f47712o.putInt(0);
                        }
                        byte[] bArrArray = this.f47712o.array();
                        z zVar4 = this.f47710m;
                        zVar4.A(i16, bArrArray);
                        wVar.d(i16, zVar4);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr = dVar.f47675i;
                if (bArr != null) {
                    zVar.A(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(dVar.f47670b)) {
                z11 = z10;
            } else {
                z11 = dVar.f47673f > 0;
            }
            if (z11) {
                this.O |= 268435456;
                this.f47711n.z(0);
                int i20 = (zVar.f4860c + i10) - this.S;
                zVar2.z(4);
                byte[] bArr2 = zVar2.f4858a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                wVar.d(4, zVar2);
                this.T += 4;
            }
            this.V = true;
        }
        int i21 = i10 + zVar.f4860c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f47670b) && !"V_MPEGH/ISO/HEVC".equals(dVar.f47670b)) {
            if (dVar.T != null) {
                d5.a.i(zVar.f4860c == 0);
                dVar.T.c(lVar);
            }
            while (true) {
                int i22 = this.S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int iA = zVar.a();
                if (iA > 0) {
                    iB2 = Math.min(i23, iA);
                    wVar.a(iB2, zVar);
                } else {
                    iB2 = wVar.b(lVar, i23, false);
                }
                this.S += iB2;
                this.T += iB2;
            }
        } else {
            z zVar5 = this.f47704f;
            byte[] bArr3 = zVar5.f4858a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = dVar.Y;
            int i25 = 4 - i24;
            while (this.S < i21) {
                int i26 = this.U;
                if (i26 == 0) {
                    int iMin = Math.min(i24, zVar.a());
                    lVar.readFully(bArr3, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        zVar.c(i25, iMin, bArr3);
                    }
                    this.S += i24;
                    zVar5.C(0);
                    this.U = zVar5.u();
                    z zVar6 = this.f47703e;
                    zVar6.C(0);
                    wVar.a(4, zVar6);
                    this.T += 4;
                } else {
                    int iA2 = zVar.a();
                    if (iA2 > 0) {
                        iB = Math.min(i26, iA2);
                        wVar.a(iB, zVar);
                    } else {
                        iB = wVar.b(lVar, i26, false);
                    }
                    this.S += iB;
                    this.T += iB;
                    this.U -= iB;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f47670b)) {
            z zVar7 = this.h;
            zVar7.C(0);
            wVar.a(4, zVar7);
            this.T += 4;
        }
        int i27 = this.T;
        j();
        return i27;
    }

    public final void m(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        z zVar = this.f47708k;
        byte[] bArr2 = zVar.f4858a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i10);
            zVar.getClass();
            zVar.A(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(zVar.f4858a, bArr.length, i10);
        zVar.C(0);
        zVar.B(length);
    }

    @Override
    public final void release() {
    }
}
