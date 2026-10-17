package qg;

import java.io.RandomAccessFile;
public final class k0 {
    public final int f44569a;
    public final int f44570b;
    public final int f44571c;
    public final int d;

    public k0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44569a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44570b = randomAccessFile.readUnsignedShort();
        this.f44571c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
