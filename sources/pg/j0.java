package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f41151a;
    public final int f41152b;
    public final int f41153c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f41151a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f41152b = randomAccessFile.readUnsignedShort();
        this.f41153c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
