package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.y41;
import rh.h8;
public final class b1 extends a51 {
    public static final int f44991b = 0;

    static {
        a51.h(new a51());
    }

    public static b51 i(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        b51 K = b51.K(b1.class);
        K.f24652u = 1;
        K.f24656z = i10;
        K.G = starGift;
        K.e = z10;
        K.H = Boolean.valueOf(z11);
        K.f24649r = z13;
        K.f24648q = z12;
        K.f24651t = z14;
        return K;
    }

    @Override
    public final void a(uk0 uk0Var, View view, b51 b51Var) {
        ((c1) view).e(b51Var.h, false);
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        boolean z11;
        float f7;
        int i10;
        c1 c1Var = (c1) view;
        Object obj = b51Var.G;
        boolean z12 = false;
        if (obj instanceof kg.m) {
            kg.m mVar = (kg.m) obj;
            org.telegram.ui.Components.voip.j0 j0Var = c1Var.J;
            TextView textView = c1Var.I;
            TextView textView2 = c1Var.H;
            z0 z0Var = c1Var.e;
            g9 g9Var = c1Var.D;
            TextView textView3 = c1Var.L;
            TextView textView4 = c1Var.M;
            int d = mVar.d();
            if (c1Var.f45008j0 != mVar) {
                e01 f12 = h8.f1(g9Var, g9Var.getImageReceiver(), d);
                c1Var.N = f12;
                f12.run();
                c1Var.N = null;
            }
            z0Var.d(null);
            z0Var.e(null);
            z0Var.g(null);
            textView2.setText(dd.G(d, "Gift2Months", new Object[0]));
            textView.setText(dd.L0(2131744255, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            g9Var.setTranslationY(-org.telegram.messenger.i0.L(8.0f));
            c1Var.f45011n.setVisibility(8);
            c1Var.F.setVisibility(8);
            if (mVar.f11181c == null && mVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (t6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + dd.E(mVar.g(), ','));
                spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
                dq[] dqVarArr = new dq[1];
                textView4.setText(h8.a1(false, dd.V(null, null, 2131747043, spannableStringBuilder), 0.48f, dqVarArr));
                dqVarArr[0].G = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = c1Var.E;
            layoutParams.gravity = 49;
            g9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(mVar.c());
            c1Var.f45019s0 = 0;
            c1Var.K.setBackground(t6.d0(org.telegram.messenger.i0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) j0Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(130.0f);
            ((FrameLayout.LayoutParams) j0Var.getLayoutParams()).gravity = 49;
            c1Var.f45008j0 = mVar;
            c1Var.f45009k0 = null;
            c1Var.f44996a0 = mVar;
            c1Var.f44998b0 = null;
            c1Var.f45001d0 = false;
            c1Var.f45002e0 = null;
            c1Var.f45004f0 = false;
            c1Var.f45005g0 = false;
            c1Var.f45006h0 = false;
            c1Var.Q = null;
            c1Var.R = null;
            c1Var.d(false, false);
            c1Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = b51Var.e;
            Object obj2 = b51Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            c1Var.h(starGift, z13, z11, b51Var.f24648q, b51Var.f24649r, b51Var.f24651t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = c1Var.i((TL_stars.SavedStarGift) obj, b51Var.f24648q, b51Var.f24649r);
        }
        if (b51Var.f24638f) {
            c1Var.c(b51Var.e, z12);
        }
        c1Var.e(b51Var.h, z12);
        FrameLayout frameLayout = c1Var.d;
        float f10 = 1.0f;
        if (b51Var.f24639g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        d1 d1Var = c1Var.f45003f;
        if (!b51Var.f24639g) {
            f10 = 0.5f;
        }
        d1Var.setAlpha(f10);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new c1(i10, context, p6Var);
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.f24648q == b51Var2.f24648q) {
            Object obj = b51Var.G;
            if (obj != null || b51Var2.G != null) {
                if (obj instanceof kg.m) {
                    if (obj == b51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = b51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20022id == ((TL_stars.StarGift) obj2).f20022id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = b51Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f20022id == savedStarGift2.gift.f20022id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (b51Var.f24656z == b51Var2.f24656z && b51Var.e == b51Var2.e && b51Var.B == b51Var2.B && TextUtils.equals(b51Var.f24643l, b51Var2.f24643l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
