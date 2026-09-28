package r1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f42175a;
    public final f f42176b;

    public a(f fVar) {
        this.f42176b = fVar;
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
            long j10 = this.f42175a;
            if (j10 != j3) {
                if (j10 >= 0 && j3 >= j10 + this.f42176b.f42178a.available()) {
                    return -1;
                }
                this.f42176b.b(j3);
                this.f42175a = j3;
            }
            if (i11 > this.f42176b.f42178a.available()) {
                i11 = this.f42176b.f42178a.available();
            }
            int read = this.f42176b.read(bArr, i10, i11);
            if (read >= 0) {
                this.f42175a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f42175a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
