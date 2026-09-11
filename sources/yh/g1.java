package yh;

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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import zh.v7;
public final class g1 extends g51 {
    public static final int f50289a = 0;

    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        h51 J = h51.J(g1.class);
        J.f26603u = 1;
        J.f26607z = i10;
        J.G = starGift;
        J.f26588e = z10;
        J.H = Boolean.valueOf(z11);
        J.f26600r = z13;
        J.f26599q = z12;
        J.f26602t = z14;
        return J;
    }

    @Override
    public final void attachedView(ll0 ll0Var, View view, h51 h51Var) {
        ((h1) view).d(h51Var.h, false);
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        float f7;
        int i10;
        h1 h1Var = (h1) view;
        Object obj = h51Var.G;
        boolean z12 = false;
        if (obj instanceof sg.k) {
            sg.k kVar = (sg.k) obj;
            sg.l1 l1Var = h1Var.J;
            TextView textView = h1Var.I;
            TextView textView2 = h1Var.H;
            e1 e1Var = h1Var.f50313e;
            x9 x9Var = h1Var.f50327y;
            TextView textView3 = h1Var.L;
            TextView textView4 = h1Var.M;
            int d = kVar.d();
            if (h1Var.f50318h0 != kVar) {
                s01 c12 = v7.c1(x9Var, x9Var.getImageReceiver(), d);
                h1Var.N = c12;
                c12.run();
                h1Var.N = null;
            }
            e1Var.d(null);
            e1Var.e(null);
            e1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            x9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            h1Var.f50322n.setVisibility(8);
            h1Var.F.setVisibility(8);
            if (kVar.f46126c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                nq[] nqVarArr = new nq[1];
                textView4.setText(v7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, nqVarArr));
                nqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = h1Var.E;
            layoutParams.gravity = 49;
            x9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            h1Var.K.setBackground(j6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) l1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) l1Var.getLayoutParams()).gravity = 49;
            h1Var.f50318h0 = kVar;
            h1Var.f50319i0 = null;
            h1Var.V = kVar;
            h1Var.W = null;
            h1Var.f50309b0 = false;
            h1Var.f50311c0 = null;
            h1Var.f50312d0 = false;
            h1Var.f50314e0 = false;
            h1Var.f50316f0 = false;
            h1Var.O = null;
            h1Var.P = null;
            h1Var.c(false, false);
            h1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = h51Var.f26588e;
            Object obj2 = h51Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            h1Var.g(starGift, z13, z11, h51Var.f26599q, h51Var.f26600r, h51Var.f26602t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = h1Var.h((TL_stars.SavedStarGift) obj, h51Var.f26599q, h51Var.f26600r);
        }
        if (h51Var.f26589f) {
            h1Var.b(h51Var.f26588e, z12);
        }
        h1Var.d(h51Var.h, z12);
        FrameLayout frameLayout = h1Var.d;
        float f10 = 1.0f;
        if (h51Var.f26590g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        i1 i1Var = h1Var.f50315f;
        if (!h51Var.f26590g) {
            f10 = 0.5f;
        }
        i1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new h1(context, i10, f6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.f26599q == h51Var2.f26599q) {
            Object obj = h51Var.G;
            if (obj != null || h51Var2.G != null) {
                if (obj instanceof sg.k) {
                    if (obj == h51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = h51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20097id == ((TL_stars.StarGift) obj2).f20097id) {
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
                        if (savedStarGift.gift.f20097id == savedStarGift2.gift.f20097id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (h51Var.f26607z == h51Var2.f26607z && h51Var.f26588e == h51Var2.f26588e && h51Var.B == h51Var2.B && TextUtils.equals(h51Var.f26594l, h51Var2.f26594l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
