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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import yh.w7;
public final class i1 extends g51 {
    public static final int f45850a = 0;

    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        h51 J = h51.J(i1.class);
        J.f24516u = 1;
        J.f24520z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f24513r = z13;
        J.f24512q = z12;
        J.f24515t = z14;
        return J;
    }

    @Override
    public final void attachedView(ml0 ml0Var, View view, h51 h51Var) {
        ((j1) view).d(h51Var.h, false);
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        float f7;
        int i10;
        j1 j1Var = (j1) view;
        Object obj = h51Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            h1 h1Var = j1Var.J;
            TextView textView = j1Var.I;
            TextView textView2 = j1Var.H;
            f1 f1Var = j1Var.e;
            w9 w9Var = j1Var.f45895y;
            TextView textView3 = j1Var.L;
            TextView textView4 = j1Var.M;
            int d = kVar.d();
            if (j1Var.f45886h0 != kVar) {
                s01 c12 = w7.c1(w9Var, w9Var.getImageReceiver(), d);
                j1Var.N = c12;
                c12.run();
                j1Var.N = null;
            }
            f1Var.d(null);
            f1Var.e(null);
            f1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            w9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            j1Var.f45890n.setVisibility(8);
            j1Var.F.setVisibility(8);
            if (kVar.f42289c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (h6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                pq[] pqVarArr = new pq[1];
                textView4.setText(w7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, pqVarArr));
                pqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = j1Var.E;
            layoutParams.gravity = 49;
            w9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            j1Var.K.setBackground(h6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) h1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) h1Var.getLayoutParams()).gravity = 49;
            j1Var.f45886h0 = kVar;
            j1Var.f45887i0 = null;
            j1Var.V = kVar;
            j1Var.W = null;
            j1Var.f45878b0 = false;
            j1Var.f45880c0 = null;
            j1Var.f45881d0 = false;
            j1Var.f45882e0 = false;
            j1Var.f45884f0 = false;
            j1Var.O = null;
            j1Var.P = null;
            j1Var.c(false, false);
            j1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = h51Var.e;
            Object obj2 = h51Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            j1Var.g(starGift, z13, z11, h51Var.f24512q, h51Var.f24513r, h51Var.f24515t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = j1Var.h((TL_stars.SavedStarGift) obj, h51Var.f24512q, h51Var.f24513r);
        }
        if (h51Var.f24502f) {
            j1Var.b(h51Var.e, z12);
        }
        j1Var.d(h51Var.h, z12);
        FrameLayout frameLayout = j1Var.d;
        float f10 = 1.0f;
        if (h51Var.f24503g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        k1 k1Var = j1Var.f45883f;
        if (!h51Var.f24503g) {
            f10 = 0.5f;
        }
        k1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new j1(context, i10, d6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.f24512q == h51Var2.f24512q) {
            Object obj = h51Var.G;
            if (obj != null || h51Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == h51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = h51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f18308id == ((TL_stars.StarGift) obj2).f18308id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = h51Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f18308id == savedStarGift2.gift.f18308id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (h51Var.f24520z == h51Var2.f24520z && h51Var.e == h51Var2.e && h51Var.B == h51Var2.B && TextUtils.equals(h51Var.f24507l, h51Var2.f24507l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
