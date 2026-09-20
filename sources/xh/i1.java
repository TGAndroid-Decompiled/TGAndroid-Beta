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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import yh.w7;
public final class i1 extends v51 {
    public static final int f46198a = 0;

    static {
        v51.setup(new v51());
    }

    public static w51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        w51 J = w51.J(i1.class);
        J.f29957u = 1;
        J.f29961z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f29954r = z13;
        J.f29953q = z12;
        J.f29956t = z14;
        return J;
    }

    @Override
    public final void attachedView(vl0 vl0Var, View view, w51 w51Var) {
        ((j1) view).d(w51Var.h, false);
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        boolean z11;
        float f7;
        int i10;
        j1 j1Var = (j1) view;
        Object obj = w51Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            h1 h1Var = j1Var.J;
            TextView textView = j1Var.I;
            TextView textView2 = j1Var.H;
            f1 f1Var = j1Var.e;
            v9 v9Var = j1Var.f46243y;
            TextView textView3 = j1Var.L;
            TextView textView4 = j1Var.M;
            int d = kVar.d();
            if (j1Var.f46234h0 != kVar) {
                h11 c12 = w7.c1(v9Var, v9Var.getImageReceiver(), d);
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
            v9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            j1Var.f46238n.setVisibility(8);
            j1Var.F.setVisibility(8);
            if (kVar.f42636c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new t51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                oq[] oqVarArr = new oq[1];
                textView4.setText(w7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, oqVarArr));
                oqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = j1Var.E;
            layoutParams.gravity = 49;
            v9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            j1Var.K.setBackground(j6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) h1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) h1Var.getLayoutParams()).gravity = 49;
            j1Var.f46234h0 = kVar;
            j1Var.f46235i0 = null;
            j1Var.V = kVar;
            j1Var.W = null;
            j1Var.f46226b0 = false;
            j1Var.f46228c0 = null;
            j1Var.f46229d0 = false;
            j1Var.f46230e0 = false;
            j1Var.f46232f0 = false;
            j1Var.O = null;
            j1Var.P = null;
            j1Var.c(false, false);
            j1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = w51Var.e;
            Object obj2 = w51Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            j1Var.g(starGift, z13, z11, w51Var.f29953q, w51Var.f29954r, w51Var.f29956t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = j1Var.h((TL_stars.SavedStarGift) obj, w51Var.f29953q, w51Var.f29954r);
        }
        if (w51Var.f29943f) {
            j1Var.b(w51Var.e, z12);
        }
        j1Var.d(w51Var.h, z12);
        FrameLayout frameLayout = j1Var.d;
        float f10 = 1.0f;
        if (w51Var.f29944g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        k1 k1Var = j1Var.f46231f;
        if (!w51Var.f29944g) {
            f10 = 0.5f;
        }
        k1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new j1(context, i10, f6Var);
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.f29953q == w51Var2.f29953q) {
            Object obj = w51Var.G;
            if (obj != null || w51Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == w51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = w51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f18553id == ((TL_stars.StarGift) obj2).f18553id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = w51Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f18553id == savedStarGift2.gift.f18553id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (w51Var.f29961z == w51Var2.f29961z && w51Var.e == w51Var2.e && w51Var.B == w51Var2.B && TextUtils.equals(w51Var.f29948l, w51Var2.f29948l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
