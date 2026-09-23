package rf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ed;
import org.telegram.ui.web.t0;
public final class b {
    public final int f42174a;
    public final e f42175b;

    public b(e eVar, int i10) {
        this.f42174a = i10;
        this.f42175b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f42174a) {
            case 0:
                final e eVar = this.f42175b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f42180a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f42180a);
                                    return;
                                }
                                eVar2.f42186j.f40744a.q().removeView(eVar2.f42183f);
                                eVar2.f42185i = null;
                                eVar2.f42183f = null;
                                eVar2.f42184g = null;
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
                                cf.c cVar = eVar2.h;
                                if (((ed) cVar.e) != null) {
                                    ((View) cVar.f4252a).setBackground(null);
                                    cVar.e = null;
                                }
                                if (((ed) cVar.d) == null && ((ed) cVar.e) == null && (bitmap2 = (Bitmap) cVar.f4254c) != null) {
                                    bitmap2.recycle();
                                    cVar.f4254c = null;
                                }
                                eVar2.f42180a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f42190n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f42180a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f42180a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.y();
                                eVar3.f42186j.f40748g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f42180a = 2;
                                if (!eVar3.f42190n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                pf.e eVar5 = eVar4.f42186j;
                                if (eVar4.f42180a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f42180a);
                                    return;
                                }
                                eVar5.f40748g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f42183f.invalidate();
                                eVar4.f42180a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f40750j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f42175b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f42180a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f42180a);
                                    return;
                                }
                                eVar22.f42186j.f40744a.q().removeView(eVar22.f42183f);
                                eVar22.f42185i = null;
                                eVar22.f42183f = null;
                                eVar22.f42184g = null;
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
                                cf.c cVar = eVar22.h;
                                if (((ed) cVar.e) != null) {
                                    ((View) cVar.f4252a).setBackground(null);
                                    cVar.e = null;
                                }
                                if (((ed) cVar.d) == null && ((ed) cVar.e) == null && (bitmap2 = (Bitmap) cVar.f4254c) != null) {
                                    bitmap2.recycle();
                                    cVar.f4254c = null;
                                }
                                eVar22.f42180a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f42190n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f42180a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f42180a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.y();
                                eVar3.f42186j.f40748g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f42180a = 2;
                                if (!eVar3.f42190n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                pf.e eVar5 = eVar4.f42186j;
                                if (eVar4.f42180a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f42180a);
                                    return;
                                }
                                eVar5.f40748g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f42183f.invalidate();
                                eVar4.f42180a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f40750j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                cf.c cVar = this.f42175b.h;
                if (((ed) cVar.e) != null) {
                    ((View) cVar.f4252a).setBackground(null);
                    cVar.e = null;
                }
                if (((ed) cVar.d) == null && ((ed) cVar.e) == null && (bitmap = (Bitmap) cVar.f4254c) != null) {
                    bitmap.recycle();
                    cVar.f4254c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                cf.c cVar2 = this.f42175b.h;
                Objects.requireNonNull(cVar2);
                AndroidUtilities.runOnUIThread(new t0(cVar2, 24));
                return;
            default:
                final e eVar3 = this.f42175b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f42180a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f42180a);
                                    return;
                                }
                                eVar22.f42186j.f40744a.q().removeView(eVar22.f42183f);
                                eVar22.f42185i = null;
                                eVar22.f42183f = null;
                                eVar22.f42184g = null;
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
                                cf.c cVar3 = eVar22.h;
                                if (((ed) cVar3.e) != null) {
                                    ((View) cVar3.f4252a).setBackground(null);
                                    cVar3.e = null;
                                }
                                if (((ed) cVar3.d) == null && ((ed) cVar3.e) == null && (bitmap2 = (Bitmap) cVar3.f4254c) != null) {
                                    bitmap2.recycle();
                                    cVar3.f4254c = null;
                                }
                                eVar22.f42180a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f42190n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f42180a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f42180a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.y();
                                eVar32.f42186j.f40748g.a(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f42180a = 2;
                                if (!eVar32.f42190n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                pf.e eVar5 = eVar4.f42186j;
                                if (eVar4.f42180a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f42180a);
                                    return;
                                }
                                eVar5.f40748g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f42183f.invalidate();
                                eVar4.f42180a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f40750j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
