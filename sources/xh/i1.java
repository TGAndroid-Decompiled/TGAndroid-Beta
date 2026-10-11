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
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.y9;
import yh.p7;
public final class i1 extends q61 {
    public static final int f51366a = 0;

    static {
        q61.setup(new q61());
    }

    public static r61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        r61 J = r61.J(i1.class);
        J.f30370u = 1;
        J.f30374z = i10;
        J.G = starGift;
        J.f30355e = z10;
        J.H = Boolean.valueOf(z11);
        J.f30367r = z13;
        J.f30366q = z12;
        J.f30369t = z14;
        return J;
    }

    @Override
    public final void attachedView(sm0 sm0Var, View view, r61 r61Var) {
        ((j1) view).d(r61Var.h, false);
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        boolean z11;
        float f7;
        int i10;
        j1 j1Var = (j1) view;
        Object obj = r61Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            rg.t0 t0Var = j1Var.J;
            TextView textView = j1Var.I;
            TextView textView2 = j1Var.H;
            g1 g1Var = j1Var.f51390e;
            y9 y9Var = j1Var.f51404y;
            TextView textView3 = j1Var.L;
            TextView textView4 = j1Var.M;
            int d = kVar.d();
            if (j1Var.f51395h0 != kVar) {
                a21 d12 = p7.d1(y9Var, y9Var.getImageReceiver(), d);
                j1Var.N = d12;
                d12.run();
                j1Var.N = null;
            }
            g1Var.d(null);
            g1Var.e(null);
            g1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            y9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            j1Var.f51399n.setVisibility(8);
            j1Var.F.setVisibility(8);
            if (kVar.f47392c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new o61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                er[] erVarArr = new er[1];
                textView4.setText(p7.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, erVarArr));
                erVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = j1Var.E;
            layoutParams.gravity = 49;
            y9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            j1Var.K.setBackground(h6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) t0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) t0Var.getLayoutParams()).gravity = 49;
            j1Var.f51395h0 = kVar;
            j1Var.f51396i0 = null;
            j1Var.V = kVar;
            j1Var.W = null;
            j1Var.f51386b0 = false;
            j1Var.f51388c0 = null;
            j1Var.f51389d0 = false;
            j1Var.f51391e0 = false;
            j1Var.f51393f0 = false;
            j1Var.O = null;
            j1Var.P = null;
            j1Var.c(false, false);
            j1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = r61Var.f30355e;
            Object obj2 = r61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            j1Var.g(starGift, z13, z11, r61Var.f30366q, r61Var.f30367r, r61Var.f30369t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = j1Var.h((TL_stars.SavedStarGift) obj, r61Var.f30366q, r61Var.f30367r);
        }
        if (r61Var.f30356f) {
            j1Var.b(r61Var.f30355e, z12);
        }
        j1Var.d(r61Var.h, z12);
        FrameLayout frameLayout = j1Var.d;
        float f10 = 1.0f;
        if (r61Var.f30357g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        k1 k1Var = j1Var.f51392f;
        if (!r61Var.f30357g) {
            f10 = 0.5f;
        }
        k1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new j1(context, i10, d6Var);
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.f30366q == r61Var2.f30366q) {
            Object obj = r61Var.G;
            if (obj != null || r61Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == r61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = r61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20259id == ((TL_stars.StarGift) obj2).f20259id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = r61Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f20259id == savedStarGift2.gift.f20259id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (r61Var.f30374z == r61Var2.f30374z && r61Var.f30355e == r61Var2.f30355e && r61Var.B == r61Var2.B && TextUtils.equals(r61Var.f30361l, r61Var2.f30361l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
