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
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class x0 extends x31 {
    public static final int f60594b = 0;

    static {
        x31.h(new x31());
    }

    public static y31 i(int i7, TL_stars.StarGift starGift, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        y31 K = y31.K(x0.class);
        K.f40577u = 1;
        K.f40581z = i7;
        K.G = starGift;
        K.f40562e = z9;
        K.H = Boolean.valueOf(z10);
        K.f40574r = z12;
        K.f40573q = z11;
        K.f40576t = z13;
        return K;
    }

    @Override
    public final void a(qj0 qj0Var, View view, y31 y31Var) {
        ((y0) view).e(y31Var.h, false);
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        float f10;
        int i7;
        y0 y0Var = (y0) view;
        Object obj = y31Var.G;
        boolean z11 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            w41 w41Var = y0Var.J;
            TextView textView = y0Var.I;
            TextView textView2 = y0Var.H;
            v0 v0Var = y0Var.f60608e;
            l9 l9Var = y0Var.D;
            TextView textView3 = y0Var.L;
            TextView textView4 = y0Var.M;
            int d = jVar.d();
            if (y0Var.f60615j0 != jVar) {
                pb f12 = dd.f1(l9Var, l9Var.getImageReceiver(), d);
                y0Var.N = f12;
                f12.run();
                y0Var.N = null;
            }
            v0Var.d(null);
            v0Var.e(null);
            v0Var.g(null);
            textView2.setText(id.G(d, "Gift2Months", new Object[0]));
            textView.setText(id.M0(2131744230, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            l9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            y0Var.f60618n.setVisibility(8);
            y0Var.F.setVisibility(8);
            if (jVar.f56652c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (l6.I.q()) {
                    i7 = -1333971;
                } else {
                    i7 = -2722014;
                }
                textView4.setTextColor(i7);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + id.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                wp[] wpVarArr = new wp[1];
                textView4.setText(dd.a1(false, id.V(null, null, 2131747028, spannableStringBuilder), 0.48f, wpVarArr));
                wpVarArr[0].G = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = y0Var.E;
            layoutParams.gravity = 49;
            l9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            y0Var.f60626s0 = 0;
            y0Var.K.setBackground(l6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) w41Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) w41Var.getLayoutParams()).gravity = 49;
            y0Var.f60615j0 = jVar;
            y0Var.f60616k0 = null;
            y0Var.f60602a0 = jVar;
            y0Var.f60604b0 = null;
            y0Var.f60607d0 = false;
            y0Var.f60609e0 = null;
            y0Var.f60611f0 = false;
            y0Var.f60612g0 = false;
            y0Var.f60613h0 = false;
            y0Var.Q = null;
            y0Var.R = null;
            y0Var.d(false, false);
            y0Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = y31Var.f40562e;
            Object obj2 = y31Var.H;
            if (obj2 instanceof Boolean) {
                z10 = ((Boolean) obj2).booleanValue();
            } else {
                z10 = false;
            }
            y0Var.h(starGift, z12, z10, y31Var.f40573q, y31Var.f40574r, y31Var.f40576t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = y0Var.i((TL_stars.SavedStarGift) obj, y31Var.f40573q, y31Var.f40574r);
        }
        if (y31Var.f40563f) {
            y0Var.c(y31Var.f40562e, z11);
        }
        y0Var.e(y31Var.h, z11);
        FrameLayout frameLayout = y0Var.d;
        float f11 = 1.0f;
        if (y31Var.f40564g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        z0 z0Var = y0Var.f60610f;
        if (!y31Var.f40564g) {
            f11 = 0.5f;
        }
        z0Var.setAlpha(f11);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new y0(i7, context, g6Var);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.f40573q == y31Var2.f40573q) {
            Object obj = y31Var.G;
            if (obj != null || y31Var2.G != null) {
                if (obj instanceof ug.j) {
                    if (obj == y31Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = y31Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f27185id == ((TL_stars.StarGift) obj2).f27185id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = y31Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f27185id == savedStarGift2.gift.f27185id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (y31Var.f40581z == y31Var2.f40581z && y31Var.f40562e == y31Var2.f40562e && y31Var.B == y31Var2.B && TextUtils.equals(y31Var.f40568l, y31Var2.f40568l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
