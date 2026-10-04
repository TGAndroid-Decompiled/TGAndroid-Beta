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
    public final fs0 f50143a;
    public final int f50144b;
    public final d6 f50145c;
    public boolean d;
    public k5 f50146e;
    public final j2 f50147f;
    public ah.n h;
    public boolean f50148n;
    public int f50149r;
    public final FrameLayout f50150s;
    public final LinearLayout v;
    public final TextView f50151w;
    public final TextView f50152x;
    public final FrameLayout f50153y;

    public o2(fs0 fs0Var, int i10, d6 d6Var) {
        super(fs0Var.getContext());
        this.f50149r = AndroidUtilities.displaySize.y;
        Context context = fs0Var.getContext();
        this.f50143a = fs0Var;
        this.f50144b = i10;
        this.f50145c = d6Var;
        j2 j2Var = new j2(context, i10, new hi.a(this, 17), new i2(this), new i2(this), d6Var, fs0Var);
        this.f50147f = j2Var;
        j2Var.f25244f3.f31306r = false;
        j2Var.setSelectorType(9);
        j2Var.setSelectorDrawableColor(0);
        j2Var.setPadding(AndroidUtilities.dp(9.0f), fs0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        j2Var.setClipToPadding(false);
        j2Var.setClipChildren(false);
        addView(j2Var, z5.e(-1, -1, 119));
        j2Var.j(new ii.n3(9, this, fs0Var));
        k2 k2Var = new k2(fs0Var);
        k2Var.f46562m = false;
        k2Var.C = false;
        k2Var.o(tr.h);
        k2Var.n(350L);
        j2Var.setItemAnimator(k2Var);
        new s4.y(new l2(this, fs0Var)).e(j2Var);
        View view = this.f50150s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f50153y;
        if (view2 != null) {
            removeView(view2);
        }
        if (fs0Var.d == this.f50146e) {
            this.f50153y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f50150s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f50150s.addView(this.v, z5.e(-2, -2, 17));
            w9 w9Var = new w9(getContext());
            w9Var.setImageDrawable(new kj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(w9Var, z5.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f50151w = textView;
            textView.setTextSize(1, 17.0f);
            this.f50151w.setTypeface(AndroidUtilities.bold());
            this.f50151w.setTextColor(i6.v0(i6.G6, d6Var));
            this.f50151w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f50151w, z5.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f50152x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f50152x;
            int i11 = i6.Oh;
            textView3.setTextColor(i6.v0(i11, d6Var));
            this.f50152x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f50152x.setOnClickListener(new View.OnClickListener(this) {
                public final o2 f49952b;

                {
                    this.f49952b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            k5 k5Var = this.f49952b.f50146e;
                            if (k5Var != null) {
                                if (!k5Var.f51521e || k5Var.f51523g != 783) {
                                    k5Var.f51523g = 783;
                                    k5Var.f51521e = true;
                                    k5Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f49952b.f50143a.a();
                            return;
                    }
                }
            });
            this.f50152x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f50152x.setBackground(i6.Y(i6.l1(0.1f, i6.v0(i11, d6Var)), 4, 4));
            b6.a(this.f50152x);
            this.v.addView(this.f50152x, z5.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f50150s, z5.e(-1, -1, 119));
            j2Var.setEmptyView(this.f50150s);
            return;
        }
        this.f50150s = null;
        this.f50151w = null;
        this.f50152x = null;
        this.v = null;
        this.f50153y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f50153y.addView(this.E, z5.e(-2, -2, 17));
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
        this.G.setTextColor(i6.v0(i6.f21204y6, d6Var));
        this.G.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.E.addView(this.G, z5.t(-2, -2, 1, 0, 10, 0, 0));
        ci.d dVar = new ci.d(getContext(), d6Var, true);
        this.H = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.E.addView(this.H, z5.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o2 f49952b;

            {
                this.f49952b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        k5 k5Var = this.f49952b.f50146e;
                        if (k5Var != null) {
                            if (!k5Var.f51521e || k5Var.f51523g != 783) {
                                k5Var.f51523g = 783;
                                k5Var.f51521e = true;
                                k5Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f49952b.f50143a.a();
                        return;
                }
            }
        });
        addView(this.f50153y, z5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        j2Var.setEmptyView(this.f50153y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(fs0Var.f50219e.h() ? 0 : 8);
        }
    }

    public static void d(o2 o2Var, boolean z10) {
        o2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        j2 j2Var;
        if (this.f50148n != z10) {
            this.f50148n = z10;
            fs0 fs0Var = this.f50143a;
            fs0Var.p(fs0Var.g());
            int i10 = 0;
            while (true) {
                j2Var = this.f50147f;
                if (i10 >= j2Var.getChildCount()) {
                    break;
                }
                View childAt = j2Var.getChildAt(i10);
                if (childAt instanceof i1) {
                    ((i1) childAt).d(z10, true);
                }
                i10++;
            }
            u61 u61Var = j2Var.f25244f3;
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50146e) {
            f(true);
            if (this.f50146e != null && isAttachedToWindow()) {
                j2 j2Var = this.f50147f;
                if (j2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < j2Var.getChildCount(); i12++) {
                        if (!(j2Var.getChildAt(i12) instanceof w00)) {
                        }
                    }
                    return;
                }
                this.f50146e.a();
            }
        }
    }

    public final void e() {
        if (!this.f50148n) {
            return;
        }
        k5 k5Var = this.f50146e;
        if (k5Var != null) {
            k5Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        u61 u61Var;
        j2 j2Var = this.f50147f;
        if (j2Var != null && (u61Var = j2Var.f25244f3) != null) {
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
            j2 j2Var = this.f50147f;
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
        NotificationCenter.getInstance(this.f50144b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f50144b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f50149r);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        j2 j2Var = this.f50147f;
        boolean canScrollVertically = j2Var.canScrollVertically(-1);
        j2Var.f25244f3.N(true);
        if (!canScrollVertically) {
            j2Var.v0(0);
        }
        this.f50143a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f50149r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f50150s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f50149r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.E.setScaleX(lerp);
            this.E.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f50153y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f50149r)) / 2.0f);
        }
    }
}
