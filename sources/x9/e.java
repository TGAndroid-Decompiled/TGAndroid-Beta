package x9;

import t7.u;
public final class e implements i {
    public static final u f45740c = new Object();
    public final Object f45741a;
    public Object f45742b;

    public e(ba.c cVar) {
        this.f45741a = cVar;
        this.f45742b = f45740c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f45742b;
        try {
            hVar.read((byte[]) this.f45741a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f45741a = bArr;
        this.f45742b = iArr;
    }
}
