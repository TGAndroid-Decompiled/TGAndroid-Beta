package s9;

import java.util.concurrent.ExecutorService;
import ji.d4;
public final class e implements Runnable {
    public final int f45058a;
    public final g f45059b;
    public final Runnable f45060c;
    public final d4 d;

    public e(g gVar, Runnable runnable, d4 d4Var, int i10) {
        this.f45058a = i10;
        this.f45059b = gVar;
        this.f45060c = runnable;
        this.d = d4Var;
    }

    @Override
    public final void run() {
        switch (this.f45058a) {
            case 0:
                ExecutorService executorService = this.f45059b.f45064a;
                final Runnable runnable = this.f45060c;
                final d4 d4Var = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) d4Var.f13233b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) d4Var.f13233b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) d4Var.f13233b;
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
                final d4 d4Var2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) d4Var2.f13233b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) d4Var2.f13233b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) d4Var2.f13233b;
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
                final d4 d4Var3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) d4Var3.f13233b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((i) d4Var3.f13233b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) d4Var3.f13233b;
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
