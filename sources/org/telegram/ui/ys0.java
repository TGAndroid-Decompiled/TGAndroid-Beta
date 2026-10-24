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
public final class ys0 implements org.telegram.ui.Components.g81 {
    public boolean f43944a = true;
    public final PhotoViewer f43945b;

    public ys0(PhotoViewer photoViewer) {
        this.f43945b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.j81 j81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f43945b;
        if (photoViewer.F2 == j81Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f33669o0.f21875b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f33761y, 0, photoViewer.f33734v2);
                alertDialog$Builder.f20679a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new rp0(this, 2));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.U2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f43945b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f33582e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
            if (j81Var == null || !j81Var.V) {
                AndroidUtilities.runOnUIThread(new xs0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.j81 j81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        org.telegram.ui.Components.j81 j81Var2;
        boolean z11;
        PhotoViewer photoViewer = this.f43945b;
        ArrayList arrayList = photoViewer.f33606g7;
        org.telegram.ui.Components.j81 j81Var3 = photoViewer.F2;
        if (j81Var3 != null) {
            if (!b5.d.u() && !photoViewer.f33694r) {
                z11 = false;
            } else {
                z11 = true;
            }
            j81Var3.O(z11);
        }
        if (this.f43944a && (j81Var = photoViewer.F2) != null && j81Var.p() != -9223372036854775807L) {
            this.f43944a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f33551a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K(videoEditedInfo.start * ((float) j81Var2.p()));
                        gs0 gs0Var = photoViewer.S7;
                        if (gs0Var != null) {
                            gs0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.A3(i10, z10);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        rf.d p5 = org.telegram.ui.Components.ch0.p();
        PhotoViewer photoViewer = this.f43945b;
        if (p5 != null && org.telegram.ui.Components.ch0.p().f45687b.f47452a != 0 && (textureView = photoViewer.f33745w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.ch0 ch0Var = org.telegram.ui.Components.ch0.f25313p0;
            TextureView textureView3 = null;
            if (ch0Var != null) {
                textureView2 = ch0Var.f25329l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (ch0Var != null) {
                textureView3 = ch0Var.f25329l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f33745w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f33745w3.setSurfaceTextureListener(photoViewer.f33630j4);
                photoViewer.f33745w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f43945b.y0(false);
        AndroidUtilities.runOnUIThread(new xs0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f43945b;
        if (photoViewer.f33764y2 != null) {
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
            at0 at0Var = photoViewer.f33764y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            at0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.y71) {
                ((org.telegram.ui.Components.y71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) photoViewer.B2;
                y71Var.d = i13;
                y71Var.e = i11;
                org.telegram.ui.Components.c00 c00Var = y71Var.f32834b;
                if (c00Var != null) {
                    c00Var.postRunnable(new org.telegram.ui.Components.yz(c00Var, i13, i11, 0));
                }
                if (photoViewer.f33566c2 == 1) {
                    photoViewer.B2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f43945b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.Q8;
        if (pVar != null) {
            pVar.run();
            photoViewer.Q8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.X7) {
            photoViewer.W7 = j10;
            photoViewer.X7 = -1L;
            PhotoViewer.W(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
            if (j81Var == null || !j81Var.V) {
                AndroidUtilities.runOnUIThread(new xs0(this, 2), 64L);
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
