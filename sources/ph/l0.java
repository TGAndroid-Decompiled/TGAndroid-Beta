package ph;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
public abstract class l0 extends LinearLayout implements ah.a, vd.j {
    public final c6 f45878a;
    public final FrameLayout f45879b;
    public TLRPC.TL_replyKeyboardMarkup f45880c;
    public i0 d;
    public int f45881e;
    public boolean f45882f;
    public int h;
    public final ArrayList f45883n;
    public final ScrollView f45884r;
    public int f45885s;
    public final GradientDrawable v;
    public int f45886w;
    public final vd.k f45887x;

    public l0(Context context, c6 c6Var) {
        super(context);
        this.f45883n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f45887x = new vd.k(this, jr.h, 320L);
        this.f45878a = c6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f45884r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45879b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(vd.k kVar) {
        Iterator it = this.f45887x.iterator();
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            float c3 = fVar.c();
            Object obj = fVar.f49514a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c3);
            ((k0) obj).setAlpha(c3);
            ((k0) obj).setScaleX(lerp);
            ((k0) obj).setScaleY(lerp);
        }
    }

    @Override
    public final void c(int i10) {
        if (this.f45885s == i10) {
            return;
        }
        this.f45885s = i10;
        ScrollView scrollView = this.f45884r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f45885s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = g6.l1(navigationBarThirdButtonsFactor, g6.v0(g6.He, this.f45878a));
            int i10 = this.f45886w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, g6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f45886w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f45885s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f45884r, g6.v0(g6.He, this.f45878a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45883n;
            if (i10 < arrayList.size()) {
                ((j0) arrayList.get(i10)).a();
                i10++;
            } else {
                invalidate();
                return;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f45880c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f45882f) {
            return this.f45881e;
        }
        return org.telegram.messenger.x3.D(4.0f, this.f45880c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: ph.l0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(i0 i0Var) {
        this.d = i0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.f45881e = i10;
        if (this.f45882f && (tL_replyKeyboardMarkup = this.f45880c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f45882f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (org.telegram.ui.b.z(4.0f, this.f45880c.rows.size() - 1, this.f45881e - AndroidUtilities.dp(16.0f)) / this.f45880c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f45887x.iterator();
            while (it.hasNext()) {
                vd.f fVar = (vd.f) it.next();
                int childCount = ((k0) fVar.f49514a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((k0) fVar.f49514a).getChildAt(i11);
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
    public final void d(float f9) {
    }
}
