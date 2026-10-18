package ri;

import java.io.File;
public final class m {
    public final File f45862a;
    public final long f45863b;
    public final byte[] f45864c;

    public m(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f45862a = file;
        this.f45863b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f45864c = bArr2;
    }
}
