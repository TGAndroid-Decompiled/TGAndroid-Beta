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
public final class n1 extends FrameLayout {
    public final sa1 f50408a;
    public int f50409b;
    public final f6 f50410c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f50411f;
    public final RectF h;
    public final Paint f50412n;
    public int f50413r;

    public n1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f50411f = new RectF();
        this.h = new RectF();
        this.f50412n = new Paint(1);
        this.f50413r = Integer.MIN_VALUE;
        sa1 sa1Var = new sa1(this, context, 21);
        this.f50408a = sa1Var;
        sa1Var.setClipToPadding(false);
        sa1Var.setClipChildren(false);
        sa1Var.setOrientation(0);
        sa1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(sa1Var, z5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f50410c = new f6(sa1Var, 0L, 320L, bs.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
