package rh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import org.telegram.messenger.g0;
public abstract class c extends FrameLayout {
    public final LinearLayout f54539a;
    public float f54540b;
    public final Rect f54541c;
    public final Rect d;
    public final Paint f54542e;

    public c(Context context) {
        super(context);
        this.f54541c = new Rect();
        this.d = new Rect();
        this.f54542e = new Paint(1);
        setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f54539a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, mf.c(-1.0f, -1));
    }

    public void setLensVisibility(float f10) {
        this.f54540b = f10;
        int L = g0.L(f10 * 7.0f);
        Rect rect = this.f54541c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i3 = -L;
        rect2.inset(i3, i3);
    }
}
