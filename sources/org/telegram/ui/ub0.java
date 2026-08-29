package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ub0 extends org.telegram.ui.ActionBar.o2 {
    public FrameLayout f43214a;
    public org.telegram.ui.Components.jl0 f43215b;
    public f2.j0 f43216c;
    public ju d;
    public org.telegram.ui.Components.mc f43217e;
    public int f43218f;
    public final x3 h;
    public final boolean[] f43219n;
    public final ArrayList f43220r;
    public final ArrayList f43221s;

    public ub0() {
        super(null);
        this.h = new x3(this, 7);
        this.f43219n = new boolean[3];
        this.f43220r = new ArrayList();
        this.f43221s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f43218f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f43221s;
            if (i11 < arrayList.size()) {
                if (((ob0) arrayList.get(i11)).f41079e == i10) {
                    this.f43215b.e1(new eg.n2(this, i11, 11), 700, true);
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void W(int i10) {
        int U = U(i10);
        if (U == -1) {
            return;
        }
        this.f43219n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f43220r;
        arrayList.clear();
        ArrayList arrayList2 = this.f43221s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new ob0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new ob0(2, 0, formatString, 0, 0));
        arrayList2.add(new ob0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(ob0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f43219n;
        if (zArr[0]) {
            arrayList2.add(ob0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(ob0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(ob0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(ob0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(ob0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(ob0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(ob0.c(R.drawable.msg2_ask_question, this.f43218f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(ob0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(ob0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(ob0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(ob0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(ob0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(ob0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.p01.c()) {
                arrayList2.add(ob0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(ob0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(ob0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(ob0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(ob0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new ob0(2, 0, "", 0, 0));
        arrayList2.add(new ob0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new ob0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        boolean z10;
        float f9;
        if (this.f43215b != null) {
            for (int i10 = 0; i10 < this.f43215b.getChildCount(); i10++) {
                View childAt = this.f43215b.getChildAt(i10);
                if (childAt != null) {
                    this.f43215b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f43221s;
                        if (R < arrayList.size()) {
                            ob0 ob0Var = (ob0) arrayList.get(R);
                            int i11 = ob0Var.f50845a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((sb0) childAt).a();
                                }
                            } else {
                                tb0 tb0Var = (tb0) childAt;
                                ImageView imageView = tb0Var.f42634e;
                                ub0 ub0Var = tb0Var.f42641y;
                                int i12 = ob0Var.f41079e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    tb0Var.v = z10;
                                    if (z10) {
                                        tb0Var.c(ob0Var, true);
                                        int U = ub0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && ub0Var.f43219n[U]) {
                                            f9 = 180.0f;
                                        } else {
                                            f9 = 0.0f;
                                        }
                                        b.q(animate.rotation(f9), org.telegram.ui.Components.jr.h, 240L);
                                    }
                                    tb0Var.f42635f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    tb0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                tb0Var.b(LiteMode.isPowerSaverApplied(), true);
                            }
                        }
                    }
                }
            }
            if (this.f43217e != null && !LiteMode.isPowerSaverApplied()) {
                this.f43217e.b();
                this.f43217e = null;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 21));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43214a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f43215b = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f43215b);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f43215b;
        f2.j0 j0Var = new f2.j0();
        this.f43216c = j0Var;
        jl0Var2.setLayoutManager(j0Var);
        org.telegram.ui.Components.jl0 jl0Var3 = this.f43215b;
        ju juVar = new ju(this, 1);
        this.d = juVar;
        jl0Var3.setAdapter(juVar);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.f43215b.setItemAnimator(lVar);
        this.f43214a.addView(this.f43215b, i7.f6.c(-1.0f, -1));
        this.f43215b.setOnItemClickListener(new xt(this, 16));
        this.fragmentView = this.f43214a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f43218f = i10;
        X();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        LiteMode.removeOnPowerSaverAppliedListener(this.h);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LiteMode.addOnPowerSaverAppliedListener(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        LiteMode.savePreference();
        org.telegram.ui.Components.p5.u();
        org.telegram.ui.ActionBar.g6.o1(true);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f43215b.setPadding(0, 0, 0, i13);
        this.f43215b.setClipToPadding(false);
    }
}
