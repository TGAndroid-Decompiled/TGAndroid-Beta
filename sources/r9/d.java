package r9;

import java.util.concurrent.ExecutorService;
public final class d implements Runnable {
    public final int f41376a;
    public final f f41377b;
    public final Runnable f41378c;
    public final l2.h d;

    public d(f fVar, Runnable runnable, l2.h hVar, int i10) {
        this.f41376a = i10;
        this.f41377b = fVar;
        this.f41378c = runnable;
        this.d = hVar;
    }

    @Override
    public final void run() {
        switch (this.f41376a) {
            case 0:
                ExecutorService executorService = this.f41377b.f41382a;
                final Runnable runnable = this.f41378c;
                final l2.h hVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) hVar.f12721b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) hVar.f12721b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar2 = (h) hVar.f12721b;
                                try {
                                    runnable2.run();
                                    hVar2.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar2.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f41377b.f41382a;
                final Runnable runnable2 = this.f41378c;
                final l2.h hVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) hVar2.f12721b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) hVar2.f12721b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar22 = (h) hVar2.f12721b;
                                try {
                                    runnable22.run();
                                    hVar22.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar22.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f41377b.f41382a;
                final Runnable runnable3 = this.f41378c;
                final l2.h hVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) hVar3.f12721b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) hVar3.f12721b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar22 = (h) hVar3.f12721b;
                                try {
                                    runnable22.run();
                                    hVar22.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar22.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
