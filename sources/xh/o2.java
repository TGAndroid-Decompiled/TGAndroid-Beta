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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import w7.z5;
import yh.f5;
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final ss0 f51556a;
    public final int f51557b;
    public final d6 f51558c;
    public boolean d;
    public f5 f51559e;
    public final j2 f51560f;
    public ah.n h;
    public boolean f51561n;
    public int f51562r;
    public final FrameLayout f51563s;
    public final LinearLayout v;
    public final TextView f51564w;
    public final TextView f51565x;
    public final FrameLayout f51566y;

    public o2(ss0 ss0Var, int i10, d6 d6Var) {
        super(ss0Var.getContext());
        this.f51562r = AndroidUtilities.displaySize.y;
        Context context = ss0Var.getContext();
        this.f51556a = ss0Var;
        this.f51557b = i10;
        this.f51558c = d6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), d6Var, ss0Var);
        this.f51560f = j2Var;
        j2Var.W2.f25649r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), ss0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, x5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, ss0Var));
        k2 k2Var = new k2(ss0Var);
        k2Var.f47822m = false;
        k2Var.C = false;
        k2Var.o(is.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.z(new l2(this, ss0Var)).e(j2Var);
        View view = this.f51563s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f51566y;
        if (view2 != null) {
            removeView(view2);
        }
        if (ss0Var.d == this.f51559e) {
            this.f51566y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f51563s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f51563s.addView(this.v, x5.e(-2, -2, 17));
            y9 y9Var = new y9(getContext());
            y9Var.setImageDrawable(new dk0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(y9Var, x5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f51564w = textView;
            textView.setTextSize(1, 17.0f);
            this.f51564w.setTypeface(AndroidUtilities.bold());
            this.f51564w.setTextColor(h6.w0(h6.G6, d6Var));
            this.f51564w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f51564w, x5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f51565x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f51565x;
            int i11 = h6.Oh;
            textView3.setTextColor(h6.w0(i11, d6Var));
            this.f51565x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f51565x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f51345b;

                {
                    this.f51345b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            f5 f5Var = this.f51345b.f51559e;
                            if (f5Var != null) {
                                if (!f5Var.f52634e || f5Var.f52636g != 783) {
                                    f5Var.f52636g = 783;
                                    f5Var.f52634e = true;
                                    f5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f51345b.f51556a.a();
                            return;
                    }
                }
            });
            this.f51565x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f51565x.setBackground(h6.Z(h6.m1(0.1f, h6.w0(i11, d6Var)), 4, 4));
            z5.a(this.f51565x);
            this.v.addView(this.f51565x, x5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f51563s, x5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f51563s);
            return;
        }
        this.f51563s = null;
        this.f51564w = null;
        this.f51565x = null;
        this.v = null;
        this.f51566y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f51566y.addView(this.E, x5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(h6.w0(h6.G6, d6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(h6.w0(h6.f21207y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, x5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, x5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f51345b;

            {
                this.f51345b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        f5 f5Var = this.f51345b.f51559e;
                        if (f5Var != null) {
                            if (!f5Var.f52634e || f5Var.f52636g != 783) {
                                f5Var.f52636g = 783;
                                f5Var.f52634e = true;
                                f5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f51345b.f51556a.a();
                        return;
                }
            }
        });
        addView(this.f51566y, x5.a(-1.0f, 0.0f, -12.0f, 0.0f, 0.0f, -1, 119));
        j2Var.setEmptyView(this.f51566y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(ss0Var.f51635e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f51561n != z10) {
            this.f51561n = z10;
            ss0 ss0Var = this.f51556a;
            ss0Var.p(ss0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f51560f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof j1) {
                    ((j1) childAt).d(z10, true);
                }
                i10++;
            }
            d71 d71Var = j2Var.W2;
            if (d71Var != null) {
                d71Var.S();
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51559e) {
            f(true);
            if (this.f51559e != null && isAttachedToWindow()) {
                j2 j2Var = this.f51560f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof k10)) {
                        }
                    }
                    return;
                }
                this.f51559e.a();
            }
        }
    }

    public final void e() {
        if (!this.f51561n) {
            return;
        }
        f5 f5Var = this.f51559e;
        if (f5Var != null) {
            f5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        d71 d71Var;
        j2 j2Var = this.f51560f;
        if (j2Var != null && (d71Var = j2Var.W2) != null) {
            boolean canScrollVertically = j2Var.canScrollVertically(-1);
            d71Var.N(z10);
            if (!canScrollVertically) {
                j2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f51560f;
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
        NotificationCenter.getInstance(this.f51557b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f51557b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f51562r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f51560f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.W2.N(true);
        if (!canScrollVertically) {
            j2Var.u0(0);
        }
        this.f51556a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f51562r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f51563s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f51562r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f51566y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f51562r)) / 2.0f);
        }
    }
}
