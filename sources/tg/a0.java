package tg;

import java.io.RandomAccessFile;
public final class a0 {
    public final int f55118a;
    public final int f55119b;
    public final int f55120c;
    public final int d;

    public a0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f55118a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f55119b = randomAccessFile.readUnsignedShort();
        this.f55120c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
