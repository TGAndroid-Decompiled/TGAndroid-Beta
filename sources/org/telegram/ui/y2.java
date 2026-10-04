package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class y2 {
    public long f43012a;
    public Bitmap f43013b;

    public static y2 a(VideoPlayerHolderBase videoPlayerHolderBase, x2 x2Var) {
        ?? obj = new Object();
        obj.f43012a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = x2Var.f42715n;
            TextureView textureView2 = x2Var.f42715n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f43013b = createBitmap;
                    return obj;
                }
                obj.f43013b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
