package v9;

import java.util.concurrent.ExecutorService;
import org.telegram.ui.Components.qt;
public final class d implements Runnable {
    public final int f57173a;
    public final f f57174b;
    public final Runnable f57175c;
    public final qt d;

    public d(f fVar, Runnable runnable, qt qtVar, int i7) {
        this.f57173a = i7;
        this.f57174b = fVar;
        this.f57175c = runnable;
        this.d = qtVar;
    }

    @Override
    public final void run() {
        switch (this.f57173a) {
            case 0:
                ExecutorService executorService = this.f57174b.f57179a;
                final Runnable runnable = this.f57175c;
                final qt qtVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) qtVar.f37389b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) qtVar.f37389b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) qtVar.f37389b;
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
                ExecutorService executorService2 = this.f57174b.f57179a;
                final Runnable runnable2 = this.f57175c;
                final qt qtVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) qtVar2.f37389b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) qtVar2.f37389b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) qtVar2.f37389b;
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
                ExecutorService executorService3 = this.f57174b.f57179a;
                final Runnable runnable3 = this.f57175c;
                final qt qtVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) qtVar3.f37389b).l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) qtVar3.f37389b).l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) qtVar3.f37389b;
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
