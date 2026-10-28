package ui;

import java.io.File;
public final class l {
    public final File f49973a;
    public final long f49974b;
    public final byte[] f49975c;

    public l(File file, long j10, byte[] bArr) {
        byte[] bArr2;
        this.f49973a = file;
        this.f49974b = j10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = (byte[]) bArr.clone();
        }
        this.f49975c = bArr2;
    }
}
