package r9;

import java.util.concurrent.ExecutorService;
import m.f3;
public final class d implements Runnable {
    public final int f47108a;
    public final f f47109b;
    public final Runnable f47110c;
    public final f3 d;

    public d(f fVar, Runnable runnable, f3 f3Var, int i10) {
        this.f47108a = i10;
        this.f47109b = fVar;
        this.f47110c = runnable;
        this.d = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f47108a) {
            case 0:
                ExecutorService executorService = this.f47109b.f47114a;
                final Runnable runnable = this.f47110c;
                final f3 f3Var = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) f3Var.f15668b).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) f3Var.f15668b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) f3Var.f15668b;
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
                ExecutorService executorService2 = this.f47109b.f47114a;
                final Runnable runnable2 = this.f47110c;
                final f3 f3Var2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) f3Var2.f15668b).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) f3Var2.f15668b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) f3Var2.f15668b;
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
                ExecutorService executorService3 = this.f47109b.f47114a;
                final Runnable runnable3 = this.f47110c;
                final f3 f3Var3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) f3Var3.f15668b).l(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) f3Var3.f15668b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) f3Var3.f15668b;
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
