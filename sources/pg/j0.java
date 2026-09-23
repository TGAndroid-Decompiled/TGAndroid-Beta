package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f40832a;
    public final int f40833b;
    public final int f40834c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f40832a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f40833b = randomAccessFile.readUnsignedShort();
        this.f40834c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
