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
public final class sb0 extends org.telegram.ui.ActionBar.n2 {
    public FrameLayout f41055a;
    public org.telegram.ui.Components.im0 f41056b;
    public s4.b0 f41057c;
    public hu d;
    public org.telegram.ui.Components.qc e;
    public int f41058f;
    public final v3 h;
    public final boolean[] f41059n;
    public final ArrayList f41060r;
    public final ArrayList f41061s;

    public sb0() {
        super(null);
        this.h = new v3(this, 9);
        this.f41059n = new boolean[3];
        this.f41060r = new ArrayList();
        this.f41061s = new ArrayList();
    }

    public final int U(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f41058f) {
            return 2;
        }
        return -1;
    }

    public final void V(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f41061s;
            if (i11 < arrayList.size()) {
                if (((mb0) arrayList.get(i11)).e == i10) {
                    this.f41056b.e1(new i2.q(this, i11, 13), 700, true);
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
        this.f41059n[U] = true;
        Y();
        X();
    }

    public final void X() {
        String formatString;
        ArrayList arrayList = this.f41060r;
        arrayList.clear();
        ArrayList arrayList2 = this.f41061s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
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
        boolean[] zArr = this.f41059n;
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
        arrayList2.add(mb0.c(R.drawable.msg2_ask_question, this.f41058f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(mb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(mb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(mb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(mb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(mb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(mb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.t11.c()) {
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

    public final void Y() {
        boolean z10;
        float f7;
        if (this.f41056b != null) {
            for (int i10 = 0; i10 < this.f41056b.getChildCount(); i10++) {
                View childAt = this.f41056b.getChildAt(i10);
                if (childAt != null) {
                    this.f41056b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f41061s;
                        if (R < arrayList.size()) {
                            mb0 mb0Var = (mb0) arrayList.get(R);
                            int i11 = mb0Var.f44314a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((qb0) childAt).a();
                                }
                            } else {
                                rb0 rb0Var = (rb0) childAt;
                                ImageView imageView = rb0Var.e;
                                sb0 sb0Var = rb0Var.f40694y;
                                int i12 = mb0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    rb0Var.v = z10;
                                    if (z10) {
                                        rb0Var.c(mb0Var, true);
                                        int U = sb0Var.U(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (U >= 0 && sb0Var.f41059n[U]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.wh.t(animate.rotation(f7), org.telegram.ui.Components.bs.h, 240L);
                                    }
                                    rb0Var.f40688f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    rb0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                rb0Var.b(LiteMode.isPowerSaverApplied(), true);
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
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 7));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41055a = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20928a7, false));
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f41056b = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f41056b);
        org.telegram.ui.Components.im0 im0Var2 = this.f41056b;
        s4.b0 b0Var = new s4.b0();
        this.f41057c = b0Var;
        im0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.im0 im0Var3 = this.f41056b;
        hu huVar = new hu(this, 1);
        this.d = huVar;
        im0Var3.setAdapter(huVar);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f45972m = false;
        this.f41056b.setItemAnimator(kVar);
        this.f41055a.addView(this.f41056b, w7.z5.d(-1.0f, -1));
        this.f41056b.setOnItemClickListener(new wt(this, 16));
        this.fragmentView = this.f41055a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f41058f = i10;
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
        org.telegram.ui.Components.r5.u();
        org.telegram.ui.ActionBar.h6.p1(true);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f41056b.setPadding(0, 0, 0, i13);
        this.f41056b.setClipToPadding(false);
    }
}
