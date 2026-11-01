package ph;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class d4 extends View {
    public final TL_stars.StarGift f45033a;
    public final float f45034b;

    public d4(Context context, TL_stars.StarGift starGift, float f7) {
        super(context);
        this.f45033a = starGift;
        this.f45034b = f7;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f45033a == null) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i10) * this.f45034b), 1073741824), i11);
        }
    }
}
