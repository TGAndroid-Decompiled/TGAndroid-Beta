package uf;

import a8.fg;
import a8.me;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.dd;
import ti.g;
public final class b {
    public final int f49751a;
    public final e f49752b;

    public b(e eVar, int i10) {
        this.f49751a = i10;
        this.f49752b = eVar;
    }

    public final void a(boolean z10) {
        Bitmap bitmap;
        switch (this.f49751a) {
            case 0:
                final e eVar = this.f49752b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar2 = eVar;
                                if (eVar2.f49757a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar2.f49757a);
                                    return;
                                }
                                eVar2.f49763j.f48166a.o().removeView(eVar2.f49760f);
                                eVar2.f49762i = null;
                                eVar2.f49760f = null;
                                eVar2.f49761g = null;
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
                                me meVar = eVar2.h;
                                if (((dd) meVar.e) != null) {
                                    ((View) meVar.f614a).setBackground(null);
                                    meVar.e = null;
                                }
                                if (((dd) meVar.d) == null && ((dd) meVar.e) == null && (bitmap2 = (Bitmap) meVar.f616c) != null) {
                                    bitmap2.recycle();
                                    meVar.f616c = null;
                                }
                                eVar2.f49757a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar2.f49767n) {
                                    eVar2.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar;
                                if (eVar3.f49757a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f49757a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.A();
                                eVar3.f49763j.f48170g.a(new fg(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f49757a = 2;
                                if (!eVar3.f49767n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar;
                                sf.d dVar = eVar4.f49763j;
                                if (eVar4.f49757a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f49757a);
                                    return;
                                }
                                dVar.f48170g.b(new fg(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f49760f.invalidate();
                                eVar4.f49757a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f48172j, new fg(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 1:
                final e eVar2 = this.f49752b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar2;
                                if (eVar22.f49757a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f49757a);
                                    return;
                                }
                                eVar22.f49763j.f48166a.o().removeView(eVar22.f49760f);
                                eVar22.f49762i = null;
                                eVar22.f49760f = null;
                                eVar22.f49761g = null;
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
                                me meVar = eVar22.h;
                                if (((dd) meVar.e) != null) {
                                    ((View) meVar.f614a).setBackground(null);
                                    meVar.e = null;
                                }
                                if (((dd) meVar.d) == null && ((dd) meVar.e) == null && (bitmap2 = (Bitmap) meVar.f616c) != null) {
                                    bitmap2.recycle();
                                    meVar.f616c = null;
                                }
                                eVar22.f49757a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f49767n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar3 = eVar2;
                                if (eVar3.f49757a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar3.f49757a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar3.h.A();
                                eVar3.f49763j.f48170g.a(new fg(ApplicationLoader.applicationHandler, new b(eVar3, 2), 400L));
                                eVar3.f49757a = 2;
                                if (!eVar3.f49767n) {
                                    eVar3.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar2;
                                sf.d dVar = eVar4.f49763j;
                                if (eVar4.f49757a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f49757a);
                                    return;
                                }
                                dVar.f48170g.b(new fg(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f49760f.invalidate();
                                eVar4.f49757a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f48172j, new fg(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
            case 2:
                me meVar = this.f49752b.h;
                if (((dd) meVar.e) != null) {
                    ((View) meVar.f614a).setBackground(null);
                    meVar.e = null;
                }
                if (((dd) meVar.d) == null && ((dd) meVar.e) == null && (bitmap = (Bitmap) meVar.f616c) != null) {
                    bitmap.recycle();
                    meVar.f616c = null;
                }
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z10);
                return;
            case 3:
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z10);
                me meVar2 = this.f49752b.h;
                Objects.requireNonNull(meVar2);
                AndroidUtilities.runOnUIThread(new g(meVar2, 1));
                return;
            default:
                final e eVar3 = this.f49752b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap2;
                        switch (r2) {
                            case 0:
                                e eVar22 = eVar3;
                                if (eVar22.f49757a != 4) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + eVar22.f49757a);
                                    return;
                                }
                                eVar22.f49763j.f48166a.o().removeView(eVar22.f49760f);
                                eVar22.f49762i = null;
                                eVar22.f49760f = null;
                                eVar22.f49761g = null;
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
                                me meVar3 = eVar22.h;
                                if (((dd) meVar3.e) != null) {
                                    ((View) meVar3.f614a).setBackground(null);
                                    meVar3.e = null;
                                }
                                if (((dd) meVar3.d) == null && ((dd) meVar3.e) == null && (bitmap2 = (Bitmap) meVar3.f616c) != null) {
                                    bitmap2.recycle();
                                    meVar3.f616c = null;
                                }
                                eVar22.f49757a = 0;
                                Log.i("PIP_DEBUG", "[HANDLER] detach");
                                if (eVar22.f49767n) {
                                    eVar22.g();
                                    return;
                                }
                                return;
                            case 1:
                                e eVar32 = eVar3;
                                if (eVar32.f49757a != 1) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + eVar32.f49757a);
                                    return;
                                }
                                Log.i("PIP_DEBUG", "[HANDLER] attach");
                                eVar32.h.A();
                                eVar32.f49763j.f48170g.a(new fg(ApplicationLoader.applicationHandler, new b(eVar32, 2), 400L));
                                eVar32.f49757a = 2;
                                if (!eVar32.f49767n) {
                                    eVar32.h();
                                    return;
                                }
                                return;
                            default:
                                e eVar4 = eVar3;
                                sf.d dVar = eVar4.f49763j;
                                if (eVar4.f49757a != 3) {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + eVar4.f49757a);
                                    return;
                                }
                                dVar.f48170g.b(new fg(ApplicationLoader.applicationHandler, new b(eVar4, 3), 400L));
                                eVar4.f49760f.invalidate();
                                eVar4.f49757a = 4;
                                AndroidUtilities.doOnPreDraw(dVar.f48172j, new fg(ApplicationLoader.applicationHandler, new b(eVar4, 4), 300L));
                                Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                return;
                        }
                    }
                });
                return;
        }
    }
}
