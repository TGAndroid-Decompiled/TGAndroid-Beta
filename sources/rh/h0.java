package rh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.gr;
public final class h0 implements TextWatcher {
    public final int f47006a;
    public final Object f47007b;

    public h0(Object obj, int i10) {
        this.f47006a = i10;
        this.f47007b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        sf.a i10;
        String obj;
        int indexOf;
        String str;
        float f7;
        long j10;
        boolean z11;
        r20 r20Var;
        switch (this.f47006a) {
            case 0:
                i0 i0Var = (i0) this.f47007b;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                if (!z10) {
                    i10 = sf.a.h(editable.toString(), i0Var.f47088v1.f48265a);
                } else {
                    i10 = sf.a.i(0L, i0Var.f47088v1.f48265a);
                }
                i0Var.J0(i10, false, false, true);
                i0Var.f47076i1.c(i0Var.f47077j1.isFocused(), !TextUtils.isEmpty(i0Var.f47077j1.getText()));
                return;
            case 1:
                vh.p1 p1Var = (vh.p1) this.f47007b;
                ImageView imageView = p1Var.f51736r;
                org.telegram.ui.ActionBar.n0 n0Var = p1Var.e;
                if (!p1Var.f51737s) {
                    p1Var.d(false);
                    String obj2 = n0Var.getText().toString();
                    if (TextUtils.isEmpty(obj2)) {
                        str = null;
                    } else {
                        str = obj2;
                    }
                    k20 k20Var = p1Var.f51739x;
                    if (k20Var != null) {
                        k20Var.a(str, -1);
                    }
                    vh.o1 o1Var = p1Var.h;
                    if (o1Var != null) {
                        o1Var.I1(null);
                        p1Var.h.J1(TextUtils.isEmpty(obj2), true);
                    }
                    if (n0Var != null) {
                        n0Var.animate().cancel();
                        float f10 = 0.0f;
                        ViewPropertyAnimator translationX = n0Var.animate().translationX(0.0f);
                        gr grVar = gr.h;
                        translationX.setInterpolator(grVar).start();
                        if (imageView != null && p1Var.f51735n != (!TextUtils.isEmpty(n0Var.getText()))) {
                            p1Var.f51735n = !p1Var.f51735n;
                            imageView.animate().cancel();
                            if (p1Var.f51735n) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f11 = 0.7f;
                            if (p1Var.f51735n) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f7);
                            if (p1Var.f51735n) {
                                f11 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                            if (p1Var.f51735n) {
                                f10 = 1.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f10).withEndAction(new vh.d0(this, 5)).setInterpolator(grVar).setDuration(320L);
                            if (p1Var.f51735n) {
                                j10 = 240;
                            } else {
                                j10 = 0;
                            }
                            duration.setStartDelay(j10).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                vh.f5 f5Var = (vh.f5) this.f47007b;
                String obj3 = editable.toString();
                f5Var.f51161j2 = obj3;
                if (!f5Var.R1) {
                    String str2 = f5Var.f51166o2;
                    String str3 = "";
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    boolean equals = TextUtils.equals(str2, obj3);
                    boolean z12 = false;
                    if (!equals) {
                        f5Var.f1();
                        String str4 = f5Var.f51161j2;
                        if (str4 != null && str4.length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        f5Var.f51165n2 = z11;
                    }
                    String str5 = f5Var.f51177z2;
                    String str6 = f5Var.f51161j2;
                    if (str6 != null) {
                        str3 = str6;
                    }
                    if (!TextUtils.equals(str5, str3)) {
                        f5Var.e1();
                        String str7 = f5Var.f51161j2;
                        if (str7 != null && str7.length() > 3 && !TextUtils.isEmpty(((org.telegram.messenger.q0) wp.r1(f5Var.f21584a).f19300y7.F.f13481b).f17725c)) {
                            z12 = true;
                        }
                        f5Var.f51172u2 = z12;
                    }
                    vh.c5 c5Var = f5Var.f51168q2;
                    org.telegram.messenger.i0.r(c5Var);
                    org.telegram.messenger.i0.h3(c5Var, 400L);
                    vh.c5 c5Var2 = f5Var.B2;
                    org.telegram.messenger.i0.r(c5Var2);
                    org.telegram.messenger.i0.h3(c5Var2, 400L);
                }
                f5Var.f51159h2.O(true);
                return;
            case 3:
                vh.t6 t6Var = (vh.t6) this.f47007b;
                if (!t6Var.f51991n && (r20Var = t6Var.f51992r) != null && editable != null) {
                    r20Var.a(editable.toString());
                    return;
                }
                return;
            default:
                ((yh.l) this.f47007b).d0();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f47006a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f47006a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void j(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
