package ph;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.x5;
public abstract class c extends FrameLayout {
    public final LinearLayout f44123a;
    public float f44124b;
    public final Rect f44125c;
    public final Rect d;
    public final Paint f44126e;

    public c(Context context) {
        super(context);
        this.f44125c = new Rect();
        this.d = new Rect();
        this.f44126e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44123a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, x5.c(-1.0f, -1));
    }

    public void setLensVisibility(float f7) {
        this.f44124b = f7;
        int dp = AndroidUtilities.dp(f7 * 7.0f);
        Rect rect = this.f44125c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
    }
}
