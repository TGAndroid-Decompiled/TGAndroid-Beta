package r9;

import java.util.concurrent.ExecutorService;
public final class d implements Runnable {
    public final int f45044a;
    public final f f45045b;
    public final Runnable f45046c;
    public final l.d d;

    public d(f fVar, Runnable runnable, l.d dVar, int i10) {
        this.f45044a = i10;
        this.f45045b = fVar;
        this.f45046c = runnable;
        this.d = dVar;
    }

    @Override
    public final void run() {
        switch (this.f45044a) {
            case 0:
                ExecutorService executorService = this.f45045b.f45050a;
                final Runnable runnable = this.f45046c;
                final l.d dVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) dVar.f15072b).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) dVar.f15072b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) dVar.f15072b;
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
                ExecutorService executorService2 = this.f45045b.f45050a;
                final Runnable runnable2 = this.f45046c;
                final l.d dVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) dVar2.f15072b).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) dVar2.f15072b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) dVar2.f15072b;
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
                ExecutorService executorService3 = this.f45045b.f45050a;
                final Runnable runnable3 = this.f45046c;
                final l.d dVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) dVar3.f15072b).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) dVar3.f15072b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) dVar3.f15072b;
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
