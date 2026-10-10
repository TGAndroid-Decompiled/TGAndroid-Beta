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
public final class qt0 implements org.telegram.ui.Components.i81 {
    public boolean f41230a = true;
    public final PhotoViewer f41231b;

    public qt0(PhotoViewer photoViewer) {
        this.f41231b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.l81 l81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f41231b;
        if (photoViewer.F2 == l81Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f34028o0.f21583b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f34120y, 0, photoViewer.f34093v2);
                alertDialog$Builder.f20378a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new hq0(this, 2));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f41231b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f33942e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.l81 l81Var = photoViewer.F2;
            if (l81Var == null || !l81Var.V) {
                AndroidUtilities.runOnUIThread(new pt0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.l81 l81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        org.telegram.ui.Components.l81 l81Var2;
        boolean z11;
        PhotoViewer photoViewer = this.f41231b;
        ArrayList arrayList = photoViewer.f33966g7;
        org.telegram.ui.Components.l81 l81Var3 = photoViewer.F2;
        if (l81Var3 != null) {
            if (!b5.d.u() && !photoViewer.f34053r) {
                z11 = false;
            } else {
                z11 = true;
            }
            l81Var3.O(z11);
        }
        if (this.f41230a && (l81Var = photoViewer.F2) != null && l81Var.p() != -9223372036854775807L) {
            this.f41230a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f33910a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K(videoEditedInfo.start * ((float) l81Var2.p()));
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
        qf.e p5 = org.telegram.ui.Components.hh0.p();
        PhotoViewer photoViewer = this.f41231b;
        if (p5 != null && org.telegram.ui.Components.hh0.p().f46207b.f48024a != 0 && (textureView = photoViewer.f34104w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.hh0 hh0Var = org.telegram.ui.Components.hh0.f27011p0;
            TextureView textureView3 = null;
            if (hh0Var != null) {
                textureView2 = hh0Var.f27028l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (hh0Var != null) {
                textureView3 = hh0Var.f27028l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f34104w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f34104w3.setSurfaceTextureListener(photoViewer.f33989j4);
                photoViewer.f34104w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41231b.x0(false);
        AndroidUtilities.runOnUIThread(new pt0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f41231b;
        if (photoViewer.f34123y2 != null) {
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
            tt0 tt0Var = photoViewer.f34123y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            tt0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.a81) {
                ((org.telegram.ui.Components.a81) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.a81 a81Var = (org.telegram.ui.Components.a81) photoViewer.B2;
                a81Var.d = i13;
                a81Var.f24511e = i11;
                org.telegram.ui.Components.m00 m00Var = a81Var.f24509b;
                if (m00Var != null) {
                    m00Var.postRunnable(new org.telegram.ui.Components.i00(m00Var, i13, i11, 0));
                }
                if (photoViewer.f33925c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f41231b;
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
            org.telegram.ui.Components.l81 l81Var = photoViewer.F2;
            if (l81Var == null || !l81Var.V) {
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
