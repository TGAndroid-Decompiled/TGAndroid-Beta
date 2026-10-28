package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.dd;
import bi.fb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
import org.telegram.ui.Wallet.p5;
public final class f1 extends t61 {
    public static final int f53027a = 0;

    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        u61 K = u61.K(f1.class);
        K.f33258u = 1;
        K.f33262z = i10;
        K.G = starGift;
        K.e = z10;
        K.H = Boolean.valueOf(z11);
        K.f33255r = z13;
        K.f33254q = z12;
        K.f33257t = z14;
        return K;
    }

    @Override
    public final void attachedView(nm0 nm0Var, View view, u61 u61Var) {
        ((g1) view).e(u61Var.h, false);
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        boolean z11;
        float f7;
        int i10;
        g1 g1Var = (g1) view;
        Object obj = u61Var.G;
        boolean z12 = false;
        if (obj instanceof tg.k) {
            tg.k kVar = (tg.k) obj;
            p5 p5Var = g1Var.J;
            TextView textView = g1Var.I;
            TextView textView2 = g1Var.H;
            d1 d1Var = g1Var.e;
            y9 y9Var = g1Var.f53068y;
            TextView textView3 = g1Var.L;
            TextView textView4 = g1Var.M;
            int d = kVar.d();
            if (g1Var.f53052j0 != kVar) {
                fb b12 = dd.b1(y9Var, y9Var.getImageReceiver(), d);
                g1Var.N = b12;
                b12.run();
                g1Var.N = null;
            }
            d1Var.d(null);
            d1Var.e(null);
            d1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            y9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            g1Var.f53055n.setVisibility(8);
            g1Var.F.setVisibility(8);
            if (kVar.f48948c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (y6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                zq[] zqVarArr = new zq[1];
                textView4.setText(dd.W0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, zqVarArr));
                zqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = g1Var.E;
            layoutParams.gravity = 49;
            y9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            g1Var.f53063s0 = 0;
            g1Var.K.setBackground(y6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) p5Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) p5Var.getLayoutParams()).gravity = 49;
            g1Var.f53052j0 = kVar;
            g1Var.f53053k0 = null;
            g1Var.f53040a0 = kVar;
            g1Var.f53042b0 = null;
            g1Var.f53045d0 = false;
            g1Var.f53046e0 = null;
            g1Var.f53048f0 = false;
            g1Var.f53049g0 = false;
            g1Var.f53050h0 = false;
            g1Var.Q = null;
            g1Var.R = null;
            g1Var.d(false, false);
            g1Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = u61Var.e;
            Object obj2 = u61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            g1Var.h(starGift, z13, z11, u61Var.f33254q, u61Var.f33255r, u61Var.f33257t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = g1Var.i((TL_stars.SavedStarGift) obj, u61Var.f33254q, u61Var.f33255r);
        }
        if (u61Var.f33244f) {
            g1Var.c(u61Var.e, z12);
        }
        g1Var.e(u61Var.h, z12);
        FrameLayout frameLayout = g1Var.d;
        float f10 = 1.0f;
        if (u61Var.f33245g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        h1 h1Var = g1Var.f53047f;
        if (!u61Var.f33245g) {
            f10 = 0.5f;
        }
        h1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new g1(context, i10, u6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.f33254q == u61Var2.f33254q) {
            Object obj = u61Var.G;
            if (obj != null || u61Var2.G != null) {
                if (obj instanceof tg.k) {
                    if (obj == u61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = u61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f22257id == ((TL_stars.StarGift) obj2).f22257id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = u61Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f22257id == savedStarGift2.gift.f22257id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (u61Var.f33262z == u61Var2.f33262z && u61Var.e == u61Var2.e && u61Var.B == u61Var2.B && TextUtils.equals(u61Var.f33249l, u61Var2.f33249l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
