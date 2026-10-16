package yh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.b6;
import w7.z5;
import zh.f5;
public final class m2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final di.d H;
    public boolean I;
    public final ns0 f48993a;
    public final int f48994b;
    public final c6 f48995c;
    public boolean d;
    public f5 e;
    public final h2 f48996f;
    public bh.l h;
    public boolean f48997n;
    public int f48998r;
    public final FrameLayout f48999s;
    public final LinearLayout v;
    public final TextView f49000w;
    public final TextView f49001x;
    public final FrameLayout f49002y;

    public m2(ns0 ns0Var, int i10, c6 c6Var) {
        super(ns0Var.getContext());
        this.f48998r = AndroidUtilities.displaySize.y;
        Context context = ns0Var.getContext();
        this.f48993a = ns0Var;
        this.f48994b = i10;
        this.f48995c = c6Var;
        h2 h2Var = new h2(context, i10, new ii.a(this, 17), new g2(this), new g2(this), c6Var, ns0Var);
        this.f48996f = h2Var;
        h2Var.W2.f23145r = false;
        h2Var.setSelectorType(9);
        h2Var.setSelectorDrawableColor(0);
        h2Var.setPadding(AndroidUtilities.dp(9.0f), ns0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h2Var.setClipToPadding(false);
        h2Var.setClipChildren(false);
        addView(h2Var, z5.e(-1, -1, 119));
        h2Var.j(new ji.n3(9, this, ns0Var));
        i2 i2Var = new i2(ns0Var);
        i2Var.f44872m = false;
        i2Var.C = false;
        i2Var.o(es.h);
        i2Var.n(350L);
        h2Var.setItemAnimator(i2Var);
        new s4.y(new j2(this, ns0Var)).d(h2Var);
        View view = this.f48999s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f49002y;
        if (view2 != null) {
            removeView(view2);
        }
        if (ns0Var.d == this.e) {
            this.f49002y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f48999s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f48999s.addView(this.v, z5.e(-2, -2, 17));
            z9 z9Var = new z9(getContext());
            z9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(z9Var, z5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f49000w = textView;
            textView.setTextSize(1, 17.0f);
            this.f49000w.setTypeface(AndroidUtilities.bold());
            this.f49000w.setTextColor(g6.w0(g6.G6, c6Var));
            this.f49000w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f49000w, z5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f49001x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f49001x;
            int i11 = g6.Oh;
            textView3.setTextColor(g6.w0(i11, c6Var));
            this.f49001x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f49001x.setOnClickListener(new View.OnClickListener(this) {
                public final m2 f48815b;

                {
                    this.f48815b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            f5 f5Var = this.f48815b.e;
                            if (f5Var != null) {
                                if (!f5Var.e || f5Var.f50506g != 783) {
                                    f5Var.f50506g = 783;
                                    f5Var.e = true;
                                    f5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f48815b.f48993a.a();
                            return;
                    }
                }
            });
            this.f49001x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f49001x.setBackground(g6.Z(g6.m1(0.1f, g6.w0(i11, c6Var)), 4, 4));
            b6.a(this.f49001x);
            this.v.addView(this.f49001x, z5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f48999s, z5.e(-1, -1, 119));
            h2Var.setEmptyView(this.f48999s);
            return;
        }
        this.f48999s = null;
        this.f49000w = null;
        this.f49001x = null;
        this.v = null;
        this.f49002y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f49002y.addView(this.E, z5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(g6.w0(g6.G6, c6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(g6.w0(g6.f19988y6, c6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, z5.t(-2, -2, 1, 0, 10, 0, 0));
        di.d dVar = new di.d(getContext(), c6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, z5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final m2 f48815b;

            {
                this.f48815b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        f5 f5Var = this.f48815b.e;
                        if (f5Var != null) {
                            if (!f5Var.e || f5Var.f50506g != 783) {
                                f5Var.f50506g = 783;
                                f5Var.e = true;
                                f5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f48815b.f48993a.a();
                        return;
                }
            }
        });
        addView(this.f49002y, z5.a(-1.0f, 0.0f, -12.0f, 0.0f, 0.0f, -1, 119));
        h2Var.setEmptyView(this.f49002y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(ns0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(m2 m2Var, boolean z10) {
        m2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        h2 h2Var;
        if (this.f48997n != z10) {
            this.f48997n = z10;
            ns0 ns0Var = this.f48993a;
            ns0Var.p(ns0Var.g());
            int i10 = 0;
            while (true) {
                h2Var = this.f48996f;
                if (i10 >= h2Var.getChildCount()) {
                    break;
                }
                View childAt = h2Var.getChildAt(i10);
                if (childAt instanceof h1) {
                    ((h1) childAt).d(z10, true);
                }
                i10++;
            }
            a71 a71Var = h2Var.W2;
            if (a71Var != null) {
                a71Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
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
                h2 h2Var = this.f48996f;
                if (h2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < h2Var.getChildCount(); i12++) {
                        if (!(h2Var.getChildAt(i12) instanceof f10)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f48997n) {
            return;
        }
        f5 f5Var = this.e;
        if (f5Var != null) {
            f5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        a71 a71Var;
        h2 h2Var = this.f48996f;
        if (h2Var != null && (a71Var = h2Var.W2) != null) {
            boolean canScrollVertically = h2Var.canScrollVertically(-1);
            a71Var.N(z10);
            if (!canScrollVertically) {
                h2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            h2 h2Var = this.f48996f;
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
        NotificationCenter.getInstance(this.f48994b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f48994b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f48998r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        h2 h2Var = this.f48996f;
        boolean canScrollVertically = h2Var.canScrollVertically(-1);
        h2Var.W2.N(true);
        if (!canScrollVertically) {
            h2Var.u0(0);
        }
        this.f48993a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f48998r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f48999s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f48998r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f49002y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f48998r)) / 2.0f);
        }
    }
}
