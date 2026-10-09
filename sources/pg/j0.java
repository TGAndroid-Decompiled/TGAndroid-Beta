package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f45663a;
    public final int f45664b;
    public final int f45665c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f45663a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f45664b = randomAccessFile.readUnsignedShort();
        this.f45665c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
