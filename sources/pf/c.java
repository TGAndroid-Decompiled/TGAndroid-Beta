package pf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f45628a;
    public final byte[] f45629b = new byte[1];
    public long f45630c;

    public c(h hVar, m mVar) {
        this.f45628a = hVar;
        try {
            this.f45630c = hVar.open(mVar);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final int available() {
        return (int) this.f45630c;
    }

    @Override
    public final void close() {
        this.f45628a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f45628a;
        byte[] bArr = this.f45629b;
        int read = hVar.read(bArr, 0, 1);
        this.f45630c--;
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
        int read = this.f45628a.read(bArr, i10, i11);
        this.f45630c -= read;
        return read;
    }
}
