package t9;

import java.util.concurrent.ExecutorService;
import li.e3;
public final class d implements Runnable {
    public final int f48736a;
    public final f f48737b;
    public final Runnable f48738c;
    public final e3 d;

    public d(f fVar, Runnable runnable, e3 e3Var, int i10) {
        this.f48736a = i10;
        this.f48737b = fVar;
        this.f48738c = runnable;
        this.d = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f48736a) {
            case 0:
                ExecutorService executorService = this.f48737b.f48742a;
                final Runnable runnable = this.f48738c;
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
                                    ((h) e3Var.f17210b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) e3Var.f17210b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) e3Var.f17210b;
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
                ExecutorService executorService2 = this.f48737b.f48742a;
                final Runnable runnable2 = this.f48738c;
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
                                    ((h) e3Var2.f17210b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) e3Var2.f17210b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) e3Var2.f17210b;
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
                ExecutorService executorService3 = this.f48737b.f48742a;
                final Runnable runnable3 = this.f48738c;
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
                                    ((h) e3Var3.f17210b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) e3Var3.f17210b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) e3Var3.f17210b;
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
