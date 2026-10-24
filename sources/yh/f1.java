package yh;

import ai.gb;
import ai.nd;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vq;
public final class f1 extends k61 {
    public static final int f50683a = 0;

    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        l61 J = l61.J(f1.class);
        J.f28236u = 1;
        J.f28240z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f28233r = z13;
        J.f28232q = z12;
        J.f28235t = z14;
        return J;
    }

    @Override
    public final void attachedView(lm0 lm0Var, View view, l61 l61Var) {
        ((g1) view).e(l61Var.h, false);
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        float f7;
        int i10;
        g1 g1Var = (g1) view;
        Object obj = l61Var.G;
        boolean z12 = false;
        if (obj instanceof sg.k) {
            sg.k kVar = (sg.k) obj;
            rg.y1 y1Var = g1Var.J;
            TextView textView = g1Var.I;
            TextView textView2 = g1Var.H;
            d1 d1Var = g1Var.e;
            u9 u9Var = g1Var.f50731y;
            TextView textView3 = g1Var.L;
            TextView textView4 = g1Var.M;
            int d = kVar.d();
            if (g1Var.f50715j0 != kVar) {
                gb d12 = nd.d1(u9Var, u9Var.getImageReceiver(), d);
                g1Var.N = d12;
                d12.run();
                g1Var.N = null;
            }
            d1Var.d(null);
            d1Var.e(null);
            d1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            u9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            g1Var.f50718n.setVisibility(8);
            g1Var.F.setVisibility(8);
            if (kVar.f46734c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (k6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new i61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                vq[] vqVarArr = new vq[1];
                textView4.setText(nd.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, vqVarArr));
                vqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = g1Var.E;
            layoutParams.gravity = 49;
            u9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            g1Var.f50726s0 = 0;
            g1Var.K.setBackground(k6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) y1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) y1Var.getLayoutParams()).gravity = 49;
            g1Var.f50715j0 = kVar;
            g1Var.f50716k0 = null;
            g1Var.f50703a0 = kVar;
            g1Var.f50705b0 = null;
            g1Var.f50708d0 = false;
            g1Var.f50709e0 = null;
            g1Var.f50711f0 = false;
            g1Var.f50712g0 = false;
            g1Var.f50713h0 = false;
            g1Var.Q = null;
            g1Var.R = null;
            g1Var.d(false, false);
            g1Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = l61Var.e;
            Object obj2 = l61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            g1Var.h(starGift, z13, z11, l61Var.f28232q, l61Var.f28233r, l61Var.f28235t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = g1Var.i((TL_stars.SavedStarGift) obj, l61Var.f28232q, l61Var.f28233r);
        }
        if (l61Var.f28222f) {
            g1Var.c(l61Var.e, z12);
        }
        g1Var.e(l61Var.h, z12);
        FrameLayout frameLayout = g1Var.d;
        float f10 = 1.0f;
        if (l61Var.f28223g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        h1 h1Var = g1Var.f50710f;
        if (!l61Var.f28223g) {
            f10 = 0.5f;
        }
        h1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new g1(context, i10, g6Var);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.f28232q == l61Var2.f28232q) {
            Object obj = l61Var.G;
            if (obj != null || l61Var2.G != null) {
                if (obj instanceof sg.k) {
                    if (obj == l61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = l61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20568id == ((TL_stars.StarGift) obj2).f20568id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = l61Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f20568id == savedStarGift2.gift.f20568id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (l61Var.f28240z == l61Var2.f28240z && l61Var.e == l61Var2.e && l61Var.B == l61Var2.B && TextUtils.equals(l61Var.f28227l, l61Var2.f28227l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
