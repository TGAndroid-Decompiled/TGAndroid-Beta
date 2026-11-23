package tf;

import java.io.EOFException;
import org.telegram.ui.Components.jn;
import org.telegram.ui.md0;
public final class f {
    public final String f57708a;
    public final int f57709b;
    public final int f57710c;
    public final boolean d;
    public final boolean f57711e;
    public final boolean f57712f;
    public final int f57713g;

    public f(md0 md0Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        uf.a aVar = (uf.a) md0Var.f49830b;
        long j3 = aVar.f912b;
        jn jnVar = (jn) md0Var.d;
        h hVar = (h) md0Var.f49831c;
        int i7 = hVar.f57716a;
        int i10 = hVar.f57716a;
        byte b12 = 2;
        if (i7 == 2) {
            jnVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) jnVar.f36522b).read(bArr, i11, 3 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f57708a = new String(bArr, "ISO-8859-1");
        } else {
            jnVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) jnVar.f36522b).read(bArr2, i12, 4 - i12);
                if (read2 > 0) {
                    i12 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f57708a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f57710c = ((jnVar.Q() & 255) << 16) | ((jnVar.Q() & 255) << 8) | (jnVar.Q() & 255);
        } else if (i10 == 3) {
            this.f57710c = jnVar.R();
        } else {
            this.f57710c = jnVar.S();
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
            this.f57711e = z10;
            if ((b12 & Q) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (Q & b14) != 0;
            this.f57712f = z12;
            if (i10 == 3) {
                if (z10) {
                    this.f57713g = jnVar.R();
                    this.f57710c -= 4;
                }
                if (z12) {
                    jnVar.Q();
                    this.f57710c--;
                }
                if ((Q & b10) != 0) {
                    jnVar.Q();
                    this.f57710c--;
                }
            } else {
                if ((Q & b10) != 0) {
                    jnVar.Q();
                    this.f57710c--;
                }
                if (z12) {
                    jnVar.Q();
                    this.f57710c--;
                }
                if ((Q & b11) != 0) {
                    this.f57713g = jnVar.S();
                    this.f57710c -= 4;
                }
            }
        }
        this.f57709b = (int) (aVar.f912b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f57708a, Integer.valueOf(this.f57710c));
    }
}
