package qg;

import java.io.RandomAccessFile;
public final class l0 {
    public final int f44558a;
    public final int f44559b;
    public final int f44560c;
    public final int d;

    public l0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44558a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44559b = randomAccessFile.readUnsignedShort();
        this.f44560c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
