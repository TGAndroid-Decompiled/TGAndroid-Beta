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
public final class wb0 extends org.telegram.ui.ActionBar.o2 {
    public FrameLayout f42978a;
    public org.telegram.ui.Components.lm0 f42979b;
    public s4.b0 f42980c;
    public iu d;
    public org.telegram.ui.Components.oc e;
    public int f42981f;
    public final u3 h;
    public final boolean[] f42982n;
    public final ArrayList f42983r;
    public final ArrayList f42984s;

    public wb0() {
        super(null);
        this.h = new u3(this, 9);
        this.f42982n = new boolean[3];
        this.f42983r = new ArrayList();
        this.f42984s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f42981f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f42984s;
            if (i11 < arrayList.size()) {
                if (((qb0) arrayList.get(i11)).e == i10) {
                    this.f42979b.f1(new i2.r(this, i11, 13), 700, true);
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
        this.f42982n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f42983r;
        arrayList.clear();
        ArrayList arrayList2 = this.f42984s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new qb0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new qb0(2, 0, formatString, 0, 0));
        arrayList2.add(new qb0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(qb0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f42982n;
        if (zArr[0]) {
            arrayList2.add(qb0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(qb0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(qb0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(qb0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(qb0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(qb0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(qb0.c(R.drawable.msg2_ask_question, this.f42981f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(qb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(qb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(qb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(qb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(qb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(qb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.x11.c()) {
                arrayList2.add(qb0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(qb0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(qb0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(qb0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(qb0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new qb0(2, 0, "", 0, 0));
        arrayList2.add(new qb0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new qb0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        boolean z10;
        float f7;
        if (this.f42979b != null) {
            for (int i10 = 0; i10 < this.f42979b.getChildCount(); i10++) {
                View childAt = this.f42979b.getChildAt(i10);
                if (childAt != null) {
                    this.f42979b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f42984s;
                        if (R < arrayList.size()) {
                            qb0 qb0Var = (qb0) arrayList.get(R);
                            int i11 = qb0Var.f44712a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((ub0) childAt).a();
                                }
                            } else {
                                vb0 vb0Var = (vb0) childAt;
                                ImageView imageView = vb0Var.e;
                                wb0 wb0Var = vb0Var.f42690y;
                                int i12 = qb0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    vb0Var.v = z10;
                                    if (z10) {
                                        vb0Var.c(qb0Var, true);
                                        int U = wb0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && wb0Var.f42982n[U]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.tl.t(animate.rotation(f7), org.telegram.ui.Components.zr.h, 240L);
                                    }
                                    vb0Var.f42684f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    vb0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                vb0Var.b(LiteMode.isPowerSaverApplied(), true);
                            }
                        }
                    }
                }
            }
            if (this.e != null && !LiteMode.isPowerSaverApplied()) {
                this.e.b();
                this.e = null;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 7));
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42978a = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f42979b = lm0Var;
        lm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f42979b);
        org.telegram.ui.Components.lm0 lm0Var2 = this.f42979b;
        s4.b0 b0Var = new s4.b0();
        this.f42980c = b0Var;
        lm0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.lm0 lm0Var3 = this.f42979b;
        iu iuVar = new iu(this, 1);
        this.d = iuVar;
        lm0Var3.setAdapter(iuVar);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.zr.h);
        kVar.C = false;
        kVar.f46376m = false;
        this.f42979b.setItemAnimator(kVar);
        this.f42978a.addView(this.f42979b, w7.z5.c(-1.0f, -1));
        this.f42979b.setOnItemClickListener(new xt(this, 16));
        this.fragmentView = this.f42978a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f42981f = i10;
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
        org.telegram.ui.ActionBar.k6.r1(true);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f42979b.setPadding(0, 0, 0, i13);
        this.f42979b.setClipToPadding(false);
    }
}
