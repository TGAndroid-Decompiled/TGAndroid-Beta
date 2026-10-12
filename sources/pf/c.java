package pf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f45450a;
    public final byte[] f45451b = new byte[1];
    public long f45452c;

    public c(h hVar, m mVar) {
        this.f45450a = hVar;
        try {
            this.f45452c = hVar.open(mVar);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final int available() {
        return (int) this.f45452c;
    }

    @Override
    public final void close() {
        this.f45450a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f45450a;
        byte[] bArr = this.f45451b;
        int read = hVar.read(bArr, 0, 1);
        this.f45452c--;
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
        int read = this.f45450a.read(bArr, i10, i11);
        this.f45452c -= read;
        return read;
    }
}
