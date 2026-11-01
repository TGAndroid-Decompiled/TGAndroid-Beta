package th;
public final class o1 implements Runnable {
    public final int f49285a;
    public final Runnable f49286b;
    public final long f49287c;

    public o1(int i10, long j10, Runnable runnable) {
        this.f49285a = i10;
        this.f49286b = runnable;
        this.f49287c = j10;
    }

    @Override
    public final void run() {
        switch (this.f49285a) {
            case 0:
                Runnable runnable = this.f49286b;
                org.telegram.messenger.i0.r(runnable);
                org.telegram.messenger.i0.h3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f49287c)));
                return;
            case 1:
                Runnable runnable2 = this.f49286b;
                org.telegram.messenger.i0.r(runnable2);
                org.telegram.messenger.i0.h3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f49287c)));
                return;
            default:
                Runnable runnable3 = this.f49286b;
                org.telegram.messenger.i0.r(runnable3);
                org.telegram.messenger.i0.h3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f49287c)));
                return;
        }
    }
}
