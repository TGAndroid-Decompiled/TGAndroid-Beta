package ze;

import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.q;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final m f50826a;
    public final byte[] f50827b = new byte[1];
    public long f50828c;

    public c(m mVar, q qVar) {
        this.f50826a = mVar;
        try {
            this.f50828c = mVar.open(qVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final int available() {
        return (int) this.f50828c;
    }

    @Override
    public final void close() {
        this.f50826a.close();
    }

    @Override
    public final int read() {
        m mVar = this.f50826a;
        byte[] bArr = this.f50827b;
        int read = mVar.read(bArr, 0, 1);
        this.f50828c--;
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
        int read = this.f50826a.read(bArr, i10, i11);
        this.f50828c -= read;
        return read;
    }
}
