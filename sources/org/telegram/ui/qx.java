package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qx implements org.telegram.ui.Components.f50 {
    public final ey f42804a;

    public qx(ey eyVar) {
        this.f42804a = eyVar;
    }

    @Override
    public final void F(float f7) {
        org.telegram.ui.Components.qc qcVar = this.f42804a.f39002e4;
        if (qcVar != null) {
            ((org.telegram.ui.Components.hc) qcVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i10;
        ey eyVar = this.f42804a;
        org.telegram.ui.Components.qc qcVar = eyVar.f39002e4;
        if (qcVar != null) {
            qcVar.b();
            eyVar.f39002e4 = null;
        }
        Activity parentActivity = eyVar.getParentActivity();
        u6Var = ((org.telegram.ui.ActionBar.r2) eyVar).resourceProvider;
        ?? nbVar = new org.telegram.ui.Components.nb(parentActivity, u6Var);
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(nbVar, parentActivity);
        nbVar.f28952b = gcVar;
        gcVar.setWillNotDraw(false);
        nbVar.addView(gcVar, org.telegram.ui.Components.kb1.m(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
        nbVar.f28953c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        gcVar.addView(y9Var, org.telegram.ui.Components.kb1.i(28, 28, 17));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(parentActivity, false, false, false);
        nbVar.d = s6Var;
        s6Var.setTypeface(Typeface.SANS_SERIF);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        nbVar.addView(s6Var, org.telegram.ui.Components.kb1.m(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        nbVar.setTextColor(nbVar.getThemedColor(org.telegram.ui.ActionBar.y6.Hi));
        nbVar.setBackground(nbVar.getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
        if (z10) {
            y9Var.setImageBitmap(eyVar.f38986b4.f28393r);
        } else {
            y9Var.setImageBitmap(PhotoViewer.v1().C4.getBitmap());
        }
        Activity parentActivity2 = eyVar.getParentActivity();
        u6Var2 = ((org.telegram.ui.ActionBar.r2) eyVar).resourceProvider;
        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(parentActivity2, u6Var2, true);
        ocVar.e(LocaleController.getString(R.string.ViewAction));
        ocVar.f31259b = new xi(this, 23);
        nbVar.setButton(ocVar);
        nbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        s6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.qc b10 = org.telegram.ui.Components.wc.b0(eyVar).b(nbVar, -1);
        eyVar.f39002e4 = b10;
        b10.f31870s = false;
        b10.i(false);
        org.telegram.ui.Components.qc qcVar2 = eyVar.f39002e4;
        qcVar2.f31871t = true;
        qcVar2.j();
    }

    @Override
    public final void R(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                qx qxVar = qx.this;
                ey eyVar = qxVar.f42804a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    eyVar.f38992c4 = photoSize2.location;
                    eyVar.f38997d4 = photoSize.location;
                } else if (eyVar.f38992c4 == null) {
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
                    eyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bi.r9(qxVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
                kVar.l().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final su0 getCloseIntoObject() {
        ey eyVar = this.f42804a;
        org.telegram.ui.Components.qc qcVar = eyVar.f39002e4;
        if (qcVar != null) {
            org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
            su0 su0Var = new su0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.y9 y9Var = hcVar.f28953c;
            org.telegram.ui.Components.y9 y9Var2 = hcVar.f28953c;
            y9Var.getLocationInWindow(iArr);
            su0Var.f43407b = iArr[0];
            su0Var.f43408c = iArr[1];
            su0Var.d = eyVar.fragmentView;
            ImageReceiver imageReceiver = y9Var2.getImageReceiver();
            su0Var.f43406a = imageReceiver;
            su0Var.e = imageReceiver.getBitmapSafe();
            su0Var.f43411i = 0;
            su0Var.h = su0Var.f43406a.getRoundRadius();
            su0Var.f43413k = y9Var2.getScaleX();
            return su0Var;
        }
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean u() {
        return true;
    }

    @Override
    public final void Q() {
    }
}
