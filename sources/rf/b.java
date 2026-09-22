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
import org.telegram.ui.web.r0;
public final class b {
    public final int f42542a;
    public final e f42543b;

    public b(e eVar, int i10) {
        this.f42542a = i10;
        this.f42543b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f42542a) {
            case 0:
                final e eVar = this.f42543b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f42548a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f42548a);
                                    return;
                                }
                                eVar2.f42554j.f41109a.q().removeView(eVar2.f42551f);
                                eVar2.f42553i = null;
                                eVar2.f42551f = null;
                                eVar2.f42552g = null;
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
                                    ((View) cVar.f4259a).setBackground(null);
                                    cVar.e = null;
                                }
                                if (((ed) cVar.d) == null && ((ed) cVar.e) == null && (bitmap2 = (Bitmap) cVar.f4261c) != null) {
                                    bitmap2.recycle();
                                    cVar.f4261c = null;
                                }
                                eVar2.f42548a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f42558n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f42548a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f42548a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.z();
                                eVar3.f42554j.f41113g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f42548a = 2;
                                if (!eVar3.f42558n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                pf.e eVar5 = eVar4.f42554j;
                                if (eVar4.f42548a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f42548a);
                                    return;
                                }
                                eVar5.f41113g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f42551f.invalidate();
                                eVar4.f42548a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f41115j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f42543b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f42548a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f42548a);
                                    return;
                                }
                                eVar22.f42554j.f41109a.q().removeView(eVar22.f42551f);
                                eVar22.f42553i = null;
                                eVar22.f42551f = null;
                                eVar22.f42552g = null;
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
                                    ((View) cVar.f4259a).setBackground(null);
                                    cVar.e = null;
                                }
                                if (((ed) cVar.d) == null && ((ed) cVar.e) == null && (bitmap2 = (Bitmap) cVar.f4261c) != null) {
                                    bitmap2.recycle();
                                    cVar.f4261c = null;
                                }
                                eVar22.f42548a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f42558n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f42548a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f42548a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.z();
                                eVar3.f42554j.f41113g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f42548a = 2;
                                if (!eVar3.f42558n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                pf.e eVar5 = eVar4.f42554j;
                                if (eVar4.f42548a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f42548a);
                                    return;
                                }
                                eVar5.f41113g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f42551f.invalidate();
                                eVar4.f42548a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f41115j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                cf.c cVar = this.f42543b.h;
                if (((ed) cVar.e) != null) {
                    ((View) cVar.f4259a).setBackground(null);
                    cVar.e = null;
                }
                if (((ed) cVar.d) == null && ((ed) cVar.e) == null && (bitmap = (Bitmap) cVar.f4261c) != null) {
                    bitmap.recycle();
                    cVar.f4261c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                cf.c cVar2 = this.f42543b.h;
                Objects.requireNonNull(cVar2);
                AndroidUtilities.runOnUIThread(new r0(cVar2, 25));
                return;
            default:
                final e eVar3 = this.f42543b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f42548a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f42548a);
                                    return;
                                }
                                eVar22.f42554j.f41109a.q().removeView(eVar22.f42551f);
                                eVar22.f42553i = null;
                                eVar22.f42551f = null;
                                eVar22.f42552g = null;
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
                                    ((View) cVar3.f4259a).setBackground(null);
                                    cVar3.e = null;
                                }
                                if (((ed) cVar3.d) == null && ((ed) cVar3.e) == null && (bitmap2 = (Bitmap) cVar3.f4261c) != null) {
                                    bitmap2.recycle();
                                    cVar3.f4261c = null;
                                }
                                eVar22.f42548a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f42558n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f42548a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f42548a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.z();
                                eVar32.f42554j.f41113g.a(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f42548a = 2;
                                if (!eVar32.f42558n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                pf.e eVar5 = eVar4.f42554j;
                                if (eVar4.f42548a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f42548a);
                                    return;
                                }
                                eVar5.f41113g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f42551f.invalidate();
                                eVar4.f42548a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f41115j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
