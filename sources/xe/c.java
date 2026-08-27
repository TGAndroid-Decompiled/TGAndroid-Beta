package xe;

import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.q;
import java.io.IOException;
import java.io.InputStream;

public final class c extends InputStream {

    public final m f49394a;

    public final byte[] f49395b = new byte[1];

    public long f49396c;

    public c(m mVar, q qVar) {
        this.f49394a = mVar;
        try {
            this.f49396c = mVar.open(qVar);
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override
    public final int available() {
        return (int) this.f49396c;
    }

    @Override
    public final void close() {
        this.f49394a.close();
    }

    @Override
    public final int read() {
        m mVar = this.f49394a;
        byte[] bArr = this.f49395b;
        int i10 = mVar.read(bArr, 0, 1);
        this.f49396c--;
        if (i10 == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f49394a.read(bArr, i10, i11);
        this.f49396c -= (long) i12;
        return i12;
    }
}
