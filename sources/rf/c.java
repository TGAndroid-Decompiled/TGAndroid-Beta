package rf;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f47337a;
    public final byte[] f47338b = new byte[1];
    public long f47339c;

    public c(h hVar, m mVar) {
        this.f47337a = hVar;
        try {
            this.f47339c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f47339c;
    }

    @Override
    public final void close() {
        this.f47337a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f47337a;
        byte[] bArr = this.f47338b;
        int read = hVar.read(bArr, 0, 1);
        this.f47339c--;
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
        int read = this.f47337a.read(bArr, i10, i11);
        this.f47339c -= read;
        return read;
    }
}
