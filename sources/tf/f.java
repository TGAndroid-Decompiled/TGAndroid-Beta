package tf;

import java.io.EOFException;
import org.telegram.ui.Components.vy;
import org.telegram.ui.ky0;
public final class f {
    public final String f55542a;
    public final int f55543b;
    public final int f55544c;
    public final boolean d;
    public final boolean f55545e;
    public final boolean f55546f;
    public final int f55547g;

    public f(ky0 ky0Var) {
        byte b10;
        byte b11;
        boolean z9;
        boolean z10;
        uf.a aVar = (uf.a) ky0Var.f47422b;
        long j3 = aVar.f915b;
        vy vyVar = (vy) ky0Var.d;
        h hVar = (h) ky0Var.f47423c;
        int i7 = hVar.f55550a;
        int i10 = hVar.f55550a;
        byte b12 = 2;
        if (i7 == 2) {
            vyVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) vyVar.f39835b).read(bArr, i11, 3 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f55542a = new String(bArr, "ISO-8859-1");
        } else {
            vyVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) vyVar.f39835b).read(bArr2, i12, 4 - i12);
                if (read2 > 0) {
                    i12 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f55542a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f55544c = ((vyVar.M() & 255) << 16) | ((vyVar.M() & 255) << 8) | (vyVar.M() & 255);
        } else if (i10 == 3) {
            this.f55544c = vyVar.O();
        } else {
            this.f55544c = vyVar.P();
        }
        if (i10 > 2) {
            vyVar.M();
            byte M = vyVar.M();
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
            this.f55545e = z9;
            if ((b12 & M) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.d = z10;
            boolean z11 = (M & b14) != 0;
            this.f55546f = z11;
            if (i10 == 3) {
                if (z9) {
                    this.f55547g = vyVar.O();
                    this.f55544c -= 4;
                }
                if (z11) {
                    vyVar.M();
                    this.f55544c--;
                }
                if ((M & b10) != 0) {
                    vyVar.M();
                    this.f55544c--;
                }
            } else {
                if ((M & b10) != 0) {
                    vyVar.M();
                    this.f55544c--;
                }
                if (z11) {
                    vyVar.M();
                    this.f55544c--;
                }
                if ((M & b11) != 0) {
                    this.f55547g = vyVar.P();
                    this.f55544c -= 4;
                }
            }
        }
        this.f55543b = (int) (aVar.f915b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f55542a, Integer.valueOf(this.f55544c));
    }
}
