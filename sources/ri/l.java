package ri;

import java.io.File;
public final class l {
    public final File f46245a;
    public final long f46246b;
    public final byte[] f46247c;

    public l(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f46245a = file;
        this.f46246b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f46247c = bArr2;
    }
}
