package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qp0 extends FrameLayout {
    public int E;
    public bp0 F;
    public eh.d G;
    public eh.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final k10 f42883a;
    public final s4.c0 f42884b;
    public final c8 f42885c;
    public int d;
    public final org.telegram.ui.Components.h6 e;
    public final ArrayList f42886f;
    public dp0 h;
    public final RectF f42887n;
    public final RectF f42888r;
    public final RectF f42889s;
    public final Paint v;
    public final Paint f42890w;
    public int f42891x;
    public int f42892y;

    public qp0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f42886f = new ArrayList();
        this.f42887n = new RectF();
        this.f42888r = new RectF();
        this.f42889s = new RectF();
        this.v = new Paint(1);
        this.f42890w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        k10 k10Var = new k10(this, context, u6Var, 2);
        this.f42883a = k10Var;
        k10Var.setClipToPadding(false);
        k10Var.setClipChildren(false);
        k10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        k10Var.setOverScrollMode(2);
        k10Var.setHorizontalScrollBarEnabled(false);
        k10Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f42884b = c0Var;
        k10Var.setLayoutManager(c0Var);
        c8 c8Var = new c8(this, 5);
        this.f42885c = c8Var;
        k10Var.setAdapter(c8Var);
        k10Var.setOnItemClickListener(new h(this, 21));
        addView(k10Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.h6(k10Var, 0L, 320L, org.telegram.ui.Components.ds.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f42886f;
        boolean isEmpty = arrayList.isEmpty();
        k10 k10Var = this.f42883a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                k10Var.y0(clamp);
            } else {
                k10Var.v0(clamp);
            }
        }
        k10Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f42884b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f42892y;
            }
            textView.setTextColor(i11);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        eh.d dVar;
        ag.v.g(this.G, 0, 0, getWidth(), getHeight());
        ag.v.g(this.H, 0, 0, getWidth(), getHeight());
        if (this.I) {
            dVar = this.H;
        } else {
            dVar = this.G;
        }
        dVar.draw(canvas);
        canvas.save();
        canvas.clipPath(this.J);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(3.0f);
        Path path = this.J;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(f7, f7, i10 - dp, i11 - dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp, Path.Direction.CW);
    }
}
