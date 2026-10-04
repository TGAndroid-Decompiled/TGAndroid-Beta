package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.xb1;
import w7.z5;
public final class p1 extends FrameLayout {
    public final xb1 f50163a;
    public int f50164b;
    public final e6 f50165c;
    public final ArrayList d;
    public final RectF f50166e;
    public final RectF f50167f;
    public final RectF h;
    public final Paint f50168n;
    public int f50169r;

    public p1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f50166e = new RectF();
        this.f50167f = new RectF();
        this.h = new RectF();
        this.f50168n = new Paint(1);
        this.f50169r = Integer.MIN_VALUE;
        xb1 xb1Var = new xb1(this, context, 18);
        this.f50163a = xb1Var;
        xb1Var.setClipToPadding(false);
        xb1Var.setClipChildren(false);
        xb1Var.setOrientation(0);
        xb1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(xb1Var, z5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f50165c = new e6(xb1Var, 0L, 320L, tr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
