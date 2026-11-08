package u1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f56180a;
    public final f f56181b;

    public a(f fVar) {
        this.f56181b = fVar;
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
            long j10 = this.f56180a;
            int i11 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
            f fVar = this.f56181b;
            if (i11 != 0) {
                if (j10 >= 0 && j3 >= j10 + fVar.f56184a.available()) {
                    return -1;
                }
                fVar.b(j3);
                this.f56180a = j3;
            }
            if (i10 > fVar.f56184a.available()) {
                i10 = fVar.f56184a.available();
            }
            int read = fVar.read(bArr, i7, i10);
            if (read >= 0) {
                this.f56180a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f56180a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
