package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class r implements s {
    public final ScrollFeedbackProvider f46853a;

    public r(NestedScrollView nestedScrollView) {
        this.f46853a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f46853a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f46853a.onScrollProgress(i10, i11, i12, i13);
    }
}
