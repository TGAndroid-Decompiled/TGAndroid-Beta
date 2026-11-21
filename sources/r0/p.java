package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class p implements q {
    public final ScrollFeedbackProvider f56307a;

    public p(NestedScrollView nestedScrollView) {
        this.f56307a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i7, int i10, int i11, boolean z10) {
        this.f56307a.onScrollLimit(i7, i10, i11, z10);
    }

    @Override
    public final void onScrollProgress(int i7, int i10, int i11, int i12) {
        this.f56307a.onScrollProgress(i7, i10, i11, i12);
    }
}
