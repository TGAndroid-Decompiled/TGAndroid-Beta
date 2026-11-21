package tf;

import java.io.EOFException;
import org.telegram.ui.Components.jn;
import org.telegram.ui.md0;
public final class f {
    public final String f57739a;
    public final int f57740b;
    public final int f57741c;
    public final boolean d;
    public final boolean f57742e;
    public final boolean f57743f;
    public final int f57744g;

    public f(md0 md0Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        uf.a aVar = (uf.a) md0Var.f49853b;
        long j3 = aVar.f912b;
        jn jnVar = (jn) md0Var.d;
        h hVar = (h) md0Var.f49854c;
        int i7 = hVar.f57747a;
        int i10 = hVar.f57747a;
        byte b12 = 2;
        if (i7 == 2) {
            jnVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) jnVar.f36572b).read(bArr, i11, 3 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f57739a = new String(bArr, "ISO-8859-1");
        } else {
            jnVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) jnVar.f36572b).read(bArr2, i12, 4 - i12);
                if (read2 > 0) {
                    i12 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f57739a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f57741c = ((jnVar.Q() & 255) << 16) | ((jnVar.Q() & 255) << 8) | (jnVar.Q() & 255);
        } else if (i10 == 3) {
            this.f57741c = jnVar.R();
        } else {
            this.f57741c = jnVar.S();
        }
        if (i10 > 2) {
            jnVar.Q();
            byte Q = jnVar.Q();
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
            if ((b13 & Q) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f57742e = z10;
            if ((b12 & Q) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (Q & b14) != 0;
            this.f57743f = z12;
            if (i10 == 3) {
                if (z10) {
                    this.f57744g = jnVar.R();
                    this.f57741c -= 4;
                }
                if (z12) {
                    jnVar.Q();
                    this.f57741c--;
                }
                if ((Q & b10) != 0) {
                    jnVar.Q();
                    this.f57741c--;
                }
            } else {
                if ((Q & b10) != 0) {
                    jnVar.Q();
                    this.f57741c--;
                }
                if (z12) {
                    jnVar.Q();
                    this.f57741c--;
                }
                if ((Q & b11) != 0) {
                    this.f57744g = jnVar.S();
                    this.f57741c -= 4;
                }
            }
        }
        this.f57740b = (int) (aVar.f912b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f57739a, Integer.valueOf(this.f57741c));
    }
}
