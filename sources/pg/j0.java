package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f44512a;
    public final int f44513b;
    public final int f44514c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44512a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44513b = randomAccessFile.readUnsignedShort();
        this.f44514c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
