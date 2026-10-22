package ri;

import java.io.File;
public final class l {
    public final File f45824a;
    public final long f45825b;
    public final byte[] f45826c;

    public l(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f45824a = file;
        this.f45825b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f45826c = bArr2;
    }
}
