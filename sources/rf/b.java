package rf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.fd;
import org.telegram.ui.web.u0;
public final class b {
    public final int f46020a;
    public final e f46021b;

    public b(e eVar, int i10) {
        this.f46020a = i10;
        this.f46021b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f46020a) {
            case 0:
                final e eVar = this.f46021b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f46026a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f46026a);
                                    return;
                                }
                                eVar2.f46033j.f44417a.q().removeView(eVar2.f46030f);
                                eVar2.f46032i = null;
                                eVar2.f46030f = null;
                                eVar2.f46031g = null;
                                f fVar = eVar2.f46029e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar2.f46029e = null;
                                }
                                f fVar2 = eVar2.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar2.d = null;
                                }
                                cf.c cVar = eVar2.h;
                                if (((fd) cVar.f4606e) != null) {
                                    ((View) cVar.f4603a).setBackground(null);
                                    cVar.f4606e = null;
                                }
                                if (((fd) cVar.d) == null && ((fd) cVar.f4606e) == null && (bitmap2 = (Bitmap) cVar.f4605c) != null) {
                                    bitmap2.recycle();
                                    cVar.f4605c = null;
                                }
                                eVar2.f46026a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f46037n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f46026a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f46026a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.x();
                                eVar3.f46033j.f44422g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f46026a = 2;
                                if (!eVar3.f46037n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                pf.e eVar5 = eVar4.f46033j;
                                if (eVar4.f46026a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f46026a);
                                    return;
                                }
                                eVar5.f44422g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f46030f.invalidate();
                                eVar4.f46026a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f44424j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f46021b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f46026a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f46026a);
                                    return;
                                }
                                eVar22.f46033j.f44417a.q().removeView(eVar22.f46030f);
                                eVar22.f46032i = null;
                                eVar22.f46030f = null;
                                eVar22.f46031g = null;
                                f fVar = eVar22.f46029e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f46029e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                cf.c cVar = eVar22.h;
                                if (((fd) cVar.f4606e) != null) {
                                    ((View) cVar.f4603a).setBackground(null);
                                    cVar.f4606e = null;
                                }
                                if (((fd) cVar.d) == null && ((fd) cVar.f4606e) == null && (bitmap2 = (Bitmap) cVar.f4605c) != null) {
                                    bitmap2.recycle();
                                    cVar.f4605c = null;
                                }
                                eVar22.f46026a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f46037n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f46026a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f46026a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.x();
                                eVar3.f46033j.f44422g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f46026a = 2;
                                if (!eVar3.f46037n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                pf.e eVar5 = eVar4.f46033j;
                                if (eVar4.f46026a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f46026a);
                                    return;
                                }
                                eVar5.f44422g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f46030f.invalidate();
                                eVar4.f46026a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f44424j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                cf.c cVar = this.f46021b.h;
                if (((fd) cVar.f4606e) != null) {
                    ((View) cVar.f4603a).setBackground(null);
                    cVar.f4606e = null;
                }
                if (((fd) cVar.d) == null && ((fd) cVar.f4606e) == null && (bitmap = (Bitmap) cVar.f4605c) != null) {
                    bitmap.recycle();
                    cVar.f4605c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                cf.c cVar2 = this.f46021b.h;
                Objects.requireNonNull(cVar2);
                AndroidUtilities.runOnUIThread(new u0(cVar2, 25));
                return;
            default:
                final e eVar3 = this.f46021b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f46026a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f46026a);
                                    return;
                                }
                                eVar22.f46033j.f44417a.q().removeView(eVar22.f46030f);
                                eVar22.f46032i = null;
                                eVar22.f46030f = null;
                                eVar22.f46031g = null;
                                f fVar = eVar22.f46029e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f46029e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                cf.c cVar3 = eVar22.h;
                                if (((fd) cVar3.f4606e) != null) {
                                    ((View) cVar3.f4603a).setBackground(null);
                                    cVar3.f4606e = null;
                                }
                                if (((fd) cVar3.d) == null && ((fd) cVar3.f4606e) == null && (bitmap2 = (Bitmap) cVar3.f4605c) != null) {
                                    bitmap2.recycle();
                                    cVar3.f4605c = null;
                                }
                                eVar22.f46026a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f46037n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f46026a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f46026a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.x();
                                eVar32.f46033j.f44422g.a(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f46026a = 2;
                                if (!eVar32.f46037n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                pf.e eVar5 = eVar4.f46033j;
                                if (eVar4.f46026a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f46026a);
                                    return;
                                }
                                eVar5.f44422g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f46030f.invalidate();
                                eVar4.f46026a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f44424j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
