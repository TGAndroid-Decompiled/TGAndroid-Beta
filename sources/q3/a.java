package q3;

import e2.n0;
import e2.p0;
import e2.s0;
import e2.t;
import e2.u;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements p0 {
    public static final u f55781g;
    public static final u h;
    public final String f55782a;
    public final String f55783b;
    public final long f55784c;
    public final long d;
    public final byte[] f55785e;
    public int f55786f;

    static {
        t tVar = new t();
        tVar.f10717r = s0.n("application/id3");
        f55781g = new u(tVar);
        t tVar2 = new t();
        tVar2.f10717r = s0.n("application/x-scte35");
        h = new u(tVar2);
    }

    public a(String str, String str2, long j3, long j10, byte[] bArr) {
        this.f55782a = str;
        this.f55783b = str2;
        this.f55784c = j3;
        this.d = j10;
        this.f55785e = bArr;
    }

    @Override
    public final u a() {
        String str = this.f55782a;
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
                return f55781g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (a() != null) {
            return this.f55785e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f55784c == aVar.f55784c && this.d == aVar.d && Objects.equals(this.f55782a, aVar.f55782a) && Objects.equals(this.f55783b, aVar.f55783b) && Arrays.equals(this.f55785e, aVar.f55785e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        if (this.f55786f == 0) {
            int i10 = 0;
            String str = this.f55782a;
            if (str != null) {
                i7 = str.hashCode();
            } else {
                i7 = 0;
            }
            int i11 = (527 + i7) * 31;
            String str2 = this.f55783b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j3 = this.f55784c;
            long j10 = this.d;
            this.f55786f = Arrays.hashCode(this.f55785e) + ((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f55786f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f55782a + ", id=" + this.d + ", durationMs=" + this.f55784c + ", value=" + this.f55783b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
