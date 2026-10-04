package pg;

import java.io.RandomAccessFile;
public final class j0 {
    public final int f44504a;
    public final int f44505b;
    public final int f44506c;
    public final int d;

    public j0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44504a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44505b = randomAccessFile.readUnsignedShort();
        this.f44506c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
