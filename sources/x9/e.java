package x9;
public final class e implements i {
    public static final ob.a f51124c = new ob.a(26);
    public final Object f51125a;
    public Object f51126b;

    public e(ba.c cVar) {
        this.f51125a = cVar;
        this.f51126b = f51124c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f51126b;
        try {
            hVar.read((byte[]) this.f51125a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f51125a = bArr;
        this.f51126b = iArr;
    }
}
