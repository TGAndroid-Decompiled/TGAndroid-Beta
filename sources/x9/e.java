package x9;

import t7.u;
public final class e implements i {
    public static final u f45992c = new Object();
    public final Object f45993a;
    public Object f45994b;

    public e(ba.c cVar) {
        this.f45993a = cVar;
        this.f45994b = f45992c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45994b;
        try {
            hVar.read((byte[]) this.f45993a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45993a = bArr;
        this.f45994b = iArr;
    }
}
