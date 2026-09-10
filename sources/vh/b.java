package vh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j9;
public final class b extends j9 {
    public final int e;

    public b(int i10, Context context, boolean z10) {
        super(context, z10);
        this.e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.e) {
            case 1:
                if (zh.p.f48762c) {
                    zh.p.f48761b.add(this);
                    return;
                } else {
                    super.invalidate();
                    return;
                }
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int B;
        switch (this.e) {
            case 0:
                int i12 = this.f24315a.f23945n;
                if (i12 == 0) {
                    B = 0;
                } else {
                    B = hc.b.B(i12, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(B), 1073741824), i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.e) {
            case 1:
                if (zh.p.f48762c) {
                    zh.p.f48761b.add(this);
                    return;
                } else {
                    super.invalidate(i10, i11, i12, i13);
                    return;
                }
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
