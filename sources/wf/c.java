package wf;

import j2.h;
import j2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f57669a;
    public final byte[] f57670b = new byte[1];
    public long f57671c;

    public c(h hVar, m mVar) {
        this.f57669a = hVar;
        try {
            this.f57671c = hVar.open(mVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final int available() {
        return (int) this.f57671c;
    }

    @Override
    public final void close() {
        this.f57669a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f57669a;
        byte[] bArr = this.f57670b;
        int read = hVar.read(bArr, 0, 1);
        this.f57671c--;
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
        int read = this.f57669a.read(bArr, i7, i10);
        this.f57671c -= read;
        return read;
    }
}
