package pf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f40793a;
    public int f40794b;
    public int f40795c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f40793a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f40793a);
        if (!isInPictureInPictureMode) {
            this.f40794b = size;
            this.f40795c = size2;
        }
        if (isInPictureInPictureMode && size < this.f40794b && size2 < this.f40795c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
