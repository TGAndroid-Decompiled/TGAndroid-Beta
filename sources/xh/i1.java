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
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
import yh.w7;
public final class i1 extends w51 {
    public static final int f46178a = 0;

    static {
        w51.setup(new w51());
    }

    public static x51 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        x51 J = x51.J(i1.class);
        J.f30301u = 1;
        J.f30305z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f30298r = z13;
        J.f30297q = z12;
        J.f30300t = z14;
        return J;
    }

    @Override
    public final void attachedView(yl0 yl0Var, View view, x51 x51Var) {
        ((j1) view).d(x51Var.h, false);
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        boolean z11;
        float f7;
        int i10;
        j1 j1Var = (j1) view;
        Object obj = x51Var.G;
        boolean z12 = false;
        if (obj instanceof rg.k) {
            rg.k kVar = (rg.k) obj;
            h1 h1Var = j1Var.J;
            TextView textView = j1Var.I;
            TextView textView2 = j1Var.H;
            f1 f1Var = j1Var.e;
            w9 w9Var = j1Var.f46223y;
            TextView textView3 = j1Var.L;
            TextView textView4 = j1Var.M;
            int d = kVar.d();
            if (j1Var.f46214h0 != kVar) {
                i11 c12 = w7.c1(w9Var, w9Var.getImageReceiver(), d);
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
            w9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            j1Var.f46218n.setVisibility(8);
            j1Var.F.setVisibility(8);
            if (kVar.f42622c == null && kVar.d == null) {
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
                spannableStringBuilder.setSpan(new u51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                qq[] qqVarArr = new qq[1];
                textView4.setText(w7.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, qqVarArr));
                qqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = j1Var.E;
            layoutParams.gravity = 49;
            w9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            j1Var.K.setBackground(h6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) h1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) h1Var.getLayoutParams()).gravity = 49;
            j1Var.f46214h0 = kVar;
            j1Var.f46215i0 = null;
            j1Var.V = kVar;
            j1Var.W = null;
            j1Var.f46206b0 = false;
            j1Var.f46208c0 = null;
            j1Var.f46209d0 = false;
            j1Var.f46210e0 = false;
            j1Var.f46212f0 = false;
            j1Var.O = null;
            j1Var.P = null;
            j1Var.c(false, false);
            j1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = x51Var.e;
            Object obj2 = x51Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            j1Var.g(starGift, z13, z11, x51Var.f30297q, x51Var.f30298r, x51Var.f30300t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = j1Var.h((TL_stars.SavedStarGift) obj, x51Var.f30297q, x51Var.f30298r);
        }
        if (x51Var.f30287f) {
            j1Var.b(x51Var.e, z12);
        }
        j1Var.d(x51Var.h, z12);
        FrameLayout frameLayout = j1Var.d;
        float f10 = 1.0f;
        if (x51Var.f30288g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        k1 k1Var = j1Var.f46211f;
        if (!x51Var.f30288g) {
            f10 = 0.5f;
        }
        k1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        return new j1(context, i10, d6Var);
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        if (x51Var.f30297q == x51Var2.f30297q) {
            Object obj = x51Var.G;
            if (obj != null || x51Var2.G != null) {
                if (obj instanceof rg.k) {
                    if (obj == x51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = x51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f18560id == ((TL_stars.StarGift) obj2).f18560id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = x51Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f18560id == savedStarGift2.gift.f18560id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (x51Var.f30305z == x51Var2.f30305z && x51Var.e == x51Var2.e && x51Var.B == x51Var2.B && TextUtils.equals(x51Var.f30292l, x51Var2.f30292l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
