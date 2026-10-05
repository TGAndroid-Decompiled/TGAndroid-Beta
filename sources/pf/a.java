package pf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f44395a;
    public int f44396b;
    public int f44397c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f44395a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f44395a);
        if (!isInPictureInPictureMode) {
            this.f44396b = size;
            this.f44397c = size2;
        }
        if (isInPictureInPictureMode && size < this.f44396b && size2 < this.f44397c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
