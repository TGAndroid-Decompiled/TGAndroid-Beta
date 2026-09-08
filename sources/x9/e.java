package x9;
public final class e implements i {
    public static final na.d f49334c = new Object();
    public final Object f49335a;
    public Object f49336b;

    public e(ba.c cVar) {
        this.f49335a = cVar;
        this.f49336b = f49334c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f49336b;
        try {
            hVar.read((byte[]) this.f49335a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f49335a = bArr;
        this.f49336b = iArr;
    }
}
