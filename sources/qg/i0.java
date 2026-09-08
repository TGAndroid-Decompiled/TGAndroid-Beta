package qg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f44472a;
    public final int f44473b;
    public final int f44474c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44472a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44473b = randomAccessFile.readUnsignedShort();
        this.f44474c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
