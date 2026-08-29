package zg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
public abstract class c extends FrameLayout {
    public final LinearLayout f50870a;
    public float f50871b;
    public final Rect f50872c;
    public final Rect d;
    public final Paint f50873e;

    public c(Context context) {
        super(context);
        this.f50872c = new Rect();
        this.d = new Rect();
        this.f50873e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f50870a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, f6.c(-1.0f, -1));
    }

    public void setLensVisibility(float f9) {
        this.f50871b = f9;
        int dp = AndroidUtilities.dp(f9 * 7.0f);
        Rect rect = this.f50872c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
    }
}
