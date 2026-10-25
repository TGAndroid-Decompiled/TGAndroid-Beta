package org.telegram.ui;

import android.content.Context;
public final class zs0 extends org.telegram.ui.Components.z81 {
    public final PhotoViewer f46355h0;

    public zs0(PhotoViewer photoViewer, Context context, fr0 fr0Var) {
        super(context, fr0Var);
        this.f46355h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.Y(this.f46355h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.Y(this.f46355h0);
        }
    }
}
