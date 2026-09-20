package x9;

import t7.u;
public final class e implements i {
    public static final u f46010c = new Object();
    public final Object f46011a;
    public Object f46012b;

    public e(ba.c cVar) {
        this.f46011a = cVar;
        this.f46012b = f46010c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f46012b;
        try {
            hVar.read((byte[]) this.f46011a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f46011a = bArr;
        this.f46012b = iArr;
    }
}
