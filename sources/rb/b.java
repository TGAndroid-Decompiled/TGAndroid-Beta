package rb;

import java.lang.reflect.Array;
public final class b {
    public final byte[][] f47110a;
    public final int f47111b;
    public final int f47112c;

    public b(int i9, int i10) {
        this.f47110a = (byte[][]) Array.newInstance(Byte.TYPE, i10, i9);
        this.f47111b = i9;
        this.f47112c = i10;
    }

    public final byte a(int i9, int i10) {
        return this.f47110a[i10][i9];
    }

    public final void b(int i9, int i10, int i11) {
        this.f47110a[i10][i9] = (byte) i11;
    }

    public final String toString() {
        int i9 = this.f47111b;
        int i10 = this.f47112c;
        StringBuilder sb2 = new StringBuilder((i9 * 2 * i10) + 2);
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr = this.f47110a[i11];
            for (int i12 = 0; i12 < i9; i12++) {
                byte b10 = bArr[i12];
                if (b10 != 0) {
                    if (b10 != 1) {
                        sb2.append("  ");
                    } else {
                        sb2.append(" 1");
                    }
                } else {
                    sb2.append(" 0");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
