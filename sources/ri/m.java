package ri;

import java.io.File;
public final class m {
    public final File f45814a;
    public final long f45815b;
    public final byte[] f45816c;

    public m(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f45814a = file;
        this.f45815b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f45816c = bArr2;
    }
}
