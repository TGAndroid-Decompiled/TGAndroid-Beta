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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xq;
public final class f1 extends l61 {
    public static final int f50684a = 0;

    static {
        l61.setup(new l61());
    }

    public static m61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        m61 J = m61.J(f1.class);
        J.f28568u = 1;
        J.f28572z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f28565r = z13;
        J.f28564q = z12;
        J.f28567t = z14;
        return J;
    }

    @Override
    public final void attachedView(mm0 mm0Var, View view, m61 m61Var) {
        ((g1) view).e(m61Var.h, false);
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        boolean z11;
        float f7;
        int i10;
        g1 g1Var = (g1) view;
        Object obj = m61Var.G;
        boolean z12 = false;
        if (obj instanceof sg.k) {
            sg.k kVar = (sg.k) obj;
            rg.y1 y1Var = g1Var.J;
            TextView textView = g1Var.I;
            TextView textView2 = g1Var.H;
            d1 d1Var = g1Var.e;
            w9 w9Var = g1Var.f50732y;
            TextView textView3 = g1Var.L;
            TextView textView4 = g1Var.M;
            int d = kVar.d();
            if (g1Var.f50716j0 != kVar) {
                gb d12 = nd.d1(w9Var, w9Var.getImageReceiver(), d);
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
            w9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            g1Var.f50719n.setVisibility(8);
            g1Var.F.setVisibility(8);
            if (kVar.f46735c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                xq[] xqVarArr = new xq[1];
                textView4.setText(nd.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, xqVarArr));
                xqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = g1Var.E;
            layoutParams.gravity = 49;
            w9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            g1Var.f50727s0 = 0;
            g1Var.K.setBackground(k6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) y1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) y1Var.getLayoutParams()).gravity = 49;
            g1Var.f50716j0 = kVar;
            g1Var.f50717k0 = null;
            g1Var.f50704a0 = kVar;
            g1Var.f50706b0 = null;
            g1Var.f50709d0 = false;
            g1Var.f50710e0 = null;
            g1Var.f50712f0 = false;
            g1Var.f50713g0 = false;
            g1Var.f50714h0 = false;
            g1Var.Q = null;
            g1Var.R = null;
            g1Var.d(false, false);
            g1Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = m61Var.e;
            Object obj2 = m61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            g1Var.h(starGift, z13, z11, m61Var.f28564q, m61Var.f28565r, m61Var.f28567t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = g1Var.i((TL_stars.SavedStarGift) obj, m61Var.f28564q, m61Var.f28565r);
        }
        if (m61Var.f28554f) {
            g1Var.c(m61Var.e, z12);
        }
        g1Var.e(m61Var.h, z12);
        FrameLayout frameLayout = g1Var.d;
        float f10 = 1.0f;
        if (m61Var.f28555g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        h1 h1Var = g1Var.f50711f;
        if (!m61Var.f28555g) {
            f10 = 0.5f;
        }
        h1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new g1(context, i10, g6Var);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.f28564q == m61Var2.f28564q) {
            Object obj = m61Var.G;
            if (obj != null || m61Var2.G != null) {
                if (obj instanceof sg.k) {
                    if (obj == m61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = m61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20567id == ((TL_stars.StarGift) obj2).f20567id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = m61Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f20567id == savedStarGift2.gift.f20567id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (m61Var.f28572z == m61Var2.f28572z && m61Var.e == m61Var2.e && m61Var.B == m61Var2.B && TextUtils.equals(m61Var.f28559l, m61Var2.f28559l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
