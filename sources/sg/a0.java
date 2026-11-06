package sg;

import java.io.RandomAccessFile;
public final class a0 {
    public final int f54917a;
    public final int f54918b;
    public final int f54919c;
    public final int d;

    public a0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f54917a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f54918b = randomAccessFile.readUnsignedShort();
        this.f54919c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
