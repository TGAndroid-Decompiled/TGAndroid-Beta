package w3;
public final class l {
    public final m3.w f48587a;
    public boolean f48588b;
    public boolean f48589c;
    public boolean d;
    public int f48590e;
    public int f48591f;
    public long f48592g;
    public long h;

    public l(m3.w wVar) {
        this.f48587a = wVar;
    }

    public final void a(int i9, int i10, byte[] bArr) {
        boolean z10;
        if (this.f48589c) {
            int i11 = this.f48591f;
            int i12 = (i9 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.d = z10;
                this.f48589c = false;
                return;
            }
            this.f48591f = (i10 - i9) + i11;
        }
    }
}
