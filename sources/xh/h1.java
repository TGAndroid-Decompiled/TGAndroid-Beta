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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.s11;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
import yh.z7;
public final class h1 extends g61 {
    public static final int f49984a = 0;

    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        h61 K = h61.K(h1.class);
        K.f27102u = 1;
        K.f27106z = i10;
        K.G = starGift;
        K.f27087e = z10;
        K.H = Boolean.valueOf(z11);
        K.f27099r = z13;
        K.f27098q = z12;
        K.f27101t = z14;
        return K;
    }

    @Override
    public final void attachedView(zl0 zl0Var, View view, h61 h61Var) {
        ((i1) view).d(h61Var.h, false);
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        boolean z11;
        float f7;
        int i10;
        i1 i1Var = (i1) view;
        Object obj = h61Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            rg.j1 j1Var = i1Var.J;
            TextView textView = i1Var.I;
            TextView textView2 = i1Var.H;
            f1 f1Var = i1Var.f50007e;
            w9 w9Var = i1Var.f50021y;
            TextView textView3 = i1Var.L;
            TextView textView4 = i1Var.M;
            int d = kVar.d();
            if (i1Var.f50012h0 != kVar) {
                s11 i12 = z7.i1(w9Var, w9Var.getImageReceiver(), d);
                i1Var.N = i12;
                i12.run();
                i1Var.N = null;
            }
            f1Var.d(null);
            f1Var.e(null);
            f1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            w9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            i1Var.f50016n.setVisibility(8);
            i1Var.F.setVisibility(8);
            if (kVar.f46154c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (i6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new e61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                rq[] rqVarArr = new rq[1];
                textView4.setText(z7.d1(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, rqVarArr));
                rqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i1Var.E;
            layoutParams.gravity = 49;
            w9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            i1Var.K.setBackground(i6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) j1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) j1Var.getLayoutParams()).gravity = 49;
            i1Var.f50012h0 = kVar;
            i1Var.f50013i0 = null;
            i1Var.V = kVar;
            i1Var.W = null;
            i1Var.f50003b0 = false;
            i1Var.f50005c0 = null;
            i1Var.f50006d0 = false;
            i1Var.f50008e0 = false;
            i1Var.f50010f0 = false;
            i1Var.O = null;
            i1Var.P = null;
            i1Var.c(false, false);
            i1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = h61Var.f27087e;
            Object obj2 = h61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            i1Var.g(starGift, z13, z11, h61Var.f27098q, h61Var.f27099r, h61Var.f27101t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = i1Var.h((TL_stars.SavedStarGift) obj, h61Var.f27098q, h61Var.f27099r);
        }
        if (h61Var.f27088f) {
            i1Var.b(h61Var.f27087e, z12);
        }
        i1Var.d(h61Var.h, z12);
        FrameLayout frameLayout = i1Var.d;
        float f10 = 1.0f;
        if (h61Var.f27089g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        j1 j1Var2 = i1Var.f50009f;
        if (!h61Var.f27089g) {
            f10 = 0.5f;
        }
        j1Var2.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new i1(context, i10, d6Var);
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.f27098q == h61Var2.f27098q) {
            Object obj = h61Var.G;
            if (obj != null || h61Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == h61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = h61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20274id == ((TL_stars.StarGift) obj2).f20274id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = h61Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f20274id == savedStarGift2.gift.f20274id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (h61Var.f27106z == h61Var2.f27106z && h61Var.f27087e == h61Var2.f27087e && h61Var.B == h61Var2.B && TextUtils.equals(h61Var.f27093l, h61Var2.f27093l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
