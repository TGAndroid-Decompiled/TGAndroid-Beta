package r1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f46816a;
    public final f f46817b;

    public a(f fVar) {
        this.f46817b = fVar;
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
            long j10 = this.f46816a;
            int i12 = (j10 > j3 ? 1 : (j10 == j3 ? 0 : -1));
            f fVar = this.f46817b;
            if (i12 != 0) {
                if (j10 >= 0 && j3 >= j10 + fVar.f46820a.available()) {
                    return -1;
                }
                fVar.b(j3);
                this.f46816a = j3;
            }
            if (i11 > fVar.f46820a.available()) {
                i11 = fVar.f46820a.available();
            }
            int read = fVar.read(bArr, i10, i11);
            if (read >= 0) {
                this.f46816a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f46816a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
