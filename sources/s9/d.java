package s9;

import java.util.concurrent.ExecutorService;
public final class d implements Runnable {
    public final int f48116a;
    public final f f48117b;
    public final Runnable f48118c;
    public final g d;

    public d(f fVar, Runnable runnable, g gVar, int i10) {
        this.f48116a = i10;
        this.f48117b = fVar;
        this.f48118c = runnable;
        this.d = gVar;
    }

    @Override
    public final void run() {
        switch (this.f48116a) {
            case 0:
                ExecutorService executorService = this.f48117b.f48122a;
                final Runnable runnable = this.f48118c;
                final g gVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) gVar.f48124a).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) gVar.f48124a).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) gVar.f48124a;
                                try {
                                    runnable2.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    iVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f48117b.f48122a;
                final Runnable runnable2 = this.f48118c;
                final g gVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) gVar2.f48124a).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) gVar2.f48124a).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) gVar2.f48124a;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    iVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f48117b.f48122a;
                final Runnable runnable3 = this.f48118c;
                final g gVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) gVar3.f48124a).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) gVar3.f48124a).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) gVar3.f48124a;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    iVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
