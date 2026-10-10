package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f45709a;
    public final int f45710b;
    public final int f45711c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f45709a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f45710b = randomAccessFile.readUnsignedShort();
        this.f45711c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
