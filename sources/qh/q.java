package qh;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.u71;
public final class q extends HorizontalScrollView {
    public org.telegram.ui.web.k0 f45713a;
    public z f45714b;
    public final u71 f45715c;
    public final Paint d;
    public int e;
    public float f45716f;
    public final g0 h;

    public q(g0 g0Var, Context context) {
        super(context);
        this.h = g0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f45716f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        u71 u71Var = new u71(this, context, 21);
        this.f45715c = u71Var;
        u71Var.setOrientation(0);
        u71Var.setGravity(16);
        u71Var.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        addView(u71Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i10, boolean z10) {
        if (i10 != this.e && i10 >= 0) {
            u71 u71Var = this.f45715c;
            if (i10 < u71Var.getChildCount()) {
                this.e = i10;
                if (!z10) {
                    this.f45716f = Float.NaN;
                }
                View childAt = u71Var.getChildAt(i10);
                int left = childAt.getLeft() - org.telegram.messenger.i0.L(30.0f);
                int L = org.telegram.messenger.i0.L(30.0f) + childAt.getRight();
                if (left < getScrollX()) {
                    if (z10) {
                        smoothScrollTo(left, 0);
                    } else {
                        scrollTo(left, 0);
                    }
                } else {
                    if (L > getWidth() + getScrollX()) {
                        if (z10) {
                            smoothScrollTo(L - getWidth(), 0);
                        } else {
                            scrollTo(L - getWidth(), 0);
                        }
                    }
                }
                u71Var.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: qh.q.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<o> arrayList) {
        TLRPC.Document document;
        u71 u71Var = this.f45715c;
        u71Var.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            o oVar = arrayList.get(i10);
            Context context = getContext();
            int i11 = oVar.f45703a;
            if (i11 == 2) {
                document = (TLRPC.Document) oVar.f45705c.get(0);
            } else {
                document = null;
            }
            p pVar = new p(this.h, context, i11, document);
            pVar.setOnClickListener(new bh.f(this, i10, 28));
            pVar.setContentDescription(oVar.f45704b);
            u71Var.addView(pVar, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(30.0f)));
        }
        this.e = -1;
        this.f45716f = Float.NaN;
    }
}
