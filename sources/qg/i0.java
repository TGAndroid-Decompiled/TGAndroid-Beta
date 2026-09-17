package qg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f44473a;
    public final int f44474b;
    public final int f44475c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44473a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44474b = randomAccessFile.readUnsignedShort();
        this.f44475c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
