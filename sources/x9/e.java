package x9;
public final class e implements i {
    public static final na.d f49306c = new Object();
    public final Object f49307a;
    public Object f49308b;

    public e(ba.c cVar) {
        this.f49307a = cVar;
        this.f49308b = f49306c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f49308b;
        try {
            hVar.read((byte[]) this.f49307a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f49307a = bArr;
        this.f49308b = iArr;
    }
}
