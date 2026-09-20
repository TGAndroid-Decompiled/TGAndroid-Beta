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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.yr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.b6;
import w7.y5;
import yh.l5;
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final yr0 f46347a;
    public final int f46348b;
    public final f6 f46349c;
    public boolean d;
    public l5 e;
    public final j2 f46350f;
    public ah.o h;
    public boolean f46351n;
    public int f46352r;
    public final FrameLayout f46353s;
    public final LinearLayout v;
    public final TextView f46354w;
    public final TextView f46355x;
    public final FrameLayout f46356y;

    public o2(yr0 yr0Var, int i10, f6 f6Var) {
        super(yr0Var.getContext());
        this.f46352r = AndroidUtilities.displaySize.y;
        Context context = yr0Var.getContext();
        this.f46347a = yr0Var;
        this.f46348b = i10;
        this.f46349c = f6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), f6Var, yr0Var);
        this.f46350f = j2Var;
        j2Var.Y2.f25678r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), yr0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, y5.e(-1, -1, 119));
        j2Var.j(new ii.m3(9, this, yr0Var));
        k2 k2Var = new k2(yr0Var);
        k2Var.f43009m = false;
        k2Var.C = false;
        k2Var.o(qr.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.y(new l2(this, yr0Var)).e(j2Var);
        View view = this.f46353s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f46356y;
        if (view2 != null) {
            removeView(view2);
        }
        if (yr0Var.d == this.e) {
            this.f46356y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f46353s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f46353s.addView(this.v, y5.e(-2, -2, 17));
            v9 v9Var = new v9(getContext());
            v9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(v9Var, y5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f46354w = textView;
            textView.setTextSize(1, 17.0f);
            this.f46354w.setTypeface(AndroidUtilities.bold());
            this.f46354w.setTextColor(j6.v0(j6.G6, f6Var));
            this.f46354w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f46354w, y5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f46355x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f46355x;
            int i11 = j6.Oh;
            textView3.setTextColor(j6.v0(i11, f6Var));
            this.f46355x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f46355x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f46167b;

                {
                    this.f46167b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            l5 l5Var = this.f46167b.e;
                            if (l5Var != null) {
                                if (!l5Var.e || l5Var.f47686g != 783) {
                                    l5Var.f47686g = 783;
                                    l5Var.e = true;
                                    l5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f46167b.f46347a.a();
                            return;
                    }
                }
            });
            this.f46355x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f46355x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var)), 4, 4));
            b6.a(this.f46355x);
            this.v.addView(this.f46355x, y5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f46353s, y5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f46353s);
            return;
        }
        this.f46353s = null;
        this.f46354w = null;
        this.f46355x = null;
        this.v = null;
        this.f46356y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46356y.addView(this.E, y5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(j6.v0(j6.G6, f6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, y5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(j6.v0(j6.f19477y6, f6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, y5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), f6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, y5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f46167b;

            {
                this.f46167b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f46167b.e;
                        if (l5Var != null) {
                            if (!l5Var.e || l5Var.f47686g != 783) {
                                l5Var.f47686g = 783;
                                l5Var.e = true;
                                l5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f46167b.f46347a.a();
                        return;
                }
            }
        });
        addView(this.f46356y, y5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        j2Var.setEmptyView(this.f46356y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(yr0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f46351n != z10) {
            this.f46351n = z10;
            yr0 yr0Var = this.f46347a;
            yr0Var.p(yr0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f46350f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof j1) {
                    ((j1) childAt).d(z10, true);
                }
                i10++;
            }
            k61 k61Var = j2Var.Y2;
            if (k61Var != null) {
                k61Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
                j2 j2Var = this.f46350f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof t00)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f46351n) {
            return;
        }
        l5 l5Var = this.e;
        if (l5Var != null) {
            l5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        k61 k61Var;
        j2 j2Var = this.f46350f;
        if (j2Var != null && (k61Var = j2Var.Y2) != null) {
            boolean canScrollVertically = j2Var.canScrollVertically(-1);
            k61Var.N(z10);
            if (!canScrollVertically) {
                j2Var.v0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f46350f;
            if (i10 >= j2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = j2Var.getChildAt(i10);
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
        NotificationCenter.getInstance(this.f46348b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46348b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f46352r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f46350f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.Y2.N(true);
        if (!canScrollVertically) {
            j2Var.v0(0);
        }
        this.f46347a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f46352r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f46353s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f46352r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f46356y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f46352r)) / 2.0f);
        }
    }
}
