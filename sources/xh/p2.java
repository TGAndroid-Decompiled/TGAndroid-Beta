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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
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
public final class p2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final bs0 f46405a;
    public final int f46406b;
    public final e6 f46407c;
    public boolean d;
    public k5 e;
    public final k2 f46408f;
    public ah.n h;
    public boolean f46409n;
    public int f46410r;
    public final FrameLayout f46411s;
    public final LinearLayout v;
    public final TextView f46412w;
    public final TextView f46413x;
    public final FrameLayout f46414y;

    public p2(bs0 bs0Var, int i10, e6 e6Var) {
        super(bs0Var.getContext());
        this.f46410r = AndroidUtilities.displaySize.y;
        Context context = bs0Var.getContext();
        this.f46405a = bs0Var;
        this.f46406b = i10;
        this.f46407c = e6Var;
        k2 k2Var = new k2(context, i10, new hi.a(this, 17), new j2(this), new j2(this), e6Var, bs0Var);
        this.f46408f = k2Var;
        k2Var.Y2.f25959r = false;
        k2Var.setSelectorType(9);
        k2Var.setSelectorDrawableColor(0);
        k2Var.setPadding(AndroidUtilities.dp(9.0f), bs0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        k2Var.setClipToPadding(false);
        k2Var.setClipChildren(false);
        addView(k2Var, y5.e(-1, -1, 119));
        k2Var.j(new ii.n3(9, this, bs0Var));
        l2 l2Var = new l2(bs0Var);
        l2Var.f43040m = false;
        l2Var.C = false;
        l2Var.o(sr.h);
        l2Var.n(350L);
        k2Var.setItemAnimator(l2Var);
        new s4.y(new m2(this, bs0Var)).e(k2Var);
        View view = this.f46411s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f46414y;
        if (view2 != null) {
            removeView(view2);
        }
        if (bs0Var.d == this.e) {
            this.f46414y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f46411s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f46411s.addView(this.v, y5.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, y5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f46412w = textView;
            textView.setTextSize(1, 17.0f);
            this.f46412w.setTypeface(AndroidUtilities.bold());
            this.f46412w.setTextColor(i6.v0(i6.G6, e6Var));
            this.f46412w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f46412w, y5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f46413x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f46413x;
            int i11 = i6.Oh;
            textView3.setTextColor(i6.v0(i11, e6Var));
            this.f46413x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f46413x.setOnClickListener(new View.OnClickListener(this) {
                public final p2 f46224b;

                {
                    this.f46224b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            k5 k5Var = this.f46224b.e;
                            if (k5Var != null) {
                                if (!k5Var.e || k5Var.f47662g != 783) {
                                    k5Var.f47662g = 783;
                                    k5Var.e = true;
                                    k5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f46224b.f46405a.a();
                            return;
                    }
                }
            });
            this.f46413x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f46413x.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i11, e6Var)), 4, 4));
            a6.a(this.f46413x);
            this.v.addView(this.f46413x, y5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f46411s, y5.e(-1, -1, 119));
            k2Var.setEmptyView(this.f46411s);
            return;
        }
        this.f46411s = null;
        this.f46412w = null;
        this.f46413x = null;
        this.v = null;
        this.f46414y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46414y.addView(this.E, y5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(i6.v0(i6.G6, e6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, y5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(i6.v0(i6.f19442y6, e6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, y5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), e6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, y5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final p2 f46224b;

            {
                this.f46224b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        k5 k5Var = this.f46224b.e;
                        if (k5Var != null) {
                            if (!k5Var.e || k5Var.f47662g != 783) {
                                k5Var.f47662g = 783;
                                k5Var.e = true;
                                k5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f46224b.f46405a.a();
                        return;
                }
            }
        });
        addView(this.f46414y, y5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        k2Var.setEmptyView(this.f46414y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(bs0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(p2 p2Var, boolean z10) {
        p2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        k2 k2Var;
        if (this.f46409n != z10) {
            this.f46409n = z10;
            bs0 bs0Var = this.f46405a;
            bs0Var.p(bs0Var.g());
            int i10 = 0;
            while (true) {
                k2Var = this.f46408f;
                if (i10 >= k2Var.getChildCount()) {
                    break;
                }
                View childAt = k2Var.getChildAt(i10);
                if (childAt instanceof j1) {
                    ((j1) childAt).d(z10, true);
                }
                i10++;
            }
            l61 l61Var = k2Var.Y2;
            if (l61Var != null) {
                l61Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
                k2 k2Var = this.f46408f;
                if (k2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < k2Var.getChildCount(); i12++) {
                        if (!(k2Var.getChildAt(i12) instanceof v00)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f46409n) {
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
        k2 k2Var = this.f46408f;
        if (k2Var != null && (l61Var = k2Var.Y2) != null) {
            boolean canScrollVertically = k2Var.canScrollVertically(-1);
            l61Var.N(z10);
            if (!canScrollVertically) {
                k2Var.v0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            k2 k2Var = this.f46408f;
            if (i10 >= k2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = k2Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (childAt instanceof j1) {
                if (S == 0) {
                    return Math.max(0.0f, childAt.getY());
                }
            } else if (S == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY());
            }
            i10++;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f46406b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46406b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f46410r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        k2 k2Var = this.f46408f;
        boolean canScrollVertically = k2Var.canScrollVertically(-1);
        k2Var.Y2.N(true);
        if (!canScrollVertically) {
            k2Var.v0(0);
        }
        this.f46405a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f46410r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f46411s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f46410r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f46414y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f46410r)) / 2.0f);
        }
    }
}
