package yh;

import ai.s8;
import ai.y9;
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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.b6;
import w7.z5;
public final class m2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ei.d H;
    public boolean I;
    public final is0 f50419a;
    public final int f50420b;
    public final d6 f50421c;
    public boolean d;
    public y9 e;
    public final h2 f50422f;
    public bh.l h;
    public boolean f50423n;
    public int f50424r;
    public final FrameLayout f50425s;
    public final LinearLayout v;
    public final TextView f50426w;
    public final TextView f50427x;
    public final FrameLayout f50428y;

    public m2(is0 is0Var, int i10, d6 d6Var) {
        super(is0Var.getContext());
        this.f50424r = AndroidUtilities.displaySize.y;
        Context context = is0Var.getContext();
        this.f50419a = is0Var;
        this.f50420b = i10;
        this.f50421c = d6Var;
        h2 h2Var = new h2(context, i10, new hg.o(this, 28), new g2(this), new g2(this), d6Var, is0Var);
        this.f50422f = h2Var;
        h2Var.W2.f30207r = false;
        h2Var.setSelectorType(9);
        h2Var.setSelectorDrawableColor(0);
        h2Var.setPadding(AndroidUtilities.dp(9.0f), is0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h2Var.setClipToPadding(false);
        h2Var.setClipChildren(false);
        addView(h2Var, z5.e(-1, -1, 119));
        h2Var.j(new ki.m3(9, this, is0Var));
        i2 i2Var = new i2(is0Var);
        i2Var.f45992m = false;
        i2Var.C = false;
        i2Var.o(bs.h);
        i2Var.n(350L);
        h2Var.setItemAnimator(i2Var);
        new s4.y(new j2(this, is0Var)).d(h2Var);
        View view = this.f50425s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f50428y;
        if (view2 != null) {
            removeView(view2);
        }
        if (is0Var.d == this.e) {
            this.f50428y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f50425s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f50425s.addView(this.v, z5.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new uj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, z5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f50426w = textView;
            textView.setTextSize(1, 17.0f);
            this.f50426w.setTypeface(AndroidUtilities.bold());
            this.f50426w.setTextColor(h6.w0(h6.G6, d6Var));
            this.f50426w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f50426w, z5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f50427x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f50427x;
            int i11 = h6.Oh;
            textView3.setTextColor(h6.w0(i11, d6Var));
            this.f50427x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f50427x.setOnClickListener(new View.OnClickListener(this) {
                public final m2 f50247b;

                {
                    this.f50247b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            y9 y9Var = this.f50247b.e;
                            if (y9Var != null) {
                                if (!y9Var.e || y9Var.f2494g != 783) {
                                    y9Var.f2494g = 783;
                                    y9Var.e = true;
                                    y9Var.j(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f50247b.f50419a.a();
                            return;
                    }
                }
            });
            this.f50427x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f50427x.setBackground(h6.Z(h6.m1(0.1f, h6.w0(i11, d6Var)), 4, 4));
            b6.a(this.f50427x);
            this.v.addView(this.f50427x, z5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f50425s, z5.e(-1, -1, 119));
            h2Var.setEmptyView(this.f50425s);
            return;
        }
        this.f50425s = null;
        this.f50426w = null;
        this.f50427x = null;
        this.v = null;
        this.f50428y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f50428y.addView(this.E, z5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(h6.w0(h6.G6, d6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(h6.w0(h6.f21381y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, z5.t(-2, -2, 1, 0, 10, 0, 0));
        ei.d dVar = new ei.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, z5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final m2 f50247b;

            {
                this.f50247b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        y9 y9Var = this.f50247b.e;
                        if (y9Var != null) {
                            if (!y9Var.e || y9Var.f2494g != 783) {
                                y9Var.f2494g = 783;
                                y9Var.e = true;
                                y9Var.j(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f50247b.f50419a.a();
                        return;
                }
            }
        });
        addView(this.f50428y, z5.a(-1.0f, 0.0f, -12.0f, 0.0f, 0.0f, -1, 119));
        h2Var.setEmptyView(this.f50428y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(is0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(m2 m2Var, boolean z10) {
        m2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        h2 h2Var;
        if (this.f50423n != z10) {
            this.f50423n = z10;
            is0 is0Var = this.f50419a;
            is0Var.p(is0Var.g());
            int i10 = 0;
            while (true) {
                h2Var = this.f50422f;
                if (i10 >= h2Var.getChildCount()) {
                    break;
                }
                View childAt = h2Var.getChildAt(i10);
                if (childAt instanceof h1) {
                    ((h1) childAt).d(z10, true);
                }
                i10++;
            }
            s61 s61Var = h2Var.W2;
            if (s61Var != null) {
                s61Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new s8(profileActivity, 2));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                h2 h2Var = this.f50422f;
                if (h2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < h2Var.getChildCount(); i12++) {
                        if (!(h2Var.getChildAt(i12) instanceof b10)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f50423n) {
            return;
        }
        y9 y9Var = this.e;
        if (y9Var != null) {
            y9Var.m();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        s61 s61Var;
        h2 h2Var = this.f50422f;
        if (h2Var != null && (s61Var = h2Var.W2) != null) {
            boolean canScrollVertically = h2Var.canScrollVertically(-1);
            s61Var.N(z10);
            if (!canScrollVertically) {
                h2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            h2 h2Var = this.f50422f;
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
        NotificationCenter.getInstance(this.f50420b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f50420b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f50424r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        h2 h2Var = this.f50422f;
        boolean canScrollVertically = h2Var.canScrollVertically(-1);
        h2Var.W2.N(true);
        if (!canScrollVertically) {
            h2Var.u0(0);
        }
        this.f50419a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f50424r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f50425s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f50424r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f50428y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f50424r)) / 2.0f);
        }
    }
}
