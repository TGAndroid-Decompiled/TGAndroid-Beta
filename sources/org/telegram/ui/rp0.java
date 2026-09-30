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
public final class rp0 extends FrameLayout {
    public int E;
    public cp0 F;
    public ch.d G;
    public ch.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final sp0 L;
    public final l60 f37529a;
    public final s4.c0 f37530b;
    public final w7 f37531c;
    public int d;
    public final org.telegram.ui.Components.e6 e;
    public final ArrayList f37532f;
    public ep0 h;
    public final RectF f37533n;
    public final RectF f37534r;
    public final RectF f37535s;
    public final Paint v;
    public final Paint f37536w;
    public int f37537x;
    public int f37538y;

    public rp0(sp0 sp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.L = sp0Var;
        this.f37532f = new ArrayList();
        this.f37533n = new RectF();
        this.f37534r = new RectF();
        this.f37535s = new RectF();
        this.v = new Paint(1);
        this.f37536w = new Paint(1);
        this.J = new Path();
        this.K = Integer.MIN_VALUE;
        l60 l60Var = new l60(this, context, d6Var, 1);
        this.f37529a = l60Var;
        l60Var.setClipToPadding(false);
        l60Var.setClipChildren(false);
        l60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        l60Var.setOverScrollMode(2);
        l60Var.setHorizontalScrollBarEnabled(false);
        l60Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.f37530b = c0Var;
        l60Var.setLayoutManager(c0Var);
        w7 w7Var = new w7(this, 5);
        this.f37531c = w7Var;
        l60Var.setAdapter(w7Var);
        l60Var.setOnItemClickListener(new i(this, 20));
        addView(l60Var, w7.y5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.e6(l60Var, 0L, 320L, org.telegram.ui.Components.tr.h);
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
        ArrayList arrayList = this.f37532f;
        boolean isEmpty = arrayList.isEmpty();
        l60 l60Var = this.f37529a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                l60Var.y0(clamp);
            } else {
                l60Var.v0(clamp);
            }
        }
        l60Var.invalidate();
    }

    public final void b(int i10) {
        int i11;
        View m10 = this.f37530b.m(i10);
        if (m10 instanceof TextView) {
            TextView textView = (TextView) m10;
            if (i10 == this.d) {
                i11 = this.E;
            } else {
                i11 = this.f37538y;
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
