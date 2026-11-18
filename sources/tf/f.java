package tf;

import java.io.EOFException;
import org.telegram.ui.Components.hn;
import org.telegram.ui.nd0;
public final class f {
    public final String f57700a;
    public final int f57701b;
    public final int f57702c;
    public final boolean d;
    public final boolean f57703e;
    public final boolean f57704f;
    public final int f57705g;

    public f(nd0 nd0Var) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        uf.a aVar = (uf.a) nd0Var.f50148b;
        long j3 = aVar.f912b;
        hn hnVar = (hn) nd0Var.d;
        h hVar = (h) nd0Var.f50149c;
        int i7 = hVar.f57708a;
        int i10 = hVar.f57708a;
        byte b12 = 2;
        if (i7 == 2) {
            hnVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((ab.d) hnVar.f35933b).read(bArr, i11, 3 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f57700a = new String(bArr, "ISO-8859-1");
        } else {
            hnVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((ab.d) hnVar.f35933b).read(bArr2, i12, 4 - i12);
                if (read2 > 0) {
                    i12 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f57700a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f57702c = ((hnVar.Q() & 255) << 16) | ((hnVar.Q() & 255) << 8) | (hnVar.Q() & 255);
        } else if (i10 == 3) {
            this.f57702c = hnVar.R();
        } else {
            this.f57702c = hnVar.S();
        }
        if (i10 > 2) {
            hnVar.Q();
            byte Q = hnVar.Q();
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
            this.f57703e = z10;
            if ((b12 & Q) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (Q & b14) != 0;
            this.f57704f = z12;
            if (i10 == 3) {
                if (z10) {
                    this.f57705g = hnVar.R();
                    this.f57702c -= 4;
                }
                if (z12) {
                    hnVar.Q();
                    this.f57702c--;
                }
                if ((Q & b10) != 0) {
                    hnVar.Q();
                    this.f57702c--;
                }
            } else {
                if ((Q & b10) != 0) {
                    hnVar.Q();
                    this.f57702c--;
                }
                if (z12) {
                    hnVar.Q();
                    this.f57702c--;
                }
                if ((Q & b11) != 0) {
                    this.f57705g = hnVar.S();
                    this.f57702c -= 4;
                }
            }
        }
        this.f57701b = (int) (aVar.f912b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f57700a, Integer.valueOf(this.f57702c));
    }
}
