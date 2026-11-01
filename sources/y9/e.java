package y9;

import t7.u;
public final class e implements i {
    public static final u f54350c = new u(27);
    public final Object f54351a;
    public Object f54352b;

    public e(ca.c cVar) {
        this.f54351a = cVar;
        this.f54352b = f54350c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f54352b;
        try {
            hVar.read((byte[]) this.f54351a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f54351a = bArr;
        this.f54352b = iArr;
    }
}
