package qg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f43193a;
    public final int f43194b;
    public final int f43195c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f43193a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f43194b = randomAccessFile.readUnsignedShort();
        this.f43195c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
