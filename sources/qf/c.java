package qf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f43357a;
    public final byte[] f43358b = new byte[1];
    public long f43359c;

    public c(h hVar, m mVar) {
        this.f43357a = hVar;
        try {
            this.f43359c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f43359c;
    }

    @Override
    public final void close() {
        this.f43357a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f43357a;
        byte[] bArr = this.f43358b;
        int read = hVar.read(bArr, 0, 1);
        this.f43359c--;
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
        int read = this.f43357a.read(bArr, i10, i11);
        this.f43359c -= read;
        return read;
    }
}
