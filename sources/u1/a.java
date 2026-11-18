package u1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f58258a;
    public final f f58259b;

    public a(f fVar) {
        this.f58259b = fVar;
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
            long j10 = this.f58258a;
            int i11 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
            f fVar = this.f58259b;
            if (i11 != 0) {
                if (j10 >= 0 && j3 >= j10 + fVar.f58262a.available()) {
                    return -1;
                }
                fVar.b(j3);
                this.f58258a = j3;
            }
            if (i10 > fVar.f58262a.available()) {
                i10 = fVar.f58262a.available();
            }
            int read = fVar.read(bArr, i7, i10);
            if (read >= 0) {
                this.f58258a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f58258a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
