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
public final class vp0 extends FrameLayout {
    public int E;
    public gp0 F;
    public ch.d G;
    public ch.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final p60 f41795a;
    public final s4.c0 f41796b;
    public final z7 f41797c;
    public int d;
    public final org.telegram.ui.Components.e6 f41798e;
    public final ArrayList f41799f;
    public ip0 h;
    public final RectF f41800n;
    public final RectF f41801r;
    public final RectF f41802s;
    public final Paint v;
    public final Paint f41803w;
    public int f41804x;
    public int f41805y;

    public vp0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f41799f = new ArrayList();
        this.f41800n = new RectF();
        this.f41801r = new RectF();
        this.f41802s = new RectF();
        this.v = new Paint(1);
        this.f41803w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        p60 p60Var = new p60(this, context, d6Var, 1);
        this.f41795a = p60Var;
        p60Var.setClipToPadding(false);
        p60Var.setClipChildren(false);
        p60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        p60Var.setOverScrollMode(2);
        p60Var.setHorizontalScrollBarEnabled(false);
        p60Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f41796b = c0Var;
        p60Var.setLayoutManager(c0Var);
        z7 z7Var = new z7(this, 5);
        this.f41797c = z7Var;
        p60Var.setAdapter(z7Var);
        p60Var.setOnItemClickListener(new i(this, 20));
        addView(p60Var, w7.z5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f41798e = new org.telegram.ui.Components.e6(p60Var, 0L, 320L, org.telegram.ui.Components.tr.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.f41798e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f41799f;
        boolean isEmpty = arrayList.isEmpty();
        p60 p60Var = this.f41795a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                p60Var.y0(clamp);
            } else {
                p60Var.v0(clamp);
            }
        }
        p60Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f41796b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f41805y;
            }
            textView.setTextColor(i11);
            m10.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ch.d dVar;
        yf.p.g(this.G, 0, 0, getWidth(), getHeight());
        yf.p.g(this.H, 0, 0, getWidth(), getHeight());
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
