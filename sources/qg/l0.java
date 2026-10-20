package qg;

import java.io.RandomAccessFile;
public final class l0 {
    public final int f44555a;
    public final int f44556b;
    public final int f44557c;
    public final int d;

    public l0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f44555a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f44556b = randomAccessFile.readUnsignedShort();
        this.f44557c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
