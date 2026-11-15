package sg;

import java.io.RandomAccessFile;
public final class z {
    public final int f56835a;
    public final int f56836b;
    public final int f56837c;
    public final int d;

    public z(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f56835a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f56836b = randomAccessFile.readUnsignedShort();
        this.f56837c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
