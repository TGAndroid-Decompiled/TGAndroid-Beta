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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class z1 extends FrameLayout implements ls {
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final fi.d G;
    public boolean H;
    public final up0 f60651a;
    public final int f60652b;
    public final h6 f60653c;
    public boolean d;
    public v9 f60654e;
    public final fi.w3 f60655f;
    public boolean h;
    public int f60656n;
    public final FrameLayout f60657r;
    public final LinearLayout f60658s;
    public final TextView f60659w;
    public final TextView f60660x;
    public final FrameLayout f60661y;

    public z1(up0 up0Var, int i7, h6 h6Var) {
        super(up0Var.getContext());
        this.f60656n = org.telegram.messenger.g0.f22567q.y;
        Context context = up0Var.getContext();
        this.f60651a = up0Var;
        this.f60652b = i7;
        this.f60653c = h6Var;
        fi.w3 w3Var = new fi.w3(context, i7, new p0(this, 1), new u1(this), new u1(this), h6Var, up0Var);
        this.f60655f = w3Var;
        w3Var.f37496f3.f35845r = false;
        w3Var.setSelectorType(9);
        w3Var.setSelectorDrawableColor(0);
        w3Var.setClipToPadding(false);
        w3Var.setClipChildren(false);
        addView(w3Var, ha.e(-1, -1, 119));
        g();
        w3Var.j(new ai.o0(11, this, up0Var));
        v1 v1Var = new v1(up0Var);
        v1Var.f57079m = false;
        v1Var.C = false;
        v1Var.o(wq.h);
        v1Var.n(350L);
        w3Var.setItemAnimator(v1Var);
        new v4.y(new w1(this, up0Var)).h(w3Var);
        View view = this.f60657r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f60661y;
        if (view2 != null) {
            removeView(view2);
        }
        if (up0Var.d == this.f60654e) {
            this.f60661y = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.D = null;
            this.f60657r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f60658s = linearLayout;
            linearLayout.setOrientation(1);
            this.f60657r.addView(this.f60658s, ha.e(-2, -2, 17));
            k9 k9Var = new k9(getContext());
            k9Var.setImageDrawable(new zg0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
            this.f60658s.addView(k9Var, ha.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f60659w = textView;
            textView.setTextSize(1, 17.0f);
            this.f60659w.setTypeface(org.telegram.messenger.g0.o());
            t6.U(this.f60659w, m6.G6, h6Var);
            this.f60659w.setText(id.M0(2131746669, null));
            this.f60658s.addView(this.f60659w, ha.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f60660x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f60660x;
            int i10 = m6.Ci;
            t6.U(textView3, i10, h6Var);
            this.f60660x.setText(id.M0(2131746670, null));
            this.f60660x.setOnClickListener(new View.OnClickListener(this) {
                public final z1 f60532b;

                {
                    this.f60532b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            v9 v9Var = this.f60532b.f60654e;
                            if (v9Var != null) {
                                if (!v9Var.f4908e || v9Var.f4910g != 783) {
                                    v9Var.f4910g = 783;
                                    v9Var.f4908e = true;
                                    v9Var.j(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f60532b.f60651a.a();
                            return;
                    }
                }
            });
            this.f60660x.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f));
            t6.Q(this.f60660x, m6.a0(m6.r1(0.1f, m6.w0(i10, h6Var)), 4, 4), null, t6.K(0.1f, i10), h6Var);
            ka.a(this.f60660x);
            this.f60658s.addView(this.f60660x, ha.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f60657r, ha.e(-1, -1, 119));
            w3Var.setEmptyView(this.f60657r);
            return;
        }
        this.f60657r = null;
        this.f60659w = null;
        this.f60660x = null;
        this.f60658s = null;
        this.f60661y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f60661y.addView(this.D, ha.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.E = textView4;
        textView4.setTextSize(1, 20.0f);
        this.E.setTypeface(org.telegram.messenger.g0.o());
        t6.U(this.E, m6.G6, h6Var);
        this.E.setText(id.M0(2131750245, null));
        this.D.addView(this.E, ha.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.F = textView5;
        textView5.setTextSize(1, 14.0f);
        t6.U(this.F, m6.f28282y6, h6Var);
        this.F.setText(id.M0(2131750246, null));
        this.D.addView(this.F, ha.t(-2, -2, 1, 0, 10, 0, 0));
        fi.d dVar = new fi.d(getContext(), h6Var, true);
        this.G = dVar;
        dVar.i(id.M0(2131750247, null), false, true);
        this.D.addView(this.G, ha.t(200, 44, 1, 0, 19, 0, 12));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final z1 f60532b;

            {
                this.f60532b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v9 v9Var = this.f60532b.f60654e;
                        if (v9Var != null) {
                            if (!v9Var.f4908e || v9Var.f4910g != 783) {
                                v9Var.f4910g = 783;
                                v9Var.f4908e = true;
                                v9Var.j(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f60532b.f60651a.a();
                        return;
                }
            }
        });
        addView(this.f60661y, ha.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        w3Var.setEmptyView(this.f60661y);
        LinearLayout linearLayout3 = this.D;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(up0Var.f60297e.h() ? 0 : 8);
        }
    }

    public static void d(z1 z1Var, boolean z9) {
        z1Var.setReordering(z9);
    }

    public void setReordering(boolean z9) {
        fi.w3 w3Var;
        if (this.h != z9) {
            this.h = z9;
            up0 up0Var = this.f60651a;
            up0Var.q(up0Var.g());
            int i7 = 0;
            while (true) {
                w3Var = this.f60655f;
                if (i7 >= w3Var.getChildCount()) {
                    break;
                }
                View childAt = w3Var.getChildAt(i7);
                if (childAt instanceof y0) {
                    ((y0) childAt).e(z9, true);
                }
                i7++;
            }
            m41 m41Var = w3Var.f37496f3;
            if (m41Var != null) {
                m41Var.T();
            }
            if (z9) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.h3(new w8(profileActivity, 2));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.G3 && objArr[1] == this.f60654e) {
            f(true);
            if (this.f60654e != null && isAttachedToWindow()) {
                fi.w3 w3Var = this.f60655f;
                if (w3Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
                        if (!(w3Var.getChildAt(i11) instanceof lz)) {
                        }
                    }
                    return;
                }
                this.f60654e.a();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        v9 v9Var = this.f60654e;
        if (v9Var != null) {
            v9Var.n();
        }
        setReordering(false);
    }

    public final void f(boolean z9) {
        m41 m41Var;
        fi.w3 w3Var = this.f60655f;
        if (w3Var != null && (m41Var = w3Var.f37496f3) != null) {
            boolean canScrollVertically = w3Var.canScrollVertically(-1);
            m41Var.O(z9);
            if (!canScrollVertically) {
                w3Var.v0(0);
            }
        }
    }

    public final void g() {
        boolean z9;
        up0 up0Var = this.f60651a;
        if (up0Var.L == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        setClipChildren(z9);
        fi.w3 w3Var = this.f60655f;
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
        fi.w3 w3Var = this.f60655f;
        float y10 = w3Var.getY();
        for (int i7 = 0; i7 < w3Var.getChildCount(); i7++) {
            View childAt = w3Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof y0) {
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
        qs.f(this.f60652b).c(this, qs.G3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f60652b).n(this, qs.G3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setVisibleHeight(this.f60656n);
    }

    public void setHasTabs(boolean z9) {
        if (this.H == z9) {
            return;
        }
        this.H = z9;
        fi.w3 w3Var = this.f60655f;
        boolean canScrollVertically = w3Var.canScrollVertically(-1);
        w3Var.f37496f3.O(true);
        if (!canScrollVertically) {
            w3Var.v0(0);
        }
        this.f60651a.p();
    }

    public void setVisibleHeight(int i7) {
        this.f60656n = i7;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i7, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, l10);
        LinearLayout linearLayout = this.f60658s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l10);
            this.f60658s.setScaleX(T1);
            this.f60658s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.f60657r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f60656n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.D;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l10);
            this.D.setScaleX(T1);
            this.D.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.f60661y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f60656n)) / 2.0f);
        }
    }
}
