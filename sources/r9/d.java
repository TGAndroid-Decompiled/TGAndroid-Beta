package r9;

import java.util.concurrent.ExecutorService;
public final class d implements Runnable {
    public final int f42489a;
    public final f f42490b;
    public final Runnable f42491c;
    public final o0.c d;

    public d(f fVar, Runnable runnable, o0.c cVar, int i10) {
        this.f42489a = i10;
        this.f42490b = fVar;
        this.f42491c = runnable;
        this.d = cVar;
    }

    @Override
    public final void run() {
        switch (this.f42489a) {
            case 0:
                ExecutorService executorService = this.f42490b.f42495a;
                final Runnable runnable = this.f42491c;
                final o0.c cVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar.f15522b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) cVar.f15522b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) cVar.f15522b;
                                try {
                                    runnable2.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f42490b.f42495a;
                final Runnable runnable2 = this.f42491c;
                final o0.c cVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar2.f15522b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) cVar2.f15522b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) cVar2.f15522b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f42490b.f42495a;
                final Runnable runnable3 = this.f42491c;
                final o0.c cVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar3.f15522b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) cVar3.f15522b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) cVar3.f15522b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
