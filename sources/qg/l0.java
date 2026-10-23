package qg;

import java.io.RandomAccessFile;
public final class l0 {
    public final int f44559a;
    public final int f44560b;
    public final int f44561c;
    public final int d;

    public l0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44559a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44560b = randomAccessFile.readUnsignedShort();
        this.f44561c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
