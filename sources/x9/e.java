package x9;

import t7.u;
public final class e implements i {
    public static final u f49786c = new Object();
    public final Object f49787a;
    public Object f49788b;

    public e(ba.c cVar) {
        this.f49787a = cVar;
        this.f49788b = f49786c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f49788b;
        try {
            hVar.read((byte[]) this.f49787a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f49787a = bArr;
        this.f49788b = iArr;
    }
}
