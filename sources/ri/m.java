package ri;

import java.io.File;
public final class m {
    public final File f45816a;
    public final long f45817b;
    public final byte[] f45818c;

    public m(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f45816a = file;
        this.f45817b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f45818c = bArr2;
    }
}
