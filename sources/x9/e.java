package x9;

import t7.u;
public final class e implements i {
    public static final u f49795c = new Object();
    public final Object f49796a;
    public Object f49797b;

    public e(ba.c cVar) {
        this.f49796a = cVar;
        this.f49797b = f49795c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f49797b;
        try {
            hVar.read((byte[]) this.f49796a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f49796a = bArr;
        this.f49797b = iArr;
    }
}
