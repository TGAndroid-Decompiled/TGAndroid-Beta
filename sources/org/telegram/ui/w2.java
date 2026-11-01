package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class w2 {
    public long f42661a;
    public Bitmap f42662b;

    public static w2 a(VideoPlayerHolderBase videoPlayerHolderBase, v2 v2Var) {
        ?? obj = new Object();
        obj.f42661a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = v2Var.f42391n;
            TextureView textureView2 = v2Var.f42391n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    org.telegram.messenger.i0.y0(surface, createBitmap);
                    surface.release();
                    obj.f42662b = createBitmap;
                    return obj;
                }
                obj.f42662b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
