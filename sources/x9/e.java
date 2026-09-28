package x9;

import t7.u;
public final class e implements i {
    public static final u f45991c = new Object();
    public final Object f45992a;
    public Object f45993b;

    public e(ba.c cVar) {
        this.f45992a = cVar;
        this.f45993b = f45991c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45993b;
        try {
            hVar.read((byte[]) this.f45992a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45992a = bArr;
        this.f45993b = iArr;
    }
}
