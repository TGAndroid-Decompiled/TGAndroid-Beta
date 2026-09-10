package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h extends View {
    public final int f43376a;

    public h(Context context, int i10) {
        super(context);
        this.f43376a = i10;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f43376a) {
            case 1:
                if (getAlpha() != 0.0f) {
                    AndroidUtilities.rectTmp.set(0.0f, 0.0f, getWidth(), getHeight());
                    invalidate();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f43376a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f43376a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
