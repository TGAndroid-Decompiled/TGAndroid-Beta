package pi;

import java.io.File;
public final class p {
    public final File f45800a;
    public final long f45801b;
    public final byte[] f45802c;

    public p(File file, long j3, byte[] bArr) {
        byte[] bArr2;
        this.f45800a = file;
        this.f45801b = j3;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f45802c = bArr2;
    }
}
