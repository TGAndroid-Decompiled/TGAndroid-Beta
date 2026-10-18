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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Wallet.p9;
public final class f1 extends e61 {
    public static final int f50230a = 0;

    static {
        e61.setup(new e61());
    }

    public static f61 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        f61 J = f61.J(f1.class);
        J.f26149u = 1;
        J.f26153z = i10;
        J.G = starGift;
        J.e = z10;
        J.H = Boolean.valueOf(z11);
        J.f26146r = z13;
        J.f26145q = z12;
        J.f26148t = z14;
        return J;
    }

    @Override
    public final void attachedView(im0 im0Var, View view, f61 f61Var) {
        ((g1) view).d(f61Var.h, false);
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        boolean z11;
        float f7;
        int i10;
        g1 g1Var = (g1) view;
        Object obj = f61Var.G;
        boolean z12 = false;
        if (obj instanceof sg.k) {
            sg.k kVar = (sg.k) obj;
            p9 p9Var = g1Var.J;
            TextView textView = g1Var.I;
            TextView textView2 = g1Var.H;
            d1 d1Var = g1Var.e;
            w9 w9Var = g1Var.f50270y;
            TextView textView3 = g1Var.L;
            TextView textView4 = g1Var.M;
            int d = kVar.d();
            if (g1Var.f50262j0 != kVar) {
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
            g1Var.f50265n.setVisibility(8);
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
                spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
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
            ((ViewGroup.MarginLayoutParams) p9Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) p9Var.getLayoutParams()).gravity = 49;
            g1Var.f50262j0 = kVar;
            g1Var.f50263k0 = null;
            g1Var.f50250a0 = kVar;
            g1Var.f50252b0 = null;
            g1Var.f50255d0 = false;
            g1Var.f50256e0 = null;
            g1Var.f50258f0 = false;
            g1Var.f50259g0 = false;
            g1Var.f50260h0 = false;
            g1Var.Q = null;
            g1Var.R = null;
            g1Var.c(false, false);
            g1Var.k();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = f61Var.e;
            Object obj2 = f61Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            g1Var.g(starGift, z13, z11, f61Var.f26145q, f61Var.f26146r, f61Var.f26148t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = g1Var.h((TL_stars.SavedStarGift) obj, f61Var.f26145q, f61Var.f26146r);
        }
        if (f61Var.f26135f) {
            g1Var.b(f61Var.e, z12);
        }
        g1Var.d(f61Var.h, z12);
        FrameLayout frameLayout = g1Var.d;
        float f10 = 1.0f;
        if (f61Var.f26136g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        h1 h1Var = g1Var.f50257f;
        if (!f61Var.f26136g) {
            f10 = 0.5f;
        }
        h1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new g1(context, i10, d6Var);
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        if (f61Var.f26145q == f61Var2.f26145q) {
            Object obj = f61Var.G;
            if (obj != null || f61Var2.G != null) {
                if (obj instanceof sg.k) {
                    if (obj == f61Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = f61Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20496id == ((TL_stars.StarGift) obj2).f20496id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = f61Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f20496id == savedStarGift2.gift.f20496id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (f61Var.f26153z == f61Var2.f26153z && f61Var.e == f61Var2.e && f61Var.B == f61Var2.B && TextUtils.equals(f61Var.f26140l, f61Var2.f26140l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
