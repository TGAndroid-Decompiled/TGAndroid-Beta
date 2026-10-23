package ri;

import java.io.File;
public final class l {
    public final File f45825a;
    public final long f45826b;
    public final byte[] f45827c;

    public l(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f45825a = file;
        this.f45826b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f45827c = bArr2;
    }
}
