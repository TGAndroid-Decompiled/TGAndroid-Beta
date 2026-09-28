package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41149a;
    public final int f41150b;
    public final int f41151c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41149a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41150b = randomAccessFile.readUnsignedShort();
        this.f41151c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
