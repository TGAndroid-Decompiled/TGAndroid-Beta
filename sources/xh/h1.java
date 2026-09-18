package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.x51;
import yh.y7;
public final class h1 extends i51 {
    public static final int f45919a = 0;

    static {
        i51.setup(new i51());
    }

    public static j51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        j51 J = j51.J(h1.class);
        J.f25136u = 1;
        J.f25140z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f25133r = z13;
        J.f25132q = z12;
        J.f25135t = z14;
        return J;
    }

    @Override
    public final void attachedView(ml0 ml0Var, View view, j51 j51Var) {
        ((i1) view).d(j51Var.h, false);
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        boolean z11;
        float f7;
        int i10;
        i1 i1Var = (i1) view;
        Object obj = j51Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            g1 g1Var = i1Var.J;
            TextView textView = i1Var.I;
            TextView textView2 = i1Var.H;
            e1 e1Var = i1Var.e;
            u9 u9Var = i1Var.f45953y;
            TextView textView3 = i1Var.L;
            TextView textView4 = i1Var.M;
            int d = kVar.d();
            if (i1Var.f45944h0 != kVar) {
                u01 c12 = y7.c1(u9Var, u9Var.getImageReceiver(), d);
                i1Var.N = c12;
                c12.run();
                i1Var.N = null;
            }
            e1Var.d(null);
            e1Var.e(null);
            e1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            u9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            i1Var.f45948n.setVisibility(8);
            i1Var.F.setVisibility(8);
            if (kVar.f42365c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (j6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                oq[] oqVarArr = new oq[1];
                textView4.setText(y7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, oqVarArr));
                oqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i1Var.E;
            layoutParams.gravity = 49;
            u9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            i1Var.K.setBackground(j6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) g1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) g1Var.getLayoutParams()).gravity = 49;
            i1Var.f45944h0 = kVar;
            i1Var.f45945i0 = null;
            i1Var.V = kVar;
            i1Var.W = null;
            i1Var.f45936b0 = false;
            i1Var.f45938c0 = null;
            i1Var.f45939d0 = false;
            i1Var.f45940e0 = false;
            i1Var.f45942f0 = false;
            i1Var.O = null;
            i1Var.P = null;
            i1Var.c(false, false);
            i1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = j51Var.e;
            Object obj2 = j51Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            i1Var.g(starGift, z13, z11, j51Var.f25132q, j51Var.f25133r, j51Var.f25135t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = i1Var.h((TL_stars.SavedStarGift) obj, j51Var.f25132q, j51Var.f25133r);
        }
        if (j51Var.f25122f) {
            i1Var.b(j51Var.e, z12);
        }
        i1Var.d(j51Var.h, z12);
        FrameLayout frameLayout = i1Var.d;
        float f10 = 1.0f;
        if (j51Var.f25123g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        j1 j1Var = i1Var.f45941f;
        if (!j51Var.f25123g) {
            f10 = 0.5f;
        }
        j1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new i1(context, i10, f6Var);
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.f25132q == j51Var2.f25132q) {
            Object obj = j51Var.G;
            if (obj != null || j51Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == j51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = j51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f18346id == ((TL_stars.StarGift) obj2).f18346id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = j51Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f18346id == savedStarGift2.gift.f18346id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (j51Var.f25140z == j51Var2.f25140z && j51Var.e == j51Var2.e && j51Var.B == j51Var2.B && TextUtils.equals(j51Var.f25127l, j51Var2.f25127l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
