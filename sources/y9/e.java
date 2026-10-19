package y9;

import t7.u;
public final class e implements i {
    public static final u f50090c = new u(27);
    public final Object f50091a;
    public Object f50092b;

    public e(ca.c cVar) {
        this.f50091a = cVar;
        this.f50092b = f50090c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f50092b;
        try {
            hVar.read((byte[]) this.f50091a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f50091a = bArr;
        this.f50092b = iArr;
    }
}
