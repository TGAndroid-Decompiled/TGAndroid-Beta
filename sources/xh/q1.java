package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.cc1;
import w7.x5;
public final class q1 extends FrameLayout {
    public final cc1 f51585a;
    public int f51586b;
    public final g6 f51587c;
    public final ArrayList d;
    public final RectF f51588e;
    public final RectF f51589f;
    public final RectF h;
    public final Paint f51590n;
    public int f51591r;

    public q1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f51588e = new RectF();
        this.f51589f = new RectF();
        this.h = new RectF();
        this.f51590n = new Paint(1);
        this.f51591r = Integer.MIN_VALUE;
        cc1 cc1Var = new cc1(this, context, 18);
        this.f51585a = cc1Var;
        cc1Var.setClipToPadding(false);
        cc1Var.setClipChildren(false);
        cc1Var.setOrientation(0);
        cc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(cc1Var, x5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f51587c = new g6(cc1Var, 0L, 320L, is.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
