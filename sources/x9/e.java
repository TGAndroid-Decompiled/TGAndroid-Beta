package x9;

import t7.u;
public final class e implements i {
    public static final u f46098c = new Object();
    public final Object f46099a;
    public Object f46100b;

    public e(ba.c cVar) {
        this.f46099a = cVar;
        this.f46100b = f46098c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f46100b;
        try {
            hVar.read((byte[]) this.f46099a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f46099a = bArr;
        this.f46100b = iArr;
    }
}
