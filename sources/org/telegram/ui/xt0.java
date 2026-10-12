package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xt0 implements org.telegram.ui.Components.e81 {
    public boolean f41957a = true;
    public final PhotoViewer f41958b;

    public xt0(PhotoViewer photoViewer) {
        this.f41958b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.h81 h81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f41958b;
        if (photoViewer.F2 == h81Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f32313o0.f20675b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f32405y, 0, photoViewer.f32378v2);
                alertDialog$Builder.f19548a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new nq0(this, 2));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f41958b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f32226e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.h81 h81Var = photoViewer.F2;
            if (h81Var == null || !h81Var.V) {
                AndroidUtilities.runOnUIThread(new wt0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.h81 h81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        org.telegram.ui.Components.h81 h81Var2;
        boolean z11;
        PhotoViewer photoViewer = this.f41958b;
        ArrayList arrayList = photoViewer.f32250g7;
        org.telegram.ui.Components.h81 h81Var3 = photoViewer.F2;
        if (h81Var3 != null) {
            if (!b5.d.u() && !photoViewer.f32338r) {
                z11 = false;
            } else {
                z11 = true;
            }
            h81Var3.O(z11);
        }
        if (this.f41957a && (h81Var = photoViewer.F2) != null && h81Var.p() != -9223372036854775807L) {
            this.f41957a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f32195a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K(videoEditedInfo.start * ((float) h81Var2.p()));
                        ft0 ft0Var = photoViewer.S7;
                        if (ft0Var != null) {
                            ft0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.y3(i10, z10);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        rf.d p5 = org.telegram.ui.Components.fh0.p();
        PhotoViewer photoViewer = this.f41958b;
        if (p5 != null && org.telegram.ui.Components.fh0.p().f44175b.f45646a != 0 && (textureView = photoViewer.f32389w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.fh0 fh0Var = org.telegram.ui.Components.fh0.f25035p0;
            TextureView textureView3 = null;
            if (fh0Var != null) {
                textureView2 = fh0Var.f25051l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (fh0Var != null) {
                textureView3 = fh0Var.f25051l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f32389w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f32389w3.setSurfaceTextureListener(photoViewer.f32274j4);
                photoViewer.f32389w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41958b.x0(false);
        AndroidUtilities.runOnUIThread(new wt0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f41958b;
        if (photoViewer.f32408y2 != null) {
            float f11 = i10 * f7;
            int i13 = (int) f11;
            photoViewer.U = i13;
            float f12 = i11;
            int i14 = (int) (f7 * f12);
            photoViewer.V = i14;
            rf.d dVar = photoViewer.G2;
            if (dVar != null) {
                dVar.d(i13, i14);
            }
            zt0 zt0Var = photoViewer.f32408y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            zt0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.x71) {
                ((org.telegram.ui.Components.x71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.x71 x71Var = (org.telegram.ui.Components.x71) photoViewer.B2;
                x71Var.d = i13;
                x71Var.e = i11;
                org.telegram.ui.Components.h00 h00Var = x71Var.f31189b;
                if (h00Var != null) {
                    h00Var.postRunnable(new org.telegram.ui.Components.d00(h00Var, i13, i11, 0));
                }
                if (photoViewer.f32210c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f41958b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.Q8;
        if (pVar != null) {
            pVar.run();
            photoViewer.Q8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.X7) {
            photoViewer.W7 = j10;
            photoViewer.X7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.h81 h81Var = photoViewer.F2;
            if (h81Var == null || !h81Var.V) {
                AndroidUtilities.runOnUIThread(new wt0(this, 2), 64L);
            }
        }
    }

    @Override
    public final void onSeekFinished(j2.a aVar) {
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
    }
}
