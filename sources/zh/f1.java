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
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
import org.telegram.ui.Wallet.p5;
public final class f1 extends s61 {
    public static final int f52966a = 0;

    static {
        s61.setup(new s61());
    }

    public static t61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        t61 K = t61.K(f1.class);
        K.f32881u = 1;
        K.f32885z = i10;
        K.G = starGift;
        K.e = z10;
        K.H = Boolean.valueOf(z11);
        K.f32878r = z13;
        K.f32877q = z12;
        K.f32880t = z14;
        return K;
    }

    @Override
    public final void attachedView(mm0 mm0Var, View view, t61 t61Var) {
        ((g1) view).e(t61Var.h, false);
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        boolean z11;
        float f7;
        int i10;
        g1 g1Var = (g1) view;
        Object obj = t61Var.G;
        boolean z12 = false;
        if (obj instanceof tg.k) {
            tg.k kVar = (tg.k) obj;
            p5 p5Var = g1Var.J;
            TextView textView = g1Var.I;
            TextView textView2 = g1Var.H;
            d1 d1Var = g1Var.e;
            y9 y9Var = g1Var.f53007y;
            TextView textView3 = g1Var.L;
            TextView textView4 = g1Var.M;
            int d = kVar.d();
            if (g1Var.f52991j0 != kVar) {
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
            g1Var.f52994n.setVisibility(8);
            g1Var.F.setVisibility(8);
            if (kVar.f48910c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
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
            g1Var.f53002s0 = 0;
            g1Var.K.setBackground(y6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) p5Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) p5Var.getLayoutParams()).gravity = 49;
            g1Var.f52991j0 = kVar;
            g1Var.f52992k0 = null;
            g1Var.f52979a0 = kVar;
            g1Var.f52981b0 = null;
            g1Var.f52984d0 = false;
            g1Var.f52985e0 = null;
            g1Var.f52987f0 = false;
            g1Var.f52988g0 = false;
            g1Var.f52989h0 = false;
            g1Var.Q = null;
            g1Var.R = null;
            g1Var.d(false, false);
            g1Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = t61Var.e;
            Object obj2 = t61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            g1Var.h(starGift, z13, z11, t61Var.f32877q, t61Var.f32878r, t61Var.f32880t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = g1Var.i((TL_stars.SavedStarGift) obj, t61Var.f32877q, t61Var.f32878r);
        }
        if (t61Var.f32867f) {
            g1Var.c(t61Var.e, z12);
        }
        g1Var.e(t61Var.h, z12);
        FrameLayout frameLayout = g1Var.d;
        float f10 = 1.0f;
        if (t61Var.f32868g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        h1 h1Var = g1Var.f52986f;
        if (!t61Var.f32868g) {
            f10 = 0.5f;
        }
        h1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new g1(context, i10, u6Var);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.f32877q == t61Var2.f32877q) {
            Object obj = t61Var.G;
            if (obj != null || t61Var2.G != null) {
                if (obj instanceof tg.k) {
                    if (obj == t61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = t61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f22254id == ((TL_stars.StarGift) obj2).f22254id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = t61Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f22254id == savedStarGift2.gift.f22254id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (t61Var.f32885z == t61Var2.f32885z && t61Var.e == t61Var2.e && t61Var.B == t61Var2.B && TextUtils.equals(t61Var.f32872l, t61Var2.f32872l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
