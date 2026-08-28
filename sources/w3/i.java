package w3;

import java.util.Arrays;
public final class i {
    public static final byte[] f48563e = {0, 0, 1};
    public boolean f48564a;
    public int f48565b;
    public int f48566c;
    public byte[] d;

    public final void a(int i9, int i10, byte[] bArr) {
        if (!this.f48564a) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i12 = this.f48565b + i11;
        if (length < i12) {
            this.d = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i9, this.d, this.f48565b, i11);
        this.f48565b += i11;
    }
}
