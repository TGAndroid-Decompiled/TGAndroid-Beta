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
public final class s00 implements View.OnClickListener {
    public final int f49610a;
    public final f40 f49611b;

    public s00(f40 f40Var, int i7) {
        this.f49610a = i7;
        this.f49611b = f40Var;
    }

    @Override
    public final void onClick(View view) {
        String M0;
        int i7 = this.f49610a;
        int i10 = 2;
        f40 f40Var = this.f49611b;
        switch (i7) {
            case 0:
                if (f40Var.u1()) {
                    org.telegram.ui.Components.voip.g1.k(f40Var.f45512c2);
                    return;
                }
                org.telegram.ui.Components.p10.f36762f0 = false;
                f40Var.dismiss();
                return;
            case 1:
                f40Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = f40Var.f45512c2;
                    if (launchActivity != null) {
                        f40Var.f45512c2.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.r3 r3Var = f40Var.U2;
                if (r3Var != null && r3Var.f25244w) {
                    f40Var.M1(f40Var.I1.getTitleTextView());
                    return;
                }
                return;
            case 3:
                k20 k20Var = f40Var.B1;
                if (k20Var.m()) {
                    k20Var.j();
                    return;
                } else {
                    k20Var.d();
                    return;
                }
            case 4:
                Editable text = f40Var.B1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.ui.b0(f40Var.f28669a).W(new CharSequence[]{text}, true, true);
                f40Var.F1(tL_textWithEntities);
                return;
            case 5:
                int R0 = f40Var.R0();
                if (R0 > 0 && R0 != Integer.MAX_VALUE) {
                    f40Var.K1.w0(0, R0, null);
                }
                org.telegram.ui.Components.et etVar = f40Var.B1.f35433a;
                etVar.requestFocus();
                org.telegram.messenger.g0.K3(etVar);
                return;
            case 6:
                org.telegram.messenger.r3 r3Var2 = f40Var.U2;
                if (r3Var2 != null && !r3Var2.j() && !f40Var.u1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(f40Var.getContext(), false);
                        return;
                    }
                    return;
                }
                f40Var.m1(false);
                return;
            case 7:
                org.telegram.messenger.r3 r3Var3 = f40Var.U2;
                if (r3Var3 != null && r3Var3.f25244w) {
                    f40Var.M1(f40Var.I1.getTitleTextView());
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.r3 r3Var4 = f40Var.U2;
                if (r3Var4 != null && r3Var4.f25244w) {
                    f40Var.M1(f40Var.I1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = f40Var.S3;
                org.telegram.ui.Components.zg0 zg0Var = f40Var.A4;
                f40Var.U3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (f40Var.B4 == 18) {
                        f40Var.B4 = 39;
                        zg0Var.P(39);
                        zg0Var.start();
                    } else {
                        zg0Var.N(0, false, false);
                        f40Var.B4 = 18;
                        zg0Var.P(18);
                        zg0Var.start();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList.get(i11);
                        org.telegram.messenger.s3 s3Var = yVar.f39667x;
                        if (s3Var.f25413a.self && !s3Var.f25414b) {
                            org.telegram.ui.Components.voip.u uVar = yVar.f39636a;
                            if (yVar.J0 == null) {
                                yVar.K0 = false;
                                ImageView imageView = yVar.f39668x0;
                                if (imageView == null) {
                                    yVar.f39668x0 = new ImageView(yVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (uVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = uVar.f39346e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        yVar.f39668x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    yVar.f39668x0.setAlpha(0.0f);
                                } else {
                                    yVar.f39668x0.setAlpha(1.0f);
                                }
                                if (yVar.f39668x0.getParent() == null) {
                                    uVar.addView(yVar.f39668x0);
                                }
                                ((FrameLayout.LayoutParams) yVar.f39668x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                yVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.t(yVar, 1));
                                yVar.J0.addListener(new org.telegram.ui.Components.voip.w(yVar, 2));
                                yVar.J0.setDuration(400L);
                                yVar.J0.setInterpolator(org.telegram.ui.Components.wq.f40046f);
                                yVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            case 10:
                if (f40Var.k1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                f40Var.s5 = Integer.valueOf(i10);
                f40Var.T1(true, true);
                f40Var.s5 = null;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.q2(f40Var, i10, 13));
                return;
            default:
                org.telegram.ui.ActionBar.r0 r0Var = f40Var.f45520e3;
                org.telegram.ui.ActionBar.z0 z0Var = f40Var.f45565p3;
                org.telegram.ui.ActionBar.z0 z0Var2 = f40Var.f45561o3;
                org.telegram.ui.ActionBar.z0 z0Var3 = f40Var.j3;
                org.telegram.messenger.r3 r3Var5 = f40Var.U2;
                if (r3Var5 != null && !f40Var.U3.f39302b) {
                    if (r3Var5.f25226b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.m6.Vg;
                        z0Var2.d(org.telegram.ui.ActionBar.m6.x0(null, i12, false), org.telegram.ui.ActionBar.m6.x0(null, i12, false));
                        z0Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.m6.f28029kh;
                        z0Var.d(org.telegram.ui.ActionBar.m6.x0(null, i13, false), org.telegram.ui.ActionBar.m6.x0(null, i13, false));
                        z0Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.m6.f28029kh;
                        z0Var2.d(org.telegram.ui.ActionBar.m6.x0(null, i14, false), org.telegram.ui.ActionBar.m6.x0(null, i14, false));
                        z0Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.m6.Vg;
                        z0Var.d(org.telegram.ui.ActionBar.m6.x0(null, i15, false), org.telegram.ui.ActionBar.m6.x0(null, i15, false));
                        z0Var.setChecked(false);
                    }
                    f40Var.f45523f2 = false;
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
                    f40Var.O1();
                    r0Var.U(null, null);
                    return;
                }
                return;
        }
    }
}
