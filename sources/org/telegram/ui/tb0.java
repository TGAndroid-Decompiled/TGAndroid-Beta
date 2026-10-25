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
public final class tb0 extends org.telegram.ui.ActionBar.r2 {
    public FrameLayout f43720a;
    public org.telegram.ui.Components.mm0 f43721b;
    public s4.c0 f43722c;
    public fu d;
    public org.telegram.ui.Components.qc e;
    public int f43723f;
    public final t3 h;
    public final boolean[] f43724n;
    public final ArrayList f43725r;
    public final ArrayList f43726s;

    public tb0() {
        super(null);
        this.h = new t3(this, 9);
        this.f43724n = new boolean[3];
        this.f43725r = new ArrayList();
        this.f43726s = new ArrayList();
    }

    public final int V(int i10) {
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 28700) {
            return 1;
        }
        if (i10 == this.f43723f) {
            return 2;
        }
        return -1;
    }

    public final void W(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f43726s;
            if (i11 < arrayList.size()) {
                if (((nb0) arrayList.get(i11)).e == i10) {
                    this.f43721b.e1(new i2.r(this, i11, 13), 700, true);
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
        this.f43724n[V] = true;
        Z();
        Y();
    }

    public final void Y() {
        String formatString;
        ArrayList arrayList = this.f43725r;
        arrayList.clear();
        ArrayList arrayList2 = this.f43726s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = Build.VERSION.SDK_INT;
        arrayList2.add(new nb0(1, 0, null, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else if (LiteMode.getPowerSaverLevel() >= 100) {
            formatString = LocaleController.getString(R.string.LiteBatteryInfoEnabled);
        } else {
            formatString = LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new nb0(2, 0, formatString, 0, 0));
        arrayList2.add(new nb0(0, 0, LocaleController.getString(R.string.LiteOptionsTitle), 0, 0));
        arrayList2.add(nb0.c(R.drawable.msg2_sticker, 3, LocaleController.getString(R.string.LiteOptionsStickers)));
        boolean[] zArr = this.f43724n;
        if (zArr[0]) {
            arrayList2.add(nb0.b(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(nb0.b(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(nb0.c(R.drawable.msg2_smile_status, 28700, LocaleController.getString(R.string.LiteOptionsEmoji)));
        if (zArr[1]) {
            arrayList2.add(nb0.b(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(nb0.b(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(nb0.b(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(nb0.c(R.drawable.msg2_ask_question, this.f43723f, LocaleController.getString(R.string.LiteOptionsChat)));
        if (zArr[2]) {
            arrayList2.add(nb0.b(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(nb0.b(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(nb0.b(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(nb0.b(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i10 >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(nb0.b(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(nb0.b(32768, LocaleController.getString("LiteOptionsScale")));
            if (org.telegram.ui.Components.g21.c()) {
                arrayList2.add(nb0.b(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(nb0.c(R.drawable.msg2_call_earpiece, 512, LocaleController.getString(R.string.LiteOptionsCalls)));
        arrayList2.add(nb0.c(R.drawable.msg2_videocall, 1024, LocaleController.getString(R.string.LiteOptionsAutoplayVideo)));
        arrayList2.add(nb0.c(R.drawable.msg2_gif, 2048, LocaleController.getString(R.string.LiteOptionsAutoplayGifs)));
        arrayList2.add(nb0.c(R.drawable.photo_star, 131072, LocaleController.getString(R.string.LiteOptionsParticles)));
        arrayList2.add(new nb0(2, 0, "", 0, 0));
        arrayList2.add(new nb0(5, 0, LocaleController.getString(R.string.LiteSmoothTransitions), 0, 1));
        arrayList2.add(new nb0(2, 0, LocaleController.getString("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    public final void Z() {
        boolean z10;
        float f7;
        if (this.f43721b != null) {
            for (int i10 = 0; i10 < this.f43721b.getChildCount(); i10++) {
                View childAt = this.f43721b.getChildAt(i10);
                if (childAt != null) {
                    this.f43721b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f43726s;
                        if (R < arrayList.size()) {
                            nb0 nb0Var = (nb0) arrayList.get(R);
                            int i11 = nb0Var.f47037a;
                            if (i11 != 3 && i11 != 4) {
                                if (i11 == 1) {
                                    ((rb0) childAt).a();
                                }
                            } else {
                                sb0 sb0Var = (sb0) childAt;
                                ImageView imageView = sb0Var.e;
                                tb0 tb0Var = sb0Var.f43451y;
                                int i12 = nb0Var.e;
                                if (i11 == 3) {
                                    if (Integer.bitCount(i12) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    sb0Var.v = z10;
                                    if (z10) {
                                        sb0Var.c(nb0Var, true);
                                        int V = tb0Var.V(i12);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (V >= 0 && tb0Var.f43724n[V]) {
                                            f7 = 180.0f;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        org.telegram.messenger.vh.q(animate.rotation(f7), org.telegram.ui.Components.ds.h, 240L);
                                    }
                                    sb0Var.f43445f.c(LiteMode.isEnabled(i12), true);
                                } else {
                                    sb0Var.h.a(LiteMode.isEnabled(i12), true);
                                }
                                sb0Var.b(LiteMode.isPowerSaverApplied(), true);
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 9));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f43720a = new FrameLayout(context);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f43721b = mm0Var;
        mm0Var.u1();
        org.telegram.ui.Components.mm0 mm0Var2 = this.f43721b;
        s4.c0 c0Var = new s4.c0();
        this.f43722c = c0Var;
        mm0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f43721b;
        fu fuVar = new fu(this, 1);
        this.d = fuVar;
        mm0Var3.setAdapter(fuVar);
        this.f43721b.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47760m = false;
        this.f43721b.setItemAnimator(lVar);
        this.f43720a.addView(this.f43721b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f43721b.setOnItemClickListener(new qt(this, 17));
        this.fragmentView = this.f43720a;
        if (AndroidUtilities.isTablet()) {
            i10 = 360864;
        } else {
            i10 = 360928;
        }
        this.f43723f = i10;
        Y();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f43721b;
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
