package qg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f44445a;
    public final int f44446b;
    public final int f44447c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44445a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44446b = randomAccessFile.readUnsignedShort();
        this.f44447c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
