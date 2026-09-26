package x9;

import t7.u;
public final class e implements i {
    public static final u f45989c = new Object();
    public final Object f45990a;
    public Object f45991b;

    public e(ba.c cVar) {
        this.f45990a = cVar;
        this.f45991b = f45989c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45991b;
        try {
            hVar.read((byte[]) this.f45990a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45990a = bArr;
        this.f45991b = iArr;
    }
}
