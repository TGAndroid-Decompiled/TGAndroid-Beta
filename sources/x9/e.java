package x9;

import t7.u;
public final class e implements i {
    public static final u f45990c = new Object();
    public final Object f45991a;
    public Object f45992b;

    public e(ba.c cVar) {
        this.f45991a = cVar;
        this.f45992b = f45990c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45992b;
        try {
            hVar.read((byte[]) this.f45991a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45991a = bArr;
        this.f45992b = iArr;
    }
}
