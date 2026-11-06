package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.dd;
import bi.pb;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
public final class y0 extends w31 {
    public static final int f60494b = 0;

    static {
        w31.h(new w31());
    }

    public static x31 i(int i7, TL_stars.StarGift starGift, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        x31 K = x31.K(y0.class);
        K.f40168u = 1;
        K.f40172z = i7;
        K.G = starGift;
        K.f40153e = z9;
        K.H = Boolean.valueOf(z10);
        K.f40165r = z12;
        K.f40164q = z11;
        K.f40167t = z13;
        return K;
    }

    @Override
    public final void a(pj0 pj0Var, View view, x31 x31Var) {
        ((z0) view).e(x31Var.h, false);
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        boolean z10;
        float f10;
        int i7;
        z0 z0Var = (z0) view;
        Object obj = x31Var.G;
        boolean z11 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            v41 v41Var = z0Var.J;
            TextView textView = z0Var.I;
            TextView textView2 = z0Var.H;
            w0 w0Var = z0Var.f60510e;
            l9 l9Var = z0Var.D;
            TextView textView3 = z0Var.L;
            TextView textView4 = z0Var.M;
            int d = jVar.d();
            if (z0Var.f60517j0 != jVar) {
                pb f12 = dd.f1(l9Var, l9Var.getImageReceiver(), d);
                z0Var.N = f12;
                f12.run();
                z0Var.N = null;
            }
            w0Var.d(null);
            w0Var.e(null);
            w0Var.g(null);
            textView2.setText(hd.G(d, "Gift2Months", new Object[0]));
            textView.setText(hd.M0(2131744231, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            l9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            z0Var.f60520n.setVisibility(8);
            z0Var.F.setVisibility(8);
            if (jVar.f56547c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (k6.I.q()) {
                    i7 = -1333971;
                } else {
                    i7 = -2722014;
                }
                textView4.setTextColor(i7);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + hd.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                wp[] wpVarArr = new wp[1];
                textView4.setText(dd.a1(false, hd.V(null, null, 2131747027, spannableStringBuilder), 0.48f, wpVarArr));
                wpVarArr[0].G = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = z0Var.E;
            layoutParams.gravity = 49;
            l9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            z0Var.f60528s0 = 0;
            z0Var.K.setBackground(k6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) v41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) v41Var.getLayoutParams()).gravity = 49;
            z0Var.f60517j0 = jVar;
            z0Var.f60518k0 = null;
            z0Var.f60504a0 = jVar;
            z0Var.f60506b0 = null;
            z0Var.f60509d0 = false;
            z0Var.f60511e0 = null;
            z0Var.f60513f0 = false;
            z0Var.f60514g0 = false;
            z0Var.f60515h0 = false;
            z0Var.Q = null;
            z0Var.R = null;
            z0Var.d(false, false);
            z0Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = x31Var.f40153e;
            Object obj2 = x31Var.H;
            if (obj2 instanceof Boolean) {
                z10 = ((Boolean) obj2).booleanValue();
            } else {
                z10 = false;
            }
            z0Var.h(starGift, z12, z10, x31Var.f40164q, x31Var.f40165r, x31Var.f40167t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = z0Var.i((TL_stars.SavedStarGift) obj, x31Var.f40164q, x31Var.f40165r);
        }
        if (x31Var.f40154f) {
            z0Var.c(x31Var.f40153e, z11);
        }
        z0Var.e(x31Var.h, z11);
        FrameLayout frameLayout = z0Var.d;
        float f11 = 1.0f;
        if (x31Var.f40155g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        a1 a1Var = z0Var.f60512f;
        if (!x31Var.f40155g) {
            f11 = 0.5f;
        }
        a1Var.setAlpha(f11);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new z0(i7, context, f6Var);
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.f40164q == x31Var2.f40164q) {
            Object obj = x31Var.G;
            if (obj != null || x31Var2.G != null) {
                if (obj instanceof ug.j) {
                    if (obj == x31Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = x31Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f27182id == ((TL_stars.StarGift) obj2).f27182id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = x31Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f27182id == savedStarGift2.gift.f27182id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (x31Var.f40172z == x31Var2.f40172z && x31Var.f40153e == x31Var2.f40153e && x31Var.B == x31Var2.B && TextUtils.equals(x31Var.f40159l, x31Var2.f40159l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
