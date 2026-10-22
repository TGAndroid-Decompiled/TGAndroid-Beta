package y9;

import t7.u;
public final class e implements i {
    public static final u f50098c = new u(27);
    public final Object f50099a;
    public Object f50100b;

    public e(ca.c cVar) {
        this.f50099a = cVar;
        this.f50100b = f50098c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f50100b;
        try {
            hVar.read((byte[]) this.f50099a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f50099a = bArr;
        this.f50100b = iArr;
    }
}
