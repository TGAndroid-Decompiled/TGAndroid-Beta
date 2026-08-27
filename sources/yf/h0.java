package yf;

import java.io.IOException;
import java.io.RandomAccessFile;

public final class h0 {

    public final int f49938a;

    public final int f49939b;

    public final int f49940c;
    public final int d;

    public h0(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readUnsignedShort();
        this.f49938a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f49939b = randomAccessFile.readUnsignedShort();
        this.f49940c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}
