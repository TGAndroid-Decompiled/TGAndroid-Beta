package pf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f44048a;
    public final byte[] f44049b = new byte[1];
    public long f44050c;

    public c(h hVar, m mVar) {
        this.f44048a = hVar;
        try {
            this.f44050c = hVar.open(mVar);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final int available() {
        return (int) this.f44050c;
    }

    @Override
    public final void close() {
        this.f44048a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f44048a;
        byte[] bArr = this.f44049b;
        int read = hVar.read(bArr, 0, 1);
        this.f44050c--;
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
        int read = this.f44048a.read(bArr, i10, i11);
        this.f44050c -= read;
        return read;
    }
}
