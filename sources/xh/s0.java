package xh;

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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x71;
import org.telegram.ui.w71;
import org.telegram.ui.ys;
import org.telegram.ui.zp0;
public final class s0 extends ab {
    public static final int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final bi.w7[] Z;
    public final ArrayList f46000a0;
    public final ArrayList f46001b0;
    public final ArrayList f46002c0;
    public final ArrayList f46003d0;
    public final com.google.android.gms.common.api.internal.r f46004e0;
    public final com.google.android.gms.common.api.internal.r f46005f0;
    public final com.google.android.gms.common.api.internal.r f46006g0;
    public final uz f46007h0;
    public final l0 f46008i0;
    public final r0 f46009j0;
    public n0 f46010k0;
    public final FrameLayout f46011l0;
    public final ImageView m0;
    public final ImageView f46012n0;
    public final m0 f46013o0;
    public final TextView f46014p0;
    public final View f46015q0;
    public final zg.k f46016r0;
    public final zg.e f46017s0;
    public final eh.d f46018t0;
    public final zg.a f46019u0;
    public o0 f46020v0;
    public final boolean f46021w0;
    public boolean f46022x0;
    public final RectF f46023y0;
    public final PointF f46024z0;

    public s0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, f6Var);
        int i11;
        this.C0 = 1;
        RectF rectF = new RectF();
        this.f46023y0 = rectF;
        this.f46024z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.f46021w0 = z10;
        vl0 vl0Var = this.d;
        org.telegram.ui.ActionBar.f3 f3Var = this.container;
        Objects.requireNonNull(vl0Var);
        this.f46016r0 = new zg.k(vl0Var, f3Var, new ys(vl0Var, 0));
        ArrayList c10 = yf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f46000a0 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.f46004e0 = rVar;
        rVar.f4939b = false;
        ArrayList c11 = yf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f46001b0 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.f46005f0 = rVar2;
        rVar2.f4939b = false;
        this.f46002c0 = yf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f46003d0 = arrayList3;
        if (z10) {
            int i12 = 0;
            while (i12 < this.f46002c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f46002c0.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f46003d0.add(stargiftattributemodel);
                    this.f46002c0.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.f46000a0, Comparator$CC.comparingDouble(new x71(4)));
        List.EL.sort(this.f46001b0, Comparator$CC.comparingDouble(new x71(5)));
        List.EL.sort(this.f46002c0, Comparator$CC.comparingDouble(new x71(6)));
        List.EL.sort(this.f46003d0, Comparator$CC.comparingDouble(new x71(6)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.f46002c0);
        this.f46006g0 = rVar3;
        rVar3.f4939b = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.j6.f18016i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.j6.f17998h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        eh.c cVar = new eh.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f46017s0 = new zg.e(false);
            eh.d dVar = new eh.d(cVar);
            this.f46018t0 = dVar;
            dVar.v = new Runnable(this) {
                public final s0 f45611b;

                {
                    this.f45611b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                s0 s0Var = this.f45611b;
                                if (s0Var.f46017s0 != null) {
                                    s0Var.Q(2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f45611b.onBackPressed();
                            return;
                    }
                }
            };
            zg.a aVar = new zg.a(dVar);
            this.f46019u0 = aVar;
            aVar.f48083f = LiteMode.isEnabled(262144);
        } else {
            this.f46017s0 = null;
            this.f46018t0 = null;
            this.f46019u0 = new zg.a(cVar);
        }
        gh.k kVar = new gh.k(this.container);
        zg.a aVar2 = this.f46019u0;
        org.telegram.ui.ActionBar.f3 f3Var2 = this.container;
        aVar2.d = kVar;
        aVar2.e = f3Var2;
        uz uzVar = new uz(3, false);
        this.f46007h0 = uzVar;
        uzVar.O = new bi.i2(this, 8);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(uzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new al0(this, 16));
        ?? jVar = new s4.j();
        this.f46008i0 = jVar;
        jVar.C = false;
        jVar.f41645m = false;
        jVar.n(280L);
        jVar.o(wr.h);
        jVar.D = 30L;
        this.d.setItemAnimator(jVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46011l0 = frameLayout;
        frameLayout.setClipChildren(false);
        m0 m0Var = new m0(this, context, f6Var, new Runnable(this) {
            public final s0 f45611b;

            {
                this.f45611b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            s0 s0Var = this.f45611b;
                            if (s0Var.f46017s0 != null) {
                                s0Var.Q(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f45611b.onBackPressed();
                        return;
                }
            }
        }, new bi.d5(26), new bi.d5(26), new bi.d5(26), new bi.d5(26), new bi.d5(26), new bi.d5(26));
        this.f46013o0 = m0Var;
        m0Var.d(new f4.d(1, 1));
        m0Var.setPreviewingAttributes(arrayList);
        m0Var.removeView(m0Var.O);
        int i15 = -1;
        frameLayout.addView(m0Var, w7.a6.c(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new org.telegram.ui.web.c(this, 16));
        w7.c6.a(imageView);
        frameLayout.addView(imageView, w7.a6.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f46012n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new w71(28, this, arrayList));
        w7.c6.a(imageView2);
        frameLayout.addView(imageView2, w7.a6.d(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView f7 = org.telegram.ui.Cells.r6.f(frameLayout, textView, w7.a6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f46014p0 = f7;
        f7.setTextSize(1, 13.0f);
        f7.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        f7.setGravity(17);
        int i18 = -1879048193;
        f7.setTextColor(-1879048193);
        frameLayout.addView(f7, w7.a6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new bi.w7[3];
        this.f46009j0 = new r0(context, f6Var, new org.telegram.ui.web.y1(this, 18));
        int i19 = 0;
        while (true) {
            bi.w7[] w7VarArr = this.Z;
            if (i19 < w7VarArr.length) {
                bi.w7 w7Var = new bi.w7(context);
                w7Var.setClipChildren(false);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
                w7Var.f3834c = o6Var;
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextSize(AndroidUtilities.dp(13.0f));
                o6Var.setTextColor(i15);
                o6Var.setGravity(i17);
                w7Var.addView(o6Var, w7.a6.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                w7Var.f3833b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i18);
                textView2.setGravity(i17);
                w7Var.addView(textView2, w7.a6.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
                w7Var.d = o6Var2;
                o6Var2.setTypeface(AndroidUtilities.bold());
                o6Var2.setTextColor(i15);
                o6Var2.setGravity(5);
                o6Var2.getDrawable().N = true;
                o6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                o6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                o6Var2.setSizeableBackground(new k3(AndroidUtilities.dp(10.0f), 285212671));
                w7Var.addView(o6Var2, w7.a6.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                w7VarArr[i19] = w7Var;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            ((TextView) this.Z[i19].f3833b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.Z[i19].f3833b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.Z[i19].f3833b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                w7.c6.a(this.Z[i19]);
                this.Z[i19].setOnClickListener(new bi.j5(this, i19, 26));
                this.Z[i19].setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                bi.w7[] w7VarArr2 = this.Z;
                bi.w7 w7Var2 = w7VarArr2[i19];
                if (i19 != w7VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(w7Var2, w7.a6.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i19++;
                i17 = 17;
                i15 = -1;
                i18 = -1879048193;
            } else {
                this.f46011l0.addView(this.Y, w7.a6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f46011l0, w7.a6.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.j6.f18016i5), getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
                View view = new View(context);
                this.f46015q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = w7.a6.e(-1, 0, 48);
                e.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e);
                this.f46009j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                bh.d c12 = this.f46019u0.c(this.f46009j0, null, false);
                c12.o(AndroidUtilities.dp(4.0f));
                c12.p(AndroidUtilities.dp(28.0f));
                c12.n(new ch.b(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
                this.f46009j0.setBackground(c12);
                this.containerView.addView(this.f46009j0, w7.a6.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f46020v0 = new o0((TL_stars.starGiftAttributeBackdrop) yf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) yf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) yf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f46010k0.N(false);
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
        zg.e eVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f46017s0) != null) {
            if (w7.c0.a(i10, 2)) {
                org.telegram.ui.ActionBar.f3 f3Var = this.container;
                r0 r0Var = this.f46009j0;
                PointF pointF = this.f46024z0;
                gh.k.b(r0Var, f3Var, pointF);
                float f7 = pointF.x;
                RectF rectF = this.f46023y0;
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
                    eVar.g(1, this.A0);
                } else {
                    return;
                }
            }
            if (eVar.f48114j != 0) {
                eVar.e(this.f46016r0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean R(o0 o0Var) {
        if (this.C0 != 1) {
            int i10 = this.f46009j0.f45948r;
            o0 o0Var2 = this.f46020v0;
            if (o0Var2 != null) {
                if (i10 == 1) {
                    if (o0Var.f45786a != o0Var2.f45786a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (o0Var.f45787b != o0Var2.f45787b) {
                        return false;
                    }
                } else if (i10 != 0 || o0Var.f45788c != o0Var2.f45788c) {
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
        this.f46012n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f46014p0.setText(LocaleController.getString(i12));
        U();
    }

    public final void T(boolean z10) {
        m0 m0Var = this.f46013o0;
        if (m0Var.getUpgradeImageViewAttribute() != null && m0Var.getUpgradeBackdropAttribute() != null && m0Var.getUpgradePatternAttribute() != null) {
            bi.w7[] w7VarArr = this.Z;
            ((org.telegram.ui.Components.o6) w7VarArr[0].f3834c).c(m0Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.o6) w7VarArr[0].d).setText(x3.J1(m0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.o6) w7VarArr[1].f3834c).c(m0Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.o6) w7VarArr[1].d).c(di.m.G0(m0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.o6) w7VarArr[2].f3834c).c(m0Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.o6) w7VarArr[2].d).c(di.m.G0(m0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void U() {
        q0 q0Var;
        o0 o0Var;
        vl0 vl0Var = this.d;
        int childCount = vl0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = vl0Var.getChildAt(i10);
            if ((childAt instanceof q0) && (o0Var = (q0Var = (q0) childAt).v) != null) {
                boolean R = R(o0Var);
                q0Var.f45903c.f(R, true);
                q0Var.f45906r.a(R, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f46011l0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f10) {
            return true;
        }
        return false;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        zg.e eVar;
        eh.d dVar;
        int i10;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (eVar = this.f46017s0) != null && (dVar = this.f46018t0) != null && !dVar.f7522n && dVar.f(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18016i5));
            if (LiteMode.isEnabled(262144)) {
                i10 = -2;
            } else {
                i10 = -3;
            }
            eVar.b(a2, i10);
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
            r0 r0Var = this.f46009j0;
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
    public final ul0 v(vl0 vl0Var) {
        n0 n0Var = new n0(this, this.d, getContext(), this.X, new gi.a(this, 24), this.resourcesProvider);
        this.f46010k0 = n0Var;
        n0Var.f24250r = false;
        return n0Var;
    }

    @Override
    public final vl0 w(Context context) {
        return new zp0(this, context, this.resourcesProvider, 2);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
