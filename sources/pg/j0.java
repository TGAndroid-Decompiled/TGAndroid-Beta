package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41248a;
    public final int f41249b;
    public final int f41250c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41248a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41249b = randomAccessFile.readUnsignedShort();
        this.f41250c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
