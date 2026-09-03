package r3;
public final class w {
    public final byte[] f43278a = new byte[10];
    public boolean f43279b;
    public int f43280c;
    public long d;
    public int e;
    public int f43281f;
    public int f43282g;

    public final void a(v vVar, u uVar) {
        if (this.f43280c > 0) {
            vVar.c(this.d, this.e, this.f43281f, this.f43282g, uVar);
            this.f43280c = 0;
        }
    }

    public final void b(v vVar, long j10, int i10, int i11, int i12, u uVar) {
        boolean z4;
        if (this.f43282g <= i11 + i12) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.f43279b) {
                int i13 = this.f43280c;
                int i14 = i13 + 1;
                this.f43280c = i14;
                if (i13 == 0) {
                    this.d = j10;
                    this.e = i10;
                    this.f43281f = 0;
                }
                this.f43281f += i11;
                this.f43282g = i12;
                if (i14 >= 16) {
                    a(vVar, uVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(l lVar) {
        char c3;
        if (!this.f43279b) {
            int i10 = 0;
            byte[] bArr = this.f43278a;
            lVar.b(0, 10, bArr);
            lVar.m();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b10 = bArr[7];
                if ((b10 & 254) == 186) {
                    if ((b10 & 255) == 187) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        c3 = '\t';
                    } else {
                        c3 = '\b';
                    }
                    i10 = 40 << ((bArr[c3] >> 4) & 7);
                }
            }
            if (i10 == 0) {
                return;
            }
            this.f43279b = true;
        }
    }
}
