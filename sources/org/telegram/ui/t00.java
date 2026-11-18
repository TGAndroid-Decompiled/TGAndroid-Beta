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
public final class t00 implements View.OnClickListener {
    public final int f52119a;
    public final f40 f52120b;

    public t00(f40 f40Var, int i7) {
        this.f52119a = i7;
        this.f52120b = f40Var;
    }

    @Override
    public final void onClick(View view) {
        String M0;
        int i7 = this.f52119a;
        int i10 = 2;
        f40 f40Var = this.f52120b;
        switch (i7) {
            case 0:
                if (f40Var.v1()) {
                    org.telegram.ui.Components.voip.j1.k(f40Var.d2);
                    return;
                }
                org.telegram.ui.Components.z10.f42711g0 = false;
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
                    LaunchActivity launchActivity = f40Var.d2;
                    if (launchActivity != null) {
                        f40Var.d2.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                f40Var.f47463f3.p();
                f40Var.d2.t0(new ai.x2());
                f40Var.dismiss();
                return;
            case 3:
                org.telegram.messenger.t3 t3Var = f40Var.V2;
                if (t3Var != null && t3Var.f26955w) {
                    f40Var.N1(f40Var.J1.getTitleTextView());
                    return;
                }
                return;
            case 4:
                k20 k20Var = f40Var.C1;
                if (k20Var.m()) {
                    k20Var.j();
                    return;
                } else {
                    k20Var.d();
                    return;
                }
            case 5:
                Editable text = f40Var.C1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.ri.d0(f40Var.f30189a).Y(new CharSequence[]{text}, true, true);
                f40Var.G1(tL_textWithEntities);
                return;
            case 6:
                int S0 = f40Var.S0();
                if (S0 > 0 && S0 != Integer.MAX_VALUE) {
                    f40Var.L1.w0(0, S0, null);
                }
                org.telegram.ui.Components.rt rtVar = f40Var.C1.f41786a;
                rtVar.requestFocus();
                org.telegram.messenger.g0.I3(rtVar);
                return;
            case 7:
                org.telegram.messenger.t3 t3Var2 = f40Var.V2;
                if (t3Var2 != null && !t3Var2.j() && !f40Var.v1()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(f40Var.getContext(), false);
                        return;
                    }
                    return;
                }
                f40Var.n1(false);
                return;
            case 8:
                org.telegram.messenger.t3 t3Var3 = f40Var.V2;
                if (t3Var3 != null && t3Var3.f26955w) {
                    f40Var.N1(f40Var.J1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.t3 t3Var4 = f40Var.V2;
                if (t3Var4 != null && t3Var4.f26955w) {
                    f40Var.N1(f40Var.J1.getTitleTextView());
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = f40Var.X3;
                org.telegram.ui.Components.mh0 mh0Var = f40Var.F4;
                f40Var.Z3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (f40Var.G4 == 18) {
                        f40Var.G4 = 39;
                        mh0Var.P(39);
                        mh0Var.start();
                    } else {
                        mh0Var.N(0, false, false);
                        f40Var.G4 = 18;
                        mh0Var.P(18);
                        mh0Var.start();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList.get(i11);
                        org.telegram.messenger.u3 u3Var = yVar.f41356x;
                        if (u3Var.f27119a.self && !u3Var.f27120b) {
                            org.telegram.ui.Components.voip.u uVar = yVar.f41325a;
                            if (yVar.K0 == null) {
                                yVar.L0 = false;
                                ImageView imageView = yVar.f41359y0;
                                if (imageView == null) {
                                    yVar.f41359y0 = new ImageView(yVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (uVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = uVar.f41081e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        yVar.f41359y0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    yVar.f41359y0.setAlpha(0.0f);
                                } else {
                                    yVar.f41359y0.setAlpha(1.0f);
                                }
                                if (yVar.f41359y0.getParent() == null) {
                                    uVar.addView(yVar.f41359y0);
                                }
                                ((FrameLayout.LayoutParams) yVar.f41359y0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                yVar.K0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.t(yVar, 1));
                                yVar.K0.addListener(new org.telegram.ui.Components.voip.w(yVar, 2));
                                yVar.K0.setDuration(400L);
                                yVar.K0.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                                yVar.K0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            case 11:
                if (f40Var.l1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                f40Var.f47545x5 = Integer.valueOf(i10);
                f40Var.W1(true, true);
                f40Var.f47545x5 = null;
                org.telegram.messenger.g0.g3(new ii(f40Var, i10, 19));
                return;
            default:
                org.telegram.ui.ActionBar.r0 r0Var = f40Var.f47463f3;
                org.telegram.ui.ActionBar.z0 z0Var = f40Var.f47528u3;
                org.telegram.ui.ActionBar.z0 z0Var2 = f40Var.f47523t3;
                org.telegram.ui.ActionBar.z0 z0Var3 = f40Var.f47482k3;
                org.telegram.messenger.t3 t3Var5 = f40Var.V2;
                if (t3Var5 != null && !f40Var.Z3.f40973b) {
                    if (t3Var5.f26937b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.n6.Yg;
                        z0Var2.d(org.telegram.ui.ActionBar.n6.x0(null, i12, false), org.telegram.ui.ActionBar.n6.x0(null, i12, false));
                        z0Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.n6.f29588nh;
                        z0Var.d(org.telegram.ui.ActionBar.n6.x0(null, i13, false), org.telegram.ui.ActionBar.n6.x0(null, i13, false));
                        z0Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.n6.f29588nh;
                        z0Var2.d(org.telegram.ui.ActionBar.n6.x0(null, i14, false), org.telegram.ui.ActionBar.n6.x0(null, i14, false));
                        z0Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.n6.Yg;
                        z0Var.d(org.telegram.ui.ActionBar.n6.x0(null, i15, false), org.telegram.ui.ActionBar.n6.x0(null, i15, false));
                        z0Var.setChecked(false);
                    }
                    f40Var.f47466g2 = false;
                    r0Var.u(1);
                    r0Var.u(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            z0Var3.setIcon(2131232427);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                M0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                M0 = org.telegram.messenger.gd.M0(2131743266, null);
                            }
                            z0Var3.setSubtext(M0);
                        } else {
                            int i16 = 2131743263;
                            int i17 = 2131232430;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i17 = 2131232428;
                                }
                                z0Var3.setIcon(i17);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = 2131743264;
                                }
                                z0Var3.setSubtext(org.telegram.messenger.gd.M0(i16, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    z0Var3.setIcon(2131232432);
                                    z0Var3.setSubtext(org.telegram.messenger.gd.M0(2131743262, null));
                                } else {
                                    z0Var3.setIcon(2131232430);
                                    z0Var3.setSubtext(org.telegram.messenger.gd.M0(2131743263, null));
                                }
                            }
                        }
                    }
                    f40Var.P1();
                    r0Var.V(null, null);
                    return;
                }
                return;
        }
    }
}
