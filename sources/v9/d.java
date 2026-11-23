package v9;

import java.util.concurrent.ExecutorService;
import v4.e0;
public final class d implements Runnable {
    public final int f59322a;
    public final f f59323b;
    public final Runnable f59324c;
    public final e0 d;

    public d(f fVar, Runnable runnable, e0 e0Var, int i7) {
        this.f59322a = i7;
        this.f59323b = fVar;
        this.f59324c = runnable;
        this.d = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f59322a) {
            case 0:
                ExecutorService executorService = this.f59323b.f59328a;
                final Runnable runnable = this.f59324c;
                final e0 e0Var = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) e0Var.f59109a).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) e0Var.f59109a).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) e0Var.f59109a;
                                try {
                                    runnable2.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f59323b.f59328a;
                final Runnable runnable2 = this.f59324c;
                final e0 e0Var2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) e0Var2.f59109a).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) e0Var2.f59109a).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) e0Var2.f59109a;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f59323b.f59328a;
                final Runnable runnable3 = this.f59324c;
                final e0 e0Var3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) e0Var3.f59109a).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) e0Var3.f59109a).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) e0Var3.f59109a;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
