package sg;

import java.io.RandomAccessFile;
public final class a0 {
    public final int f55020a;
    public final int f55021b;
    public final int f55022c;
    public final int d;

    public a0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f55020a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f55021b = randomAccessFile.readUnsignedShort();
        this.f55022c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
