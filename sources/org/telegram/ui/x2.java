package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class x2 {
    public long f45628a;
    public Bitmap f45629b;

    public static x2 a(VideoPlayerHolderBase videoPlayerHolderBase, w2 w2Var) {
        ?? obj = new Object();
        obj.f45628a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = w2Var.f44952n;
            TextureView textureView2 = w2Var.f44952n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f45629b = createBitmap;
                    return obj;
                }
                obj.f45629b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
