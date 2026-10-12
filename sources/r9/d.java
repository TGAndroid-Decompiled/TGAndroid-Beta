package r9;

import java.util.concurrent.ExecutorService;
import n4.l;
public final class d implements Runnable {
    public final int f47332a;
    public final f f47333b;
    public final Runnable f47334c;
    public final l d;

    public d(f fVar, Runnable runnable, l lVar, int i10) {
        this.f47332a = i10;
        this.f47333b = fVar;
        this.f47334c = runnable;
        this.d = lVar;
    }

    @Override
    public final void run() {
        switch (this.f47332a) {
            case 0:
                ExecutorService executorService = this.f47333b.f47338a;
                final Runnable runnable = this.f47334c;
                final l lVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) lVar.f16326a).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) lVar.f16326a).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) lVar.f16326a;
                                try {
                                    runnable2.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f47333b.f47338a;
                final Runnable runnable2 = this.f47334c;
                final l lVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) lVar2.f16326a).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) lVar2.f16326a).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) lVar2.f16326a;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f47333b.f47338a;
                final Runnable runnable3 = this.f47334c;
                final l lVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) lVar3.f16326a).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) lVar3.f16326a).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) lVar3.f16326a;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
