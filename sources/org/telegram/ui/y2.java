package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class y2 {
    public long f43019a;
    public Bitmap f43020b;

    public static y2 a(VideoPlayerHolderBase videoPlayerHolderBase, x2 x2Var) {
        ?? obj = new Object();
        obj.f43019a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = x2Var.f42722n;
            TextureView textureView2 = x2Var.f42722n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f43020b = createBitmap;
                    return obj;
                }
                obj.f43020b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
