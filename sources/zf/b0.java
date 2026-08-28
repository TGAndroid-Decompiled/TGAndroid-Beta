package zf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b0 extends View {
    public final int f50466a;

    public b0(Context context, int i9) {
        super(context);
        this.f50466a = i9;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        switch (this.f50466a) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                return;
            default:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
                return;
        }
    }
}
