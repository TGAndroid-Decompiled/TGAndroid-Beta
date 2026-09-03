package vb;

import java.lang.reflect.Array;
public final class b {
    public final byte[][] f48981a;
    public final int f48982b;
    public final int f48983c;

    public b(int i10, int i11) {
        this.f48981a = (byte[][]) Array.newInstance(Byte.TYPE, i11, i10);
        this.f48982b = i10;
        this.f48983c = i11;
    }

    public final byte a(int i10, int i11) {
        return this.f48981a[i11][i10];
    }

    public final void b(int i10, int i11, int i12) {
        this.f48981a[i11][i10] = (byte) i12;
    }

    public final String toString() {
        int i10 = this.f48982b;
        int i11 = this.f48983c;
        StringBuilder sb = new StringBuilder((i10 * 2 * i11) + 2);
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.f48981a[i12];
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (b10 != 0) {
                    if (b10 != 1) {
                        sb.append("  ");
                    } else {
                        sb.append(" 1");
                    }
                } else {
                    sb.append(" 0");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
