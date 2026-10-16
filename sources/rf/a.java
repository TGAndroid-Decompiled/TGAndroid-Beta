package rf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f43908a;
    public int f43909b;
    public int f43910c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f43908a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f43908a);
        if (!isInPictureInPictureMode) {
            this.f43909b = size;
            this.f43910c = size2;
        }
        if (isInPictureInPictureMode && size < this.f43909b && size2 < this.f43910c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
