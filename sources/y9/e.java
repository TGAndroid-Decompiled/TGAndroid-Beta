package y9;

import t7.u;
public final class e implements i {
    public static final u f50099c = new u(27);
    public final Object f50100a;
    public Object f50101b;

    public e(ca.c cVar) {
        this.f50100a = cVar;
        this.f50101b = f50099c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f50101b;
        try {
            hVar.read((byte[]) this.f50100a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f50100a = bArr;
        this.f50101b = iArr;
    }
}
