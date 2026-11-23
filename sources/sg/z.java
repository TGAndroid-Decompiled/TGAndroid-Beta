package sg;

import java.io.RandomAccessFile;
public final class z {
    public final int f57454a;
    public final int f57455b;
    public final int f57456c;
    public final int d;

    public z(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f57454a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f57455b = randomAccessFile.readUnsignedShort();
        this.f57456c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
