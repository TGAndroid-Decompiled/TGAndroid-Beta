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
import org.telegram.ui.bc1;
import w7.x5;
public final class p1 extends FrameLayout {
    public final bc1 f46062a;
    public int f46063b;
    public final c6 f46064c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f46065f;
    public final RectF h;
    public final Paint f46066n;
    public int f46067r;

    public p1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f46065f = new RectF();
        this.h = new RectF();
        this.f46066n = new Paint(1);
        this.f46067r = Integer.MIN_VALUE;
        bc1 bc1Var = new bc1(this, context, 18);
        this.f46062a = bc1Var;
        bc1Var.setClipToPadding(false);
        bc1Var.setClipChildren(false);
        bc1Var.setOrientation(0);
        bc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(bc1Var, x5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f46064c = new c6(bc1Var, 0L, 320L, qr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
