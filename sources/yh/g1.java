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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
import zh.p7;
public final class g1 extends k61 {
    public static final int f48875a = 0;

    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        l61 J = l61.J(g1.class);
        J.f26963u = 1;
        J.f26967z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f26960r = z13;
        J.f26959q = z12;
        J.f26962t = z14;
        return J;
    }

    @Override
    public final void attachedView(mm0 mm0Var, View view, l61 l61Var) {
        ((h1) view).d(l61Var.h, false);
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        boolean z11;
        float f7;
        int i10;
        h1 h1Var = (h1) view;
        Object obj = l61Var.G;
        boolean z12 = false;
        if (obj instanceof sg.k) {
            sg.k kVar = (sg.k) obj;
            sg.p0 p0Var = h1Var.J;
            TextView textView = h1Var.I;
            TextView textView2 = h1Var.H;
            e1 e1Var = h1Var.e;
            z9 z9Var = h1Var.f48912y;
            TextView textView3 = h1Var.L;
            TextView textView4 = h1Var.M;
            int d = kVar.d();
            if (h1Var.f48903h0 != kVar) {
                u11 d12 = p7.d1(z9Var, z9Var.getImageReceiver(), d);
                h1Var.N = d12;
                d12.run();
                h1Var.N = null;
            }
            e1Var.d(null);
            e1Var.e(null);
            e1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            z9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            h1Var.f48907n.setVisibility(8);
            h1Var.F.setVisibility(8);
            if (kVar.f45232c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (g6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new i61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                br[] brVarArr = new br[1];
                textView4.setText(p7.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, brVarArr));
                brVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = h1Var.E;
            layoutParams.gravity = 49;
            z9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            h1Var.K.setBackground(g6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) p0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) p0Var.getLayoutParams()).gravity = 49;
            h1Var.f48903h0 = kVar;
            h1Var.f48904i0 = null;
            h1Var.V = kVar;
            h1Var.W = null;
            h1Var.f48895b0 = false;
            h1Var.f48897c0 = null;
            h1Var.f48898d0 = false;
            h1Var.f48899e0 = false;
            h1Var.f48901f0 = false;
            h1Var.O = null;
            h1Var.P = null;
            h1Var.c(false, false);
            h1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = l61Var.e;
            Object obj2 = l61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            h1Var.g(starGift, z13, z11, l61Var.f26959q, l61Var.f26960r, l61Var.f26962t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = h1Var.h((TL_stars.SavedStarGift) obj, l61Var.f26959q, l61Var.f26960r);
        }
        if (l61Var.f26949f) {
            h1Var.b(l61Var.e, z12);
        }
        h1Var.d(l61Var.h, z12);
        FrameLayout frameLayout = h1Var.d;
        float f10 = 1.0f;
        if (l61Var.f26950g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        i1 i1Var = h1Var.f48900f;
        if (!l61Var.f26950g) {
            f10 = 0.5f;
        }
        i1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new h1(context, i10, c6Var);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.f26959q == l61Var2.f26959q) {
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
                        if (((TL_stars.StarGift) obj).f19441id == ((TL_stars.StarGift) obj2).f19441id) {
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
                        if (savedStarGift.gift.f19441id == savedStarGift2.gift.f19441id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (l61Var.f26967z == l61Var2.f26967z && l61Var.e == l61Var2.e && l61Var.B == l61Var2.B && TextUtils.equals(l61Var.f26954l, l61Var2.f26954l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
