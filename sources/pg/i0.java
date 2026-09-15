package pg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f40878a;
    public final int f40879b;
    public final int f40880c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f40878a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f40879b = randomAccessFile.readUnsignedShort();
        this.f40880c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
