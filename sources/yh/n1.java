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
    public final qa1 f50407a;
    public int f50408b;
    public final f6 f50409c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f50410f;
    public final RectF h;
    public final Paint f50411n;
    public int f50412r;

    public n1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f50410f = new RectF();
        this.h = new RectF();
        this.f50411n = new Paint(1);
        this.f50412r = Integer.MIN_VALUE;
        qa1 qa1Var = new qa1(this, context, 21);
        this.f50407a = qa1Var;
        qa1Var.setClipToPadding(false);
        qa1Var.setClipChildren(false);
        qa1Var.setOrientation(0);
        qa1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(qa1Var, z5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f50409c = new f6(qa1Var, 0L, 320L, bs.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
