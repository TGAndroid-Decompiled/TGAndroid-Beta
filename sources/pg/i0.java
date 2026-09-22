package pg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f40874a;
    public final int f40875b;
    public final int f40876c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f40874a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f40875b = randomAccessFile.readUnsignedShort();
        this.f40876c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
