package zh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.p8;
import bi.t9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class m2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final TextView E;
    public final TextView F;
    public final fi.d G;
    public boolean H;
    public final ws0 f53201a;
    public final int f53202b;
    public final u6 f53203c;
    public boolean d;
    public t9 e;
    public final h2 f53204f;
    public boolean h;
    public int f53205n;
    public final FrameLayout f53206r;
    public final LinearLayout f53207s;
    public final TextView v;
    public final TextView f53208w;
    public final FrameLayout f53209x;
    public final LinearLayout f53210y;

    public m2(ws0 ws0Var, int i10, u6 u6Var) {
        super(ws0Var.getContext());
        this.f53205n = AndroidUtilities.displaySize.y;
        Context context = ws0Var.getContext();
        this.f53201a = ws0Var;
        this.f53202b = i10;
        this.f53203c = u6Var;
        h2 h2Var = new h2(context, i10, new q0(this, 1), new g2(this), new g2(this), u6Var, ws0Var);
        this.f53204f = h2Var;
        h2Var.f32504g3.f29878r = false;
        h2Var.setSelectorType(9);
        h2Var.setSelectorDrawableColor(0);
        h2Var.setClipToPadding(false);
        h2Var.setClipChildren(false);
        addView(h2Var, kb1.i(-1, -1, 119));
        g();
        h2Var.j(new ai.u0(10, this, ws0Var));
        i2 i2Var = new i2(ws0Var);
        i2Var.f47798m = false;
        i2Var.C = false;
        i2Var.o(ds.h);
        i2Var.n(350L);
        h2Var.setItemAnimator(i2Var);
        new s4.z(new j2(this, ws0Var)).h(h2Var);
        View view = this.f53206r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f53209x;
        if (view2 != null) {
            removeView(view2);
        }
        if (ws0Var.d == this.e) {
            this.f53209x = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.f53210y = null;
            this.f53206r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f53207s = linearLayout;
            linearLayout.setOrientation(1);
            this.f53206r.addView(this.f53207s, kb1.i(-2, -2, 17));
            y9 y9Var = new y9(getContext());
            y9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.f53207s.addView(y9Var, kb1.x(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 17.0f);
            this.v.setTypeface(AndroidUtilities.bold());
            f7.V(this.v, y6.G6, u6Var);
            this.v.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.f53207s.addView(this.v, kb1.x(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f53208w = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f53208w;
            int i11 = y6.Oh;
            f7.V(textView3, i11, u6Var);
            this.f53208w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f53208w.setOnClickListener(new View.OnClickListener(this) {
                public final m2 f53014b;

                {
                    this.f53014b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            t9 t9Var = this.f53014b.e;
                            if (t9Var != null) {
                                if (!t9Var.e || t9Var.f5467g != 783) {
                                    t9Var.f5467g = 783;
                                    t9Var.e = true;
                                    t9Var.j(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f53014b.f53201a.a();
                            return;
                    }
                }
            });
            this.f53208w.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            f7.R(this.f53208w, y6.Z(y6.o1(0.1f, y6.w0(i11, u6Var)), 4, 4), null, f7.L(0.1f, i11), u6Var);
            kb1.b(this.f53208w);
            this.f53207s.addView(this.f53208w, kb1.x(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f53206r, kb1.i(-1, -1, 119));
            h2Var.setEmptyView(this.f53206r);
            return;
        }
        this.f53206r = null;
        this.v = null;
        this.f53208w = null;
        this.f53207s = null;
        this.f53209x = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f53210y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f53209x.addView(this.f53210y, kb1.i(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.E = textView4;
        textView4.setTextSize(1, 20.0f);
        this.E.setTypeface(AndroidUtilities.bold());
        f7.V(this.E, y6.G6, u6Var);
        this.E.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.f53210y.addView(this.E, kb1.x(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.F = textView5;
        textView5.setTextSize(1, 14.0f);
        f7.V(this.F, y6.f23749y6, u6Var);
        this.F.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.f53210y.addView(this.F, kb1.x(-2, -2, 1, 0, 10, 0, 0));
        fi.d dVar = new fi.d(getContext(), u6Var, true);
        this.G = dVar;
        dVar.i(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.f53210y.addView(this.G, kb1.x(200, 44, 1, 0, 19, 0, 12));
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final m2 f53014b;

            {
                this.f53014b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        t9 t9Var = this.f53014b.e;
                        if (t9Var != null) {
                            if (!t9Var.e || t9Var.f5467g != 783) {
                                t9Var.f5467g = 783;
                                t9Var.e = true;
                                t9Var.j(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f53014b.f53201a.a();
                        return;
                }
            }
        });
        addView(this.f53209x, kb1.h(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        h2Var.setEmptyView(this.f53209x);
        LinearLayout linearLayout3 = this.f53210y;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(ws0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(m2 m2Var, boolean z10) {
        m2Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        h2 h2Var;
        if (this.h != z10) {
            this.h = z10;
            ws0 ws0Var = this.f53201a;
            ws0Var.q(ws0Var.g());
            int i10 = 0;
            while (true) {
                h2Var = this.f53204f;
                if (i10 >= h2Var.getChildCount()) {
                    break;
                }
                View childAt = h2Var.getChildAt(i10);
                if (childAt instanceof g1) {
                    ((g1) childAt).e(z10, true);
                }
                i10++;
            }
            k71 k71Var = h2Var.f32504g3;
            if (k71Var != null) {
                k71Var.T();
            }
            if (z10) {
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.O4(false);
                    AndroidUtilities.runOnUIThread(new p8(profileActivity, 2));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                h2 h2Var = this.f53204f;
                if (h2Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < h2Var.getChildCount(); i12++) {
                        if (!(h2Var.getChildAt(i12) instanceof c10)) {
                        }
                    }
                    return;
                }
                this.e.b();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.n();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        k71 k71Var;
        h2 h2Var = this.f53204f;
        if (h2Var != null && (k71Var = h2Var.f32504g3) != null) {
            boolean canScrollVertically = h2Var.canScrollVertically(-1);
            k71Var.O(z10);
            if (!canScrollVertically) {
                h2Var.v0(0);
            }
        }
    }

    public final void g() {
        boolean z10;
        ws0 ws0Var = this.f53201a;
        if (ws0Var.L == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setClipChildren(z10);
        h2 h2Var = this.f53204f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h2Var.getLayoutParams();
        int i10 = marginLayoutParams.topMargin;
        int i11 = -ws0Var.L;
        if (i10 != i11 || marginLayoutParams.bottomMargin != (-ws0Var.M)) {
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.bottomMargin = -ws0Var.M;
            h2Var.setLayoutParams(marginLayoutParams);
        }
        h2Var.setPadding(AndroidUtilities.dp(9.0f), ws0Var.L + ws0Var.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f) + ws0Var.M);
    }

    public float getTabsHeight() {
        h2 h2Var = this.f53204f;
        float y3 = h2Var.getY();
        for (int i10 = 0; i10 < h2Var.getChildCount(); i10++) {
            View childAt = h2Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof g1) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y3);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y3);
            }
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f53202b).addWeakObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f53202b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f53205n);
    }

    public void setHasTabs(boolean z10) {
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        h2 h2Var = this.f53204f;
        boolean canScrollVertically = h2Var.canScrollVertically(-1);
        h2Var.f32504g3.O(true);
        if (!canScrollVertically) {
            h2Var.v0(0);
        }
        this.f53201a.p();
    }

    public void setVisibleHeight(int i10) {
        this.f53205n = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.f53207s;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.f53207s.setScaleX(lerp);
            this.f53207s.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f53206r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f53205n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.f53210y;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.f53210y.setScaleX(lerp);
            this.f53210y.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f53209x;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f53205n)) / 2.0f);
        }
    }
}
