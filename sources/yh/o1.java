package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.ic1;
import w7.z5;
public final class o1 extends FrameLayout {
    public final ic1 f49043a;
    public int f49044b;
    public final g6 f49045c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f49046f;
    public final RectF h;
    public final Paint f49047n;
    public int f49048r;

    public o1(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f49046f = new RectF();
        this.h = new RectF();
        this.f49047n = new Paint(1);
        this.f49048r = Integer.MIN_VALUE;
        ic1 ic1Var = new ic1(this, context, 18);
        this.f49043a = ic1Var;
        ic1Var.setClipToPadding(false);
        ic1Var.setClipChildren(false);
        ic1Var.setOrientation(0);
        ic1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        addView(ic1Var, z5.e(-2, -1, 1));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.f49045c = new g6(ic1Var, 0L, 320L, es.h);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
