package pg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f40905a;
    public final int f40906b;
    public final int f40907c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f40905a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f40906b = randomAccessFile.readUnsignedShort();
        this.f40907c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
