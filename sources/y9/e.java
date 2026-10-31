package y9;

import t7.u;
public final class e implements i {
    public static final u f54329c = new u(27);
    public final Object f54330a;
    public Object f54331b;

    public e(ca.c cVar) {
        this.f54330a = cVar;
        this.f54331b = f54329c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f54331b;
        try {
            hVar.read((byte[]) this.f54330a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f54330a = bArr;
        this.f54331b = iArr;
    }
}
