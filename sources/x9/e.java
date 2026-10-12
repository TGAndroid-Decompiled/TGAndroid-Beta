package x9;
public final class e implements i {
    public static final qb.b f51317c = new qb.b(26);
    public final Object f51318a;
    public Object f51319b;

    public e(ba.c cVar) {
        this.f51318a = cVar;
        this.f51319b = f51317c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f51319b;
        try {
            hVar.read((byte[]) this.f51318a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f51318a = bArr;
        this.f51319b = iArr;
    }
}
