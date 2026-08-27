package w3;

import java.util.Arrays;

public final class i {

    public static final byte[] f49069e = {0, 0, 1};

    public boolean f49070a;

    public int f49071b;

    public int f49072c;
    public byte[] d;

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.f49070a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i13 = this.f49071b + i12;
            if (length < i13) {
                this.d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.d, this.f49071b, i12);
            this.f49071b += i12;
        }
    }
}
