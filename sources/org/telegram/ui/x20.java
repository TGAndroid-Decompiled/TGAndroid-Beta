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
public final class x20 implements View.OnClickListener {
    public final int f41408a;
    public final n60 f41409b;

    public x20(n60 n60Var, int i10) {
        this.f41408a = i10;
        this.f41409b = n60Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        String string;
        int i12 = this.f41408a;
        int i13 = 0;
        n60 n60Var = this.f41409b;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.u0 u0Var = n60Var.f38199k1;
                org.telegram.ui.ActionBar.e1 e1Var = n60Var.f38244v1;
                org.telegram.ui.ActionBar.e1 e1Var2 = n60Var.f38240u1;
                org.telegram.ui.ActionBar.e1 e1Var3 = n60Var.f38218p1;
                ChatObject.Call call = n60Var.f38157a1;
                if (call != null && !n60Var.a2.f29950b) {
                    if (call.call.join_muted) {
                        int i14 = org.telegram.ui.ActionBar.g6.f19680hg;
                        e1Var2.c(org.telegram.ui.ActionBar.g6.x0(null, i14, false), org.telegram.ui.ActionBar.g6.x0(null, i14, false));
                        e1Var2.setChecked(false);
                        int i15 = org.telegram.ui.ActionBar.g6.f19961wg;
                        e1Var.c(org.telegram.ui.ActionBar.g6.x0(null, i15, false), org.telegram.ui.ActionBar.g6.x0(null, i15, false));
                        e1Var.setChecked(true);
                    } else {
                        int i16 = org.telegram.ui.ActionBar.g6.f19961wg;
                        e1Var2.c(org.telegram.ui.ActionBar.g6.x0(null, i16, false), org.telegram.ui.ActionBar.g6.x0(null, i16, false));
                        e1Var2.setChecked(true);
                        int i17 = org.telegram.ui.ActionBar.g6.f19680hg;
                        e1Var.c(org.telegram.ui.ActionBar.g6.x0(null, i17, false), org.telegram.ui.ActionBar.g6.x0(null, i17, false));
                        e1Var.setChecked(false);
                    }
                    n60Var.f38202l0 = false;
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
                    n60Var.J1();
                    u0Var.M(null, null);
                    return;
                }
                return;
            case 1:
                if (n60Var.s1()) {
                    if (uf.b.a(n60Var.f38190i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(n60Var.f38190i0);
                        n60Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.g5.A(n60Var.f38190i0, null, true).o();
                    return;
                } else if (AndroidUtilities.checkInlinePermissions(n60Var.f38190i0)) {
                    org.telegram.ui.Components.m30.f26894e0 = false;
                    n60Var.dismiss();
                    return;
                } else {
                    org.telegram.ui.Components.g5.z(n60Var.getContext()).o();
                    return;
                }
            case 2:
                n60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = n60Var.f38190i0;
                    if (launchActivity != null) {
                        n60Var.f38190i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChatObject.Call call2 = n60Var.f38157a1;
                if (call2 != null && call2.recording) {
                    n60Var.H1(n60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 4:
                m40 m40Var = n60Var.H;
                if (m40Var.m()) {
                    m40Var.j();
                    return;
                } else {
                    m40Var.d();
                    return;
                }
            case 5:
                n60.F(n60Var);
                return;
            case 6:
                int Q0 = n60Var.Q0();
                if (Q0 > 0 && Q0 != Integer.MAX_VALUE) {
                    n60Var.Q.v0(0, Q0, null);
                }
                org.telegram.ui.Components.qu quVar = n60Var.H.f30318a;
                quVar.requestFocus();
                AndroidUtilities.showKeyboard(quVar);
                return;
            case 7:
                ChatObject.Call call3 = n60Var.f38157a1;
                if (call3 != null && !call3.isScheduled() && !n60Var.s1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(n60Var.getContext(), false);
                        return;
                    }
                    return;
                }
                n60Var.k1(false);
                return;
            case 8:
                ChatObject.Call call4 = n60Var.f38157a1;
                if (call4 != null && call4.recording) {
                    n60Var.H1(n60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ChatObject.Call call5 = n60Var.f38157a1;
                if (call5 != null && call5.recording) {
                    n60Var.H1(n60Var.O.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = n60Var.Y1;
                org.telegram.ui.Components.yj0 yj0Var = n60Var.G2;
                n60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (n60Var.H2 == 18) {
                        n60Var.H2 = 39;
                        yj0Var.P(39);
                        yj0Var.start();
                    } else {
                        yj0Var.N(0, false, false);
                        n60Var.H2 = 18;
                        yj0Var.P(18);
                        yj0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i18);
                        ChatObject.VideoParticipant videoParticipant = tVar.f30173w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.f30145a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.f30176x0;
                                if (imageView == null) {
                                    tVar.f30176x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.f30176x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.f30176x0.setAlpha(0.0f);
                                } else {
                                    tVar.f30176x0.setAlpha(1.0f);
                                }
                                if (tVar.f30176x0.getParent() == null) {
                                    oVar.addView(tVar.f30176x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.f30176x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.es.f24465f);
                                tVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (n60Var.i1() != 1) {
                    i13 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i13 = 2;
                    }
                }
                n60Var.y3 = Integer.valueOf(i13);
                n60Var.O1(true, true);
                n60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o8(n60Var, i13, 15));
                return;
        }
    }
}
