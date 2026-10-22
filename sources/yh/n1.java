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
import org.telegram.ui.qa1;
import w7.z5;
public final class n1 extends FrameLayout {
    public final qa1 f50417a;
    public int f50418b;
    public final f6 f50419c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f50420f;
    public final RectF h;
    public final Paint f50421n;
    public int f50422r;

    public n1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f50420f = new RectF();
        this.h = new RectF();
        this.f50421n = new Paint(1);
        this.f50422r = Integer.MIN_VALUE;
        qa1 qa1Var = new qa1(this, context, 21);
        this.f50417a = qa1Var;
        qa1Var.setClipToPadding(false);
        qa1Var.setClipChildren(false);
        qa1Var.setOrientation(0);
        qa1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(qa1Var, z5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f50419c = new f6(qa1Var, 0L, 320L, bs.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
