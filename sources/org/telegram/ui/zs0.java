package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class zs0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f43885a;

    public zs0(PhotoViewer photoViewer) {
        this.f43885a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f43885a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new nl0(this, 16)).setDuration(150L).start();
        }
    }
}
