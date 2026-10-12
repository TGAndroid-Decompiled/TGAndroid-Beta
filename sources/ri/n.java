package ri;

import java.io.File;
public final class n {
    public final File f44742a;
    public final long f44743b;
    public final byte[] f44744c;

    public n(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f44742a = file;
        this.f44743b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f44744c = bArr2;
    }
}
