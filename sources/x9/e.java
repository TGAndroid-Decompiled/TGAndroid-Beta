package x9;

import t7.u;
public final class e implements i {
    public static final u f49802c = new Object();
    public final Object f49803a;
    public Object f49804b;

    public e(ba.c cVar) {
        this.f49803a = cVar;
        this.f49804b = f49802c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f49804b;
        try {
            hVar.read((byte[]) this.f49803a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f49803a = bArr;
        this.f49804b = iArr;
    }
}
