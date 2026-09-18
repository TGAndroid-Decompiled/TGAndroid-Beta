package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41137a;
    public final int f41138b;
    public final int f41139c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41137a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41138b = randomAccessFile.readUnsignedShort();
        this.f41139c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
