package rf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import bi.u6;
import com.google.android.gms.internal.cast.p;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.dd;
import qg.q0;
public final class b {
    public final int f41433a;
    public final e f41434b;

    public b(e eVar, int i10) {
        this.f41433a = i10;
        this.f41434b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f41433a) {
            case 0:
                final e eVar = this.f41434b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f41439a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f41439a);
                                    return;
                                }
                                eVar2.f41445j.f39919a.q().removeView(eVar2.f41442f);
                                eVar2.f41444i = null;
                                eVar2.f41442f = null;
                                eVar2.f41443g = null;
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
                                u6 u6Var = eVar2.h;
                                if (((dd) u6Var.e) != null) {
                                    ((View) u6Var.f3719a).setBackground(null);
                                    u6Var.e = null;
                                }
                                if (((dd) u6Var.d) == null && ((dd) u6Var.e) == null && (bitmap2 = (Bitmap) u6Var.f3721c) != null) {
                                    bitmap2.recycle();
                                    u6Var.f3721c = null;
                                }
                                eVar2.f41439a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f41449n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f41439a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f41439a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.z();
                                eVar3.f41445j.f39923g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f41439a = 2;
                                if (!eVar3.f41449n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                pf.e eVar5 = eVar4.f41445j;
                                if (eVar4.f41439a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f41439a);
                                    return;
                                }
                                eVar5.f39923g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f41442f.invalidate();
                                eVar4.f41439a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f39925j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f41434b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f41439a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f41439a);
                                    return;
                                }
                                eVar22.f41445j.f39919a.q().removeView(eVar22.f41442f);
                                eVar22.f41444i = null;
                                eVar22.f41442f = null;
                                eVar22.f41443g = null;
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
                                u6 u6Var = eVar22.h;
                                if (((dd) u6Var.e) != null) {
                                    ((View) u6Var.f3719a).setBackground(null);
                                    u6Var.e = null;
                                }
                                if (((dd) u6Var.d) == null && ((dd) u6Var.e) == null && (bitmap2 = (Bitmap) u6Var.f3721c) != null) {
                                    bitmap2.recycle();
                                    u6Var.f3721c = null;
                                }
                                eVar22.f41439a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f41449n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f41439a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f41439a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.z();
                                eVar3.f41445j.f39923g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f41439a = 2;
                                if (!eVar3.f41449n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                pf.e eVar5 = eVar4.f41445j;
                                if (eVar4.f41439a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f41439a);
                                    return;
                                }
                                eVar5.f39923g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f41442f.invalidate();
                                eVar4.f41439a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f39925j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                u6 u6Var = this.f41434b.h;
                if (((dd) u6Var.e) != null) {
                    ((View) u6Var.f3719a).setBackground(null);
                    u6Var.e = null;
                }
                if (((dd) u6Var.d) == null && ((dd) u6Var.e) == null && (bitmap = (Bitmap) u6Var.f3721c) != null) {
                    bitmap.recycle();
                    u6Var.f3721c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                u6 u6Var2 = this.f41434b.h;
                Objects.requireNonNull(u6Var2);
                AndroidUtilities.runOnUIThread(new q0(u6Var2, 7));
                return;
            default:
                final e eVar3 = this.f41434b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f41439a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f41439a);
                                    return;
                                }
                                eVar22.f41445j.f39919a.q().removeView(eVar22.f41442f);
                                eVar22.f41444i = null;
                                eVar22.f41442f = null;
                                eVar22.f41443g = null;
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
                                u6 u6Var3 = eVar22.h;
                                if (((dd) u6Var3.e) != null) {
                                    ((View) u6Var3.f3719a).setBackground(null);
                                    u6Var3.e = null;
                                }
                                if (((dd) u6Var3.d) == null && ((dd) u6Var3.e) == null && (bitmap2 = (Bitmap) u6Var3.f3721c) != null) {
                                    bitmap2.recycle();
                                    u6Var3.f3721c = null;
                                }
                                eVar22.f41439a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f41449n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f41439a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f41439a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.z();
                                eVar32.f41445j.f39923g.a(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f41439a = 2;
                                if (!eVar32.f41449n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                pf.e eVar5 = eVar4.f41445j;
                                if (eVar4.f41439a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f41439a);
                                    return;
                                }
                                eVar5.f39923g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f41442f.invalidate();
                                eVar4.f41439a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f39925j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
