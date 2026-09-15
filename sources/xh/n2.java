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
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import w7.z5;
import yh.n5;
public final class n2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final nr0 f46034a;
    public final int f46035b;
    public final e6 f46036c;
    public boolean d;
    public n5 e;
    public final i2 f46037f;
    public ah.n h;
    public boolean f46038n;
    public int f46039r;
    public final FrameLayout f46040s;
    public final LinearLayout v;
    public final TextView f46041w;
    public final TextView f46042x;
    public final FrameLayout f46043y;

    public n2(nr0 nr0Var, int i10, e6 e6Var) {
        super(nr0Var.getContext());
        this.f46039r = AndroidUtilities.displaySize.y;
        Context context = nr0Var.getContext();
        this.f46034a = nr0Var;
        this.f46035b = i10;
        this.f46036c = e6Var;
        i2 i2Var = new i2(context, i10, new hi.a(this, 17), new h2(this), new h2(this), e6Var, nr0Var);
        this.f46037f = i2Var;
        i2Var.Y2.f29613r = false;
        i2Var.setSelectorType(9);
        i2Var.setSelectorDrawableColor(0);
        i2Var.setPadding(AndroidUtilities.dp(9.0f), nr0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        i2Var.setClipToPadding(false);
        i2Var.setClipChildren(false);
        addView(i2Var, x5.e(-1, -1, 119));
        i2Var.j(new ii.m3(9, this, nr0Var));
        j2 j2Var = new j2(nr0Var);
        j2Var.f42710m = false;
        j2Var.C = false;
        j2Var.o(qr.h);
        j2Var.n(350L);
        i2Var.setItemAnimator(j2Var);
        new s4.y(new k2(this, nr0Var)).e(i2Var);
        View view = this.f46040s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f46043y;
        if (view2 != null) {
            removeView(view2);
        }
        if (nr0Var.d == this.e) {
            this.f46043y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f46040s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f46040s.addView(this.v, x5.e(-2, -2, 17));
            u9 u9Var = new u9(getContext());
            u9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(u9Var, x5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f46041w = textView;
            textView.setTextSize(1, 17.0f);
            this.f46041w.setTypeface(AndroidUtilities.bold());
            this.f46041w.setTextColor(i6.v0(i6.G6, e6Var));
            this.f46041w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f46041w, x5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f46042x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f46042x;
            int i11 = i6.Oh;
            textView3.setTextColor(i6.v0(i11, e6Var));
            this.f46042x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f46042x.setOnClickListener(new View.OnClickListener(this) {
                public final n2 f45858b;

                {
                    this.f45858b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            n5 n5Var = this.f45858b.e;
                            if (n5Var != null) {
                                if (!n5Var.e || n5Var.f47494g != 783) {
                                    n5Var.f47494g = 783;
                                    n5Var.e = true;
                                    n5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f45858b.f46034a.a();
                            return;
                    }
                }
            });
            this.f46042x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f46042x.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i11, e6Var)), 4, 4));
            z5.a(this.f46042x);
            this.v.addView(this.f46042x, x5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f46040s, x5.e(-1, -1, 119));
            i2Var.setEmptyView(this.f46040s);
            return;
        }
        this.f46040s = null;
        this.f46041w = null;
        this.f46042x = null;
        this.v = null;
        this.f46043y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46043y.addView(this.E, x5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(i6.v0(i6.G6, e6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(i6.v0(i6.f19218y6, e6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, x5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), e6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, x5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final n2 f45858b;

            {
                this.f45858b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        n5 n5Var = this.f45858b.e;
                        if (n5Var != null) {
                            if (!n5Var.e || n5Var.f47494g != 783) {
                                n5Var.f47494g = 783;
                                n5Var.e = true;
                                n5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f45858b.f46034a.a();
                        return;
                }
            }
        });
        addView(this.f46043y, x5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        i2Var.setEmptyView(this.f46043y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(nr0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(n2 n2Var, boolean z10) {
        n2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        i2 i2Var;
        if (this.f46038n != z10) {
            this.f46038n = z10;
            nr0 nr0Var = this.f46034a;
            nr0Var.p(nr0Var.g());
            int i10 = 0;
            while (true) {
                i2Var = this.f46037f;
                if (i10 >= i2Var.getChildCount()) {
                    break;
                }
                View childAt = i2Var.getChildAt(i10);
                if (childAt instanceof i1) {
                    ((i1) childAt).d(z10, true);
                }
                i10++;
            }
            w51 w51Var = i2Var.Y2;
            if (w51Var != null) {
                w51Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new r1(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                i2 i2Var = this.f46037f;
                if (i2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < i2Var.getChildCount(); i12++) {
                        if (!(i2Var.getChildAt(i12) instanceof t00)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f46038n) {
            return;
        }
        n5 n5Var = this.e;
        if (n5Var != null) {
            n5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        w51 w51Var;
        i2 i2Var = this.f46037f;
        if (i2Var != null && (w51Var = i2Var.Y2) != null) {
            boolean canScrollVertically = i2Var.canScrollVertically(-1);
            w51Var.N(z10);
            if (!canScrollVertically) {
                i2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            i2 i2Var = this.f46037f;
            if (i10 >= i2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = i2Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof i1) {
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
        NotificationCenter.getInstance(this.f46035b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46035b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f46039r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        i2 i2Var = this.f46037f;
        boolean canScrollVertically = i2Var.canScrollVertically(-1);
        i2Var.Y2.N(true);
        if (!canScrollVertically) {
            i2Var.u0(0);
        }
        this.f46034a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f46039r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f46040s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f46039r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f46043y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f46039r)) / 2.0f);
        }
    }
}
