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
    public final int f40629a;
    public final j60 f40630b;

    public t20(j60 j60Var, int i10) {
        this.f40629a = i10;
        this.f40630b = j60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f40629a;
        int i13 = 0;
        j60 j60Var = this.f40630b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.v0 v0Var = j60Var.f37582k1;
                org.telegram.ui.ActionBar.f1 f1Var = j60Var.f37627v1;
                org.telegram.ui.ActionBar.f1 f1Var2 = j60Var.f37623u1;
                org.telegram.ui.ActionBar.f1 f1Var3 = j60Var.f37601p1;
                ChatObject.Call call = j60Var.f37540a1;
                if (call != null && !j60Var.a2.f31624b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.j6.f20770hg;
                        f1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i14, false), org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                        f1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.j6.f21043wg;
                        f1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i15, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                        f1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.j6.f21043wg;
                        f1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i16, false), org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        f1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.j6.f20770hg;
                        f1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i17, false), org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                        f1Var.setChecked(false);
                    }
                    j60Var.f37585l0 = false;
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
                    j60Var.I1();
                    v0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (j60Var.r1()) {
                    if (tf.c.a(j60Var.f37574i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(j60Var.f37574i0);
                        j60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.e5.B(j60Var.f37574i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(j60Var.f37574i0)) {
                    org.telegram.ui.Components.z20.f33082e0 = false;
                    j60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.e5.A(j60Var.getContext()).o();
                    return;
                }
            case 2:
                j60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = j60Var.f37574i0;
                    if (launchActivity != null) {
                        j60Var.f37574i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = j60Var.f37540a1;
                if (call2 != null && call2.recording) {
                    j60Var.G1(j60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                i40 i40Var = j60Var.H;
                if (i40Var.m()) {
                    i40Var.j();
                    return;
                } else {
                    i40Var.d();
                    return;
                }
            case 5:
                j60.D(j60Var);
                return;
            case 6:
                int P0 = j60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    j60Var.Q.v0(0, P0, null);
                }
                org.telegram.ui.Components.cu cuVar = j60Var.H.f26874a;
                cuVar.requestFocus();
                AndroidUtilities.showKeyboard(cuVar);
                return;
            case 7:
                ChatObject.Call call3 = j60Var.f37540a1;
                if (call3 != null && !call3.isScheduled() && !j60Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(j60Var.getContext(), false);
                        return;
                    }
                    return;
                }
                j60Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = j60Var.f37540a1;
                if (call4 != null && call4.recording) {
                    j60Var.G1(j60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = j60Var.f37540a1;
                if (call5 != null && call5.recording) {
                    j60Var.G1(j60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = j60Var.Y1;
                org.telegram.ui.Components.xi0 xi0Var = j60Var.G2;
                j60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (j60Var.H2 == 18) {
                        j60Var.H2 = 39;
                        xi0Var.N(39);
                        xi0Var.start();
                    } else {
                        xi0Var.L(0, false, false);
                        j60Var.H2 = 18;
                        xi0Var.N(18);
                        xi0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = tVar.f31860w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.f31831a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.f31863x0;
                                if (imageView == null) {
                                    tVar.f31863x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.f31769e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.f31863x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.f31863x0.setAlpha(0.0f);
                                } else {
                                    tVar.f31863x0.setAlpha(1.0f);
                                }
                                if (tVar.f31863x0.getParent() == null) {
                                    oVar.addView(tVar.f31863x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.f31863x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.pr.f29493f);
                                tVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (j60Var.h1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                j60Var.y3 = Integer.valueOf(i13);
                j60Var.N1(true, true);
                j60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m8(j60Var, i13, 15));
                return;
        }
    }
}
