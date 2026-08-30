package org.telegram.ui;

import android.content.Context;
public final class rs0 extends org.telegram.ui.Components.p71 {
    public final PhotoViewer f38111e0;

    public rs0(PhotoViewer photoViewer, Context context, uq0 uq0Var) {
        super(context, uq0Var);
        this.f38111e0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        PhotoViewer.X(this.f38111e0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f38111e0);
        }
    }
}
