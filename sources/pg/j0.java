package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f44505a;
    public final int f44506b;
    public final int f44507c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44505a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44506b = randomAccessFile.readUnsignedShort();
        this.f44507c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
