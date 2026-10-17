package ri;

import java.io.File;
public final class m {
    public final File f45842a;
    public final long f45843b;
    public final byte[] f45844c;

    public m(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f45842a = file;
        this.f45843b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f45844c = bArr2;
    }
}
