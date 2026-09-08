package pf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f44075a;
    public final byte[] f44076b = new byte[1];
    public long f44077c;

    public c(h hVar, m mVar) {
        this.f44075a = hVar;
        try {
            this.f44077c = hVar.open(mVar);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final int available() {
        return (int) this.f44077c;
    }

    @Override
    public final void close() {
        this.f44075a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f44075a;
        byte[] bArr = this.f44076b;
        int read = hVar.read(bArr, 0, 1);
        this.f44077c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int read = this.f44075a.read(bArr, i10, i11);
        this.f44077c -= read;
        return read;
    }
}
