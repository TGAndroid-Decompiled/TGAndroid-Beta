package qh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c8.na;
import org.telegram.messenger.g0;
public abstract class c extends FrameLayout {
    public final LinearLayout f56177a;
    public float f56178b;
    public final Rect f56179c;
    public final Rect d;
    public final Paint f56180e;

    public c(Context context) {
        super(context);
        this.f56179c = new Rect();
        this.d = new Rect();
        this.f56180e = new Paint(1);
        setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f56177a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, na.c(-1.0f, -1));
    }

    public void setLensVisibility(float f10) {
        this.f56178b = f10;
        int L = g0.L(f10 * 7.0f);
        Rect rect = this.f56179c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i7 = -L;
        rect2.inset(i7, i7);
    }
}
