package r0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class r implements s {
    public final ScrollFeedbackProvider f46939a;

    public r(NestedScrollView nestedScrollView) {
        this.f46939a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i9, int i10, int i11, boolean z10) {
        this.f46939a.onScrollLimit(i9, i10, i11, z10);
    }

    @Override
    public final void onScrollProgress(int i9, int i10, int i11, int i12) {
        this.f46939a.onScrollProgress(i9, i10, i11, i12);
    }
}
