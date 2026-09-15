package x9;

import t7.u;
public final class e implements i {
    public static final u f45712c = new Object();
    public final Object f45713a;
    public Object f45714b;

    public e(ba.c cVar) {
        this.f45713a = cVar;
        this.f45714b = f45712c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45714b;
        try {
            hVar.read((byte[]) this.f45713a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45713a = bArr;
        this.f45714b = iArr;
    }
}
