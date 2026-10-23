package ri;

import java.io.File;
public final class l {
    public final File f46246a;
    public final long f46247b;
    public final byte[] f46248c;

    public l(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f46246a = file;
        this.f46247b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f46248c = bArr2;
    }
}
