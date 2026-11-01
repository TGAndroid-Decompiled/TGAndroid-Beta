package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class p implements q {
    public final ScrollFeedbackProvider f46153a;

    public p(NestedScrollView nestedScrollView) {
        this.f46153a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f46153a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f46153a.onScrollProgress(i10, i11, i12, i13);
    }
}
