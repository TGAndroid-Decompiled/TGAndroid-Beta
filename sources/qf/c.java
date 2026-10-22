package qf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f44452a;
    public final byte[] f44453b = new byte[1];
    public long f44454c;

    public c(h hVar, m mVar) {
        this.f44452a = hVar;
        try {
            this.f44454c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f44454c;
    }

    @Override
    public final void close() {
        this.f44452a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f44452a;
        byte[] bArr = this.f44453b;
        int read = hVar.read(bArr, 0, 1);
        this.f44454c--;
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
        int read = this.f44452a.read(bArr, i10, i11);
        this.f44454c -= read;
        return read;
    }
}
