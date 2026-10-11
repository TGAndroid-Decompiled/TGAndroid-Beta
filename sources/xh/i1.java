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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z11;
import yh.p7;
public final class i1 extends p61 {
    public static final int f51400a = 0;

    static {
        p61.setup(new p61());
    }

    public static q61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        q61 J = q61.J(i1.class);
        J.f30176u = 1;
        J.f30180z = i10;
        J.G = starGift;
        J.f30161e = z10;
        J.H = Boolean.valueOf(z11);
        J.f30173r = z13;
        J.f30172q = z12;
        J.f30175t = z14;
        return J;
    }

    @Override
    public final void attachedView(rm0 rm0Var, View view, q61 q61Var) {
        ((j1) view).d(q61Var.h, false);
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        boolean z11;
        float f7;
        int i10;
        j1 j1Var = (j1) view;
        Object obj = q61Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            rg.t0 t0Var = j1Var.J;
            TextView textView = j1Var.I;
            TextView textView2 = j1Var.H;
            g1 g1Var = j1Var.f51424e;
            y9 y9Var = j1Var.f51438y;
            TextView textView3 = j1Var.L;
            TextView textView4 = j1Var.M;
            int d = kVar.d();
            if (j1Var.f51429h0 != kVar) {
                z11 d12 = p7.d1(y9Var, y9Var.getImageReceiver(), d);
                j1Var.N = d12;
                d12.run();
                j1Var.N = null;
            }
            g1Var.d(null);
            g1Var.e(null);
            g1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            y9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            j1Var.f51433n.setVisibility(8);
            j1Var.F.setVisibility(8);
            if (kVar.f47426c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new n61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                er[] erVarArr = new er[1];
                textView4.setText(p7.Y0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, erVarArr));
                erVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = j1Var.E;
            layoutParams.gravity = 49;
            y9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            j1Var.K.setBackground(h6.c0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) t0Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) t0Var.getLayoutParams()).gravity = 49;
            j1Var.f51429h0 = kVar;
            j1Var.f51430i0 = null;
            j1Var.V = kVar;
            j1Var.W = null;
            j1Var.f51420b0 = false;
            j1Var.f51422c0 = null;
            j1Var.f51423d0 = false;
            j1Var.f51425e0 = false;
            j1Var.f51427f0 = false;
            j1Var.O = null;
            j1Var.P = null;
            j1Var.c(false, false);
            j1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = q61Var.f30161e;
            Object obj2 = q61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            j1Var.g(starGift, z13, z11, q61Var.f30172q, q61Var.f30173r, q61Var.f30175t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = j1Var.h((TL_stars.SavedStarGift) obj, q61Var.f30172q, q61Var.f30173r);
        }
        if (q61Var.f30162f) {
            j1Var.b(q61Var.f30161e, z12);
        }
        j1Var.d(q61Var.h, z12);
        FrameLayout frameLayout = j1Var.d;
        float f10 = 1.0f;
        if (q61Var.f30163g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        k1 k1Var = j1Var.f51426f;
        if (!q61Var.f30163g) {
            f10 = 0.5f;
        }
        k1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, d6 d6Var) {
        return new j1(context, i10, d6Var);
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.f30172q == q61Var2.f30172q) {
            Object obj = q61Var.G;
            if (obj != null || q61Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == q61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = q61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20295id == ((TL_stars.StarGift) obj2).f20295id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = q61Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f20295id == savedStarGift2.gift.f20295id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (q61Var.f30180z == q61Var2.f30180z && q61Var.f30161e == q61Var2.f30161e && q61Var.B == q61Var2.B && TextUtils.equals(q61Var.f30167l, q61Var2.f30167l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
