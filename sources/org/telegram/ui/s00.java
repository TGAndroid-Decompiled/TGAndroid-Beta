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
    public final int f51929a;
    public final e40 f51930b;

    public s00(e40 e40Var, int i7) {
        this.f51929a = i7;
        this.f51930b = e40Var;
    }

    @Override
    public final void onClick(View view) {
        String N0;
        int i7 = this.f51929a;
        int i10 = 2;
        e40 e40Var = this.f51930b;
        switch (i7) {
            case 0:
                if (e40Var.v1()) {
                    org.telegram.ui.Components.voip.k1.g(e40Var.d2);
                    return;
                }
                org.telegram.ui.Components.a20.f33324g0 = false;
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
                    LaunchActivity launchActivity = e40Var.d2;
                    if (launchActivity != null) {
                        e40Var.d2.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                e40Var.f47341f3.p();
                e40Var.d2.t0(new ai.r2());
                e40Var.dismiss();
                return;
            case 3:
                org.telegram.messenger.t3 t3Var = e40Var.V2;
                if (t3Var != null && t3Var.f27052w) {
                    e40Var.N1(e40Var.J1.getTitleTextView());
                    return;
                }
                return;
            case 4:
                j20 j20Var = e40Var.C1;
                if (j20Var.m()) {
                    j20Var.j();
                    return;
                } else {
                    j20Var.d();
                    return;
                }
            case 5:
                Editable text = e40Var.C1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.ri.d0(e40Var.f30223a).Y(new CharSequence[]{text}, true, true);
                e40Var.G1(tL_textWithEntities);
                return;
            case 6:
                int S0 = e40Var.S0();
                if (S0 > 0 && S0 != Integer.MAX_VALUE) {
                    e40Var.L1.w0(0, S0, null);
                }
                org.telegram.ui.Components.rt rtVar = e40Var.C1.f41719a;
                rtVar.requestFocus();
                org.telegram.messenger.g0.I3(rtVar);
                return;
            case 7:
                org.telegram.messenger.t3 t3Var2 = e40Var.V2;
                if (t3Var2 != null && !t3Var2.j() && !e40Var.v1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(e40Var.getContext(), false);
                        return;
                    }
                    return;
                }
                e40Var.n1(false);
                return;
            case 8:
                org.telegram.messenger.t3 t3Var3 = e40Var.V2;
                if (t3Var3 != null && t3Var3.f27052w) {
                    e40Var.N1(e40Var.J1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.t3 t3Var4 = e40Var.V2;
                if (t3Var4 != null && t3Var4.f27052w) {
                    e40Var.N1(e40Var.J1.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = e40Var.X3;
                org.telegram.ui.Components.nh0 nh0Var = e40Var.F4;
                e40Var.Z3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (e40Var.G4 == 18) {
                        e40Var.G4 = 39;
                        nh0Var.P(39);
                        nh0Var.start();
                    } else {
                        nh0Var.N(0, false, false);
                        e40Var.G4 = 18;
                        nh0Var.P(18);
                        nh0Var.start();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) arrayList.get(i11);
                        org.telegram.messenger.u3 u3Var = zVar.f41388x;
                        if (u3Var.f27215a.self && !u3Var.f27216b) {
                            org.telegram.ui.Components.voip.v vVar = zVar.f41357a;
                            if (zVar.K0 == null) {
                                zVar.L0 = false;
                                ImageView imageView = zVar.f41391y0;
                                if (imageView == null) {
                                    zVar.f41391y0 = new ImageView(zVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (vVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = vVar.f41113e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        zVar.f41391y0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    zVar.f41391y0.setAlpha(0.0f);
                                } else {
                                    zVar.f41391y0.setAlpha(1.0f);
                                }
                                if (zVar.f41391y0.getParent() == null) {
                                    vVar.addView(zVar.f41391y0);
                                }
                                ((FrameLayout.LayoutParams) zVar.f41391y0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                zVar.K0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.u(zVar, 1));
                                zVar.K0.addListener(new org.telegram.ui.Components.voip.x(zVar, 2));
                                zVar.K0.setDuration(400L);
                                zVar.K0.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                                zVar.K0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            case 11:
                if (e40Var.l1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                e40Var.f47423x5 = Integer.valueOf(i10);
                e40Var.V1(true, true);
                e40Var.f47423x5 = null;
                org.telegram.messenger.g0.g3(new ii(e40Var, i10, 21));
                return;
            default:
                org.telegram.ui.ActionBar.q0 q0Var = e40Var.f47341f3;
                org.telegram.ui.ActionBar.y0 y0Var = e40Var.f47406u3;
                org.telegram.ui.ActionBar.y0 y0Var2 = e40Var.f47401t3;
                org.telegram.ui.ActionBar.y0 y0Var3 = e40Var.f47360k3;
                org.telegram.messenger.t3 t3Var5 = e40Var.V2;
                if (t3Var5 != null && !e40Var.Z3.f41003b) {
                    if (t3Var5.f27034b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.n6.Yg;
                        y0Var2.d(org.telegram.ui.ActionBar.n6.x0(null, i12, false), org.telegram.ui.ActionBar.n6.x0(null, i12, false));
                        y0Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.n6.f29643nh;
                        y0Var.d(org.telegram.ui.ActionBar.n6.x0(null, i13, false), org.telegram.ui.ActionBar.n6.x0(null, i13, false));
                        y0Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.n6.f29643nh;
                        y0Var2.d(org.telegram.ui.ActionBar.n6.x0(null, i14, false), org.telegram.ui.ActionBar.n6.x0(null, i14, false));
                        y0Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.n6.Yg;
                        y0Var.d(org.telegram.ui.ActionBar.n6.x0(null, i15, false), org.telegram.ui.ActionBar.n6.x0(null, i15, false));
                        y0Var.setChecked(false);
                    }
                    e40Var.f47344g2 = false;
                    q0Var.u(1);
                    q0Var.u(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            y0Var3.setIcon(2131232430);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                N0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                N0 = org.telegram.messenger.gd.N0(2131743253, null);
                            }
                            y0Var3.setSubtext(N0);
                        } else {
                            int i16 = 2131743250;
                            int i17 = 2131232433;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i17 = 2131232431;
                                }
                                y0Var3.setIcon(i17);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = 2131743251;
                                }
                                y0Var3.setSubtext(org.telegram.messenger.gd.N0(i16, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    y0Var3.setIcon(2131232435);
                                    y0Var3.setSubtext(org.telegram.messenger.gd.N0(2131743249, null));
                                } else {
                                    y0Var3.setIcon(2131232433);
                                    y0Var3.setSubtext(org.telegram.messenger.gd.N0(2131743250, null));
                                }
                            }
                        }
                    }
                    e40Var.P1();
                    q0Var.V(null, null);
                    return;
                }
                return;
        }
    }
}
