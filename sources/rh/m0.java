package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
public abstract class m0 extends LinearLayout implements ch.a, xd.i {
    public final f6 f43605a;
    public final FrameLayout f43606b;
    public TLRPC.TL_replyKeyboardMarkup f43607c;
    public j0 d;
    public int e;
    public boolean f43608f;
    public int h;
    public final ArrayList f43609n;
    public final ScrollView f43610r;
    public int f43611s;
    public final GradientDrawable v;
    public int f43612w;
    public final xd.j f43613x;

    public m0(Context context, f6 f6Var) {
        super(context);
        this.f43609n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f43613x = new xd.j(this, nr.h, 320L);
        this.f43605a = f6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f43610r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43606b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i10) {
        if (this.f43611s == i10) {
            return;
        }
        this.f43611s = i10;
        ScrollView scrollView = this.f43610r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f43610r, j6.v0(j6.He, this.f43605a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f43609n;
            if (i10 < arrayList.size()) {
                ((k0) arrayList.get(i10)).a();
                i10++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f43611s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = j6.l1(navigationBarThirdButtonsFactor, j6.v0(j6.He, this.f43605a));
            int i10 = this.f43612w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f43612w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f43611s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void e(xd.j jVar) {
        Iterator it = this.f43613x.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            float c3 = eVar.c();
            Object obj = eVar.f46899a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c3);
            ((l0) obj).setAlpha(c3);
            ((l0) obj).setScaleX(lerp);
            ((l0) obj).setScaleY(lerp);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f43607c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f43608f) {
            return this.e;
        }
        return org.telegram.messenger.y3.D(4.0f, this.f43607c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: rh.m0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(j0 j0Var) {
        this.d = j0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i10;
        if (this.f43608f && (tL_replyKeyboardMarkup = this.f43607c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f43608f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (org.telegram.ui.b.z(4.0f, this.f43607c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f43607c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f43613x.iterator();
            while (it.hasNext()) {
                xd.e eVar = (xd.e) it.next();
                int childCount = ((l0) eVar.f46899a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((l0) eVar.f46899a).getChildAt(i11);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.height != dp) {
                        layoutParams.height = dp;
                        childAt.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c(float f10) {
    }
}
