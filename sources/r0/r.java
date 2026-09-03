package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class r implements s {
    public final ScrollFeedbackProvider f46493a;

    public r(NestedScrollView nestedScrollView) {
        this.f46493a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i10, int i11, int i12, boolean z4) {
        this.f46493a.onScrollLimit(i10, i11, i12, z4);
    }

    @Override
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f46493a.onScrollProgress(i10, i11, i12, i13);
    }
}
