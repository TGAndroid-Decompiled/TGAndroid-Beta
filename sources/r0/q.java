package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class q implements r {
    public final ScrollFeedbackProvider f43506a;

    public q(NestedScrollView nestedScrollView) {
        this.f43506a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f43506a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f43506a.onScrollProgress(i10, i11, i12, i13);
    }
}
