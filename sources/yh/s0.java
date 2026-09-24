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
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.l60;
import org.telegram.ui.rs;
public final class s0 extends bb {
    public static final int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final ai.w7[] Z;
    public final ArrayList f47954a0;
    public final ArrayList f47955b0;
    public final ArrayList f47956c0;
    public final ArrayList f47957d0;
    public final com.google.android.gms.common.api.internal.r f47958e0;
    public final com.google.android.gms.common.api.internal.r f47959f0;
    public final com.google.android.gms.common.api.internal.r f47960g0;
    public final oz f47961h0;
    public final l0 f47962i0;
    public final r0 f47963j0;
    public n0 f47964k0;
    public final FrameLayout f47965l0;
    public final ImageView m0;
    public final ImageView f47966n0;
    public final m0 f47967o0;
    public final TextView f47968p0;
    public final View f47969q0;
    public final ah.n f47970r0;
    public final ah.h f47971s0;
    public final fh.d f47972t0;
    public final ah.c f47973u0;
    public o0 f47974v0;
    public final boolean f47975w0;
    public boolean f47976x0;
    public final RectF f47977y0;
    public final PointF f47978z0;

    public s0(Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, d6Var);
        int i11;
        this.C0 = 1;
        RectF rectF = new RectF();
        this.f47977y0 = rectF;
        this.f47978z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.f47975w0 = z10;
        wl0 wl0Var = this.d;
        org.telegram.ui.ActionBar.c3 c3Var = this.container;
        Objects.requireNonNull(wl0Var);
        this.f47970r0 = new ah.n(wl0Var, c3Var, new rs(wl0Var, 0));
        ArrayList c10 = zf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f47954a0 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.f47958e0 = rVar;
        rVar.f6148b = false;
        ArrayList c11 = zf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f47955b0 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.f47959f0 = rVar2;
        rVar2.f6148b = false;
        this.f47956c0 = zf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f47957d0 = arrayList3;
        if (z10) {
            int i12 = 0;
            while (i12 < this.f47956c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f47956c0.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f47957d0.add(stargiftattributemodel);
                    this.f47956c0.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.f47954a0, Comparator$CC.comparingDouble(new w71(4)));
        List.EL.sort(this.f47955b0, Comparator$CC.comparingDouble(new w71(5)));
        List.EL.sort(this.f47956c0, Comparator$CC.comparingDouble(new w71(6)));
        List.EL.sort(this.f47957d0, Comparator$CC.comparingDouble(new w71(6)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.f47956c0);
        this.f47960g0 = rVar3;
        rVar3.f6148b = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.h6.f19133i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.h6.f19115h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        fh.c cVar = new fh.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f47971s0 = new ah.h(false);
            fh.d dVar = new fh.d(cVar);
            this.f47972t0 = dVar;
            dVar.v = new Runnable(this) {
                public final s0 f47582b;

                {
                    this.f47582b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                s0 s0Var = this.f47582b;
                                if (s0Var.f47971s0 != null) {
                                    s0Var.Q(2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f47582b.onBackPressed();
                            return;
                    }
                }
            };
            ah.c cVar2 = new ah.c(dVar);
            this.f47973u0 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
        } else {
            this.f47971s0 = null;
            this.f47972t0 = null;
            this.f47973u0 = new ah.c(cVar);
        }
        hh.k kVar = new hh.k(this.container);
        ah.c cVar3 = this.f47973u0;
        org.telegram.ui.ActionBar.c3 c3Var2 = this.container;
        cVar3.f425f = kVar;
        cVar3.f426g = c3Var2;
        oz ozVar = new oz(3, false);
        this.f47961h0 = ozVar;
        ozVar.O = new ci.x1(this, 8);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(ozVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new ug0(this, 18));
        ?? jVar = new s4.j();
        this.f47962i0 = jVar;
        jVar.C = false;
        jVar.f42981m = false;
        jVar.n(280L);
        jVar.o(rr.h);
        jVar.D = 30L;
        this.d.setItemAnimator(jVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47965l0 = frameLayout;
        frameLayout.setClipChildren(false);
        m0 m0Var = new m0(this, context, d6Var, new Runnable(this) {
            public final s0 f47582b;

            {
                this.f47582b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            s0 s0Var = this.f47582b;
                            if (s0Var.f47971s0 != null) {
                                s0Var.Q(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f47582b.onBackPressed();
                        return;
                }
            }
        }, new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27), new ai.e2(27));
        this.f47967o0 = m0Var;
        m0Var.d(new f4.d(1, 1));
        m0Var.setPreviewingAttributes(arrayList);
        m0Var.removeView(m0Var.O);
        int i15 = -1;
        frameLayout.addView(m0Var, w7.y5.c(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.h6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 21));
        w7.a6.a(imageView);
        frameLayout.addView(imageView, w7.y5.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f47966n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new w(2, this, arrayList));
        w7.a6.a(imageView2);
        frameLayout.addView(imageView2, w7.y5.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout, textView, w7.y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f47968p0 = h;
        h.setTextSize(1, 13.0f);
        h.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        h.setGravity(17);
        int i18 = -1879048193;
        h.setTextColor(-1879048193);
        frameLayout.addView(h, w7.y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new ai.w7[3];
        this.f47963j0 = new r0(context, d6Var, new ii.q1(this, 25));
        int i19 = 0;
        while (true) {
            ai.w7[] w7VarArr = this.Z;
            if (i19 < w7VarArr.length) {
                ai.w7 w7Var = new ai.w7(context);
                w7Var.setClipChildren(false);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
                w7Var.f1658c = p6Var;
                p6Var.setTypeface(AndroidUtilities.bold());
                p6Var.setTextSize(AndroidUtilities.dp(13.0f));
                p6Var.setTextColor(i15);
                p6Var.setGravity(i17);
                w7Var.addView(p6Var, w7.y5.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                w7Var.f1657b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i18);
                textView2.setGravity(i17);
                w7Var.addView(textView2, w7.y5.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, false, false);
                w7Var.d = p6Var2;
                p6Var2.setTypeface(AndroidUtilities.bold());
                p6Var2.setTextColor(i15);
                p6Var2.setGravity(5);
                p6Var2.getDrawable().N = true;
                p6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                p6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                p6Var2.setSizeableBackground(new k3(AndroidUtilities.dp(10.0f), 285212671));
                w7Var.addView(p6Var2, w7.y5.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                w7VarArr[i19] = w7Var;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            ((TextView) this.Z[i19].f1657b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.Z[i19].f1657b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.Z[i19].f1657b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                w7.a6.a(this.Z[i19]);
                this.Z[i19].setOnClickListener(new ci.n4(this, i19, 26));
                this.Z[i19].setBackground(org.telegram.ui.ActionBar.h6.Z(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                ai.w7[] w7VarArr2 = this.Z;
                ai.w7 w7Var2 = w7VarArr2[i19];
                if (i19 != w7VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(w7Var2, w7.y5.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i19++;
                i17 = 17;
                i15 = -1;
                i18 = -1879048193;
            } else {
                this.f47965l0.addView(this.Y, w7.y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f47965l0, w7.y5.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.h6.f19133i5), getThemedColor(org.telegram.ui.ActionBar.h6.f19115h5));
                View view = new View(context);
                this.f47969q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = w7.y5.e(-1, 0, 48);
                e.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e);
                this.f47963j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                ch.d c12 = this.f47973u0.c(this.f47963j0, null, false);
                c12.p(AndroidUtilities.dp(4.0f));
                c12.q(AndroidUtilities.dp(28.0f));
                c12.o(new dh.b(org.telegram.ui.ActionBar.h6.f19045d6, d6Var));
                this.f47963j0.setBackground(c12);
                this.containerView.addView(this.f47963j0, w7.y5.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f47974v0 = new o0((TL_stars.starGiftAttributeBackdrop) zf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) zf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) zf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f47964k0.N(false);
                T(false);
                return;
            }
        }
    }

    public static double P(TL_stars.StarGiftAttribute starGiftAttribute) {
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

    public final void Q(int i10) {
        ah.h hVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f47971s0) != null) {
            if (w7.d0.a(i10, 2)) {
                org.telegram.ui.ActionBar.c3 c3Var = this.container;
                r0 r0Var = this.f47963j0;
                PointF pointF = this.f47978z0;
                hh.k.b(r0Var, c3Var, pointF);
                float f7 = pointF.x;
                RectF rectF = this.f47977y0;
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
                    hVar.g(1, this.A0);
                } else {
                    return;
                }
            }
            if (hVar.f458j != 0) {
                hVar.e(this.f47970r0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean R(o0 o0Var) {
        if (this.C0 != 1) {
            int i10 = this.f47963j0.f47929r;
            o0 o0Var2 = this.f47974v0;
            if (o0Var2 != null) {
                if (i10 == 1) {
                    if (o0Var.f47782a != o0Var2.f47782a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (o0Var.f47783b != o0Var2.f47783b) {
                        return false;
                    }
                } else if (i10 != 0 || o0Var.f47784c != o0Var2.f47784c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void S(int i10) {
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
        this.f47966n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f47968p0.setText(LocaleController.getString(i12));
        U();
    }

    public final void T(boolean z10) {
        m0 m0Var = this.f47967o0;
        if (m0Var.getUpgradeImageViewAttribute() != null && m0Var.getUpgradeBackdropAttribute() != null && m0Var.getUpgradePatternAttribute() != null) {
            ai.w7[] w7VarArr = this.Z;
            ((org.telegram.ui.Components.p6) w7VarArr[0].f1658c).c(m0Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[0].d).setText(x3.J1(m0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.p6) w7VarArr[1].f1658c).c(m0Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[1].d).c(ei.l.G0(m0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[2].f1658c).c(m0Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) w7VarArr[2].d).c(ei.l.G0(m0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void U() {
        q0 q0Var;
        o0 o0Var;
        wl0 wl0Var = this.d;
        int childCount = wl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wl0Var.getChildAt(i10);
            if ((childAt instanceof q0) && (o0Var = (q0Var = (q0) childAt).v) != null) {
                boolean R = R(o0Var);
                q0Var.f47880c.f(R, true);
                q0Var.f47883r.a(R, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f47965l0;
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
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (hVar = this.f47971s0) != null && (dVar = this.f47972t0) != null && !dVar.f9060n && dVar.g(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19133i5));
            if (LiteMode.isEnabled(262144)) {
                i10 = -2;
            } else {
                i10 = -3;
            }
            hVar.b(a2, i10);
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
            r0 r0Var = this.f47963j0;
            ((ViewGroup.MarginLayoutParams) r0Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.B0;
            r0Var.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        Q(2);
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        n0 n0Var = new n0(this, this.d, getContext(), this.X, new hi.a(this, 24), this.resourcesProvider);
        this.f47964k0 = n0Var;
        n0Var.f25265r = false;
        return n0Var;
    }

    @Override
    public final wl0 w(Context context) {
        return new l60(this, context, this.resourcesProvider, 3);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
