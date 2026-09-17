package pf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f44049a;
    public final byte[] f44050b = new byte[1];
    public long f44051c;

    public c(h hVar, m mVar) {
        this.f44049a = hVar;
        try {
            this.f44051c = hVar.open(mVar);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final int available() {
        return (int) this.f44051c;
    }

    @Override
    public final void close() {
        this.f44049a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f44049a;
        byte[] bArr = this.f44050b;
        int read = hVar.read(bArr, 0, 1);
        this.f44051c--;
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
        int read = this.f44049a.read(bArr, i10, i11);
        this.f44051c -= read;
        return read;
    }
}
