package qg;

import java.io.RandomAccessFile;
public final class l0 {
    public final int f44545a;
    public final int f44546b;
    public final int f44547c;
    public final int d;

    public l0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44545a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44546b = randomAccessFile.readUnsignedShort();
        this.f44547c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
