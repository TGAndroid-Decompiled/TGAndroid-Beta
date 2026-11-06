package wf;

import j2.h;
import j2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f57565a;
    public final byte[] f57566b = new byte[1];
    public long f57567c;

    public c(h hVar, m mVar) {
        this.f57565a = hVar;
        try {
            this.f57567c = hVar.open(mVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final int available() {
        return (int) this.f57567c;
    }

    @Override
    public final void close() {
        this.f57565a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f57565a;
        byte[] bArr = this.f57566b;
        int read = hVar.read(bArr, 0, 1);
        this.f57567c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int read = this.f57565a.read(bArr, i7, i10);
        this.f57567c -= read;
        return read;
    }
}
