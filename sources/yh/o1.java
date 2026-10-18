package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.sa1;
import w7.z5;
public final class o1 extends FrameLayout {
    public final sa1 f50468a;
    public int f50469b;
    public final f6 f50470c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f50471f;
    public final RectF h;
    public final Paint f50472n;
    public int f50473r;

    public o1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f50471f = new RectF();
        this.h = new RectF();
        this.f50472n = new Paint(1);
        this.f50473r = Integer.MIN_VALUE;
        sa1 sa1Var = new sa1(this, context, 21);
        this.f50468a = sa1Var;
        sa1Var.setClipToPadding(false);
        sa1Var.setClipChildren(false);
        sa1Var.setOrientation(0);
        sa1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(sa1Var, z5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f50470c = new f6(sa1Var, 0L, 320L, bs.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
