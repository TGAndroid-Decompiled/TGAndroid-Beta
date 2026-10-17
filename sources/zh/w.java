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
import org.telegram.ui.sa1;
public final class w extends HorizontalScrollView {
    public org.telegram.ui.web.c0 f52117a;
    public e0 f52118b;
    public final sa1 f52119c;
    public final Paint d;
    public int e;
    public float f52120f;
    public final k0 h;

    public w(k0 k0Var, Context context) {
        super(context);
        this.h = k0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f52120f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        sa1 sa1Var = new sa1(this, context, 22);
        this.f52119c = sa1Var;
        sa1Var.setOrientation(0);
        sa1Var.setGravity(16);
        sa1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(sa1Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i10, boolean z10) {
        if (i10 != this.e && i10 >= 0) {
            sa1 sa1Var = this.f52119c;
            if (i10 < sa1Var.getChildCount()) {
                this.e = i10;
                if (!z10) {
                    this.f52120f = Float.NaN;
                }
                View childAt = sa1Var.getChildAt(i10);
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
                        int width = dp - getWidth();
                        if (z10) {
                            smoothScrollTo(width, 0);
                        } else {
                            scrollTo(width, 0);
                        }
                    }
                }
                sa1Var.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: zh.w.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<u> arrayList) {
        TLRPC.Document document;
        sa1 sa1Var = this.f52119c;
        sa1Var.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u uVar = arrayList.get(i10);
            Context context = getContext();
            int i11 = uVar.f52105a;
            if (i11 == 2) {
                document = (TLRPC.Document) uVar.f52107c.get(0);
            } else {
                document = null;
            }
            v vVar = new v(this.h, context, i11, document);
            vVar.setOnClickListener(new n1(this, i10, 29));
            vVar.setContentDescription(uVar.f52106b);
            sa1Var.addView(vVar, new LinearLayout.LayoutParams(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(30.0f)));
        }
        this.e = -1;
        this.f52120f = Float.NaN;
    }
}
