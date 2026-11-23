package v9;

import java.util.concurrent.ExecutorService;
import v4.f0;
public final class d implements Runnable {
    public final int f59359a;
    public final f f59360b;
    public final Runnable f59361c;
    public final f0 d;

    public d(f fVar, Runnable runnable, f0 f0Var, int i7) {
        this.f59359a = i7;
        this.f59360b = fVar;
        this.f59361c = runnable;
        this.d = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f59359a) {
            case 0:
                ExecutorService executorService = this.f59360b.f59365a;
                final Runnable runnable = this.f59361c;
                final f0 f0Var = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) f0Var.f59163a).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) f0Var.f59163a).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) f0Var.f59163a;
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
                ExecutorService executorService2 = this.f59360b.f59365a;
                final Runnable runnable2 = this.f59361c;
                final f0 f0Var2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) f0Var2.f59163a).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) f0Var2.f59163a).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) f0Var2.f59163a;
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
                ExecutorService executorService3 = this.f59360b.f59365a;
                final Runnable runnable3 = this.f59361c;
                final f0 f0Var3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) f0Var3.f59163a).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) f0Var3.f59163a).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) f0Var3.f59163a;
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
