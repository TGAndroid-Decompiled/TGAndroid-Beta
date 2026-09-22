package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.cc1;
import w7.x5;
public final class p1 extends FrameLayout {
    public final cc1 f46058a;
    public int f46059b;
    public final c6 f46060c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f46061f;
    public final RectF h;
    public final Paint f46062n;
    public int f46063r;

    public p1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f46061f = new RectF();
        this.h = new RectF();
        this.f46062n = new Paint(1);
        this.f46063r = Integer.MIN_VALUE;
        cc1 cc1Var = new cc1(this, context, 18);
        this.f46058a = cc1Var;
        cc1Var.setClipToPadding(false);
        cc1Var.setClipChildren(false);
        cc1Var.setOrientation(0);
        cc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(cc1Var, x5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f46060c = new c6(cc1Var, 0L, 320L, qr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
