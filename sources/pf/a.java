package pf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f41019a;
    public int f41020b;
    public int f41021c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41019a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f41019a);
        if (!isInPictureInPictureMode) {
            this.f41020b = size;
            this.f41021c = size2;
        }
        if (isInPictureInPictureMode && size < this.f41020b && size2 < this.f41021c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
