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
public final class zp0 extends FrameLayout {
    public int E;
    public kp0 F;
    public ch.d G;
    public ch.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final aq0 L;
    public final o60 f45033a;
    public final s4.d0 f45034b;
    public final v7 f45035c;
    public int d;
    public final org.telegram.ui.Components.g6 f45036e;
    public final ArrayList f45037f;
    public mp0 h;
    public final RectF f45038n;
    public final RectF f45039r;
    public final RectF f45040s;
    public final Paint v;
    public final Paint f45041w;
    public int f45042x;
    public int f45043y;

    public zp0(aq0 aq0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.L = aq0Var;
        this.f45037f = new ArrayList();
        this.f45038n = new RectF();
        this.f45039r = new RectF();
        this.f45040s = new RectF();
        this.v = new Paint(1);
        this.f45041w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        o60 o60Var = new o60(this, context, e6Var, 1);
        this.f45033a = o60Var;
        o60Var.setClipToPadding(false);
        o60Var.setClipChildren(false);
        o60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        o60Var.setOverScrollMode(2);
        o60Var.setHorizontalScrollBarEnabled(false);
        o60Var.setItemAnimator(null);
        s4.d0 d0Var = new s4.d0(0, false);
        this.f45034b = d0Var;
        o60Var.setLayoutManager(d0Var);
        v7 v7Var = new v7(this, 5);
        this.f45035c = v7Var;
        o60Var.setAdapter(v7Var);
        o60Var.setOnItemClickListener(new i(this, 20));
        addView(o60Var, w7.x5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f45036e = new org.telegram.ui.Components.g6(o60Var, 0L, 320L, org.telegram.ui.Components.hs.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.f45036e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f45037f;
        boolean isEmpty = arrayList.isEmpty();
        o60 o60Var = this.f45033a;
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
        View m10 = this.f45034b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f45043y;
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
