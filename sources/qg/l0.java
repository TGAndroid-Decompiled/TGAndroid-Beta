package qg;

import java.io.RandomAccessFile;
public final class l0 {
    public final int f44547a;
    public final int f44548b;
    public final int f44549c;
    public final int d;

    public l0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44547a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44548b = randomAccessFile.readUnsignedShort();
        this.f44549c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
