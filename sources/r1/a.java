package r1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f46521a;
    public final f f46522b;

    public a(f fVar) {
        this.f46522b = fVar;
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
            long j11 = this.f46521a;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + this.f46522b.f46525a.available()) {
                    return -1;
                }
                this.f46522b.b(j10);
                this.f46521a = j10;
            }
            if (i11 > this.f46522b.f46525a.available()) {
                i11 = this.f46522b.f46525a.available();
            }
            int read = this.f46522b.read(bArr, i10, i11);
            if (read >= 0) {
                this.f46521a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f46521a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
