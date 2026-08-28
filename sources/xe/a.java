package xe;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f49117a;
    public int f49118b;
    public int f49119c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f49117a = launchActivity;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isInPictureInPictureMode = AndroidUtilities.isInPictureInPictureMode(this.f49117a);
        if (!isInPictureInPictureMode) {
            this.f49118b = size;
            this.f49119c = size2;
        }
        if (isInPictureInPictureMode && size < this.f49118b && size2 < this.f49119c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
