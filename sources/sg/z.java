package sg;

import java.io.RandomAccessFile;
public final class z {
    public final int f57450a;
    public final int f57451b;
    public final int f57452c;
    public final int d;

    public z(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f57450a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f57451b = randomAccessFile.readUnsignedShort();
        this.f57452c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
