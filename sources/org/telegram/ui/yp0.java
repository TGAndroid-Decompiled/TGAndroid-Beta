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
public final class yp0 extends FrameLayout {
    public int E;
    public jp0 F;
    public ch.d G;
    public ch.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final zp0 L;
    public final o60 f44467a;
    public final s4.d0 f44468b;
    public final u7 f44469c;
    public int d;
    public final org.telegram.ui.Components.g6 f44470e;
    public final ArrayList f44471f;
    public lp0 h;
    public final RectF f44472n;
    public final RectF f44473r;
    public final RectF f44474s;
    public final Paint v;
    public final Paint f44475w;
    public int f44476x;
    public int f44477y;

    public yp0(zp0 zp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.L = zp0Var;
        this.f44471f = new ArrayList();
        this.f44472n = new RectF();
        this.f44473r = new RectF();
        this.f44474s = new RectF();
        this.v = new Paint(1);
        this.f44475w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        o60 o60Var = new o60(this, context, d6Var, 1);
        this.f44467a = o60Var;
        o60Var.setClipToPadding(false);
        o60Var.setClipChildren(false);
        o60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        o60Var.setOverScrollMode(2);
        o60Var.setHorizontalScrollBarEnabled(false);
        o60Var.setItemAnimator(null);
        s4.d0 d0Var = new s4.d0(0, false);
        this.f44468b = d0Var;
        o60Var.setLayoutManager(d0Var);
        u7 u7Var = new u7(this, 5);
        this.f44469c = u7Var;
        o60Var.setAdapter(u7Var);
        o60Var.setOnItemClickListener(new i(this, 20));
        addView(o60Var, w7.x5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f44470e = new org.telegram.ui.Components.g6(o60Var, 0L, 320L, org.telegram.ui.Components.is.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.f44470e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f44471f;
        boolean isEmpty = arrayList.isEmpty();
        o60 o60Var = this.f44467a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                o60Var.x0(clamp);
            } else {
                o60Var.u0(clamp);
            }
        }
        o60Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f44468b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f44477y;
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
