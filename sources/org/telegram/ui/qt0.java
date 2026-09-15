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
public final class qt0 implements org.telegram.ui.Components.d71 {
    public boolean f36935a = true;
    public final PhotoViewer f36936b;

    public qt0(PhotoViewer photoViewer) {
        this.f36936b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.g71 g71Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f36936b;
        if (photoViewer.F2 == g71Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f31022o0.f19578b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f31114y, 0, photoViewer.f31087v2);
                alertDialog$Builder.f18437a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new tl0(this, 3));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f36936b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f30936e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
            if (g71Var == null || !g71Var.V) {
                AndroidUtilities.runOnUIThread(new pt0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.g71 g71Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        boolean z11;
        PhotoViewer photoViewer = this.f36936b;
        ArrayList arrayList = photoViewer.f30960g7;
        org.telegram.ui.Components.g71 g71Var2 = photoViewer.F2;
        if (g71Var2 != null) {
            if (!b5.d.u() && !photoViewer.f31047r) {
                z11 = false;
            } else {
                z11 = true;
            }
            g71Var2.O(z11);
        }
        if (this.f36935a && (g71Var = photoViewer.F2) != null && g71Var.p() != -9223372036854775807L) {
            this.f36935a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f30905a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        org.telegram.ui.Components.g71 g71Var3 = photoViewer.F2;
                        g71Var3.K(videoEditedInfo.start * ((float) g71Var3.p()));
                        ys0 ys0Var = photoViewer.R7;
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
        pf.e p5 = org.telegram.ui.Components.eg0.p();
        PhotoViewer photoViewer = this.f36936b;
        if (p5 != null && org.telegram.ui.Components.eg0.p().f40794b.f42229a != 0 && (textureView = photoViewer.f31098w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.eg0 eg0Var = org.telegram.ui.Components.eg0.f23638p0;
            TextureView textureView3 = null;
            if (eg0Var != null) {
                textureView2 = eg0Var.f23654l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (eg0Var != null) {
                textureView3 = eg0Var.f23654l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f31098w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f31098w3.setSurfaceTextureListener(photoViewer.f30983j4);
                photoViewer.f31098w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f36936b.x0(false);
        AndroidUtilities.runOnUIThread(new pt0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f36936b;
        if (photoViewer.f31117y2 != null) {
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
            st0 st0Var = photoViewer.f31117y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            st0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.u61) {
                ((org.telegram.ui.Components.u61) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) photoViewer.B2;
                u61Var.d = i13;
                u61Var.e = i11;
                org.telegram.ui.Components.vz vzVar = u61Var.f28300b;
                if (vzVar != null) {
                    vzVar.postRunnable(new org.telegram.ui.Components.rz(vzVar, i13, i11, 0));
                }
                if (photoViewer.f30920c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f36936b;
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
            org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
            if (g71Var == null || !g71Var.V) {
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
