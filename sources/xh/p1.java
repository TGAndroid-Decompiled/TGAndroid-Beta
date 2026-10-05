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
import org.telegram.ui.vb1;
import w7.z5;
public final class p1 extends FrameLayout {
    public final vb1 f50179a;
    public int f50180b;
    public final e6 f50181c;
    public final ArrayList d;
    public final RectF f50182e;
    public final RectF f50183f;
    public final RectF h;
    public final Paint f50184n;
    public int f50185r;

    public p1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f50182e = new RectF();
        this.f50183f = new RectF();
        this.h = new RectF();
        this.f50184n = new Paint(1);
        this.f50185r = Integer.MIN_VALUE;
        vb1 vb1Var = new vb1(this, context, 18);
        this.f50179a = vb1Var;
        vb1Var.setClipToPadding(false);
        vb1Var.setClipChildren(false);
        vb1Var.setOrientation(0);
        vb1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(vb1Var, z5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f50181c = new e6(vb1Var, 0L, 320L, tr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
