package qg;

import java.io.RandomAccessFile;
public final class k0 {
    public final int f44968a;
    public final int f44969b;
    public final int f44970c;
    public final int d;

    public k0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44968a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44969b = randomAccessFile.readUnsignedShort();
        this.f44970c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
