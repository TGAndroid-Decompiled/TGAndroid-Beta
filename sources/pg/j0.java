package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41150a;
    public final int f41151b;
    public final int f41152c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41150a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41151b = randomAccessFile.readUnsignedShort();
        this.f41152c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
