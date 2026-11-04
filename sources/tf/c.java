package tf;

import i2.h;
import i2.n;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f55096a;
    public final byte[] f55097b = new byte[1];
    public long f55098c;

    public c(h hVar, n nVar) {
        this.f55096a = hVar;
        try {
            this.f55098c = hVar.open(nVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final int available() {
        return (int) this.f55098c;
    }

    @Override
    public final void close() {
        this.f55096a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f55096a;
        byte[] bArr = this.f55097b;
        int read = hVar.read(bArr, 0, 1);
        this.f55098c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int read = this.f55096a.read(bArr, i3, i10);
        this.f55098c -= read;
        return read;
    }
}
