package u9;

import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.i9;
public final class e implements Runnable {
    public final int f55758a;
    public final g f55759b;
    public final Runnable f55760c;
    public final i9 d;

    public e(g gVar, Runnable runnable, i9 i9Var, int i3) {
        this.f55758a = i3;
        this.f55759b = gVar;
        this.f55760c = runnable;
        this.d = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f55758a) {
            case 0:
                ExecutorService executorService = this.f55759b.f55764a;
                final Runnable runnable = this.f55760c;
                final i9 i9Var = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) i9Var.f34636b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) i9Var.f34636b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) i9Var.f34636b;
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
                ExecutorService executorService2 = this.f55759b.f55764a;
                final Runnable runnable2 = this.f55760c;
                final i9 i9Var2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) i9Var2.f34636b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) i9Var2.f34636b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) i9Var2.f34636b;
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
                ExecutorService executorService3 = this.f55759b.f55764a;
                final Runnable runnable3 = this.f55760c;
                final i9 i9Var3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) i9Var3.f34636b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((i) i9Var3.f34636b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) i9Var3.f34636b;
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
