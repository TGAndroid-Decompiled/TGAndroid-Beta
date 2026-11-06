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
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.wp;
public final class y0 extends q31 {
    public static final int f60470b = 0;

    static {
        q31.h(new q31());
    }

    public static r31 i(int i7, TL_stars.StarGift starGift, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        r31 K = r31.K(y0.class);
        K.f37607u = 1;
        K.f37611z = i7;
        K.G = starGift;
        K.f37592e = z9;
        K.H = Boolean.valueOf(z10);
        K.f37604r = z12;
        K.f37603q = z11;
        K.f37606t = z13;
        return K;
    }

    @Override
    public final void a(pj0 pj0Var, View view, r31 r31Var) {
        ((z0) view).e(r31Var.h, false);
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        boolean z10;
        float f10;
        int i7;
        z0 z0Var = (z0) view;
        Object obj = r31Var.G;
        boolean z11 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            p41 p41Var = z0Var.J;
            TextView textView = z0Var.I;
            TextView textView2 = z0Var.H;
            w0 w0Var = z0Var.f60486e;
            l9 l9Var = z0Var.D;
            TextView textView3 = z0Var.L;
            TextView textView4 = z0Var.M;
            int d = jVar.d();
            if (z0Var.f60493j0 != jVar) {
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
            z0Var.f60496n.setVisibility(8);
            z0Var.F.setVisibility(8);
            if (jVar.f56523c == null && jVar.d == null) {
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
                spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
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
            z0Var.f60504s0 = 0;
            z0Var.K.setBackground(k6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) p41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) p41Var.getLayoutParams()).gravity = 49;
            z0Var.f60493j0 = jVar;
            z0Var.f60494k0 = null;
            z0Var.f60480a0 = jVar;
            z0Var.f60482b0 = null;
            z0Var.f60485d0 = false;
            z0Var.f60487e0 = null;
            z0Var.f60489f0 = false;
            z0Var.f60490g0 = false;
            z0Var.f60491h0 = false;
            z0Var.Q = null;
            z0Var.R = null;
            z0Var.d(false, false);
            z0Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = r31Var.f37592e;
            Object obj2 = r31Var.H;
            if (obj2 instanceof Boolean) {
                z10 = ((Boolean) obj2).booleanValue();
            } else {
                z10 = false;
            }
            z0Var.h(starGift, z12, z10, r31Var.f37603q, r31Var.f37604r, r31Var.f37606t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = z0Var.i((TL_stars.SavedStarGift) obj, r31Var.f37603q, r31Var.f37604r);
        }
        if (r31Var.f37593f) {
            z0Var.c(r31Var.f37592e, z11);
        }
        z0Var.e(r31Var.h, z11);
        FrameLayout frameLayout = z0Var.d;
        float f11 = 1.0f;
        if (r31Var.f37594g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        a1 a1Var = z0Var.f60488f;
        if (!r31Var.f37594g) {
            f11 = 0.5f;
        }
        a1Var.setAlpha(f11);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new z0(i7, context, f6Var);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.f37603q == r31Var2.f37603q) {
            Object obj = r31Var.G;
            if (obj != null || r31Var2.G != null) {
                if (obj instanceof ug.j) {
                    if (obj == r31Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = r31Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f27181id == ((TL_stars.StarGift) obj2).f27181id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = r31Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f27181id == savedStarGift2.gift.f27181id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (r31Var.f37611z == r31Var2.f37611z && r31Var.f37592e == r31Var2.f37592e && r31Var.B == r31Var2.B && TextUtils.equals(r31Var.f37598l, r31Var2.f37598l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
