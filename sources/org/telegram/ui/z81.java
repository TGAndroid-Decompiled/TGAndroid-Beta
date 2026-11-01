package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z81 extends org.telegram.ui.ActionBar.k {
    public final k91 f43849a;

    public z81(k91 k91Var) {
        this.f43849a = k91Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        String str;
        String b10;
        int i11;
        String str2;
        k91 k91Var = this.f43849a;
        org.telegram.ui.ActionBar.r6 r6Var = k91Var.f38771w;
        if (i10 == -1) {
            if (k91Var.U0(true)) {
                k91Var.S0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            k91Var.d1(i10, true);
        } else if (i10 == 4) {
            if (k91Var.f38774x) {
                org.telegram.ui.ActionBar.t6.v1(false);
            }
            File e = r6Var.e();
            if (e != null) {
                e.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = k91Var.X0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            r6Var.f20742o = str2;
            r6Var.f20743p = k91Var.f38749m1;
            r6Var.f20744q = k91Var.F1;
            if (((int) r6Var.f20737j) == 0) {
                r6Var.f20737j = 4294967296L;
            }
            if (((int) r6Var.f20738k) == 0) {
                r6Var.f20738k = 4294967296L;
            }
            if (((int) r6Var.f20739l) == 0) {
                r6Var.f20739l = 4294967296L;
            }
            if (((int) r6Var.f20740m) == 0) {
                r6Var.f20740m = 4294967296L;
            }
            k91Var.b1();
            org.telegram.messenger.at.e().n(k91Var, org.telegram.messenger.at.f14702e4);
            org.telegram.ui.ActionBar.t6.z1(k91Var.f38730f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.t6.p();
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14791t4, k91Var.f38730f0, Boolean.valueOf(k91Var.f38733g0), null, -1);
            k91Var.finishFragment();
        } else if (i10 == 5) {
            if (k91Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (k91Var.G1) {
                    sb2.append("blur");
                }
                if (k91Var.F1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = k91Var.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
                    sb3.append(org.telegram.messenger.wp.r1(i11).U2);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder i12 = sc.e.i(b10, "?mode=");
                        i12.append(sb2.toString());
                        b10 = i12.toString();
                    }
                } else if (obj instanceof ke1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = k91Var.X0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    ke1 ke1Var = new ke1(str, k91Var.f38714a1, k91Var.f38721c1, k91Var.f38724d1, k91Var.f38727e1, k91Var.f38740i1, k91Var.f38749m1, k91Var.F1, null);
                    ke1Var.f38863g = tL_wallPaper2;
                    b10 = ke1Var.b();
                } else {
                    boolean z10 = org.telegram.messenger.v2.f18578a;
                    return;
                }
                k91Var.showDialog(new x81(this, k91Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (org.telegram.messenger.uz.S <= 3) {
                org.telegram.messenger.uz.S = 10;
                SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                int i13 = org.telegram.messenger.uz.S + 1;
                org.telegram.messenger.uz.S = i13;
                edit.putInt("dayNightWallpaperSwitchHint", i13);
                edit.apply();
            }
            boolean a2 = k91Var.f38758q1.a();
            c91 c91Var = k91Var.f38758q1;
            if (c91Var != null) {
                if (!c91Var.b1()) {
                    k91Var.l1();
                    return;
                }
                k91Var.f38758q1.M1(true);
                org.telegram.ui.Components.ci0 ci0Var = k91Var.O1;
                ci0Var.h = true;
                if (a2) {
                    ci0Var.P(0);
                } else {
                    ci0Var.P(36);
                }
                k91Var.O1.start();
                if (k91Var.N1) {
                    c91 c91Var2 = k91Var.f38758q1;
                    float f7 = 0.0f;
                    if (c91Var2 != null && c91Var2.a()) {
                        k91Var.S1.setVisibility(0);
                        k91Var.S1.a(k91Var.f38754o1);
                    } else {
                        k91Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = k91Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        k91Var.Q1.cancel();
                    }
                    float f10 = k91Var.f38756p1;
                    if (k91Var.f38758q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    k91Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new u01(this, 10));
                    k91Var.Q1.addListener(new ms0(this, 10));
                    k91Var.Q1.setDuration(250L);
                    k91Var.Q1.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                    k91Var.Q1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = k91Var.C1;
            if ((obj2 instanceof le1) && (file = ((le1) obj2).e) != null) {
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, file.getAbsolutePath(), 0, false, 0, 0);
                ffVar.f14603b = false;
                ffVar.f14604c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ffVar);
                PhotoViewer.v1().N2(k91Var.getParentActivity(), null, null);
                PhotoViewer.v1().j2(arrayList, 0, 3, false, new y81(this, ffVar), null);
            }
        }
    }
}
