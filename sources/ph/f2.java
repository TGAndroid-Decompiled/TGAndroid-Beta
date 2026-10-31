package ph;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import rh.v5;
import w7.b6;
import w7.e6;
public final class f2 extends FrameLayout implements us {
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final vh.d G;
    public boolean H;
    public final vq0 f45042a;
    public final int f45043b;
    public final p6 f45044c;
    public boolean d;
    public v5 e;
    public final ii f45045f;
    public boolean h;
    public int f45046n;
    public final FrameLayout f45047r;
    public final LinearLayout f45048s;
    public final TextView f45049w;
    public final TextView f45050x;
    public final FrameLayout f45051y;

    public f2(vq0 vq0Var, int i10, p6 p6Var) {
        super(vq0Var.getContext());
        this.f45046n = org.telegram.messenger.i0.f16026q.y;
        Context context = vq0Var.getContext();
        this.f45042a = vq0Var;
        this.f45043b = i10;
        this.f45044c = p6Var;
        ii iiVar = new ii(context, i10, new ag.a(this, 26), new a2(this), new a2(this), p6Var, vq0Var);
        this.f45045f = iiVar;
        iiVar.f30819f3.f29295r = false;
        iiVar.setSelectorType(9);
        iiVar.setSelectorDrawableColor(0);
        iiVar.setClipToPadding(false);
        iiVar.setClipChildren(false);
        addView(iiVar, b6.e(-1, -1, 119));
        g();
        iiVar.j(new bi.t3(10, this, vq0Var));
        b2 b2Var = new b2(vq0Var);
        b2Var.f47927m = false;
        b2Var.C = false;
        b2Var.o(gr.h);
        b2Var.n(350L);
        iiVar.setItemAnimator(b2Var);
        new s4.x(new c2(this, vq0Var)).h(iiVar);
        View view = this.f45047r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f45051y;
        if (view2 != null) {
            removeView(view2);
        }
        if (vq0Var.d == this.e) {
            this.f45051y = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.D = null;
            this.f45047r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f45048s = linearLayout;
            linearLayout.setOrientation(1);
            this.f45047r.addView(this.f45048s, b6.e(-2, -2, 17));
            g9 g9Var = new g9(getContext());
            g9Var.setImageDrawable(new bi0(2131624317, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f)));
            this.f45048s.addView(g9Var, b6.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f45049w = textView;
            textView.setTextSize(1, 17.0f);
            this.f45049w.setTypeface(org.telegram.messenger.i0.o());
            a7.V(this.f45049w, t6.G6, p6Var);
            this.f45049w.setText(cd.L0(2131746684, null));
            this.f45048s.addView(this.f45049w, b6.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f45050x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f45050x;
            int i11 = t6.Ci;
            a7.V(textView3, i11, p6Var);
            this.f45050x.setText(cd.L0(2131746685, null));
            this.f45050x.setOnClickListener(new View.OnClickListener(this) {
                public final f2 f45346b;

                {
                    this.f45346b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            v5 v5Var = this.f45346b.e;
                            if (v5Var != null) {
                                if (!v5Var.e || v5Var.f47578g != 783) {
                                    v5Var.f47578g = 783;
                                    v5Var.e = true;
                                    v5Var.j(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f45346b.f45042a.a();
                            return;
                    }
                }
            });
            this.f45050x.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f));
            a7.R(this.f45050x, t6.a0(t6.r1(0.1f, t6.w0(i11, p6Var)), 4, 4), null, a7.L(0.1f, i11), p6Var);
            e6.a(this.f45050x);
            this.f45048s.addView(this.f45050x, b6.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f45047r, b6.e(-1, -1, 119));
            iiVar.setEmptyView(this.f45047r);
            return;
        }
        this.f45047r = null;
        this.f45049w = null;
        this.f45050x = null;
        this.f45048s = null;
        this.f45051y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f45051y.addView(this.D, b6.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.E = textView4;
        textView4.setTextSize(1, 20.0f);
        this.E.setTypeface(org.telegram.messenger.i0.o());
        a7.V(this.E, t6.G6, p6Var);
        this.E.setText(cd.L0(2131750254, null));
        this.D.addView(this.E, b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.F = textView5;
        textView5.setTextSize(1, 14.0f);
        a7.V(this.F, t6.f21311y6, p6Var);
        this.F.setText(cd.L0(2131750255, null));
        this.D.addView(this.F, b6.t(-2, -2, 1, 0, 10, 0, 0));
        vh.d dVar = new vh.d(getContext(), p6Var, true);
        this.G = dVar;
        dVar.i(cd.L0(2131750256, null), false, true);
        this.D.addView(this.G, b6.t(200, 44, 1, 0, 19, 0, 12));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final f2 f45346b;

            {
                this.f45346b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f45346b.e;
                        if (v5Var != null) {
                            if (!v5Var.e || v5Var.f47578g != 783) {
                                v5Var.f47578g = 783;
                                v5Var.e = true;
                                v5Var.j(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f45346b.f45042a.a();
                        return;
                }
            }
        });
        addView(this.f45051y, b6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        iiVar.setEmptyView(this.f45051y);
        LinearLayout linearLayout3 = this.D;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(vq0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(f2 f2Var, boolean z10) {
        f2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        ii iiVar;
        if (this.h != z10) {
            this.h = z10;
            vq0 vq0Var = this.f45042a;
            vq0Var.q(vq0Var.g());
            int i10 = 0;
            while (true) {
                iiVar = this.f45045f;
                if (i10 >= iiVar.getChildCount()) {
                    break;
                }
                View childAt = iiVar.getChildAt(i10);
                if (childAt instanceof c1) {
                    ((c1) childAt).e(z10, true);
                }
                i10++;
            }
            p51 p51Var = iiVar.f30819f3;
            if (p51Var != null) {
                p51Var.T();
            }
            if (z10) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.T4(false);
                    org.telegram.messenger.i0.g3(new q1(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.G3 && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                ii iiVar = this.f45045f;
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
        p51 p51Var;
        ii iiVar = this.f45045f;
        if (iiVar != null && (p51Var = iiVar.f30819f3) != null) {
            boolean canScrollVertically = iiVar.canScrollVertically(-1);
            p51Var.O(z10);
            if (!canScrollVertically) {
                iiVar.v0(0);
            }
        }
    }

    public final void g() {
        boolean z10;
        vq0 vq0Var = this.f45042a;
        if (vq0Var.L == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setClipChildren(z10);
        ii iiVar = this.f45045f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iiVar.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = -vq0Var.L;
        if (i10 != i11 || marginLayoutParams.bottomMargin != (-vq0Var.M)) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = -vq0Var.M;
            iiVar.setLayoutParams(marginLayoutParams);
        }
        iiVar.setPadding(org.telegram.messenger.i0.L(9.0f), vq0Var.L + vq0Var.K, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(86.0f) + vq0Var.M);
    }

    public float getTabsHeight() {
        ii iiVar = this.f45045f;
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
        zs.f(this.f45043b).c(this, zs.G3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f45043b).n(this, zs.G3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f45046n);
    }

    public void setHasTabs(boolean z10) {
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        ii iiVar = this.f45045f;
        boolean canScrollVertically = iiVar.canScrollVertically(-1);
        iiVar.f30819f3.O(true);
        if (!canScrollVertically) {
            iiVar.v0(0);
        }
        this.f45042a.p();
    }

    public void setVisibleHeight(int i10) {
        this.f45046n = i10;
        float l4 = Utilities.l(org.telegram.messenger.i0.z1(i10, org.telegram.messenger.i0.L(150.0f), org.telegram.messenger.i0.L(220.0f)));
        float T1 = org.telegram.messenger.i0.T1(0.6f, 1.0f, l4);
        LinearLayout linearLayout = this.f45048s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l4);
            this.f45048s.setScaleX(T1);
            this.f45048s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.f45047r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f45046n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.D;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l4);
            this.D.setScaleX(T1);
            this.D.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.f45051y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f45046n)) / 2.0f);
        }
    }
}
