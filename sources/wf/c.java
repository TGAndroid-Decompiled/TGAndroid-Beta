package wf;

import j2.h;
import j2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f59713a;
    public final byte[] f59714b = new byte[1];
    public long f59715c;

    public c(h hVar, m mVar) {
        this.f59713a = hVar;
        try {
            this.f59715c = hVar.open(mVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final int available() {
        return (int) this.f59715c;
    }

    @Override
    public final void close() {
        this.f59713a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f59713a;
        byte[] bArr = this.f59714b;
        int read = hVar.read(bArr, 0, 1);
        this.f59715c--;
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
        int read = this.f59713a.read(bArr, i7, i10);
        this.f59715c -= read;
        return read;
    }
}
