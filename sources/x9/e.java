package x9;

import t7.u;
public final class e implements i {
    public static final u f45976c = new Object();
    public final Object f45977a;
    public Object f45978b;

    public e(ba.c cVar) {
        this.f45977a = cVar;
        this.f45978b = f45976c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45978b;
        try {
            hVar.read((byte[]) this.f45977a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45977a = bArr;
        this.f45978b = iArr;
    }
}
