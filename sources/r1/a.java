package r1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f44906a;
    public final f f44907b;

    public a(f fVar) {
        this.f44907b = fVar;
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
            long j11 = this.f44906a;
            int i12 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
            f fVar = this.f44907b;
            if (i12 != 0) {
                if (j11 >= 0 && j10 >= j11 + fVar.f44909a.available()) {
                    return -1;
                }
                fVar.b(j10);
                this.f44906a = j10;
            }
            if (i11 > fVar.f44909a.available()) {
                i11 = fVar.f44909a.available();
            }
            int read = fVar.read(bArr, i10, i11);
            if (read >= 0) {
                this.f44906a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f44906a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
