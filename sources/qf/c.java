package qf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f44441a;
    public final byte[] f44442b = new byte[1];
    public long f44443c;

    public c(h hVar, m mVar) {
        this.f44441a = hVar;
        try {
            this.f44443c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f44443c;
    }

    @Override
    public final void close() {
        this.f44441a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f44441a;
        byte[] bArr = this.f44442b;
        int read = hVar.read(bArr, 0, 1);
        this.f44443c--;
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
        int read = this.f44441a.read(bArr, i10, i11);
        this.f44443c -= read;
        return read;
    }
}
