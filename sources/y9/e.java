package y9;

import t7.u;
public final class e implements i {
    public static final u f50111c = new u(27);
    public final Object f50112a;
    public Object f50113b;

    public e(ca.c cVar) {
        this.f50112a = cVar;
        this.f50113b = f50111c;
    }

    @Override
    public void a(h hVar, int i10) {
        int[] iArr = (int[]) this.f50113b;
        try {
            hVar.read((byte[]) this.f50112a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            hVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f50112a = bArr;
        this.f50113b = iArr;
    }
}
