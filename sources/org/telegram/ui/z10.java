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
public final class z10 implements View.OnClickListener {
    public final int f44998a;
    public final o50 f44999b;

    public z10(o50 o50Var, int i9) {
        this.f44998a = i9;
        this.f44999b = o50Var;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        String string;
        int i11 = this.f44998a;
        int i12 = 0;
        o50 o50Var = this.f44999b;
        switch (i11) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = o50Var.f40908g1;
                org.telegram.ui.ActionBar.g1 g1Var = o50Var.f40952r1;
                org.telegram.ui.ActionBar.g1 g1Var2 = o50Var.f40947q1;
                org.telegram.ui.ActionBar.g1 g1Var3 = o50Var.l1;
                ChatObject.Call call = o50Var.W0;
                if (call != null && !o50Var.W1.f33598b) {
                    if (call.call.join_muted) {
                        int i13 = org.telegram.ui.ActionBar.f6.f23083hg;
                        g1Var2.c(org.telegram.ui.ActionBar.f6.w0(null, i13, false), org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                        g1Var2.setChecked(false);
                        int i14 = org.telegram.ui.ActionBar.f6.f23343wg;
                        g1Var.c(org.telegram.ui.ActionBar.f6.w0(null, i14, false), org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                        g1Var.setChecked(true);
                    } else {
                        int i15 = org.telegram.ui.ActionBar.f6.f23343wg;
                        g1Var2.c(org.telegram.ui.ActionBar.f6.w0(null, i15, false), org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                        g1Var2.setChecked(true);
                        int i16 = org.telegram.ui.ActionBar.f6.f23083hg;
                        g1Var.c(org.telegram.ui.ActionBar.f6.w0(null, i16, false), org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                        g1Var.setChecked(false);
                    }
                    o50Var.f40911h0 = false;
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
                                i9 = R.drawable.msg_voice_headphones;
                            } else {
                                i9 = R.drawable.msg_voice_phone;
                            }
                            g1Var3.setIcon(i9);
                            if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                i10 = R.string.VoipAudioRoutingHeadset;
                            } else {
                                i10 = R.string.VoipAudioRoutingPhone;
                            }
                            g1Var3.setSubtext(LocaleController.getString(i10));
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
                    o50Var.I1();
                    w0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (o50Var.r1()) {
                    if (af.d.a(o50Var.f40898e0) > 0) {
                        org.telegram.ui.Components.voip.g1.n(o50Var.f40898e0);
                        o50Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.y4.B(o50Var.f40898e0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(o50Var.f40898e0)) {
                    org.telegram.ui.Components.j20.f29597a0 = false;
                    o50Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.y4.A(o50Var.getContext()).o();
                    return;
                }
            case 2:
                o50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = o50Var.f40898e0;
                    if (launchActivity != null) {
                        o50Var.f40898e0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = o50Var.W0;
                if (call2 != null && call2.recording) {
                    o50Var.G1(o50Var.K.getTitleTextView());
                    return;
                }
                return;
            case 4:
                o30 o30Var = o50Var.D;
                if (o30Var.m()) {
                    o30Var.j();
                    return;
                } else {
                    o30Var.d();
                    return;
                }
            case 5:
                o50.D(o50Var);
                return;
            case 6:
                int P0 = o50Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    o50Var.M.v0(0, P0, null);
                }
                org.telegram.ui.Components.pt ptVar = o50Var.D.f33121a;
                ptVar.requestFocus();
                AndroidUtilities.showKeyboard(ptVar);
                return;
            case 7:
                ChatObject.Call call3 = o50Var.W0;
                if (call3 != null && !call3.isScheduled() && !o50Var.r1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(o50Var.getContext(), false);
                        return;
                    }
                    return;
                }
                o50Var.j1(false);
                return;
            case 8:
                ChatObject.Call call4 = o50Var.W0;
                if (call4 != null && call4.recording) {
                    o50Var.G1(o50Var.K.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = o50Var.W0;
                if (call5 != null && call5.recording) {
                    o50Var.G1(o50Var.K.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = o50Var.U1;
                org.telegram.ui.Components.mi0 mi0Var = o50Var.C2;
                o50Var.W1.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (o50Var.D2 == 18) {
                        o50Var.D2 = 39;
                        mi0Var.N(39);
                        mi0Var.start();
                    } else {
                        mi0Var.L(0, false, false);
                        o50Var.D2 = 18;
                        mi0Var.N(18);
                        mi0Var.start();
                    }
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i17);
                        ChatObject.VideoParticipant videoParticipant = tVar.f33850w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.f33821a;
                            if (tVar.F0 == null) {
                                tVar.G0 = false;
                                ImageView imageView = tVar.f33847t0;
                                if (imageView == null) {
                                    tVar.f33847t0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.f33777e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.f33847t0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.f33847t0.setAlpha(0.0f);
                                } else {
                                    tVar.f33847t0.setAlpha(1.0f);
                                }
                                if (tVar.f33847t0.getParent() == null) {
                                    oVar.addView(tVar.f33847t0);
                                }
                                ((FrameLayout.LayoutParams) tVar.f33847t0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.F0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.F0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.F0.setDuration(400L);
                                tVar.F0.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                                tVar.F0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (o50Var.h1() != 1) {
                    i12 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i12 = 2;
                    }
                }
                o50Var.f40967u3 = Integer.valueOf(i12);
                o50Var.N1(true, true);
                o50Var.f40967u3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qd(o50Var, i12, 13));
                return;
        }
    }
}
