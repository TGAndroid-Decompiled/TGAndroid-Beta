package x9;
public final class e implements i {
    public static final ob.a f51080c = new ob.a(26);
    public final Object f51081a;
    public Object f51082b;

    public e(ba.c cVar) {
        this.f51081a = cVar;
        this.f51082b = f51080c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f51082b;
        try {
            hVar.read((byte[]) this.f51081a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f51081a = bArr;
        this.f51082b = iArr;
    }
}
