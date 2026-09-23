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
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import w7.z5;
import yh.l5;
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final nr0 f45999a;
    public final int f46000b;
    public final d6 f46001c;
    public boolean d;
    public l5 e;
    public final j2 f46002f;
    public ah.n h;
    public boolean f46003n;
    public int f46004r;
    public final FrameLayout f46005s;
    public final LinearLayout v;
    public final TextView f46006w;
    public final TextView f46007x;
    public final FrameLayout f46008y;

    public o2(nr0 nr0Var, int i10, d6 d6Var) {
        super(nr0Var.getContext());
        this.f46004r = AndroidUtilities.displaySize.y;
        Context context = nr0Var.getContext();
        this.f45999a = nr0Var;
        this.f46000b = i10;
        this.f46001c = d6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), d6Var, nr0Var);
        this.f46002f = j2Var;
        j2Var.Y2.f28662r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), nr0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, x5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, nr0Var));
        k2 k2Var = new k2(nr0Var);
        k2Var.f42662m = false;
        k2Var.C = false;
        k2Var.o(rr.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.y(new l2(this, nr0Var)).e(j2Var);
        View view = this.f46005s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f46008y;
        if (view2 != null) {
            removeView(view2);
        }
        if (nr0Var.d == this.e) {
            this.f46008y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f46005s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f46005s.addView(this.v, x5.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new yi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, x5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f46006w = textView;
            textView.setTextSize(1, 17.0f);
            this.f46006w.setTypeface(AndroidUtilities.bold());
            this.f46006w.setTextColor(h6.v0(h6.G6, d6Var));
            this.f46006w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f46006w, x5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f46007x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f46007x;
            int i11 = h6.Oh;
            textView3.setTextColor(h6.v0(i11, d6Var));
            this.f46007x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f46007x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f45819b;

                {
                    this.f45819b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            l5 l5Var = this.f45819b.e;
                            if (l5Var != null) {
                                if (!l5Var.e || l5Var.f47333g != 783) {
                                    l5Var.f47333g = 783;
                                    l5Var.e = true;
                                    l5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f45819b.f45999a.a();
                            return;
                    }
                }
            });
            this.f46007x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f46007x.setBackground(h6.Y(h6.l1(0.1f, h6.v0(i11, d6Var)), 4, 4));
            z5.a(this.f46007x);
            this.v.addView(this.f46007x, x5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f46005s, x5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f46005s);
            return;
        }
        this.f46005s = null;
        this.f46006w = null;
        this.f46007x = null;
        this.v = null;
        this.f46008y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46008y.addView(this.E, x5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(h6.v0(h6.G6, d6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(h6.v0(h6.f19170y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, x5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, x5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f45819b;

            {
                this.f45819b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f45819b.e;
                        if (l5Var != null) {
                            if (!l5Var.e || l5Var.f47333g != 783) {
                                l5Var.f47333g = 783;
                                l5Var.e = true;
                                l5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f45819b.f45999a.a();
                        return;
                }
            }
        });
        addView(this.f46008y, x5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        j2Var.setEmptyView(this.f46008y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(nr0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f46003n != z10) {
            this.f46003n = z10;
            nr0 nr0Var = this.f45999a;
            nr0Var.p(nr0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f46002f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof j1) {
                    ((j1) childAt).d(z10, true);
                }
                i10++;
            }
            v51 v51Var = j2Var.Y2;
            if (v51Var != null) {
                v51Var.S();
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
                j2 j2Var = this.f46002f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof u00)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f46003n) {
            return;
        }
        l5 l5Var = this.e;
        if (l5Var != null) {
            l5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        v51 v51Var;
        j2 j2Var = this.f46002f;
        if (j2Var != null && (v51Var = j2Var.Y2) != null) {
            boolean canScrollVertically = j2Var.canScrollVertically(-1);
            v51Var.N(z10);
            if (!canScrollVertically) {
                j2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f46002f;
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
        NotificationCenter.getInstance(this.f46000b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46000b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f46004r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f46002f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.Y2.N(true);
        if (!canScrollVertically) {
            j2Var.u0(0);
        }
        this.f45999a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f46004r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f46005s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f46004r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f46008y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f46004r)) / 2.0f);
        }
    }
}
