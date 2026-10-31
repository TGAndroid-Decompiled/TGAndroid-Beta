package tf;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f48689b;
    public int f48690c;

    public b(long j10) {
        this.f48689b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f48690c--;
            return (short) 0;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return -1;
    }

    @Override
    public final boolean c() {
        if (this.f48690c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f48690c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f48690c = AudioConversions.usToShorts(this.f48689b, i10, i11);
    }
}
