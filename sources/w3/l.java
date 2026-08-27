package w3;

public final class l {

    public final m3.w f49093a;

    public boolean f49094b;

    public boolean f49095c;
    public boolean d;

    public int f49096e;

    public int f49097f;

    public long f49098g;
    public long h;

    public l(m3.w wVar) {
        this.f49093a = wVar;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.f49095c) {
            int i12 = this.f49097f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f49097f = (i11 - i10) + i12;
            } else {
                this.d = ((bArr[i13] & 192) >> 6) == 0;
                this.f49095c = false;
            }
        }
    }
}
