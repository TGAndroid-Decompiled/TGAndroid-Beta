package tf;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f48700b;
    public int f48701c;

    public b(long j10) {
        this.f48700b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f48701c--;
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
        if (this.f48701c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f48701c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f48701c = AudioConversions.usToShorts(this.f48700b, i10, i11);
    }
}
