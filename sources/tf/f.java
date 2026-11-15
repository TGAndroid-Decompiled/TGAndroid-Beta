package tf;

import java.io.EOFException;
import org.telegram.messenger.ou;
import org.telegram.ui.ld0;
public final class f {
    public final String f57124a;
    public final int f57125b;
    public final int f57126c;
    public final boolean d;
    public final boolean f57127e;
    public final boolean f57128f;
    public final int f57129g;

    public f(ld0 ld0Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        uf.a aVar = (uf.a) ld0Var.f48976b;
        long j3 = aVar.f913b;
        ou ouVar = (ou) ld0Var.d;
        h hVar = (h) ld0Var.f48977c;
        int i7 = hVar.f57132a;
        int i10 = hVar.f57132a;
        byte b12 = 2;
        if (i7 == 2) {
            ouVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) ouVar.f25804b).read(bArr, i11, 3 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f57124a = new String(bArr, "ISO-8859-1");
        } else {
            ouVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) ouVar.f25804b).read(bArr2, i12, 4 - i12);
                if (read2 > 0) {
                    i12 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f57124a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f57126c = ((ouVar.g1() & 255) << 16) | ((ouVar.g1() & 255) << 8) | (ouVar.g1() & 255);
        } else if (i10 == 3) {
            this.f57126c = ouVar.h1();
        } else {
            this.f57126c = ouVar.j1();
        }
        if (i10 > 2) {
            ouVar.g1();
            byte g12 = ouVar.g1();
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
            if ((b13 & g12) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f57127e = z10;
            if ((b12 & g12) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (g12 & b14) != 0;
            this.f57128f = z12;
            if (i10 == 3) {
                if (z10) {
                    this.f57129g = ouVar.h1();
                    this.f57126c -= 4;
                }
                if (z12) {
                    ouVar.g1();
                    this.f57126c--;
                }
                if ((g12 & b10) != 0) {
                    ouVar.g1();
                    this.f57126c--;
                }
            } else {
                if ((g12 & b10) != 0) {
                    ouVar.g1();
                    this.f57126c--;
                }
                if (z12) {
                    ouVar.g1();
                    this.f57126c--;
                }
                if ((g12 & b11) != 0) {
                    this.f57129g = ouVar.j1();
                    this.f57126c -= 4;
                }
            }
        }
        this.f57125b = (int) (aVar.f913b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f57124a, Integer.valueOf(this.f57126c));
    }
}
