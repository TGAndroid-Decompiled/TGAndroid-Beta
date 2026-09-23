package x9;

import t7.u;
public final class e implements i {
    public static final u f45662c = new Object();
    public final Object f45663a;
    public Object f45664b;

    public e(ba.c cVar) {
        this.f45663a = cVar;
        this.f45664b = f45662c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45664b;
        try {
            hVar.read((byte[]) this.f45663a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45663a = bArr;
        this.f45664b = iArr;
    }
}
