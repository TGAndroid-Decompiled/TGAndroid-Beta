package r1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f43186a;
    public final f f43187b;

    public a(f fVar) {
        this.f43187b = fVar;
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f43186a;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + this.f43187b.f43189a.available()) {
                    return -1;
                }
                this.f43187b.b(j10);
                this.f43186a = j10;
            }
            if (i11 > this.f43187b.f43189a.available()) {
                i11 = this.f43187b.f43189a.available();
            }
            int read = this.f43187b.read(bArr, i10, i11);
            if (read >= 0) {
                this.f43186a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f43186a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
