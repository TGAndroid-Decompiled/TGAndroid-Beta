package xe;

import j3.u1;
import java.io.EOFException;
public final class g {
    public final int f46996a = 1;
    public boolean f46997b;
    public int f46998c;
    public boolean d;
    public int e;
    public boolean f46999f;
    public int f47000g;
    public Object h;

    public g(s5.m mVar) {
        byte b10;
        byte b11;
        ye.a aVar = (ye.a) mVar.f44153b;
        long j10 = aVar.f3975b;
        b bVar = (b) mVar.d;
        i iVar = (i) mVar.f44154c;
        int i10 = iVar.f47003a;
        int i11 = iVar.f47003a;
        byte b12 = 2;
        if (i10 == 2) {
            bVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) bVar.f46987a).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.h = new String(bArr, "ISO-8859-1");
        } else {
            bVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) bVar.f46987a).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.h = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.e = ((bVar.a() & 255) << 16) | ((bVar.a() & 255) << 8) | (bVar.a() & 255);
        } else if (i11 == 3) {
            this.e = bVar.b();
        } else {
            this.e = bVar.c();
        }
        if (i11 > 2) {
            bVar.a();
            byte a2 = bVar.a();
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
            boolean z4 = (b13 & a2) != 0;
            this.d = z4;
            this.f46997b = (b12 & a2) != 0;
            boolean z10 = (a2 & b14) != 0;
            this.f46999f = z10;
            if (i11 == 3) {
                if (z4) {
                    this.f47000g = bVar.b();
                    this.e -= 4;
                }
                if (z10) {
                    bVar.a();
                    this.e--;
                }
                if ((a2 & b10) != 0) {
                    bVar.a();
                    this.e--;
                }
            } else {
                if ((a2 & b10) != 0) {
                    bVar.a();
                    this.e--;
                }
                if (z10) {
                    bVar.a();
                    this.e--;
                }
                if ((a2 & b11) != 0) {
                    this.f47000g = bVar.c();
                    this.e -= 4;
                }
            }
        }
        this.f46998c = (int) (aVar.f3975b - j10);
    }

    public void a(int i10) {
        boolean z4;
        boolean z10 = this.f46997b;
        if (i10 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f46997b = z10 | z4;
        this.f46998c += i10;
    }

    public String toString() {
        switch (this.f46996a) {
            case 0:
                return String.format("%s[id=%s, bodysize=%d]", g.class.getSimpleName(), (String) this.h, Integer.valueOf(this.e));
            default:
                return super.toString();
        }
    }

    public g(u1 u1Var) {
        this.h = u1Var;
    }
}
