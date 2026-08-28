package te;

import h3.w1;
import java.io.EOFException;
import n2.p;
public final class f {
    public final int f47817a = 1;
    public boolean f47818b;
    public int f47819c;
    public boolean d;
    public int f47820e;
    public boolean f47821f;
    public int f47822g;
    public Object h;

    public f(t5.c cVar) {
        byte b10;
        byte b11;
        ue.a aVar = (ue.a) cVar.f47682b;
        long j10 = aVar.f4135b;
        p pVar = (p) cVar.d;
        h hVar = (h) cVar.f47683c;
        int i9 = hVar.f47825a;
        int i10 = hVar.f47825a;
        byte b12 = 2;
        if (i9 == 2) {
            pVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((com.google.firebase.messaging.d) pVar.f18343b).read(bArr, i11, 3 - i11);
                if (read <= 0) {
                    throw new EOFException();
                }
                i11 += read;
            }
            this.h = new String(bArr, "ISO-8859-1");
        } else {
            pVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((com.google.firebase.messaging.d) pVar.f18343b).read(bArr2, i12, 4 - i12);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i12 += read2;
            }
            this.h = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f47820e = ((pVar.L() & 255) << 16) | ((pVar.L() & 255) << 8) | (pVar.L() & 255);
        } else if (i10 == 3) {
            this.f47820e = pVar.M();
        } else {
            this.f47820e = pVar.N();
        }
        if (i10 > 2) {
            pVar.L();
            byte L = pVar.L();
            byte b14 = 64;
            if (i10 == 3) {
                b13 = 128;
                b12 = 0;
                b10 = 32;
                b11 = 0;
            } else {
                b14 = 4;
                b10 = 64;
                b11 = 1;
            }
            boolean z10 = (b13 & L) != 0;
            this.d = z10;
            this.f47818b = (b12 & L) != 0;
            boolean z11 = (L & b14) != 0;
            this.f47821f = z11;
            if (i10 == 3) {
                if (z10) {
                    this.f47822g = pVar.M();
                    this.f47820e -= 4;
                }
                if (z11) {
                    pVar.L();
                    this.f47820e--;
                }
                if ((L & b10) != 0) {
                    pVar.L();
                    this.f47820e--;
                }
            } else {
                if ((L & b10) != 0) {
                    pVar.L();
                    this.f47820e--;
                }
                if (z11) {
                    pVar.L();
                    this.f47820e--;
                }
                if ((L & b11) != 0) {
                    this.f47822g = pVar.N();
                    this.f47820e -= 4;
                }
            }
        }
        this.f47819c = (int) (aVar.f4135b - j10);
    }

    public void a(int i9) {
        boolean z10;
        boolean z11 = this.f47818b;
        if (i9 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47818b = z11 | z10;
        this.f47819c += i9;
    }

    public String toString() {
        switch (this.f47817a) {
            case 0:
                return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), (String) this.h, Integer.valueOf(this.f47820e));
            default:
                return super.toString();
        }
    }

    public f(w1 w1Var) {
        this.h = w1Var;
    }
}
