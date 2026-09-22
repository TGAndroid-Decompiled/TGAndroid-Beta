package x9;

import t7.u;
public final class e implements i {
    public static final u f46031c = new Object();
    public final Object f46032a;
    public Object f46033b;

    public e(ba.c cVar) {
        this.f46032a = cVar;
        this.f46033b = f46031c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f46033b;
        try {
            hVar.read((byte[]) this.f46032a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f46032a = bArr;
        this.f46033b = iArr;
    }
}
