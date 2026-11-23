package sg;

import java.io.RandomAccessFile;
public final class z {
    public final int f57529a;
    public final int f57530b;
    public final int f57531c;
    public final int d;

    public z(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f57529a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f57530b = randomAccessFile.readUnsignedShort();
        this.f57531c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
