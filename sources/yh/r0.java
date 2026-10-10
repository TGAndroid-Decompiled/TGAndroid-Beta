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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.o60;
import org.telegram.ui.vs;
public final class r0 extends eb {
    public static final int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final ai.x7[] Z;
    public final ArrayList f53135a0;
    public final ArrayList f53136b0;
    public final ArrayList f53137c0;
    public final ArrayList f53138d0;
    public final com.google.android.gms.common.api.internal.r f53139e0;
    public final com.google.android.gms.common.api.internal.r f53140f0;
    public final com.google.android.gms.common.api.internal.r f53141g0;
    public final e00 f53142h0;
    public final k0 f53143i0;
    public final q0 f53144j0;
    public m0 f53145k0;
    public final FrameLayout f53146l0;
    public final ImageView m0;
    public final ImageView f53147n0;
    public final l0 f53148o0;
    public final TextView f53149p0;
    public final View f53150q0;
    public final ah.n f53151r0;
    public final ah.h f53152s0;
    public final fh.d f53153t0;
    public final ah.c f53154u0;
    public n0 f53155v0;
    public final boolean f53156w0;
    public boolean f53157x0;
    public final RectF f53158y0;
    public final PointF f53159z0;

    public r0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, e6Var);
        int i11;
        this.C0 = 1;
        RectF rectF = new RectF();
        this.f53158y0 = rectF;
        this.f53159z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.f53156w0 = z10;
        rm0 rm0Var = this.d;
        org.telegram.ui.ActionBar.d3 d3Var = this.container;
        Objects.requireNonNull(rm0Var);
        this.f53151r0 = new ah.n(rm0Var, d3Var, new vs(rm0Var, 0));
        ArrayList c10 = zf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f53135a0 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.f53139e0 = rVar;
        rVar.f6676b = false;
        ArrayList c11 = zf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f53136b0 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.f53140f0 = rVar2;
        rVar2.f6676b = false;
        this.f53137c0 = zf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f53138d0 = arrayList3;
        if (z10) {
            int i12 = 0;
            while (i12 < this.f53137c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f53137c0.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f53138d0.add(stargiftattributemodel);
                    this.f53137c0.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.f53135a0, Comparator$CC.comparingDouble(new p81(4)));
        List.EL.sort(this.f53136b0, Comparator$CC.comparingDouble(new p81(5)));
        List.EL.sort(this.f53137c0, Comparator$CC.comparingDouble(new p81(6)));
        List.EL.sort(this.f53138d0, Comparator$CC.comparingDouble(new p81(6)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.f53137c0);
        this.f53141g0 = rVar3;
        rVar3.f6676b = false;
        ViewParent parent = this.f25983e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f25983e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.i6.f20891i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.i6.f20872h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        fh.c cVar = new fh.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f53152s0 = new ah.h(false);
            fh.d dVar = new fh.d(cVar);
            this.f53153t0 = dVar;
            dVar.v = new Runnable(this) {
                public final r0 f52762b;

                {
                    this.f52762b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                r0 r0Var = this.f52762b;
                                if (r0Var.f53152s0 != null) {
                                    r0Var.R(2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f52762b.onBackPressed();
                            return;
                    }
                }
            };
            ah.c cVar2 = new ah.c(dVar);
            this.f53154u0 = cVar2;
            cVar2.f547i = LiteMode.isEnabled(262144);
        } else {
            this.f53152s0 = null;
            this.f53153t0 = null;
            this.f53154u0 = new ah.c(cVar);
        }
        hh.j jVar = new hh.j(this.container);
        ah.c cVar3 = this.f53154u0;
        org.telegram.ui.ActionBar.d3 d3Var2 = this.container;
        cVar3.f545f = jVar;
        cVar3.f546g = d3Var2;
        e00 e00Var = new e00(3, false);
        this.f53142h0 = e00Var;
        e00Var.O = new ci.w1(this, 8);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(e00Var);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new nh0(this, 21));
        ?? jVar2 = new s4.j();
        this.f53143i0 = jVar2;
        jVar2.C = false;
        jVar2.f47742m = false;
        jVar2.n(280L);
        jVar2.o(is.h);
        jVar2.D = 30L;
        this.d.setItemAnimator(jVar2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53146l0 = frameLayout;
        frameLayout.setClipChildren(false);
        l0 l0Var = new l0(this, context, e6Var, new Runnable(this) {
            public final r0 f52762b;

            {
                this.f52762b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            r0 r0Var = this.f52762b;
                            if (r0Var.f53152s0 != null) {
                                r0Var.R(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f52762b.onBackPressed();
                        return;
                }
            }
        }, new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27));
        this.f53148o0 = l0Var;
        l0Var.d(new f4.d(1, 1));
        l0Var.setPreviewingAttributes(arrayList);
        l0Var.removeView(l0Var.O);
        int i15 = -1;
        frameLayout.addView(l0Var, w7.x5.d(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.i6.a0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 21));
        w7.z5.a(imageView);
        frameLayout.addView(imageView, w7.x5.a(32.0f, 12.0f, 14.0f, 0.0f, 0.0f, 32, 51));
        ImageView imageView2 = new ImageView(context);
        this.f53147n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.a0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new xh.a(8, this, arrayList));
        w7.z5.a(imageView2);
        frameLayout.addView(imageView2, w7.x5.a(32.0f, 0.0f, 14.0f, 12.0f, 0.0f, 32, 53));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 102.0f, -1, 87), context);
        this.f53149p0 = g10;
        float f7 = 13.0f;
        g10.setTextSize(1, 13.0f);
        g10.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        g10.setGravity(17);
        int i18 = -1879048193;
        g10.setTextColor(-1879048193);
        frameLayout.addView(g10, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 82.0f, -1, 87));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new ai.x7[3];
        this.f53144j0 = new q0(context, e6Var, new ii.q1(this, 25));
        int i19 = 0;
        while (true) {
            ai.x7[] x7VarArr = this.Z;
            if (i19 < x7VarArr.length) {
                float f10 = f7;
                ai.x7 x7Var = new ai.x7(context, 12);
                x7Var.setClipChildren(false);
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, false, false);
                x7Var.f1912c = r6Var;
                r6Var.setTypeface(AndroidUtilities.bold());
                r6Var.setTextSize(AndroidUtilities.dp(f10));
                r6Var.setTextColor(i15);
                r6Var.setGravity(i17);
                x7Var.addView(r6Var, w7.x5.a(16.0f, 4.0f, 6.0f, 4.0f, 0.0f, -1, 49));
                TextView textView2 = new TextView(context);
                x7Var.f1911b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i18);
                textView2.setGravity(i17);
                x7Var.addView(textView2, w7.x5.a(-2.0f, 4.0f, 20.0f, 4.0f, 0.0f, -1, 49));
                org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, false, false, false);
                x7Var.d = r6Var2;
                r6Var2.setTypeface(AndroidUtilities.bold());
                r6Var2.setTextColor(i15);
                r6Var2.setGravity(5);
                r6Var2.getDrawable().T = true;
                r6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                r6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                r6Var2.setSizeableBackground(new g3(AndroidUtilities.dp(10.0f), 285212671));
                x7Var.addView(r6Var2, w7.x5.a(16.0f, 0.0f, -9.0f, -4.0f, 0.0f, -1, 53));
                x7VarArr[i19] = x7Var;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            ((TextView) this.Z[i19].f1911b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.Z[i19].f1911b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.Z[i19].f1911b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                w7.z5.a(this.Z[i19]);
                this.Z[i19].setOnClickListener(new ci.m4(this, i19, 27));
                this.Z[i19].setBackground(org.telegram.ui.ActionBar.i6.a0(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                ai.x7[] x7VarArr2 = this.Z;
                ai.x7 x7Var2 = x7VarArr2[i19];
                if (i19 != x7VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(x7Var2, w7.x5.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i19++;
                f7 = f10;
                i17 = 17;
                i15 = -1;
                i18 = -1879048193;
            } else {
                this.f53146l0.addView(this.Y, w7.x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 18.0f, -1, 87));
                this.containerView.addView(this.f53146l0, w7.x5.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.i6.f20891i5), getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5));
                View view = new View(context);
                this.f53150q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e7 = w7.x5.e(-1, 0, 48);
                e7.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e7);
                this.f53144j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                ch.d c12 = this.f53154u0.c(this.f53144j0, null, false);
                c12.p(AndroidUtilities.dp(4.0f));
                c12.q(AndroidUtilities.dp(28.0f));
                c12.o(new dh.b(org.telegram.ui.ActionBar.i6.f20801d6, e6Var));
                this.f53144j0.setBackground(c12);
                this.containerView.addView(this.f53144j0, w7.x5.a(64.0f, 0.0f, 0.0f, 0.0f, 5.0f, 268, 81));
                this.f53155v0 = new n0((TL_stars.starGiftAttributeBackdrop) zf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) zf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) zf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f53145k0.N(false);
                U(false);
                return;
            }
        }
    }

    public static double Q(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    @Override
    public final CharSequence B() {
        return null;
    }

    public final void R(int i10) {
        ah.h hVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f53152s0) != null) {
            if (w7.g0.a(i10, 2)) {
                org.telegram.ui.ActionBar.d3 d3Var = this.container;
                q0 q0Var = this.f53144j0;
                PointF pointF = this.f53159z0;
                hh.j.b(q0Var, d3Var, pointF);
                float f7 = pointF.x;
                RectF rectF = this.f53158y0;
                rectF.left = f7;
                rectF.top = pointF.y;
                rectF.right = f7 + q0Var.getMeasuredWidth();
                rectF.bottom = Math.min(rectF.top + q0Var.getMeasuredHeight(), this.container.getMeasuredHeight());
                if (!rectF.isEmpty()) {
                    if (LiteMode.isEnabled(262144)) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(48.0f);
                    }
                    float f10 = -dp;
                    rectF.inset(f10, f10);
                    hVar.g(1, this.A0);
                } else {
                    return;
                }
            }
            if (hVar.f582j != 0) {
                hVar.e(this.f53151r0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean S(n0 n0Var) {
        if (this.C0 != 1) {
            int i10 = this.f53144j0.f53100r;
            n0 n0Var2 = this.f53155v0;
            if (n0Var2 != null) {
                if (i10 == 1) {
                    if (n0Var.f52958a != n0Var2.f52958a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (n0Var.f52959b != n0Var2.f52959b) {
                        return false;
                    }
                } else if (i10 != 0 || n0Var.f52960c != n0Var2.f52960c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void T(int i10) {
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
        this.f53147n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f53149p0.setText(LocaleController.getString(i12));
        V();
    }

    public final void U(boolean z10) {
        l0 l0Var = this.f53148o0;
        if (l0Var.getUpgradeImageViewAttribute() != null && l0Var.getUpgradeBackdropAttribute() != null && l0Var.getUpgradePatternAttribute() != null) {
            ai.x7[] x7VarArr = this.Z;
            ((org.telegram.ui.Components.r6) x7VarArr[0].f1912c).c(l0Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.r6) x7VarArr[0].d).setText(s3.K1(l0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.r6) x7VarArr[1].f1912c).c(l0Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.r6) x7VarArr[1].d).c(ei.l.H0(l0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.r6) x7VarArr[2].f1912c).c(l0Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.r6) x7VarArr[2].d).c(ei.l.H0(l0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void V() {
        p0 p0Var;
        n0 n0Var;
        rm0 rm0Var = this.d;
        int childCount = rm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = rm0Var.getChildAt(i10);
            if ((childAt instanceof p0) && (n0Var = (p0Var = (p0) childAt).v) != null) {
                boolean S = S(n0Var);
                p0Var.f53026c.f(S, true);
                p0Var.f53030r.a(S, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f53146l0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f10) {
            return true;
        }
        return false;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        ah.h hVar;
        fh.d dVar;
        int i10;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (hVar = this.f53152s0) != null && (dVar = this.f53153t0) != null && !dVar.f9939n && dVar.f(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20891i5));
            if (LiteMode.isEnabled(262144)) {
                i10 = -2;
            } else {
                i10 = -3;
            }
            hVar.b(a2, i10);
            dVar.b();
        }
    }

    @Override
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.B0 != systemBottomInset) {
            this.B0 = systemBottomInset;
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            q0 q0Var = this.f53144j0;
            ((ViewGroup.MarginLayoutParams) q0Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.B0;
            q0Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        R(2);
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        m0 m0Var = new m0(this, this.d, getContext(), this.X, new hi.a(this, 24), this.resourcesProvider);
        this.f53145k0 = m0Var;
        m0Var.f25587r = false;
        return m0Var;
    }

    @Override
    public final rm0 y(Context context) {
        return new o60(this, context, this.resourcesProvider, 3);
    }
}
