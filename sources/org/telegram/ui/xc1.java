package org.telegram.ui;

import android.animation.ValueAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class xc1 extends org.telegram.ui.ActionBar.j {
    public final jd1 f39959a;

    public xc1(jd1 jd1Var) {
        this.f39959a = jd1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.h6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        jd1 jd1Var = this.f39959a;
        org.telegram.ui.ActionBar.h6 h6Var = jd1Var.f35225s;
        int i12 = 0;
        if (i10 == -1) {
            if (jd1Var.Q0(true)) {
                jd1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            jd1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (jd1Var.v) {
                org.telegram.ui.ActionBar.j6.p1(false);
            }
            File d = h6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = jd1Var.T0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            h6Var.f19747o = str2;
            h6Var.f19748p = jd1Var.f35206i1;
            h6Var.f19749q = jd1Var.B1;
            if (((int) h6Var.f19742j) == 0) {
                h6Var.f19742j = 4294967296L;
            }
            if (((int) h6Var.f19743k) == 0) {
                h6Var.f19743k = 4294967296L;
            }
            if (((int) h6Var.f19744l) == 0) {
                h6Var.f19744l = 4294967296L;
            }
            if (((int) h6Var.f19745m) == 0) {
                h6Var.f19745m = 4294967296L;
            }
            jd1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(jd1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.j6.t1(jd1Var.f35183b0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, jd1Var.f35183b0, Boolean.valueOf(jd1Var.f35187c0), null, -1);
            jd1Var.finishFragment();
        } else if (i10 == 5) {
            if (jd1Var.getParentActivity() != null) {
                StringBuilder sb = new StringBuilder();
                if (jd1Var.C1) {
                    sb.append("blur");
                }
                if (jd1Var.B1) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
                Object obj = jd1Var.f35242y1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.p2) jd1Var).currentAccount;
                    sb2.append(MessagesController.getInstance(i11).linkPrefix);
                    sb2.append("/bg/");
                    sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb2.toString();
                    if (sb.length() > 0) {
                        StringBuilder f10 = vh.w2.f(b10, "?mode=");
                        f10.append(sb.toString());
                        b10 = f10.toString();
                    }
                } else if (obj instanceof ui1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = jd1Var.T0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    ui1 ui1Var = new ui1(str, jd1Var.W0, jd1Var.Y0, jd1Var.Z0, jd1Var.f35181a1, jd1Var.f35194e1, jd1Var.f35206i1, jd1Var.B1, null);
                    ui1Var.f38861g = tL_wallPaper2;
                    b10 = ui1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.j6.I.k(false)) != null) {
                    ui1 ui1Var2 = new ui1(k10.f19747o, (int) k10.f19742j, (int) k10.f19743k, (int) k10.f19744l, (int) k10.f19745m, k10.f19746n, k10.f19748p, k10.f19749q, null);
                    int size = jd1Var.R0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) jd1Var.R0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f19747o.equals(tL_wallPaper3.slug)) {
                            ui1Var2.f38861g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = ui1Var2.b();
                } else {
                    return;
                }
                jd1Var.showDialog(new vc1(this, jd1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = jd1Var.f35212m1.a();
            ad1 ad1Var = jd1Var.f35212m1;
            if (ad1Var != null) {
                if (!ad1Var.T0()) {
                    jd1Var.g1();
                    return;
                }
                jd1Var.f35212m1.l1(true);
                org.telegram.ui.Components.gj0 gj0Var = jd1Var.K1;
                gj0Var.h = true;
                if (a2) {
                    gj0Var.N(0);
                } else {
                    gj0Var.N(36);
                }
                jd1Var.K1.start();
                if (jd1Var.J1) {
                    ad1 ad1Var2 = jd1Var.f35212m1;
                    float f11 = 0.0f;
                    if (ad1Var2 != null && ad1Var2.a()) {
                        jd1Var.O1.setVisibility(0);
                        jd1Var.O1.a(jd1Var.f35210k1);
                    } else {
                        jd1Var.O1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = jd1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        jd1Var.M1.cancel();
                    }
                    float f12 = jd1Var.l1;
                    if (jd1Var.f35212m1.a()) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    jd1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new o11(this, 14));
                    jd1Var.M1.addListener(new ss0(this, 21));
                    jd1Var.M1.setDuration(250L);
                    jd1Var.M1.setInterpolator(org.telegram.ui.Components.mr.f27122f);
                    jd1Var.M1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = jd1Var.f35242y1;
            if ((obj2 instanceof vi1) && (file = ((vi1) obj2).e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(jd1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new wc1(this, photoEntry), null);
            }
        }
    }
}
