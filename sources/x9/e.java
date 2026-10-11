package x9;
public final class e implements i {
    public static final ob.a f51202c = new ob.a(26);
    public final Object f51203a;
    public Object f51204b;

    public e(ba.c cVar) {
        this.f51203a = cVar;
        this.f51204b = f51202c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f51204b;
        try {
            hVar.read((byte[]) this.f51203a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f51203a = bArr;
        this.f51204b = iArr;
    }
}
