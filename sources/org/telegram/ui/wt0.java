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
public final class wt0 implements org.telegram.ui.Components.f81 {
    public boolean f41359a = true;
    public final PhotoViewer f41360b;

    public wt0(PhotoViewer photoViewer) {
        this.f41360b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.i81 i81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f41360b;
        if (photoViewer.F2 == i81Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f32015o0.f20375b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f32107y, 0, photoViewer.f32080v2);
                alertDialog$Builder.f19248a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new lq0(this, 2));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f41360b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f31928e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.i81 i81Var = photoViewer.F2;
            if (i81Var == null || !i81Var.V) {
                AndroidUtilities.runOnUIThread(new vt0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.i81 i81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        org.telegram.ui.Components.i81 i81Var2;
        boolean z11;
        PhotoViewer photoViewer = this.f41360b;
        ArrayList arrayList = photoViewer.f31952g7;
        org.telegram.ui.Components.i81 i81Var3 = photoViewer.F2;
        if (i81Var3 != null) {
            if (!b5.d.u() && !photoViewer.f32040r) {
                z11 = false;
            } else {
                z11 = true;
            }
            i81Var3.O(z11);
        }
        if (this.f41359a && (i81Var = photoViewer.F2) != null && i81Var.p() != -9223372036854775807L) {
            this.f41359a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f31897a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K(videoEditedInfo.start * ((float) i81Var2.p()));
                        et0 et0Var = photoViewer.S7;
                        if (et0Var != null) {
                            et0Var.setProgress(photoEntry.editedInfo.start);
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
        PhotoViewer photoViewer = this.f41360b;
        if (p5 != null && org.telegram.ui.Components.fh0.p().f43934b.f45646a != 0 && (textureView = photoViewer.f32091w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.fh0 fh0Var = org.telegram.ui.Components.fh0.f24733p0;
            TextureView textureView3 = null;
            if (fh0Var != null) {
                textureView2 = fh0Var.f24749l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (fh0Var != null) {
                textureView3 = fh0Var.f24749l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f32091w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f32091w3.setSurfaceTextureListener(photoViewer.f31976j4);
                photoViewer.f32091w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41360b.x0(false);
        AndroidUtilities.runOnUIThread(new vt0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f41360b;
        if (photoViewer.f32110y2 != null) {
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
            yt0 yt0Var = photoViewer.f32110y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            yt0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.y71) {
                ((org.telegram.ui.Components.y71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) photoViewer.B2;
                y71Var.d = i13;
                y71Var.e = i11;
                org.telegram.ui.Components.h00 h00Var = y71Var.f31176b;
                if (h00Var != null) {
                    h00Var.postRunnable(new org.telegram.ui.Components.d00(h00Var, i13, i11, 0));
                }
                if (photoViewer.f31912c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f41360b;
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
            org.telegram.ui.Components.i81 i81Var = photoViewer.F2;
            if (i81Var == null || !i81Var.V) {
                AndroidUtilities.runOnUIThread(new vt0(this, 2), 64L);
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
