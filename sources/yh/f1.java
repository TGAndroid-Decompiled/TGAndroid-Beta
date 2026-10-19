package yh;

import ai.fb;
import ai.md;
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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
public final class f1 extends f61 {
    public static final int f50229a = 0;

    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        g61 J = g61.J(f1.class);
        J.f26508u = 1;
        J.f26512z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f26505r = z13;
        J.f26504q = z12;
        J.f26507t = z14;
        return J;
    }

    @Override
    public final void attachedView(im0 im0Var, View view, g61 g61Var) {
        ((g1) view).d(g61Var.h, false);
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        boolean z11;
        float f7;
        int i10;
        g1 g1Var = (g1) view;
        Object obj = g61Var.G;
        boolean z12 = false;
        if (obj instanceof sg.k) {
            sg.k kVar = (sg.k) obj;
            rg.x1 x1Var = g1Var.J;
            TextView textView = g1Var.I;
            TextView textView2 = g1Var.H;
            d1 d1Var = g1Var.e;
            w9 w9Var = g1Var.f50269y;
            TextView textView3 = g1Var.L;
            TextView textView4 = g1Var.M;
            int d = kVar.d();
            if (g1Var.f50261j0 != kVar) {
                fb d12 = md.d1(w9Var, w9Var.getImageReceiver(), d);
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
            g1Var.f50264n.setVisibility(8);
            g1Var.F.setVisibility(8);
            if (kVar.f46276c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new d61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                yq[] yqVarArr = new yq[1];
                textView4.setText(md.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, yqVarArr));
                yqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = g1Var.E;
            layoutParams.gravity = 49;
            w9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            g1Var.K.setBackground(h6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) x1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) x1Var.getLayoutParams()).gravity = 49;
            g1Var.f50261j0 = kVar;
            g1Var.f50262k0 = null;
            g1Var.f50249a0 = kVar;
            g1Var.f50251b0 = null;
            g1Var.f50254d0 = false;
            g1Var.f50255e0 = null;
            g1Var.f50257f0 = false;
            g1Var.f50258g0 = false;
            g1Var.f50259h0 = false;
            g1Var.Q = null;
            g1Var.R = null;
            g1Var.c(false, false);
            g1Var.k();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = g61Var.e;
            Object obj2 = g61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            g1Var.g(starGift, z13, z11, g61Var.f26504q, g61Var.f26505r, g61Var.f26507t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = g1Var.h((TL_stars.SavedStarGift) obj, g61Var.f26504q, g61Var.f26505r);
        }
        if (g61Var.f26494f) {
            g1Var.b(g61Var.e, z12);
        }
        g1Var.d(g61Var.h, z12);
        FrameLayout frameLayout = g1Var.d;
        float f10 = 1.0f;
        if (g61Var.f26495g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        h1 h1Var = g1Var.f50256f;
        if (!g61Var.f26495g) {
            f10 = 0.5f;
        }
        h1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new g1(context, i10, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.f26504q == g61Var2.f26504q) {
            Object obj = g61Var.G;
            if (obj != null || g61Var2.G != null) {
                if (obj instanceof sg.k) {
                    if (obj == g61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = g61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20499id == ((TL_stars.StarGift) obj2).f20499id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = g61Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f20499id == savedStarGift2.gift.f20499id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (g61Var.f26512z == g61Var2.f26512z && g61Var.e == g61Var2.e && g61Var.B == g61Var2.B && TextUtils.equals(g61Var.f26499l, g61Var2.f26499l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
