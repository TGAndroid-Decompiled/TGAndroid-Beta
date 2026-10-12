package tf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.z5;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.gd;
import rh.j;
public final class b {
    public final int f45640a;
    public final e f45641b;

    public b(e eVar, int i10) {
        this.f45640a = i10;
        this.f45641b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f45640a) {
            case 0:
                final e eVar = this.f45641b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f45646a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f45646a);
                                    return;
                                }
                                eVar2.f45652j.f44174a.q().removeView(eVar2.f45649f);
                                eVar2.f45651i = null;
                                eVar2.f45649f = null;
                                eVar2.f45650g = null;
                                f fVar = eVar2.e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar2.e = null;
                                }
                                f fVar2 = eVar2.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar2.d = null;
                                }
                                z5 z5Var = eVar2.h;
                                if (((gd) z5Var.e) != null) {
                                    ((View) z5Var.f5426b).setBackground(null);
                                    z5Var.e = null;
                                }
                                if (((gd) z5Var.d) == null && ((gd) z5Var.e) == null && (bitmap2 = (Bitmap) z5Var.f5425a) != null) {
                                    bitmap2.recycle();
                                    z5Var.f5425a = null;
                                }
                                eVar2.f45646a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f45656n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f45646a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f45646a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.z();
                                eVar3.f45652j.f44178g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f45646a = 2;
                                if (!eVar3.f45656n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                rf.d dVar = eVar4.f45652j;
                                if (eVar4.f45646a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f45646a);
                                    return;
                                }
                                dVar.f44178g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f45649f.invalidate();
                                eVar4.f45646a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f44180j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f45641b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f45646a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f45646a);
                                    return;
                                }
                                eVar22.f45652j.f44174a.q().removeView(eVar22.f45649f);
                                eVar22.f45651i = null;
                                eVar22.f45649f = null;
                                eVar22.f45650g = null;
                                f fVar = eVar22.e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                z5 z5Var = eVar22.h;
                                if (((gd) z5Var.e) != null) {
                                    ((View) z5Var.f5426b).setBackground(null);
                                    z5Var.e = null;
                                }
                                if (((gd) z5Var.d) == null && ((gd) z5Var.e) == null && (bitmap2 = (Bitmap) z5Var.f5425a) != null) {
                                    bitmap2.recycle();
                                    z5Var.f5425a = null;
                                }
                                eVar22.f45646a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f45656n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f45646a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f45646a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.z();
                                eVar3.f45652j.f44178g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f45646a = 2;
                                if (!eVar3.f45656n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                rf.d dVar = eVar4.f45652j;
                                if (eVar4.f45646a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f45646a);
                                    return;
                                }
                                dVar.f44178g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f45649f.invalidate();
                                eVar4.f45646a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f44180j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                z5 z5Var = this.f45641b.h;
                if (((gd) z5Var.e) != null) {
                    ((View) z5Var.f5426b).setBackground(null);
                    z5Var.e = null;
                }
                if (((gd) z5Var.d) == null && ((gd) z5Var.e) == null && (bitmap = (Bitmap) z5Var.f5425a) != null) {
                    bitmap.recycle();
                    z5Var.f5425a = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                z5 z5Var2 = this.f45641b.h;
                Objects.requireNonNull(z5Var2);
                AndroidUtilities.runOnUIThread(new j(z5Var2, 8));
                return;
            default:
                final e eVar3 = this.f45641b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f45646a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f45646a);
                                    return;
                                }
                                eVar22.f45652j.f44174a.q().removeView(eVar22.f45649f);
                                eVar22.f45651i = null;
                                eVar22.f45649f = null;
                                eVar22.f45650g = null;
                                f fVar = eVar22.e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                z5 z5Var3 = eVar22.h;
                                if (((gd) z5Var3.e) != null) {
                                    ((View) z5Var3.f5426b).setBackground(null);
                                    z5Var3.e = null;
                                }
                                if (((gd) z5Var3.d) == null && ((gd) z5Var3.e) == null && (bitmap2 = (Bitmap) z5Var3.f5425a) != null) {
                                    bitmap2.recycle();
                                    z5Var3.f5425a = null;
                                }
                                eVar22.f45646a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f45656n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f45646a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f45646a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.z();
                                eVar32.f45652j.f44178g.a(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f45646a = 2;
                                if (!eVar32.f45656n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                rf.d dVar = eVar4.f45652j;
                                if (eVar4.f45646a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f45646a);
                                    return;
                                }
                                dVar.f44178g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f45649f.invalidate();
                                eVar4.f45646a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f44180j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
