package qg;

import java.io.RandomAccessFile;
public final class k0 {
    public final int f44589a;
    public final int f44590b;
    public final int f44591c;
    public final int d;

    public k0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44589a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44590b = randomAccessFile.readUnsignedShort();
        this.f44591c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
