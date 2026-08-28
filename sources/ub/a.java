package ub;

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
    public int f48142e;
    public int f48143f;
    public int f48144g;
    public int h;
    public int f48145i;
    public boolean f48146j;
    public boolean f48147k;
    public int f48148l;
    public int f48149m;
    public int f48150n;
    public int f48151o;
    public int f48152p;
    public int f48153q;
    public int f48154r;
    public int f48155s;
    public int f48156t;
    public int f48157u;
    public int v;
    public int f48158w;
    public int f48159x;
    public int f48160y;
    public int f48161z;

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
        ta.b.h(13, hashMap2, "Main synthetic", 14, "Wavetable synthesis");
        ta.b.h(15, hashMap2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        ta.b.h(17, hashMap2, "ER AAC LC", 18, "(reserved)");
        ta.b.h(19, hashMap2, "ER AAC LTP", 20, "ER AAC Scalable");
        ta.b.h(21, hashMap2, "ER TwinVQ", 22, "ER BSAC");
        ta.b.h(23, hashMap2, "ER AAC LD", 24, "ER CELP");
        ta.b.h(25, hashMap2, "ER HVXC", 26, "ER HILN");
        ta.b.h(27, hashMap2, "ER Parametric", 28, "SSC");
        ta.b.h(29, hashMap2, "PS", 30, "MPEG Surround");
        ta.b.h(31, hashMap2, "(escape)", 32, "Layer-1");
        ta.b.h(33, hashMap2, "Layer-2", 34, "Layer-3");
        ta.b.h(35, hashMap2, "DST", 36, "ALS");
        ta.b.h(37, hashMap2, "SLS", 38, "SLS non-core");
        ta.b.h(39, hashMap2, "ER AAC ELD", 40, "SMR Simple");
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
        int i9;
        int i10;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f48163b);
        byteBuffer.position(byteBuffer.position() + this.f48163b);
        byte[] bArr = new byte[this.f48163b];
        this.d = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(0, slice);
        this.f48142e = c(cVar);
        int a2 = cVar.a(4);
        this.f48143f = a2;
        int i11 = 15;
        if (a2 == 15) {
            this.f48144g = cVar.a(24);
        }
        this.h = cVar.a(4);
        int i12 = this.f48142e;
        if (i12 != 5 && i12 != 29) {
            this.f48145i = 0;
        } else {
            this.f48145i = 5;
            this.f48146j = true;
            if (i12 == 29) {
                this.f48147k = true;
            }
            int a3 = cVar.a(4);
            this.f48148l = a3;
            if (a3 == 15) {
                this.f48149m = cVar.a(24);
            }
            int c10 = c(cVar);
            this.f48142e = c10;
            if (c10 == 22) {
                this.f48150n = cVar.a(4);
            }
        }
        int i13 = this.f48142e;
        switch (i13) {
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
                int i14 = this.h;
                this.f48156t = cVar.a(1);
                int a10 = cVar.a(1);
                this.f48157u = a10;
                if (a10 == 1) {
                    this.v = cVar.a(14);
                }
                this.f48158w = cVar.a(1);
                if (i14 != 0) {
                    if (i13 == 6 || i13 == 20) {
                        this.f48159x = cVar.a(3);
                    }
                    if (this.f48158w == 1) {
                        if (i13 == 22) {
                            this.f48160y = cVar.a(5);
                            this.f48161z = cVar.a(11);
                        }
                        if (i13 == 17 || i13 == 19 || i13 == 20 || i13 == 23) {
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
                int a11 = cVar.a(1);
                this.F = a11;
                if (a11 == 1) {
                    int a12 = cVar.a(2);
                    this.G = a12;
                    if (a12 != 1) {
                        this.I = cVar.a(1);
                        this.J = cVar.a(2);
                        int a13 = cVar.a(1);
                        this.K = a13;
                        if (a13 == 1) {
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
                    int a14 = cVar.a(1);
                    this.R = a14;
                    if (a14 == 1) {
                        this.S = cVar.a(2);
                        break;
                    }
                }
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f48151o = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f48152p = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                int i15 = this.h;
                cVar.b();
                cVar.b();
                cVar.b();
                cVar.b();
                if (cVar.b()) {
                    cVar.b();
                    cVar.b();
                    switch (i15) {
                        case 1:
                        case 2:
                            i10 = 1;
                            break;
                        case 3:
                            i10 = 2;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i10 = 3;
                            break;
                        case 7:
                            i10 = 4;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    for (int i16 = 0; i16 < i10; i16++) {
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
                    int a15 = cVar.a(4);
                    if (a15 == i11) {
                        i9 = cVar.a(8);
                        a15 += i9;
                    } else {
                        i9 = 0;
                    }
                    if (i9 == 255) {
                        a15 += cVar.a(16);
                    }
                    for (int i17 = 0; i17 < a15; i17++) {
                        cVar.a(8);
                    }
                    i11 = 15;
                }
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i18 = this.f48142e;
        if (i18 != 17 && i18 != 39) {
            switch (i18) {
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
                    if (this.f48145i == 5 && (cVar.f48165a.limit() * 8) - cVar.f48167c >= 16) {
                        int a16 = cVar.a(11);
                        this.f48155s = a16;
                        if (a16 == 695) {
                            int c11 = c(cVar);
                            this.f48145i = c11;
                            if (c11 == 5) {
                                boolean b12 = cVar.b();
                                this.f48146j = b12;
                                if (b12) {
                                    int a17 = cVar.a(4);
                                    this.f48148l = a17;
                                    if (a17 == 15) {
                                        this.f48149m = cVar.a(24);
                                    }
                                    if ((cVar.f48165a.limit() * 8) - cVar.f48167c >= 12) {
                                        int a18 = cVar.a(11);
                                        this.f48155s = a18;
                                        if (a18 == 1352) {
                                            this.f48147k = cVar.b();
                                        }
                                    }
                                }
                            }
                            if (this.f48145i == 22) {
                                boolean b13 = cVar.b();
                                this.f48146j = b13;
                                if (b13) {
                                    int a19 = cVar.a(4);
                                    this.f48148l = a19;
                                    if (a19 == 15) {
                                        this.f48149m = cVar.a(24);
                                    }
                                }
                                this.f48150n = cVar.a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        int a20 = cVar.a(2);
        this.f48153q = a20;
        if (a20 != 2 && a20 != 3) {
            if (a20 == 3) {
                int a21 = cVar.a(1);
                this.f48154r = a21;
                if (a21 == 0) {
                    throw new RuntimeException("not implemented");
                }
            }
            if (this.f48145i == 5) {
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
                if (this.B == aVar.B && this.A == aVar.A && this.C == aVar.C && this.f48142e == aVar.f48142e && this.h == aVar.h && this.v == aVar.v && this.f48157u == aVar.f48157u && this.f48154r == aVar.f48154r && this.f48153q == aVar.f48153q && this.K == aVar.K && this.f48145i == aVar.f48145i && this.f48150n == aVar.f48150n && this.f48158w == aVar.f48158w && this.D == aVar.D && this.f48149m == aVar.f48149m && this.f48148l == aVar.f48148l && this.f48152p == aVar.f48152p && this.f48156t == aVar.f48156t && this.E == aVar.E && this.Q == aVar.Q && this.R == aVar.R && this.S == aVar.S && this.P == aVar.P && this.N == aVar.N && this.M == aVar.M && this.O == aVar.O && this.J == aVar.J && this.I == aVar.I && this.F == aVar.F && this.f48159x == aVar.f48159x && this.f48161z == aVar.f48161z && this.f48160y == aVar.f48160y && this.H == aVar.H && this.G == aVar.G && this.T == aVar.T && this.f48147k == aVar.f48147k && this.f48151o == aVar.f48151o && this.f48144g == aVar.f48144g && this.f48143f == aVar.f48143f && this.f48146j == aVar.f48146j && this.f48155s == aVar.f48155s && this.L == aVar.L && Arrays.equals(this.d, aVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        byte[] bArr = this.d;
        if (bArr != null) {
            i9 = Arrays.hashCode(bArr);
        } else {
            i9 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i9 * 31) + this.f48142e) * 31) + this.f48143f) * 31) + this.f48144g) * 31) + this.h) * 31) + this.f48145i) * 31) + (this.f48146j ? 1 : 0)) * 31) + (this.f48147k ? 1 : 0)) * 31) + this.f48148l) * 31) + this.f48149m) * 31) + this.f48150n) * 31) + this.f48151o) * 31) + this.f48152p) * 31) + this.f48153q) * 31) + this.f48154r) * 31) + this.f48155s) * 31) + this.f48156t) * 31) + this.f48157u) * 31) + this.v) * 31) + this.f48158w) * 31) + this.f48159x) * 31) + this.f48160y) * 31) + this.f48161z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb2.append(p2.b.c(0, this.d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f48142e);
        sb2.append(" (");
        Integer valueOf = Integer.valueOf(this.f48142e);
        HashMap hashMap = V;
        sb2.append((String) hashMap.get(valueOf));
        sb2.append("), samplingFrequencyIndex=");
        sb2.append(this.f48143f);
        sb2.append(" (");
        Integer valueOf2 = Integer.valueOf(this.f48143f);
        HashMap hashMap2 = U;
        sb2.append(hashMap2.get(valueOf2));
        sb2.append("), samplingFrequency=");
        sb2.append(this.f48144g);
        sb2.append(", channelConfiguration=");
        sb2.append(this.h);
        if (this.f48145i > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f48145i);
            sb2.append(" (");
            sb2.append((String) hashMap.get(Integer.valueOf(this.f48145i)));
            sb2.append("), sbrPresentFlag=");
            sb2.append(this.f48146j);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f48147k);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f48148l);
            sb2.append(" (");
            sb2.append(hashMap2.get(Integer.valueOf(this.f48148l)));
            sb2.append("), extensionSamplingFrequency=");
            sb2.append(this.f48149m);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f48150n);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f48155s);
        if (this.E) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f48156t);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f48157u);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.v);
            sb2.append(", extensionFlag=");
            sb2.append(this.f48158w);
            sb2.append(", layerNr=");
            sb2.append(this.f48159x);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f48160y);
            sb2.append(", layer_length=");
            sb2.append(this.f48161z);
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
