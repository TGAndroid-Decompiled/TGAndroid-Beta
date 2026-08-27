package vb;

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

    public int f48827e;

    public int f48828f;

    public int f48829g;
    public int h;

    public int f48830i;

    public boolean f48831j;

    public boolean f48832k;

    public int f48833l;

    public int f48834m;

    public int f48835n;

    public int f48836o;

    public int f48837p;

    public int f48838q;

    public int f48839r;

    public int f48840s;

    public int f48841t;

    public int f48842u;
    public int v;

    public int f48843w;

    public int f48844x;

    public int f48845y;

    public int f48846z;

    static {
        HashMap map = new HashMap();
        U = map;
        HashMap map2 = new HashMap();
        V = map2;
        map.put(0, 96000);
        map.put(1, 88200);
        map.put(2, 64000);
        map.put(3, 48000);
        map.put(4, 44100);
        map.put(5, 32000);
        map.put(6, 24000);
        map.put(7, 22050);
        map.put(8, 16000);
        map.put(9, 12000);
        map.put(10, 11025);
        map.put(11, 8000);
        map2.put(1, "AAC main");
        map2.put(2, "AAC LC");
        map2.put(3, "AAC SSR");
        map2.put(4, "AAC LTP");
        map2.put(5, "SBR");
        map2.put(6, "AAC Scalable");
        map2.put(7, "TwinVQ");
        map2.put(8, "CELP");
        map2.put(9, "HVXC");
        map2.put(10, "(reserved)");
        map2.put(11, "(reserved)");
        map2.put(12, "TTSI");
        s3.c.m(13, map2, "Main synthetic", 14, "Wavetable synthesis");
        s3.c.m(15, map2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        s3.c.m(17, map2, "ER AAC LC", 18, "(reserved)");
        s3.c.m(19, map2, "ER AAC LTP", 20, "ER AAC Scalable");
        s3.c.m(21, map2, "ER TwinVQ", 22, "ER BSAC");
        s3.c.m(23, map2, "ER AAC LD", 24, "ER CELP");
        s3.c.m(25, map2, "ER HVXC", 26, "ER HILN");
        s3.c.m(27, map2, "ER Parametric", 28, "SSC");
        s3.c.m(29, map2, "PS", 30, "MPEG Surround");
        s3.c.m(31, map2, "(escape)", 32, "Layer-1");
        s3.c.m(33, map2, "Layer-2", 34, "Layer-3");
        s3.c.m(35, map2, "DST", 36, "ALS");
        s3.c.m(37, map2, "SLS", 38, "SLS non-core");
        s3.c.m(39, map2, "ER AAC ELD", 40, "SMR Simple");
        map2.put(41, "SMR Main");
    }

    public static int c(c cVar) {
        int iA = cVar.a(5);
        return iA == 31 ? cVar.a(6) + 32 : iA;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int iA;
        int iA2;
        int i10;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.f48848b);
        byteBuffer.position(byteBuffer.position() + this.f48848b);
        byte[] bArr = new byte[this.f48848b];
        this.d = bArr;
        byteBufferSlice.get(bArr);
        byteBufferSlice.rewind();
        c cVar = new c(0, byteBufferSlice);
        this.f48827e = c(cVar);
        int iA3 = cVar.a(4);
        this.f48828f = iA3;
        int i11 = 15;
        if (iA3 == 15) {
            this.f48829g = cVar.a(24);
        }
        this.h = cVar.a(4);
        int i12 = this.f48827e;
        if (i12 == 5 || i12 == 29) {
            this.f48830i = 5;
            this.f48831j = true;
            if (i12 == 29) {
                this.f48832k = true;
            }
            int iA4 = cVar.a(4);
            this.f48833l = iA4;
            if (iA4 == 15) {
                this.f48834m = cVar.a(24);
            }
            int iC = c(cVar);
            this.f48827e = iC;
            if (iC == 22) {
                this.f48835n = cVar.a(4);
            }
        } else {
            this.f48830i = 0;
        }
        int i13 = this.f48827e;
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
                this.f48841t = cVar.a(1);
                int iA5 = cVar.a(1);
                this.f48842u = iA5;
                if (iA5 == 1) {
                    this.v = cVar.a(14);
                }
                this.f48843w = cVar.a(1);
                if (i14 == 0) {
                    throw new UnsupportedOperationException("can't parse program_config_element yet");
                }
                if (i13 == 6 || i13 == 20) {
                    this.f48844x = cVar.a(3);
                }
                if (this.f48843w == 1) {
                    if (i13 == 22) {
                        this.f48845y = cVar.a(5);
                        this.f48846z = cVar.a(11);
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
                int iA6 = cVar.a(1);
                this.F = iA6;
                if (iA6 == 1) {
                    int iA7 = cVar.a(2);
                    this.G = iA7;
                    if (iA7 != 1) {
                        this.I = cVar.a(1);
                        this.J = cVar.a(2);
                        int iA8 = cVar.a(1);
                        this.K = iA8;
                        if (iA8 == 1) {
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
                } else {
                    int iA9 = cVar.a(1);
                    this.R = iA9;
                    if (iA9 == 1) {
                        this.S = cVar.a(2);
                    }
                }
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f48836o = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f48837p = cVar.a(5);
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
                        boolean zB = cVar.b();
                        boolean zB2 = cVar.b();
                        if (zB) {
                            cVar.a(2);
                            cVar.b();
                            cVar.a(2);
                        }
                        if (zB2) {
                            cVar.a(2);
                            cVar.a(2);
                            cVar.b();
                        }
                        cVar.b();
                    }
                }
                while (cVar.a(4) != 0) {
                    int iA10 = cVar.a(4);
                    if (iA10 == i11) {
                        iA2 = cVar.a(8);
                        iA10 += iA2;
                    } else {
                        iA2 = 0;
                    }
                    if (iA2 == 255) {
                        iA10 += cVar.a(16);
                    }
                    for (int i17 = 0; i17 < iA10; i17++) {
                        cVar.a(8);
                    }
                    i11 = 15;
                }
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i18 = this.f48827e;
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
                    iA = cVar.a(2);
                    this.f48838q = iA;
                    if (iA != 2) {
                    }
                    throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
            }
        }
        iA = cVar.a(2);
        this.f48838q = iA;
        if (iA != 2 || iA == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (iA == 3) {
            int iA11 = cVar.a(1);
            this.f48839r = iA11;
            if (iA11 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.f48830i == 5 || (cVar.f48850a.limit() * 8) - cVar.f48852c < 16) {
            return;
        }
        int iA12 = cVar.a(11);
        this.f48840s = iA12;
        if (iA12 == 695) {
            int iC2 = c(cVar);
            this.f48830i = iC2;
            if (iC2 == 5) {
                boolean zB3 = cVar.b();
                this.f48831j = zB3;
                if (zB3) {
                    int iA13 = cVar.a(4);
                    this.f48833l = iA13;
                    if (iA13 == 15) {
                        this.f48834m = cVar.a(24);
                    }
                    if ((cVar.f48850a.limit() * 8) - cVar.f48852c >= 12) {
                        int iA14 = cVar.a(11);
                        this.f48840s = iA14;
                        if (iA14 == 1352) {
                            this.f48832k = cVar.b();
                        }
                    }
                }
            }
            if (this.f48830i == 22) {
                boolean zB4 = cVar.b();
                this.f48831j = zB4;
                if (zB4) {
                    int iA15 = cVar.a(4);
                    this.f48833l = iA15;
                    if (iA15 == 15) {
                        this.f48834m = cVar.a(24);
                    }
                }
                this.f48835n = cVar.a(4);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.B == aVar.B && this.A == aVar.A && this.C == aVar.C && this.f48827e == aVar.f48827e && this.h == aVar.h && this.v == aVar.v && this.f48842u == aVar.f48842u && this.f48839r == aVar.f48839r && this.f48838q == aVar.f48838q && this.K == aVar.K && this.f48830i == aVar.f48830i && this.f48835n == aVar.f48835n && this.f48843w == aVar.f48843w && this.D == aVar.D && this.f48834m == aVar.f48834m && this.f48833l == aVar.f48833l && this.f48837p == aVar.f48837p && this.f48841t == aVar.f48841t && this.E == aVar.E && this.Q == aVar.Q && this.R == aVar.R && this.S == aVar.S && this.P == aVar.P && this.N == aVar.N && this.M == aVar.M && this.O == aVar.O && this.J == aVar.J && this.I == aVar.I && this.F == aVar.F && this.f48844x == aVar.f48844x && this.f48846z == aVar.f48846z && this.f48845y == aVar.f48845y && this.H == aVar.H && this.G == aVar.G && this.T == aVar.T && this.f48832k == aVar.f48832k && this.f48836o == aVar.f48836o && this.f48829g == aVar.f48829g && this.f48828f == aVar.f48828f && this.f48831j == aVar.f48831j && this.f48840s == aVar.f48840s && this.L == aVar.L && Arrays.equals(this.d, aVar.d);
    }

    public final int hashCode() {
        byte[] bArr = this.d;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f48827e) * 31) + this.f48828f) * 31) + this.f48829g) * 31) + this.h) * 31) + this.f48830i) * 31) + (this.f48831j ? 1 : 0)) * 31) + (this.f48832k ? 1 : 0)) * 31) + this.f48833l) * 31) + this.f48834m) * 31) + this.f48835n) * 31) + this.f48836o) * 31) + this.f48837p) * 31) + this.f48838q) * 31) + this.f48839r) * 31) + this.f48840s) * 31) + this.f48841t) * 31) + this.f48842u) * 31) + this.v) * 31) + this.f48843w) * 31) + this.f48844x) * 31) + this.f48845y) * 31) + this.f48846z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb2.append(p2.b.c(0, this.d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f48827e);
        sb2.append(" (");
        Integer numValueOf = Integer.valueOf(this.f48827e);
        HashMap map = V;
        sb2.append((String) map.get(numValueOf));
        sb2.append("), samplingFrequencyIndex=");
        sb2.append(this.f48828f);
        sb2.append(" (");
        Integer numValueOf2 = Integer.valueOf(this.f48828f);
        HashMap map2 = U;
        sb2.append(map2.get(numValueOf2));
        sb2.append("), samplingFrequency=");
        sb2.append(this.f48829g);
        sb2.append(", channelConfiguration=");
        sb2.append(this.h);
        if (this.f48830i > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f48830i);
            sb2.append(" (");
            sb2.append((String) map.get(Integer.valueOf(this.f48830i)));
            sb2.append("), sbrPresentFlag=");
            sb2.append(this.f48831j);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f48832k);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f48833l);
            sb2.append(" (");
            sb2.append(map2.get(Integer.valueOf(this.f48833l)));
            sb2.append("), extensionSamplingFrequency=");
            sb2.append(this.f48834m);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f48835n);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f48840s);
        if (this.E) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f48841t);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f48842u);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.v);
            sb2.append(", extensionFlag=");
            sb2.append(this.f48843w);
            sb2.append(", layerNr=");
            sb2.append(this.f48844x);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f48845y);
            sb2.append(", layer_length=");
            sb2.append(this.f48846z);
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
