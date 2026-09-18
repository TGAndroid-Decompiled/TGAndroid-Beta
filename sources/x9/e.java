package x9;

import t7.u;
public final class e implements i {
    public static final u f45963c = new Object();
    public final Object f45964a;
    public Object f45965b;

    public e(ba.c cVar) {
        this.f45964a = cVar;
        this.f45965b = f45963c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45965b;
        try {
            hVar.read((byte[]) this.f45964a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45964a = bArr;
        this.f45965b = iArr;
    }
}
