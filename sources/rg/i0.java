package rg;

import java.io.RandomAccessFile;
public final class i0 {
    public final int f47466a;
    public final int f47467b;
    public final int f47468c;
    public final int d;

    public i0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f47466a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f47467b = randomAccessFile.readUnsignedShort();
        this.f47468c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
