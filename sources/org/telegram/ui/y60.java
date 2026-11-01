package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y60 implements Runnable {
    public final int f43588a;
    public final Object f43589b;
    public final Object f43590c;

    public y60(int i10, Object obj, Object obj2) {
        this.f43588a = i10;
        this.f43589b = obj;
        this.f43590c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f43588a) {
            case 0:
                org.telegram.messenger.i0.h3(new h0(5, (z60) this.f43589b, (org.telegram.messenger.w2) this.f43590c), 150L);
                return;
            case 1:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f43589b;
                languageSelectActivity.e = (ArrayList) this.f43590c;
                languageSelectActivity.f33350c.f();
                return;
            case 2:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f43589b;
                String str = (String) this.f43590c;
                if (str.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.i0.g3(new y60(1, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ad adVar = (org.telegram.messenger.ad) languageSelectActivity2.h.get(i12);
                    if (adVar.f14591a.toLowerCase().startsWith(str) || adVar.f14592b.toLowerCase().startsWith(str)) {
                        arrayList.add(adVar);
                    }
                }
                int size2 = languageSelectActivity2.f33351f.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    org.telegram.messenger.ad adVar2 = (org.telegram.messenger.ad) languageSelectActivity2.f33351f.get(i13);
                    if (adVar2.f14591a.toLowerCase().startsWith(str) || adVar2.f14592b.toLowerCase().startsWith(str)) {
                        arrayList.add(adVar2);
                    }
                }
                org.telegram.messenger.i0.g3(new y60(1, languageSelectActivity2, arrayList));
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.f43589b;
                TLObject tLObject = (TLObject) this.f43590c;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    org.telegram.messenger.wp.r1(launchActivity.O).V3(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.wp.r1(launchActivity.O).P3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.is.a0(launchActivity.O).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    un unVar = new un(bundle);
                    unVar.Ba = resolvedbusinesschatlinks;
                    launchActivity.u0(unVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, org.telegram.messenger.dd.L0(2131752716, null), org.telegram.messenger.dd.L0(2131752712, null)));
                return;
            case 4:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f43589b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f43590c;
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.wp.r1(launchActivity2.O).V3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.o2 b10 = org.telegram.messenger.o2.b(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j10, j10, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 5:
                Pattern pattern3 = LaunchActivity.D1;
                String L0 = org.telegram.messenger.dd.L0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.a30.q(null, 2131751106, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f43590c).text);
                org.telegram.ui.Components.s4.t0((f) this.f43589b, L0, sb2.toString(), null);
                return;
            case 6:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f43589b;
                String str2 = (String) this.f43590c;
                if (!launchActivity3.f33384q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f33384q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str2).getQueryParameter("ref")));
                    return;
                }
                return;
            case 7:
                Pattern pattern4 = LaunchActivity.D1;
                ((LaunchActivity) this.f43589b).k0((TL_account.Password) this.f43590c);
                return;
            case 8:
                org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) this.f43590c;
                if (!((LaunchActivity) this.f43589b).Q && LaunchActivity.G1) {
                    wbVar.j();
                    return;
                }
                return;
            case 9:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f43589b;
                Runnable runnable = (Runnable) this.f43590c;
                launchActivity4.f33384q0.getView().setVisibility(4);
                if (org.telegram.messenger.i0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f33386r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f33386r0.getView().getVisibility() == 0) {
                        launchActivity4.f33386r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f33388s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f33388s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                Pattern pattern5 = LaunchActivity.D1;
                ((LaunchActivity) this.f43589b).t0((k91) this.f43590c);
                return;
            case 11:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f43589b;
                gf.e eVar = (gf.e) this.f43590c;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.T0 = null;
                launchActivity5.W0 = null;
                launchActivity5.U0 = null;
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            case 12:
                gf.e eVar2 = (gf.e) this.f43589b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.f43590c;
                Pattern pattern6 = LaunchActivity.D1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (x1Var != null) {
                    x1Var.dismiss();
                    return;
                }
                return;
            case 13:
                ta0 ta0Var = (ta0) this.f43589b;
                TLObject tLObject2 = (TLObject) this.f43590c;
                ta0Var.c();
                if (tLObject2 != null) {
                    ta0Var.f41597a.k0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 14:
                ((FiltersSetupActivity) this.f43590c).d0(((ta0) this.f43589b).f41597a.M());
                return;
            case 15:
                xb0 xb0Var = (xb0) this.f43589b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f43590c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.i0.g3(new qq(xb0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 16:
                xb0 xb0Var2 = (xb0) this.f43589b;
                xb0Var2.f43304c.setImageResource(2131232210);
                xb0Var2.m0(((org.telegram.messenger.nd) this.f43590c).f17285f);
                xb0Var2.E = false;
                return;
            case 17:
                ((EditText) this.f43589b).removeTextChangedListener((ag.u2) this.f43590c);
                return;
            case 18:
                Runnable runnable2 = (Runnable) this.f43590c;
                tc0 tc0Var = ((vc0) this.f43589b).f42478a;
                int i14 = 0;
                while (true) {
                    bs[] bsVarArr = tc0Var.f44045f;
                    if (i14 < bsVarArr.length) {
                        bsVarArr[i14].C(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        tc0Var.e = false;
                        return;
                    }
                }
            case 19:
                dd0 dd0Var = (dd0) this.f43589b;
                gf0 gf0Var = dd0Var.D;
                gf0Var.t1(false, false);
                org.telegram.messenger.i0.v1(dd0Var.f36561a);
                gf0Var.x1((TLRPC.TL_auth_authorization) ((TLObject) this.f43590c), false);
                return;
            case 20:
                dd0 dd0Var2 = (dd0) this.f43589b;
                String str3 = (String) this.f43590c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = dd0Var2.f36565n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = org.telegram.messenger.bw.c(org.telegram.messenger.i0.h1(str3), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                bd0 bd0Var = new bd0(dd0Var2, 2);
                if (z10) {
                    TL_account.Password password = dd0Var2.f36565n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.bw.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        bd0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    i10 = ((org.telegram.ui.ActionBar.k2) dd0Var2.D).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, bd0Var, 10);
                    return;
                }
                return;
            case 21:
                vd0 vd0Var = (vd0) this.f43589b;
                vd0Var.O.t1(false, false);
                org.telegram.messenger.i0.v1(vd0Var.O.fragmentView.findFocus());
                vd0Var.O.x1((TLRPC.TL_auth_authorization) ((TLObject) this.f43590c), true);
                TLRPC.FileLocation fileLocation = vd0Var.N;
                if (fileLocation != null) {
                    Utilities.f14522f.c(new y60(22, vd0Var, fileLocation));
                    return;
                }
                return;
            case 22:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f43590c;
                i11 = ((org.telegram.ui.ActionBar.k2) ((vd0) this.f43589b).O).currentAccount;
                org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i11);
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.b8.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    r12.N2 = a1.g.p(sb3, fileLocation2.local_id, ".jpg");
                    r12.getFileLoader().i0(false, 16777216, r12.N2, true);
                    return;
                }
                return;
            case 23:
                wd0 wd0Var = (wd0) this.f43589b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f43590c;
                gf0 gf0Var2 = wd0Var.G;
                gf0Var2.t1(false, true);
                if (tL_error2 == null) {
                    if (wd0Var.f42767r != null && wd0Var.f42768s != null && wd0Var.f42769w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", wd0Var.f42767r);
                        bundle2.putString("phoneHash", wd0Var.f42768s);
                        bundle2.putString("code", wd0Var.f42769w);
                        gf0Var2.D1(5, true, bundle2, false);
                        return;
                    }
                    gf0Var2.D1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131746132, "ResetAccountCancelledAlert"));
                    return;
                } else {
                    gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                    return;
                }
            case 24:
                le0 le0Var = (le0) this.f43589b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f43590c);
                alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131752579, null);
                alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.a0("CancelLinkSuccess", null, 2131752580, org.telegram.messenger.m5.h(new StringBuilder("+"), le0Var.f39235b, af.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752041, null), null);
                alertDialog$Builder.f20135a.setOnDismissListener(new he0(le0Var, 0));
                alertDialog$Builder.p();
                return;
            case 25:
                le0 le0Var2 = (le0) this.f43589b;
                le0Var2.getClass();
                le0Var2.f39243g0 = ((TLRPC.TL_error) this.f43590c).text;
                return;
            case 26:
                ((le0) this.f43589b).f39259u0.x1((TLRPC.TL_auth_authorization) ((TLObject) this.f43590c), false);
                return;
            case 27:
                Runnable runnable3 = (Runnable) this.f43590c;
                zr zrVar = ((le0) this.f43589b).f39241f;
                int i15 = 0;
                while (true) {
                    bs[] bsVarArr2 = zrVar.f44045f;
                    if (i15 < bsVarArr2.length) {
                        bsVarArr2[i15].C(0.0f);
                        i15++;
                    } else {
                        runnable3.run();
                        zrVar.e = false;
                        return;
                    }
                }
            case 28:
                ((s3) this.f43589b).a((String) this.f43590c);
                return;
            default:
                ArrayList arrayList2 = (ArrayList) this.f43590c;
                gf0 gf0Var3 = ((ff0) this.f43589b).f37124a0;
                SharedPreferences d12 = org.telegram.messenger.wp.d1();
                if (!d12.getBoolean("firstloginshow", true) && !gf0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    gf0Var3.getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                    return;
                }
                d12.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gf0Var3.getParentActivity());
                int i16 = org.telegram.ui.ActionBar.t6.L5;
                alertDialog$Builder2.m(2131624065, 46, org.telegram.ui.ActionBar.t6.x0(null, i16, false), null);
                alertDialog$Builder2.n(i16, null);
                alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131751771, "Continue"), null);
                String L02 = org.telegram.messenger.dd.L0(2131754278, "AllowFillNumber");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                x1Var2.T = L02;
                gf0Var3.f37487n = gf0Var3.showDialog(x1Var2, true, null);
                gf0Var3.f37476c0 = true;
                return;
        }
    }
}
