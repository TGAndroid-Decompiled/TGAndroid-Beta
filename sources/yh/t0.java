package yh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.p60;
import org.telegram.ui.vs;
public final class t0 extends cb {
    public static final int f51985z0 = 0;
    public final int X;
    public final LinearLayout Y;
    public final ai.w7[] Z;
    public final ArrayList f51986a0;
    public final ArrayList f51987b0;
    public final ArrayList f51988c0;
    public final ArrayList f51989d0;
    public final com.google.android.gms.common.api.internal.r f51990e0;
    public final com.google.android.gms.common.api.internal.r f51991f0;
    public final com.google.android.gms.common.api.internal.r f51992g0;
    public final qz f51993h0;
    public final m0 f51994i0;
    public final s0 f51995j0;
    public o0 f51996k0;
    public final FrameLayout f51997l0;
    public final ImageView m0;
    public final ImageView f51998n0;
    public final n0 f51999o0;
    public final TextView f52000p0;
    public final View f52001q0;
    public final ah.i f52002r0;
    public final ah.c f52003s0;
    public p0 f52004t0;
    public final boolean f52005u0;
    public boolean f52006v0;
    public final ah.n f52007w0;
    public int f52008x0;
    public int f52009y0;

    public t0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, d6Var);
        int i11;
        int dp;
        this.f52009y0 = 1;
        this.X = i10;
        this.f52005u0 = z10;
        ArrayList c10 = zf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f51986a0 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.f51990e0 = rVar;
        rVar.f6624b = false;
        ArrayList c11 = zf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f51987b0 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.f51991f0 = rVar2;
        rVar2.f6624b = false;
        this.f51988c0 = zf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList2 = new ArrayList();
        this.f51989d0 = arrayList2;
        if (z10) {
            int i12 = 0;
            while (i12 < this.f51988c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f51988c0.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f51989d0.add(stargiftattributemodel);
                    this.f51988c0.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList2.clear();
        }
        List.EL.sort(this.f51986a0, Comparator$CC.comparingDouble(new i81(4)));
        List.EL.sort(this.f51987b0, Comparator$CC.comparingDouble(new i81(5)));
        List.EL.sort(this.f51988c0, Comparator$CC.comparingDouble(new i81(6)));
        List.EL.sort(this.f51989d0, Comparator$CC.comparingDouble(new i81(6)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.f51988c0);
        this.f51992g0 = rVar3;
        rVar3.f6624b = false;
        ViewParent parent = this.f25355e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f25355e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        setBackgroundColor(i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.i6.f20917i5), getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5)));
        fixNavigationBar();
        fh.c d = this.glassEngine.d(new l0(this));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i();
            this.f52002r0 = iVar;
            this.glassEngine.a(iVar);
            fh.d dVar = new fh.d(d);
            dVar.f9863f = d;
            dVar.d = iVar;
            dVar.f9862e = -2;
            ah.c cVar = new ah.c(dVar);
            this.f52003s0 = cVar;
            cVar.f461i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                dp = AndroidUtilities.dp(8.0f);
            } else {
                dp = AndroidUtilities.dp(48.0f);
            }
            cVar.f456b = dp;
            cVar.f457c = dp;
        } else {
            this.f52002r0 = null;
            this.f52003s0 = new ah.c(d);
        }
        this.f52003s0.h = this.glassEngine;
        qz qzVar = new qz(3, false);
        this.f51993h0 = qzVar;
        qzVar.O = new ci.x1(this, 8);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(qzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new xb0(this, 20));
        this.glassEngine.b(this.d);
        ?? jVar = new s4.j();
        this.f51994i0 = jVar;
        jVar.C = false;
        jVar.f46577m = false;
        jVar.n(280L);
        jVar.o(tr.h);
        jVar.D = 30L;
        this.d.setItemAnimator(jVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51997l0 = frameLayout;
        frameLayout.setClipChildren(false);
        n0 n0Var = new n0(this, context, d6Var, new rg.s1(this, 27), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27));
        this.f51999o0 = n0Var;
        n0Var.d(new f4.d(1, 1));
        n0Var.setPreviewingAttributes(arrayList);
        n0Var.removeView(n0Var.O);
        int i13 = -1;
        frameLayout.addView(n0Var, w7.z5.c(-1.0f, -1));
        int i14 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i14, 0, i14, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.i6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 21));
        w7.b6.a(imageView);
        frameLayout.addView(imageView, w7.z5.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f51998n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new x(2, this, arrayList));
        w7.b6.a(imageView2);
        frameLayout.addView(imageView2, w7.z5.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i15 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView i16 = org.telegram.ui.Cells.c1.i(frameLayout, textView, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f52000p0 = i16;
        i16.setTextSize(1, 13.0f);
        i16.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        i16.setGravity(17);
        int i17 = -1879048193;
        i16.setTextColor(-1879048193);
        frameLayout.addView(i16, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new ai.w7[3];
        this.f51995j0 = new s0(context, d6Var, new ii.q1(this, 25));
        int i18 = 0;
        while (true) {
            ai.w7[] w7VarArr = this.Z;
            if (i18 < w7VarArr.length) {
                ai.w7 w7Var = new ai.w7(context);
                w7Var.setClipChildren(false);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
                w7Var.f1806c = p6Var;
                p6Var.setTypeface(AndroidUtilities.bold());
                p6Var.setTextSize(AndroidUtilities.dp(13.0f));
                p6Var.setTextColor(i13);
                p6Var.setGravity(i15);
                w7Var.addView(p6Var, w7.z5.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                w7Var.f1805b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i17);
                textView2.setGravity(i15);
                w7Var.addView(textView2, w7.z5.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, false, false);
                w7Var.d = p6Var2;
                p6Var2.setTypeface(AndroidUtilities.bold());
                p6Var2.setTextColor(i13);
                p6Var2.setGravity(5);
                p6Var2.getDrawable().N = true;
                p6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                p6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                p6Var2.setSizeableBackground(new l3(AndroidUtilities.dp(10.0f), 285212671));
                w7Var.addView(p6Var2, w7.z5.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                w7VarArr[i18] = w7Var;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            ((TextView) this.Z[i18].f1805b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.Z[i18].f1805b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.Z[i18].f1805b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                w7.b6.a(this.Z[i18]);
                this.Z[i18].setOnClickListener(new ci.n4(this, i18, 26));
                this.Z[i18].setBackground(org.telegram.ui.ActionBar.i6.Z(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                ai.w7[] w7VarArr2 = this.Z;
                ai.w7 w7Var2 = w7VarArr2[i18];
                if (i18 != w7VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(w7Var2, w7.z5.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i18++;
                i15 = 17;
                i13 = -1;
                i17 = -1879048193;
            } else {
                this.f51997l0.addView(this.Y, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f51997l0, w7.z5.e(-1, 315, 55));
                int d10 = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.i6.f20917i5), getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5));
                View view = new View(context);
                this.f52001q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d10, 160), d10 & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e7 = w7.z5.e(-1, 0, 48);
                e7.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e7);
                this.f51995j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                ch.d c12 = this.f52003s0.c(this.f51995j0, null, false);
                c12.x(AndroidUtilities.dp(4.0f));
                c12.y(AndroidUtilities.dp(28.0f));
                c12.w(new dh.b(org.telegram.ui.ActionBar.i6.f20827d6, d6Var));
                this.f51995j0.setBackground(c12);
                this.containerView.addView(this.f51995j0, w7.z5.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f52004t0 = new p0((TL_stars.starGiftAttributeBackdrop) zf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) zf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) zf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f51996k0.N(false);
                R(false);
                zl0 zl0Var = this.d;
                ViewGroup viewGroup = this.containerView;
                Objects.requireNonNull(zl0Var);
                this.f52007w0 = new ah.n(zl0Var, viewGroup, new vs(zl0Var, 0));
                this.glassEngine.i(this.containerView);
                li.p pVar = this.glassEngine;
                pVar.f15671a = new l0(this);
                pVar.d = new ni.b(AndroidUtilities.dp(48.0f));
                return;
            }
        }
    }

    public static void N(t0 t0Var, int i10) {
        ah.i iVar = t0Var.f52002r0;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.e0.a(i10, 4)) {
                iVar.h(t0Var.glassEngine.e());
            }
            iVar.e(t0Var.f52007w0, t0Var.containerView.getWidth(), t0Var.containerView.getHeight());
        }
    }

    public static double O(TL_stars.StarGiftAttribute starGiftAttribute) {
        TL_stars.StarGiftAttributeRarity starGiftAttributeRarity = starGiftAttribute.rarity;
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            return ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            return 0.01d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            return 0.02d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            return 0.03d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            return 0.04d;
        }
        return 0.0d;
    }

    public final boolean P(p0 p0Var) {
        if (this.f52009y0 != 1) {
            int i10 = this.f51995j0.f51954r;
            p0 p0Var2 = this.f52004t0;
            if (p0Var2 != null) {
                if (i10 == 1) {
                    if (p0Var.f51778a != p0Var2.f51778a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (p0Var.f51779b != p0Var2.f51779b) {
                        return false;
                    }
                } else if (i10 != 0 || p0Var.f51780c != p0Var2.f51780c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Q(int i10) {
        int i11;
        int i12;
        if (this.f52009y0 == i10) {
            return;
        }
        this.f52009y0 = i10;
        if (i10 == 2) {
            i11 = R.drawable.filled_gift_play_24;
        } else {
            i11 = R.drawable.filled_gift_pause_24;
        }
        this.f51998n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f52000p0.setText(LocaleController.getString(i12));
        S();
    }

    public final void R(boolean z10) {
        n0 n0Var = this.f51999o0;
        if (n0Var.getUpgradeImageViewAttribute() != null && n0Var.getUpgradeBackdropAttribute() != null && n0Var.getUpgradePatternAttribute() != null) {
            ai.w7[] w7VarArr = this.Z;
            ((org.telegram.ui.Components.p6) w7VarArr[0].f1806c).c(n0Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[0].d).setText(y3.J1(n0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.p6) w7VarArr[1].f1806c).c(n0Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[1].d).c(ei.m.L0(n0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[2].f1806c).c(n0Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[2].d).c(ei.m.L0(n0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void S() {
        r0 r0Var;
        p0 p0Var;
        zl0 zl0Var = this.d;
        int childCount = zl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zl0Var.getChildAt(i10);
            if ((childAt instanceof r0) && (p0Var = (r0Var = (r0) childAt).v) != null) {
                boolean P = P(p0Var);
                r0Var.f51892c.f(P, true);
                r0Var.f51896r.a(P, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f51997l0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f10) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.f52008x0 != systemBottomInset) {
            this.f52008x0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            s0 s0Var = this.f51995j0;
            ((ViewGroup.MarginLayoutParams) s0Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.f52008x0;
            s0Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.glassEngine.g();
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        o0 o0Var = new o0(this, this.d, getContext(), this.X, new hi.a(this, 25), this.resourcesProvider);
        this.f51996k0 = o0Var;
        o0Var.f32531r = false;
        return o0Var;
    }

    @Override
    public final zl0 w(Context context) {
        return new p60(this, context, this.resourcesProvider, 3);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
