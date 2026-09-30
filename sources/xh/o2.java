package xh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.a6;
import w7.y5;
import yh.k5;
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final bs0 f46329a;
    public final int f46330b;
    public final d6 f46331c;
    public boolean d;
    public k5 e;
    public final j2 f46332f;
    public ah.n h;
    public boolean f46333n;
    public int f46334r;
    public final FrameLayout f46335s;
    public final LinearLayout v;
    public final TextView f46336w;
    public final TextView f46337x;
    public final FrameLayout f46338y;

    public o2(bs0 bs0Var, int i10, d6 d6Var) {
        super(bs0Var.getContext());
        this.f46334r = AndroidUtilities.displaySize.y;
        Context context = bs0Var.getContext();
        this.f46329a = bs0Var;
        this.f46330b = i10;
        this.f46331c = d6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), d6Var, bs0Var);
        this.f46332f = j2Var;
        j2Var.Y2.f25924r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), bs0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, y5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, bs0Var));
        k2 k2Var = new k2(bs0Var);
        k2Var.f42997m = false;
        k2Var.C = false;
        k2Var.o(sr.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.y(new l2(this, bs0Var)).e(j2Var);
        View view = this.f46335s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f46338y;
        if (view2 != null) {
            removeView(view2);
        }
        if (bs0Var.d == this.e) {
            this.f46338y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f46335s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f46335s.addView(this.v, y5.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, y5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f46336w = textView;
            textView.setTextSize(1, 17.0f);
            this.f46336w.setTypeface(AndroidUtilities.bold());
            this.f46336w.setTextColor(h6.v0(h6.G6, d6Var));
            this.f46336w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f46336w, y5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f46337x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f46337x;
            int i11 = h6.Oh;
            textView3.setTextColor(h6.v0(i11, d6Var));
            this.f46337x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f46337x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f46149b;

                {
                    this.f46149b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            k5 k5Var = this.f46149b.e;
                            if (k5Var != null) {
                                if (!k5Var.e || k5Var.f47610g != 783) {
                                    k5Var.f47610g = 783;
                                    k5Var.e = true;
                                    k5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f46149b.f46329a.a();
                            return;
                    }
                }
            });
            this.f46337x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f46337x.setBackground(h6.Y(h6.l1(0.1f, h6.v0(i11, d6Var)), 4, 4));
            a6.a(this.f46337x);
            this.v.addView(this.f46337x, y5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f46335s, y5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f46335s);
            return;
        }
        this.f46335s = null;
        this.f46336w = null;
        this.f46337x = null;
        this.v = null;
        this.f46338y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46338y.addView(this.E, y5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(h6.v0(h6.G6, d6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, y5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(h6.v0(h6.f19444y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, y5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, y5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f46149b;

            {
                this.f46149b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        k5 k5Var = this.f46149b.e;
                        if (k5Var != null) {
                            if (!k5Var.e || k5Var.f47610g != 783) {
                                k5Var.f47610g = 783;
                                k5Var.e = true;
                                k5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f46149b.f46329a.a();
                        return;
                }
            }
        });
        addView(this.f46338y, y5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        j2Var.setEmptyView(this.f46338y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(bs0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f46333n != z10) {
            this.f46333n = z10;
            bs0 bs0Var = this.f46329a;
            bs0Var.p(bs0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f46332f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof j1) {
                    ((j1) childAt).d(z10, true);
                }
                i10++;
            }
            l61 l61Var = j2Var.Y2;
            if (l61Var != null) {
                l61Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new s1(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                j2 j2Var = this.f46332f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof v00)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f46333n) {
            return;
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        l61 l61Var;
        j2 j2Var = this.f46332f;
        if (j2Var != null && (l61Var = j2Var.Y2) != null) {
            boolean canScrollVertically = j2Var.canScrollVertically(-1);
            l61Var.N(z10);
            if (!canScrollVertically) {
                j2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f46332f;
            if (i10 >= j2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = j2Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof j1) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY());
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY());
            }
            i10++;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f46330b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46330b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f46334r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f46332f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.Y2.N(true);
        if (!canScrollVertically) {
            j2Var.u0(0);
        }
        this.f46329a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f46334r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f46335s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f46334r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f46338y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f46334r)) / 2.0f);
        }
    }
}
