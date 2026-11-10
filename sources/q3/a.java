package q3;

import e2.n0;
import e2.p0;
import e2.s0;
import e2.t;
import e2.u;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements p0 {
    public static final u f53770g;
    public static final u h;
    public final String f53771a;
    public final String f53772b;
    public final long f53773c;
    public final long d;
    public final byte[] f53774e;
    public int f53775f;

    static {
        t tVar = new t();
        tVar.f10568r = s0.n("application/id3");
        f53770g = new u(tVar);
        t tVar2 = new t();
        tVar2.f10568r = s0.n("application/x-scte35");
        h = new u(tVar2);
    }

    public a(String str, String str2, long j3, long j10, byte[] bArr) {
        this.f53771a = str;
        this.f53772b = str2;
        this.f53773c = j3;
        this.d = j10;
        this.f53774e = bArr;
    }

    @Override
    public final u a() {
        String str = this.f53771a;
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
                return f53770g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (a() != null) {
            return this.f53774e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f53773c == aVar.f53773c && this.d == aVar.d && Objects.equals(this.f53771a, aVar.f53771a) && Objects.equals(this.f53772b, aVar.f53772b) && Arrays.equals(this.f53774e, aVar.f53774e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        if (this.f53775f == 0) {
            int i10 = 0;
            String str = this.f53771a;
            if (str != null) {
                i7 = str.hashCode();
            } else {
                i7 = 0;
            }
            int i11 = (527 + i7) * 31;
            String str2 = this.f53772b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j3 = this.f53773c;
            long j10 = this.d;
            this.f53775f = Arrays.hashCode(this.f53774e) + ((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f53775f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f53771a + ", id=" + this.d + ", durationMs=" + this.f53773c + ", value=" + this.f53772b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
