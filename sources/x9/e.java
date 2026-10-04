package x9;

import t7.u;
public final class e implements i {
    public static final u f49787c = new Object();
    public final Object f49788a;
    public Object f49789b;

    public e(ba.c cVar) {
        this.f49788a = cVar;
        this.f49789b = f49787c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f49789b;
        try {
            hVar.read((byte[]) this.f49788a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f49788a = bArr;
        this.f49789b = iArr;
    }
}
