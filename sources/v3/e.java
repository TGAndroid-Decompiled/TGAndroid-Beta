package v3;

import d5.y;
import java.io.EOFException;
import m3.l;
public final class e {
    public final f f48327a = new f();
    public final y f48328b = new y(new byte[65025], 0);
    public int f48329c = -1;
    public int d;
    public boolean f48330e;

    public final int a(int i9) {
        int i10;
        int i11 = 0;
        this.d = 0;
        do {
            int i12 = this.d;
            int i13 = i9 + i12;
            f fVar = this.f48327a;
            if (i13 >= fVar.f48333c) {
                break;
            }
            int[] iArr = fVar.f48335f;
            this.d = i12 + 1;
            i10 = iArr[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final boolean b(l lVar) {
        boolean z10;
        boolean z11;
        int i9;
        if (lVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        boolean z12 = this.f48330e;
        y yVar = this.f48328b;
        if (z12) {
            this.f48330e = false;
            yVar.z(0);
        }
        while (!this.f48330e) {
            int i10 = this.f48329c;
            f fVar = this.f48327a;
            if (i10 < 0) {
                if (fVar.b(lVar, -1L) && fVar.a(lVar, true)) {
                    int i11 = fVar.d;
                    if ((fVar.f48331a & 1) == 1 && yVar.f4412c == 0) {
                        i11 += a(0);
                        i9 = this.d;
                    } else {
                        i9 = 0;
                    }
                    try {
                        lVar.u(i11);
                        this.f48329c = i9;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.f48329c);
            int i12 = this.f48329c + this.d;
            if (a2 > 0) {
                yVar.b(yVar.f4412c + a2);
                try {
                    lVar.readFully(yVar.f4410a, yVar.f4412c, a2);
                    yVar.B(yVar.f4412c + a2);
                    if (fVar.f48335f[i12 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f48330e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == fVar.f48333c) {
                i12 = -1;
            }
            this.f48329c = i12;
        }
        return true;
    }
}
