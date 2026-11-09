package zh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class y3 extends View {
    public final TL_stars.StarGift f60634a;
    public final float f60635b;

    public y3(Context context, TL_stars.StarGift starGift, float f10) {
        super(context);
        this.f60634a = starGift;
        this.f60635b = f10;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f60634a == null) {
            super.onMeasure(i7, i10);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i7) * this.f60635b), 1073741824), i10);
        }
    }
}
