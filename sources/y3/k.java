package y3;

import java.util.Arrays;
public final class k {
    public static final byte[] f50315f = {0, 0, 1};
    public boolean f50316a;
    public int f50317b;
    public int f50318c;
    public int d;
    public byte[] f50319e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (!this.f50316a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f50319e;
        int length = bArr2.length;
        int i13 = this.f50318c + i12;
        if (length < i13) {
            this.f50319e = Arrays.copyOf(bArr2, i13 * 2);
        }
        System.arraycopy(bArr, i10, this.f50319e, this.f50318c, i12);
        this.f50318c += i12;
    }
}
