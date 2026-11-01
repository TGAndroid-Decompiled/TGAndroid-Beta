package ph;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import rh.v5;
import w7.b6;
import w7.e6;
public final class f2 extends FrameLayout implements vs {
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final vh.d G;
    public boolean H;
    public final wq0 f45053a;
    public final int f45054b;
    public final p6 f45055c;
    public boolean d;
    public v5 e;
    public final ii f45056f;
    public boolean h;
    public int f45057n;
    public final FrameLayout f45058r;
    public final LinearLayout f45059s;
    public final TextView f45060w;
    public final TextView f45061x;
    public final FrameLayout f45062y;

    public f2(wq0 wq0Var, int i10, p6 p6Var) {
        super(wq0Var.getContext());
        this.f45057n = org.telegram.messenger.i0.f16172q.y;
        Context context = wq0Var.getContext();
        this.f45053a = wq0Var;
        this.f45054b = i10;
        this.f45055c = p6Var;
        ii iiVar = new ii(context, i10, new ag.a(this, 26), new a2(this), new a2(this), p6Var, wq0Var);
        this.f45056f = iiVar;
        iiVar.f31183f3.f29638r = false;
        iiVar.setSelectorType(9);
        iiVar.setSelectorDrawableColor(0);
        iiVar.setClipToPadding(false);
        iiVar.setClipChildren(false);
        addView(iiVar, b6.e(-1, -1, 119));
        g();
        iiVar.j(new bi.t3(10, this, wq0Var));
        b2 b2Var = new b2(wq0Var);
        b2Var.f47938m = false;
        b2Var.C = false;
        b2Var.o(gr.h);
        b2Var.n(350L);
        iiVar.setItemAnimator(b2Var);
        new s4.x(new c2(this, wq0Var)).h(iiVar);
        View view = this.f45058r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f45062y;
        if (view2 != null) {
            removeView(view2);
        }
        if (wq0Var.d == this.e) {
            this.f45062y = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.D = null;
            this.f45058r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f45059s = linearLayout;
            linearLayout.setOrientation(1);
            this.f45058r.addView(this.f45059s, b6.e(-2, -2, 17));
            g9 g9Var = new g9(getContext());
            g9Var.setImageDrawable(new ci0(2131624317, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f)));
            this.f45059s.addView(g9Var, b6.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f45060w = textView;
            textView.setTextSize(1, 17.0f);
            this.f45060w.setTypeface(org.telegram.messenger.i0.o());
            a7.V(this.f45060w, t6.G6, p6Var);
            this.f45060w.setText(dd.L0(2131746684, null));
            this.f45059s.addView(this.f45060w, b6.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f45061x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f45061x;
            int i11 = t6.Ci;
            a7.V(textView3, i11, p6Var);
            this.f45061x.setText(dd.L0(2131746685, null));
            this.f45061x.setOnClickListener(new View.OnClickListener(this) {
                public final f2 f45357b;

                {
                    this.f45357b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            v5 v5Var = this.f45357b.e;
                            if (v5Var != null) {
                                if (!v5Var.e || v5Var.f47592g != 783) {
                                    v5Var.f47592g = 783;
                                    v5Var.e = true;
                                    v5Var.j(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f45357b.f45053a.a();
                            return;
                    }
                }
            });
            this.f45061x.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f));
            a7.R(this.f45061x, t6.a0(t6.r1(0.1f, t6.w0(i11, p6Var)), 4, 4), null, a7.L(0.1f, i11), p6Var);
            e6.a(this.f45061x);
            this.f45059s.addView(this.f45061x, b6.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f45058r, b6.e(-1, -1, 119));
            iiVar.setEmptyView(this.f45058r);
            return;
        }
        this.f45058r = null;
        this.f45060w = null;
        this.f45061x = null;
        this.f45059s = null;
        this.f45062y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f45062y.addView(this.D, b6.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.E = textView4;
        textView4.setTextSize(1, 20.0f);
        this.E.setTypeface(org.telegram.messenger.i0.o());
        a7.V(this.E, t6.G6, p6Var);
        this.E.setText(dd.L0(2131750254, null));
        this.D.addView(this.E, b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.F = textView5;
        textView5.setTextSize(1, 14.0f);
        a7.V(this.F, t6.f21312y6, p6Var);
        this.F.setText(dd.L0(2131750255, null));
        this.D.addView(this.F, b6.t(-2, -2, 1, 0, 10, 0, 0));
        vh.d dVar = new vh.d(getContext(), p6Var, true);
        this.G = dVar;
        dVar.i(dd.L0(2131750256, null), false, true);
        this.D.addView(this.G, b6.t(200, 44, 1, 0, 19, 0, 12));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final f2 f45357b;

            {
                this.f45357b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f45357b.e;
                        if (v5Var != null) {
                            if (!v5Var.e || v5Var.f47592g != 783) {
                                v5Var.f47592g = 783;
                                v5Var.e = true;
                                v5Var.j(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f45357b.f45053a.a();
                        return;
                }
            }
        });
        addView(this.f45062y, b6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        iiVar.setEmptyView(this.f45062y);
        LinearLayout linearLayout3 = this.D;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(wq0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(f2 f2Var, boolean z10) {
        f2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        ii iiVar;
        if (this.h != z10) {
            this.h = z10;
            wq0 wq0Var = this.f45053a;
            wq0Var.q(wq0Var.g());
            int i10 = 0;
            while (true) {
                iiVar = this.f45056f;
                if (i10 >= iiVar.getChildCount()) {
                    break;
                }
                View childAt = iiVar.getChildAt(i10);
                if (childAt instanceof c1) {
                    ((c1) childAt).e(z10, true);
                }
                i10++;
            }
            q51 q51Var = iiVar.f31183f3;
            if (q51Var != null) {
                q51Var.T();
            }
            if (z10) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.U4(false);
                    org.telegram.messenger.i0.g3(new q1(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.G3 && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                ii iiVar = this.f45056f;
                if (iiVar.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < iiVar.getChildCount(); i12++) {
                        if (!(iiVar.getChildAt(i12) instanceof zz)) {
                        }
                    }
                    return;
                }
                this.e.b();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        v5 v5Var = this.e;
        if (v5Var != null) {
            v5Var.n();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        q51 q51Var;
        ii iiVar = this.f45056f;
        if (iiVar != null && (q51Var = iiVar.f31183f3) != null) {
            boolean canScrollVertically = iiVar.canScrollVertically(-1);
            q51Var.O(z10);
            if (!canScrollVertically) {
                iiVar.v0(0);
            }
        }
    }

    public final void g() {
        boolean z10;
        wq0 wq0Var = this.f45053a;
        if (wq0Var.L == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setClipChildren(z10);
        ii iiVar = this.f45056f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iiVar.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = -wq0Var.L;
        if (i10 != i11 || marginLayoutParams.bottomMargin != (-wq0Var.M)) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = -wq0Var.M;
            iiVar.setLayoutParams(marginLayoutParams);
        }
        iiVar.setPadding(org.telegram.messenger.i0.L(9.0f), wq0Var.L + wq0Var.K, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(86.0f) + wq0Var.M);
    }

    public float getTabsHeight() {
        ii iiVar = this.f45056f;
        float y3 = iiVar.getY();
        for (int i10 = 0; i10 < iiVar.getChildCount(); i10++) {
            View childAt = iiVar.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof c1) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y3);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y3);
            }
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.f(this.f45054b).c(this, at.G3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.f(this.f45054b).n(this, at.G3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f45057n);
    }

    public void setHasTabs(boolean z10) {
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        ii iiVar = this.f45056f;
        boolean canScrollVertically = iiVar.canScrollVertically(-1);
        iiVar.f31183f3.O(true);
        if (!canScrollVertically) {
            iiVar.v0(0);
        }
        this.f45053a.p();
    }

    public void setVisibleHeight(int i10) {
        this.f45057n = i10;
        float l4 = Utilities.l(org.telegram.messenger.i0.z1(i10, org.telegram.messenger.i0.L(150.0f), org.telegram.messenger.i0.L(220.0f)));
        float T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, l4);
        LinearLayout linearLayout = this.f45059s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l4);
            this.f45059s.setScaleX(T1);
            this.f45059s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.f45058r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f45057n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.D;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l4);
            this.D.setScaleX(T1);
            this.D.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.f45062y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f45057n)) / 2.0f);
        }
    }
}
