package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class tx implements org.telegram.ui.Components.i40 {

    public final gy f43026a;

    public tx(gy gyVar) {
        this.f43026a = gyVar;
    }

    @Override
    public final void E(float f10) {
        org.telegram.ui.Components.ec ecVar = this.f43026a.f38500a4;
        if (ecVar != null) {
            ((org.telegram.ui.Components.vb) ecVar.f28016e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        gy gyVar = this.f43026a;
        org.telegram.ui.Components.ec ecVar = gyVar.f38500a4;
        if (ecVar != null) {
            ecVar.b();
            gyVar.f38500a4 = null;
        }
        Activity parentActivity = gyVar.getParentActivity();
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(parentActivity, ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider);
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(vbVar, parentActivity);
        vbVar.f33341b = ubVar;
        ubVar.setWillNotDraw(false);
        vbVar.addView(ubVar, h7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(parentActivity);
        vbVar.f33342c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ubVar.addView(n9Var, h7.z5.e(28, 28, 17));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, false, false, false);
        vbVar.d = j6Var;
        j6Var.setTypeface(Typeface.SANS_SERIF);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        vbVar.addView(j6Var, h7.z5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        vbVar.setTextColor(vbVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        vbVar.setBackground(vbVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        if (z10) {
            n9Var.setImageBitmap(gyVar.X3.f29575r);
        } else {
            n9Var.setImageBitmap(PhotoViewer.t1().f35805y4.getBitmap());
        }
        org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(gyVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider, true);
        ccVar.e(LocaleController.getString(R.string.ViewAction));
        ccVar.f27402a = new ti(this, 25);
        vbVar.setButton(ccVar);
        vbVar.getButton().setVisibility(8);
        j6Var.c(LocaleController.getString(z11 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.ec ecVarB = org.telegram.ui.Components.mc.a0(gyVar).b(vbVar, -1);
        gyVar.f38500a4 = ecVarB;
        ecVarB.f28028r = false;
        ecVarB.i(false);
        org.telegram.ui.Components.ec ecVar2 = gyVar.f38500a4;
        ecVar2.f28029s = true;
        ecVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                tx txVar = this.f42703a;
                gy gyVar = txVar.f43026a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    gyVar.Y3 = photoSize2.location;
                    gyVar.Z3 = photoSize.location;
                } else {
                    if (gyVar.Y3 == null) {
                        return;
                    }
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
                    gyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new hh.l7(txVar, str, z10, 4));
                }
                ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final cu0 getCloseIntoObject() {
        gy gyVar = this.f43026a;
        org.telegram.ui.Components.ec ecVar = gyVar.f38500a4;
        if (ecVar == null) {
            return null;
        }
        org.telegram.ui.Components.vb vbVar = (org.telegram.ui.Components.vb) ecVar.f28016e;
        cu0 cu0Var = new cu0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.n9 n9Var = vbVar.f33342c;
        org.telegram.ui.Components.n9 n9Var2 = vbVar.f33342c;
        n9Var.getLocationInWindow(iArr);
        cu0Var.f37154b = iArr[0];
        cu0Var.f37155c = iArr[1];
        cu0Var.d = gyVar.fragmentView;
        ImageReceiver imageReceiver = n9Var2.getImageReceiver();
        cu0Var.f37153a = imageReceiver;
        cu0Var.f37156e = imageReceiver.getBitmapSafe();
        cu0Var.f37159i = 0;
        cu0Var.h = cu0Var.f37153a.getRoundRadius();
        cu0Var.f37161k = n9Var2.getScaleX();
        return cu0Var;
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
