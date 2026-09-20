package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41178a;
    public final int f41179b;
    public final int f41180c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41178a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41179b = randomAccessFile.readUnsignedShort();
        this.f41180c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
