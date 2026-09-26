package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41148a;
    public final int f41149b;
    public final int f41150c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41148a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41149b = randomAccessFile.readUnsignedShort();
        this.f41150c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
