package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.z41;
import rh.h8;
public final class b1 extends z41 {
    public static final int f44980b = 0;

    static {
        z41.h(new z41());
    }

    public static a51 i(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        a51 K = a51.K(b1.class);
        K.f24301u = 1;
        K.f24305z = i10;
        K.G = starGift;
        K.e = z10;
        K.H = Boolean.valueOf(z11);
        K.f24298r = z13;
        K.f24297q = z12;
        K.f24300t = z14;
        return K;
    }

    @Override
    public final void a(tk0 tk0Var, View view, a51 a51Var) {
        ((c1) view).e(a51Var.h, false);
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        boolean z11;
        float f7;
        int i10;
        c1 c1Var = (c1) view;
        Object obj = a51Var.G;
        boolean z12 = false;
        if (obj instanceof kg.m) {
            kg.m mVar = (kg.m) obj;
            org.telegram.ui.Components.voip.i0 i0Var = c1Var.J;
            TextView textView = c1Var.I;
            TextView textView2 = c1Var.H;
            z0 z0Var = c1Var.e;
            g9 g9Var = c1Var.D;
            TextView textView3 = c1Var.L;
            TextView textView4 = c1Var.M;
            int d = mVar.d();
            if (c1Var.f44997j0 != mVar) {
                d01 e12 = h8.e1(g9Var, g9Var.getImageReceiver(), d);
                c1Var.N = e12;
                e12.run();
                c1Var.N = null;
            }
            z0Var.d(null);
            z0Var.e(null);
            z0Var.g(null);
            textView2.setText(cd.G(d, "Gift2Months", new Object[0]));
            textView.setText(cd.L0(2131744255, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            g9Var.setTranslationY(-org.telegram.messenger.i0.L(8.0f));
            c1Var.f45000n.setVisibility(8);
            c1Var.F.setVisibility(8);
            if (mVar.f11180c == null && mVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (t6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + cd.E(mVar.g(), ','));
                spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
                dq[] dqVarArr = new dq[1];
                textView4.setText(h8.Z0(false, cd.V(null, null, 2131747043, spannableStringBuilder), 0.48f, dqVarArr));
                dqVarArr[0].G = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = c1Var.E;
            layoutParams.gravity = 49;
            g9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(mVar.c());
            c1Var.f45008s0 = 0;
            c1Var.K.setBackground(t6.d0(org.telegram.messenger.i0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) i0Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(130.0f);
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).gravity = 49;
            c1Var.f44997j0 = mVar;
            c1Var.f44998k0 = null;
            c1Var.f44985a0 = mVar;
            c1Var.f44987b0 = null;
            c1Var.f44990d0 = false;
            c1Var.f44991e0 = null;
            c1Var.f44993f0 = false;
            c1Var.f44994g0 = false;
            c1Var.f44995h0 = false;
            c1Var.Q = null;
            c1Var.R = null;
            c1Var.d(false, false);
            c1Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = a51Var.e;
            Object obj2 = a51Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            c1Var.h(starGift, z13, z11, a51Var.f24297q, a51Var.f24298r, a51Var.f24300t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = c1Var.i((TL_stars.SavedStarGift) obj, a51Var.f24297q, a51Var.f24298r);
        }
        if (a51Var.f24287f) {
            c1Var.c(a51Var.e, z12);
        }
        c1Var.e(a51Var.h, z12);
        FrameLayout frameLayout = c1Var.d;
        float f10 = 1.0f;
        if (a51Var.f24288g) {
            f7 = 1.0f;
        } else {
            f7 = 0.65f;
        }
        frameLayout.setAlpha(f7);
        d1 d1Var = c1Var.f44992f;
        if (!a51Var.f24288g) {
            f10 = 0.5f;
        }
        d1Var.setAlpha(f10);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new c1(i10, context, p6Var);
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.f24297q == a51Var2.f24297q) {
            Object obj = a51Var.G;
            if (obj != null || a51Var2.G != null) {
                if (obj instanceof kg.m) {
                    if (obj == a51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = a51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f20021id == ((TL_stars.StarGift) obj2).f20021id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = a51Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f20021id == savedStarGift2.gift.f20021id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (a51Var.f24305z == a51Var2.f24305z && a51Var.e == a51Var2.e && a51Var.B == a51Var2.B && TextUtils.equals(a51Var.f24292l, a51Var2.f24292l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
