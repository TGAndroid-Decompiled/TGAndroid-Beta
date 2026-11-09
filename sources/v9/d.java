package v9;

import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.rt;
public final class d implements Runnable {
    public final int f57278a;
    public final f f57279b;
    public final Runnable f57280c;
    public final rt d;

    public d(f fVar, Runnable runnable, rt rtVar, int i7) {
        this.f57278a = i7;
        this.f57279b = fVar;
        this.f57280c = runnable;
        this.d = rtVar;
    }

    @Override
    public final void run() {
        switch (this.f57278a) {
            case 0:
                ExecutorService executorService = this.f57279b.f57284a;
                final Runnable runnable = this.f57280c;
                final rt rtVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) rtVar.f37805b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) rtVar.f37805b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) rtVar.f37805b;
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
                ExecutorService executorService2 = this.f57279b.f57284a;
                final Runnable runnable2 = this.f57280c;
                final rt rtVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) rtVar2.f37805b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) rtVar2.f37805b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) rtVar2.f37805b;
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
                ExecutorService executorService3 = this.f57279b.f57284a;
                final Runnable runnable3 = this.f57280c;
                final rt rtVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) rtVar3.f37805b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) rtVar3.f37805b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) rtVar3.f37805b;
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
