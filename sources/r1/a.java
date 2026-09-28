package r1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f42176a;
    public final f f42177b;

    public a(f fVar) {
        this.f42177b = fVar;
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
            long j10 = this.f42176a;
            if (j10 != j3) {
                if (j10 >= 0 && j3 >= j10 + this.f42177b.f42179a.available()) {
                    return -1;
                }
                this.f42177b.b(j3);
                this.f42176a = j3;
            }
            if (i11 > this.f42177b.f42179a.available()) {
                i11 = this.f42177b.f42179a.available();
            }
            int read = this.f42177b.read(bArr, i10, i11);
            if (read >= 0) {
                this.f42176a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f42176a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
