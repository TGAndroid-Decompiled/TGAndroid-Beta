package r9;

import java.util.concurrent.ExecutorService;
public final class d implements Runnable {
    public final int f42458a;
    public final f f42459b;
    public final Runnable f42460c;
    public final n2.e d;

    public d(f fVar, Runnable runnable, n2.e eVar, int i10) {
        this.f42458a = i10;
        this.f42459b = fVar;
        this.f42460c = runnable;
        this.d = eVar;
    }

    @Override
    public final void run() {
        switch (this.f42458a) {
            case 0:
                ExecutorService executorService = this.f42459b.f42464a;
                final Runnable runnable = this.f42460c;
                final n2.e eVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) eVar.f15112b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) eVar.f15112b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) eVar.f15112b;
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
                ExecutorService executorService2 = this.f42459b.f42464a;
                final Runnable runnable2 = this.f42460c;
                final n2.e eVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) eVar2.f15112b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) eVar2.f15112b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) eVar2.f15112b;
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
                ExecutorService executorService3 = this.f42459b.f42464a;
                final Runnable runnable3 = this.f42460c;
                final n2.e eVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) eVar3.f15112b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) eVar3.f15112b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) eVar3.f15112b;
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
