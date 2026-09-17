package pg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f40900a;
    public final int f40901b;
    public final int f40902c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f40900a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f40901b = randomAccessFile.readUnsignedShort();
        this.f40902c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
