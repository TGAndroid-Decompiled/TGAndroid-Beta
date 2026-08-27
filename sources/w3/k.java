package w3;

import java.util.Arrays;

public final class k {

    public static final byte[] f49088f = {0, 0, 1};

    public boolean f49089a;

    public int f49090b;

    public int f49091c;
    public int d;

    public byte[] f49092e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.f49089a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f49092e;
            int length = bArr2.length;
            int i13 = this.f49091c + i12;
            if (length < i13) {
                this.f49092e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f49092e, this.f49091c, i12);
            this.f49091c += i12;
        }
    }
}
