package ui;

import java.io.File;
public final class l {
    public final File f49935a;
    public final long f49936b;
    public final byte[] f49937c;

    public l(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f49935a = file;
        this.f49936b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f49937c = bArr2;
    }
}
