package r3;
public final class w {
    public final byte[] f46590a = new byte[10];
    public boolean f46591b;
    public int f46592c;
    public long d;
    public int f46593e;
    public int f46594f;
    public int f46595g;

    public final void a(v vVar, u uVar) {
        if (this.f46592c > 0) {
            vVar.c(this.d, this.f46593e, this.f46594f, this.f46595g, uVar);
            this.f46592c = 0;
        }
    }

    public final void b(v vVar, long j10, int i10, int i11, int i12, u uVar) {
        boolean z4;
        if (this.f46595g <= i11 + i12) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.f46591b) {
                int i13 = this.f46592c;
                int i14 = i13 + 1;
                this.f46592c = i14;
                if (i13 == 0) {
                    this.d = j10;
                    this.f46593e = i10;
                    this.f46594f = 0;
                }
                this.f46594f += i11;
                this.f46595g = i12;
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
        if (!this.f46591b) {
            int i10 = 0;
            byte[] bArr = this.f46590a;
            lVar.b(0, 10, bArr);
            lVar.r();
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
            this.f46591b = true;
        }
    }
}
