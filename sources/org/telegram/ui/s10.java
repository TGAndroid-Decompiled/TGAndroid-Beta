package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class s10 implements Runnable {
    public final int f49655a;
    public final Object f49656b;
    public final Object f49657c;

    public s10(int i7, Object obj, Object obj2) {
        this.f49655a = i7;
        this.f49656b = obj;
        this.f49657c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte[] bArr;
        int i7;
        int i10;
        switch (this.f49655a) {
            case 0:
                m4 m4Var = (m4) this.f49656b;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.k2) this.f49657c).f39426e.getBitmap(100, 100);
                    if (bitmap != null) {
                        org.telegram.messenger.g0.h3(new s10(1, m4Var, a8.ba.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                ((e40) ((m4) this.f49656b).f47740b).L2.setNewColors((int[]) this.f49657c);
                return;
            case 2:
                o50.a0((o50) this.f49656b, (TLRPC.TL_error) this.f49657c);
                return;
            case 3:
                k50 k50Var = (k50) this.f49656b;
                String str = (String) this.f49657c;
                l50 l50Var = k50Var.f47197a;
                l50Var.f47468e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                l50Var.f47467c = l50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new j50(0, k50Var, str), 66);
                return;
            case 4:
                TLObject tLObject = (TLObject) this.f49657c;
                l50 l50Var2 = ((k50) this.f49656b).f47197a;
                if (tLObject != null) {
                    o50.f0(l50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    o50.f0(l50Var2.h, null);
                    return;
                }
            case 5:
                n50 n50Var = (n50) this.f49656b;
                String str2 = (String) this.f49657c;
                n50Var.h = str2;
                o50 o50Var = n50Var.f48099r;
                if (o50Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f27068q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f27070q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                n50Var.f48098n = o50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(n50Var, str2, str2, 14), 66);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.p(11, (c60) this.f49656b, (org.telegram.messenger.s2) this.f49657c), 150L);
                return;
            case 7:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f49656b;
                languageSelectActivity.f41257e = (ArrayList) this.f49657c;
                languageSelectActivity.f41256c.f();
                return;
            case 8:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.f49656b;
                String str3 = (String) this.f49657c;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.h3(new s10(7, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) languageSelectActivity2.h.get(i11);
                    if (fdVar.f22396a.toLowerCase().startsWith(str3) || fdVar.f22397b.toLowerCase().startsWith(str3)) {
                        arrayList.add(fdVar);
                    }
                }
                int size2 = languageSelectActivity2.f41258f.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) languageSelectActivity2.f41258f.get(i12);
                    if (fdVar2.f22396a.toLowerCase().startsWith(str3) || fdVar2.f22397b.toLowerCase().startsWith(str3)) {
                        arrayList.add(fdVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new s10(7, languageSelectActivity2, arrayList));
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.f49656b;
                TLObject tLObject2 = (TLObject) this.f49657c;
                String str4 = LaunchActivity.B1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    org.telegram.messenger.qp.s1(launchActivity.O).Y3(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.qp.s1(launchActivity.O).S3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.yr.a0(launchActivity.O).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    cn cnVar = new cn(bundle);
                    cnVar.Da = resolvedbusinesschatlinks;
                    launchActivity.u0(cnVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.v4.K(launchActivity, org.telegram.messenger.id.M0(2131752716, null), org.telegram.messenger.id.M0(2131752712, null)));
                return;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f49656b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f49657c;
                String str5 = LaunchActivity.B1;
                org.telegram.messenger.qp.s1(launchActivity2.O).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2 b10 = org.telegram.messenger.k2.b(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j3, j3, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 11:
                String str6 = LaunchActivity.B1;
                String M0 = org.telegram.messenger.id.M0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751105, sb2, "\n");
                sb2.append(((TLRPC.TL_error) this.f49657c).text);
                org.telegram.ui.Components.v4.r0((g) this.f49656b, M0, sb2.toString(), null);
                return;
            case 12:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f49656b;
                String str7 = (String) this.f49657c;
                if (!launchActivity3.f41286o0.getFragmentStack().isEmpty()) {
                    launchActivity3.f41286o0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    return;
                }
                return;
            case 13:
                String str8 = LaunchActivity.B1;
                ((LaunchActivity) this.f49656b).k0((TL_account.Password) this.f49657c);
                return;
            case 14:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.f49657c;
                if (!((LaunchActivity) this.f49656b).Q && LaunchActivity.F1) {
                    ccVar.j();
                    return;
                }
                return;
            case 15:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f49656b;
                Runnable runnable = (Runnable) this.f49657c;
                launchActivity4.f41286o0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f41288p0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f41288p0.getView().getVisibility() == 0) {
                        launchActivity4.f41288p0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f41290q0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f41290q0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                String str9 = LaunchActivity.B1;
                ((LaunchActivity) this.f49656b).t0((w71) this.f49657c);
                return;
            case 17:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f49656b;
                vf.b bVar = (vf.b) this.f49657c;
                launchActivity5.O0 = null;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.U0 = null;
                launchActivity5.S0 = null;
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            case 18:
                vf.b bVar2 = (vf.b) this.f49656b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f49657c;
                String str10 = LaunchActivity.B1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (u1Var != null) {
                    u1Var.dismiss();
                    return;
                }
                return;
            case 19:
                r90 r90Var = (r90) this.f49656b;
                TLObject tLObject3 = (TLObject) this.f49657c;
                r90Var.c();
                if (tLObject3 != null) {
                    r90Var.f49347a.k0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 20:
                ((FiltersSetupActivity) this.f49657c).d0(((r90) this.f49656b).f49347a.M());
                return;
            case 21:
                ra0 ra0Var = (ra0) this.f49656b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f49657c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.g0.h3(new tp(ra0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 22:
                ra0 ra0Var2 = (ra0) this.f49656b;
                ra0Var2.f49362c.setImageResource(2131232211);
                ra0Var2.m0(((org.telegram.messenger.rd) this.f49657c).f25280f);
                ra0Var2.f49391y = false;
                return;
            case 23:
                ((EditText) this.f49656b).removeTextChangedListener((fi.h7) this.f49657c);
                return;
            case 24:
                Runnable runnable2 = (Runnable) this.f49657c;
                nb0 nb0Var = ((qb0) this.f49656b).f49001a;
                int i13 = 0;
                while (true) {
                    dr[] drVarArr = nb0Var.f43768f;
                    if (i13 < drVarArr.length) {
                        drVarArr[i13].C(0.0f);
                        i13++;
                    } else {
                        runnable2.run();
                        nb0Var.f43767e = false;
                        return;
                    }
                }
            case 25:
                zb0 zb0Var = (zb0) this.f49656b;
                ee0 ee0Var = zb0Var.D;
                ee0Var.C1(false, false);
                org.telegram.messenger.g0.v1(zb0Var.f52484a);
                ee0Var.G1((TLRPC.TL_auth_authorization) ((TLObject) this.f49657c), false);
                return;
            case 26:
                zb0 zb0Var2 = (zb0) this.f49656b;
                String str11 = (String) this.f49657c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = zb0Var2.f52489n.current_algo;
                boolean z9 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z9) {
                    bArr = org.telegram.messenger.pv.c(org.telegram.messenger.g0.h1(str11), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                xb0 xb0Var = new xb0(zb0Var2, 2);
                if (z9) {
                    TL_account.Password password = zb0Var2.f52489n;
                    TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (d == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        xb0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = d;
                    i7 = ((org.telegram.ui.ActionBar.f2) zb0Var2.D).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkPassword, xb0Var, 10);
                    return;
                }
                return;
            case 27:
                rc0 rc0Var = (rc0) this.f49656b;
                rc0Var.P.C1(false, false);
                org.telegram.messenger.g0.v1(rc0Var.P.fragmentView.findFocus());
                rc0Var.P.G1((TLRPC.TL_auth_authorization) ((TLRPC.auth_Authorization) this.f49657c), true);
                TLRPC.FileLocation fileLocation = rc0Var.O;
                if (fileLocation != null) {
                    Utilities.f21337f.c(new s10(28, rc0Var, fileLocation));
                    return;
                }
                return;
            case 28:
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.f49657c;
                i10 = ((org.telegram.ui.ActionBar.f2) ((rc0) this.f49656b).P).currentAccount;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
                if (fileLocation2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(org.telegram.messenger.w7.z(4));
                    sb3.append("/");
                    sb3.append(fileLocation2.volume_id);
                    sb3.append("_");
                    s12.N2 = a8.p0.n(fileLocation2.local_id, ".jpg", sb3);
                    s12.getFileLoader().h0(false, 16777216, s12.N2, true);
                    return;
                }
                return;
            default:
                sc0 sc0Var = (sc0) this.f49656b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f49657c;
                ee0 ee0Var2 = sc0Var.G;
                ee0Var2.C1(false, true);
                if (tL_error2 == null) {
                    if (sc0Var.f49869r != null && sc0Var.f49870s != null && sc0Var.f49871w != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", sc0Var.f49869r);
                        bundle2.putString("phoneHash", sc0Var.f49870s);
                        bundle2.putString("code", sc0Var.f49871w);
                        ee0Var2.M1(5, true, bundle2, false);
                        return;
                    }
                    ee0Var2.M1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131746115, "ResetAccountCancelledAlert"));
                    return;
                } else {
                    ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                    return;
                }
        }
    }
}
