package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f45733a;
    public final int f45734b;
    public final int f45735c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f45733a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f45734b = randomAccessFile.readUnsignedShort();
        this.f45735c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
