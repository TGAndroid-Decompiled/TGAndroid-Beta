package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qx implements org.telegram.ui.Components.d40 {
    public final dy f42216a;

    public qx(dy dyVar) {
        this.f42216a = dyVar;
    }

    @Override
    public final void D(float f10) {
        org.telegram.ui.Components.gc gcVar = this.f42216a.f37631a4;
        if (gcVar != null) {
            ((org.telegram.ui.Components.xb) gcVar.f28733e).setProgress(f10 * 0.9f);
        }
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i9;
        dy dyVar = this.f42216a;
        org.telegram.ui.Components.gc gcVar = dyVar.f37631a4;
        if (gcVar != null) {
            gcVar.b();
            dyVar.f37631a4 = null;
        }
        Activity parentActivity = dyVar.getParentActivity();
        b6Var = ((org.telegram.ui.ActionBar.o2) dyVar).resourceProvider;
        ?? ebVar = new org.telegram.ui.Components.eb(parentActivity, b6Var);
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(ebVar, parentActivity);
        ebVar.f34634b = wbVar;
        wbVar.setWillNotDraw(false);
        ebVar.addView(wbVar, g7.e6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(parentActivity);
        ebVar.f34635c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        wbVar.addView(o9Var, g7.e6.e(28, 28, 17));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, false, false, false);
        ebVar.d = j6Var;
        j6Var.setTypeface(Typeface.SANS_SERIF);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ebVar.addView(j6Var, g7.e6.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        ebVar.setTextColor(ebVar.getThemedColor(org.telegram.ui.ActionBar.f6.Hi));
        ebVar.setBackground(ebVar.getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
        if (z10) {
            o9Var.setImageBitmap(dyVar.X3.f27915r);
        } else {
            o9Var.setImageBitmap(PhotoViewer.t1().f35802y4.getBitmap());
        }
        Activity parentActivity2 = dyVar.getParentActivity();
        b6Var2 = ((org.telegram.ui.ActionBar.o2) dyVar).resourceProvider;
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(parentActivity2, b6Var2, true);
        ecVar.e(LocaleController.getString(R.string.ViewAction));
        ecVar.f27999a = new ri(this, 25);
        ebVar.setButton(ecVar);
        ebVar.getButton().setVisibility(8);
        if (z11) {
            i9 = R.string.YourProfileVideoUploading;
        } else {
            i9 = R.string.YourProfilePhotoUploading;
        }
        j6Var.c(LocaleController.getString(i9), true, true);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.oc.a0(dyVar).b(ebVar, -1);
        dyVar.f37631a4 = b10;
        b10.f28745r = false;
        b10.i(false);
        org.telegram.ui.Components.gc gcVar2 = dyVar.f37631a4;
        gcVar2.f28746s = true;
        gcVar2.j();
    }

    @Override
    public final void P(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                qx qxVar = qx.this;
                dy dyVar = qxVar.f42216a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    dyVar.Y3 = photoSize2.location;
                    dyVar.Z3 = photoSize.location;
                } else if (dyVar.Y3 == null) {
                    return;
                } else {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i9 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i9 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    dyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new gh.m7(qxVar, str, z10, 5));
                }
                kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final bu0 getCloseIntoObject() {
        dy dyVar = this.f42216a;
        org.telegram.ui.Components.gc gcVar = dyVar.f37631a4;
        if (gcVar != null) {
            org.telegram.ui.Components.xb xbVar = (org.telegram.ui.Components.xb) gcVar.f28733e;
            bu0 bu0Var = new bu0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.o9 o9Var = xbVar.f34635c;
            org.telegram.ui.Components.o9 o9Var2 = xbVar.f34635c;
            o9Var.getLocationInWindow(iArr);
            bu0Var.f36979b = iArr[0];
            bu0Var.f36980c = iArr[1];
            bu0Var.d = dyVar.fragmentView;
            ImageReceiver imageReceiver = o9Var2.getImageReceiver();
            bu0Var.f36978a = imageReceiver;
            bu0Var.f36981e = imageReceiver.getBitmapSafe();
            bu0Var.f36984i = 0;
            bu0Var.h = bu0Var.f36978a.getRoundRadius();
            bu0Var.f36986k = o9Var2.getScaleX();
            return bu0Var;
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
    public final void O() {
    }
}
