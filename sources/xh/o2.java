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
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.v9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.a6;
import w7.y5;
import yh.l5;
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final bs0 f46368a;
    public final int f46369b;
    public final f6 f46370c;
    public boolean d;
    public l5 e;
    public final j2 f46371f;
    public ah.o h;
    public boolean f46372n;
    public int f46373r;
    public final FrameLayout f46374s;
    public final LinearLayout v;
    public final TextView f46375w;
    public final TextView f46376x;
    public final FrameLayout f46377y;

    public o2(bs0 bs0Var, int i10, f6 f6Var) {
        super(bs0Var.getContext());
        this.f46373r = AndroidUtilities.displaySize.y;
        Context context = bs0Var.getContext();
        this.f46368a = bs0Var;
        this.f46369b = i10;
        this.f46370c = f6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), f6Var, bs0Var);
        this.f46371f = j2Var;
        j2Var.Y2.f26342r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), bs0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, y5.e(-1, -1, 119));
        j2Var.j(new ii.m3(9, this, bs0Var));
        k2 k2Var = new k2(bs0Var);
        k2Var.f43030m = false;
        k2Var.C = false;
        k2Var.o(qr.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.y(new l2(this, bs0Var)).e(j2Var);
        View view = this.f46374s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f46377y;
        if (view2 != null) {
            removeView(view2);
        }
        if (bs0Var.d == this.e) {
            this.f46377y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f46374s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f46374s.addView(this.v, y5.e(-2, -2, 17));
            v9 v9Var = new v9(getContext());
            v9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(v9Var, y5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f46375w = textView;
            textView.setTextSize(1, 17.0f);
            this.f46375w.setTypeface(AndroidUtilities.bold());
            this.f46375w.setTextColor(j6.v0(j6.G6, f6Var));
            this.f46375w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f46375w, y5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f46376x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f46376x;
            int i11 = j6.Oh;
            textView3.setTextColor(j6.v0(i11, f6Var));
            this.f46376x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f46376x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f46188b;

                {
                    this.f46188b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            l5 l5Var = this.f46188b.e;
                            if (l5Var != null) {
                                if (!l5Var.e || l5Var.f47707g != 783) {
                                    l5Var.f47707g = 783;
                                    l5Var.e = true;
                                    l5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f46188b.f46368a.a();
                            return;
                    }
                }
            });
            this.f46376x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f46376x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var)), 4, 4));
            a6.a(this.f46376x);
            this.v.addView(this.f46376x, y5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f46374s, y5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f46374s);
            return;
        }
        this.f46374s = null;
        this.f46375w = null;
        this.f46376x = null;
        this.v = null;
        this.f46377y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46377y.addView(this.E, y5.e(-2, -2, 17));
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
        this.G.setTextColor(j6.v0(j6.f19492y6, f6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, y5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), f6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, y5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f46188b;

            {
                this.f46188b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f46188b.e;
                        if (l5Var != null) {
                            if (!l5Var.e || l5Var.f47707g != 783) {
                                l5Var.f47707g = 783;
                                l5Var.e = true;
                                l5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f46188b.f46368a.a();
                        return;
                }
            }
        });
        addView(this.f46377y, y5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        j2Var.setEmptyView(this.f46377y);
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
        if (this.f46372n != z10) {
            this.f46372n = z10;
            bs0 bs0Var = this.f46368a;
            bs0Var.p(bs0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f46371f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof j1) {
                    ((j1) childAt).d(z10, true);
                }
                i10++;
            }
            m61 m61Var = j2Var.Y2;
            if (m61Var != null) {
                m61Var.S();
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
                j2 j2Var = this.f46371f;
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
        if (!this.f46372n) {
            return;
        }
        l5 l5Var = this.e;
        if (l5Var != null) {
            l5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        m61 m61Var;
        j2 j2Var = this.f46371f;
        if (j2Var != null && (m61Var = j2Var.Y2) != null) {
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
            j2 j2Var = this.f46371f;
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
        NotificationCenter.getInstance(this.f46369b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46369b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f46373r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f46371f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.Y2.N(true);
        if (!canScrollVertically) {
            j2Var.v0(0);
        }
        this.f46368a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f46373r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f46374s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f46373r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f46377y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f46373r)) / 2.0f);
        }
    }
}
