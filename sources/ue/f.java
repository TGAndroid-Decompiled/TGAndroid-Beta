package ue;

import h3.w1;
import java.io.EOFException;
import java.io.IOException;

public final class f {

    public final int f48539a = 1;

    public boolean f48540b;

    public int f48541c;
    public boolean d;

    public int f48542e;

    public boolean f48543f;

    public int f48544g;
    public Object h;

    public f(u2.b bVar) throws IOException {
        byte b10;
        byte b11;
        ve.a aVar = (ve.a) bVar.f48263c;
        long j10 = aVar.f4577b;
        n1.d dVar = (n1.d) bVar.f48262b;
        h hVar = (h) bVar.d;
        int i10 = hVar.f48547a;
        int i11 = hVar.f48547a;
        byte b12 = 2;
        if (i10 == 2) {
            dVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int i13 = ((com.google.firebase.messaging.d) dVar.f18088b).read(bArr, i12, 3 - i12);
                if (i13 <= 0) {
                    throw new EOFException();
                }
                i12 += i13;
            }
            this.h = new String(bArr, "ISO-8859-1");
        } else {
            dVar.getClass();
            byte[] bArr2 = new byte[4];
            int i14 = 0;
            while (i14 < 4) {
                int i15 = ((com.google.firebase.messaging.d) dVar.f18088b).read(bArr2, i14, 4 - i14);
                if (i15 <= 0) {
                    throw new EOFException();
                }
                i14 += i15;
            }
            this.h = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f48542e = ((dVar.a0() & 255) << 16) | ((dVar.a0() & 255) << 8) | (dVar.a0() & 255);
        } else if (i11 == 3) {
            this.f48542e = dVar.g0();
        } else {
            this.f48542e = dVar.n0();
        }
        if (i11 > 2) {
            dVar.a0();
            byte bA0 = dVar.a0();
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
            boolean z10 = (b13 & bA0) != 0;
            this.d = z10;
            this.f48540b = (b12 & bA0) != 0;
            boolean z11 = (bA0 & b14) != 0;
            this.f48543f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.f48544g = dVar.g0();
                    this.f48542e -= 4;
                }
                if (z11) {
                    dVar.a0();
                    this.f48542e--;
                }
                if ((bA0 & b10) != 0) {
                    dVar.a0();
                    this.f48542e--;
                }
            } else {
                if ((bA0 & b10) != 0) {
                    dVar.a0();
                    this.f48542e--;
                }
                if (z11) {
                    dVar.a0();
                    this.f48542e--;
                }
                if ((bA0 & b11) != 0) {
                    this.f48544g = dVar.n0();
                    this.f48542e -= 4;
                }
            }
        }
        this.f48541c = (int) (aVar.f4577b - j10);
    }

    public void a(int i10) {
        this.f48540b |= i10 > 0;
        this.f48541c += i10;
    }

    public String toString() {
        switch (this.f48539a) {
            case 0:
                return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), (String) this.h, Integer.valueOf(this.f48542e));
            default:
                return super.toString();
        }
    }

    public f(w1 w1Var) {
        this.h = w1Var;
    }
}
