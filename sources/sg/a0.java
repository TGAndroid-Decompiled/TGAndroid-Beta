package sg;

import java.io.RandomAccessFile;
public final class a0 {
    public final int f55008a;
    public final int f55009b;
    public final int f55010c;
    public final int d;

    public a0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f55008a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f55009b = randomAccessFile.readUnsignedShort();
        this.f55010c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
