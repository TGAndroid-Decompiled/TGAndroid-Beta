package rg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f47431a;
    public final int f47432b;
    public final int f47433c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f47431a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f47432b = randomAccessFile.readUnsignedShort();
        this.f47433c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
