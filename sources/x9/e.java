package x9;
public final class e implements i {
    public static final ob.a f51078c = new ob.a(26);
    public final Object f51079a;
    public Object f51080b;

    public e(ba.c cVar) {
        this.f51079a = cVar;
        this.f51080b = f51078c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f51080b;
        try {
            hVar.read((byte[]) this.f51079a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f51079a = bArr;
        this.f51080b = iArr;
    }
}
