package y9;

import t7.u;
public final class e implements i {
    public static final u f50136c = new u(27);
    public final Object f50137a;
    public Object f50138b;

    public e(ca.c cVar) {
        this.f50137a = cVar;
        this.f50138b = f50136c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f50138b;
        try {
            hVar.read((byte[]) this.f50137a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f50137a = bArr;
        this.f50138b = iArr;
    }
}
