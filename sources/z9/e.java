package z9;
public final class e implements i {
    public static final qb.a f52819c = new qb.a(29);
    public final Object f52820a;
    public Object f52821b;

    public e(da.c cVar) {
        this.f52820a = cVar;
        this.f52821b = f52819c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f52821b;
        try {
            hVar.read((byte[]) this.f52820a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f52820a = bArr;
        this.f52821b = iArr;
    }
}
