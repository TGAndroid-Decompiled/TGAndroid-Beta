package y9;

import t7.u;
public final class e implements i {
    public static final u f48706c = new u(27);
    public final Object f48707a;
    public Object f48708b;

    public e(ca.c cVar) {
        this.f48707a = cVar;
        this.f48708b = f48706c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f48708b;
        try {
            hVar.read((byte[]) this.f48707a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f48707a = bArr;
        this.f48708b = iArr;
    }
}
