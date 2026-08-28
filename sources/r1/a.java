package r1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f46967a;
    public final f f46968b;

    public a(f fVar) {
        this.f46968b = fVar;
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j10, byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f46967a;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + this.f46968b.f46971a.available()) {
                    return -1;
                }
                this.f46968b.b(j10);
                this.f46967a = j10;
            }
            if (i10 > this.f46968b.f46971a.available()) {
                i10 = this.f46968b.f46971a.available();
            }
            int read = this.f46968b.read(bArr, i9, i10);
            if (read >= 0) {
                this.f46967a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f46967a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
