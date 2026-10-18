package y9;

import t7.u;
public final class e implements i {
    public static final u f50089c = new u(27);
    public final Object f50090a;
    public Object f50091b;

    public e(ca.c cVar) {
        this.f50090a = cVar;
        this.f50091b = f50089c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f50091b;
        try {
            hVar.read((byte[]) this.f50090a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f50090a = bArr;
        this.f50091b = iArr;
    }
}
