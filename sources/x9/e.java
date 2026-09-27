package x9;

import t7.u;
public final class e implements i {
    public static final u f46036c = new Object();
    public final Object f46037a;
    public Object f46038b;

    public e(ba.c cVar) {
        this.f46037a = cVar;
        this.f46038b = f46036c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f46038b;
        try {
            hVar.read((byte[]) this.f46037a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f46037a = bArr;
        this.f46038b = iArr;
    }
}
