package qf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f44444a;
    public final byte[] f44445b = new byte[1];
    public long f44446c;

    public c(h hVar, m mVar) {
        this.f44444a = hVar;
        try {
            this.f44446c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f44446c;
    }

    @Override
    public final void close() {
        this.f44444a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f44444a;
        byte[] bArr = this.f44445b;
        int read = hVar.read(bArr, 0, 1);
        this.f44446c--;
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
        int read = this.f44444a.read(bArr, i10, i11);
        this.f44446c -= read;
        return read;
    }
}
