package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class zs0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f40586a;

    public zs0(PhotoViewer photoViewer) {
        this.f40586a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f40586a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new ml0(this, 15)).setDuration(150L).start();
        }
    }
}
