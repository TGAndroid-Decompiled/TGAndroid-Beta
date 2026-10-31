package org.telegram.ui;

import android.content.Context;
public final class tq0 extends org.telegram.ui.Components.b71 {
    public final PhotoViewer f41914h0;

    public tq0(PhotoViewer photoViewer, Context context, yo0 yo0Var) {
        super(context, yo0Var);
        this.f41914h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.Y(this.f41914h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.Y(this.f41914h0);
        }
    }
}
