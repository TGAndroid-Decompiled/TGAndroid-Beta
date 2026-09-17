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
public final class st0 implements org.telegram.ui.Components.e71 {
    public boolean f37547a = true;
    public final PhotoViewer f37548b;

    public st0(PhotoViewer photoViewer) {
        this.f37548b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.h71 h71Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f37548b;
        if (photoViewer.F2 == h71Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f31036o0.f19605b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f31128y, 0, photoViewer.f31101v2);
                alertDialog$Builder.f18446a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new nl0(this, 4));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f37548b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f30950e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.h71 h71Var = photoViewer.F2;
            if (h71Var == null || !h71Var.V) {
                AndroidUtilities.runOnUIThread(new rt0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.h71 h71Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        boolean z11;
        PhotoViewer photoViewer = this.f37548b;
        ArrayList arrayList = photoViewer.f30974g7;
        org.telegram.ui.Components.h71 h71Var2 = photoViewer.F2;
        if (h71Var2 != null) {
            if (!b5.d.u() && !photoViewer.f31061r) {
                z11 = false;
            } else {
                z11 = true;
            }
            h71Var2.O(z11);
        }
        if (this.f37547a && (h71Var = photoViewer.F2) != null && h71Var.p() != -9223372036854775807L) {
            this.f37547a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f30919a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.h71 h71Var3 = photoViewer.F2;
                        h71Var3.K(videoEditedInfo.start * ((float) h71Var3.p()));
                        at0 at0Var = photoViewer.R7;
                        if (at0Var != null) {
                            at0Var.setProgress(photoEntry.editedInfo.start);
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
        pf.e p5 = org.telegram.ui.Components.fg0.p();
        PhotoViewer photoViewer = this.f37548b;
        if (p5 != null && org.telegram.ui.Components.fg0.p().f40816b.f42251a != 0 && (textureView = photoViewer.f31112w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.fg0 fg0Var = org.telegram.ui.Components.fg0.f23911p0;
            TextureView textureView3 = null;
            if (fg0Var != null) {
                textureView2 = fg0Var.f23927l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (fg0Var != null) {
                textureView3 = fg0Var.f23927l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f31112w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f31112w3.setSurfaceTextureListener(photoViewer.f30997j4);
                photoViewer.f31112w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f37548b.x0(false);
        AndroidUtilities.runOnUIThread(new rt0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f37548b;
        if (photoViewer.f31131y2 != null) {
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
            ut0 ut0Var = photoViewer.f31131y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            ut0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.v61) {
                ((org.telegram.ui.Components.v61) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.v61 v61Var = (org.telegram.ui.Components.v61) photoViewer.B2;
                v61Var.d = i13;
                v61Var.e = i11;
                org.telegram.ui.Components.vz vzVar = v61Var.f28637b;
                if (vzVar != null) {
                    vzVar.postRunnable(new org.telegram.ui.Components.rz(vzVar, i13, i11, 0));
                }
                if (photoViewer.f30934c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f37548b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.P8;
        if (pVar != null) {
            pVar.run();
            photoViewer.P8 = null;
        }
        long j3 = aVar.e;
        if (j3 == photoViewer.W7) {
            photoViewer.V7 = j3;
            photoViewer.W7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.h71 h71Var = photoViewer.F2;
            if (h71Var == null || !h71Var.V) {
                AndroidUtilities.runOnUIThread(new rt0(this, 2), 64L);
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
