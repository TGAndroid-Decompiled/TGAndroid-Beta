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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import w7.z5;
import zh.j5;
public final class m2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final di.d H;
    public boolean I;
    public final nr0 f50469a;
    public final int f50470b;
    public final f6 f50471c;
    public boolean d;
    public j5 f50472e;
    public final h2 f50473f;
    public bh.l h;
    public boolean f50474n;
    public int f50475r;
    public final FrameLayout f50476s;
    public final LinearLayout v;
    public final TextView f50477w;
    public final TextView f50478x;
    public final FrameLayout f50479y;

    public m2(nr0 nr0Var, int i10, f6 f6Var) {
        super(nr0Var.getContext());
        this.f50475r = AndroidUtilities.displaySize.y;
        Context context = nr0Var.getContext();
        this.f50469a = nr0Var;
        this.f50470b = i10;
        this.f50471c = f6Var;
        h2 h2Var = new h2(context, i10, new ii.a(this, 17), new g2(this), new g2(this), f6Var, nr0Var);
        this.f50473f = h2Var;
        h2Var.Y2.f31163r = false;
        h2Var.setSelectorType(9);
        h2Var.setSelectorDrawableColor(0);
        h2Var.setPadding(AndroidUtilities.dp(9.0f), nr0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h2Var.setClipToPadding(false);
        h2Var.setClipChildren(false);
        addView(h2Var, x5.e(-1, -1, 119));
        h2Var.j(new ji.l3(9, this, nr0Var));
        i2 i2Var = new i2(nr0Var);
        i2Var.f45806m = false;
        i2Var.C = false;
        i2Var.o(pr.h);
        i2Var.n(350L);
        h2Var.setItemAnimator(i2Var);
        new s4.y(new j2(this, nr0Var)).d(h2Var);
        View view = this.f50476s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f50479y;
        if (view2 != null) {
            removeView(view2);
        }
        if (nr0Var.d == this.f50472e) {
            this.f50479y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f50476s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f50476s.addView(this.v, x5.e(-2, -2, 17));
            x9 x9Var = new x9(getContext());
            x9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(x9Var, x5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f50477w = textView;
            textView.setTextSize(1, 17.0f);
            this.f50477w.setTypeface(AndroidUtilities.bold());
            this.f50477w.setTextColor(j6.v0(j6.G6, f6Var));
            this.f50477w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f50477w, x5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f50478x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f50478x;
            int i11 = j6.Oh;
            textView3.setTextColor(j6.v0(i11, f6Var));
            this.f50478x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f50478x.setOnClickListener(new View.OnClickListener(this) {
                public final m2 f50262b;

                {
                    this.f50262b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            j5 j5Var = this.f50262b.f50472e;
                            if (j5Var != null) {
                                if (!j5Var.f52127e || j5Var.f52129g != 783) {
                                    j5Var.f52129g = 783;
                                    j5Var.f52127e = true;
                                    j5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f50262b.f50469a.a();
                            return;
                    }
                }
            });
            this.f50478x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f50478x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var)), 4, 4));
            z5.a(this.f50478x);
            this.v.addView(this.f50478x, x5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f50476s, x5.e(-1, -1, 119));
            h2Var.setEmptyView(this.f50476s);
            return;
        }
        this.f50476s = null;
        this.f50477w = null;
        this.f50478x = null;
        this.v = null;
        this.f50479y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f50479y.addView(this.E, x5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(j6.v0(j6.G6, f6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(j6.v0(j6.f21070y6, f6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, x5.t(-2, -2, 1, 0, 10, 0, 0));
        di.d dVar = new di.d(getContext(), f6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, x5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final m2 f50262b;

            {
                this.f50262b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        j5 j5Var = this.f50262b.f50472e;
                        if (j5Var != null) {
                            if (!j5Var.f52127e || j5Var.f52129g != 783) {
                                j5Var.f52129g = 783;
                                j5Var.f52127e = true;
                                j5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f50262b.f50469a.a();
                        return;
                }
            }
        });
        addView(this.f50479y, x5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        h2Var.setEmptyView(this.f50479y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(nr0Var.f50548e.h() ? 0 : 8);
        }
    }

    public static void d(m2 m2Var, boolean z10) {
        m2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        h2 h2Var;
        if (this.f50474n != z10) {
            this.f50474n = z10;
            nr0 nr0Var = this.f50469a;
            nr0Var.p(nr0Var.g());
            int i10 = 0;
            while (true) {
                h2Var = this.f50473f;
                if (i10 >= h2Var.getChildCount()) {
                    break;
                }
                View childAt = h2Var.getChildAt(i10);
                if (childAt instanceof h1) {
                    ((h1) childAt).d(z10, true);
                }
                i10++;
            }
            v51 v51Var = h2Var.Y2;
            if (v51Var != null) {
                v51Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50472e) {
            f(true);
            if (this.f50472e != null && isAttachedToWindow()) {
                h2 h2Var = this.f50473f;
                if (h2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < h2Var.getChildCount(); i12++) {
                        if (!(h2Var.getChildAt(i12) instanceof t00)) {
                        }
                    }
                    return;
                }
                this.f50472e.a();
            }
        }
    }

    public final void e() {
        if (!this.f50474n) {
            return;
        }
        j5 j5Var = this.f50472e;
        if (j5Var != null) {
            j5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        v51 v51Var;
        h2 h2Var = this.f50473f;
        if (h2Var != null && (v51Var = h2Var.Y2) != null) {
            boolean canScrollVertically = h2Var.canScrollVertically(-1);
            v51Var.N(z10);
            if (!canScrollVertically) {
                h2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            h2 h2Var = this.f50473f;
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
        NotificationCenter.getInstance(this.f50470b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f50470b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f50475r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        h2 h2Var = this.f50473f;
        boolean canScrollVertically = h2Var.canScrollVertically(-1);
        h2Var.Y2.N(true);
        if (!canScrollVertically) {
            h2Var.u0(0);
        }
        this.f50469a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f50475r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f50476s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f50475r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f50479y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f50475r)) / 2.0f);
        }
    }
}
