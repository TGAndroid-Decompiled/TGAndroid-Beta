package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f44519a;
    public final int f44520b;
    public final int f44521c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44519a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44520b = randomAccessFile.readUnsignedShort();
        this.f44521c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
