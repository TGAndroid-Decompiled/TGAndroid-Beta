package we;

import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.q;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final m f48795a;
    public final byte[] f48796b = new byte[1];
    public long f48797c;

    public c(m mVar, q qVar) {
        this.f48795a = mVar;
        try {
            this.f48797c = mVar.open(qVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final int available() {
        return (int) this.f48797c;
    }

    @Override
    public final void close() {
        this.f48795a.close();
    }

    @Override
    public final int read() {
        m mVar = this.f48795a;
        byte[] bArr = this.f48796b;
        int read = mVar.read(bArr, 0, 1);
        this.f48797c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int read = this.f48795a.read(bArr, i9, i10);
        this.f48797c -= read;
        return read;
    }
}
