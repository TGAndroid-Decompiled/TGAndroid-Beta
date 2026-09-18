package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
public final class v20 implements View.OnClickListener {
    public final int f38270a;
    public final k60 f38271b;

    public v20(k60 k60Var, int i10) {
        this.f38270a = i10;
        this.f38271b = k60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f38270a;
        int i13 = 0;
        k60 k60Var = this.f38271b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = k60Var.f35058k1;
                org.telegram.ui.ActionBar.g1 g1Var = k60Var.f35103v1;
                org.telegram.ui.ActionBar.g1 g1Var2 = k60Var.f35099u1;
                org.telegram.ui.ActionBar.g1 g1Var3 = k60Var.f35077p1;
                ChatObject.Call call = k60Var.f35017a1;
                if (call != null && !k60Var.a2.f29038b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.j6.f18943hg;
                        g1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i14, false), org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                        g1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.j6.f19219wg;
                        g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i15, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                        g1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.j6.f19219wg;
                        g1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i16, false), org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        g1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.j6.f18943hg;
                        g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i17, false), org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                        g1Var.setChecked(false);
                    }
                    k60Var.f35061l0 = false;
                    w0Var.r(1);
                    w0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            g1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                string = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                            }
                            g1Var3.setSubtext(string);
                        } else if (currentAudioRoute == 0) {
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i10 = R.drawable.msg_voice_headphones;
                            } else {
                                i10 = R.drawable.msg_voice_phone;
                            }
                            g1Var3.setIcon(i10);
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i11 = R.string.VoipAudioRoutingHeadset;
                            } else {
                                i11 = R.string.VoipAudioRoutingPhone;
                            }
                            g1Var3.setSubtext(LocaleController.getString(i11));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                g1Var3.setIcon(R.drawable.msg_voice_speaker);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                g1Var3.setIcon(R.drawable.msg_voice_phone);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    k60Var.I1();
                    w0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (k60Var.r1()) {
                    if (sf.c.a(k60Var.f35050i0) > 0) {
                        org.telegram.ui.Components.voip.j1.n(k60Var.f35050i0);
                        k60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.c5.B(k60Var.f35050i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(k60Var.f35050i0)) {
                    org.telegram.ui.Components.z20.f30377e0 = false;
                    k60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.c5.A(k60Var.getContext()).o();
                    return;
                }
            case 2:
                k60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = k60Var.f35050i0;
                    if (launchActivity != null) {
                        k60Var.f35050i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = k60Var.f35017a1;
                if (call2 != null && call2.recording) {
                    k60Var.G1(k60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                k40 k40Var = k60Var.H;
                if (k40Var.m()) {
                    k40Var.j();
                    return;
                } else {
                    k40Var.d();
                    return;
                }
            case 5:
                k60.E(k60Var);
                return;
            case 6:
                int P0 = k60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    k60Var.Q.w0(0, P0, null);
                }
                org.telegram.ui.Components.eu euVar = k60Var.H.f25433a;
                euVar.requestFocus();
                AndroidUtilities.showKeyboard(euVar);
                return;
            case 7:
                ChatObject.Call call3 = k60Var.f35017a1;
                if (call3 != null && !call3.isScheduled() && !k60Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(k60Var.getContext(), false);
                        return;
                    }
                    return;
                }
                k60Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = k60Var.f35017a1;
                if (call4 != null && call4.recording) {
                    k60Var.G1(k60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = k60Var.f35017a1;
                if (call5 != null && call5.recording) {
                    k60Var.G1(k60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = k60Var.Y1;
                org.telegram.ui.Components.yi0 yi0Var = k60Var.G2;
                k60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (k60Var.H2 == 18) {
                        k60Var.H2 = 39;
                        yi0Var.P(39);
                        yi0Var.start();
                    } else {
                        yi0Var.N(0, false, false);
                        k60Var.H2 = 18;
                        yi0Var.P(18);
                        yi0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = uVar.f29248w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.f29220a;
                            if (uVar.J0 == null) {
                                uVar.K0 = false;
                                ImageView imageView = uVar.f29251x0;
                                if (imageView == null) {
                                    uVar.f29251x0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.f29251x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.f29251x0.setAlpha(0.0f);
                                } else {
                                    uVar.f29251x0.setAlpha(1.0f);
                                }
                                if (uVar.f29251x0.getParent() == null) {
                                    pVar.addView(uVar.f29251x0);
                                }
                                ((FrameLayout.LayoutParams) uVar.f29251x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.J0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.J0.setDuration(400L);
                                uVar.J0.setInterpolator(org.telegram.ui.Components.qr.f27383f);
                                uVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (k60Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                k60Var.y3 = Integer.valueOf(i13);
                k60Var.N1(true, true);
                k60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.id(k60Var, i13, 14));
                return;
        }
    }
}
