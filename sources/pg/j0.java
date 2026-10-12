package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f45550a;
    public final int f45551b;
    public final int f45552c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f45550a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f45551b = randomAccessFile.readUnsignedShort();
        this.f45552c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
