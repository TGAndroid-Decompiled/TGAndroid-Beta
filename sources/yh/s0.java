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
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.y71;
import org.telegram.ui.q60;
import org.telegram.ui.xs;
public final class s0 extends bb {
    public static final int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final ai.v7[] Z;
    public final ArrayList f47961a0;
    public final ArrayList f47962b0;
    public final ArrayList f47963c0;
    public final ArrayList f47964d0;
    public final com.google.android.gms.common.api.internal.r f47965e0;
    public final com.google.android.gms.common.api.internal.r f47966f0;
    public final com.google.android.gms.common.api.internal.r f47967g0;
    public final nz f47968h0;
    public final l0 f47969i0;
    public final r0 f47970j0;
    public n0 f47971k0;
    public final FrameLayout f47972l0;
    public final ImageView m0;
    public final ImageView f47973n0;
    public final m0 f47974o0;
    public final TextView f47975p0;
    public final View f47976q0;
    public final ah.o f47977r0;
    public final ah.i f47978s0;
    public final fh.d f47979t0;
    public final ah.c f47980u0;
    public o0 f47981v0;
    public final boolean f47982w0;
    public boolean f47983x0;
    public final RectF f47984y0;
    public final PointF f47985z0;

    public s0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, e6Var);
        int i11;
        this.C0 = 1;
        RectF rectF = new RectF();
        this.f47984y0 = rectF;
        this.f47985z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.f47982w0 = z10;
        wl0 wl0Var = this.d;
        org.telegram.ui.ActionBar.d3 d3Var = this.container;
        Objects.requireNonNull(wl0Var);
        this.f47977r0 = new ah.o(wl0Var, d3Var, new xs(wl0Var, 0));
        ArrayList c10 = zf.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f47961a0 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.f47965e0 = rVar;
        rVar.f6165b = false;
        ArrayList c11 = zf.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f47962b0 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.f47966f0 = rVar2;
        rVar2.f6165b = false;
        this.f47963c0 = zf.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f47964d0 = arrayList3;
        if (z10) {
            int i12 = 0;
            while (i12 < this.f47963c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f47963c0.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f47964d0.add(stargiftattributemodel);
                    this.f47963c0.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.f47961a0, Comparator$CC.comparingDouble(new y71(4)));
        List.EL.sort(this.f47962b0, Comparator$CC.comparingDouble(new y71(5)));
        List.EL.sort(this.f47963c0, Comparator$CC.comparingDouble(new y71(6)));
        List.EL.sort(this.f47964d0, Comparator$CC.comparingDouble(new y71(6)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.f47963c0);
        this.f47967g0 = rVar3;
        rVar3.f6165b = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.j6.f19151i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.j6.f19133h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        fh.c cVar = new fh.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f47978s0 = new ah.i(false);
            fh.d dVar = new fh.d(cVar);
            this.f47979t0 = dVar;
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
                                if (s0Var.f47978s0 != null) {
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
            this.f47980u0 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
        } else {
            this.f47978s0 = null;
            this.f47979t0 = null;
            this.f47980u0 = new ah.c(cVar);
        }
        hh.k kVar = new hh.k(this.container);
        ah.c cVar3 = this.f47980u0;
        org.telegram.ui.ActionBar.d3 d3Var2 = this.container;
        cVar3.f425f = kVar;
        cVar3.f426g = d3Var2;
        nz nzVar = new nz(3, false);
        this.f47968h0 = nzVar;
        nzVar.O = new ci.x1(this, 8);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(nzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new tb0(this, 20));
        ?? jVar = new s4.j();
        this.f47969i0 = jVar;
        jVar.C = false;
        jVar.f42964m = false;
        jVar.n(280L);
        jVar.o(qr.h);
        jVar.D = 30L;
        this.d.setItemAnimator(jVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47972l0 = frameLayout;
        frameLayout.setClipChildren(false);
        m0 m0Var = new m0(this, context, e6Var, new Runnable(this) {
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
                            if (s0Var.f47978s0 != null) {
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
        this.f47974o0 = m0Var;
        m0Var.d(new f4.d(1, 1));
        m0Var.setPreviewingAttributes(arrayList);
        m0Var.removeView(m0Var.O);
        int i15 = -1;
        frameLayout.addView(m0Var, w7.y5.c(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 21));
        w7.a6.a(imageView);
        frameLayout.addView(imageView, w7.y5.d(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f47973n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 16, 16));
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
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f), context);
        this.f47975p0 = g10;
        g10.setTextSize(1, 13.0f);
        g10.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        g10.setGravity(17);
        int i18 = -1879048193;
        g10.setTextColor(-1879048193);
        frameLayout.addView(g10, w7.y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new ai.v7[3];
        this.f47970j0 = new r0(context, e6Var, new org.telegram.ui.web.b1(this, 22));
        int i19 = 0;
        while (true) {
            ai.v7[] v7VarArr = this.Z;
            if (i19 < v7VarArr.length) {
                ai.v7 v7Var = new ai.v7(context);
                v7Var.setClipChildren(false);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
                v7Var.f1615c = p6Var;
                p6Var.setTypeface(AndroidUtilities.bold());
                p6Var.setTextSize(AndroidUtilities.dp(13.0f));
                p6Var.setTextColor(i15);
                p6Var.setGravity(i17);
                v7Var.addView(p6Var, w7.y5.d(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
                TextView textView2 = new TextView(context);
                v7Var.f1614b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i18);
                textView2.setGravity(i17);
                v7Var.addView(textView2, w7.y5.d(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, false, false);
                v7Var.d = p6Var2;
                p6Var2.setTypeface(AndroidUtilities.bold());
                p6Var2.setTextColor(i15);
                p6Var2.setGravity(5);
                p6Var2.getDrawable().N = true;
                p6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                p6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                p6Var2.setSizeableBackground(new l3(AndroidUtilities.dp(10.0f), 285212671));
                v7Var.addView(p6Var2, w7.y5.d(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
                v7VarArr[i19] = v7Var;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            ((TextView) this.Z[i19].f1614b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.Z[i19].f1614b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.Z[i19].f1614b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                w7.a6.a(this.Z[i19]);
                this.Z[i19].setOnClickListener(new ci.o4(this, i19, 26));
                this.Z[i19].setBackground(org.telegram.ui.ActionBar.j6.Z(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                ai.v7[] v7VarArr2 = this.Z;
                ai.v7 v7Var2 = v7VarArr2[i19];
                if (i19 != v7VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(v7Var2, w7.y5.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i19++;
                i17 = 17;
                i15 = -1;
                i18 = -1879048193;
            } else {
                this.f47972l0.addView(this.Y, w7.y5.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.f47972l0, w7.y5.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.j6.f19151i5), getThemedColor(org.telegram.ui.ActionBar.j6.f19133h5));
                View view = new View(context);
                this.f47976q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = w7.y5.e(-1, 0, 48);
                e.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e);
                this.f47970j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                ch.d c12 = this.f47980u0.c(this.f47970j0, null, false);
                c12.p(AndroidUtilities.dp(4.0f));
                c12.q(AndroidUtilities.dp(28.0f));
                c12.o(new dh.b(org.telegram.ui.ActionBar.j6.f19062d6, e6Var));
                this.f47970j0.setBackground(c12);
                this.containerView.addView(this.f47970j0, w7.y5.d(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.f47981v0 = new o0((TL_stars.starGiftAttributeBackdrop) zf.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) zf.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) zf.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f47971k0.N(false);
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
        ah.i iVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f47978s0) != null) {
            if (w7.d0.a(i10, 2)) {
                org.telegram.ui.ActionBar.d3 d3Var = this.container;
                r0 r0Var = this.f47970j0;
                PointF pointF = this.f47985z0;
                hh.k.b(r0Var, d3Var, pointF);
                float f7 = pointF.x;
                RectF rectF = this.f47984y0;
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
            if (iVar.f461k != 0) {
                iVar.e(this.f47977r0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean R(o0 o0Var) {
        if (this.C0 != 1) {
            int i10 = this.f47970j0.f47940r;
            o0 o0Var2 = this.f47981v0;
            if (o0Var2 != null) {
                if (i10 == 1) {
                    if (o0Var.f47797a != o0Var2.f47797a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (o0Var.f47798b != o0Var2.f47798b) {
                        return false;
                    }
                } else if (i10 != 0 || o0Var.f47799c != o0Var2.f47799c) {
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
        this.f47973n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f47975p0.setText(LocaleController.getString(i12));
        U();
    }

    public final void T(boolean z10) {
        m0 m0Var = this.f47974o0;
        if (m0Var.getUpgradeImageViewAttribute() != null && m0Var.getUpgradeBackdropAttribute() != null && m0Var.getUpgradePatternAttribute() != null) {
            ai.v7[] v7VarArr = this.Z;
            ((org.telegram.ui.Components.p6) v7VarArr[0].f1615c).c(m0Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) v7VarArr[0].d).setText(y3.J1(m0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.p6) v7VarArr[1].f1615c).c(m0Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) v7VarArr[1].d).c(ei.l.G0(m0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.p6) v7VarArr[2].f1615c).c(m0Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.p6) v7VarArr[2].d).c(ei.l.G0(m0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
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
                q0Var.f47888c.f(R, true);
                q0Var.f47891r.a(R, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f47972l0;
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
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (iVar = this.f47978s0) != null && (dVar = this.f47979t0) != null && !dVar.f9077n && dVar.g(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19151i5));
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
            r0 r0Var = this.f47970j0;
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
        this.f47971k0 = n0Var;
        n0Var.f26042r = false;
        return n0Var;
    }

    @Override
    public final wl0 w(Context context) {
        return new q60(this, context, this.resourcesProvider, 3);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
