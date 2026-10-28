package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class q implements r {
    public final ScrollFeedbackProvider f47163a;

    public q(NestedScrollView nestedScrollView) {
        this.f47163a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f47163a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f47163a.onScrollProgress(i10, i11, i12, i13);
    }
}
