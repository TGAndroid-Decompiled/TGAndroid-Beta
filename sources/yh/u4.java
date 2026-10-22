package yh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class u4 extends View {
    public final TL_stars.StarGift f50541a;
    public final float f50542b;

    public u4(Context context, TL_stars.StarGift starGift, float f7) {
        super(context);
        this.f50541a = starGift;
        this.f50542b = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f50541a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f50542b), 1073741824), i11);
        }
    }
}
