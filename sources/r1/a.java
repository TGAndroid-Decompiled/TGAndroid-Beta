package r1;

import android.media.MediaDataSource;
import java.io.IOException;

public final class a extends MediaDataSource {

    public long f46657a;

    public final f f46658b;

    public a(f fVar) {
        this.f46658b = fVar;
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
            long j11 = this.f46657a;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + ((long) this.f46658b.f46661a.available())) {
                    return -1;
                }
                this.f46658b.b(j10);
                this.f46657a = j10;
            }
            if (i11 > this.f46658b.f46661a.available()) {
                i11 = this.f46658b.f46661a.available();
            }
            int i12 = this.f46658b.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f46657a += (long) i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f46657a = -1L;
        return -1;
    }

    @Override
    public final void close() {
    }
}
