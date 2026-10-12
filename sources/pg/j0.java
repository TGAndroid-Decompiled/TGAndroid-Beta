package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f45555a;
    public final int f45556b;
    public final int f45557c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f45555a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f45556b = randomAccessFile.readUnsignedShort();
        this.f45557c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
