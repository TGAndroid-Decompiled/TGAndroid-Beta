package z9;
public final class e implements i {
    public static final qb.a f52816c = new qb.a(29);
    public final Object f52817a;
    public Object f52818b;

    public e(da.c cVar) {
        this.f52817a = cVar;
        this.f52818b = f52816c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f52818b;
        try {
            hVar.read((byte[]) this.f52817a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f52817a = bArr;
        this.f52818b = iArr;
    }
}
