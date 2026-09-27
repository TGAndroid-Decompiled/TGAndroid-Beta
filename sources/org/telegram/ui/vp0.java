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
    public final wp0 L;
    public final o60 f38678a;
    public final s4.c0 f38679b;
    public final z7 f38680c;
    public int d;
    public final org.telegram.ui.Components.e6 e;
    public final ArrayList f38681f;
    public ip0 h;
    public final RectF f38682n;
    public final RectF f38683r;
    public final RectF f38684s;
    public final Paint v;
    public final Paint f38685w;
    public int f38686x;
    public int f38687y;

    public vp0(wp0 wp0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.L = wp0Var;
        this.f38681f = new ArrayList();
        this.f38682n = new RectF();
        this.f38683r = new RectF();
        this.f38684s = new RectF();
        this.v = new Paint(1);
        this.f38685w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        o60 o60Var = new o60(this, context, e6Var, 1);
        this.f38678a = o60Var;
        o60Var.setClipToPadding(false);
        o60Var.setClipChildren(false);
        o60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        o60Var.setOverScrollMode(2);
        o60Var.setHorizontalScrollBarEnabled(false);
        o60Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f38679b = c0Var;
        o60Var.setLayoutManager(c0Var);
        z7 z7Var = new z7(this, 5);
        this.f38680c = z7Var;
        o60Var.setAdapter(z7Var);
        o60Var.setOnItemClickListener(new i(this, 20));
        addView(o60Var, w7.y5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.e6(o60Var, 0L, 320L, org.telegram.ui.Components.sr.h);
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
        ArrayList arrayList = this.f38681f;
        boolean isEmpty = arrayList.isEmpty();
        o60 o60Var = this.f38678a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                o60Var.y0(clamp);
            } else {
                o60Var.v0(clamp);
            }
        }
        o60Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f38679b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f38687y;
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
