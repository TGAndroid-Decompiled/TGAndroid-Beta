package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41198a;
    public final int f41199b;
    public final int f41200c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41198a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41199b = randomAccessFile.readUnsignedShort();
        this.f41200c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
