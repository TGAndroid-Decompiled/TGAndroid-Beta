package y9;

import t7.u;
public final class e implements i {
    public static final u f50095c = new u(27);
    public final Object f50096a;
    public Object f50097b;

    public e(ca.c cVar) {
        this.f50096a = cVar;
        this.f50097b = f50095c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f50097b;
        try {
            hVar.read((byte[]) this.f50096a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f50096a = bArr;
        this.f50097b = iArr;
    }
}
