package y9;

import t7.u;
public final class e implements i {
    public static final u f50539c = new u(27);
    public final Object f50540a;
    public Object f50541b;

    public e(ca.c cVar) {
        this.f50540a = cVar;
        this.f50541b = f50539c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f50541b;
        try {
            hVar.read((byte[]) this.f50540a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f50540a = bArr;
        this.f50541b = iArr;
    }
}
