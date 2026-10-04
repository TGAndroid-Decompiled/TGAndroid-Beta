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
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.b6;
import w7.z5;
import yh.k5;
public final class o2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public boolean I;
    public final fs0 f50152a;
    public final int f50153b;
    public final d6 f50154c;
    public boolean d;
    public k5 f50155e;
    public final j2 f50156f;
    public ah.n h;
    public boolean f50157n;
    public int f50158r;
    public final FrameLayout f50159s;
    public final LinearLayout v;
    public final TextView f50160w;
    public final TextView f50161x;
    public final FrameLayout f50162y;

    public o2(fs0 fs0Var, int i10, d6 d6Var) {
        super(fs0Var.getContext());
        this.f50158r = AndroidUtilities.displaySize.y;
        Context context = fs0Var.getContext();
        this.f50152a = fs0Var;
        this.f50153b = i10;
        this.f50154c = d6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), d6Var, fs0Var);
        this.f50156f = j2Var;
        j2Var.f25250f3.f31313r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), fs0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, z5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, fs0Var));
        k2 k2Var = new k2(fs0Var);
        k2Var.f46570m = false;
        k2Var.C = false;
        k2Var.o(tr.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.y(new l2(this, fs0Var)).e(j2Var);
        View view = this.f50159s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f50162y;
        if (view2 != null) {
            removeView(view2);
        }
        if (fs0Var.d == this.f50155e) {
            this.f50162y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f50159s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f50159s.addView(this.v, z5.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, z5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f50160w = textView;
            textView.setTextSize(1, 17.0f);
            this.f50160w.setTypeface(AndroidUtilities.bold());
            this.f50160w.setTextColor(i6.v0(i6.G6, d6Var));
            this.f50160w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f50160w, z5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f50161x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f50161x;
            int i11 = i6.Oh;
            textView3.setTextColor(i6.v0(i11, d6Var));
            this.f50161x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f50161x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f49961b;

                {
                    this.f49961b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            k5 k5Var = this.f49961b.f50155e;
                            if (k5Var != null) {
                                if (!k5Var.f51527e || k5Var.f51529g != 783) {
                                    k5Var.f51529g = 783;
                                    k5Var.f51527e = true;
                                    k5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f49961b.f50152a.a();
                            return;
                    }
                }
            });
            this.f50161x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f50161x.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i11, d6Var)), 4, 4));
            b6.a(this.f50161x);
            this.v.addView(this.f50161x, z5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f50159s, z5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f50159s);
            return;
        }
        this.f50159s = null;
        this.f50160w = null;
        this.f50161x = null;
        this.v = null;
        this.f50162y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f50162y.addView(this.E, z5.e(-2, -2, 17));
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
        this.G.setTextColor(i6.v0(i6.f21209y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, z5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, z5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f49961b;

            {
                this.f49961b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        k5 k5Var = this.f49961b.f50155e;
                        if (k5Var != null) {
                            if (!k5Var.f51527e || k5Var.f51529g != 783) {
                                k5Var.f51529g = 783;
                                k5Var.f51527e = true;
                                k5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f49961b.f50152a.a();
                        return;
                }
            }
        });
        addView(this.f50162y, z5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        j2Var.setEmptyView(this.f50162y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(fs0Var.f50228e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f50157n != z10) {
            this.f50157n = z10;
            fs0 fs0Var = this.f50152a;
            fs0Var.p(fs0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f50156f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof i1) {
                    ((i1) childAt).d(z10, true);
                }
                i10++;
            }
            u61 u61Var = j2Var.f25250f3;
            if (u61Var != null) {
                u61Var.S();
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50155e) {
            f(true);
            if (this.f50155e != null && isAttachedToWindow()) {
                j2 j2Var = this.f50156f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof w00)) {
                        }
                    }
                    return;
                }
                this.f50155e.a();
            }
        }
    }

    public final void e() {
        if (!this.f50157n) {
            return;
        }
        k5 k5Var = this.f50155e;
        if (k5Var != null) {
            k5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        u61 u61Var;
        j2 j2Var = this.f50156f;
        if (j2Var != null && (u61Var = j2Var.f25250f3) != null) {
            boolean canScrollVertically = j2Var.canScrollVertically(-1);
            u61Var.N(z10);
            if (!canScrollVertically) {
                j2Var.v0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            j2 j2Var = this.f50156f;
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
        NotificationCenter.getInstance(this.f50153b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f50153b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f50158r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f50156f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.f25250f3.N(true);
        if (!canScrollVertically) {
            j2Var.v0(0);
        }
        this.f50152a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f50158r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f50159s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f50158r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f50162y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f50158r)) / 2.0f);
        }
    }
}
