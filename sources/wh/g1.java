package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.ld;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import xh.z7;
public final class g1 extends u51 {
    public static final int f44098a = 0;

    static {
        u51.setup(new u51());
    }

    public static v51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        v51 J = v51.J(g1.class);
        J.f27838u = 1;
        J.f27842z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f27835r = z13;
        J.f27834q = z12;
        J.f27837t = z14;
        return J;
    }

    @Override
    public final void attachedView(vl0 vl0Var, View view, v51 v51Var) {
        ((h1) view).d(v51Var.h, false);
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        float f7;
        int i10;
        h1 h1Var = (h1) view;
        Object obj = v51Var.G;
        boolean z12 = false;
        if (obj instanceof qg.k) {
            qg.k kVar = (qg.k) obj;
            ld ldVar = h1Var.J;
            TextView textView = h1Var.I;
            TextView textView2 = h1Var.H;
            e1 e1Var = h1Var.e;
            w9 w9Var = h1Var.f44134y;
            TextView textView3 = h1Var.L;
            TextView textView4 = h1Var.M;
            int d = kVar.d();
            if (h1Var.f44125h0 != kVar) {
                g11 c12 = z7.c1(w9Var, w9Var.getImageReceiver(), d);
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
            w9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            h1Var.f44129n.setVisibility(8);
            h1Var.F.setVisibility(8);
            if (kVar.f40761c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                uq[] uqVarArr = new uq[1];
                textView4.setText(z7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, uqVarArr));
                uqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = h1Var.E;
            layoutParams.gravity = 49;
            w9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            h1Var.K.setBackground(j6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) ldVar.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) ldVar.getLayoutParams()).gravity = 49;
            h1Var.f44125h0 = kVar;
            h1Var.f44126i0 = null;
            h1Var.V = kVar;
            h1Var.W = null;
            h1Var.f44117b0 = false;
            h1Var.f44119c0 = null;
            h1Var.f44120d0 = false;
            h1Var.f44121e0 = false;
            h1Var.f44123f0 = false;
            h1Var.O = null;
            h1Var.P = null;
            h1Var.c(false, false);
            h1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = v51Var.e;
            Object obj2 = v51Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            h1Var.g(starGift, z13, z11, v51Var.f27834q, v51Var.f27835r, v51Var.f27837t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = h1Var.h((TL_stars.SavedStarGift) obj, v51Var.f27834q, v51Var.f27835r);
        }
        if (v51Var.f27824f) {
            h1Var.b(v51Var.e, z12);
        }
        h1Var.d(v51Var.h, z12);
        FrameLayout frameLayout = h1Var.d;
        float f10 = 1.0f;
        if (v51Var.f27825g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        i1 i1Var = h1Var.f44122f;
        if (!v51Var.f27825g) {
            f10 = 0.5f;
        }
        i1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new h1(context, i10, f6Var);
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.f27834q == v51Var2.f27834q) {
            Object obj = v51Var.G;
            if (obj != null || v51Var2.G != null) {
                if (obj instanceof qg.k) {
                    if (obj == v51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = v51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f17425id == ((TL_stars.StarGift) obj2).f17425id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = v51Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f17425id == savedStarGift2.gift.f17425id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (v51Var.f27842z == v51Var2.f27842z && v51Var.e == v51Var2.e && v51Var.B == v51Var2.B && TextUtils.equals(v51Var.f27829l, v51Var2.f27829l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
