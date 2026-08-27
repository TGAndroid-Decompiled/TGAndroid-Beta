package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
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

public final class xb0 extends org.telegram.ui.ActionBar.n2 {

    public FrameLayout f44372a;

    public org.telegram.ui.Components.zk0 f44373b;

    public f2.k0 f44374c;
    public lu d;

    public org.telegram.ui.Components.ec f44375e;

    public int f44376f;
    public final x3 h;

    public final boolean[] f44377n;

    public final ArrayList f44378r;

    public final ArrayList f44379s;

    public xb0() {
        super(null);
        this.h = new x3(this, 7);
        this.f44377n = new boolean[3];
        this.f44378r = new ArrayList();
        this.f44379s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        return i10 == this.f44376f ? 2 : -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f44379s;
            if (i11 >= arrayList.size()) {
                return;
            }
            if (((rb0) arrayList.get(i11)).f41894e == i10) {
                this.f44373b.e1(new cg.p2(this, i11, 11), 700, true);
                return;
            }
            i11++;
        }
    }

    public final void W(int i10) {
        int iU = U(i10);
        if (iU == -1) {
            return;
        }
        this.f44377n[iU] = true;
        Y();
        X();
    }

    public final void X() {
        String string;
        ArrayList arrayList = this.f44378r;
        arrayList.clear();
        ArrayList arrayList2 = this.f44379s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new rb0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            string = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else {
            string = LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new rb0(2, 0, string, 0, 0));
        arrayList2.add(new rb0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(rb0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f44377n;
        if (zArr[0]) {
            arrayList2.add(rb0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(rb0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(rb0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(rb0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(rb0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(rb0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(rb0.c(R.drawable.msg2_ask_question, this.f44376f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(rb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(rb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(rb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(rb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(rb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(rb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.f01.c()) {
                arrayList2.add(rb0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(rb0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(rb0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(rb0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(rb0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new rb0(2, 0, "", 0, 0));
        arrayList2.add(new rb0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new rb0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Y() {
        if (this.f44373b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f44373b.getChildCount(); i10++) {
            View childAt = this.f44373b.getChildAt(i10);
            if (childAt != null) {
                this.f44373b.getClass();
                int iR = RecyclerView.R(childAt);
                if (iR >= 0) {
                    ArrayList arrayList = this.f44379s;
                    if (iR < arrayList.size()) {
                        rb0 rb0Var = (rb0) arrayList.get(iR);
                        int i11 = rb0Var.f49413a;
                        if (i11 == 3 || i11 == 4) {
                            wb0 wb0Var = (wb0) childAt;
                            ImageView imageView = wb0Var.f43690e;
                            xb0 xb0Var = wb0Var.f43697y;
                            int i12 = rb0Var.f41894e;
                            if (i11 == 3) {
                                boolean z10 = Integer.bitCount(i12) > 1;
                                wb0Var.v = z10;
                                if (z10) {
                                    wb0Var.c(rb0Var, true);
                                    int iU = xb0Var.U(i12);
                                    imageView.clearAnimation();
                                    org.telegram.messenger.rl.o(imageView.animate().rotation((iU < 0 || !xb0Var.f44377n[iU]) ? 0.0f : 180.0f), org.telegram.ui.Components.er.h, 240L);
                                }
                                wb0Var.f43691f.c(LiteMode.isEnabled(i12), true);
                            } else {
                                wb0Var.h.a(LiteMode.isEnabled(i12), true);
                            }
                            wb0Var.b(LiteMode.isPowerSaverApplied(), true);
                        } else if (i11 == 1) {
                            ((vb0) childAt).a();
                        }
                    }
                }
            }
        }
        if (this.f44375e == null || LiteMode.isPowerSaverApplied()) {
            return;
        }
        this.f44375e.b();
        this.f44375e = null;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 0));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44372a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f44373b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f44373b);
        org.telegram.ui.Components.zk0 zk0Var2 = this.f44373b;
        f2.k0 k0Var = new f2.k0();
        this.f44374c = k0Var;
        zk0Var2.setLayoutManager(k0Var);
        org.telegram.ui.Components.zk0 zk0Var3 = this.f44373b;
        lu luVar = new lu(this, 1);
        this.d = luVar;
        zk0Var3.setAdapter(luVar);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.f5819m = false;
        this.f44373b.setItemAnimator(lVar);
        this.f44372a.addView(this.f44373b, h7.z5.c(-1.0f, -1));
        this.f44373b.setOnItemClickListener(new zt(this, 16));
        this.fragmentView = this.f44372a;
        this.f44376f = AndroidUtilities.isTablet() ? 360864 : 360928;
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
        org.telegram.ui.Components.k5.u();
        org.telegram.ui.ActionBar.g6.o1(true);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f44373b.setPadding(0, 0, 0, i13);
        this.f44373b.setClipToPadding(false);
    }
}
