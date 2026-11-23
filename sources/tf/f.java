package tf;

import java.io.EOFException;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nd0;
public final class f {
    public final String f57822a;
    public final int f57823b;
    public final int f57824c;
    public final boolean d;
    public final boolean f57825e;
    public final boolean f57826f;
    public final int f57827g;

    public f(i61 i61Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        uf.a aVar = (uf.a) i61Var.f35958b;
        long j3 = aVar.f912b;
        nd0 nd0Var = (nd0) i61Var.d;
        h hVar = (h) i61Var.f35959c;
        int i7 = hVar.f57830a;
        int i10 = hVar.f57830a;
        byte b12 = 2;
        if (i7 == 2) {
            nd0Var.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) nd0Var.f37766b).read(bArr, i11, 3 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f57822a = new String(bArr, "ISO-8859-1");
        } else {
            nd0Var.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) nd0Var.f37766b).read(bArr2, i12, 4 - i12);
                if (read2 > 0) {
                    i12 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f57822a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f57824c = ((nd0Var.v() & 255) << 16) | ((nd0Var.v() & 255) << 8) | (nd0Var.v() & 255);
        } else if (i10 == 3) {
            this.f57824c = nd0Var.y();
        } else {
            this.f57824c = nd0Var.A();
        }
        if (i10 > 2) {
            nd0Var.v();
            byte v = nd0Var.v();
            byte b14 = 64;
            if (i10 == 3) {
                b13 = 128;
                b11 = 0;
                b10 = 32;
                b12 = 0;
            } else {
                b10 = 64;
                b11 = 1;
                b14 = 4;
            }
            if ((b13 & v) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f57825e = z10;
            if ((b12 & v) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (v & b14) != 0;
            this.f57826f = z12;
            if (i10 == 3) {
                if (z10) {
                    this.f57827g = nd0Var.y();
                    this.f57824c -= 4;
                }
                if (z12) {
                    nd0Var.v();
                    this.f57824c--;
                }
                if ((v & b10) != 0) {
                    nd0Var.v();
                    this.f57824c--;
                }
            } else {
                if ((v & b10) != 0) {
                    nd0Var.v();
                    this.f57824c--;
                }
                if (z12) {
                    nd0Var.v();
                    this.f57824c--;
                }
                if ((v & b11) != 0) {
                    this.f57827g = nd0Var.A();
                    this.f57824c -= 4;
                }
            }
        }
        this.f57823b = (int) (aVar.f912b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f57822a, Integer.valueOf(this.f57824c));
    }
}
