package zh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class v4 extends View {
    public final TL_stars.StarGift f53302a;
    public final float f53303b;

    public v4(Context context, TL_stars.StarGift starGift, float f7) {
        super(context);
        this.f53302a = starGift;
        this.f53303b = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f53302a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f53303b), 1073741824), i11);
        }
    }
}
