package q4;

import f5.d0;
import j3.s0;
import j3.t0;
import j7.l1;
import java.io.EOFException;
import java.util.Arrays;
import o3.w;
public final class p implements w {
    public static final t0 f46314f;
    public static final t0 f46315g;
    public final w f46316a;
    public final t0 f46317b;
    public t0 f46318c;
    public byte[] d;
    public int f46319e;

    static {
        s0 s0Var = new s0();
        s0Var.f10742o = "application/id3";
        f46314f = new t0(s0Var);
        s0 s0Var2 = new s0();
        s0Var2.f10742o = "application/x-emsg";
        f46315g = new t0(s0Var2);
    }

    public p(w wVar, int i10) {
        this.f46316a = wVar;
        if (i10 != 1) {
            if (i10 == 3) {
                this.f46317b = f46315g;
            } else {
                throw new IllegalArgumentException(l1.k(i10, "Unknown metadataType: "));
            }
        } else {
            this.f46317b = f46314f;
        }
        this.d = new byte[0];
        this.f46319e = 0;
    }

    @Override
    public final int a(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        int i11 = this.f46319e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = jVar.read(this.d, this.f46319e, i10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        this.f46319e += read;
        return read;
    }

    @Override
    public final void b(t0 t0Var) {
        this.f46318c = t0Var;
        this.f46316a.b(this.f46317b);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, o3.v vVar) {
        this.f46318c.getClass();
        int i13 = this.f46319e - i12;
        f5.w wVar = new f5.w(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f46319e = i12;
        String str = this.f46318c.B;
        t0 t0Var = this.f46317b;
        String str2 = t0Var.B;
        String str3 = t0Var.B;
        if (!d0.a(str, str2)) {
            if ("application/x-emsg".equals(this.f46318c.B)) {
                d4.a c3 = c4.b.c(wVar);
                t0 wrappedMetadataFormat = c3.getWrappedMetadataFormat();
                if (wrappedMetadataFormat != null && d0.a(str3, wrappedMetadataFormat.B)) {
                    byte[] wrappedMetadataBytes = c3.getWrappedMetadataBytes();
                    wrappedMetadataBytes.getClass();
                    wVar = new f5.w(wrappedMetadataBytes);
                } else {
                    t0 wrappedMetadataFormat2 = c3.getWrappedMetadataFormat();
                    f5.a.K("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + wrappedMetadataFormat2);
                    return;
                }
            } else {
                f5.a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f46318c.B);
                return;
            }
        }
        int a2 = wVar.a();
        w wVar2 = this.f46316a;
        wVar2.e(a2, wVar);
        wVar2.c(j10, i10, a2, i12, vVar);
    }

    @Override
    public final void d(int i10, f5.w wVar) {
        int i11 = this.f46319e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        wVar.c(this.f46319e, i10, this.d);
        this.f46319e += i10;
    }

    @Override
    public final void e(int i10, f5.w wVar) {
        l1.a(this, wVar, i10);
    }
}
