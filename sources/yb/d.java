package yb;
public abstract class d {
    public final int f59357a;
    public final int f59358b;

    public d(int i3, int i10) {
        this.f59357a = i3;
        this.f59358b = i10;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i3, byte[] bArr);

    public final String toString() {
        char c2;
        int i3 = this.f59357a;
        byte[] bArr = new byte[i3];
        int i10 = this.f59358b;
        StringBuilder sb2 = new StringBuilder((i3 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            bArr = b(i11, bArr);
            for (int i12 = 0; i12 < i3; i12++) {
                int i13 = bArr[i12] & 255;
                if (i13 < 64) {
                    c2 = '#';
                } else if (i13 < 128) {
                    c2 = '+';
                } else if (i13 < 192) {
                    c2 = '.';
                } else {
                    c2 = ' ';
                }
                sb2.append(c2);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
