package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class z2 {
    public long f40379a;
    public Bitmap f40380b;

    public static z2 a(VideoPlayerHolderBase videoPlayerHolderBase, y2 y2Var) {
        ?? obj = new Object();
        obj.f40379a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = y2Var.f40103n;
            TextureView textureView2 = y2Var.f40103n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f40380b = createBitmap;
                    return obj;
                }
                obj.f40380b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
