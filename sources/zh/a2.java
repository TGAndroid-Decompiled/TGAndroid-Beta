package zh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.v9;
import bi.w8;
import c8.ha;
import c8.ka;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class a2 extends FrameLayout implements ls {
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final fi.d G;
    public boolean H;
    public final up0 f60081a;
    public final int f60082b;
    public final f6 f60083c;
    public boolean d;
    public v9 f60084e;
    public final fi.w3 f60085f;
    public boolean h;
    public int f60086n;
    public final FrameLayout f60087r;
    public final LinearLayout f60088s;
    public final TextView f60089w;
    public final TextView f60090x;
    public final FrameLayout f60091y;

    public a2(up0 up0Var, int i7, f6 f6Var) {
        super(up0Var.getContext());
        this.f60086n = org.telegram.messenger.g0.f22537q.y;
        Context context = up0Var.getContext();
        this.f60081a = up0Var;
        this.f60082b = i7;
        this.f60083c = f6Var;
        fi.w3 w3Var = new fi.w3(context, i7, new q0(this, 1), new v1(this), new v1(this), f6Var, up0Var);
        this.f60085f = w3Var;
        w3Var.f35167f3.f33473r = false;
        w3Var.setSelectorType(9);
        w3Var.setSelectorDrawableColor(0);
        w3Var.setClipToPadding(false);
        w3Var.setClipChildren(false);
        addView(w3Var, ha.e(-1, -1, 119));
        g();
        w3Var.j(new ai.o0(11, this, up0Var));
        w1 w1Var = new w1(up0Var);
        w1Var.f56954m = false;
        w1Var.C = false;
        w1Var.o(xq.h);
        w1Var.n(350L);
        w3Var.setItemAnimator(w1Var);
        new v4.y(new x1(this, up0Var)).h(w3Var);
        View view = this.f60087r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f60091y;
        if (view2 != null) {
            removeView(view2);
        }
        if (up0Var.d == this.f60084e) {
            this.f60091y = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.D = null;
            this.f60087r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f60088s = linearLayout;
            linearLayout.setOrientation(1);
            this.f60087r.addView(this.f60088s, ha.e(-2, -2, 17));
            l9 l9Var = new l9(getContext());
            l9Var.setImageDrawable(new zg0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
            this.f60088s.addView(l9Var, ha.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f60089w = textView;
            textView.setTextSize(1, 17.0f);
            this.f60089w.setTypeface(org.telegram.messenger.g0.o());
            r6.V(this.f60089w, k6.G6, f6Var);
            this.f60089w.setText(hd.M0(2131746668, null));
            this.f60088s.addView(this.f60089w, ha.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f60090x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f60090x;
            int i10 = k6.Ci;
            r6.V(textView3, i10, f6Var);
            this.f60090x.setText(hd.M0(2131746669, null));
            this.f60090x.setOnClickListener(new View.OnClickListener(this) {
                public final a2 f60409b;

                {
                    this.f60409b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            v9 v9Var = this.f60409b.f60084e;
                            if (v9Var != null) {
                                if (!v9Var.f4909e || v9Var.f4911g != 783) {
                                    v9Var.f4911g = 783;
                                    v9Var.f4909e = true;
                                    v9Var.j(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f60409b.f60081a.a();
                            return;
                    }
                }
            });
            this.f60090x.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f));
            r6.R(this.f60090x, k6.a0(k6.r1(0.1f, k6.w0(i10, f6Var)), 4, 4), null, r6.L(0.1f, i10), f6Var);
            ka.a(this.f60090x);
            this.f60088s.addView(this.f60090x, ha.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f60087r, ha.e(-1, -1, 119));
            w3Var.setEmptyView(this.f60087r);
            return;
        }
        this.f60087r = null;
        this.f60089w = null;
        this.f60090x = null;
        this.f60088s = null;
        this.f60091y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f60091y.addView(this.D, ha.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.E = textView4;
        textView4.setTextSize(1, 20.0f);
        this.E.setTypeface(org.telegram.messenger.g0.o());
        r6.V(this.E, k6.G6, f6Var);
        this.E.setText(hd.M0(2131750244, null));
        this.D.addView(this.E, ha.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.F = textView5;
        textView5.setTextSize(1, 14.0f);
        r6.V(this.F, k6.f28240y6, f6Var);
        this.F.setText(hd.M0(2131750245, null));
        this.D.addView(this.F, ha.t(-2, -2, 1, 0, 10, 0, 0));
        fi.d dVar = new fi.d(getContext(), f6Var, true);
        this.G = dVar;
        dVar.i(hd.M0(2131750246, null), false, true);
        this.D.addView(this.G, ha.t(200, 44, 1, 0, 19, 0, 12));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final a2 f60409b;

            {
                this.f60409b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f60409b.f60084e;
                        if (v9Var != null) {
                            if (!v9Var.f4909e || v9Var.f4911g != 783) {
                                v9Var.f4911g = 783;
                                v9Var.f4909e = true;
                                v9Var.j(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f60409b.f60081a.a();
                        return;
                }
            }
        });
        addView(this.f60091y, ha.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        w3Var.setEmptyView(this.f60091y);
        LinearLayout linearLayout3 = this.D;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(up0Var.f60190e.h() ? 0 : 8);
        }
    }

    public static void d(a2 a2Var, boolean z9) {
        a2Var.setReordering(z9);
    }

    public void setReordering(boolean z9) {
        fi.w3 w3Var;
        if (this.h != z9) {
            this.h = z9;
            up0 up0Var = this.f60081a;
            up0Var.q(up0Var.g());
            int i7 = 0;
            while (true) {
                w3Var = this.f60085f;
                if (i7 >= w3Var.getChildCount()) {
                    break;
                }
                View childAt = w3Var.getChildAt(i7);
                if (childAt instanceof z0) {
                    ((z0) childAt).e(z9, true);
                }
                i7++;
            }
            f41 f41Var = w3Var.f35167f3;
            if (f41Var != null) {
                f41Var.T();
            }
            if (z9) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.U4(false);
                    org.telegram.messenger.g0.h3(new w8(profileActivity, 2));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.G3 && objArr[1] == this.f60084e) {
            f(true);
            if (this.f60084e != null && isAttachedToWindow()) {
                fi.w3 w3Var = this.f60085f;
                if (w3Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
                        if (!(w3Var.getChildAt(i11) instanceof lz)) {
                        }
                    }
                    return;
                }
                this.f60084e.a();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        v9 v9Var = this.f60084e;
        if (v9Var != null) {
            v9Var.n();
        }
        setReordering(false);
    }

    public final void f(boolean z9) {
        f41 f41Var;
        fi.w3 w3Var = this.f60085f;
        if (w3Var != null && (f41Var = w3Var.f35167f3) != null) {
            boolean canScrollVertically = w3Var.canScrollVertically(-1);
            f41Var.O(z9);
            if (!canScrollVertically) {
                w3Var.v0(0);
            }
        }
    }

    public final void g() {
        boolean z9;
        up0 up0Var = this.f60081a;
        if (up0Var.L == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        setClipChildren(z9);
        fi.w3 w3Var = this.f60085f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w3Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -up0Var.L;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-up0Var.M)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -up0Var.M;
            w3Var.setLayoutParams(marginLayoutParams);
        }
        w3Var.setPadding(org.telegram.messenger.g0.L(9.0f), up0Var.L + up0Var.K, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + up0Var.M);
    }

    public float getTabsHeight() {
        fi.w3 w3Var = this.f60085f;
        float y10 = w3Var.getY();
        for (int i7 = 0; i7 < w3Var.getChildCount(); i7++) {
            View childAt = w3Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof z0) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y10);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y10);
            }
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f60082b).c(this, qs.G3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f60082b).n(this, qs.G3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setVisibleHeight(this.f60086n);
    }

    public void setHasTabs(boolean z9) {
        if (this.H == z9) {
            return;
        }
        this.H = z9;
        fi.w3 w3Var = this.f60085f;
        boolean canScrollVertically = w3Var.canScrollVertically(-1);
        w3Var.f35167f3.O(true);
        if (!canScrollVertically) {
            w3Var.v0(0);
        }
        this.f60081a.p();
    }

    public void setVisibleHeight(int i7) {
        this.f60086n = i7;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i7, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, l10);
        LinearLayout linearLayout = this.f60088s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l10);
            this.f60088s.setScaleX(T1);
            this.f60088s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.f60087r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f60086n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.D;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l10);
            this.D.setScaleX(T1);
            this.D.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.f60091y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f60086n)) / 2.0f);
        }
    }
}
