package p3;

import d2.p0;
import d2.r0;
import d2.u;
import d2.u0;
import d2.v;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements r0 {
    public static final v f53137g;
    public static final v h;
    public final String f53138a;
    public final String f53139b;
    public final long f53140c;
    public final long d;
    public final byte[] f53141e;
    public int f53142f;

    static {
        u uVar = new u();
        uVar.f8431r = u0.n("application/id3");
        f53137g = new v(uVar);
        u uVar2 = new u();
        uVar2.f8431r = u0.n("application/x-scte35");
        h = new v(uVar2);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f53138a = str;
        this.f53139b = str2;
        this.f53140c = j10;
        this.d = j11;
        this.f53141e = bArr;
    }

    @Override
    public final v b() {
        String str = this.f53138a;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c2 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return h;
            case 1:
            case 2:
                return f53137g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (b() != null) {
            return this.f53141e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f53140c == aVar.f53140c && this.d == aVar.d && Objects.equals(this.f53138a, aVar.f53138a) && Objects.equals(this.f53139b, aVar.f53139b) && Arrays.equals(this.f53141e, aVar.f53141e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        if (this.f53142f == 0) {
            int i10 = 0;
            String str = this.f53138a;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (527 + i3) * 31;
            String str2 = this.f53139b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f53140c;
            long j11 = this.d;
            this.f53142f = Arrays.hashCode(this.f53141e) + ((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f53142f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f53138a + ", id=" + this.d + ", durationMs=" + this.f53140c + ", value=" + this.f53139b;
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
