package org.telegram.ui;

import android.content.Context;
public final class st0 extends org.telegram.ui.Components.q81 {
    public final PhotoViewer f39944h0;

    public st0(PhotoViewer photoViewer, Context context, vr0 vr0Var) {
        super(context, vr0Var);
        this.f39944h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f39944h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f39944h0);
        }
    }
}
