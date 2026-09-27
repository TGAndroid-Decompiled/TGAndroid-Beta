package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41147a;
    public final int f41148b;
    public final int f41149c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41147a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41148b = randomAccessFile.readUnsignedShort();
        this.f41149c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
