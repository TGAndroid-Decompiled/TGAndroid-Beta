package wg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
public abstract class c extends FrameLayout {
    public final LinearLayout f48839a;
    public float f48840b;
    public final Rect f48841c;
    public final Rect d;
    public final Paint f48842e;

    public c(Context context) {
        super(context);
        this.f48841c = new Rect();
        this.d = new Rect();
        this.f48842e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48839a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, e6.c(-1.0f, -1));
    }

    public void setLensVisibility(float f10) {
        this.f48840b = f10;
        int dp = AndroidUtilities.dp(f10 * 7.0f);
        Rect rect = this.f48841c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i9 = -dp;
        rect2.inset(i9, i9);
    }
}
