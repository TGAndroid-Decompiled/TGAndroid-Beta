package qf;

import java.io.EOFException;
import org.telegram.ui.Components.nh;
public final class f {
    public final String f53883a;
    public final int f53884b;
    public final int f53885c;
    public final boolean d;
    public final boolean f53886e;
    public final boolean f53887f;
    public final int f53888g;

    public f(p7.d dVar) {
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        rf.b bVar = (rf.b) dVar.f53345b;
        long j10 = bVar.f54501b;
        nh nhVar = (nh) dVar.f53346c;
        h hVar = (h) dVar.d;
        int i3 = hVar.f53891a;
        int i10 = hVar.f53891a;
        byte b12 = 2;
        if (i3 == 2) {
            nhVar.getClass();
            byte[] bArr = new byte[3];
            int i11 = 0;
            while (i11 < 3) {
                int read = ((rf.a) nhVar.f36540b).read(bArr, i11, 3 - i11);
                if (read > 0) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            this.f53883a = new String(bArr, "ISO-8859-1");
        } else {
            nhVar.getClass();
            byte[] bArr2 = new byte[4];
            int i12 = 0;
            while (i12 < 4) {
                int read2 = ((rf.a) nhVar.f36540b).read(bArr2, i12, 4 - i12);
                if (read2 > 0) {
                    i12 += read2;
                } else {
                    throw new EOFException();
                }
            }
            this.f53883a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i10 == 2) {
            this.f53885c = ((nhVar.F() & 255) << 16) | ((nhVar.F() & 255) << 8) | (nhVar.F() & 255);
        } else if (i10 == 3) {
            this.f53885c = nhVar.G();
        } else {
            this.f53885c = nhVar.H();
        }
        if (i10 > 2) {
            nhVar.F();
            byte F = nhVar.F();
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
            if ((b13 & F) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f53886e = z10;
            if ((b12 & F) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.d = z11;
            boolean z12 = (F & b14) != 0;
            this.f53887f = z12;
            if (i10 == 3) {
                if (z10) {
                    this.f53888g = nhVar.G();
                    this.f53885c -= 4;
                }
                if (z12) {
                    nhVar.F();
                    this.f53885c--;
                }
                if ((F & b10) != 0) {
                    nhVar.F();
                    this.f53885c--;
                }
            } else {
                if ((F & b10) != 0) {
                    nhVar.F();
                    this.f53885c--;
                }
                if (z12) {
                    nhVar.F();
                    this.f53885c--;
                }
                if ((F & b11) != 0) {
                    this.f53888g = nhVar.H();
                    this.f53885c -= 4;
                }
            }
        }
        this.f53884b = (int) (bVar.f54501b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.f53883a, Integer.valueOf(this.f53885c));
    }
}
