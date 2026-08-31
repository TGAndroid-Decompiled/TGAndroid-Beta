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
public final class sc1 extends org.telegram.ui.ActionBar.j {
    public final ed1 f41229a;

    public sc1(ed1 ed1Var) {
        this.f41229a = ed1Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        org.telegram.ui.ActionBar.i6 k10;
        String b10;
        String str;
        int i11;
        String str2;
        ed1 ed1Var = this.f41229a;
        org.telegram.ui.ActionBar.i6 i6Var = ed1Var.f36533s;
        int i12 = 0;
        if (i10 == -1) {
            if (ed1Var.Q0(true)) {
                ed1Var.O0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            ed1Var.Y0(i10, true);
        } else if (i10 == 4) {
            if (ed1Var.v) {
                org.telegram.ui.ActionBar.k6.p1(false);
            }
            File d = i6Var.d();
            if (d != null) {
                d.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = ed1Var.T0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            i6Var.f21479o = str2;
            i6Var.f21480p = ed1Var.f36514i1;
            i6Var.f21481q = ed1Var.B1;
            if (((int) i6Var.f21474j) == 0) {
                i6Var.f21474j = 4294967296L;
            }
            if (((int) i6Var.f21475k) == 0) {
                i6Var.f21475k = 4294967296L;
            }
            if (((int) i6Var.f21476l) == 0) {
                i6Var.f21476l = 4294967296L;
            }
            if (((int) i6Var.f21477m) == 0) {
                i6Var.f21477m = 4294967296L;
            }
            ed1Var.W0();
            NotificationCenter.getGlobalInstance().removeObserver(ed1Var, NotificationCenter.wallpapersDidLoad);
            org.telegram.ui.ActionBar.k6.t1(ed1Var.f36490b0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.o();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, ed1Var.f36490b0, Boolean.valueOf(ed1Var.f36494c0), null, -1);
            ed1Var.finishFragment();
        } else if (i10 == 5) {
            if (ed1Var.getParentActivity() != null) {
                StringBuilder sb = new StringBuilder();
                if (ed1Var.C1) {
                    sb.append("blur");
                }
                if (ed1Var.B1) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
                Object obj = ed1Var.f36550y1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.p2) ed1Var).currentAccount;
                    sb2.append(MessagesController.getInstance(i11).linkPrefix);
                    sb2.append("/bg/");
                    sb2.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb2.toString();
                    if (sb.length() > 0) {
                        StringBuilder f10 = w.c.f(b10, "?mode=");
                        f10.append(sb.toString());
                        b10 = f10.toString();
                    }
                } else if (obj instanceof pi1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = ed1Var.T0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    pi1 pi1Var = new pi1(str, ed1Var.W0, ed1Var.Y0, ed1Var.Z0, ed1Var.f36488a1, ed1Var.f36502e1, ed1Var.f36514i1, ed1Var.B1, null);
                    pi1Var.f40061g = tL_wallPaper2;
                    b10 = pi1Var.b();
                } else if (BuildVars.DEBUG_PRIVATE_VERSION && (k10 = org.telegram.ui.ActionBar.k6.I.k(false)) != null) {
                    pi1 pi1Var2 = new pi1(k10.f21479o, (int) k10.f21474j, (int) k10.f21475k, (int) k10.f21476l, (int) k10.f21477m, k10.f21478n, k10.f21480p, k10.f21481q, null);
                    int size = ed1Var.R0.size();
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) ed1Var.R0.get(i12);
                        if (tL_wallPaper3.pattern && k10.f21479o.equals(tL_wallPaper3.slug)) {
                            pi1Var2.f40061g = tL_wallPaper3;
                            break;
                        }
                        i12++;
                    }
                    b10 = pi1Var2.b();
                } else {
                    return;
                }
                ed1Var.showDialog(new qc1(this, ed1Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean a2 = ed1Var.f36520m1.a();
            vc1 vc1Var = ed1Var.f36520m1;
            if (vc1Var != null) {
                if (!vc1Var.T0()) {
                    ed1Var.g1();
                    return;
                }
                ed1Var.f36520m1.l1(true);
                org.telegram.ui.Components.ij0 ij0Var = ed1Var.K1;
                ij0Var.h = true;
                if (a2) {
                    ij0Var.N(0);
                } else {
                    ij0Var.N(36);
                }
                ed1Var.K1.start();
                if (ed1Var.J1) {
                    vc1 vc1Var2 = ed1Var.f36520m1;
                    float f11 = 0.0f;
                    if (vc1Var2 != null && vc1Var2.a()) {
                        ed1Var.O1.setVisibility(0);
                        ed1Var.O1.a(ed1Var.f36518k1);
                    } else {
                        ed1Var.O1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = ed1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ed1Var.M1.cancel();
                    }
                    float f12 = ed1Var.l1;
                    if (ed1Var.f36520m1.a()) {
                        f11 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                    ed1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new j11(this, 14));
                    ed1Var.M1.addListener(new ns0(this, 21));
                    ed1Var.M1.setDuration(250L);
                    ed1Var.M1.setInterpolator(org.telegram.ui.Components.pr.f30183f);
                    ed1Var.M1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = ed1Var.f36550y1;
            if ((obj2 instanceof qi1) && (file = ((qi1) obj2).f40534e) != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.isVideo = false;
                photoEntry.thumbPath = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(photoEntry);
                PhotoViewer.t1().K2(ed1Var.getParentActivity(), null, null);
                PhotoViewer.t1().f2(arrayList, 0, 3, false, new rc1(this, photoEntry), null);
            }
        }
    }
}
