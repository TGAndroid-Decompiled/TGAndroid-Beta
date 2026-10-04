package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
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
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.p60;
import org.telegram.ui.vs;
public final class s0 extends cb {
    public static final int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final ai.w7[] Z;
    public final ArrayList f51927a0;
    public final ArrayList f51928b0;
    public final ArrayList f51929c0;
    public final ArrayList f51930d0;
    public final com.google.android.gms.common.api.internal.r f51931e0;
    public final com.google.android.gms.common.api.internal.r f51932f0;
    public final com.google.android.gms.common.api.internal.r f51933g0;
    public final qz f51934h0;
    public final l0 f51935i0;
    public final r0 f51936j0;
    public n0 f51937k0;
    public final FrameLayout f51938l0;
    public final ImageView m0;
    public final ImageView f51939n0;
    public final m0 f51940o0;
    public final TextView f51941p0;
    public final View f51942q0;
    public final ah.n f51943r0;
    public final ah.i f51944s0;
    public final fh.d f51945t0;
    public final ah.c f51946u0;
    public o0 f51947v0;
    public final boolean f51948w0;
    public boolean f51949x0;
    public final RectF f51950y0;
    public final PointF f51951z0;

    public s0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, d6Var);
        int i11;
        this.C0 = 1;
        RectF rectF = new RectF();
        this.f51950y0 = rectF;
        this.f51951z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.f51948w0 = z10;
        zl0 zl0Var = this.d;
        org.telegram.ui.ActionBar.d3 d3Var = this.container;
        Objects.requireNonNull(zl0Var);
        this.f51943r0 = new ah.n(zl0Var, d3Var, new vs(zl0Var, 0));
        ArrayList c10 = zf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f51927a0 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.f51931e0 = rVar;
        rVar.f6623b = false;
        ArrayList c11 = zf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f51928b0 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.f51932f0 = rVar2;
        rVar2.f6623b = false;
        this.f51929c0 = zf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f51930d0 = arrayList3;
        if (z10) {
            int i12 = 0;
            while (i12 < this.f51929c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f51929c0.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f51930d0.add(stargiftattributemodel);
                    this.f51929c0.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.f51927a0, Comparator$CC.comparingDouble(new h81(4)));
        List.EL.sort(this.f51928b0, Comparator$CC.comparingDouble(new h81(5)));
        List.EL.sort(this.f51929c0, Comparator$CC.comparingDouble(new h81(6)));
        List.EL.sort(this.f51930d0, Comparator$CC.comparingDouble(new h81(6)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.f51929c0);
        this.f51933g0 = rVar3;
        rVar3.f6623b = false;
        ViewParent parent = this.f25301e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f25301e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.i6.f20907i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.i6.f20889h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        fh.c cVar = new fh.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f51944s0 = new ah.i();
            fh.d dVar = new fh.d(cVar);
            this.f51945t0 = dVar;
            dVar.v = new k0(this, 0);
            ah.c cVar2 = new ah.c(dVar);
            this.f51946u0 = cVar2;
            cVar2.f461i = LiteMode.isEnabled(262144);
        } else {
            this.f51944s0 = null;
            this.f51945t0 = null;
            this.f51946u0 = new ah.c(cVar);
        }
        hh.k kVar = new hh.k(this.container);
        ah.c cVar3 = this.f51946u0;
        org.telegram.ui.ActionBar.d3 d3Var2 = this.container;
        cVar3.f459f = kVar;
        cVar3.f460g = d3Var2;
        qz qzVar = new qz(3, false);
        this.f51934h0 = qzVar;
        qzVar.O = new ci.x1(this, 8);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(qzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new xb0(this, 20));
        ?? jVar = new s4.j();
        this.f51935i0 = jVar;
        jVar.C = false;
        jVar.f46562m = false;
        jVar.n(280L);
        jVar.o(tr.h);
        jVar.D = 30L;
        this.d.setItemAnimator(jVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51938l0 = frameLayout;
        frameLayout.setClipChildren(false);
        m0 m0Var = new m0(this, context, d6Var, new k0(this, 1), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27));
        this.f51940o0 = m0Var;
        m0Var.d(new f4.d(1, 1));
        m0Var.setPreviewingAttributes(arrayList);
        m0Var.removeView(m0Var.O);
        int i15 = -1;
        frameLayout.addView(m0Var, w7.z5.c(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
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
        this.f51939n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new w(2, this, arrayList));
        w7.b6.a(imageView2);
        frameLayout.addView(imageView2, w7.z5.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView i18 = org.telegram.ui.Cells.c1.i(frameLayout, textView, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f51941p0 = i18;
        i18.setTextSize(1, 13.0f);
        i18.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        i18.setGravity(17);
        int i19 = -1879048193;
        i18.setTextColor(-1879048193);
        frameLayout.addView(i18, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new ai.w7[3];
        this.f51936j0 = new r0(context, d6Var, new ii.q1(this, 25));
        int i20 = 0;
        while (true) {
            ai.w7[] w7VarArr = this.Z;
            if (i20 < w7VarArr.length) {
                ai.w7 w7Var = new ai.w7(context);
                w7Var.setClipChildren(false);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
                w7Var.f1806c = p6Var;
                p6Var.setTypeface(AndroidUtilities.bold());
                p6Var.setTextSize(AndroidUtilities.dp(13.0f));
                p6Var.setTextColor(i15);
                p6Var.setGravity(i17);
                w7Var.addView(p6Var, w7.z5.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                w7Var.f1805b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i19);
                textView2.setGravity(i17);
                w7Var.addView(textView2, w7.z5.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, false, false);
                w7Var.d = p6Var2;
                p6Var2.setTypeface(AndroidUtilities.bold());
                p6Var2.setTextColor(i15);
                p6Var2.setGravity(5);
                p6Var2.getDrawable().N = true;
                p6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                p6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                p6Var2.setSizeableBackground(new k3(AndroidUtilities.dp(10.0f), 285212671));
                w7Var.addView(p6Var2, w7.z5.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                w7VarArr[i20] = w7Var;
                if (i20 != 0) {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            ((TextView) this.Z[i20].f1805b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.Z[i20].f1805b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.Z[i20].f1805b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                w7.b6.a(this.Z[i20]);
                this.Z[i20].setOnClickListener(new ci.n4(this, i20, 26));
                this.Z[i20].setBackground(org.telegram.ui.ActionBar.i6.Z(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                ai.w7[] w7VarArr2 = this.Z;
                ai.w7 w7Var2 = w7VarArr2[i20];
                if (i20 != w7VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(w7Var2, w7.z5.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i20++;
                i17 = 17;
                i15 = -1;
                i19 = -1879048193;
            } else {
                this.f51938l0.addView(this.Y, w7.z5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f51938l0, w7.z5.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.i6.f20907i5), getThemedColor(org.telegram.ui.ActionBar.i6.f20889h5));
                View view = new View(context);
                this.f51942q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e7 = w7.z5.e(-1, 0, 48);
                e7.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e7);
                this.f51936j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                ch.d c12 = this.f51946u0.c(this.f51936j0, null, false);
                c12.y(AndroidUtilities.dp(4.0f));
                c12.z(AndroidUtilities.dp(28.0f));
                c12.x(new dh.b(org.telegram.ui.ActionBar.i6.f20817d6, d6Var));
                this.f51936j0.setBackground(c12);
                this.containerView.addView(this.f51936j0, w7.z5.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f51947v0 = new o0((TL_stars.starGiftAttributeBackdrop) zf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) zf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) zf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f51937k0.N(false);
                R(false);
                return;
            }
        }
    }

    public static double N(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    public final void O(int i10) {
        ah.i iVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f51944s0) != null) {
            if (w7.e0.a(i10, 2)) {
                org.telegram.ui.ActionBar.d3 d3Var = this.container;
                r0 r0Var = this.f51936j0;
                PointF pointF = this.f51951z0;
                hh.k.b(r0Var, d3Var, pointF);
                float f7 = pointF.x;
                RectF rectF = this.f51950y0;
                rectF.left = f7;
                rectF.top = pointF.y;
                rectF.right = f7 + r0Var.getMeasuredWidth();
                rectF.bottom = Math.min(rectF.top + r0Var.getMeasuredHeight(), this.container.getMeasuredHeight());
                if (!rectF.isEmpty()) {
                    if (LiteMode.isEnabled(262144)) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(48.0f);
                    }
                    float f10 = -dp;
                    rectF.inset(f10, f10);
                    iVar.g(1, this.A0);
                } else {
                    return;
                }
            }
            if (iVar.f499k != 0) {
                iVar.e(this.f51943r0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean P(o0 o0Var) {
        if (this.C0 != 1) {
            int i10 = this.f51936j0.f51880r;
            o0 o0Var2 = this.f51947v0;
            if (o0Var2 != null) {
                if (i10 == 1) {
                    if (o0Var.f51724a != o0Var2.f51724a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (o0Var.f51725b != o0Var2.f51725b) {
                        return false;
                    }
                } else if (i10 != 0 || o0Var.f51726c != o0Var2.f51726c) {
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
        if (this.C0 == i10) {
            return;
        }
        this.C0 = i10;
        if (i10 == 2) {
            i11 = R.drawable.filled_gift_play_24;
        } else {
            i11 = R.drawable.filled_gift_pause_24;
        }
        this.f51939n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f51941p0.setText(LocaleController.getString(i12));
        S();
    }

    public final void R(boolean z10) {
        m0 m0Var = this.f51940o0;
        if (m0Var.getUpgradeImageViewAttribute() != null && m0Var.getUpgradeBackdropAttribute() != null && m0Var.getUpgradePatternAttribute() != null) {
            ai.w7[] w7VarArr = this.Z;
            ((org.telegram.ui.Components.p6) w7VarArr[0].f1806c).c(m0Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[0].d).setText(x3.J1(m0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.p6) w7VarArr[1].f1806c).c(m0Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[1].d).c(ei.m.L0(m0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[2].f1806c).c(m0Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[2].d).c(ei.m.L0(m0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void S() {
        q0 q0Var;
        o0 o0Var;
        zl0 zl0Var = this.d;
        int childCount = zl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zl0Var.getChildAt(i10);
            if ((childAt instanceof q0) && (o0Var = (q0Var = (q0) childAt).v) != null) {
                boolean P = P(o0Var);
                q0Var.f51841c.f(P, true);
                q0Var.f51845r.a(P, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f51938l0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f10) {
            return true;
        }
        return false;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        ah.i iVar;
        fh.d dVar;
        int i10;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (iVar = this.f51944s0) != null && (dVar = this.f51945t0) != null && !dVar.f9864r && dVar.d(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20907i5));
            if (LiteMode.isEnabled(262144)) {
                i10 = -2;
            } else {
                i10 = -3;
            }
            iVar.b(a2, i10);
            dVar.c();
        }
    }

    @Override
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.B0 != systemBottomInset) {
            this.B0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            r0 r0Var = this.f51936j0;
            ((ViewGroup.MarginLayoutParams) r0Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.B0;
            r0Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        O(2);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        n0 n0Var = new n0(this, this.d, getContext(), this.X, new hi.a(this, 24), this.resourcesProvider);
        this.f51937k0 = n0Var;
        n0Var.f31306r = false;
        return n0Var;
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
