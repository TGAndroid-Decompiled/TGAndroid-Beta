package r3;
public final class w {
    public final byte[] f43254a = new byte[10];
    public boolean f43255b;
    public int f43256c;
    public long d;
    public int e;
    public int f43257f;
    public int f43258g;

    public final void a(v vVar, u uVar) {
        if (this.f43256c > 0) {
            vVar.c(this.d, this.e, this.f43257f, this.f43258g, uVar);
            this.f43256c = 0;
        }
    }

    public final void b(v vVar, long j10, int i10, int i11, int i12, u uVar) {
        boolean z4;
        if (this.f43258g <= i11 + i12) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.f43255b) {
                int i13 = this.f43256c;
                int i14 = i13 + 1;
                this.f43256c = i14;
                if (i13 == 0) {
                    this.d = j10;
                    this.e = i10;
                    this.f43257f = 0;
                }
                this.f43257f += i11;
                this.f43258g = i12;
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
        if (!this.f43255b) {
            int i10 = 0;
            byte[] bArr = this.f43254a;
            lVar.c(0, 10, bArr);
            lVar.t();
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
            this.f43255b = true;
        }
    }
}
