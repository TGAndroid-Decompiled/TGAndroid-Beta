package x9;
public final class e implements i {
    public static final ob.a f45052c = new ob.a(26);
    public final Object f45053a;
    public Object f45054b;

    public e(ba.c cVar) {
        this.f45053a = cVar;
        this.f45054b = f45052c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45054b;
        try {
            hVar.read((byte[]) this.f45053a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45053a = bArr;
        this.f45054b = iArr;
    }
}
