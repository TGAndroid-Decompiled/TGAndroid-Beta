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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.b6;
import w7.z5;
import yh.l5;
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final gs0 f50159a;
    public final int f50160b;
    public final d6 f50161c;
    public boolean d;
    public l5 f50162e;
    public final j2 f50163f;
    public ah.n h;
    public boolean f50164n;
    public int f50165r;
    public final FrameLayout f50166s;
    public final LinearLayout v;
    public final TextView f50167w;
    public final TextView f50168x;
    public final FrameLayout f50169y;

    public o2(gs0 gs0Var, int i10, d6 d6Var) {
        super(gs0Var.getContext());
        this.f50165r = AndroidUtilities.displaySize.y;
        Context context = gs0Var.getContext();
        this.f50159a = gs0Var;
        this.f50160b = i10;
        this.f50161c = d6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), d6Var, gs0Var);
        this.f50163f = j2Var;
        j2Var.f26034f3.f32531r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), gs0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, z5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, gs0Var));
        k2 k2Var = new k2(gs0Var);
        k2Var.f46577m = false;
        k2Var.C = false;
        k2Var.o(tr.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.y(new l2(this, gs0Var)).e(j2Var);
        View view = this.f50166s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f50169y;
        if (view2 != null) {
            removeView(view2);
        }
        if (gs0Var.d == this.f50162e) {
            this.f50169y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f50166s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f50166s.addView(this.v, z5.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, z5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f50167w = textView;
            textView.setTextSize(1, 17.0f);
            this.f50167w.setTypeface(AndroidUtilities.bold());
            this.f50167w.setTextColor(i6.v0(i6.G6, d6Var));
            this.f50167w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f50167w, z5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f50168x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f50168x;
            int i11 = i6.Oh;
            textView3.setTextColor(i6.v0(i11, d6Var));
            this.f50168x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f50168x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f49968b;

                {
                    this.f49968b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            l5 l5Var = this.f49968b.f50162e;
                            if (l5Var != null) {
                                if (!l5Var.f51584e || l5Var.f51586g != 783) {
                                    l5Var.f51586g = 783;
                                    l5Var.f51584e = true;
                                    l5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f49968b.f50159a.a();
                            return;
                    }
                }
            });
            this.f50168x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f50168x.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i11, d6Var)), 4, 4));
            b6.a(this.f50168x);
            this.v.addView(this.f50168x, z5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f50166s, z5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f50166s);
            return;
        }
        this.f50166s = null;
        this.f50167w = null;
        this.f50168x = null;
        this.v = null;
        this.f50169y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f50169y.addView(this.E, z5.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setTextColor(i6.v0(i6.G6, d6Var));
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.E.addView(this.F, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        this.G.setTextColor(i6.v0(i6.f21214y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, z5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, z5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f49968b;

            {
                this.f49968b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f49968b.f50162e;
                        if (l5Var != null) {
                            if (!l5Var.f51584e || l5Var.f51586g != 783) {
                                l5Var.f51586g = 783;
                                l5Var.f51584e = true;
                                l5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f49968b.f50159a.a();
                        return;
                }
            }
        });
        addView(this.f50169y, z5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        j2Var.setEmptyView(this.f50169y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(gs0Var.f50235e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f50164n != z10) {
            this.f50164n = z10;
            gs0 gs0Var = this.f50159a;
            gs0Var.p(gs0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f50163f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof i1) {
                    ((i1) childAt).d(z10, true);
                }
                i10++;
            }
            w61 w61Var = j2Var.f26034f3;
            if (w61Var != null) {
                w61Var.S();
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50162e) {
            f(true);
            if (this.f50162e != null && isAttachedToWindow()) {
                j2 j2Var = this.f50163f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof w00)) {
                        }
                    }
                    return;
                }
                this.f50162e.a();
            }
        }
    }

    public final void e() {
        if (!this.f50164n) {
            return;
        }
        l5 l5Var = this.f50162e;
        if (l5Var != null) {
            l5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        w61 w61Var;
        j2 j2Var = this.f50163f;
        if (j2Var != null && (w61Var = j2Var.f26034f3) != null) {
            boolean canScrollVertically = j2Var.canScrollVertically(-1);
            w61Var.N(z10);
            if (!canScrollVertically) {
                j2Var.v0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f50163f;
            if (i10 >= j2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = j2Var.getChildAt(i10);
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
        NotificationCenter.getInstance(this.f50160b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f50160b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f50165r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f50163f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.f26034f3.N(true);
        if (!canScrollVertically) {
            j2Var.v0(0);
        }
        this.f50159a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f50165r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f50166s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f50165r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f50169y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f50165r)) / 2.0f);
        }
    }
}
