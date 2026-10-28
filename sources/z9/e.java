package z9;
public final class e implements i {
    public static final qb.a f52877c = new qb.a(29);
    public final Object f52878a;
    public Object f52879b;

    public e(da.c cVar) {
        this.f52878a = cVar;
        this.f52879b = f52877c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f52879b;
        try {
            hVar.read((byte[]) this.f52878a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f52878a = bArr;
        this.f52879b = iArr;
    }
}
