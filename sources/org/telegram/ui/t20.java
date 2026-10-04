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
public final class t20 implements View.OnClickListener {
    public final int f40682a;
    public final h60 f40683b;

    public t20(h60 h60Var, int i10) {
        this.f40682a = i10;
        this.f40683b = h60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f40682a;
        int i13 = 0;
        h60 h60Var = this.f40683b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.v0 v0Var = h60Var.f36921k1;
                org.telegram.ui.ActionBar.f1 f1Var = h60Var.f36966v1;
                org.telegram.ui.ActionBar.f1 f1Var2 = h60Var.f36962u1;
                org.telegram.ui.ActionBar.f1 f1Var3 = h60Var.f36940p1;
                ChatObject.Call call = h60Var.f36879a1;
                if (call != null && !h60Var.a2.f31982b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.i6.f20903hg;
                        f1Var2.c(org.telegram.ui.ActionBar.i6.w0(null, i14, false), org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                        f1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.i6.f21183wg;
                        f1Var.c(org.telegram.ui.ActionBar.i6.w0(null, i15, false), org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                        f1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.i6.f21183wg;
                        f1Var2.c(org.telegram.ui.ActionBar.i6.w0(null, i16, false), org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                        f1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.i6.f20903hg;
                        f1Var.c(org.telegram.ui.ActionBar.i6.w0(null, i17, false), org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                        f1Var.setChecked(false);
                    }
                    h60Var.f36924l0 = false;
                    v0Var.r(1);
                    v0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            f1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                string = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                            }
                            f1Var3.setSubtext(string);
                        } else if (currentAudioRoute == 0) {
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i10 = R.drawable.msg_voice_headphones;
                            } else {
                                i10 = R.drawable.msg_voice_phone;
                            }
                            f1Var3.setIcon(i10);
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i11 = R.string.VoipAudioRoutingHeadset;
                            } else {
                                i11 = R.string.VoipAudioRoutingPhone;
                            }
                            f1Var3.setSubtext(LocaleController.getString(i11));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                f1Var3.setIcon(R.drawable.msg_voice_speaker);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                f1Var3.setIcon(R.drawable.msg_voice_phone);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    h60Var.I1();
                    v0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (h60Var.r1()) {
                    if (sf.c.a(h60Var.f36913i0) > 0) {
                        org.telegram.ui.Components.voip.k1.n(h60Var.f36913i0);
                        h60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.e5.B(h60Var.f36913i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(h60Var.f36913i0)) {
                    org.telegram.ui.Components.d30.f25538e0 = false;
                    h60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.e5.A(h60Var.getContext()).o();
                    return;
                }
            case 2:
                h60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = h60Var.f36913i0;
                    if (launchActivity != null) {
                        h60Var.f36913i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = h60Var.f36879a1;
                if (call2 != null && call2.recording) {
                    h60Var.G1(h60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                i40 i40Var = h60Var.H;
                if (i40Var.m()) {
                    i40Var.j();
                    return;
                } else {
                    i40Var.d();
                    return;
                }
            case 5:
                h60.C(h60Var);
                return;
            case 6:
                int P0 = h60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    h60Var.Q.w0(0, P0, null);
                }
                org.telegram.ui.Components.hu huVar = h60Var.H.f28710a;
                huVar.requestFocus();
                AndroidUtilities.showKeyboard(huVar);
                return;
            case 7:
                ChatObject.Call call3 = h60Var.f36879a1;
                if (call3 != null && !call3.isScheduled() && !h60Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(h60Var.getContext(), false);
                        return;
                    }
                    return;
                }
                h60Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = h60Var.f36879a1;
                if (call4 != null && call4.recording) {
                    h60Var.G1(h60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = h60Var.f36879a1;
                if (call5 != null && call5.recording) {
                    h60Var.G1(h60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = h60Var.Y1;
                org.telegram.ui.Components.kj0 kj0Var = h60Var.G2;
                h60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (h60Var.H2 == 18) {
                        h60Var.H2 = 39;
                        kj0Var.P(39);
                        kj0Var.start();
                    } else {
                        kj0Var.N(0, false, false);
                        h60Var.H2 = 18;
                        kj0Var.P(18);
                        kj0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = uVar.f32206w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.f32177a;
                            if (uVar.J0 == null) {
                                uVar.K0 = false;
                                ImageView imageView = uVar.f32209x0;
                                if (imageView == null) {
                                    uVar.f32209x0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.f32167e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.f32209x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.f32209x0.setAlpha(0.0f);
                                } else {
                                    uVar.f32209x0.setAlpha(1.0f);
                                }
                                if (uVar.f32209x0.getParent() == null) {
                                    pVar.addView(uVar.f32209x0);
                                }
                                ((FrameLayout.LayoutParams) uVar.f32209x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.J0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.J0.setDuration(400L);
                                uVar.J0.setInterpolator(org.telegram.ui.Components.tr.f31147f);
                                uVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (h60Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                h60Var.y3 = Integer.valueOf(i13);
                h60Var.N1(true, true);
                h60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ld(h60Var, i13, 13));
                return;
        }
    }
}
