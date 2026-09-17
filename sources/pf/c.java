package pf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f44076a;
    public final byte[] f44077b = new byte[1];
    public long f44078c;

    public c(h hVar, m mVar) {
        this.f44076a = hVar;
        try {
            this.f44078c = hVar.open(mVar);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final int available() {
        return (int) this.f44078c;
    }

    @Override
    public final void close() {
        this.f44076a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f44076a;
        byte[] bArr = this.f44077b;
        int read = hVar.read(bArr, 0, 1);
        this.f44078c--;
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
        int read = this.f44076a.read(bArr, i10, i11);
        this.f44078c -= read;
        return read;
    }
}
