package zh;

import ai.n1;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qa1;
public final class q extends HorizontalScrollView {
    public org.telegram.ui.web.m f52069a;
    public c0 f52070b;
    public final qa1 f52071c;
    public final Paint d;
    public int e;
    public float f52072f;
    public final j0 h;

    public q(j0 j0Var, Context context) {
        super(context);
        this.h = j0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f52072f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        qa1 qa1Var = new qa1(this, context, 22);
        this.f52071c = qa1Var;
        qa1Var.setOrientation(0);
        qa1Var.setGravity(16);
        qa1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(qa1Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i10, boolean z10) {
        if (i10 != this.e && i10 >= 0) {
            qa1 qa1Var = this.f52071c;
            if (i10 < qa1Var.getChildCount()) {
                this.e = i10;
                if (!z10) {
                    this.f52072f = Float.NaN;
                }
                View childAt = qa1Var.getChildAt(i10);
                int left = childAt.getLeft() - AndroidUtilities.dp(30.0f);
                int dp = AndroidUtilities.dp(30.0f) + childAt.getRight();
                if (left < getScrollX()) {
                    if (z10) {
                        smoothScrollTo(left, 0);
                    } else {
                        scrollTo(left, 0);
                    }
                } else {
                    if (dp > getWidth() + getScrollX()) {
                        if (z10) {
                            smoothScrollTo(dp - getWidth(), 0);
                        } else {
                            scrollTo(dp - getWidth(), 0);
                        }
                    }
                }
                qa1Var.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: zh.q.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<o> arrayList) {
        TLRPC.Document document;
        qa1 qa1Var = this.f52071c;
        qa1Var.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            o oVar = arrayList.get(i10);
            Context context = getContext();
            int i11 = oVar.f52056a;
            if (i11 == 2) {
                document = (TLRPC.Document) oVar.f52058c.get(0);
            } else {
                document = null;
            }
            p pVar = new p(this.h, context, i11, document);
            pVar.setOnClickListener(new n1(this, i10, 29));
            pVar.setContentDescription(oVar.f52057b);
            qa1Var.addView(pVar, new LinearLayout.LayoutParams(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(30.0f)));
        }
        this.e = -1;
        this.f52072f = Float.NaN;
    }
}
