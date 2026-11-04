package uf;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.g0;
import org.telegram.ui.LaunchActivity;
public final class a extends FrameLayout {
    public final Activity f55822a;
    public int f55823b;
    public int f55824c;
    public boolean d;

    public a(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f55822a = launchActivity;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean H1 = g0.H1(this.f55822a);
        if (!H1) {
            this.f55823b = size;
            this.f55824c = size2;
        }
        if (H1 && size < this.f55823b && size2 < this.f55824c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
