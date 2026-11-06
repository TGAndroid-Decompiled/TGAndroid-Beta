package tf;

import java.io.EOFException;
import org.telegram.ui.Components.uy;
import org.telegram.ui.hy0;
public final class f {
    public final String f55437a;
    public final int f55438b;
    public final int f55439c;
    public final boolean d;
    public final boolean f55440e;
    public final boolean f55441f;
    public final int f55442g;

    public f(hy0 hy0Var) {
        byte b10;
        byte b11;
        boolean z9;
        boolean z10;
        uf.a aVar = (uf.a) hy0Var.f46527b;
        long j3 = aVar.f915b;
        uy uyVar = (uy) hy0Var.d;
        h hVar = (h) hy0Var.f46528c;
        int i7 = hVar.f55445a;
        int i10 = hVar.f55445a;
        byte b12 = 2;
        if (i7 == 2) {
            uyVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) uyVar.f38750b).read(bArr, i11, 3 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f55437a = new String(bArr, "ISO-8859-1");
        } else {
            uyVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) uyVar.f38750b).read(bArr2, i12, 4 - i12);
                if (read2 > 0) {
                    i12 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f55437a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f55439c = ((uyVar.M() & 255) << 16) | ((uyVar.M() & 255) << 8) | (uyVar.M() & 255);
        } else if (i10 == 3) {
            this.f55439c = uyVar.O();
        } else {
            this.f55439c = uyVar.P();
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
            this.f55440e = z9;
            if ((b12 & M) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.d = z10;
            boolean z11 = (M & b14) != 0;
            this.f55441f = z11;
            if (i10 == 3) {
                if (z9) {
                    this.f55442g = uyVar.O();
                    this.f55439c -= 4;
                }
                if (z11) {
                    uyVar.M();
                    this.f55439c--;
                }
                if ((M & b10) != 0) {
                    uyVar.M();
                    this.f55439c--;
                }
            } else {
                if ((M & b10) != 0) {
                    uyVar.M();
                    this.f55439c--;
                }
                if (z11) {
                    uyVar.M();
                    this.f55439c--;
                }
                if ((M & b11) != 0) {
                    this.f55442g = uyVar.P();
                    this.f55439c -= 4;
                }
            }
        }
        this.f55438b = (int) (aVar.f915b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f55437a, Integer.valueOf(this.f55439c));
    }
}
