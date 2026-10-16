package zh;

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
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.bt;
import org.telegram.ui.v60;
public final class r0 extends db {
    public static final int D0 = 0;
    public final ArrayList A0;
    public int B0;
    public int C0;
    public final int X;
    public final LinearLayout Y;
    public final bi.i7[] Z;
    public final ArrayList f51034a0;
    public final ArrayList f51035b0;
    public final ArrayList f51036c0;
    public final ArrayList f51037d0;
    public final com.google.android.gms.common.api.internal.r f51038e0;
    public final com.google.android.gms.common.api.internal.r f51039f0;
    public final com.google.android.gms.common.api.internal.r f51040g0;
    public final zz f51041h0;
    public final k0 f51042i0;
    public final q0 f51043j0;
    public m0 f51044k0;
    public final FrameLayout f51045l0;
    public final ImageView m0;
    public final ImageView f51046n0;
    public final l0 f51047o0;
    public final TextView f51048p0;
    public final View f51049q0;
    public final bh.l f51050r0;
    public final bh.f f51051s0;
    public final gh.d f51052t0;
    public final bh.b f51053u0;
    public n0 f51054v0;
    public final boolean f51055w0;
    public boolean f51056x0;
    public final RectF f51057y0;
    public final PointF f51058z0;

    public r0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, String str, ArrayList arrayList, boolean z10) {
        super(context, null, false, false, c6Var);
        int i11;
        this.C0 = 1;
        RectF rectF = new RectF();
        this.f51057y0 = rectF;
        this.f51058z0 = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.A0 = arrayList2;
        arrayList2.add(rectF);
        this.X = i10;
        this.f51055w0 = z10;
        mm0 mm0Var = this.d;
        org.telegram.ui.ActionBar.c3 c3Var = this.container;
        Objects.requireNonNull(mm0Var);
        this.f51050r0 = new bh.l(mm0Var, c3Var, new bt(mm0Var, 0));
        ArrayList c10 = ag.d.c(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.f51034a0 = c10;
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(c10);
        this.f51038e0 = rVar;
        rVar.f5031b = false;
        ArrayList c11 = ag.d.c(arrayList, TL_stars.starGiftAttributePattern.class);
        this.f51035b0 = c11;
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r(c11);
        this.f51039f0 = rVar2;
        rVar2.f5031b = false;
        this.f51036c0 = ag.d.c(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.f51037d0 = arrayList3;
        if (z10) {
            int i12 = 0;
            while (i12 < this.f51036c0.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.f51036c0.get(i12);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.f51037d0.add(stargiftattributemodel);
                    this.f51036c0.remove(i12);
                    i12--;
                }
                i12++;
            }
        } else {
            arrayList3.clear();
        }
        List.EL.sort(this.f51034a0, Comparator$CC.comparingDouble(new m81(4)));
        List.EL.sort(this.f51035b0, Comparator$CC.comparingDouble(new m81(5)));
        List.EL.sort(this.f51036c0, Comparator$CC.comparingDouble(new m81(6)));
        List.EL.sort(this.f51037d0, Comparator$CC.comparingDouble(new m81(6)));
        com.google.android.gms.common.api.internal.r rVar3 = new com.google.android.gms.common.api.internal.r(this.f51036c0);
        this.f51040g0 = rVar3;
        rVar3.f5031b = false;
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
        this.L = false;
        this.K = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i13 = org.telegram.ui.ActionBar.g6.f19689i5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.g6.f19672h5;
        setBackgroundColor(i0.a.d(0.1f, themedColor, getThemedColor(i14)));
        fixNavigationBar();
        gh.c cVar = new gh.c();
        cVar.a(i0.a.d(0.1f, getThemedColor(i13), getThemedColor(i14)));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.f51051s0 = new bh.f(false);
            gh.d dVar = new gh.d(cVar);
            this.f51052t0 = dVar;
            dVar.v = new Runnable(this) {
                public final r0 f50687b;

                {
                    this.f50687b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31) {
                                r0 r0Var = this.f50687b;
                                if (r0Var.f51051s0 != null) {
                                    r0Var.R(2);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f50687b.onBackPressed();
                            return;
                    }
                }
            };
            bh.b bVar = new bh.b(dVar);
            this.f51053u0 = bVar;
            bVar.f2751i = LiteMode.isEnabled(262144);
        } else {
            this.f51051s0 = null;
            this.f51052t0 = null;
            this.f51053u0 = new bh.b(cVar);
        }
        ih.j jVar = new ih.j(this.container);
        bh.b bVar2 = this.f51053u0;
        org.telegram.ui.ActionBar.c3 c3Var2 = this.container;
        bVar2.f2749f = jVar;
        bVar2.f2750g = c3Var2;
        zz zzVar = new zz(3, false);
        this.f51041h0 = zzVar;
        zzVar.O = new di.w1(this, 8);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.d.setClipToPadding(false);
        this.d.setLayoutManager(zzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.j(new kc0(this, 22));
        ?? kVar = new s4.k();
        this.f51042i0 = kVar;
        kVar.C = false;
        kVar.f44872m = false;
        kVar.n(280L);
        kVar.o(es.h);
        kVar.D = 30L;
        this.d.setItemAnimator(kVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51045l0 = frameLayout;
        frameLayout.setClipChildren(false);
        l0 l0Var = new l0(this, context, c6Var, new Runnable(this) {
            public final r0 f50687b;

            {
                this.f50687b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31) {
                            r0 r0Var = this.f50687b;
                            if (r0Var.f51051s0 != null) {
                                r0Var.R(2);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f50687b.onBackPressed();
                        return;
                }
            }
        }, new ah.f(28), new ah.f(28), new ah.f(28), new ah.f(28), new ah.f(28), new ah.f(28));
        this.f51047o0 = l0Var;
        l0Var.d(new f4.d(1, 1));
        l0Var.setPreviewingAttributes(arrayList);
        l0Var.removeView(l0Var.O);
        int i15 = -1;
        frameLayout.addView(l0Var, w7.z5.d(-1.0f, -1));
        int i16 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i16, 0, i16, 0);
        ImageView imageView = new ImageView(context);
        this.m0 = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.a0(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new ji.o4(this, 22));
        w7.b6.a(imageView);
        frameLayout.addView(imageView, w7.z5.a(32.0f, 12.0f, 14.0f, 0.0f, 0.0f, 32, 51));
        ImageView imageView2 = new ImageView(context);
        this.f51046n0 = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.a0(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new yh.a(8, this, arrayList));
        w7.b6.a(imageView2);
        frameLayout.addView(imageView2, w7.z5.a(32.0f, 0.0f, 14.0f, 12.0f, 0.0f, 32, 53));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        int i17 = 17;
        textView.setGravity(17);
        textView.setTextColor(-1);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 102.0f, -1, 87), context);
        this.f51048p0 = g10;
        float f7 = 13.0f;
        g10.setTextSize(1, 13.0f);
        g10.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        g10.setGravity(17);
        int i18 = -1879048193;
        g10.setTextColor(-1879048193);
        frameLayout.addView(g10, w7.z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 82.0f, -1, 87));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.Z = new bi.i7[3];
        this.f51043j0 = new q0(context, c6Var, new ji.p1(this, 25));
        int i19 = 0;
        while (true) {
            bi.i7[] i7VarArr = this.Z;
            if (i19 < i7VarArr.length) {
                float f10 = f7;
                bi.i7 i7Var = new bi.i7(context, 12);
                i7Var.setClipChildren(false);
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, false, false);
                i7Var.f3179c = s6Var;
                s6Var.setTypeface(AndroidUtilities.bold());
                s6Var.setTextSize(AndroidUtilities.dp(f10));
                s6Var.setTextColor(i15);
                s6Var.setGravity(i17);
                i7Var.addView(s6Var, w7.z5.a(16.0f, 4.0f, 6.0f, 4.0f, 0.0f, -1, 49));
                TextView textView2 = new TextView(context);
                i7Var.f3178b = textView2;
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(i18);
                textView2.setGravity(i17);
                i7Var.addView(textView2, w7.z5.a(-2.0f, 4.0f, 20.0f, 4.0f, 0.0f, -1, 49));
                org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
                i7Var.d = s6Var2;
                s6Var2.setTypeface(AndroidUtilities.bold());
                s6Var2.setTextColor(i15);
                s6Var2.setGravity(5);
                s6Var2.getDrawable().T = true;
                s6Var2.setTextSize(AndroidUtilities.dp(11.0f));
                s6Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                s6Var2.setSizeableBackground(new f3(AndroidUtilities.dp(10.0f), 285212671));
                i7Var.addView(s6Var2, w7.z5.a(16.0f, 0.0f, -9.0f, -4.0f, 0.0f, -1, 53));
                i7VarArr[i19] = i7Var;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            ((TextView) this.Z[i19].f3178b).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                        }
                    } else {
                        ((TextView) this.Z[i19].f3178b).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                    }
                } else {
                    ((TextView) this.Z[i19].f3178b).setText(LocaleController.getString(R.string.GiftPreviewModel));
                }
                w7.b6.a(this.Z[i19]);
                this.Z[i19].setOnClickListener(new di.m4(this, i19, 27));
                this.Z[i19].setBackground(org.telegram.ui.ActionBar.g6.a0(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.Y;
                bi.i7[] i7VarArr2 = this.Z;
                bi.i7 i7Var2 = i7VarArr2[i19];
                if (i19 != i7VarArr2.length - 1) {
                    i11 = 11;
                } else {
                    i11 = 0;
                }
                linearLayout2.addView(i7Var2, w7.z5.p(0, 42, 1.0f, 7, 0, 0, i11, 0));
                i19++;
                f7 = f10;
                i17 = 17;
                i15 = -1;
                i18 = -1879048193;
            } else {
                this.f51045l0.addView(this.Y, w7.z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 18.0f, -1, 87));
                this.containerView.addView(this.f51045l0, w7.z5.e(-1, 315, 55));
                int d = i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.g6.f19689i5), getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
                View view = new View(context);
                this.f51049q0 = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(d, 160), d & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams e = w7.z5.e(-1, 0, 48);
                e.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, e);
                this.f51043j0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                dh.d c12 = this.f51053u0.c(this.f51043j0, null, false);
                c12.p(AndroidUtilities.dp(4.0f));
                c12.q(AndroidUtilities.dp(28.0f));
                c12.o(new eh.b(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
                this.f51043j0.setBackground(c12);
                this.containerView.addView(this.f51043j0, w7.z5.a(64.0f, 0.0f, 0.0f, 0.0f, 5.0f, 268, 81));
                this.f51054v0 = new n0((TL_stars.starGiftAttributeBackdrop) ag.d.d(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) ag.d.d(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) ag.d.d(arrayList, TL_stars.starGiftAttributeModel.class));
                this.f51044k0.N(false);
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
        bh.f fVar;
        int dp;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f51051s0) != null) {
            if (w7.l6.a(i10, 2)) {
                org.telegram.ui.ActionBar.c3 c3Var = this.container;
                q0 q0Var = this.f51043j0;
                PointF pointF = this.f51058z0;
                ih.j.b(q0Var, c3Var, pointF);
                float f7 = pointF.x;
                RectF rectF = this.f51057y0;
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
                    fVar.g(1, this.A0);
                } else {
                    return;
                }
            }
            if (fVar.f2782j != 0) {
                fVar.e(this.f51050r0, this.container.getWidth(), this.container.getHeight());
            }
        }
    }

    public final boolean S(n0 n0Var) {
        if (this.C0 != 1) {
            int i10 = this.f51043j0.f51003r;
            n0 n0Var2 = this.f51054v0;
            if (n0Var2 != null) {
                if (i10 == 1) {
                    if (n0Var.f50851a != n0Var2.f50851a) {
                        return false;
                    }
                } else if (i10 == 2) {
                    if (n0Var.f50852b != n0Var2.f50852b) {
                        return false;
                    }
                } else if (i10 != 0 || n0Var.f50853c != n0Var2.f50853c) {
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
        this.f51046n0.setImageResource(i11);
        if (i10 == 2) {
            i12 = R.string.Gift2PreviewSelectedTraits;
        } else {
            i12 = R.string.Gift2PreviewRandomTraits;
        }
        this.f51048p0.setText(LocaleController.getString(i12));
        V();
    }

    public final void U(boolean z10) {
        l0 l0Var = this.f51047o0;
        if (l0Var.getUpgradeImageViewAttribute() != null && l0Var.getUpgradeBackdropAttribute() != null && l0Var.getUpgradePatternAttribute() != null) {
            bi.i7[] i7VarArr = this.Z;
            ((org.telegram.ui.Components.s6) i7VarArr[0].f3179c).c(l0Var.getUpgradeImageViewAttribute().name, z10, true);
            ((org.telegram.ui.Components.s6) i7VarArr[0].d).setText(r3.K1(l0Var.getUpgradeImageViewAttribute().rarity, new Integer[1]));
            ((org.telegram.ui.Components.s6) i7VarArr[1].f3179c).c(l0Var.getUpgradeBackdropAttribute().name, z10, true);
            ((org.telegram.ui.Components.s6) i7VarArr[1].d).c(fi.l.H0(l0Var.getUpgradeBackdropAttribute().getRarityPermille()), z10, true);
            ((org.telegram.ui.Components.s6) i7VarArr[2].f3179c).c(l0Var.getUpgradePatternAttribute().name, z10, true);
            ((org.telegram.ui.Components.s6) i7VarArr[2].d).c(fi.l.H0(l0Var.getUpgradePatternAttribute().getRarityPermille()), z10, true);
        }
    }

    public final void V() {
        p0 p0Var;
        n0 n0Var;
        mm0 mm0Var = this.d;
        int childCount = mm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = mm0Var.getChildAt(i10);
            if ((childAt instanceof p0) && (n0Var = (p0Var = (p0) childAt).v) != null) {
                boolean S = S(n0Var);
                p0Var.f50970c.f(S, true);
                p0Var.f50973r.a(S, true);
            }
        }
    }

    @Override
    public final boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.f51045l0;
        if (frameLayout.getVisibility() == 0 && frameLayout.getY() > f10) {
            return true;
        }
        return false;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        bh.f fVar;
        gh.d dVar;
        int i10;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (fVar = this.f51051s0) != null && (dVar = this.f51052t0) != null && !dVar.f10157n && dVar.g(width, height)) {
            RecordingCanvas a2 = dVar.a(width, height);
            a2.drawColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19689i5));
            if (LiteMode.isEnabled(262144)) {
                i10 = -2;
            } else {
                i10 = -3;
            }
            fVar.b(a2, i10);
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
            q0 q0Var = this.f51043j0;
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
    public final lm0 x(mm0 mm0Var) {
        m0 m0Var = new m0(this, this.d, getContext(), this.X, new ii.a(this, 24), this.resourcesProvider);
        this.f51044k0 = m0Var;
        m0Var.f23145r = false;
        return m0Var;
    }

    @Override
    public final mm0 y(Context context) {
        return new v60(this, context, this.resourcesProvider, 3);
    }
}
