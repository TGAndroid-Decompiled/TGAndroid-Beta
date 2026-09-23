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
public final class tp0 extends FrameLayout {
    public int E;
    public ep0 F;
    public ch.d G;
    public ch.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final up0 L;
    public final n60 f37731a;
    public final s4.c0 f37732b;
    public final w7 f37733c;
    public int d;
    public final org.telegram.ui.Components.e6 e;
    public final ArrayList f37734f;
    public gp0 h;
    public final RectF f37735n;
    public final RectF f37736r;
    public final RectF f37737s;
    public final Paint v;
    public final Paint f37738w;
    public int f37739x;
    public int f37740y;

    public tp0(up0 up0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.L = up0Var;
        this.f37734f = new ArrayList();
        this.f37735n = new RectF();
        this.f37736r = new RectF();
        this.f37737s = new RectF();
        this.v = new Paint(1);
        this.f37738w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        n60 n60Var = new n60(this, context, d6Var, 1);
        this.f37731a = n60Var;
        n60Var.setClipToPadding(false);
        n60Var.setClipChildren(false);
        n60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        n60Var.setOverScrollMode(2);
        n60Var.setHorizontalScrollBarEnabled(false);
        n60Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f37732b = c0Var;
        n60Var.setLayoutManager(c0Var);
        w7 w7Var = new w7(this, 5);
        this.f37733c = w7Var;
        n60Var.setAdapter(w7Var);
        n60Var.setOnItemClickListener(new i(this, 20));
        addView(n60Var, w7.x5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.e6(n60Var, 0L, 320L, org.telegram.ui.Components.rr.h);
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
        ArrayList arrayList = this.f37734f;
        boolean isEmpty = arrayList.isEmpty();
        n60 n60Var = this.f37731a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                n60Var.x0(clamp);
            } else {
                n60Var.u0(clamp);
            }
        }
        n60Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f37732b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f37740y;
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
