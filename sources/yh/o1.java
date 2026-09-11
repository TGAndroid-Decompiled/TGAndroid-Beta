package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.cc1;
import w7.x5;
public final class o1 extends FrameLayout {
    public final cc1 f50468a;
    public int f50469b;
    public final e6 f50470c;
    public final ArrayList d;
    public final RectF f50471e;
    public final RectF f50472f;
    public final RectF h;
    public final Paint f50473n;
    public int f50474r;

    public o1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.f50471e = new RectF();
        this.f50472f = new RectF();
        this.h = new RectF();
        this.f50473n = new Paint(1);
        this.f50474r = Integer.MIN_VALUE;
        cc1 cc1Var = new cc1(this, context, 18);
        this.f50468a = cc1Var;
        cc1Var.setClipToPadding(false);
        cc1Var.setClipChildren(false);
        cc1Var.setOrientation(0);
        cc1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(cc1Var, x5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f50470c = new e6(cc1Var, 0L, 320L, pr.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
