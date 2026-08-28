package w3;

import java.util.Arrays;
public final class k {
    public static final byte[] f48582f = {0, 0, 1};
    public boolean f48583a;
    public int f48584b;
    public int f48585c;
    public int d;
    public byte[] f48586e;

    public final void a(int i9, int i10, byte[] bArr) {
        if (!this.f48583a) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = this.f48586e;
        int length = bArr2.length;
        int i12 = this.f48585c + i11;
        if (length < i12) {
            this.f48586e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i9, this.f48586e, this.f48585c, i11);
        this.f48585c += i11;
    }
}
