package r9;

import java.util.concurrent.ExecutorService;
import k2.u;
public final class d implements Runnable {
    public final int f42111a;
    public final f f42112b;
    public final Runnable f42113c;
    public final u d;

    public d(f fVar, Runnable runnable, u uVar, int i10) {
        this.f42111a = i10;
        this.f42112b = fVar;
        this.f42113c = runnable;
        this.d = uVar;
    }

    @Override
    public final void run() {
        switch (this.f42111a) {
            case 0:
                ExecutorService executorService = this.f42112b.f42117a;
                final Runnable runnable = this.f42113c;
                final u uVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) uVar.f13371b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) uVar.f13371b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) uVar.f13371b;
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
                ExecutorService executorService2 = this.f42112b.f42117a;
                final Runnable runnable2 = this.f42113c;
                final u uVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) uVar2.f13371b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) uVar2.f13371b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) uVar2.f13371b;
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
                ExecutorService executorService3 = this.f42112b.f42117a;
                final Runnable runnable3 = this.f42113c;
                final u uVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) uVar3.f13371b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) uVar3.f13371b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) uVar3.f13371b;
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
