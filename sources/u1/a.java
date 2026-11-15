package u1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f57690a;
    public final f f57691b;

    public a(f fVar) {
        this.f57691b = fVar;
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j3, byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j10 = this.f57690a;
            int i11 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
            f fVar = this.f57691b;
            if (i11 != 0) {
                if (j10 >= 0 && j3 >= j10 + fVar.f57694a.available()) {
                    return -1;
                }
                fVar.b(j3);
                this.f57690a = j3;
            }
            if (i10 > fVar.f57694a.available()) {
                i10 = fVar.f57694a.available();
            }
            int read = fVar.read(bArr, i7, i10);
            if (read >= 0) {
                this.f57690a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f57690a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
