package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
public final class r00 implements View.OnClickListener {
    public final int f49234a;
    public final e40 f49235b;

    public r00(e40 e40Var, int i7) {
        this.f49234a = i7;
        this.f49235b = e40Var;
    }

    @Override
    public final void onClick(View view) {
        String M0;
        int i7 = this.f49234a;
        int i10 = 2;
        e40 e40Var = this.f49235b;
        switch (i7) {
            case 0:
                if (e40Var.u1()) {
                    org.telegram.ui.Components.voip.g1.k(e40Var.Z1);
                    return;
                }
                org.telegram.ui.Components.q10.f37163f0 = false;
                e40Var.dismiss();
                return;
            case 1:
                e40Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = e40Var.Z1;
                    if (launchActivity != null) {
                        e40Var.Z1.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.r3 r3Var = e40Var.R2;
                if (r3Var != null && r3Var.f25240w) {
                    e40Var.M1(e40Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 3:
                j20 j20Var = e40Var.f45290y1;
                if (j20Var.m()) {
                    j20Var.j();
                    return;
                } else {
                    j20Var.d();
                    return;
                }
            case 4:
                Editable text = e40Var.f45290y1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.ui.b0(e40Var.f28621a).W(new CharSequence[]{text}, true, true);
                e40Var.F1(tL_textWithEntities);
                return;
            case 5:
                int R0 = e40Var.R0();
                if (R0 > 0 && R0 != Integer.MAX_VALUE) {
                    e40Var.H1.w0(0, R0, null);
                }
                org.telegram.ui.Components.ft ftVar = e40Var.f45290y1.f35841a;
                ftVar.requestFocus();
                org.telegram.messenger.g0.K3(ftVar);
                return;
            case 6:
                org.telegram.messenger.r3 r3Var2 = e40Var.R2;
                if (r3Var2 != null && !r3Var2.j() && !e40Var.u1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(e40Var.getContext(), false);
                        return;
                    }
                    return;
                }
                e40Var.m1(false);
                return;
            case 7:
                org.telegram.messenger.r3 r3Var3 = e40Var.R2;
                if (r3Var3 != null && r3Var3.f25240w) {
                    e40Var.M1(e40Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.r3 r3Var4 = e40Var.R2;
                if (r3Var4 != null && r3Var4.f25240w) {
                    e40Var.M1(e40Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = e40Var.P3;
                org.telegram.ui.Components.ah0 ah0Var = e40Var.f45289x4;
                e40Var.R3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (e40Var.f45293y4 == 18) {
                        e40Var.f45293y4 = 39;
                        ah0Var.P(39);
                        ah0Var.start();
                    } else {
                        ah0Var.N(0, false, false);
                        e40Var.f45293y4 = 18;
                        ah0Var.P(18);
                        ah0Var.start();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList.get(i11);
                        org.telegram.messenger.s3 s3Var = yVar.f39745x;
                        if (s3Var.f25409a.self && !s3Var.f25410b) {
                            org.telegram.ui.Components.voip.u uVar = yVar.f39714a;
                            if (yVar.J0 == null) {
                                yVar.K0 = false;
                                ImageView imageView = yVar.f39746x0;
                                if (imageView == null) {
                                    yVar.f39746x0 = new ImageView(yVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (uVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = uVar.f39426e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        yVar.f39746x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    yVar.f39746x0.setAlpha(0.0f);
                                } else {
                                    yVar.f39746x0.setAlpha(1.0f);
                                }
                                if (yVar.f39746x0.getParent() == null) {
                                    uVar.addView(yVar.f39746x0);
                                }
                                ((FrameLayout.LayoutParams) yVar.f39746x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                yVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.t(yVar, 1));
                                yVar.J0.addListener(new org.telegram.ui.Components.voip.w(yVar, 2));
                                yVar.J0.setDuration(400L);
                                yVar.J0.setInterpolator(org.telegram.ui.Components.xq.f40458f);
                                yVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            case 10:
                if (e40Var.k1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                e40Var.f45254p5 = Integer.valueOf(i10);
                e40Var.T1(true, true);
                e40Var.f45254p5 = null;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(e40Var, i10, 13));
                return;
            default:
                org.telegram.ui.ActionBar.r0 r0Var = e40Var.f45193b3;
                org.telegram.ui.ActionBar.z0 z0Var = e40Var.f45239m3;
                org.telegram.ui.ActionBar.z0 z0Var2 = e40Var.f45234l3;
                org.telegram.ui.ActionBar.z0 z0Var3 = e40Var.f45212g3;
                org.telegram.messenger.r3 r3Var5 = e40Var.R2;
                if (r3Var5 != null && !e40Var.R3.f39382b) {
                    if (r3Var5.f25222b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.l6.Vg;
                        z0Var2.d(org.telegram.ui.ActionBar.l6.x0(null, i12, false), org.telegram.ui.ActionBar.l6.x0(null, i12, false));
                        z0Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.l6.f28004kh;
                        z0Var.d(org.telegram.ui.ActionBar.l6.x0(null, i13, false), org.telegram.ui.ActionBar.l6.x0(null, i13, false));
                        z0Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.l6.f28004kh;
                        z0Var2.d(org.telegram.ui.ActionBar.l6.x0(null, i14, false), org.telegram.ui.ActionBar.l6.x0(null, i14, false));
                        z0Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.l6.Vg;
                        z0Var.d(org.telegram.ui.ActionBar.l6.x0(null, i15, false), org.telegram.ui.ActionBar.l6.x0(null, i15, false));
                        z0Var.setChecked(false);
                    }
                    e40Var.f45196c2 = false;
                    r0Var.t(1);
                    r0Var.t(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            z0Var3.setIcon(2131232425);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                M0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                M0 = org.telegram.messenger.id.M0(2131743503, null);
                            }
                            z0Var3.setSubtext(M0);
                        } else {
                            int i16 = 2131743500;
                            int i17 = 2131232428;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i17 = 2131232426;
                                }
                                z0Var3.setIcon(i17);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = 2131743501;
                                }
                                z0Var3.setSubtext(org.telegram.messenger.id.M0(i16, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    z0Var3.setIcon(2131232430);
                                    z0Var3.setSubtext(org.telegram.messenger.id.M0(2131743499, null));
                                } else {
                                    z0Var3.setIcon(2131232428);
                                    z0Var3.setSubtext(org.telegram.messenger.id.M0(2131743500, null));
                                }
                            }
                        }
                    }
                    e40Var.O1();
                    r0Var.U(null, null);
                    return;
                }
                return;
        }
    }
}
