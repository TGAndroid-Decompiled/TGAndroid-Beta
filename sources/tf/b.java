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
import org.telegram.ui.Components.ed;
import org.telegram.ui.web.z1;
public final class b {
    public final int f47049a;
    public final e f47050b;

    public b(e eVar, int i10) {
        this.f47049a = i10;
        this.f47050b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f47049a) {
            case 0:
                final e eVar = this.f47050b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f47055a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f47055a);
                                    return;
                                }
                                eVar2.f47061j.f45309a.v().removeView(eVar2.f47058f);
                                eVar2.f47060i = null;
                                eVar2.f47058f = null;
                                eVar2.f47059g = null;
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
                                if (((ed) z5Var.e) != null) {
                                    ((View) z5Var.f6884b).setBackground(null);
                                    z5Var.e = null;
                                }
                                if (((ed) z5Var.d) == null && ((ed) z5Var.e) == null && (bitmap2 = (Bitmap) z5Var.f6883a) != null) {
                                    bitmap2.recycle();
                                    z5Var.f6883a = null;
                                }
                                eVar2.f47055a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f47065n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f47055a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f47055a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.A();
                                eVar3.f47061j.f45313g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f47055a = 2;
                                if (!eVar3.f47065n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                rf.d dVar = eVar4.f47061j;
                                if (eVar4.f47055a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f47055a);
                                    return;
                                }
                                dVar.f45313g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f47058f.invalidate();
                                eVar4.f47055a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f45315j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f47050b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f47055a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f47055a);
                                    return;
                                }
                                eVar22.f47061j.f45309a.v().removeView(eVar22.f47058f);
                                eVar22.f47060i = null;
                                eVar22.f47058f = null;
                                eVar22.f47059g = null;
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
                                if (((ed) z5Var.e) != null) {
                                    ((View) z5Var.f6884b).setBackground(null);
                                    z5Var.e = null;
                                }
                                if (((ed) z5Var.d) == null && ((ed) z5Var.e) == null && (bitmap2 = (Bitmap) z5Var.f6883a) != null) {
                                    bitmap2.recycle();
                                    z5Var.f6883a = null;
                                }
                                eVar22.f47055a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f47065n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f47055a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f47055a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.A();
                                eVar3.f47061j.f45313g.a(new p(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f47055a = 2;
                                if (!eVar3.f47065n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                rf.d dVar = eVar4.f47061j;
                                if (eVar4.f47055a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f47055a);
                                    return;
                                }
                                dVar.f45313g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f47058f.invalidate();
                                eVar4.f47055a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f45315j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                z5 z5Var = this.f47050b.h;
                if (((ed) z5Var.e) != null) {
                    ((View) z5Var.f6884b).setBackground(null);
                    z5Var.e = null;
                }
                if (((ed) z5Var.d) == null && ((ed) z5Var.e) == null && (bitmap = (Bitmap) z5Var.f6883a) != null) {
                    bitmap.recycle();
                    z5Var.f6883a = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                z5 z5Var2 = this.f47050b.h;
                Objects.requireNonNull(z5Var2);
                AndroidUtilities.runOnUIThread(new z1(z5Var2, 28));
                return;
            default:
                final e eVar3 = this.f47050b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f47055a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f47055a);
                                    return;
                                }
                                eVar22.f47061j.f45309a.v().removeView(eVar22.f47058f);
                                eVar22.f47060i = null;
                                eVar22.f47058f = null;
                                eVar22.f47059g = null;
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
                                if (((ed) z5Var3.e) != null) {
                                    ((View) z5Var3.f6884b).setBackground(null);
                                    z5Var3.e = null;
                                }
                                if (((ed) z5Var3.d) == null && ((ed) z5Var3.e) == null && (bitmap2 = (Bitmap) z5Var3.f6883a) != null) {
                                    bitmap2.recycle();
                                    z5Var3.f6883a = null;
                                }
                                eVar22.f47055a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f47065n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f47055a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f47055a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.A();
                                eVar32.f47061j.f45313g.a(new p(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f47055a = 2;
                                if (!eVar32.f47065n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                rf.d dVar = eVar4.f47061j;
                                if (eVar4.f47055a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f47055a);
                                    return;
                                }
                                dVar.f45313g.b(new p(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f47058f.invalidate();
                                eVar4.f47055a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f45315j, new p(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
