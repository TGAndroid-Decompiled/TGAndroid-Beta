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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
import yh.x7;
public final class h1 extends f61 {
    public static final int f49969a = 0;

    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        g61 J = g61.J(h1.class);
        J.f26678u = 1;
        J.f26682z = i10;
        J.G = starGift;
        J.f26663e = z10;
        J.H = Boolean.valueOf(z11);
        J.f26675r = z13;
        J.f26674q = z12;
        J.f26677t = z14;
        return J;
    }

    @Override
    public final void attachedView(zl0 zl0Var, View view, g61 g61Var) {
        ((i1) view).d(g61Var.h, false);
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        float f7;
        int i10;
        i1 i1Var = (i1) view;
        Object obj = g61Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            rg.j1 j1Var = i1Var.J;
            TextView textView = i1Var.I;
            TextView textView2 = i1Var.H;
            f1 f1Var = i1Var.f49992e;
            w9 w9Var = i1Var.f50006y;
            TextView textView3 = i1Var.L;
            TextView textView4 = i1Var.M;
            int d = kVar.d();
            if (i1Var.f49997h0 != kVar) {
                r11 i12 = x7.i1(w9Var, w9Var.getImageReceiver(), d);
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
            i1Var.f50001n.setVisibility(8);
            i1Var.F.setVisibility(8);
            if (kVar.f46140c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new d61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                rq[] rqVarArr = new rq[1];
                textView4.setText(x7.d1(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, rqVarArr));
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
            i1Var.f49997h0 = kVar;
            i1Var.f49998i0 = null;
            i1Var.V = kVar;
            i1Var.W = null;
            i1Var.f49988b0 = false;
            i1Var.f49990c0 = null;
            i1Var.f49991d0 = false;
            i1Var.f49993e0 = false;
            i1Var.f49995f0 = false;
            i1Var.O = null;
            i1Var.P = null;
            i1Var.c(false, false);
            i1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = g61Var.f26663e;
            Object obj2 = g61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            i1Var.g(starGift, z13, z11, g61Var.f26674q, g61Var.f26675r, g61Var.f26677t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = i1Var.h((TL_stars.SavedStarGift) obj, g61Var.f26674q, g61Var.f26675r);
        }
        if (g61Var.f26664f) {
            i1Var.b(g61Var.f26663e, z12);
        }
        i1Var.d(g61Var.h, z12);
        FrameLayout frameLayout = i1Var.d;
        float f10 = 1.0f;
        if (g61Var.f26665g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        j1 j1Var2 = i1Var.f49994f;
        if (!g61Var.f26665g) {
            f10 = 0.5f;
        }
        j1Var2.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new i1(context, i10, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.f26674q == g61Var2.f26674q) {
            Object obj = g61Var.G;
            if (obj != null || g61Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == g61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = g61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20265id == ((TL_stars.StarGift) obj2).f20265id) {
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
                        if (savedStarGift.gift.f20265id == savedStarGift2.gift.f20265id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (g61Var.f26682z == g61Var2.f26682z && g61Var.f26663e == g61Var2.f26663e && g61Var.B == g61Var2.B && TextUtils.equals(g61Var.f26669l, g61Var2.f26669l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
