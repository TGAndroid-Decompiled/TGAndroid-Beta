package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class p implements q {
    public final ScrollFeedbackProvider f54035a;

    public p(NestedScrollView nestedScrollView) {
        this.f54035a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i3, int i10, int i11, boolean z10) {
        this.f54035a.onScrollLimit(i3, i10, i11, z10);
    }

    @Override
    public final void onScrollProgress(int i3, int i10, int i11, int i12) {
        this.f54035a.onScrollProgress(i3, i10, i11, i12);
    }
}
