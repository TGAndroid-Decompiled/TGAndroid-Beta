package x9;

import t7.u;
public final class e implements i {
    public static final u f45708c = new Object();
    public final Object f45709a;
    public Object f45710b;

    public e(ba.c cVar) {
        this.f45709a = cVar;
        this.f45710b = f45708c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45710b;
        try {
            hVar.read((byte[]) this.f45709a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45709a = bArr;
        this.f45710b = iArr;
    }
}
