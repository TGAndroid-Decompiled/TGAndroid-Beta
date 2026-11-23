package q3;

import e2.n0;
import e2.p0;
import e2.s0;
import e2.t;
import e2.u;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements p0 {
    public static final u f55791g;
    public static final u h;
    public final String f55792a;
    public final String f55793b;
    public final long f55794c;
    public final long d;
    public final byte[] f55795e;
    public int f55796f;

    static {
        t tVar = new t();
        tVar.f10709r = s0.n("application/id3");
        f55791g = new u(tVar);
        t tVar2 = new t();
        tVar2.f10709r = s0.n("application/x-scte35");
        h = new u(tVar2);
    }

    public a(String str, String str2, long j3, long j10, byte[] bArr) {
        this.f55792a = str;
        this.f55793b = str2;
        this.f55794c = j3;
        this.d = j10;
        this.f55795e = bArr;
    }

    @Override
    public final u a() {
        String str = this.f55792a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return h;
            case 1:
            case 2:
                return f55791g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (a() != null) {
            return this.f55795e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f55794c == aVar.f55794c && this.d == aVar.d && Objects.equals(this.f55792a, aVar.f55792a) && Objects.equals(this.f55793b, aVar.f55793b) && Arrays.equals(this.f55795e, aVar.f55795e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        if (this.f55796f == 0) {
            int i10 = 0;
            String str = this.f55792a;
            if (str != null) {
                i7 = str.hashCode();
            } else {
                i7 = 0;
            }
            int i11 = (527 + i7) * 31;
            String str2 = this.f55793b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j3 = this.f55794c;
            long j10 = this.d;
            this.f55796f = Arrays.hashCode(this.f55795e) + ((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f55796f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f55792a + ", id=" + this.d + ", durationMs=" + this.f55794c + ", value=" + this.f55793b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
