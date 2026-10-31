package th;
public final class o1 implements Runnable {
    public final int f49271a;
    public final Runnable f49272b;
    public final long f49273c;

    public o1(int i10, long j10, Runnable runnable) {
        this.f49271a = i10;
        this.f49272b = runnable;
        this.f49273c = j10;
    }

    @Override
    public final void run() {
        switch (this.f49271a) {
            case 0:
                Runnable runnable = this.f49272b;
                org.telegram.messenger.i0.r(runnable);
                org.telegram.messenger.i0.h3(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f49273c)));
                return;
            case 1:
                Runnable runnable2 = this.f49272b;
                org.telegram.messenger.i0.r(runnable2);
                org.telegram.messenger.i0.h3(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f49273c)));
                return;
            default:
                Runnable runnable3 = this.f49272b;
                org.telegram.messenger.i0.r(runnable3);
                org.telegram.messenger.i0.h3(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f49273c)));
                return;
        }
    }
}
