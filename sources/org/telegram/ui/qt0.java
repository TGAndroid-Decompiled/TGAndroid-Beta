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
public final class qt0 implements org.telegram.ui.Components.h81 {
    public boolean f41184a = true;
    public final PhotoViewer f41185b;

    public qt0(PhotoViewer photoViewer) {
        this.f41185b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.k81 k81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f41185b;
        if (photoViewer.F2 == k81Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f33990o0.f21579b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f34082y, 0, photoViewer.f34055v2);
                alertDialog$Builder.f20374a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new hq0(this, 2));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f41185b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f33904e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.k81 k81Var = photoViewer.F2;
            if (k81Var == null || !k81Var.V) {
                AndroidUtilities.runOnUIThread(new pt0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.k81 k81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        org.telegram.ui.Components.k81 k81Var2;
        boolean z11;
        PhotoViewer photoViewer = this.f41185b;
        ArrayList arrayList = photoViewer.f33928g7;
        org.telegram.ui.Components.k81 k81Var3 = photoViewer.F2;
        if (k81Var3 != null) {
            if (!b5.d.u() && !photoViewer.f34015r) {
                z11 = false;
            } else {
                z11 = true;
            }
            k81Var3.O(z11);
        }
        if (this.f41184a && (k81Var = photoViewer.F2) != null && k81Var.p() != -9223372036854775807L) {
            this.f41184a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f33872a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K(videoEditedInfo.start * ((float) k81Var2.p()));
                        ys0 ys0Var = photoViewer.S7;
                        if (ys0Var != null) {
                            ys0Var.setProgress(photoEntry.editedInfo.start);
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
        qf.e p5 = org.telegram.ui.Components.gh0.p();
        PhotoViewer photoViewer = this.f41185b;
        if (p5 != null && org.telegram.ui.Components.gh0.p().f46161b.f47978a != 0 && (textureView = photoViewer.f34066w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.gh0 gh0Var = org.telegram.ui.Components.gh0.f26700p0;
            TextureView textureView3 = null;
            if (gh0Var != null) {
                textureView2 = gh0Var.f26717l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (gh0Var != null) {
                textureView3 = gh0Var.f26717l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f34066w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f34066w3.setSurfaceTextureListener(photoViewer.f33951j4);
                photoViewer.f34066w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41185b.x0(false);
        AndroidUtilities.runOnUIThread(new pt0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f41185b;
        if (photoViewer.f34085y2 != null) {
            float f11 = i10 * f7;
            int i13 = (int) f11;
            photoViewer.U = i13;
            float f12 = i11;
            int i14 = (int) (f7 * f12);
            photoViewer.V = i14;
            qf.e eVar = photoViewer.G2;
            if (eVar != null) {
                eVar.d(i13, i14);
            }
            tt0 tt0Var = photoViewer.f34085y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            tt0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.z71) {
                ((org.telegram.ui.Components.z71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.z71 z71Var = (org.telegram.ui.Components.z71) photoViewer.B2;
                z71Var.d = i13;
                z71Var.f33493e = i11;
                org.telegram.ui.Components.l00 l00Var = z71Var.f33491b;
                if (l00Var != null) {
                    l00Var.postRunnable(new org.telegram.ui.Components.h00(l00Var, i13, i11, 0));
                }
                if (photoViewer.f33887c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f41185b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.Q8;
        if (pVar != null) {
            pVar.run();
            photoViewer.Q8 = null;
        }
        long j3 = aVar.f13680e;
        if (j3 == photoViewer.X7) {
            photoViewer.W7 = j3;
            photoViewer.X7 = -1L;
            PhotoViewer.V(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.k81 k81Var = photoViewer.F2;
            if (k81Var == null || !k81Var.V) {
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
