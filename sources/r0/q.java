package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class q implements r {
    public final ScrollFeedbackProvider f45634a;

    public q(NestedScrollView nestedScrollView) {
        this.f45634a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f45634a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f45634a.onScrollProgress(i10, i11, i12, i13);
    }
}
