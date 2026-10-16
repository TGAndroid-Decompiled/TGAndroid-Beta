package s9;

import java.util.concurrent.ExecutorService;
public final class e implements Runnable {
    public final int f45058a;
    public final g f45059b;
    public final Runnable f45060c;
    public final m.h d;

    public e(g gVar, Runnable runnable, m.h hVar, int i10) {
        this.f45058a = i10;
        this.f45059b = gVar;
        this.f45060c = runnable;
        this.d = hVar;
    }

    @Override
    public final void run() {
        switch (this.f45058a) {
            case 0:
                ExecutorService executorService = this.f45059b.f45064a;
                final Runnable runnable = this.f45060c;
                final m.h hVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) hVar.f14848b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) hVar.f14848b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) hVar.f14848b;
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
                ExecutorService executorService2 = this.f45059b.f45064a;
                final Runnable runnable2 = this.f45060c;
                final m.h hVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) hVar2.f14848b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) hVar2.f14848b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) hVar2.f14848b;
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
                ExecutorService executorService3 = this.f45059b.f45064a;
                final Runnable runnable3 = this.f45060c;
                final m.h hVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) hVar3.f14848b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) hVar3.f14848b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) hVar3.f14848b;
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
