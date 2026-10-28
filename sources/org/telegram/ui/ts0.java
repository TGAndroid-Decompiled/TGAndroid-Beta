package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ts0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f43766a;

    public ts0(PhotoViewer photoViewer) {
        this.f43766a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f43766a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new nj0(this, 18)).setDuration(150L).start();
        }
    }
}
