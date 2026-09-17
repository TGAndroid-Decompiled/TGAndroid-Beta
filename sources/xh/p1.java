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
import org.telegram.ui.dc1;
import w7.x5;
public final class p1 extends FrameLayout {
    public final dc1 f46085a;
    public int f46086b;
    public final c6 f46087c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f46088f;
    public final RectF h;
    public final Paint f46089n;
    public int f46090r;

    public p1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f46088f = new RectF();
        this.h = new RectF();
        this.f46089n = new Paint(1);
        this.f46090r = Integer.MIN_VALUE;
        dc1 dc1Var = new dc1(this, context, 18);
        this.f46085a = dc1Var;
        dc1Var.setClipToPadding(false);
        dc1Var.setClipChildren(false);
        dc1Var.setOrientation(0);
        dc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(dc1Var, x5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f46087c = new c6(dc1Var, 0L, 320L, qr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
