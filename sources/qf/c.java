package qf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f44866a;
    public final byte[] f44867b = new byte[1];
    public long f44868c;

    public c(h hVar, m mVar) {
        this.f44866a = hVar;
        try {
            this.f44868c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f44868c;
    }

    @Override
    public final void close() {
        this.f44866a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f44866a;
        byte[] bArr = this.f44867b;
        int read = hVar.read(bArr, 0, 1);
        this.f44868c--;
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
        int read = this.f44866a.read(bArr, i10, i11);
        this.f44868c -= read;
        return read;
    }
}
