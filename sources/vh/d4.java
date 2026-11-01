package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
public final class d4 extends ImageView {
    public final int f51091a;
    public final f4 f51092b;

    public d4(f4 f4Var, Context context, int i10, int i11) {
        super(context);
        this.f51092b = f4Var;
        this.f51091a = i10;
        setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        setScaleType(ImageView.ScaleType.CENTER);
        setImageResource(i11);
        setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        setOnClickListener(new rh.r0(this, i10, 2));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
    }
}
