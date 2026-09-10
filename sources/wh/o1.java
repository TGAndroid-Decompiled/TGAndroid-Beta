package wh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.gc1;
import w7.a6;
public final class o1 extends FrameLayout {
    public final gc1 f44273a;
    public int f44274b;
    public final d6 f44275c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f44276f;
    public final RectF h;
    public final Paint f44277n;
    public int f44278r;

    public o1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f44276f = new RectF();
        this.h = new RectF();
        this.f44277n = new Paint(1);
        this.f44278r = Integer.MIN_VALUE;
        gc1 gc1Var = new gc1(this, context, 18);
        this.f44273a = gc1Var;
        gc1Var.setClipToPadding(false);
        gc1Var.setClipChildren(false);
        gc1Var.setOrientation(0);
        gc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(gc1Var, a6.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f44275c = new d6(gc1Var, 0L, 320L, wr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
