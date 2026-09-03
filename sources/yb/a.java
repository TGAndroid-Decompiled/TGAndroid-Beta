package yb;

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
    public int f50838e;
    public int f50839f;
    public int f50840g;
    public int h;
    public int f50841i;
    public boolean f50842j;
    public boolean f50843k;
    public int f50844l;
    public int f50845m;
    public int f50846n;
    public int f50847o;
    public int f50848p;
    public int f50849q;
    public int f50850r;
    public int f50851s;
    public int f50852t;
    public int f50853u;
    public int v;
    public int f50854w;
    public int f50855x;
    public int f50856y;
    public int f50857z;

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
        w.c.l(13, hashMap2, "Main synthetic", 14, "Wavetable synthesis");
        w.c.l(15, hashMap2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        w.c.l(17, hashMap2, "ER AAC LC", 18, "(reserved)");
        w.c.l(19, hashMap2, "ER AAC LTP", 20, "ER AAC Scalable");
        w.c.l(21, hashMap2, "ER TwinVQ", 22, "ER BSAC");
        w.c.l(23, hashMap2, "ER AAC LD", 24, "ER CELP");
        w.c.l(25, hashMap2, "ER HVXC", 26, "ER HILN");
        w.c.l(27, hashMap2, "ER Parametric", 28, "SSC");
        w.c.l(29, hashMap2, "PS", 30, "MPEG Surround");
        w.c.l(31, hashMap2, "(escape)", 32, "Layer-1");
        w.c.l(33, hashMap2, "Layer-2", 34, "Layer-3");
        w.c.l(35, hashMap2, "DST", 36, "ALS");
        w.c.l(37, hashMap2, "SLS", 38, "SLS non-core");
        w.c.l(39, hashMap2, "ER AAC ELD", 40, "SMR Simple");
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
        slice.limit(this.f50859b);
        byteBuffer.position(byteBuffer.position() + this.f50859b);
        byte[] bArr = new byte[this.f50859b];
        this.d = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(0, slice);
        this.f50838e = c(cVar);
        int a2 = cVar.a(4);
        this.f50839f = a2;
        int i12 = 15;
        if (a2 == 15) {
            this.f50840g = cVar.a(24);
        }
        this.h = cVar.a(4);
        int i13 = this.f50838e;
        if (i13 != 5 && i13 != 29) {
            this.f50841i = 0;
        } else {
            this.f50841i = 5;
            this.f50842j = true;
            if (i13 == 29) {
                this.f50843k = true;
            }
            int a10 = cVar.a(4);
            this.f50844l = a10;
            if (a10 == 15) {
                this.f50845m = cVar.a(24);
            }
            int c3 = c(cVar);
            this.f50838e = c3;
            if (c3 == 22) {
                this.f50846n = cVar.a(4);
            }
        }
        int i14 = this.f50838e;
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
                this.f50852t = cVar.a(1);
                int a11 = cVar.a(1);
                this.f50853u = a11;
                if (a11 == 1) {
                    this.v = cVar.a(14);
                }
                this.f50854w = cVar.a(1);
                if (i15 != 0) {
                    if (i14 == 6 || i14 == 20) {
                        this.f50855x = cVar.a(3);
                    }
                    if (this.f50854w == 1) {
                        if (i14 == 22) {
                            this.f50856y = cVar.a(5);
                            this.f50857z = cVar.a(11);
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
                this.f50847o = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f50848p = cVar.a(5);
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
        int i19 = this.f50838e;
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
                    if (this.f50841i == 5 && (cVar.f50861a.limit() * 8) - cVar.f50863c >= 16) {
                        int a17 = cVar.a(11);
                        this.f50851s = a17;
                        if (a17 == 695) {
                            int c10 = c(cVar);
                            this.f50841i = c10;
                            if (c10 == 5) {
                                boolean b12 = cVar.b();
                                this.f50842j = b12;
                                if (b12) {
                                    int a18 = cVar.a(4);
                                    this.f50844l = a18;
                                    if (a18 == 15) {
                                        this.f50845m = cVar.a(24);
                                    }
                                    if ((cVar.f50861a.limit() * 8) - cVar.f50863c >= 12) {
                                        int a19 = cVar.a(11);
                                        this.f50851s = a19;
                                        if (a19 == 1352) {
                                            this.f50843k = cVar.b();
                                        }
                                    }
                                }
                            }
                            if (this.f50841i == 22) {
                                boolean b13 = cVar.b();
                                this.f50842j = b13;
                                if (b13) {
                                    int a20 = cVar.a(4);
                                    this.f50844l = a20;
                                    if (a20 == 15) {
                                        this.f50845m = cVar.a(24);
                                    }
                                }
                                this.f50846n = cVar.a(4);
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
        this.f50849q = a21;
        if (a21 != 2 && a21 != 3) {
            if (a21 == 3) {
                int a22 = cVar.a(1);
                this.f50850r = a22;
                if (a22 == 0) {
                    throw new RuntimeException("not implemented");
                }
            }
            if (this.f50841i == 5) {
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
                if (this.B == aVar.B && this.A == aVar.A && this.C == aVar.C && this.f50838e == aVar.f50838e && this.h == aVar.h && this.v == aVar.v && this.f50853u == aVar.f50853u && this.f50850r == aVar.f50850r && this.f50849q == aVar.f50849q && this.K == aVar.K && this.f50841i == aVar.f50841i && this.f50846n == aVar.f50846n && this.f50854w == aVar.f50854w && this.D == aVar.D && this.f50845m == aVar.f50845m && this.f50844l == aVar.f50844l && this.f50848p == aVar.f50848p && this.f50852t == aVar.f50852t && this.E == aVar.E && this.Q == aVar.Q && this.R == aVar.R && this.S == aVar.S && this.P == aVar.P && this.N == aVar.N && this.M == aVar.M && this.O == aVar.O && this.J == aVar.J && this.I == aVar.I && this.F == aVar.F && this.f50855x == aVar.f50855x && this.f50857z == aVar.f50857z && this.f50856y == aVar.f50856y && this.H == aVar.H && this.G == aVar.G && this.T == aVar.T && this.f50843k == aVar.f50843k && this.f50847o == aVar.f50847o && this.f50840g == aVar.f50840g && this.f50839f == aVar.f50839f && this.f50842j == aVar.f50842j && this.f50851s == aVar.f50851s && this.L == aVar.L && Arrays.equals(this.d, aVar.d)) {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i10 * 31) + this.f50838e) * 31) + this.f50839f) * 31) + this.f50840g) * 31) + this.h) * 31) + this.f50841i) * 31) + (this.f50842j ? 1 : 0)) * 31) + (this.f50843k ? 1 : 0)) * 31) + this.f50844l) * 31) + this.f50845m) * 31) + this.f50846n) * 31) + this.f50847o) * 31) + this.f50848p) * 31) + this.f50849q) * 31) + this.f50850r) * 31) + this.f50851s) * 31) + this.f50852t) * 31) + this.f50853u) * 31) + this.v) * 31) + this.f50854w) * 31) + this.f50855x) * 31) + this.f50856y) * 31) + this.f50857z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb.append(r2.b.c(0, this.d));
        sb.append(", audioObjectType=");
        sb.append(this.f50838e);
        sb.append(" (");
        Integer valueOf = Integer.valueOf(this.f50838e);
        HashMap hashMap = V;
        sb.append((String) hashMap.get(valueOf));
        sb.append("), samplingFrequencyIndex=");
        sb.append(this.f50839f);
        sb.append(" (");
        Integer valueOf2 = Integer.valueOf(this.f50839f);
        HashMap hashMap2 = U;
        sb.append(hashMap2.get(valueOf2));
        sb.append("), samplingFrequency=");
        sb.append(this.f50840g);
        sb.append(", channelConfiguration=");
        sb.append(this.h);
        if (this.f50841i > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.f50841i);
            sb.append(" (");
            sb.append((String) hashMap.get(Integer.valueOf(this.f50841i)));
            sb.append("), sbrPresentFlag=");
            sb.append(this.f50842j);
            sb.append(", psPresentFlag=");
            sb.append(this.f50843k);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.f50844l);
            sb.append(" (");
            sb.append(hashMap2.get(Integer.valueOf(this.f50844l)));
            sb.append("), extensionSamplingFrequency=");
            sb.append(this.f50845m);
            sb.append(", extensionChannelConfiguration=");
            sb.append(this.f50846n);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.f50851s);
        if (this.E) {
            sb.append(", frameLengthFlag=");
            sb.append(this.f50852t);
            sb.append(", dependsOnCoreCoder=");
            sb.append(this.f50853u);
            sb.append(", coreCoderDelay=");
            sb.append(this.v);
            sb.append(", extensionFlag=");
            sb.append(this.f50854w);
            sb.append(", layerNr=");
            sb.append(this.f50855x);
            sb.append(", numOfSubFrame=");
            sb.append(this.f50856y);
            sb.append(", layer_length=");
            sb.append(this.f50857z);
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
