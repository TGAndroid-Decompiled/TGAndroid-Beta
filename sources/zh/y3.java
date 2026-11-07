package zh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class y3 extends View {
    public final TL_stars.StarGift f60502a;
    public final float f60503b;

    public y3(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f60502a = starGift;
        this.f60503b = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f60502a == null) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f60503b), 1073741824), i10);
        }
    }
}
