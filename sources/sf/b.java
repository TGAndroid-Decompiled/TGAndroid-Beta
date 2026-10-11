package sf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import ci.u5;
import com.google.android.gms.internal.cast.p;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.hd;
import rg.x1;
public final class b {
    public final int f48098a;
    public final e f48099b;

    public b(e eVar, int i10) {
        this.f48098a = i10;
        this.f48099b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f48098a) {
            case 0:
                final e eVar = this.f48099b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f48104a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f48104a);
                                    return;
                                }
                                eVar2.f48111j.f46274a.q().removeView(eVar2.f48108f);
                                eVar2.f48110i = null;
                                eVar2.f48108f = null;
                                eVar2.f48109g = null;
                                f fVar = eVar2.f48107e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar2.f48107e = null;
                                }
                                f fVar2 = eVar2.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar2.d = null;
                                }
                                u5 u5Var = eVar2.h;
                                if (((hd) u5Var.f6067e) != null) {
                                    ((View) u5Var.f6064a).setBackground(null);
                                    u5Var.f6067e = null;
                                }
                                if (((hd) u5Var.d) == null && ((hd) u5Var.f6067e) == null && (bitmap2 = (Bitmap) u5Var.f6066c) != null) {
                                    bitmap2.recycle();
                                    u5Var.f6066c = null;
                                }
                                eVar2.f48104a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f48115n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f48104a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f48104a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.B();
                                eVar3.f48111j.f46279g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f48104a = 2;
                                if (!eVar3.f48115n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                qf.e eVar5 = eVar4.f48111j;
                                if (eVar4.f48104a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f48104a);
                                    return;
                                }
                                eVar5.f46279g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f48108f.invalidate();
                                eVar4.f48104a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f46281j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f48099b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f48104a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f48104a);
                                    return;
                                }
                                eVar22.f48111j.f46274a.q().removeView(eVar22.f48108f);
                                eVar22.f48110i = null;
                                eVar22.f48108f = null;
                                eVar22.f48109g = null;
                                f fVar = eVar22.f48107e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f48107e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                u5 u5Var = eVar22.h;
                                if (((hd) u5Var.f6067e) != null) {
                                    ((View) u5Var.f6064a).setBackground(null);
                                    u5Var.f6067e = null;
                                }
                                if (((hd) u5Var.d) == null && ((hd) u5Var.f6067e) == null && (bitmap2 = (Bitmap) u5Var.f6066c) != null) {
                                    bitmap2.recycle();
                                    u5Var.f6066c = null;
                                }
                                eVar22.f48104a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f48115n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f48104a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f48104a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.B();
                                eVar3.f48111j.f46279g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f48104a = 2;
                                if (!eVar3.f48115n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                qf.e eVar5 = eVar4.f48111j;
                                if (eVar4.f48104a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f48104a);
                                    return;
                                }
                                eVar5.f46279g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f48108f.invalidate();
                                eVar4.f48104a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f46281j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                u5 u5Var = this.f48099b.h;
                if (((hd) u5Var.f6067e) != null) {
                    ((View) u5Var.f6064a).setBackground(null);
                    u5Var.f6067e = null;
                }
                if (((hd) u5Var.d) == null && ((hd) u5Var.f6067e) == null && (bitmap = (Bitmap) u5Var.f6066c) != null) {
                    bitmap.recycle();
                    u5Var.f6066c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                u5 u5Var2 = this.f48099b.h;
                Objects.requireNonNull(u5Var2);
                AndroidUtilities.runOnUIThread(new x1(u5Var2, 2));
                return;
            default:
                final e eVar3 = this.f48099b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f48104a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f48104a);
                                    return;
                                }
                                eVar22.f48111j.f46274a.q().removeView(eVar22.f48108f);
                                eVar22.f48110i = null;
                                eVar22.f48108f = null;
                                eVar22.f48109g = null;
                                f fVar = eVar22.f48107e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f48107e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                u5 u5Var3 = eVar22.h;
                                if (((hd) u5Var3.f6067e) != null) {
                                    ((View) u5Var3.f6064a).setBackground(null);
                                    u5Var3.f6067e = null;
                                }
                                if (((hd) u5Var3.d) == null && ((hd) u5Var3.f6067e) == null && (bitmap2 = (Bitmap) u5Var3.f6066c) != null) {
                                    bitmap2.recycle();
                                    u5Var3.f6066c = null;
                                }
                                eVar22.f48104a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f48115n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f48104a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f48104a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.B();
                                eVar32.f48111j.f46279g.a(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f48104a = 2;
                                if (!eVar32.f48115n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                qf.e eVar5 = eVar4.f48111j;
                                if (eVar4.f48104a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f48104a);
                                    return;
                                }
                                eVar5.f46279g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f48108f.invalidate();
                                eVar4.f48104a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f46281j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
