package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.provider.Settings;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
public final class r10 implements View.OnClickListener {
    public final int f41115a;
    public final b50 f41116b;

    public r10(b50 b50Var, int i10) {
        this.f41115a = i10;
        this.f41116b = b50Var;
    }

    @Override
    public final void onClick(View view) {
        String L0;
        int i10 = this.f41115a;
        int i11 = 2;
        b50 b50Var = this.f41116b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.t0 t0Var = b50Var.f35999b3;
                org.telegram.ui.ActionBar.b1 b1Var = b50Var.f36046m3;
                org.telegram.ui.ActionBar.b1 b1Var2 = b50Var.f36042l3;
                org.telegram.ui.ActionBar.b1 b1Var3 = b50Var.f36019g3;
                org.telegram.messenger.u3 u3Var = b50Var.R2;
                if (u3Var != null && !b50Var.R3.f31712b) {
                    if (u3Var.f18228b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.t6.Vg;
                        b1Var2.d(org.telegram.ui.ActionBar.t6.x0(null, i12, false), org.telegram.ui.ActionBar.t6.x0(null, i12, false));
                        b1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.t6.f21069kh;
                        b1Var.d(org.telegram.ui.ActionBar.t6.x0(null, i13, false), org.telegram.ui.ActionBar.t6.x0(null, i13, false));
                        b1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.t6.f21069kh;
                        b1Var2.d(org.telegram.ui.ActionBar.t6.x0(null, i14, false), org.telegram.ui.ActionBar.t6.x0(null, i14, false));
                        b1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.t6.Vg;
                        b1Var.d(org.telegram.ui.ActionBar.t6.x0(null, i15, false), org.telegram.ui.ActionBar.t6.x0(null, i15, false));
                        b1Var.setChecked(false);
                    }
                    b50Var.f36002c2 = false;
                    t0Var.t(1);
                    t0Var.t(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            b1Var3.setIcon(2131232424);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                L0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                L0 = org.telegram.messenger.cd.L0(2131743529, null);
                            }
                            b1Var3.setSubtext(L0);
                        } else {
                            int i16 = 2131743526;
                            int i17 = 2131232427;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i17 = 2131232425;
                                }
                                b1Var3.setIcon(i17);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = 2131743527;
                                }
                                b1Var3.setSubtext(org.telegram.messenger.cd.L0(i16, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    b1Var3.setIcon(2131232429);
                                    b1Var3.setSubtext(org.telegram.messenger.cd.L0(2131743525, null));
                                } else {
                                    b1Var3.setIcon(2131232427);
                                    b1Var3.setSubtext(org.telegram.messenger.cd.L0(2131743526, null));
                                }
                            }
                        }
                    }
                    b50Var.L1();
                    t0Var.U(null, null);
                    return;
                }
                return;
            case 1:
                if (b50Var.t1()) {
                    if (mf.b.a(b50Var.Z1) > 0) {
                        org.telegram.ui.Components.voip.s0.h(b50Var.Z1);
                        b50Var.dismiss();
                        return;
                    }
                    org.telegram.ui.Components.s4.A(b50Var.Z1, null, true).p();
                    return;
                }
                LaunchActivity launchActivity = b50Var.Z1;
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                if (Settings.canDrawOverlays(launchActivity)) {
                    org.telegram.ui.Components.g20.f26225e0 = false;
                    b50Var.dismiss();
                    return;
                }
                org.telegram.ui.Components.s4.z(b50Var.getContext()).p();
                return;
            case 2:
                b50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity2 = b50Var.Z1;
                    if (launchActivity2 != null) {
                        b50Var.Z1.startActivityForResult(((MediaProjectionManager) launchActivity2.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.u3 u3Var2 = b50Var.R2;
                if (u3Var2 != null && u3Var2.f18245w) {
                    b50Var.J1(b50Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 4:
                g30 g30Var = b50Var.f36099y1;
                if (g30Var.m()) {
                    g30Var.j();
                    return;
                } else {
                    g30Var.d();
                    return;
                }
            case 5:
                Editable text = b50Var.f36099y1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.ui.b0(b50Var.f21583a).W(new CharSequence[]{text}, true, true);
                b50Var.C1(tL_textWithEntities);
                return;
            case 6:
                int R0 = b50Var.R0();
                if (R0 > 0 && R0 != Integer.MAX_VALUE) {
                    b50Var.H1.w0(0, R0, null);
                }
                org.telegram.ui.Components.rt rtVar = b50Var.f36099y1.f32239a;
                rtVar.requestFocus();
                org.telegram.messenger.i0.J3(rtVar);
                return;
            case 7:
                org.telegram.messenger.u3 u3Var3 = b50Var.R2;
                if (u3Var3 != null && !u3Var3.j() && !b50Var.t1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(b50Var.getContext(), false);
                        return;
                    }
                    return;
                }
                b50Var.l1(false);
                return;
            case 8:
                org.telegram.messenger.u3 u3Var4 = b50Var.R2;
                if (u3Var4 != null && u3Var4.f18245w) {
                    b50Var.J1(b50Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.u3 u3Var5 = b50Var.R2;
                if (u3Var5 != null && u3Var5.f18245w) {
                    b50Var.J1(b50Var.F1.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = b50Var.P3;
                org.telegram.ui.Components.bi0 bi0Var = b50Var.f36098x4;
                b50Var.R3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (b50Var.f36101y4 == 18) {
                        b50Var.f36101y4 = 39;
                        bi0Var.P(39);
                        bi0Var.start();
                    } else {
                        bi0Var.N(0, false, false);
                        b50Var.f36101y4 = 18;
                        bi0Var.P(18);
                        bi0Var.start();
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList.get(i18);
                        org.telegram.messenger.v3 v3Var = rVar.f31630x;
                        if (v3Var.f18477a.self && !v3Var.f18478b) {
                            org.telegram.ui.Components.voip.n nVar = rVar.f31600a;
                            if (rVar.J0 == null) {
                                rVar.K0 = false;
                                ImageView imageView = rVar.f31631x0;
                                if (imageView == null) {
                                    rVar.f31631x0 = new ImageView(rVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (nVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = nVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        rVar.f31631x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    rVar.f31631x0.setAlpha(0.0f);
                                } else {
                                    rVar.f31631x0.setAlpha(1.0f);
                                }
                                if (rVar.f31631x0.getParent() == null) {
                                    nVar.addView(rVar.f31631x0);
                                }
                                ((FrameLayout.LayoutParams) rVar.f31631x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                rVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.m(rVar, 1));
                                rVar.J0.addListener(new org.telegram.ui.Components.voip.p(rVar, 2));
                                rVar.J0.setDuration(400L);
                                rVar.J0.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                                rVar.J0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (b50Var.j1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 0;
                    }
                }
                b50Var.p5 = Integer.valueOf(i11);
                b50Var.Q1(true, true);
                b50Var.p5 = null;
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.qq(b50Var, i11, 8));
                return;
        }
    }
}
