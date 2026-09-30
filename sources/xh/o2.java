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
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w00;
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
    public final cs0 f46435a;
    public final int f46436b;
    public final d6 f46437c;
    public boolean d;
    public k5 e;
    public final j2 f46438f;
    public ah.n h;
    public boolean f46439n;
    public int f46440r;
    public final FrameLayout f46441s;
    public final LinearLayout v;
    public final TextView f46442w;
    public final TextView f46443x;
    public final FrameLayout f46444y;

    public o2(cs0 cs0Var, int i10, d6 d6Var) {
        super(cs0Var.getContext());
        this.f46440r = AndroidUtilities.displaySize.y;
        Context context = cs0Var.getContext();
        this.f46435a = cs0Var;
        this.f46436b = i10;
        this.f46437c = d6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), d6Var, cs0Var);
        this.f46438f = j2Var;
        j2Var.f28778f3.f26223r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), cs0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, y5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, cs0Var));
        k2 k2Var = new k2(cs0Var);
        k2Var.f43103m = false;
        k2Var.C = false;
        k2Var.o(tr.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.y(new l2(this, cs0Var)).e(j2Var);
        View view = this.f46441s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f46444y;
        if (view2 != null) {
            removeView(view2);
        }
        if (cs0Var.d == this.e) {
            this.f46444y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f46441s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f46441s.addView(this.v, y5.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new lj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, y5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f46442w = textView;
            textView.setTextSize(1, 17.0f);
            this.f46442w.setTypeface(AndroidUtilities.bold());
            this.f46442w.setTextColor(h6.v0(h6.G6, d6Var));
            this.f46442w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f46442w, y5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f46443x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f46443x;
            int i11 = h6.Oh;
            textView3.setTextColor(h6.v0(i11, d6Var));
            this.f46443x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f46443x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f46255b;

                {
                    this.f46255b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            k5 k5Var = this.f46255b.e;
                            if (k5Var != null) {
                                if (!k5Var.e || k5Var.f47716g != 783) {
                                    k5Var.f47716g = 783;
                                    k5Var.e = true;
                                    k5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f46255b.f46435a.a();
                            return;
                    }
                }
            });
            this.f46443x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f46443x.setBackground(h6.Y(h6.l1(0.1f, h6.v0(i11, d6Var)), 4, 4));
            a6.a(this.f46443x);
            this.v.addView(this.f46443x, y5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f46441s, y5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f46441s);
            return;
        }
        this.f46441s = null;
        this.f46442w = null;
        this.f46443x = null;
        this.v = null;
        this.f46444y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46444y.addView(this.E, y5.e(-2, -2, 17));
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
        this.G.setTextColor(h6.v0(h6.f19459y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, y5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, y5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f46255b;

            {
                this.f46255b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        k5 k5Var = this.f46255b.e;
                        if (k5Var != null) {
                            if (!k5Var.e || k5Var.f47716g != 783) {
                                k5Var.f47716g = 783;
                                k5Var.e = true;
                                k5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f46255b.f46435a.a();
                        return;
                }
            }
        });
        addView(this.f46444y, y5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        j2Var.setEmptyView(this.f46444y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(cs0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f46439n != z10) {
            this.f46439n = z10;
            cs0 cs0Var = this.f46435a;
            cs0Var.p(cs0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f46438f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof j1) {
                    ((j1) childAt).d(z10, true);
                }
                i10++;
            }
            m61 m61Var = j2Var.f28778f3;
            if (m61Var != null) {
                m61Var.S();
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
                j2 j2Var = this.f46438f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof w00)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f46439n) {
            return;
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        m61 m61Var;
        j2 j2Var = this.f46438f;
        if (j2Var != null && (m61Var = j2Var.f28778f3) != null) {
            boolean canScrollVertically = j2Var.canScrollVertically(-1);
            m61Var.N(z10);
            if (!canScrollVertically) {
                j2Var.v0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f46438f;
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
        NotificationCenter.getInstance(this.f46436b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46436b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f46440r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f46438f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.f28778f3.N(true);
        if (!canScrollVertically) {
            j2Var.v0(0);
        }
        this.f46435a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f46440r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f46441s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f46440r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f46444y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f46440r)) / 2.0f);
        }
    }
}
