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
public final class qt0 implements org.telegram.ui.Components.s71 {
    public boolean f36986a = true;
    public final PhotoViewer f36987b;

    public qt0(PhotoViewer photoViewer) {
        this.f36987b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.v71 v71Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f36987b;
        if (photoViewer.F2 == v71Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f31328o0.f19812b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f31420y, 0, photoViewer.f31393v2);
                alertDialog$Builder.f18669a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new ol0(this, 4));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.R2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f36987b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f31242e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.v71 v71Var = photoViewer.F2;
            if (v71Var == null || !v71Var.V) {
                AndroidUtilities.runOnUIThread(new pt0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.v71 v71Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        boolean z11;
        PhotoViewer photoViewer = this.f36987b;
        ArrayList arrayList = photoViewer.f31266g7;
        org.telegram.ui.Components.v71 v71Var2 = photoViewer.F2;
        if (v71Var2 != null) {
            if (!b5.d.u() && !photoViewer.f31353r) {
                z11 = false;
            } else {
                z11 = true;
            }
            v71Var2.O(z11);
        }
        if (this.f36986a && (v71Var = photoViewer.F2) != null && v71Var.p() != -9223372036854775807L) {
            this.f36986a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f31211a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.v71 v71Var3 = photoViewer.F2;
                        v71Var3.K(videoEditedInfo.start * ((float) v71Var3.p()));
                        ys0 ys0Var = photoViewer.S7;
                        if (ys0Var != null) {
                            ys0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.x3(i10, z10);
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        TextureView textureView2;
        pf.e p5 = org.telegram.ui.Components.rg0.p();
        PhotoViewer photoViewer = this.f36987b;
        if (p5 != null && org.telegram.ui.Components.rg0.p().f41110b.f42548a != 0 && (textureView = photoViewer.f31404w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.f27960p0;
            TextureView textureView3 = null;
            if (rg0Var != null) {
                textureView2 = rg0Var.f27976l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (rg0Var != null) {
                textureView3 = rg0Var.f27976l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f31404w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f31404w3.setSurfaceTextureListener(photoViewer.f31289j4);
                photoViewer.f31404w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f36987b.x0(false);
        AndroidUtilities.runOnUIThread(new pt0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f36987b;
        if (photoViewer.f31423y2 != null) {
            float f11 = i10 * f7;
            int i13 = (int) f11;
            photoViewer.U = i13;
            float f12 = i11;
            int i14 = (int) (f7 * f12);
            photoViewer.V = i14;
            pf.e eVar = photoViewer.G2;
            if (eVar != null) {
                eVar.d(i13, i14);
            }
            st0 st0Var = photoViewer.f31423y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            st0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.l71) {
                ((org.telegram.ui.Components.l71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.l71 l71Var = (org.telegram.ui.Components.l71) photoViewer.B2;
                l71Var.d = i13;
                l71Var.e = i11;
                org.telegram.ui.Components.vz vzVar = l71Var.f26011b;
                if (vzVar != null) {
                    vzVar.postRunnable(new org.telegram.ui.Components.rz(vzVar, i13, i11, 0));
                }
                if (photoViewer.f31226c2 == 1) {
                    photoViewer.y2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f36987b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.Q8;
        if (pVar != null) {
            pVar.run();
            photoViewer.Q8 = null;
        }
        long j3 = aVar.e;
        if (j3 == photoViewer.X7) {
            photoViewer.W7 = j3;
            photoViewer.X7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.v71 v71Var = photoViewer.F2;
            if (v71Var == null || !v71Var.V) {
                AndroidUtilities.runOnUIThread(new pt0(this, 2), 64L);
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
