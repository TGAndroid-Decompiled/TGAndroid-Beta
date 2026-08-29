package y3;
public final class l {
    public final o3.w f50320a;
    public boolean f50321b;
    public boolean f50322c;
    public boolean d;
    public int f50323e;
    public int f50324f;
    public long f50325g;
    public long h;

    public l(o3.w wVar) {
        this.f50320a = wVar;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z10;
        if (this.f50322c) {
            int i12 = this.f50324f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f50322c = false;
                return;
            }
            this.f50324f = (i11 - i10) + i12;
        }
    }
}
