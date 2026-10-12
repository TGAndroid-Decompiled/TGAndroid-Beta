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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.w5;
import w7.y5;
import yh.f5;
public final class n2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final xs0 f51630a;
    public final int f51631b;
    public final c6 f51632c;
    public boolean d;
    public f5 f51633e;
    public final i2 f51634f;
    public ah.n h;
    public boolean f51635n;
    public int f51636r;
    public final FrameLayout f51637s;
    public final LinearLayout v;
    public final TextView f51638w;
    public final TextView f51639x;
    public final FrameLayout f51640y;

    public n2(xs0 xs0Var, int i10, c6 c6Var) {
        super(xs0Var.getContext());
        this.f51636r = AndroidUtilities.displaySize.y;
        Context context = xs0Var.getContext();
        this.f51630a = xs0Var;
        this.f51631b = i10;
        this.f51632c = c6Var;
        i2 i2Var = new i2(context, i10, new hi.a(this, 17), new h2(this), new h2(this), c6Var, xs0Var);
        this.f51634f = i2Var;
        i2Var.W2.f26679r = false;
        i2Var.setSelectorType(9);
        i2Var.setSelectorDrawableColor(0);
        i2Var.setPadding(AndroidUtilities.dp(9.0f), xs0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        i2Var.setClipToPadding(false);
        i2Var.setClipChildren(false);
        addView(i2Var, w5.e(-1, -1, 119));
        i2Var.j(new ii.n3(9, this, xs0Var));
        j2 j2Var = new j2(xs0Var);
        j2Var.f47937m = false;
        j2Var.C = false;
        j2Var.o(js.h);
        j2Var.n(350L);
        i2Var.setItemAnimator(j2Var);
        new s4.z(new k2(this, xs0Var)).e(i2Var);
        View view = this.f51637s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f51640y;
        if (view2 != null) {
            removeView(view2);
        }
        if (xs0Var.d == this.f51633e) {
            this.f51640y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f51637s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f51637s.addView(this.v, w5.e(-2, -2, 17));
            y9 y9Var = new y9(getContext());
            y9Var.setImageDrawable(new fk0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(y9Var, w5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f51638w = textView;
            textView.setTextSize(1, 17.0f);
            this.f51638w.setTypeface(AndroidUtilities.bold());
            this.f51638w.setTextColor(h6.w0(h6.G6, c6Var));
            this.f51638w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f51638w, w5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f51639x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f51639x;
            int i11 = h6.Oh;
            textView3.setTextColor(h6.w0(i11, c6Var));
            this.f51639x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f51639x.setOnClickListener(new View.OnClickListener(this) {
                public final n2 f51444b;

                {
                    this.f51444b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            f5 f5Var = this.f51444b.f51633e;
                            if (f5Var != null) {
                                if (!f5Var.f52749e || f5Var.f52751g != 783) {
                                    f5Var.f52751g = 783;
                                    f5Var.f52749e = true;
                                    f5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f51444b.f51630a.a();
                            return;
                    }
                }
            });
            this.f51639x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f51639x.setBackground(h6.Z(h6.m1(0.1f, h6.w0(i11, c6Var)), 4, 4));
            y5.a(this.f51639x);
            this.v.addView(this.f51639x, w5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f51637s, w5.e(-1, -1, 119));
            i2Var.setEmptyView(this.f51637s);
            return;
        }
        this.f51637s = null;
        this.f51638w = null;
        this.f51639x = null;
        this.v = null;
        this.f51640y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f51640y.addView(this.E, w5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(h6.w0(h6.G6, c6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, w5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(h6.w0(h6.f20946y6, c6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, w5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), c6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, w5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final n2 f51444b;

            {
                this.f51444b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        f5 f5Var = this.f51444b.f51633e;
                        if (f5Var != null) {
                            if (!f5Var.f52749e || f5Var.f52751g != 783) {
                                f5Var.f52751g = 783;
                                f5Var.f52749e = true;
                                f5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f51444b.f51630a.a();
                        return;
                }
            }
        });
        addView(this.f51640y, w5.a(-1.0f, 0.0f, -12.0f, 0.0f, 0.0f, -1, 119));
        i2Var.setEmptyView(this.f51640y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(xs0Var.f51732e.h() ? 0 : 8);
        }
    }

    public static void d(n2 n2Var, boolean z10) {
        n2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        i2 i2Var;
        if (this.f51635n != z10) {
            this.f51635n = z10;
            xs0 xs0Var = this.f51630a;
            xs0Var.p(xs0Var.g());
            int i10 = 0;
            while (true) {
                i2Var = this.f51634f;
                if (i10 >= i2Var.getChildCount()) {
                    break;
                }
                View childAt = i2Var.getChildAt(i10);
                if (childAt instanceof i1) {
                    ((i1) childAt).d(z10, true);
                }
                i10++;
            }
            h71 h71Var = i2Var.W2;
            if (h71Var != null) {
                h71Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51633e) {
            f(true);
            if (this.f51633e != null && isAttachedToWindow()) {
                i2 i2Var = this.f51634f;
                if (i2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < i2Var.getChildCount(); i12++) {
                        if (!(i2Var.getChildAt(i12) instanceof m10)) {
                        }
                    }
                    return;
                }
                this.f51633e.a();
            }
        }
    }

    public final void e() {
        if (!this.f51635n) {
            return;
        }
        f5 f5Var = this.f51633e;
        if (f5Var != null) {
            f5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        h71 h71Var;
        i2 i2Var = this.f51634f;
        if (i2Var != null && (h71Var = i2Var.W2) != null) {
            boolean canScrollVertically = i2Var.canScrollVertically(-1);
            h71Var.N(z10);
            if (!canScrollVertically) {
                i2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            i2 i2Var = this.f51634f;
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
        NotificationCenter.getInstance(this.f51631b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f51631b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f51636r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        i2 i2Var = this.f51634f;
        boolean canScrollVertically = i2Var.canScrollVertically(-1);
        i2Var.W2.N(true);
        if (!canScrollVertically) {
            i2Var.u0(0);
        }
        this.f51630a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f51636r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f51637s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f51636r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f51640y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f51636r)) / 2.0f);
        }
    }
}
