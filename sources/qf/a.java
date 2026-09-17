package qf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f44353a;
    public int f44354b;
    public int f44355c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f44353a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f44353a);
        if (!isInPictureInPictureMode) {
            this.f44354b = size;
            this.f44355c = size2;
        }
        if (isInPictureInPictureMode && size < this.f44354b && size2 < this.f44355c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
