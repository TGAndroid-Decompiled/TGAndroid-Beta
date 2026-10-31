package s9;

import java.util.concurrent.ExecutorService;
public final class d implements Runnable {
    public final int f48105a;
    public final f f48106b;
    public final Runnable f48107c;
    public final g d;

    public d(f fVar, Runnable runnable, g gVar, int i10) {
        this.f48105a = i10;
        this.f48106b = fVar;
        this.f48107c = runnable;
        this.d = gVar;
    }

    @Override
    public final void run() {
        switch (this.f48105a) {
            case 0:
                ExecutorService executorService = this.f48106b.f48111a;
                final Runnable runnable = this.f48107c;
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
                                    ((i) gVar.f48113a).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) gVar.f48113a).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) gVar.f48113a;
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
                ExecutorService executorService2 = this.f48106b.f48111a;
                final Runnable runnable2 = this.f48107c;
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
                                    ((i) gVar2.f48113a).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) gVar2.f48113a).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) gVar2.f48113a;
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
                ExecutorService executorService3 = this.f48106b.f48111a;
                final Runnable runnable3 = this.f48107c;
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
                                    ((i) gVar3.f48113a).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) gVar3.f48113a).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) gVar3.f48113a;
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
