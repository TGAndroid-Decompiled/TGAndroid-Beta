package ze;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.vc;
import pf.o1;
public final class b {
    public final int f50433a;
    public final e f50434b;

    public b(e eVar, int i9) {
        this.f50433a = i9;
        this.f50434b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f50433a) {
            case 0:
                final e eVar = this.f50434b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f50439a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f50439a);
                                    return;
                                }
                                eVar2.f50446j.f49144a.b().removeView(eVar2.f50443f);
                                eVar2.f50445i = null;
                                eVar2.f50443f = null;
                                eVar2.f50444g = null;
                                f fVar = eVar2.f50442e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar2.f50442e = null;
                                }
                                f fVar2 = eVar2.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar2.d = null;
                                }
                                b3.b bVar = eVar2.h;
                                if (((vc) bVar.f1416e) != null) {
                                    ((View) bVar.f1413a).setBackground(null);
                                    bVar.f1416e = null;
                                }
                                if (((vc) bVar.d) == null && ((vc) bVar.f1416e) == null && (bitmap2 = (Bitmap) bVar.f1415c) != null) {
                                    bitmap2.recycle();
                                    bVar.f1415c = null;
                                }
                                eVar2.f50439a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f50450n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f50439a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f50439a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.z();
                                eVar3.f50446j.f49149g.g(new af.f(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f50439a = 2;
                                if (!eVar3.f50450n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                xe.d dVar = eVar4.f50446j;
                                if (eVar4.f50439a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f50439a);
                                    return;
                                }
                                dVar.f49149g.e(new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f50443f.invalidate();
                                eVar4.f50439a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f49151j, new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f50434b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f50439a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f50439a);
                                    return;
                                }
                                eVar22.f50446j.f49144a.b().removeView(eVar22.f50443f);
                                eVar22.f50445i = null;
                                eVar22.f50443f = null;
                                eVar22.f50444g = null;
                                f fVar = eVar22.f50442e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f50442e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                b3.b bVar = eVar22.h;
                                if (((vc) bVar.f1416e) != null) {
                                    ((View) bVar.f1413a).setBackground(null);
                                    bVar.f1416e = null;
                                }
                                if (((vc) bVar.d) == null && ((vc) bVar.f1416e) == null && (bitmap2 = (Bitmap) bVar.f1415c) != null) {
                                    bitmap2.recycle();
                                    bVar.f1415c = null;
                                }
                                eVar22.f50439a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f50450n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f50439a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f50439a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.z();
                                eVar3.f50446j.f49149g.g(new af.f(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f50439a = 2;
                                if (!eVar3.f50450n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                xe.d dVar = eVar4.f50446j;
                                if (eVar4.f50439a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f50439a);
                                    return;
                                }
                                dVar.f49149g.e(new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f50443f.invalidate();
                                eVar4.f50439a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f49151j, new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                b3.b bVar = this.f50434b.h;
                if (((vc) bVar.f1416e) != null) {
                    ((View) bVar.f1413a).setBackground(null);
                    bVar.f1416e = null;
                }
                if (((vc) bVar.d) == null && ((vc) bVar.f1416e) == null && (bitmap = (Bitmap) bVar.f1415c) != null) {
                    bitmap.recycle();
                    bVar.f1415c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                b3.b bVar2 = this.f50434b.h;
                Objects.requireNonNull(bVar2);
                AndroidUtilities.runOnUIThread(new o1(bVar2, 25));
                return;
            default:
                final e eVar3 = this.f50434b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f50439a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f50439a);
                                    return;
                                }
                                eVar22.f50446j.f49144a.b().removeView(eVar22.f50443f);
                                eVar22.f50445i = null;
                                eVar22.f50443f = null;
                                eVar22.f50444g = null;
                                f fVar = eVar22.f50442e;
                                if (fVar != null) {
                                    fVar.b();
                                    eVar22.f50442e = null;
                                }
                                f fVar2 = eVar22.d;
                                if (fVar2 != null) {
                                    fVar2.b();
                                    eVar22.d = null;
                                }
                                b3.b bVar3 = eVar22.h;
                                if (((vc) bVar3.f1416e) != null) {
                                    ((View) bVar3.f1413a).setBackground(null);
                                    bVar3.f1416e = null;
                                }
                                if (((vc) bVar3.d) == null && ((vc) bVar3.f1416e) == null && (bitmap2 = (Bitmap) bVar3.f1415c) != null) {
                                    bitmap2.recycle();
                                    bVar3.f1415c = null;
                                }
                                eVar22.f50439a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f50450n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f50439a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f50439a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.z();
                                eVar32.f50446j.f49149g.g(new af.f(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f50439a = 2;
                                if (!eVar32.f50450n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                xe.d dVar = eVar4.f50446j;
                                if (eVar4.f50439a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f50439a);
                                    return;
                                }
                                dVar.f49149g.e(new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f50443f.invalidate();
                                eVar4.f50439a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f49151j, new af.f(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
