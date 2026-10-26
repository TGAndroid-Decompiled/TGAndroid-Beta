package sf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f48103a;
    public int f48104b;
    public int f48105c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f48103a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f48103a);
        if (!isInPictureInPictureMode) {
            this.f48104b = size;
            this.f48105c = size2;
        }
        if (isInPictureInPictureMode && size < this.f48104b && size2 < this.f48105c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
