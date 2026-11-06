package sg;

import java.io.RandomAccessFile;
public final class a0 {
    public final int f54892a;
    public final int f54893b;
    public final int f54894c;
    public final int d;

    public a0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f54892a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f54893b = randomAccessFile.readUnsignedShort();
        this.f54894c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
