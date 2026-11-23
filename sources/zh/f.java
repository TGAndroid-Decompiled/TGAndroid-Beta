package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.g0;
public final class f extends View {
    public final int f62000a;

    public f(Context context, int i7) {
        super(context);
        this.f62000a = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f62000a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(g0.L(52.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(g0.L(68.0f), 1073741824));
                return;
        }
    }
}
