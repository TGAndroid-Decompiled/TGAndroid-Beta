package ph;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.x5;
public abstract class c extends FrameLayout {
    public final LinearLayout f44097a;
    public float f44098b;
    public final Rect f44099c;
    public final Rect d;
    public final Paint f44100e;

    public c(Context context) {
        super(context);
        this.f44099c = new Rect();
        this.d = new Rect();
        this.f44100e = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44097a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, x5.c(-1.0f, -1));
    }

    public void setLensVisibility(float f7) {
        this.f44098b = f7;
        int dp = AndroidUtilities.dp(f7 * 7.0f);
        Rect rect = this.f44099c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
    }
}
