package zh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class x3 extends View {
    public final TL_stars.StarGift f60576a;
    public final float f60577b;

    public x3(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f60576a = starGift;
        this.f60577b = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f60576a == null) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f60577b), 1073741824), i10);
        }
    }
}
