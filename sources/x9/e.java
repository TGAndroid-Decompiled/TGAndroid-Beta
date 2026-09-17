package x9;

import t7.u;
public final class e implements i {
    public static final u f45735c = new Object();
    public final Object f45736a;
    public Object f45737b;

    public e(ba.c cVar) {
        this.f45736a = cVar;
        this.f45737b = f45735c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45737b;
        try {
            hVar.read((byte[]) this.f45736a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45736a = bArr;
        this.f45737b = iArr;
    }
}
