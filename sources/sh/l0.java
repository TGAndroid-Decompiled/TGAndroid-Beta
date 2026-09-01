package sh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
public abstract class l0 extends LinearLayout implements dh.a, xd.i {
    public final g6 f47503a;
    public final FrameLayout f47504b;
    public TLRPC.TL_replyKeyboardMarkup f47505c;
    public i0 d;
    public int f47506e;
    public boolean f47507f;
    public int h;
    public final ArrayList f47508n;
    public final ScrollView f47509r;
    public int f47510s;
    public final GradientDrawable v;
    public int f47511w;
    public final xd.j f47512x;

    public l0(Context context, g6 g6Var) {
        super(context);
        this.f47508n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f47512x = new xd.j(this, pr.h, 320L);
        this.f47503a = g6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f47509r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47504b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i10) {
        if (this.f47510s == i10) {
            return;
        }
        this.f47510s = i10;
        ScrollView scrollView = this.f47509r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f47509r, k6.v0(k6.He, this.f47503a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47508n;
            if (i10 < arrayList.size()) {
                ((j0) arrayList.get(i10)).a();
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
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f47510s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = k6.l1(navigationBarThirdButtonsFactor, k6.v0(k6.He, this.f47503a));
            int i10 = this.f47511w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, k6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f47511w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f47510s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void e(xd.j jVar) {
        Iterator it = this.f47512x.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            float c3 = eVar.c();
            Object obj = eVar.f50513a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c3);
            ((k0) obj).setAlpha(c3);
            ((k0) obj).setScaleX(lerp);
            ((k0) obj).setScaleY(lerp);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f47505c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f47507f) {
            return this.f47506e;
        }
        return org.telegram.messenger.y3.D(4.0f, this.f47505c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: sh.l0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(i0 i0Var) {
        this.d = i0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.f47506e = i10;
        if (this.f47507f && (tL_replyKeyboardMarkup = this.f47505c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f47507f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (org.telegram.ui.b.z(4.0f, this.f47505c.rows.size() - 1, this.f47506e - AndroidUtilities.dp(16.0f)) / this.f47505c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f47512x.iterator();
            while (it.hasNext()) {
                xd.e eVar = (xd.e) it.next();
                int childCount = ((k0) eVar.f50513a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((k0) eVar.f50513a).getChildAt(i11);
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
