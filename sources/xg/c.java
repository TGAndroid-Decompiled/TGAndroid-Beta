package xg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;

public abstract class c extends FrameLayout {

    public final LinearLayout f49438a;

    public float f49439b;

    public final Rect f49440c;
    public final Rect d;

    public final Paint f49441e;

    public c(Context context) {
        super(context);
        this.f49440c = new Rect();
        this.d = new Rect();
        this.f49441e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49438a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, z5.c(-1.0f, -1));
    }

    public void setLensVisibility(float f10) {
        this.f49439b = f10;
        int iDp = AndroidUtilities.dp(f10 * 7.0f);
        Rect rect = this.f49440c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -iDp;
        rect2.inset(i10, i10);
    }
}
