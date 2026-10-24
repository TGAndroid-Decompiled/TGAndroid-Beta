package qg;

import java.io.RandomAccessFile;
public final class k0 {
    public final int f44967a;
    public final int f44968b;
    public final int f44969c;
    public final int d;

    public k0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44967a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44968b = randomAccessFile.readUnsignedShort();
        this.f44969c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
