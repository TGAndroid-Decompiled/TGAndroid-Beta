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
    public final int f42054a;
    public final i60 f42055b;

    public t20(i60 i60Var, int i10) {
        this.f42054a = i10;
        this.f42055b = i60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f42054a;
        int i13 = 0;
        i60 i60Var = this.f42055b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.u0 u0Var = i60Var.f38720k1;
                org.telegram.ui.ActionBar.e1 e1Var = i60Var.f38765v1;
                org.telegram.ui.ActionBar.e1 e1Var2 = i60Var.f38761u1;
                org.telegram.ui.ActionBar.e1 e1Var3 = i60Var.f38739p1;
                ChatObject.Call call = i60Var.f38678a1;
                if (call != null && !i60Var.a2.f31814b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.h6.f20640hg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i14, false), org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                        e1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.h6.f20920wg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i15, false), org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                        e1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.h6.f20920wg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i16, false), org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                        e1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.h6.f20640hg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i17, false), org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                        e1Var.setChecked(false);
                    }
                    i60Var.f38723l0 = false;
                    u0Var.r(1);
                    u0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            e1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                string = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                            }
                            e1Var3.setSubtext(string);
                        } else if (currentAudioRoute == 0) {
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i10 = R.drawable.msg_voice_headphones;
                            } else {
                                i10 = R.drawable.msg_voice_phone;
                            }
                            e1Var3.setIcon(i10);
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i11 = R.string.VoipAudioRoutingHeadset;
                            } else {
                                i11 = R.string.VoipAudioRoutingPhone;
                            }
                            e1Var3.setSubtext(LocaleController.getString(i11));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                e1Var3.setIcon(R.drawable.msg_voice_speaker);
                                e1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                e1Var3.setIcon(R.drawable.msg_voice_phone);
                                e1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    i60Var.J1();
                    u0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (i60Var.s1()) {
                    if (tf.c.a(i60Var.f38712i0) > 0) {
                        org.telegram.ui.Components.voip.k1.n(i60Var.f38712i0);
                        i60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.g5.A(i60Var.f38712i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(i60Var.f38712i0)) {
                    org.telegram.ui.Components.t30.f30740e0 = false;
                    i60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.g5.z(i60Var.getContext()).o();
                    return;
                }
            case 2:
                i60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = i60Var.f38712i0;
                    if (launchActivity != null) {
                        i60Var.f38712i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = i60Var.f38678a1;
                if (call2 != null && call2.recording) {
                    i60Var.H1(i60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                i40 i40Var = i60Var.H;
                if (i40Var.m()) {
                    i40Var.j();
                    return;
                } else {
                    i40Var.d();
                    return;
                }
            case 5:
                i60.F(i60Var);
                return;
            case 6:
                int Q0 = i60Var.Q0();
                if (Q0 > 0 && Q0 != Integer.MAX_VALUE) {
                    i60Var.Q.v0(0, Q0, null);
                }
                org.telegram.ui.Components.xu xuVar = i60Var.H.f25023a;
                xuVar.requestFocus();
                AndroidUtilities.showKeyboard(xuVar);
                return;
            case 7:
                ChatObject.Call call3 = i60Var.f38678a1;
                if (call3 != null && !call3.isScheduled() && !i60Var.s1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(i60Var.getContext(), false);
                        return;
                    }
                    return;
                }
                i60Var.k1(false);
                return;
            case 8:
                ChatObject.Call call4 = i60Var.f38678a1;
                if (call4 != null && call4.recording) {
                    i60Var.H1(i60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = i60Var.f38678a1;
                if (call5 != null && call5.recording) {
                    i60Var.H1(i60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = i60Var.Y1;
                org.telegram.ui.Components.fk0 fk0Var = i60Var.G2;
                i60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (i60Var.H2 == 18) {
                        i60Var.H2 = 39;
                        fk0Var.P(39);
                        fk0Var.start();
                    } else {
                        fk0Var.N(0, false, false);
                        i60Var.H2 = 18;
                        fk0Var.P(18);
                        fk0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = uVar.f32024w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.f31995a;
                            if (uVar.J0 == null) {
                                uVar.K0 = false;
                                ImageView imageView = uVar.f32027x0;
                                if (imageView == null) {
                                    uVar.f32027x0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.f31985e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.f32027x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.f32027x0.setAlpha(0.0f);
                                } else {
                                    uVar.f32027x0.setAlpha(1.0f);
                                }
                                if (uVar.f32027x0.getParent() == null) {
                                    pVar.addView(uVar.f32027x0);
                                }
                                ((FrameLayout.LayoutParams) uVar.f32027x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.J0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.J0.setDuration(400L);
                                uVar.J0.setInterpolator(org.telegram.ui.Components.js.f27627f);
                                uVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (i60Var.i1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                i60Var.y3 = Integer.valueOf(i13);
                i60Var.O1(true, true);
                i60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.nd(i60Var, i13, 15));
                return;
        }
    }
}
