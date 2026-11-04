package wf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import b8.cg;
import b8.ke;
import j$.util.Objects;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.mc;
import r4.u;
public final class b {
    public final int f57564a;
    public final e f57565b;

    public b(e eVar, int i3) {
        this.f57564a = i3;
        this.f57565b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f57564a) {
            case 0:
                final e eVar = this.f57565b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f57570a != 4) {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f57570a);
                                    return;
                                }
                                eVar2.f57577j.f55849a.h().removeView(eVar2.f57574f);
                                eVar2.f57576i = null;
                                eVar2.f57574f = null;
                                eVar2.f57575g = null;
                                f fVar = eVar2.f57573e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar2.f57573e = null;
                                }
                                f fVar2 = eVar2.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar2.d = null;
                                }
                                ke keVar = eVar2.h;
                                if (((mc) keVar.f2719f) != null) {
                                    ((View) keVar.f2716b).setBackground(null);
                                    keVar.f2719f = null;
                                }
                                if (((mc) keVar.f2718e) == null && ((mc) keVar.f2719f) == null && (bitmap2 = (Bitmap) keVar.d) != null) {
                                    bitmap2.recycle();
                                    keVar.d = null;
                                }
                                eVar2.f57570a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f57581n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f57570a != 1) {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f57570a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.L();
                                eVar3.f57577j.f55854g.c(new cg(t0.d, new b(eVar3, 2), 400L));
                                eVar3.f57570a = 2;
                                if (!eVar3.f57581n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                uf.d dVar = eVar4.f57577j;
                                if (eVar4.f57570a != 3) {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f57570a);
                                    return;
                                }
                                dVar.f55854g.r(new cg(t0.d, new b(eVar4, 3), 400L));
                                eVar4.f57574f.invalidate();
                                eVar4.f57570a = 4;
                                g0.K(dVar.f55856j, new cg(t0.d, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f57565b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f57570a != 4) {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f57570a);
                                    return;
                                }
                                eVar22.f57577j.f55849a.h().removeView(eVar22.f57574f);
                                eVar22.f57576i = null;
                                eVar22.f57574f = null;
                                eVar22.f57575g = null;
                                f fVar = eVar22.f57573e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f57573e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                ke keVar = eVar22.h;
                                if (((mc) keVar.f2719f) != null) {
                                    ((View) keVar.f2716b).setBackground(null);
                                    keVar.f2719f = null;
                                }
                                if (((mc) keVar.f2718e) == null && ((mc) keVar.f2719f) == null && (bitmap2 = (Bitmap) keVar.d) != null) {
                                    bitmap2.recycle();
                                    keVar.d = null;
                                }
                                eVar22.f57570a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f57581n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f57570a != 1) {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f57570a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.L();
                                eVar3.f57577j.f55854g.c(new cg(t0.d, new b(eVar3, 2), 400L));
                                eVar3.f57570a = 2;
                                if (!eVar3.f57581n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                uf.d dVar = eVar4.f57577j;
                                if (eVar4.f57570a != 3) {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f57570a);
                                    return;
                                }
                                dVar.f55854g.r(new cg(t0.d, new b(eVar4, 3), 400L));
                                eVar4.f57574f.invalidate();
                                eVar4.f57570a = 4;
                                g0.K(dVar.f55856j, new cg(t0.d, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                ke keVar = this.f57565b.h;
                if (((mc) keVar.f2719f) != null) {
                    ((View) keVar.f2716b).setBackground(null);
                    keVar.f2719f = null;
                }
                if (((mc) keVar.f2718e) == null && ((mc) keVar.f2719f) == null && (bitmap = (Bitmap) keVar.d) != null) {
                    bitmap.recycle();
                    keVar.d = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                ke keVar2 = this.f57565b.h;
                Objects.requireNonNull(keVar2);
                g0.h3(new u(keVar2, 24));
                return;
            default:
                final e eVar3 = this.f57565b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f57570a != 4) {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f57570a);
                                    return;
                                }
                                eVar22.f57577j.f55849a.h().removeView(eVar22.f57574f);
                                eVar22.f57576i = null;
                                eVar22.f57574f = null;
                                eVar22.f57575g = null;
                                f fVar = eVar22.f57573e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f57573e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                ke keVar3 = eVar22.h;
                                if (((mc) keVar3.f2719f) != null) {
                                    ((View) keVar3.f2716b).setBackground(null);
                                    keVar3.f2719f = null;
                                }
                                if (((mc) keVar3.f2718e) == null && ((mc) keVar3.f2719f) == null && (bitmap2 = (Bitmap) keVar3.d) != null) {
                                    bitmap2.recycle();
                                    keVar3.d = null;
                                }
                                eVar22.f57570a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f57581n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f57570a != 1) {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f57570a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.L();
                                eVar32.f57577j.f55854g.c(new cg(t0.d, new b(eVar32, 2), 400L));
                                eVar32.f57570a = 2;
                                if (!eVar32.f57581n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                uf.d dVar = eVar4.f57577j;
                                if (eVar4.f57570a != 3) {
                                    a8.d("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f57570a);
                                    return;
                                }
                                dVar.f55854g.r(new cg(t0.d, new b(eVar4, 3), 400L));
                                eVar4.f57574f.invalidate();
                                eVar4.f57570a = 4;
                                g0.K(dVar.f55856j, new cg(t0.d, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
