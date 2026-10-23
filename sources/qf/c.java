package qf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f44453a;
    public final byte[] f44454b = new byte[1];
    public long f44455c;

    public c(h hVar, m mVar) {
        this.f44453a = hVar;
        try {
            this.f44455c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f44455c;
    }

    @Override
    public final void close() {
        this.f44453a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f44453a;
        byte[] bArr = this.f44454b;
        int read = hVar.read(bArr, 0, 1);
        this.f44455c--;
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
        int read = this.f44453a.read(bArr, i10, i11);
        this.f44455c -= read;
        return read;
    }
}
