package ui;

import java.io.File;
public final class l {
    public final File f49938a;
    public final long f49939b;
    public final byte[] f49940c;

    public l(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f49938a = file;
        this.f49939b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f49940c = bArr2;
    }
}
