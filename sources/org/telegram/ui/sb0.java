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
public final class sb0 extends org.telegram.ui.ActionBar.o2 {
    public FrameLayout f42649a;
    public org.telegram.ui.Components.wk0 f42650b;
    public f2.m0 f42651c;
    public iu d;
    public org.telegram.ui.Components.gc f42652e;
    public int f42653f;
    public final w3 h;
    public final boolean[] f42654n;
    public final ArrayList f42655r;
    public final ArrayList f42656s;

    public sb0() {
        super(null);
        this.h = new w3(this, 7);
        this.f42654n = new boolean[3];
        this.f42655r = new ArrayList();
        this.f42656s = new ArrayList();
    }

    public final int T(int i9) {
        if (i9 == 3) {
            return 0;
        }
        if (i9 == 28700) {
            return 1;
        }
        if (i9 == this.f42653f) {
            return 2;
        }
        return -1;
    }

    public final void U(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f42656s;
            if (i10 < arrayList.size()) {
                if (((mb0) arrayList.get(i10)).f40376e == i9) {
                    this.f42650b.e1(new bg.x2(this, i10, 11), 700, true);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void V(int i9) {
        int T = T(i9);
        if (T == -1) {
            return;
        }
        this.f42654n[T] = true;
        X();
        W();
    }

    public final void W() {
        String formatString;
        ArrayList arrayList = this.f42655r;
        arrayList.clear();
        ArrayList arrayList2 = this.f42656s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i9 = Build.VERSION.SDK_INT;
        arrayList2.add(new mb0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new mb0(2, 0, formatString, 0, 0));
        arrayList2.add(new mb0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(mb0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f42654n;
        if (zArr[0]) {
            arrayList2.add(mb0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(mb0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(mb0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(mb0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(mb0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(mb0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(mb0.c(R.drawable.msg2_ask_question, this.f42653f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(mb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(mb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(mb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(mb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i9 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(mb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(mb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.d01.c()) {
                arrayList2.add(mb0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(mb0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(mb0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(mb0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(mb0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new mb0(2, 0, "", 0, 0));
        arrayList2.add(new mb0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new mb0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void X() {
        boolean z10;
        float f10;
        if (this.f42650b != null) {
            for (int i9 = 0; i9 < this.f42650b.getChildCount(); i9++) {
                View childAt = this.f42650b.getChildAt(i9);
                if (childAt != null) {
                    this.f42650b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f42656s;
                        if (R < arrayList.size()) {
                            mb0 mb0Var = (mb0) arrayList.get(R);
                            int i10 = mb0Var.f48814a;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    ((qb0) childAt).a();
                                }
                            } else {
                                rb0 rb0Var = (rb0) childAt;
                                ImageView imageView = rb0Var.f42350e;
                                sb0 sb0Var = rb0Var.f42357y;
                                int i11 = mb0Var.f40376e;
                                if (i10 == 3) {
                                    if (Integer.bitCount(i11) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    rb0Var.v = z10;
                                    if (z10) {
                                        rb0Var.c(mb0Var, true);
                                        int T = sb0Var.T(i11);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (T >= 0 && sb0Var.f42654n[T]) {
                                            f10 = 180.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        org.telegram.messenger.ll.r(animate.rotation(f10), org.telegram.ui.Components.gr.h, 240L);
                                    }
                                    rb0Var.f42351f.c(LiteMode.isEnabled(i11), true);
                                } else {
                                    rb0Var.h.a(LiteMode.isEnabled(i11), true);
                                }
                                rb0Var.b(LiteMode.isPowerSaverApplied(), true);
                            }
                        }
                    }
                }
            }
            if (this.f42652e != null && !LiteMode.isPowerSaverApplied()) {
                this.f42652e.b();
                this.f42652e = null;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i9;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 29));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42649a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f42650b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f42650b);
        org.telegram.ui.Components.wk0 wk0Var2 = this.f42650b;
        f2.m0 m0Var = new f2.m0();
        this.f42651c = m0Var;
        wk0Var2.setLayoutManager(m0Var);
        org.telegram.ui.Components.wk0 wk0Var3 = this.f42650b;
        iu iuVar = new iu(this, 1);
        this.d = iuVar;
        wk0Var3.setAdapter(iuVar);
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        this.f42650b.setItemAnimator(nVar);
        this.f42649a.addView(this.f42650b, g7.e6.c(-1.0f, -1));
        this.f42650b.setOnItemClickListener(new wt(this, 16));
        this.fragmentView = this.f42649a;
        if (AndroidUtilities.isTablet()) {
            i9 = 360864;
        } else {
            i9 = 360928;
        }
        this.f42653f = i9;
        W();
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
        org.telegram.ui.Components.k5.u();
        org.telegram.ui.ActionBar.f6.o1(true);
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f42650b.setPadding(0, 0, 0, i12);
        this.f42650b.setClipToPadding(false);
    }
}
