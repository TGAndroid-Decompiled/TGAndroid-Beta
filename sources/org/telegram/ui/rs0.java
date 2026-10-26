package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class rs0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f43280a;

    public rs0(PhotoViewer photoViewer) {
        this.f43280a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f43280a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new lj0(this, 18)).setDuration(150L).start();
        }
    }
}
