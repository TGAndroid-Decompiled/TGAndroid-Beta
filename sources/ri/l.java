package ri;

import java.io.File;
public final class l {
    public final File f45821a;
    public final long f45822b;
    public final byte[] f45823c;

    public l(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f45821a = file;
        this.f45822b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f45823c = bArr2;
    }
}
