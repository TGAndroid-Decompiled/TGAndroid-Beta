package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rx implements org.telegram.ui.Components.b50 {
    public final ey f41247a;

    public rx(ey eyVar) {
        this.f41247a = eyVar;
    }

    @Override
    public final void E(float f7) {
        org.telegram.ui.Components.oc ocVar = this.f41247a.f37038e4;
        if (ocVar != null) {
            ((org.telegram.ui.Components.fc) ocVar.e).setProgress(f7 * 0.9f);
        }
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10;
        ey eyVar = this.f41247a;
        org.telegram.ui.Components.oc ocVar = eyVar.f37038e4;
        if (ocVar != null) {
            ocVar.b();
            eyVar.f37038e4 = null;
        }
        Activity parentActivity = eyVar.getParentActivity();
        g6Var = ((org.telegram.ui.ActionBar.o2) eyVar).resourceProvider;
        ?? lbVar = new org.telegram.ui.Components.lb(parentActivity, g6Var);
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(lbVar, parentActivity);
        lbVar.f26285b = ecVar;
        ecVar.setWillNotDraw(false);
        lbVar.addView(ecVar, w7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(parentActivity);
        lbVar.f26286c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ecVar.addView(u9Var, w7.z5.e(28, 28, 17));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, false, false, false);
        lbVar.d = o6Var;
        o6Var.setTypeface(Typeface.SANS_SERIF);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        lbVar.addView(o6Var, w7.z5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        lbVar.setTextColor(lbVar.getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        lbVar.setBackground(lbVar.getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        if (z10) {
            u9Var.setImageBitmap(eyVar.f37022b4.f25190r);
        } else {
            u9Var.setImageBitmap(PhotoViewer.u1().C4.getBitmap());
        }
        Activity parentActivity2 = eyVar.getParentActivity();
        g6Var2 = ((org.telegram.ui.ActionBar.o2) eyVar).resourceProvider;
        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(parentActivity2, g6Var2, true);
        mcVar.e(LocaleController.getString(R.string.ViewAction));
        mcVar.f28574b = new ti(this, 26);
        lbVar.setButton(mcVar);
        lbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        o6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.oc b10 = org.telegram.ui.Components.vc.a0(eyVar).b(lbVar, -1);
        eyVar.f37038e4 = b10;
        b10.f29211r = false;
        b10.i(false);
        org.telegram.ui.Components.oc ocVar2 = eyVar.f37038e4;
        ocVar2.f29212s = true;
        ocVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                rx rxVar = rx.this;
                ey eyVar = rxVar.f41247a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    eyVar.f37028c4 = photoSize2.location;
                    eyVar.f37033d4 = photoSize.location;
                } else if (eyVar.f37028c4 == null) {
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
                kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                kVar.m().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final lu0 getCloseIntoObject() {
        ey eyVar = this.f41247a;
        org.telegram.ui.Components.oc ocVar = eyVar.f37038e4;
        if (ocVar != null) {
            org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) ocVar.e;
            lu0 lu0Var = new lu0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.u9 u9Var = fcVar.f26286c;
            org.telegram.ui.Components.u9 u9Var2 = fcVar.f26286c;
            u9Var.getLocationInWindow(iArr);
            lu0Var.f39382b = iArr[0];
            lu0Var.f39383c = iArr[1];
            lu0Var.d = eyVar.fragmentView;
            ImageReceiver imageReceiver = u9Var2.getImageReceiver();
            lu0Var.f39381a = imageReceiver;
            lu0Var.e = imageReceiver.getBitmapSafe();
            lu0Var.f39386i = 0;
            lu0Var.h = lu0Var.f39381a.getRoundRadius();
            lu0Var.f39388k = u9Var2.getScaleX();
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
