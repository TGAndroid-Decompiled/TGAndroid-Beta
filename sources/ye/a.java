package ye;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

public final class a extends FrameLayout {

    public final Activity f49833a;

    public int f49834b;

    public int f49835c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f49833a = launchActivity;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean zIsInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f49833a);
        if (!zIsInPictureInPictureMode) {
            this.f49834b = size;
            this.f49835c = size2;
        }
        this.d = zIsInPictureInPictureMode && size < this.f49834b && size2 < this.f49835c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
