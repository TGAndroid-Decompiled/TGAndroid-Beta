package qg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f44444a;
    public final int f44445b;
    public final int f44446c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44444a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44445b = randomAccessFile.readUnsignedShort();
        this.f44446c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
