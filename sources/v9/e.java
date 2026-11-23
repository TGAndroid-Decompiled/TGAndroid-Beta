package v9;

import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.nd0;
public final class e implements Runnable {
    public final int f59444a;
    public final g f59445b;
    public final Runnable f59446c;
    public final nd0 d;

    public e(g gVar, Runnable runnable, nd0 nd0Var, int i7) {
        this.f59444a = i7;
        this.f59445b = gVar;
        this.f59446c = runnable;
        this.d = nd0Var;
    }

    @Override
    public final void run() {
        switch (this.f59444a) {
            case 0:
                ExecutorService executorService = this.f59445b.f59450a;
                final Runnable runnable = this.f59446c;
                final nd0 nd0Var = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) nd0Var.f37766b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) nd0Var.f37766b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) nd0Var.f37766b;
                                try {
                                    runnable2.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f59445b.f59450a;
                final Runnable runnable2 = this.f59446c;
                final nd0 nd0Var2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) nd0Var2.f37766b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) nd0Var2.f37766b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) nd0Var2.f37766b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f59445b.f59450a;
                final Runnable runnable3 = this.f59446c;
                final nd0 nd0Var3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) nd0Var3.f37766b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) nd0Var3.f37766b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) nd0Var3.f37766b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e12) {
                                    iVar.l(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
