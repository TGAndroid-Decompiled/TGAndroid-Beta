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
public final class ws0 implements org.telegram.ui.Components.y71 {
    public boolean f42944a = true;
    public final PhotoViewer f42945b;

    public ws0(PhotoViewer photoViewer) {
        this.f42945b = photoViewer;
    }

    @Override
    public final void onError(org.telegram.ui.Components.b81 b81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.f42945b;
        if (photoViewer.F2 == b81Var) {
            FileLog.e(exc);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.f33359o0.f21729b;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) != null && findViewWithTag.getVisibility() == 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.f33451y, 0, photoViewer.f33424v2);
                alertDialog$Builder.f20602a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.f20602a.T = LocaleController.getString(R.string.CantPlayVideo);
                alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new pp0(this, 2));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                photoViewer.S2(alertDialog$Builder);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.f42945b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.f33272e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.b81 b81Var = photoViewer.F2;
            if (b81Var == null || !b81Var.V) {
                AndroidUtilities.runOnUIThread(new vs0(this, 1), 64L);
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.b81 b81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        org.telegram.ui.Components.b81 b81Var2;
        boolean z11;
        PhotoViewer photoViewer = this.f42945b;
        ArrayList arrayList = photoViewer.f33296g7;
        org.telegram.ui.Components.b81 b81Var3 = photoViewer.F2;
        if (b81Var3 != null) {
            if (!b5.d.u() && !photoViewer.f33384r) {
                z11 = false;
            } else {
                z11 = true;
            }
            b81Var3.O(z11);
        }
        if (this.f42944a && (b81Var = photoViewer.F2) != null && b81Var.p() != -9223372036854775807L) {
            this.f42944a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.f33241a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K(videoEditedInfo.start * ((float) b81Var2.p()));
                        es0 es0Var = photoViewer.S7;
                        if (es0Var != null) {
                            es0Var.setProgress(photoEntry.editedInfo.start);
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
        rf.d p5 = org.telegram.ui.Components.zg0.p();
        PhotoViewer photoViewer = this.f42945b;
        if (p5 != null && org.telegram.ui.Components.zg0.p().f45264b.f47009a != 0 && (textureView = photoViewer.f33435w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.zg0 zg0Var = org.telegram.ui.Components.zg0.f32927p0;
            TextureView textureView3 = null;
            if (zg0Var != null) {
                textureView2 = zg0Var.f32943l0;
            } else {
                textureView2 = null;
            }
            textureView2.setSurfaceTexture(surfaceTexture);
            if (zg0Var != null) {
                textureView3 = zg0Var.f32943l0;
            }
            textureView3.setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.f33435w3.setSurfaceTexture(surfaceTexture);
                photoViewer.f33435w3.setSurfaceTextureListener(photoViewer.f33320j4);
                photoViewer.f33435w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f42945b.x0(false);
        AndroidUtilities.runOnUIThread(new vs0(this, 0));
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        PhotoViewer photoViewer = this.f42945b;
        if (photoViewer.f33454y2 != null) {
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
            ys0 ys0Var = photoViewer.f33454y2;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / f12;
            }
            ys0Var.a(f10, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.q71) {
                ((org.telegram.ui.Components.q71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.q71 q71Var = (org.telegram.ui.Components.q71) photoViewer.B2;
                q71Var.d = i13;
                q71Var.e = i11;
                org.telegram.ui.Components.e00 e00Var = q71Var.f29538b;
                if (e00Var != null) {
                    e00Var.postRunnable(new org.telegram.ui.Components.a00(e00Var, i13, i11, 0));
                }
                if (photoViewer.f33256c2 == 1) {
                    photoViewer.z2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.f42945b;
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
            org.telegram.ui.Components.b81 b81Var = photoViewer.F2;
            if (b81Var == null || !b81Var.V) {
                AndroidUtilities.runOnUIThread(new vs0(this, 2), 64L);
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
