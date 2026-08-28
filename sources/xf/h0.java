package xf;

import java.io.RandomAccessFile;
public final class h0 {
    public final int f49231a;
    public final int f49232b;
    public final int f49233c;
    public final int d;

    public h0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f49231a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f49232b = randomAccessFile.readUnsignedShort();
        this.f49233c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
