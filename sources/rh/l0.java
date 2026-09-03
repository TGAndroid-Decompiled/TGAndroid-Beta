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
import org.telegram.ui.Components.mr;
public abstract class l0 extends LinearLayout implements ch.a, xd.i {
    public final f6 f43657a;
    public final FrameLayout f43658b;
    public TLRPC.TL_replyKeyboardMarkup f43659c;
    public i0 d;
    public int e;
    public boolean f43660f;
    public int h;
    public final ArrayList f43661n;
    public final ScrollView f43662r;
    public int f43663s;
    public final GradientDrawable v;
    public int f43664w;
    public final xd.j f43665x;

    public l0(Context context, f6 f6Var) {
        super(context);
        this.f43661n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f43665x = new xd.j(this, mr.h, 320L);
        this.f43657a = f6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f43662r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43658b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override
    public final void b(int i10) {
        if (this.f43663s == i10) {
            return;
        }
        this.f43663s = i10;
        ScrollView scrollView = this.f43662r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f43662r, j6.v0(j6.He, this.f43657a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f43661n;
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
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.f43663s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = j6.l1(navigationBarThirdButtonsFactor, j6.v0(j6.He, this.f43657a));
            int i10 = this.f43664w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.f43664w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f43663s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override
    public final void e(xd.j jVar) {
        Iterator it = this.f43665x.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            float c3 = eVar.c();
            Object obj = eVar.f46967a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c3);
            ((k0) obj).setAlpha(c3);
            ((k0) obj).setScaleX(lerp);
            ((k0) obj).setScaleY(lerp);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f43659c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f43660f) {
            return this.e;
        }
        return org.telegram.messenger.y3.D(4.0f, this.f43659c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: rh.l0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(i0 i0Var) {
        this.d = i0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i10;
        if (this.f43660f && (tL_replyKeyboardMarkup = this.f43659c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f43660f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (org.telegram.ui.b.z(4.0f, this.f43659c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.f43659c.rows.size()) / AndroidUtilities.density);
            }
            this.h = max;
            int dp = AndroidUtilities.dp(max);
            Iterator it = this.f43665x.iterator();
            while (it.hasNext()) {
                xd.e eVar = (xd.e) it.next();
                int childCount = ((k0) eVar.f46967a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((k0) eVar.f46967a).getChildAt(i11);
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
