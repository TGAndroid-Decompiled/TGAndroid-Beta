package rf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f44149a;
    public int f44150b;
    public int f44151c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f44149a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f44149a);
        if (!isInPictureInPictureMode) {
            this.f44150b = size;
            this.f44151c = size2;
        }
        if (isInPictureInPictureMode && size < this.f44150b && size2 < this.f44151c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
