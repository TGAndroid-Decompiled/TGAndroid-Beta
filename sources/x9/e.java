package x9;
public final class e implements i {
    public static final qb.b f51309c = new qb.b(26);
    public final Object f51310a;
    public Object f51311b;

    public e(ba.c cVar) {
        this.f51310a = cVar;
        this.f51311b = f51309c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f51311b;
        try {
            hVar.read((byte[]) this.f51310a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f51310a = bArr;
        this.f51311b = iArr;
    }
}
