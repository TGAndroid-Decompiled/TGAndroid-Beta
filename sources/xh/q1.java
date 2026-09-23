package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.rr;
import org.telegram.ui.ub1;
import w7.x5;
public final class q1 extends FrameLayout {
    public final ub1 f46027a;
    public int f46028b;
    public final e6 f46029c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f46030f;
    public final RectF h;
    public final Paint f46031n;
    public int f46032r;

    public q1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f46030f = new RectF();
        this.h = new RectF();
        this.f46031n = new Paint(1);
        this.f46032r = Integer.MIN_VALUE;
        ub1 ub1Var = new ub1(this, context, 18);
        this.f46027a = ub1Var;
        ub1Var.setClipToPadding(false);
        ub1Var.setClipChildren(false);
        ub1Var.setOrientation(0);
        ub1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(ub1Var, x5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f46029c = new e6(ub1Var, 0L, 320L, rr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
