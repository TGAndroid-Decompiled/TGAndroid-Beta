package y3;

import java.util.Arrays;
public final class i {
    public static final byte[] f50296e = {0, 0, 1};
    public boolean f50297a;
    public int f50298b;
    public int f50299c;
    public byte[] d;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f50297a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i13 = this.f50298b + i12;
        if (length < i13) {
            this.d = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.d, this.f50298b, i12);
        this.f50298b += i12;
    }
}
