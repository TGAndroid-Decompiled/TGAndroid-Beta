package sg;

import java.io.RandomAccessFile;
public final class z {
    public final int f57409a;
    public final int f57410b;
    public final int f57411c;
    public final int d;

    public z(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f57409a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f57410b = randomAccessFile.readUnsignedShort();
        this.f57411c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
