package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class p implements q {
    public final ScrollFeedbackProvider f54210a;

    public p(NestedScrollView nestedScrollView) {
        this.f54210a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i7, int i10, int i11, boolean z9) {
        this.f54210a.onScrollLimit(i7, i10, i11, z9);
    }

    @Override
    public final void onScrollProgress(int i7, int i10, int i11, int i12) {
        this.f54210a.onScrollProgress(i7, i10, i11, i12);
    }
}
