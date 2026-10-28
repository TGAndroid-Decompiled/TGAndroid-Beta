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
public final class wb0 extends org.telegram.ui.ActionBar.r2 {
    public FrameLayout f44621a;
    public org.telegram.ui.Components.nm0 f44622b;
    public s4.c0 f44623c;
    public hu d;
    public org.telegram.ui.Components.qc e;
    public int f44624f;
    public final t3 h;
    public final boolean[] f44625n;
    public final ArrayList f44626r;
    public final ArrayList f44627s;

    public wb0() {
        super(null);
        this.h = new t3(this, 9);
        this.f44625n = new boolean[3];
        this.f44626r = new ArrayList();
        this.f44627s = new ArrayList();
    }

    public final int V(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f44624f) {
            return 2;
        }
        return -1;
    }

    public final void W(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f44627s;
            if (i11 < arrayList.size()) {
                if (((qb0) arrayList.get(i11)).e == i10) {
                    this.f44622b.e1(new i2.r(this, i11, 13), 700, true);
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void X(int i10) {
        int V = V(i10);
        if (V == -1) {
            return;
        }
        this.f44625n[V] = true;
        Z();
        Y();
    }

    public final void Y() {
        String formatString;
        ArrayList arrayList = this.f44626r;
        arrayList.clear();
        ArrayList arrayList2 = this.f44627s;
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
        boolean[] zArr = this.f44625n;
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
        arrayList2.add(qb0.c(R.drawable.msg2_ask_question, this.f44624f, LocaleController.getString(R.string.LiteOptionsChat)));
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
            if (org.telegram.ui.Components.h21.c()) {
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

    public final void Z() {
        boolean z10;
        float f7;
        if (this.f44622b != null) {
            for (int i10 = 0; i10 < this.f44622b.getChildCount(); i10++) {
                View childAt = this.f44622b.getChildAt(i10);
                if (childAt != null) {
                    this.f44622b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f44627s;
                        if (R < arrayList.size()) {
                            qb0 qb0Var = (qb0) arrayList.get(R);
                            int i11 = qb0Var.f47075a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((ub0) childAt).a();
                                }
                            } else {
                                vb0 vb0Var = (vb0) childAt;
                                ImageView imageView = vb0Var.e;
                                wb0 wb0Var = vb0Var.f44238y;
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
                                        int V = wb0Var.V(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (V >= 0 && wb0Var.f44625n[V]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.wh.q(animate.rotation(f7), org.telegram.ui.Components.ds.h, 240L);
                                    }
                                    vb0Var.f44232f.c(LiteMode.isEnabled(i12), true);
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
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 9));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f44621a = new FrameLayout(context);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f44622b = nm0Var;
        nm0Var.u1();
        org.telegram.ui.Components.nm0 nm0Var2 = this.f44622b;
        s4.c0 c0Var = new s4.c0();
        this.f44623c = c0Var;
        nm0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.nm0 nm0Var3 = this.f44622b;
        hu huVar = new hu(this, 1);
        this.d = huVar;
        nm0Var3.setAdapter(huVar);
        this.f44622b.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47798m = false;
        this.f44622b.setItemAnimator(lVar);
        this.f44621a.addView(this.f44622b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f44622b.setOnItemClickListener(new st(this, 17));
        this.fragmentView = this.f44621a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f44624f = i10;
        Y();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f44622b;
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
        org.telegram.ui.Components.t5.u();
        org.telegram.ui.ActionBar.y6.r1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
