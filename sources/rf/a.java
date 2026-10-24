package rf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f45661a;
    public int f45662b;
    public int f45663c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f45661a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f45661a);
        if (!isInPictureInPictureMode) {
            this.f45662b = size;
            this.f45663c = size2;
        }
        if (isInPictureInPictureMode && size < this.f45662b && size2 < this.f45663c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
