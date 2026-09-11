package x9;
public final class e implements i {
    public static final na.d f49305c = new Object();
    public final Object f49306a;
    public Object f49307b;

    public e(ba.c cVar) {
        this.f49306a = cVar;
        this.f49307b = f49305c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f49307b;
        try {
            hVar.read((byte[]) this.f49306a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f49306a = bArr;
        this.f49307b = iArr;
    }
}
