package sg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m1 extends View {
    public final int f46202a;

    public m1(Context context, int i10) {
        super(context);
        this.f46202a = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f46202a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                return;
        }
    }
}
