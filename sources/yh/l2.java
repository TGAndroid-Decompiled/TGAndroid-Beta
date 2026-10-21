package yh;

import ai.t8;
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
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.b6;
import w7.z5;
public final class l2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ei.d H;
    public boolean I;
    public final ks0 f50365a;
    public final int f50366b;
    public final d6 f50367c;
    public boolean d;
    public y9 e;
    public final g2 f50368f;
    public bh.l h;
    public boolean f50369n;
    public int f50370r;
    public final FrameLayout f50371s;
    public final LinearLayout v;
    public final TextView f50372w;
    public final TextView f50373x;
    public final FrameLayout f50374y;

    public l2(ks0 ks0Var, int i10, d6 d6Var) {
        super(ks0Var.getContext());
        this.f50370r = AndroidUtilities.displaySize.y;
        Context context = ks0Var.getContext();
        this.f50365a = ks0Var;
        this.f50366b = i10;
        this.f50367c = d6Var;
        g2 g2Var = new g2(context, i10, new hg.o(this, 28), new f2(this), new f2(this), d6Var, ks0Var);
        this.f50368f = g2Var;
        g2Var.W2.f30861r = false;
        g2Var.setSelectorType(9);
        g2Var.setSelectorDrawableColor(0);
        g2Var.setPadding(AndroidUtilities.dp(9.0f), ks0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        g2Var.setClipToPadding(false);
        g2Var.setClipChildren(false);
        addView(g2Var, z5.e(-1, -1, 119));
        g2Var.j(new ki.m3(9, this, ks0Var));
        h2 h2Var = new h2(ks0Var);
        h2Var.f45951m = false;
        h2Var.C = false;
        h2Var.o(bs.h);
        h2Var.n(350L);
        g2Var.setItemAnimator(h2Var);
        new s4.y(new i2(this, ks0Var)).d(g2Var);
        View view = this.f50371s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f50374y;
        if (view2 != null) {
            removeView(view2);
        }
        if (ks0Var.d == this.e) {
            this.f50374y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f50371s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f50371s.addView(this.v, z5.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new vj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, z5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f50372w = textView;
            textView.setTextSize(1, 17.0f);
            this.f50372w.setTypeface(AndroidUtilities.bold());
            this.f50372w.setTextColor(h6.w0(h6.G6, d6Var));
            this.f50372w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f50372w, z5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f50373x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f50373x;
            int i11 = h6.Oh;
            textView3.setTextColor(h6.w0(i11, d6Var));
            this.f50373x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f50373x.setOnClickListener(new View.OnClickListener(this) {
                public final l2 f50189b;

                {
                    this.f50189b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            y9 y9Var = this.f50189b.e;
                            if (y9Var != null) {
                                if (!y9Var.e || y9Var.f2500g != 783) {
                                    y9Var.f2500g = 783;
                                    y9Var.e = true;
                                    y9Var.j(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f50189b.f50365a.a();
                            return;
                    }
                }
            });
            this.f50373x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f50373x.setBackground(h6.Z(h6.m1(0.1f, h6.w0(i11, d6Var)), 4, 4));
            b6.a(this.f50373x);
            this.v.addView(this.f50373x, z5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f50371s, z5.e(-1, -1, 119));
            g2Var.setEmptyView(this.f50371s);
            return;
        }
        this.f50371s = null;
        this.f50372w = null;
        this.f50373x = null;
        this.v = null;
        this.f50374y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f50374y.addView(this.E, z5.e(-2, -2, 17));
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
        this.G.setTextColor(h6.w0(h6.f21378y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, z5.t(-2, -2, 1, 0, 10, 0, 0));
        ei.d dVar = new ei.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, z5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final l2 f50189b;

            {
                this.f50189b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        y9 y9Var = this.f50189b.e;
                        if (y9Var != null) {
                            if (!y9Var.e || y9Var.f2500g != 783) {
                                y9Var.f2500g = 783;
                                y9Var.e = true;
                                y9Var.j(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f50189b.f50365a.a();
                        return;
                }
            }
        });
        addView(this.f50374y, z5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        g2Var.setEmptyView(this.f50374y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(ks0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(l2 l2Var, boolean z10) {
        l2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        g2 g2Var;
        if (this.f50369n != z10) {
            this.f50369n = z10;
            ks0 ks0Var = this.f50365a;
            ks0Var.p(ks0Var.g());
            int i10 = 0;
            while (true) {
                g2Var = this.f50368f;
                if (i10 >= g2Var.getChildCount()) {
                    break;
                }
                View childAt = g2Var.getChildAt(i10);
                if (childAt instanceof g1) {
                    ((g1) childAt).d(z10, true);
                }
                i10++;
            }
            u61 u61Var = g2Var.W2;
            if (u61Var != null) {
                u61Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new t8(profileActivity, 2));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                g2 g2Var = this.f50368f;
                if (g2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < g2Var.getChildCount(); i12++) {
                        if (!(g2Var.getChildAt(i12) instanceof b10)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f50369n) {
            return;
        }
        y9 y9Var = this.e;
        if (y9Var != null) {
            y9Var.n();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        u61 u61Var;
        g2 g2Var = this.f50368f;
        if (g2Var != null && (u61Var = g2Var.W2) != null) {
            boolean canScrollVertically = g2Var.canScrollVertically(-1);
            u61Var.N(z10);
            if (!canScrollVertically) {
                g2Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            g2 g2Var = this.f50368f;
            if (i10 >= g2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = g2Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof g1) {
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
        NotificationCenter.getInstance(this.f50366b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f50366b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f50370r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        g2 g2Var = this.f50368f;
        boolean canScrollVertically = g2Var.canScrollVertically(-1);
        g2Var.W2.N(true);
        if (!canScrollVertically) {
            g2Var.u0(0);
        }
        this.f50365a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f50370r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f50371s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f50370r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f50374y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f50370r)) / 2.0f);
        }
    }
}
