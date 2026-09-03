package uf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q0 extends View {
    public final int f48712a;

    public q0(Context context, int i10) {
        super(context);
        this.f48712a = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f48712a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(8.0f), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                return;
        }
    }
}
