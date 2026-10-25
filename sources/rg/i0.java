package rg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f47428a;
    public final int f47429b;
    public final int f47430c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f47428a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f47429b = randomAccessFile.readUnsignedShort();
        this.f47430c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
