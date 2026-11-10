package tf;

import java.io.EOFException;
import org.telegram.ui.Components.uy;
import org.telegram.ui.ly0;
public final class f {
    public final String f55541a;
    public final int f55542b;
    public final int f55543c;
    public final boolean d;
    public final boolean f55544e;
    public final boolean f55545f;
    public final int f55546g;

    public f(ly0 ly0Var) {
        byte b10;
        byte b11;
        boolean z9;
        boolean z10;
        uf.a aVar = (uf.a) ly0Var.f47746b;
        long j3 = aVar.f915b;
        uy uyVar = (uy) ly0Var.d;
        h hVar = (h) ly0Var.f47747c;
        int i7 = hVar.f55549a;
        int i10 = hVar.f55549a;
        byte b12 = 2;
        if (i7 == 2) {
            uyVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) uyVar.f38776b).read(bArr, i11, 3 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f55541a = new String(bArr, "ISO-8859-1");
        } else {
            uyVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) uyVar.f38776b).read(bArr2, i12, 4 - i12);
                if (read2 > 0) {
                    i12 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f55541a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f55543c = ((uyVar.M() & 255) << 16) | ((uyVar.M() & 255) << 8) | (uyVar.M() & 255);
        } else if (i10 == 3) {
            this.f55543c = uyVar.O();
        } else {
            this.f55543c = uyVar.P();
        }
        if (i10 > 2) {
            uyVar.M();
            byte M = uyVar.M();
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
            if ((b13 & M) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f55544e = z9;
            if ((b12 & M) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.d = z10;
            boolean z11 = (M & b14) != 0;
            this.f55545f = z11;
            if (i10 == 3) {
                if (z9) {
                    this.f55546g = uyVar.O();
                    this.f55543c -= 4;
                }
                if (z11) {
                    uyVar.M();
                    this.f55543c--;
                }
                if ((M & b10) != 0) {
                    uyVar.M();
                    this.f55543c--;
                }
            } else {
                if ((M & b10) != 0) {
                    uyVar.M();
                    this.f55543c--;
                }
                if (z11) {
                    uyVar.M();
                    this.f55543c--;
                }
                if ((M & b11) != 0) {
                    this.f55546g = uyVar.P();
                    this.f55543c -= 4;
                }
            }
        }
        this.f55542b = (int) (aVar.f915b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f55541a, Integer.valueOf(this.f55543c));
    }
}
