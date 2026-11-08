package sg;

import java.io.RandomAccessFile;
public final class a0 {
    public final int f55009a;
    public final int f55010b;
    public final int f55011c;
    public final int d;

    public a0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f55009a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f55010b = randomAccessFile.readUnsignedShort();
        this.f55011c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
