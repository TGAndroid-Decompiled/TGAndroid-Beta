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
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.ts0;
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
    public final ts0 f51522a;
    public final int f51523b;
    public final d6 f51524c;
    public boolean d;
    public f5 f51525e;
    public final j2 f51526f;
    public ah.n h;
    public boolean f51527n;
    public int f51528r;
    public final FrameLayout f51529s;
    public final LinearLayout v;
    public final TextView f51530w;
    public final TextView f51531x;
    public final FrameLayout f51532y;

    public o2(ts0 ts0Var, int i10, d6 d6Var) {
        super(ts0Var.getContext());
        this.f51528r = AndroidUtilities.displaySize.y;
        Context context = ts0Var.getContext();
        this.f51522a = ts0Var;
        this.f51523b = i10;
        this.f51524c = d6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), d6Var, ts0Var);
        this.f51526f = j2Var;
        j2Var.W2.f25890r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), ts0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, x5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, ts0Var));
        k2 k2Var = new k2(ts0Var);
        k2Var.f47788m = false;
        k2Var.C = false;
        k2Var.o(is.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.z(new l2(this, ts0Var)).e(j2Var);
        View view = this.f51529s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f51532y;
        if (view2 != null) {
            removeView(view2);
        }
        if (ts0Var.d == this.f51525e) {
            this.f51532y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f51529s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f51529s.addView(this.v, x5.e(-2, -2, 17));
            y9 y9Var = new y9(getContext());
            y9Var.setImageDrawable(new ek0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(y9Var, x5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f51530w = textView;
            textView.setTextSize(1, 17.0f);
            this.f51530w.setTypeface(AndroidUtilities.bold());
            this.f51530w.setTextColor(h6.w0(h6.G6, d6Var));
            this.f51530w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f51530w, x5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f51531x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f51531x;
            int i11 = h6.Oh;
            textView3.setTextColor(h6.w0(i11, d6Var));
            this.f51531x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f51531x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f51311b;

                {
                    this.f51311b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            f5 f5Var = this.f51311b.f51525e;
                            if (f5Var != null) {
                                if (!f5Var.f52600e || f5Var.f52602g != 783) {
                                    f5Var.f52602g = 783;
                                    f5Var.f52600e = true;
                                    f5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f51311b.f51522a.a();
                            return;
                    }
                }
            });
            this.f51531x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f51531x.setBackground(h6.Z(h6.m1(0.1f, h6.w0(i11, d6Var)), 4, 4));
            z5.a(this.f51531x);
            this.v.addView(this.f51531x, x5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f51529s, x5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f51529s);
            return;
        }
        this.f51529s = null;
        this.f51530w = null;
        this.f51531x = null;
        this.v = null;
        this.f51532y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f51532y.addView(this.E, x5.e(-2, -2, 17));
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
        this.G.setTextColor(h6.w0(h6.f21171y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, x5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, x5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f51311b;

            {
                this.f51311b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        f5 f5Var = this.f51311b.f51525e;
                        if (f5Var != null) {
                            if (!f5Var.f52600e || f5Var.f52602g != 783) {
                                f5Var.f52602g = 783;
                                f5Var.f52600e = true;
                                f5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f51311b.f51522a.a();
                        return;
                }
            }
        });
        addView(this.f51532y, x5.a(-1.0f, 0.0f, -12.0f, 0.0f, 0.0f, -1, 119));
        j2Var.setEmptyView(this.f51532y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(ts0Var.f51601e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f51527n != z10) {
            this.f51527n = z10;
            ts0 ts0Var = this.f51522a;
            ts0Var.p(ts0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f51526f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof j1) {
                    ((j1) childAt).d(z10, true);
                }
                i10++;
            }
            e71 e71Var = j2Var.W2;
            if (e71Var != null) {
                e71Var.S();
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51525e) {
            f(true);
            if (this.f51525e != null && isAttachedToWindow()) {
                j2 j2Var = this.f51526f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof k10)) {
                        }
                    }
                    return;
                }
                this.f51525e.a();
            }
        }
    }

    public final void e() {
        if (!this.f51527n) {
            return;
        }
        f5 f5Var = this.f51525e;
        if (f5Var != null) {
            f5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        e71 e71Var;
        j2 j2Var = this.f51526f;
        if (j2Var != null && (e71Var = j2Var.W2) != null) {
            boolean canScrollVertically = j2Var.canScrollVertically(-1);
            e71Var.N(z10);
            if (!canScrollVertically) {
                j2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f51526f;
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
        NotificationCenter.getInstance(this.f51523b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f51523b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f51528r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f51526f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.W2.N(true);
        if (!canScrollVertically) {
            j2Var.u0(0);
        }
        this.f51522a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f51528r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f51529s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f51528r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f51532y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f51528r)) / 2.0f);
        }
    }
}
