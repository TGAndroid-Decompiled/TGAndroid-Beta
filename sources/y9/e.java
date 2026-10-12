package y9;

import t7.u;
public final class e implements i {
    public static final u f48707c = new u(27);
    public final Object f48708a;
    public Object f48709b;

    public e(ca.c cVar) {
        this.f48708a = cVar;
        this.f48709b = f48707c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f48709b;
        try {
            hVar.read((byte[]) this.f48708a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f48708a = bArr;
        this.f48709b = iArr;
    }
}
