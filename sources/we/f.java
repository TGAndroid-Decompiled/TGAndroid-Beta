package we;

import j3.w1;
import java.io.EOFException;
import org.telegram.ui.Components.n;
public final class f {
    public final int f49866a = 1;
    public boolean f49867b;
    public int f49868c;
    public boolean d;
    public int f49869e;
    public boolean f49870f;
    public int f49871g;
    public Object h;

    public f(v5.c cVar) {
        byte b10;
        byte b11;
        xe.a aVar = (xe.a) cVar.f49409b;
        long j10 = aVar.f5149b;
        n nVar = (n) cVar.d;
        h hVar = (h) cVar.f49410c;
        int i10 = hVar.f49874a;
        int i11 = hVar.f49874a;
        byte b12 = 2;
        if (i10 == 2) {
            nVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) nVar.f30787b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.h = new String(bArr, "ISO-8859-1");
        } else {
            nVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) nVar.f30787b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.h = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f49869e = ((nVar.o() & 255) << 16) | ((nVar.o() & 255) << 8) | (nVar.o() & 255);
        } else if (i11 == 3) {
            this.f49869e = nVar.p();
        } else {
            this.f49869e = nVar.r();
        }
        if (i11 > 2) {
            nVar.o();
            byte o10 = nVar.o();
            byte b14 = 64;
            if (i11 == 3) {
                b13 = 128;
                b12 = 0;
                b10 = 32;
                b11 = 0;
            } else {
                b14 = 4;
                b10 = 64;
                b11 = 1;
            }
            boolean z10 = (b13 & o10) != 0;
            this.d = z10;
            this.f49867b = (b12 & o10) != 0;
            boolean z11 = (o10 & b14) != 0;
            this.f49870f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.f49871g = nVar.p();
                    this.f49869e -= 4;
                }
                if (z11) {
                    nVar.o();
                    this.f49869e--;
                }
                if ((o10 & b10) != 0) {
                    nVar.o();
                    this.f49869e--;
                }
            } else {
                if ((o10 & b10) != 0) {
                    nVar.o();
                    this.f49869e--;
                }
                if (z11) {
                    nVar.o();
                    this.f49869e--;
                }
                if ((o10 & b11) != 0) {
                    this.f49871g = nVar.r();
                    this.f49869e -= 4;
                }
            }
        }
        this.f49868c = (int) (aVar.f5149b - j10);
    }

    public void a(int i10) {
        boolean z10;
        boolean z11 = this.f49867b;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49867b = z11 | z10;
        this.f49868c += i10;
    }

    public String toString() {
        switch (this.f49866a) {
            case 0:
                return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), (String) this.h, Integer.valueOf(this.f49869e));
            default:
                return super.toString();
        }
    }

    public f(w1 w1Var) {
        this.h = w1Var;
    }
}
