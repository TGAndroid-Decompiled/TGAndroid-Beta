package pi;

import java.io.File;
public final class q {
    public final File f45808a;
    public final long f45809b;
    public final byte[] f45810c;

    public q(File file, long j3, byte[] bArr) {
        byte[] bArr2;
        this.f45808a = file;
        this.f45809b = j3;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f45810c = bArr2;
    }
}
