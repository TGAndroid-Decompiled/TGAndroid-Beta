package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.a30;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
public abstract class j0 extends LinearLayout implements hh.a, fe.l {
    public final p6 f53833a;
    public final FrameLayout f53834b;
    public TLRPC.TL_replyKeyboardMarkup f53835c;
    public g0 d;
    public int e;
    public boolean f53836f;
    public int h;
    public final ArrayList f53837n;
    public final ScrollView f53838r;
    public int f53839s;
    public final GradientDrawable f53840w;
    public int f53841x;
    public final fe.m f53842y;

    public j0(Context context, p6 p6Var) {
        super(context);
        this.f53837n = new ArrayList();
        this.f53840w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.f53842y = new fe.m(this, gr.h, 320L);
        this.f53833a = p6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.f53838r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53834b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override
    public final void b(fe.m mVar) {
        Iterator it = this.f53842y.iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f7035a;
            float T1 = org.telegram.messenger.i0.T1(0.7f, 1.0f, c10);
            ((i0) obj).setAlpha(c10);
            ((i0) obj).setScaleX(T1);
            ((i0) obj).setScaleY(T1);
        }
    }

    @Override
    public final void c(int i10) {
        if (this.f53839s == i10) {
            return;
        }
        this.f53839s = i10;
        ScrollView scrollView = this.f53838r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float R0 = org.telegram.messenger.i0.R0(this.f53839s);
        if (R0 > 0.0f) {
            int r12 = t6.r1(R0, t6.w0(t6.f21286wf, this.f53833a));
            int i10 = this.f53841x;
            GradientDrawable gradientDrawable = this.f53840w;
            if (i10 != r12) {
                gradientDrawable.setColors(new int[]{r12, t6.r1(0.66f, r12), i0.b.o(r12, 0)});
                this.f53841x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.f53839s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        org.telegram.messenger.i0.y3(this.f53838r, t6.w0(t6.f21286wf, this.f53833a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53837n;
            if (i10 < arrayList.size()) {
                ((h0) arrayList.get(i10)).a();
                i10++;
            } else {
                invalidate();
                return;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.f53835c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f53836f) {
            return this.e;
        }
        return m5.D(4.0f, this.f53835c.rows.size() - 1, org.telegram.messenger.i0.L(16.0f) + (org.telegram.messenger.i0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    public void setButtons(org.telegram.tgnet.TLRPC.TL_replyKeyboardMarkup r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.j0.setButtons(org.telegram.tgnet.TLRPC$TL_replyKeyboardMarkup):void");
    }

    public void setDelegate(g0 g0Var) {
        this.d = g0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        int max;
        this.e = i10;
        if (this.f53836f && (tL_replyKeyboardMarkup = this.f53835c) != null && !tL_replyKeyboardMarkup.rows.isEmpty()) {
            if (!this.f53836f) {
                max = 44;
            } else {
                max = (int) Math.max(44.0f, (a30.A(4.0f, this.f53835c.rows.size() - 1, this.e - org.telegram.messenger.i0.L(16.0f)) / this.f53835c.rows.size()) / org.telegram.messenger.i0.f16171p);
            }
            this.h = max;
            int L = org.telegram.messenger.i0.L(max);
            Iterator it = this.f53842y.iterator();
            while (it.hasNext()) {
                fe.h hVar = (fe.h) it.next();
                int childCount = ((i0) hVar.f7035a).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((i0) hVar.f7035a).getChildAt(i11);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.height != L) {
                        layoutParams.height = L;
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
    public final void d(float f7) {
    }
}
