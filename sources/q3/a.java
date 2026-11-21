package q3;

import e2.n0;
import e2.p0;
import e2.s0;
import e2.t;
import e2.u;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements p0 {
    public static final u f55822g;
    public static final u h;
    public final String f55823a;
    public final String f55824b;
    public final long f55825c;
    public final long d;
    public final byte[] f55826e;
    public int f55827f;

    static {
        t tVar = new t();
        tVar.f10743r = s0.n("application/id3");
        f55822g = new u(tVar);
        t tVar2 = new t();
        tVar2.f10743r = s0.n("application/x-scte35");
        h = new u(tVar2);
    }

    public a(String str, String str2, long j3, long j10, byte[] bArr) {
        this.f55823a = str;
        this.f55824b = str2;
        this.f55825c = j3;
        this.d = j10;
        this.f55826e = bArr;
    }

    @Override
    public final u a() {
        String str = this.f55823a;
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
                return f55822g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (a() != null) {
            return this.f55826e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f55825c == aVar.f55825c && this.d == aVar.d && Objects.equals(this.f55823a, aVar.f55823a) && Objects.equals(this.f55824b, aVar.f55824b) && Arrays.equals(this.f55826e, aVar.f55826e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        if (this.f55827f == 0) {
            int i10 = 0;
            String str = this.f55823a;
            if (str != null) {
                i7 = str.hashCode();
            } else {
                i7 = 0;
            }
            int i11 = (527 + i7) * 31;
            String str2 = this.f55824b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j3 = this.f55825c;
            long j10 = this.d;
            this.f55827f = Arrays.hashCode(this.f55826e) + ((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f55827f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f55823a + ", id=" + this.d + ", durationMs=" + this.f55825c + ", value=" + this.f55824b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
