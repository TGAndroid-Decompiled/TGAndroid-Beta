package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class q implements r {
    public final ScrollFeedbackProvider f41083a;

    public q(NestedScrollView nestedScrollView) {
        this.f41083a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f41083a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f41083a.onScrollProgress(i10, i11, i12, i13);
    }
}
