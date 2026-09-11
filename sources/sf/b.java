package sf;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.p;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.fd;
public final class b {
    public final int f45990a;
    public final e f45991b;

    public b(e eVar, int i10) {
        this.f45990a = i10;
        this.f45991b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f45990a) {
            case 0:
                final e eVar = this.f45991b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f45996a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f45996a);
                                    return;
                                }
                                eVar2.f46003j.f44353a.q().removeView(eVar2.f46000f);
                                eVar2.f46002i = null;
                                eVar2.f46000f = null;
                                eVar2.f46001g = null;
                                f fVar = eVar2.f45999e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar2.f45999e = null;
                                }
                                f fVar2 = eVar2.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar2.d = null;
                                }
                                cf.c cVar = eVar2.h;
                                if (((fd) cVar.f4799e) != null) {
                                    ((View) cVar.f4796a).setBackground(null);
                                    cVar.f4799e = null;
                                }
                                if (((fd) cVar.d) == null && ((fd) cVar.f4799e) == null && (bitmap2 = (Bitmap) cVar.f4798c) != null) {
                                    bitmap2.recycle();
                                    cVar.f4798c = null;
                                }
                                eVar2.f45996a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f46007n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f45996a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f45996a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.v();
                                eVar3.f46003j.f44358g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f45996a = 2;
                                if (!eVar3.f46007n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                qf.e eVar5 = eVar4.f46003j;
                                if (eVar4.f45996a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f45996a);
                                    return;
                                }
                                eVar5.f44358g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f46000f.invalidate();
                                eVar4.f45996a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f44360j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f45991b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f45996a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f45996a);
                                    return;
                                }
                                eVar22.f46003j.f44353a.q().removeView(eVar22.f46000f);
                                eVar22.f46002i = null;
                                eVar22.f46000f = null;
                                eVar22.f46001g = null;
                                f fVar = eVar22.f45999e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f45999e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                cf.c cVar = eVar22.h;
                                if (((fd) cVar.f4799e) != null) {
                                    ((View) cVar.f4796a).setBackground(null);
                                    cVar.f4799e = null;
                                }
                                if (((fd) cVar.d) == null && ((fd) cVar.f4799e) == null && (bitmap2 = (Bitmap) cVar.f4798c) != null) {
                                    bitmap2.recycle();
                                    cVar.f4798c = null;
                                }
                                eVar22.f45996a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f46007n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f45996a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f45996a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.v();
                                eVar3.f46003j.f44358g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f45996a = 2;
                                if (!eVar3.f46007n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                qf.e eVar5 = eVar4.f46003j;
                                if (eVar4.f45996a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f45996a);
                                    return;
                                }
                                eVar5.f44358g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f46000f.invalidate();
                                eVar4.f45996a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f44360j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                cf.c cVar = this.f45991b.h;
                if (((fd) cVar.f4799e) != null) {
                    ((View) cVar.f4796a).setBackground(null);
                    cVar.f4799e = null;
                }
                if (((fd) cVar.d) == null && ((fd) cVar.f4799e) == null && (bitmap = (Bitmap) cVar.f4798c) != null) {
                    bitmap.recycle();
                    cVar.f4798c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                cf.c cVar2 = this.f45991b.h;
                Objects.requireNonNull(cVar2);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(cVar2, 28));
                return;
            default:
                final e eVar3 = this.f45991b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f45996a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f45996a);
                                    return;
                                }
                                eVar22.f46003j.f44353a.q().removeView(eVar22.f46000f);
                                eVar22.f46002i = null;
                                eVar22.f46000f = null;
                                eVar22.f46001g = null;
                                f fVar = eVar22.f45999e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f45999e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                cf.c cVar3 = eVar22.h;
                                if (((fd) cVar3.f4799e) != null) {
                                    ((View) cVar3.f4796a).setBackground(null);
                                    cVar3.f4799e = null;
                                }
                                if (((fd) cVar3.d) == null && ((fd) cVar3.f4799e) == null && (bitmap2 = (Bitmap) cVar3.f4798c) != null) {
                                    bitmap2.recycle();
                                    cVar3.f4798c = null;
                                }
                                eVar22.f45996a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f46007n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f45996a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f45996a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.v();
                                eVar32.f46003j.f44358g.a(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f45996a = 2;
                                if (!eVar32.f46007n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                qf.e eVar5 = eVar4.f46003j;
                                if (eVar4.f45996a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f45996a);
                                    return;
                                }
                                eVar5.f44358g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f46000f.invalidate();
                                eVar4.f45996a = 4;
                                AndroidUtilities.doOnPreDraw(eVar5.f44360j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
