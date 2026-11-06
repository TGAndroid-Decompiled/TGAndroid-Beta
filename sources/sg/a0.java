package sg;

import java.io.RandomAccessFile;
public final class a0 {
    public final int f54916a;
    public final int f54917b;
    public final int f54918c;
    public final int d;

    public a0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f54916a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f54917b = randomAccessFile.readUnsignedShort();
        this.f54918c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
