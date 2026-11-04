package t1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f54772a;
    public final f f54773b;

    public a(f fVar) {
        this.f54773b = fVar;
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j10, byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f54772a;
            int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
            f fVar = this.f54773b;
            if (i11 != 0) {
                if (j11 >= 0 && j10 >= j11 + fVar.f54776a.available()) {
                    return -1;
                }
                fVar.b(j10);
                this.f54772a = j10;
            }
            if (i10 > fVar.f54776a.available()) {
                i10 = fVar.f54776a.available();
            }
            int read = fVar.read(bArr, i3, i10);
            if (read >= 0) {
                this.f54772a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f54772a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
