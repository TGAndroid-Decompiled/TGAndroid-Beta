package r1;

import android.media.MediaDataSource;
import java.io.IOException;
public final class a extends MediaDataSource {
    public long f44780a;
    public final f f44781b;

    public a(f fVar) {
        this.f44781b = fVar;
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
            long j10 = this.f44780a;
            if (j10 != j3) {
                if (j10 >= 0 && j3 >= j10 + this.f44781b.f44784a.available()) {
                    return -1;
                }
                this.f44781b.b(j3);
                this.f44780a = j3;
            }
            if (i11 > this.f44781b.f44784a.available()) {
                i11 = this.f44781b.f44784a.available();
            }
            int read = this.f44781b.read(bArr, i10, i11);
            if (read >= 0) {
                this.f44780a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f44780a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
