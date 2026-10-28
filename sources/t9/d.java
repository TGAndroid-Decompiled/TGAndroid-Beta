package t9;

import java.util.concurrent.ExecutorService;
import li.e3;
public final class d implements Runnable {
    public final int f48774a;
    public final f f48775b;
    public final Runnable f48776c;
    public final e3 d;

    public d(f fVar, Runnable runnable, e3 e3Var, int i10) {
        this.f48774a = i10;
        this.f48775b = fVar;
        this.f48776c = runnable;
        this.d = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f48774a) {
            case 0:
                ExecutorService executorService = this.f48775b.f48780a;
                final Runnable runnable = this.f48776c;
                final e3 e3Var = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) e3Var.f17209b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) e3Var.f17209b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) e3Var.f17209b;
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
                ExecutorService executorService2 = this.f48775b.f48780a;
                final Runnable runnable2 = this.f48776c;
                final e3 e3Var2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) e3Var2.f17209b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) e3Var2.f17209b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) e3Var2.f17209b;
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
                ExecutorService executorService3 = this.f48775b.f48780a;
                final Runnable runnable3 = this.f48776c;
                final e3 e3Var3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) e3Var3.f17209b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) e3Var3.f17209b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) e3Var3.f17209b;
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
