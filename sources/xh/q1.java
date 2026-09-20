package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.dc1;
import w7.y5;
public final class q1 extends FrameLayout {
    public final dc1 f46375a;
    public int f46376b;
    public final d6 f46377c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f46378f;
    public final RectF h;
    public final Paint f46379n;
    public int f46380r;

    public q1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f46378f = new RectF();
        this.h = new RectF();
        this.f46379n = new Paint(1);
        this.f46380r = Integer.MIN_VALUE;
        dc1 dc1Var = new dc1(this, context, 18);
        this.f46375a = dc1Var;
        dc1Var.setClipToPadding(false);
        dc1Var.setClipChildren(false);
        dc1Var.setOrientation(0);
        dc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(dc1Var, y5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f46377c = new d6(dc1Var, 0L, 320L, qr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
