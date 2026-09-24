package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41135a;
    public final int f41136b;
    public final int f41137c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41135a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41136b = randomAccessFile.readUnsignedShort();
        this.f41137c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
