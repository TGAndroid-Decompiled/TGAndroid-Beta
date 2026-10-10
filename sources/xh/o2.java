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
import yh.e5;
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final ss0 f51479a;
    public final int f51480b;
    public final e6 f51481c;
    public boolean d;
    public e5 f51482e;
    public final j2 f51483f;
    public ah.n h;
    public boolean f51484n;
    public int f51485r;
    public final FrameLayout f51486s;
    public final LinearLayout v;
    public final TextView f51487w;
    public final TextView f51488x;
    public final FrameLayout f51489y;

    public o2(ss0 ss0Var, int i10, e6 e6Var) {
        super(ss0Var.getContext());
        this.f51485r = AndroidUtilities.displaySize.y;
        Context context = ss0Var.getContext();
        this.f51479a = ss0Var;
        this.f51480b = i10;
        this.f51481c = e6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), e6Var, ss0Var);
        this.f51483f = j2Var;
        j2Var.W2.f25587r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), ss0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, x5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, ss0Var));
        k2 k2Var = new k2(ss0Var);
        k2Var.f47742m = false;
        k2Var.C = false;
        k2Var.o(is.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.z(new l2(this, ss0Var)).e(j2Var);
        View view = this.f51486s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f51489y;
        if (view2 != null) {
            removeView(view2);
        }
        if (ss0Var.d == this.f51482e) {
            this.f51489y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f51486s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f51486s.addView(this.v, x5.e(-2, -2, 17));
            y9 y9Var = new y9(getContext());
            y9Var.setImageDrawable(new dk0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(y9Var, x5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f51487w = textView;
            textView.setTextSize(1, 17.0f);
            this.f51487w.setTypeface(AndroidUtilities.bold());
            this.f51487w.setTextColor(i6.w0(i6.G6, e6Var));
            this.f51487w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f51487w, x5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f51488x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f51488x;
            int i11 = i6.Oh;
            textView3.setTextColor(i6.w0(i11, e6Var));
            this.f51488x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f51488x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f51268b;

                {
                    this.f51268b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            e5 e5Var = this.f51268b.f51482e;
                            if (e5Var != null) {
                                if (!e5Var.f52480e || e5Var.f52482g != 783) {
                                    e5Var.f52482g = 783;
                                    e5Var.f52480e = true;
                                    e5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f51268b.f51479a.a();
                            return;
                    }
                }
            });
            this.f51488x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f51488x.setBackground(i6.Z(i6.m1(0.1f, i6.w0(i11, e6Var)), 4, 4));
            z5.a(this.f51488x);
            this.v.addView(this.f51488x, x5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f51486s, x5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f51486s);
            return;
        }
        this.f51486s = null;
        this.f51487w = null;
        this.f51488x = null;
        this.v = null;
        this.f51489y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f51489y.addView(this.E, x5.e(-2, -2, 17));
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
        this.G.setTextColor(i6.w0(i6.f21185y6, e6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, x5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), e6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, x5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f51268b;

            {
                this.f51268b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        e5 e5Var = this.f51268b.f51482e;
                        if (e5Var != null) {
                            if (!e5Var.f52480e || e5Var.f52482g != 783) {
                                e5Var.f52482g = 783;
                                e5Var.f52480e = true;
                                e5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f51268b.f51479a.a();
                        return;
                }
            }
        });
        addView(this.f51489y, x5.a(-1.0f, 0.0f, -12.0f, 0.0f, 0.0f, -1, 119));
        j2Var.setEmptyView(this.f51489y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(ss0Var.f51558e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f51484n != z10) {
            this.f51484n = z10;
            ss0 ss0Var = this.f51479a;
            ss0Var.p(ss0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f51483f;
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51482e) {
            f(true);
            if (this.f51482e != null && isAttachedToWindow()) {
                j2 j2Var = this.f51483f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof k10)) {
                        }
                    }
                    return;
                }
                this.f51482e.a();
            }
        }
    }

    public final void e() {
        if (!this.f51484n) {
            return;
        }
        e5 e5Var = this.f51482e;
        if (e5Var != null) {
            e5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        d71 d71Var;
        j2 j2Var = this.f51483f;
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
            j2 j2Var = this.f51483f;
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
        NotificationCenter.getInstance(this.f51480b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f51480b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f51485r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f51483f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.W2.N(true);
        if (!canScrollVertically) {
            j2Var.u0(0);
        }
        this.f51479a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f51485r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f51486s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f51485r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f51489y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f51485r)) / 2.0f);
        }
    }
}
