package r1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f45658a;
    public final f f45659b;

    public a(f fVar) {
        this.f45659b = fVar;
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j3, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j10 = this.f45658a;
            if (j10 != j3) {
                if (j10 >= 0 && j3 >= j10 + this.f45659b.f45662a.available()) {
                    return -1;
                }
                this.f45659b.b(j3);
                this.f45658a = j3;
            }
            if (i11 > this.f45659b.f45662a.available()) {
                i11 = this.f45659b.f45662a.available();
            }
            int read = this.f45659b.read(bArr, i10, i11);
            if (read >= 0) {
                this.f45658a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f45658a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
