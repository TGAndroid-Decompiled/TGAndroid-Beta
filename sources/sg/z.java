package sg;

import java.io.RandomAccessFile;
public final class z {
    public final int f57419a;
    public final int f57420b;
    public final int f57421c;
    public final int d;

    public z(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f57419a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f57420b = randomAccessFile.readUnsignedShort();
        this.f57421c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
