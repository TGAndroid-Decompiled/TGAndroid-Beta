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
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yi0;
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
    public final or0 f46057a;
    public final int f46058b;
    public final f6 f46059c;
    public boolean d;
    public n5 e;
    public final i2 f46060f;
    public ah.o h;
    public boolean f46061n;
    public int f46062r;
    public final FrameLayout f46063s;
    public final LinearLayout v;
    public final TextView f46064w;
    public final TextView f46065x;
    public final FrameLayout f46066y;

    public n2(or0 or0Var, int i10, f6 f6Var) {
        super(or0Var.getContext());
        this.f46062r = AndroidUtilities.displaySize.y;
        Context context = or0Var.getContext();
        this.f46057a = or0Var;
        this.f46058b = i10;
        this.f46059c = f6Var;
        i2 i2Var = new i2(context, i10, new hi.a(this, 17), new h2(this), new h2(this), f6Var, or0Var);
        this.f46060f = i2Var;
        i2Var.Y2.f29851r = false;
        i2Var.setSelectorType(9);
        i2Var.setSelectorDrawableColor(0);
        i2Var.setPadding(AndroidUtilities.dp(9.0f), or0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        i2Var.setClipToPadding(false);
        i2Var.setClipChildren(false);
        addView(i2Var, x5.e(-1, -1, 119));
        i2Var.j(new ii.m3(9, this, or0Var));
        j2 j2Var = new j2(or0Var);
        j2Var.f42732m = false;
        j2Var.C = false;
        j2Var.o(qr.h);
        j2Var.n(350L);
        i2Var.setItemAnimator(j2Var);
        new s4.y(new k2(this, or0Var)).e(i2Var);
        View view = this.f46063s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f46066y;
        if (view2 != null) {
            removeView(view2);
        }
        if (or0Var.d == this.e) {
            this.f46066y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f46063s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f46063s.addView(this.v, x5.e(-2, -2, 17));
            u9 u9Var = new u9(getContext());
            u9Var.setImageDrawable(new yi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(u9Var, x5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f46064w = textView;
            textView.setTextSize(1, 17.0f);
            this.f46064w.setTypeface(AndroidUtilities.bold());
            this.f46064w.setTextColor(j6.v0(j6.G6, f6Var));
            this.f46064w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f46064w, x5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f46065x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f46065x;
            int i11 = j6.Oh;
            textView3.setTextColor(j6.v0(i11, f6Var));
            this.f46065x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f46065x.setOnClickListener(new View.OnClickListener(this) {
                public final n2 f45881b;

                {
                    this.f45881b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            n5 n5Var = this.f45881b.e;
                            if (n5Var != null) {
                                if (!n5Var.e || n5Var.f47517g != 783) {
                                    n5Var.f47517g = 783;
                                    n5Var.e = true;
                                    n5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f45881b.f46057a.a();
                            return;
                    }
                }
            });
            this.f46065x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f46065x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var)), 4, 4));
            z5.a(this.f46065x);
            this.v.addView(this.f46065x, x5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f46063s, x5.e(-1, -1, 119));
            i2Var.setEmptyView(this.f46063s);
            return;
        }
        this.f46063s = null;
        this.f46064w = null;
        this.f46065x = null;
        this.v = null;
        this.f46066y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f46066y.addView(this.E, x5.e(-2, -2, 17));
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
        this.G.setTextColor(j6.v0(j6.f19244y6, f6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, x5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), f6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, x5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final n2 f45881b;

            {
                this.f45881b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        n5 n5Var = this.f45881b.e;
                        if (n5Var != null) {
                            if (!n5Var.e || n5Var.f47517g != 783) {
                                n5Var.f47517g = 783;
                                n5Var.e = true;
                                n5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f45881b.f46057a.a();
                        return;
                }
            }
        });
        addView(this.f46066y, x5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        i2Var.setEmptyView(this.f46066y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(or0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(n2 n2Var, boolean z10) {
        n2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        i2 i2Var;
        if (this.f46061n != z10) {
            this.f46061n = z10;
            or0 or0Var = this.f46057a;
            or0Var.p(or0Var.g());
            int i10 = 0;
            while (true) {
                i2Var = this.f46060f;
                if (i10 >= i2Var.getChildCount()) {
                    break;
                }
                View childAt = i2Var.getChildAt(i10);
                if (childAt instanceof i1) {
                    ((i1) childAt).d(z10, true);
                }
                i10++;
            }
            x51 x51Var = i2Var.Y2;
            if (x51Var != null) {
                x51Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
                i2 i2Var = this.f46060f;
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
        if (!this.f46061n) {
            return;
        }
        n5 n5Var = this.e;
        if (n5Var != null) {
            n5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        x51 x51Var;
        i2 i2Var = this.f46060f;
        if (i2Var != null && (x51Var = i2Var.Y2) != null) {
            boolean canScrollVertically = i2Var.canScrollVertically(-1);
            x51Var.N(z10);
            if (!canScrollVertically) {
                i2Var.v0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            i2 i2Var = this.f46060f;
            if (i10 >= i2Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = i2Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (childAt instanceof i1) {
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
        NotificationCenter.getInstance(this.f46058b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46058b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f46062r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        i2 i2Var = this.f46060f;
        boolean canScrollVertically = i2Var.canScrollVertically(-1);
        i2Var.Y2.N(true);
        if (!canScrollVertically) {
            i2Var.v0(0);
        }
        this.f46057a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f46062r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f46063s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f46062r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f46066y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f46062r)) / 2.0f);
        }
    }
}
