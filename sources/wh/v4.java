package wh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class v4 extends View {
    public final TL_stars.StarGift f44394a;
    public final float f44395b;

    public v4(Context context, TL_stars.StarGift starGift, float f7) {
        super(context);
        this.f44394a = starGift;
        this.f44395b = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f44394a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f44395b), 1073741824), i11);
        }
    }
}
