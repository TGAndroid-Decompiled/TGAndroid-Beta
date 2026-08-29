package wb;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
public final class a extends b {
    public static final HashMap U;
    public static final HashMap V;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public byte[] d;
    public int f49802e;
    public int f49803f;
    public int f49804g;
    public int h;
    public int f49805i;
    public boolean f49806j;
    public boolean f49807k;
    public int f49808l;
    public int f49809m;
    public int f49810n;
    public int f49811o;
    public int f49812p;
    public int f49813q;
    public int f49814r;
    public int f49815s;
    public int f49816t;
    public int f49817u;
    public int v;
    public int f49818w;
    public int f49819x;
    public int f49820y;
    public int f49821z;

    static {
        HashMap hashMap = new HashMap();
        U = hashMap;
        HashMap hashMap2 = new HashMap();
        V = hashMap2;
        hashMap.put(0, 96000);
        hashMap.put(1, 88200);
        hashMap.put(2, 64000);
        hashMap.put(3, 48000);
        hashMap.put(4, 44100);
        hashMap.put(5, 32000);
        hashMap.put(6, 24000);
        hashMap.put(7, 22050);
        hashMap.put(8, 16000);
        hashMap.put(9, 12000);
        hashMap.put(10, 11025);
        hashMap.put(11, 8000);
        hashMap2.put(1, "AAC main");
        hashMap2.put(2, "AAC LC");
        hashMap2.put(3, "AAC SSR");
        hashMap2.put(4, "AAC LTP");
        hashMap2.put(5, "SBR");
        hashMap2.put(6, "AAC Scalable");
        hashMap2.put(7, "TwinVQ");
        hashMap2.put(8, "CELP");
        hashMap2.put(9, "HVXC");
        hashMap2.put(10, "(reserved)");
        hashMap2.put(11, "(reserved)");
        hashMap2.put(12, "TTSI");
        u3.c.l(13, hashMap2, "Main synthetic", 14, "Wavetable synthesis");
        u3.c.l(15, hashMap2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        u3.c.l(17, hashMap2, "ER AAC LC", 18, "(reserved)");
        u3.c.l(19, hashMap2, "ER AAC LTP", 20, "ER AAC Scalable");
        u3.c.l(21, hashMap2, "ER TwinVQ", 22, "ER BSAC");
        u3.c.l(23, hashMap2, "ER AAC LD", 24, "ER CELP");
        u3.c.l(25, hashMap2, "ER HVXC", 26, "ER HILN");
        u3.c.l(27, hashMap2, "ER Parametric", 28, "SSC");
        u3.c.l(29, hashMap2, "PS", 30, "MPEG Surround");
        u3.c.l(31, hashMap2, "(escape)", 32, "Layer-1");
        u3.c.l(33, hashMap2, "Layer-2", 34, "Layer-3");
        u3.c.l(35, hashMap2, "DST", 36, "ALS");
        u3.c.l(37, hashMap2, "SLS", 38, "SLS non-core");
        u3.c.l(39, hashMap2, "ER AAC ELD", 40, "SMR Simple");
        hashMap2.put(41, "SMR Main");
    }

    public static int c(c cVar) {
        int a2 = cVar.a(5);
        if (a2 == 31) {
            return cVar.a(6) + 32;
        }
        return a2;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f49823b);
        byteBuffer.position(byteBuffer.position() + this.f49823b);
        byte[] bArr = new byte[this.f49823b];
        this.d = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(0, slice);
        this.f49802e = c(cVar);
        int a2 = cVar.a(4);
        this.f49803f = a2;
        int i12 = 15;
        if (a2 == 15) {
            this.f49804g = cVar.a(24);
        }
        this.h = cVar.a(4);
        int i13 = this.f49802e;
        if (i13 != 5 && i13 != 29) {
            this.f49805i = 0;
        } else {
            this.f49805i = 5;
            this.f49806j = true;
            if (i13 == 29) {
                this.f49807k = true;
            }
            int a10 = cVar.a(4);
            this.f49808l = a10;
            if (a10 == 15) {
                this.f49809m = cVar.a(24);
            }
            int c3 = c(cVar);
            this.f49802e = c3;
            if (c3 == 22) {
                this.f49810n = cVar.a(4);
            }
        }
        int i14 = this.f49802e;
        switch (i14) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                int i15 = this.h;
                this.f49816t = cVar.a(1);
                int a11 = cVar.a(1);
                this.f49817u = a11;
                if (a11 == 1) {
                    this.v = cVar.a(14);
                }
                this.f49818w = cVar.a(1);
                if (i15 != 0) {
                    if (i14 == 6 || i14 == 20) {
                        this.f49819x = cVar.a(3);
                    }
                    if (this.f49818w == 1) {
                        if (i14 == 22) {
                            this.f49820y = cVar.a(5);
                            this.f49821z = cVar.a(11);
                        }
                        if (i14 == 17 || i14 == 19 || i14 == 20 || i14 == 23) {
                            this.A = cVar.b();
                            this.B = cVar.b();
                            this.C = cVar.b();
                        }
                        this.D = cVar.a(1);
                    }
                    this.E = true;
                    break;
                } else {
                    throw new UnsupportedOperationException("can't parse program_config_element yet");
                }
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                int a12 = cVar.a(1);
                this.F = a12;
                if (a12 == 1) {
                    int a13 = cVar.a(2);
                    this.G = a13;
                    if (a13 != 1) {
                        this.I = cVar.a(1);
                        this.J = cVar.a(2);
                        int a14 = cVar.a(1);
                        this.K = a14;
                        if (a14 == 1) {
                            this.L = cVar.a(1);
                        }
                    }
                    if (this.G != 0) {
                        this.M = cVar.a(1);
                        this.N = cVar.a(8);
                        this.O = cVar.a(4);
                        this.P = cVar.a(12);
                        this.Q = cVar.a(2);
                    }
                    this.H = cVar.a(1);
                    this.T = true;
                    break;
                } else {
                    int a15 = cVar.a(1);
                    this.R = a15;
                    if (a15 == 1) {
                        this.S = cVar.a(2);
                        break;
                    }
                }
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f49811o = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f49812p = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                int i16 = this.h;
                cVar.b();
                cVar.b();
                cVar.b();
                cVar.b();
                if (cVar.b()) {
                    cVar.b();
                    cVar.b();
                    switch (i16) {
                        case 1:
                        case 2:
                            i11 = 1;
                            break;
                        case 3:
                            i11 = 2;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i11 = 3;
                            break;
                        case 7:
                            i11 = 4;
                            break;
                        default:
                            i11 = 0;
                            break;
                    }
                    for (int i17 = 0; i17 < i11; i17++) {
                        cVar.b();
                        cVar.a(4);
                        cVar.a(4);
                        cVar.a(3);
                        cVar.a(2);
                        boolean b10 = cVar.b();
                        boolean b11 = cVar.b();
                        if (b10) {
                            cVar.a(2);
                            cVar.b();
                            cVar.a(2);
                        }
                        if (b11) {
                            cVar.a(2);
                            cVar.a(2);
                            cVar.b();
                        }
                        cVar.b();
                    }
                }
                while (cVar.a(4) != 0) {
                    int a16 = cVar.a(4);
                    if (a16 == i12) {
                        i10 = cVar.a(8);
                        a16 += i10;
                    } else {
                        i10 = 0;
                    }
                    if (i10 == 255) {
                        a16 += cVar.a(16);
                    }
                    for (int i18 = 0; i18 < a16; i18++) {
                        cVar.a(8);
                    }
                    i12 = 15;
                }
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i19 = this.f49802e;
        if (i19 != 17 && i19 != 39) {
            switch (i19) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    if (this.f49805i == 5 && (cVar.f49825a.limit() * 8) - cVar.f49827c >= 16) {
                        int a17 = cVar.a(11);
                        this.f49815s = a17;
                        if (a17 == 695) {
                            int c6 = c(cVar);
                            this.f49805i = c6;
                            if (c6 == 5) {
                                boolean b12 = cVar.b();
                                this.f49806j = b12;
                                if (b12) {
                                    int a18 = cVar.a(4);
                                    this.f49808l = a18;
                                    if (a18 == 15) {
                                        this.f49809m = cVar.a(24);
                                    }
                                    if ((cVar.f49825a.limit() * 8) - cVar.f49827c >= 12) {
                                        int a19 = cVar.a(11);
                                        this.f49815s = a19;
                                        if (a19 == 1352) {
                                            this.f49807k = cVar.b();
                                        }
                                    }
                                }
                            }
                            if (this.f49805i == 22) {
                                boolean b13 = cVar.b();
                                this.f49806j = b13;
                                if (b13) {
                                    int a20 = cVar.a(4);
                                    this.f49808l = a20;
                                    if (a20 == 15) {
                                        this.f49809m = cVar.a(24);
                                    }
                                }
                                this.f49810n = cVar.a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        int a21 = cVar.a(2);
        this.f49813q = a21;
        if (a21 != 2 && a21 != 3) {
            if (a21 == 3) {
                int a22 = cVar.a(1);
                this.f49814r = a22;
                if (a22 == 0) {
                    throw new RuntimeException("not implemented");
                }
            }
            if (this.f49805i == 5) {
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.B == aVar.B && this.A == aVar.A && this.C == aVar.C && this.f49802e == aVar.f49802e && this.h == aVar.h && this.v == aVar.v && this.f49817u == aVar.f49817u && this.f49814r == aVar.f49814r && this.f49813q == aVar.f49813q && this.K == aVar.K && this.f49805i == aVar.f49805i && this.f49810n == aVar.f49810n && this.f49818w == aVar.f49818w && this.D == aVar.D && this.f49809m == aVar.f49809m && this.f49808l == aVar.f49808l && this.f49812p == aVar.f49812p && this.f49816t == aVar.f49816t && this.E == aVar.E && this.Q == aVar.Q && this.R == aVar.R && this.S == aVar.S && this.P == aVar.P && this.N == aVar.N && this.M == aVar.M && this.O == aVar.O && this.J == aVar.J && this.I == aVar.I && this.F == aVar.F && this.f49819x == aVar.f49819x && this.f49821z == aVar.f49821z && this.f49820y == aVar.f49820y && this.H == aVar.H && this.G == aVar.G && this.T == aVar.T && this.f49807k == aVar.f49807k && this.f49811o == aVar.f49811o && this.f49804g == aVar.f49804g && this.f49803f == aVar.f49803f && this.f49806j == aVar.f49806j && this.f49815s == aVar.f49815s && this.L == aVar.L && Arrays.equals(this.d, aVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        byte[] bArr = this.d;
        if (bArr != null) {
            i10 = Arrays.hashCode(bArr);
        } else {
            i10 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i10 * 31) + this.f49802e) * 31) + this.f49803f) * 31) + this.f49804g) * 31) + this.h) * 31) + this.f49805i) * 31) + (this.f49806j ? 1 : 0)) * 31) + (this.f49807k ? 1 : 0)) * 31) + this.f49808l) * 31) + this.f49809m) * 31) + this.f49810n) * 31) + this.f49811o) * 31) + this.f49812p) * 31) + this.f49813q) * 31) + this.f49814r) * 31) + this.f49815s) * 31) + this.f49816t) * 31) + this.f49817u) * 31) + this.v) * 31) + this.f49818w) * 31) + this.f49819x) * 31) + this.f49820y) * 31) + this.f49821z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb2.append(r2.b.c(0, this.d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f49802e);
        sb2.append(" (");
        Integer valueOf = Integer.valueOf(this.f49802e);
        HashMap hashMap = V;
        sb2.append((String) hashMap.get(valueOf));
        sb2.append("), samplingFrequencyIndex=");
        sb2.append(this.f49803f);
        sb2.append(" (");
        Integer valueOf2 = Integer.valueOf(this.f49803f);
        HashMap hashMap2 = U;
        sb2.append(hashMap2.get(valueOf2));
        sb2.append("), samplingFrequency=");
        sb2.append(this.f49804g);
        sb2.append(", channelConfiguration=");
        sb2.append(this.h);
        if (this.f49805i > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f49805i);
            sb2.append(" (");
            sb2.append((String) hashMap.get(Integer.valueOf(this.f49805i)));
            sb2.append("), sbrPresentFlag=");
            sb2.append(this.f49806j);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f49807k);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f49808l);
            sb2.append(" (");
            sb2.append(hashMap2.get(Integer.valueOf(this.f49808l)));
            sb2.append("), extensionSamplingFrequency=");
            sb2.append(this.f49809m);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f49810n);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f49815s);
        if (this.E) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f49816t);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f49817u);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.v);
            sb2.append(", extensionFlag=");
            sb2.append(this.f49818w);
            sb2.append(", layerNr=");
            sb2.append(this.f49819x);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f49820y);
            sb2.append(", layer_length=");
            sb2.append(this.f49821z);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.A);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.B);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.C);
            sb2.append(", extensionFlag3=");
            sb2.append(this.D);
        }
        if (this.T) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.F);
            sb2.append(", paraMode=");
            sb2.append(this.G);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.H);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.I);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.J);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.K);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.L);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.M);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.N);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.O);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.P);
            sb2.append(", hilnContMode=");
            sb2.append(this.Q);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.R);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.S);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
