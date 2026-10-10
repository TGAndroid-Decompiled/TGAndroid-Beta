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
import org.telegram.ui.dc1;
import w7.x5;
public final class q1 extends FrameLayout {
    public final dc1 f51508a;
    public int f51509b;
    public final g6 f51510c;
    public final ArrayList d;
    public final RectF f51511e;
    public final RectF f51512f;
    public final RectF h;
    public final Paint f51513n;
    public int f51514r;

    public q1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f51511e = new RectF();
        this.f51512f = new RectF();
        this.h = new RectF();
        this.f51513n = new Paint(1);
        this.f51514r = Integer.MIN_VALUE;
        dc1 dc1Var = new dc1(this, context, 18);
        this.f51508a = dc1Var;
        dc1Var.setClipToPadding(false);
        dc1Var.setClipChildren(false);
        dc1Var.setOrientation(0);
        dc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(dc1Var, x5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f51510c = new g6(dc1Var, 0L, 320L, is.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
