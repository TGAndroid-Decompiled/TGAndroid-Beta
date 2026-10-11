package x9;
public final class e implements i {
    public static final ob.a f51168c = new ob.a(26);
    public final Object f51169a;
    public Object f51170b;

    public e(ba.c cVar) {
        this.f51169a = cVar;
        this.f51170b = f51168c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f51170b;
        try {
            hVar.read((byte[]) this.f51169a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f51169a = bArr;
        this.f51170b = iArr;
    }
}
