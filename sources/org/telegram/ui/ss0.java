package org.telegram.ui;

import android.content.Context;
public final class ss0 extends org.telegram.ui.Components.j81 {
    public final PhotoViewer f41530h0;

    public ss0(PhotoViewer photoViewer, Context context, yq0 yq0Var) {
        super(context, yq0Var);
        this.f41530h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.Y(this.f41530h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.Y(this.f41530h0);
        }
    }
}
