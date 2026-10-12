package qg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f43451a;
    public final int f43452b;
    public final int f43453c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f43451a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f43452b = randomAccessFile.readUnsignedShort();
        this.f43453c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
