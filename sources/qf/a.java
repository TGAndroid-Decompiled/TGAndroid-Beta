package qf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f46211a;
    public int f46212b;
    public int f46213c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f46211a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f46211a);
        if (!isInPictureInPictureMode) {
            this.f46212b = size;
            this.f46213c = size2;
        }
        if (isInPictureInPictureMode && size < this.f46212b && size2 < this.f46213c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
