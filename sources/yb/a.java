package yb;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import vh.v2;
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
    public int e;
    public int f47111f;
    public int f47112g;
    public int h;
    public int f47113i;
    public boolean f47114j;
    public boolean f47115k;
    public int f47116l;
    public int f47117m;
    public int f47118n;
    public int f47119o;
    public int f47120p;
    public int f47121q;
    public int f47122r;
    public int f47123s;
    public int f47124t;
    public int f47125u;
    public int v;
    public int f47126w;
    public int f47127x;
    public int f47128y;
    public int f47129z;

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
        v2.l(13, hashMap2, "Main synthetic", 14, "Wavetable synthesis");
        v2.l(15, hashMap2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        v2.l(17, hashMap2, "ER AAC LC", 18, "(reserved)");
        v2.l(19, hashMap2, "ER AAC LTP", 20, "ER AAC Scalable");
        v2.l(21, hashMap2, "ER TwinVQ", 22, "ER BSAC");
        v2.l(23, hashMap2, "ER AAC LD", 24, "ER CELP");
        v2.l(25, hashMap2, "ER HVXC", 26, "ER HILN");
        v2.l(27, hashMap2, "ER Parametric", 28, "SSC");
        v2.l(29, hashMap2, "PS", 30, "MPEG Surround");
        v2.l(31, hashMap2, "(escape)", 32, "Layer-1");
        v2.l(33, hashMap2, "Layer-2", 34, "Layer-3");
        v2.l(35, hashMap2, "DST", 36, "ALS");
        v2.l(37, hashMap2, "SLS", 38, "SLS non-core");
        v2.l(39, hashMap2, "ER AAC ELD", 40, "SMR Simple");
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
        slice.limit(this.f47131b);
        byteBuffer.position(byteBuffer.position() + this.f47131b);
        byte[] bArr = new byte[this.f47131b];
        this.d = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(0, slice);
        this.e = c(cVar);
        int a2 = cVar.a(4);
        this.f47111f = a2;
        int i12 = 15;
        if (a2 == 15) {
            this.f47112g = cVar.a(24);
        }
        this.h = cVar.a(4);
        int i13 = this.e;
        if (i13 != 5 && i13 != 29) {
            this.f47113i = 0;
        } else {
            this.f47113i = 5;
            this.f47114j = true;
            if (i13 == 29) {
                this.f47115k = true;
            }
            int a10 = cVar.a(4);
            this.f47116l = a10;
            if (a10 == 15) {
                this.f47117m = cVar.a(24);
            }
            int c3 = c(cVar);
            this.e = c3;
            if (c3 == 22) {
                this.f47118n = cVar.a(4);
            }
        }
        int i14 = this.e;
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
                this.f47124t = cVar.a(1);
                int a11 = cVar.a(1);
                this.f47125u = a11;
                if (a11 == 1) {
                    this.v = cVar.a(14);
                }
                this.f47126w = cVar.a(1);
                if (i15 != 0) {
                    if (i14 == 6 || i14 == 20) {
                        this.f47127x = cVar.a(3);
                    }
                    if (this.f47126w == 1) {
                        if (i14 == 22) {
                            this.f47128y = cVar.a(5);
                            this.f47129z = cVar.a(11);
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
                this.f47119o = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f47120p = cVar.a(5);
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
        int i19 = this.e;
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
                    if (this.f47113i == 5 && (cVar.f47133a.limit() * 8) - cVar.f47135c >= 16) {
                        int a17 = cVar.a(11);
                        this.f47123s = a17;
                        if (a17 == 695) {
                            int c10 = c(cVar);
                            this.f47113i = c10;
                            if (c10 == 5) {
                                boolean b12 = cVar.b();
                                this.f47114j = b12;
                                if (b12) {
                                    int a18 = cVar.a(4);
                                    this.f47116l = a18;
                                    if (a18 == 15) {
                                        this.f47117m = cVar.a(24);
                                    }
                                    if ((cVar.f47133a.limit() * 8) - cVar.f47135c >= 12) {
                                        int a19 = cVar.a(11);
                                        this.f47123s = a19;
                                        if (a19 == 1352) {
                                            this.f47115k = cVar.b();
                                        }
                                    }
                                }
                            }
                            if (this.f47113i == 22) {
                                boolean b13 = cVar.b();
                                this.f47114j = b13;
                                if (b13) {
                                    int a20 = cVar.a(4);
                                    this.f47116l = a20;
                                    if (a20 == 15) {
                                        this.f47117m = cVar.a(24);
                                    }
                                }
                                this.f47118n = cVar.a(4);
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
        this.f47121q = a21;
        if (a21 != 2 && a21 != 3) {
            if (a21 == 3) {
                int a22 = cVar.a(1);
                this.f47122r = a22;
                if (a22 == 0) {
                    throw new RuntimeException("not implemented");
                }
            }
            if (this.f47113i == 5) {
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
                if (this.B == aVar.B && this.A == aVar.A && this.C == aVar.C && this.e == aVar.e && this.h == aVar.h && this.v == aVar.v && this.f47125u == aVar.f47125u && this.f47122r == aVar.f47122r && this.f47121q == aVar.f47121q && this.K == aVar.K && this.f47113i == aVar.f47113i && this.f47118n == aVar.f47118n && this.f47126w == aVar.f47126w && this.D == aVar.D && this.f47117m == aVar.f47117m && this.f47116l == aVar.f47116l && this.f47120p == aVar.f47120p && this.f47124t == aVar.f47124t && this.E == aVar.E && this.Q == aVar.Q && this.R == aVar.R && this.S == aVar.S && this.P == aVar.P && this.N == aVar.N && this.M == aVar.M && this.O == aVar.O && this.J == aVar.J && this.I == aVar.I && this.F == aVar.F && this.f47127x == aVar.f47127x && this.f47129z == aVar.f47129z && this.f47128y == aVar.f47128y && this.H == aVar.H && this.G == aVar.G && this.T == aVar.T && this.f47115k == aVar.f47115k && this.f47119o == aVar.f47119o && this.f47112g == aVar.f47112g && this.f47111f == aVar.f47111f && this.f47114j == aVar.f47114j && this.f47123s == aVar.f47123s && this.L == aVar.L && Arrays.equals(this.d, aVar.d)) {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i10 * 31) + this.e) * 31) + this.f47111f) * 31) + this.f47112g) * 31) + this.h) * 31) + this.f47113i) * 31) + (this.f47114j ? 1 : 0)) * 31) + (this.f47115k ? 1 : 0)) * 31) + this.f47116l) * 31) + this.f47117m) * 31) + this.f47118n) * 31) + this.f47119o) * 31) + this.f47120p) * 31) + this.f47121q) * 31) + this.f47122r) * 31) + this.f47123s) * 31) + this.f47124t) * 31) + this.f47125u) * 31) + this.v) * 31) + this.f47126w) * 31) + this.f47127x) * 31) + this.f47128y) * 31) + this.f47129z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb.append(r2.b.c(0, this.d));
        sb.append(", audioObjectType=");
        sb.append(this.e);
        sb.append(" (");
        Integer valueOf = Integer.valueOf(this.e);
        HashMap hashMap = V;
        sb.append((String) hashMap.get(valueOf));
        sb.append("), samplingFrequencyIndex=");
        sb.append(this.f47111f);
        sb.append(" (");
        Integer valueOf2 = Integer.valueOf(this.f47111f);
        HashMap hashMap2 = U;
        sb.append(hashMap2.get(valueOf2));
        sb.append("), samplingFrequency=");
        sb.append(this.f47112g);
        sb.append(", channelConfiguration=");
        sb.append(this.h);
        if (this.f47113i > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.f47113i);
            sb.append(" (");
            sb.append((String) hashMap.get(Integer.valueOf(this.f47113i)));
            sb.append("), sbrPresentFlag=");
            sb.append(this.f47114j);
            sb.append(", psPresentFlag=");
            sb.append(this.f47115k);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.f47116l);
            sb.append(" (");
            sb.append(hashMap2.get(Integer.valueOf(this.f47116l)));
            sb.append("), extensionSamplingFrequency=");
            sb.append(this.f47117m);
            sb.append(", extensionChannelConfiguration=");
            sb.append(this.f47118n);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.f47123s);
        if (this.E) {
            sb.append(", frameLengthFlag=");
            sb.append(this.f47124t);
            sb.append(", dependsOnCoreCoder=");
            sb.append(this.f47125u);
            sb.append(", coreCoderDelay=");
            sb.append(this.v);
            sb.append(", extensionFlag=");
            sb.append(this.f47126w);
            sb.append(", layerNr=");
            sb.append(this.f47127x);
            sb.append(", numOfSubFrame=");
            sb.append(this.f47128y);
            sb.append(", layer_length=");
            sb.append(this.f47129z);
            sb.append(", aacSectionDataResilienceFlag=");
            sb.append(this.A);
            sb.append(", aacScalefactorDataResilienceFlag=");
            sb.append(this.B);
            sb.append(", aacSpectralDataResilienceFlag=");
            sb.append(this.C);
            sb.append(", extensionFlag3=");
            sb.append(this.D);
        }
        if (this.T) {
            sb.append(", isBaseLayer=");
            sb.append(this.F);
            sb.append(", paraMode=");
            sb.append(this.G);
            sb.append(", paraExtensionFlag=");
            sb.append(this.H);
            sb.append(", hvxcVarMode=");
            sb.append(this.I);
            sb.append(", hvxcRateMode=");
            sb.append(this.J);
            sb.append(", erHvxcExtensionFlag=");
            sb.append(this.K);
            sb.append(", var_ScalableFlag=");
            sb.append(this.L);
            sb.append(", hilnQuantMode=");
            sb.append(this.M);
            sb.append(", hilnMaxNumLine=");
            sb.append(this.N);
            sb.append(", hilnSampleRateCode=");
            sb.append(this.O);
            sb.append(", hilnFrameLength=");
            sb.append(this.P);
            sb.append(", hilnContMode=");
            sb.append(this.Q);
            sb.append(", hilnEnhaLayer=");
            sb.append(this.R);
            sb.append(", hilnEnhaQuantMode=");
            sb.append(this.S);
        }
        sb.append('}');
        return sb.toString();
    }
}
