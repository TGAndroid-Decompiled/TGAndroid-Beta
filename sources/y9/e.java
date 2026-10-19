package y9;

import t7.u;
public final class e implements i {
    public static final u f50088c = new u(27);
    public final Object f50089a;
    public Object f50090b;

    public e(ca.c cVar) {
        this.f50089a = cVar;
        this.f50090b = f50088c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f50090b;
        try {
            hVar.read((byte[]) this.f50089a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f50089a = bArr;
        this.f50090b = iArr;
    }
}
