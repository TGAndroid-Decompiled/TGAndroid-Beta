package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class z2 {
    public long f39189a;
    public Bitmap f39190b;

    public static z2 a(VideoPlayerHolderBase videoPlayerHolderBase, y2 y2Var) {
        ?? obj = new Object();
        obj.f39189a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = y2Var.f38878n;
            TextureView textureView2 = y2Var.f38878n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f39190b = createBitmap;
                    return obj;
                }
                obj.f39190b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
