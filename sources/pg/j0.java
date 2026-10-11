package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f45699a;
    public final int f45700b;
    public final int f45701c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f45699a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f45700b = randomAccessFile.readUnsignedShort();
        this.f45701c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
