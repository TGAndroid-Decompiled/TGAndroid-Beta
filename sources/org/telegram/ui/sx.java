package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sx implements org.telegram.ui.Components.r40 {
    public final fy f42477a;

    public sx(fy fyVar) {
        this.f42477a = fyVar;
    }

    @Override
    public final void D(float f9) {
        org.telegram.ui.Components.mc mcVar = this.f42477a.f38259a4;
        if (mcVar != null) {
            ((org.telegram.ui.Components.dc) mcVar.f30648e).setProgress(f9 * 0.9f);
        }
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i10;
        fy fyVar = this.f42477a;
        org.telegram.ui.Components.mc mcVar = fyVar.f38259a4;
        if (mcVar != null) {
            mcVar.b();
            fyVar.f38259a4 = null;
        }
        Activity parentActivity = fyVar.getParentActivity();
        c6Var = ((org.telegram.ui.ActionBar.o2) fyVar).resourceProvider;
        ?? jbVar = new org.telegram.ui.Components.jb(parentActivity, c6Var);
        org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(jbVar, parentActivity);
        jbVar.f27731b = ccVar;
        ccVar.setWillNotDraw(false);
        jbVar.addView(ccVar, i7.f6.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(parentActivity);
        jbVar.f27732c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ccVar.addView(t9Var, i7.f6.e(28, 28, 17));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(parentActivity, false, false, false);
        jbVar.d = o6Var;
        o6Var.setTypeface(Typeface.SANS_SERIF);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        jbVar.addView(o6Var, i7.f6.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        jbVar.setTextColor(jbVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        jbVar.setBackground(jbVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        if (z10) {
            t9Var.setImageBitmap(fyVar.X3.f32475r);
        } else {
            t9Var.setImageBitmap(PhotoViewer.t1().f35869y4.getBitmap());
        }
        Activity parentActivity2 = fyVar.getParentActivity();
        c6Var2 = ((org.telegram.ui.ActionBar.o2) fyVar).resourceProvider;
        org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(parentActivity2, c6Var2, true);
        kcVar.e(LocaleController.getString(R.string.ViewAction));
        kcVar.f30007a = new ui(this, 25);
        jbVar.setButton(kcVar);
        jbVar.getButton().setVisibility(8);
        if (z11) {
            i10 = R.string.YourProfileVideoUploading;
        } else {
            i10 = R.string.YourProfilePhotoUploading;
        }
        o6Var.c(LocaleController.getString(i10), true, true);
        org.telegram.ui.Components.mc b10 = org.telegram.ui.Components.tc.a0(fyVar).b(jbVar, -1);
        fyVar.f38259a4 = b10;
        b10.f30660r = false;
        b10.i(false);
        org.telegram.ui.Components.mc mcVar2 = fyVar.f38259a4;
        mcVar2.f30661s = true;
        mcVar2.j();
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                org.telegram.ui.ActionBar.l lVar;
                sx sxVar = sx.this;
                fy fyVar = sxVar.f42477a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    fyVar.Y3 = photoSize2.location;
                    fyVar.Z3 = photoSize.location;
                } else if (fyVar.Y3 == null) {
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
                    fyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jh.j7(sxVar, str, z10, 4));
                }
                lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                lVar.n().requestLayout();
            }
        });
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final zt0 getCloseIntoObject() {
        fy fyVar = this.f42477a;
        org.telegram.ui.Components.mc mcVar = fyVar.f38259a4;
        if (mcVar != null) {
            org.telegram.ui.Components.dc dcVar = (org.telegram.ui.Components.dc) mcVar.f30648e;
            zt0 zt0Var = new zt0();
            int[] iArr = new int[2];
            org.telegram.ui.Components.t9 t9Var = dcVar.f27732c;
            org.telegram.ui.Components.t9 t9Var2 = dcVar.f27732c;
            t9Var.getLocationInWindow(iArr);
            zt0Var.f45317b = iArr[0];
            zt0Var.f45318c = iArr[1];
            zt0Var.d = fyVar.fragmentView;
            ImageReceiver imageReceiver = t9Var2.getImageReceiver();
            zt0Var.f45316a = imageReceiver;
            zt0Var.f45319e = imageReceiver.getBitmapSafe();
            zt0Var.f45322i = 0;
            zt0Var.h = zt0Var.f45316a.getRoundRadius();
            zt0Var.f45324k = t9Var2.getScaleX();
            return zt0Var;
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
    public final void P() {
    }
}
