package sg;

import java.io.RandomAccessFile;
public final class a0 {
    public final int f55021a;
    public final int f55022b;
    public final int f55023c;
    public final int d;

    public a0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f55021a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f55022b = randomAccessFile.readUnsignedShort();
        this.f55023c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
