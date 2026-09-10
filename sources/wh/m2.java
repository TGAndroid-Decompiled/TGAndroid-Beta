package wh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.a6;
import w7.c6;
import xh.n5;
public final class m2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final bi.d H;
    public boolean I;
    public final wr0 f44246a;
    public final int f44247b;
    public final f6 f44248c;
    public boolean d;
    public n5 e;
    public final h2 f44249f;
    public zg.k h;
    public boolean f44250n;
    public int f44251r;
    public final FrameLayout f44252s;
    public final LinearLayout v;
    public final TextView f44253w;
    public final TextView f44254x;
    public final FrameLayout f44255y;

    public m2(wr0 wr0Var, int i10, f6 f6Var) {
        super(wr0Var.getContext());
        this.f44251r = AndroidUtilities.displaySize.y;
        Context context = wr0Var.getContext();
        this.f44246a = wr0Var;
        this.f44247b = i10;
        this.f44248c = f6Var;
        h2 h2Var = new h2(context, i10, new gi.a(this, 17), new g2(this), new g2(this), f6Var, wr0Var);
        this.f44249f = h2Var;
        h2Var.Y2.f24250r = false;
        h2Var.setSelectorType(9);
        h2Var.setSelectorDrawableColor(0);
        h2Var.setPadding(AndroidUtilities.dp(9.0f), wr0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h2Var.setClipToPadding(false);
        h2Var.setClipChildren(false);
        addView(h2Var, a6.e(-1, -1, 119));
        h2Var.j(new hi.p3(9, this, wr0Var));
        i2 i2Var = new i2(wr0Var);
        i2Var.f41645m = false;
        i2Var.C = false;
        i2Var.o(wr.h);
        i2Var.n(350L);
        h2Var.setItemAnimator(i2Var);
        new s4.y(new j2(this, wr0Var)).d(h2Var);
        View view = this.f44252s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f44255y;
        if (view2 != null) {
            removeView(view2);
        }
        if (wr0Var.d == this.e) {
            this.f44255y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f44252s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f44252s.addView(this.v, a6.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, a6.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f44253w = textView;
            textView.setTextSize(1, 17.0f);
            this.f44253w.setTypeface(AndroidUtilities.bold());
            this.f44253w.setTextColor(j6.v0(j6.G6, f6Var));
            this.f44253w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f44253w, a6.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f44254x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f44254x;
            int i11 = j6.Oh;
            textView3.setTextColor(j6.v0(i11, f6Var));
            this.f44254x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f44254x.setOnClickListener(new View.OnClickListener(this) {
                public final m2 f44053b;

                {
                    this.f44053b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            n5 n5Var = this.f44053b.e;
                            if (n5Var != null) {
                                if (!n5Var.e || n5Var.f45757g != 783) {
                                    n5Var.f45757g = 783;
                                    n5Var.e = true;
                                    n5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f44053b.f44246a.a();
                            return;
                    }
                }
            });
            this.f44254x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f44254x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var)), 4, 4));
            c6.a(this.f44254x);
            this.v.addView(this.f44254x, a6.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f44252s, a6.e(-1, -1, 119));
            h2Var.setEmptyView(this.f44252s);
            return;
        }
        this.f44252s = null;
        this.f44253w = null;
        this.f44254x = null;
        this.v = null;
        this.f44255y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f44255y.addView(this.E, a6.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(j6.v0(j6.G6, f6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, a6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(j6.v0(j6.f18306y6, f6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, a6.t(-2, -2, 1, 0, 10, 0, 0));
        bi.d dVar = new bi.d(getContext(), f6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, a6.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final m2 f44053b;

            {
                this.f44053b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        n5 n5Var = this.f44053b.e;
                        if (n5Var != null) {
                            if (!n5Var.e || n5Var.f45757g != 783) {
                                n5Var.f45757g = 783;
                                n5Var.e = true;
                                n5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f44053b.f44246a.a();
                        return;
                }
            }
        });
        addView(this.f44255y, a6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        h2Var.setEmptyView(this.f44255y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(wr0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(m2 m2Var, boolean z10) {
        m2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        h2 h2Var;
        if (this.f44250n != z10) {
            this.f44250n = z10;
            wr0 wr0Var = this.f44246a;
            wr0Var.p(wr0Var.g());
            int i10 = 0;
            while (true) {
                h2Var = this.f44249f;
                if (i10 >= h2Var.getChildCount()) {
                    break;
                }
                View childAt = h2Var.getChildAt(i10);
                if (childAt instanceof h1) {
                    ((h1) childAt).d(z10, true);
                }
                i10++;
            }
            j61 j61Var = h2Var.Y2;
            if (j61Var != null) {
                j61Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new q1(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                h2 h2Var = this.f44249f;
                if (h2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < h2Var.getChildCount(); i12++) {
                        if (!(h2Var.getChildAt(i12) instanceof a10)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f44250n) {
            return;
        }
        n5 n5Var = this.e;
        if (n5Var != null) {
            n5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        j61 j61Var;
        h2 h2Var = this.f44249f;
        if (h2Var != null && (j61Var = h2Var.Y2) != null) {
            boolean canScrollVertically = h2Var.canScrollVertically(-1);
            j61Var.N(z10);
            if (!canScrollVertically) {
                h2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            h2 h2Var = this.f44249f;
            if (i10 >= h2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = h2Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof h1) {
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
        NotificationCenter.getInstance(this.f44247b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f44247b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f44251r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        h2 h2Var = this.f44249f;
        boolean canScrollVertically = h2Var.canScrollVertically(-1);
        h2Var.Y2.N(true);
        if (!canScrollVertically) {
            h2Var.u0(0);
        }
        this.f44246a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f44251r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f44252s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f44251r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f44255y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f44251r)) / 2.0f);
        }
    }
}
