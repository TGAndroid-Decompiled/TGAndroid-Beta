package s9;

import java.util.concurrent.ExecutorService;
public final class d implements Runnable {
    public final int f46134a;
    public final f f46135b;
    public final Runnable f46136c;
    public final le.b d;

    public d(f fVar, Runnable runnable, le.b bVar, int i10) {
        this.f46134a = i10;
        this.f46135b = fVar;
        this.f46136c = runnable;
        this.d = bVar;
    }

    @Override
    public final void run() {
        switch (this.f46134a) {
            case 0:
                ExecutorService executorService = this.f46135b.f46140a;
                final Runnable runnable = this.f46136c;
                final le.b bVar = this.d;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) bVar.f16009b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) bVar.f16009b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) bVar.f16009b;
                                try {
                                    runnable2.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f46135b.f46140a;
                final Runnable runnable2 = this.f46136c;
                final le.b bVar2 = this.d;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) bVar2.f16009b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) bVar2.f16009b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) bVar2.f16009b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f46135b.f46140a;
                final Runnable runnable3 = this.f46136c;
                final le.b bVar3 = this.d;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) bVar3.f16009b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) bVar3.f16009b).l(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) bVar3.f16009b;
                                try {
                                    runnable22.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.l(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
