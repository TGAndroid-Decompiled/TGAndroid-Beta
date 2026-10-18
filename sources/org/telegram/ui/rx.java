package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rx implements org.telegram.ui.Components.d50 {
    public final ey f40848a;

    public rx(ey eyVar) {
        this.f40848a = eyVar;
    }

    @Override
    public final void F(float f7) {
        org.telegram.ui.Components.qc qcVar = this.f40848a.f36657e4;
        if (qcVar != null) {
            ((org.telegram.ui.Components.hc) qcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        ey eyVar = this.f40848a;
        org.telegram.ui.Components.qc qcVar = eyVar.f36657e4;
        if (qcVar != null) {
            qcVar.b();
            eyVar.f36657e4 = null;
        }
        Activity parentActivity = eyVar.getParentActivity();
        d6Var = ((org.telegram.ui.ActionBar.n2) eyVar).resourceProvider;
        ?? nbVar = new org.telegram.ui.Components.nb(parentActivity, d6Var);
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(nbVar, parentActivity);
        nbVar.f26853b = gcVar;
        gcVar.setWillNotDraw(false);
        nbVar.addView(gcVar, w7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
        nbVar.f26854c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        gcVar.addView(w9Var, w7.z5.e(28, 28, 17));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(parentActivity, false, false, false);
        nbVar.d = q6Var;
        q6Var.setTypeface(Typeface.SANS_SERIF);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        nbVar.addView(q6Var, w7.z5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        nbVar.setTextColor(nbVar.getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        nbVar.setBackground(nbVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        if (z10) {
            w9Var.setImageBitmap(eyVar.f36641b4.f25817r);
        } else {
            w9Var.setImageBitmap(PhotoViewer.t1().C4.getBitmap());
        }
        Activity parentActivity2 = eyVar.getParentActivity();
        d6Var2 = ((org.telegram.ui.ActionBar.n2) eyVar).resourceProvider;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(parentActivity2, d6Var2, true);
        ocVar.e(LocaleController.getString(R.string.ViewAction));
        ocVar.f28925a = new vi(this, 26);
        nbVar.setButton(ocVar);
        nbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        q6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.xc.a0(eyVar).b(nbVar, -1);
        eyVar.f36657e4 = b10;
        b10.f29653r = false;
        b10.i(false);
        org.telegram.ui.Components.qc qcVar2 = eyVar.f36657e4;
        qcVar2.f29654s = true;
        qcVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                rx rxVar = rx.this;
                ey eyVar = rxVar.f40848a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    eyVar.f36647c4 = photoSize2.location;
                    eyVar.f36652d4 = photoSize.location;
                } else if (eyVar.f36647c4 == null) {
                    return;
                } else {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    eyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ai.w9(rxVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final lu0 getCloseIntoObject() {
        ey eyVar = this.f40848a;
        org.telegram.ui.Components.qc qcVar = eyVar.f36657e4;
        if (qcVar != null) {
            org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
            lu0 lu0Var = new lu0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.w9 w9Var = hcVar.f26854c;
            org.telegram.ui.Components.w9 w9Var2 = hcVar.f26854c;
            w9Var.getLocationInWindow(iArr);
            lu0Var.f38962b = iArr[0];
            lu0Var.f38963c = iArr[1];
            lu0Var.d = eyVar.fragmentView;
            ImageReceiver imageReceiver = w9Var2.getImageReceiver();
            lu0Var.f38961a = imageReceiver;
            lu0Var.e = imageReceiver.getBitmapSafe();
            lu0Var.f38966i = 0;
            lu0Var.h = lu0Var.f38961a.getRoundRadius();
            lu0Var.f38968k = w9Var2.getScaleX();
            return lu0Var;
        }
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void P() {
    }
}
