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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.y9;
import yh.p7;
public final class h1 extends t61 {
    public static final int f51494a = 0;

    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        u61 J = u61.J(h1.class);
        J.f31085u = 1;
        J.f31089z = i10;
        J.G = starGift;
        J.f31070e = z10;
        J.H = Boolean.valueOf(z11);
        J.f31082r = z13;
        J.f31081q = z12;
        J.f31084t = z14;
        return J;
    }

    @Override
    public final void attachedView(wm0 wm0Var, View view, u61 u61Var) {
        ((i1) view).d(u61Var.h, false);
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        boolean z11;
        float f7;
        int i10;
        i1 i1Var = (i1) view;
        Object obj = u61Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            rg.p0 p0Var = i1Var.J;
            TextView textView = i1Var.I;
            TextView textView2 = i1Var.H;
            f1 f1Var = i1Var.f51516e;
            y9 y9Var = i1Var.f51530y;
            TextView textView3 = i1Var.L;
            TextView textView4 = i1Var.M;
            int d = kVar.d();
            if (i1Var.f51521h0 != kVar) {
                e21 d12 = p7.d1(y9Var, y9Var.getImageReceiver(), d);
                i1Var.N = d12;
                d12.run();
                i1Var.N = null;
            }
            f1Var.d(null);
            f1Var.e(null);
            f1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            y9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            i1Var.f51525n.setVisibility(8);
            i1Var.F.setVisibility(8);
            if (kVar.f47516c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                gr[] grVarArr = new gr[1];
                textView4.setText(p7.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, grVarArr));
                grVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i1Var.E;
            layoutParams.gravity = 49;
            y9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            i1Var.K.setBackground(h6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) p0Var.getLayoutParams()).gravity = 49;
            i1Var.f51521h0 = kVar;
            i1Var.f51522i0 = null;
            i1Var.V = kVar;
            i1Var.W = null;
            i1Var.f51512b0 = false;
            i1Var.f51514c0 = null;
            i1Var.f51515d0 = false;
            i1Var.f51517e0 = false;
            i1Var.f51519f0 = false;
            i1Var.O = null;
            i1Var.P = null;
            i1Var.c(false, false);
            i1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = u61Var.f31070e;
            Object obj2 = u61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            i1Var.g(starGift, z13, z11, u61Var.f31081q, u61Var.f31082r, u61Var.f31084t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = i1Var.h((TL_stars.SavedStarGift) obj, u61Var.f31081q, u61Var.f31082r);
        }
        if (u61Var.f31071f) {
            i1Var.b(u61Var.f31070e, z12);
        }
        i1Var.d(u61Var.h, z12);
        FrameLayout frameLayout = i1Var.d;
        float f10 = 1.0f;
        if (u61Var.f31072g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        j1 j1Var = i1Var.f51518f;
        if (!u61Var.f31072g) {
            f10 = 0.5f;
        }
        j1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new i1(context, i10, c6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.f31081q == u61Var2.f31081q) {
            Object obj = u61Var.G;
            if (obj != null || u61Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == u61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = u61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20031id == ((TL_stars.StarGift) obj2).f20031id) {
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
                        if (savedStarGift.gift.f20031id == savedStarGift2.gift.f20031id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (u61Var.f31089z == u61Var2.f31089z && u61Var.f31070e == u61Var2.f31070e && u61Var.B == u61Var2.B && TextUtils.equals(u61Var.f31076l, u61Var2.f31076l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
