package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f45665a;
    public final int f45666b;
    public final int f45667c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f45665a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f45666b = randomAccessFile.readUnsignedShort();
        this.f45667c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
