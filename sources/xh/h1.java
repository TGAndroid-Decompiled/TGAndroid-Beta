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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import yh.y7;
public final class h1 extends h51 {
    public static final int f45891a = 0;

    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        i51 J = i51.J(h1.class);
        J.f24903u = 1;
        J.f24907z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f24900r = z13;
        J.f24899q = z12;
        J.f24902t = z14;
        return J;
    }

    @Override
    public final void attachedView(ll0 ll0Var, View view, i51 i51Var) {
        ((i1) view).d(i51Var.h, false);
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        boolean z11;
        float f7;
        int i10;
        i1 i1Var = (i1) view;
        Object obj = i51Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            g1 g1Var = i1Var.J;
            TextView textView = i1Var.I;
            TextView textView2 = i1Var.H;
            e1 e1Var = i1Var.e;
            u9 u9Var = i1Var.f45925y;
            TextView textView3 = i1Var.L;
            TextView textView4 = i1Var.M;
            int d = kVar.d();
            if (i1Var.f45916h0 != kVar) {
                t01 c12 = y7.c1(u9Var, u9Var.getImageReceiver(), d);
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
            i1Var.f45920n.setVisibility(8);
            i1Var.F.setVisibility(8);
            if (kVar.f42338c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (i6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
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
            i1Var.K.setBackground(i6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) g1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) g1Var.getLayoutParams()).gravity = 49;
            i1Var.f45916h0 = kVar;
            i1Var.f45917i0 = null;
            i1Var.V = kVar;
            i1Var.W = null;
            i1Var.f45908b0 = false;
            i1Var.f45910c0 = null;
            i1Var.f45911d0 = false;
            i1Var.f45912e0 = false;
            i1Var.f45914f0 = false;
            i1Var.O = null;
            i1Var.P = null;
            i1Var.c(false, false);
            i1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = i51Var.e;
            Object obj2 = i51Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            i1Var.g(starGift, z13, z11, i51Var.f24899q, i51Var.f24900r, i51Var.f24902t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = i1Var.h((TL_stars.SavedStarGift) obj, i51Var.f24899q, i51Var.f24900r);
        }
        if (i51Var.f24889f) {
            i1Var.b(i51Var.e, z12);
        }
        i1Var.d(i51Var.h, z12);
        FrameLayout frameLayout = i1Var.d;
        float f10 = 1.0f;
        if (i51Var.f24890g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        j1 j1Var = i1Var.f45913f;
        if (!i51Var.f24890g) {
            f10 = 0.5f;
        }
        j1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new i1(context, i10, e6Var);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.f24899q == i51Var2.f24899q) {
            Object obj = i51Var.G;
            if (obj != null || i51Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == i51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = i51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f18338id == ((TL_stars.StarGift) obj2).f18338id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = i51Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f18338id == savedStarGift2.gift.f18338id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (i51Var.f24907z == i51Var2.f24907z && i51Var.e == i51Var2.e && i51Var.B == i51Var2.B && TextUtils.equals(i51Var.f24894l, i51Var2.f24894l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
