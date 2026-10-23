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
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.va1;
public final class q extends HorizontalScrollView {
    public e8 f52543a;
    public c0 f52544b;
    public final va1 f52545c;
    public final Paint d;
    public int e;
    public float f52546f;
    public final k0 h;

    public q(k0 k0Var, Context context) {
        super(context);
        this.h = k0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f52546f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        va1 va1Var = new va1(this, context, 22);
        this.f52545c = va1Var;
        va1Var.setOrientation(0);
        va1Var.setGravity(16);
        va1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(va1Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i10, boolean z10) {
        if (i10 != this.e && i10 >= 0) {
            va1 va1Var = this.f52545c;
            if (i10 < va1Var.getChildCount()) {
                this.e = i10;
                if (!z10) {
                    this.f52546f = Float.NaN;
                }
                View childAt = va1Var.getChildAt(i10);
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
                va1Var.invalidate();
            }
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: zh.q.draw(android.graphics.Canvas):void");
    }

    public void setSections(ArrayList<o> arrayList) {
        TLRPC.Document document;
        va1 va1Var = this.f52545c;
        va1Var.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            o oVar = arrayList.get(i10);
            Context context = getContext();
            int i11 = oVar.f52530a;
            if (i11 == 2) {
                document = (TLRPC.Document) oVar.f52532c.get(0);
            } else {
                document = null;
            }
            p pVar = new p(this.h, context, i11, document);
            pVar.setOnClickListener(new n1(this, i10, 29));
            pVar.setContentDescription(oVar.f52531b);
            va1Var.addView(pVar, new LinearLayout.LayoutParams(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(30.0f)));
        }
        this.e = -1;
        this.f52546f = Float.NaN;
    }
}
