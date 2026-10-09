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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import w7.z5;
import yh.e5;
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final rs0 f51435a;
    public final int f51436b;
    public final e6 f51437c;
    public boolean d;
    public e5 f51438e;
    public final j2 f51439f;
    public ah.n h;
    public boolean f51440n;
    public int f51441r;
    public final FrameLayout f51442s;
    public final LinearLayout v;
    public final TextView f51443w;
    public final TextView f51444x;
    public final FrameLayout f51445y;

    public o2(rs0 rs0Var, int i10, e6 e6Var) {
        super(rs0Var.getContext());
        this.f51441r = AndroidUtilities.displaySize.y;
        Context context = rs0Var.getContext();
        this.f51435a = rs0Var;
        this.f51436b = i10;
        this.f51437c = e6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), e6Var, rs0Var);
        this.f51439f = j2Var;
        j2Var.W2.f25280r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), rs0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, x5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, rs0Var));
        k2 k2Var = new k2(rs0Var);
        k2Var.f47698m = false;
        k2Var.C = false;
        k2Var.o(hs.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.z(new l2(this, rs0Var)).e(j2Var);
        View view = this.f51442s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f51445y;
        if (view2 != null) {
            removeView(view2);
        }
        if (rs0Var.d == this.f51438e) {
            this.f51445y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f51442s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f51442s.addView(this.v, x5.e(-2, -2, 17));
            y9 y9Var = new y9(getContext());
            y9Var.setImageDrawable(new ck0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(y9Var, x5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f51443w = textView;
            textView.setTextSize(1, 17.0f);
            this.f51443w.setTypeface(AndroidUtilities.bold());
            this.f51443w.setTextColor(i6.w0(i6.G6, e6Var));
            this.f51443w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f51443w, x5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f51444x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f51444x;
            int i11 = i6.Oh;
            textView3.setTextColor(i6.w0(i11, e6Var));
            this.f51444x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f51444x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f51224b;

                {
                    this.f51224b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            e5 e5Var = this.f51224b.f51438e;
                            if (e5Var != null) {
                                if (!e5Var.f52436e || e5Var.f52438g != 783) {
                                    e5Var.f52438g = 783;
                                    e5Var.f52436e = true;
                                    e5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f51224b.f51435a.a();
                            return;
                    }
                }
            });
            this.f51444x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f51444x.setBackground(i6.Z(i6.m1(0.1f, i6.w0(i11, e6Var)), 4, 4));
            z5.a(this.f51444x);
            this.v.addView(this.f51444x, x5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f51442s, x5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f51442s);
            return;
        }
        this.f51442s = null;
        this.f51443w = null;
        this.f51444x = null;
        this.v = null;
        this.f51445y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f51445y.addView(this.E, x5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(i6.w0(i6.G6, e6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(i6.w0(i6.f21181y6, e6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, x5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), e6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, x5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f51224b;

            {
                this.f51224b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        e5 e5Var = this.f51224b.f51438e;
                        if (e5Var != null) {
                            if (!e5Var.f52436e || e5Var.f52438g != 783) {
                                e5Var.f52438g = 783;
                                e5Var.f52436e = true;
                                e5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f51224b.f51435a.a();
                        return;
                }
            }
        });
        addView(this.f51445y, x5.a(-1.0f, 0.0f, -12.0f, 0.0f, 0.0f, -1, 119));
        j2Var.setEmptyView(this.f51445y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(rs0Var.f51514e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f51440n != z10) {
            this.f51440n = z10;
            rs0 rs0Var = this.f51435a;
            rs0Var.p(rs0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f51439f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof j1) {
                    ((j1) childAt).d(z10, true);
                }
                i10++;
            }
            c71 c71Var = j2Var.W2;
            if (c71Var != null) {
                c71Var.S();
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51438e) {
            f(true);
            if (this.f51438e != null && isAttachedToWindow()) {
                j2 j2Var = this.f51439f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof j10)) {
                        }
                    }
                    return;
                }
                this.f51438e.a();
            }
        }
    }

    public final void e() {
        if (!this.f51440n) {
            return;
        }
        e5 e5Var = this.f51438e;
        if (e5Var != null) {
            e5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        c71 c71Var;
        j2 j2Var = this.f51439f;
        if (j2Var != null && (c71Var = j2Var.W2) != null) {
            boolean canScrollVertically = j2Var.canScrollVertically(-1);
            c71Var.N(z10);
            if (!canScrollVertically) {
                j2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f51439f;
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
        NotificationCenter.getInstance(this.f51436b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f51436b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f51441r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f51439f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.W2.N(true);
        if (!canScrollVertically) {
            j2Var.u0(0);
        }
        this.f51435a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f51441r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f51442s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f51441r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f51445y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f51441r)) / 2.0f);
        }
    }
}
