package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y80 implements Runnable {
    public final int f39725a;
    public final Object f39726b;
    public final Object f39727c;

    public y80(int i10, Object obj, Object obj2) {
        this.f39725a = i10;
        this.f39726b = obj;
        this.f39727c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f39725a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f39726b;
                TLObject tLObject = (TLObject) this.f39727c;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
                    MessagesController.getInstance(launchActivity.O).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.O).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    zn znVar = new zn(bundle);
                    znVar.f40310ia = resolvedbusinesschatlinks;
                    launchActivity.q0(znVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f39726b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f39727c;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 2:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f39727c).text);
                org.telegram.ui.Components.e5.u0((h) this.f39726b, string, sb2.toString(), null);
                return;
            case 3:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f39726b;
                String str = (String) this.f39727c;
                if (!launchActivity3.f31088q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f31088q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str).getQueryParameter("ref")));
                    return;
                }
                return;
            case 4:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) this.f39726b).j0((TL_account.Password) this.f39727c);
                return;
            case 5:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f39726b;
                Runnable runnable = (Runnable) this.f39727c;
                launchActivity4.f31088q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f31090r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f31090r0.getView().getVisibility() == 0) {
                        launchActivity4.f31090r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f31092s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f31092s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f39727c;
                if (!((LaunchActivity) this.f39726b).Q && LaunchActivity.E1) {
                    qcVar.j();
                    return;
                }
                return;
            case 7:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) this.f39726b).p0((vd1) this.f39727c);
                return;
            case 8:
                LaunchActivity launchActivity5 = (LaunchActivity) this.f39726b;
                nf.e eVar = (nf.e) this.f39727c;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            case 9:
                nf.e eVar2 = (nf.e) this.f39726b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f39727c;
                Pattern pattern6 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 10:
                gc0 gc0Var = (gc0) this.f39726b;
                TLObject tLObject2 = (TLObject) this.f39727c;
                gc0Var.a();
                if (tLObject2 != null) {
                    gc0Var.f33803a.j0((TL_account.Password) tLObject2);
                    return;
                }
                return;
            case 11:
                ((FiltersSetupActivity) this.f39727c).X(((gc0) this.f39726b).f33803a.O());
                return;
            case 12:
                jd0 jd0Var = (jd0) this.f39726b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f39727c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new vq(jd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 13:
                jd0 jd0Var2 = (jd0) this.f39726b;
                jd0Var2.f34815c.setImageResource(R.drawable.msg_location_alert2);
                jd0Var2.e0(((LocationController.SharingLocationInfo) this.f39727c).proximityMeters);
                jd0Var2.G = false;
                return;
            case 14:
                ((EditText) this.f39726b).removeTextChangedListener((org.telegram.ui.Components.qn) this.f39727c);
                return;
            case 15:
                Runnable runnable2 = (Runnable) this.f39727c;
                ee0 ee0Var = ((he0) this.f39726b).f34134a;
                int i12 = 0;
                while (true) {
                    gs[] gsVarArr = ee0Var.f33074f;
                    if (i12 < gsVarArr.length) {
                        gsVarArr[i12].l(0.0f);
                        i12++;
                    } else {
                        runnable2.run();
                        ee0Var.e = false;
                        return;
                    }
                }
            case 16:
                qe0 qe0Var = (qe0) this.f39726b;
                xg0 xg0Var = qe0Var.f36808y;
                xg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(qe0Var.f36799a);
                xg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f39727c), false);
                return;
            case 17:
                qe0 qe0Var2 = (qe0) this.f39726b;
                String str2 = (String) this.f39727c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = qe0Var2.f36803n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                oe0 oe0Var = new oe0(qe0Var2, 2);
                if (z10) {
                    TL_account.Password password = qe0Var2.f36803n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        oe0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.n2) qe0Var2.f36808y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, oe0Var, 10);
                    return;
                }
                return;
            case 18:
                if0 if0Var = (if0) this.f39726b;
                if0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(if0Var.O.fragmentView.findFocus());
                if0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f39727c), true);
                TLRPC.FileLocation fileLocation = if0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new y80(19, if0Var, fileLocation));
                    return;
                }
                return;
            case 19:
                i11 = ((org.telegram.ui.ActionBar.n2) ((if0) this.f39726b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f39727c);
                return;
            case 20:
                jf0 jf0Var = (jf0) this.f39726b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f39727c;
                xg0 xg0Var2 = jf0Var.E;
                xg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (jf0Var.f34862r != null && jf0Var.f34863s != null && jf0Var.v != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("phoneFormated", jf0Var.f34862r);
                        bundle2.putString("phoneHash", jf0Var.f34863s);
                        bundle2.putString("code", jf0Var.v);
                        xg0Var2.u1(5, true, bundle2, false);
                        return;
                    }
                    xg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 21:
                ag0 ag0Var = (ag0) this.f39726b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f39727c);
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f18622a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.wh.g(new StringBuilder("+"), ag0Var.f32032b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f18622a.setOnDismissListener(new wf0(ag0Var, 0));
                alertDialog$Builder.o();
                return;
            case 22:
                ag0 ag0Var2 = (ag0) this.f39726b;
                ag0Var2.getClass();
                ag0Var2.f32037e0 = ((TLRPC.TL_error) this.f39727c).text;
                return;
            case 23:
                ((ag0) this.f39726b).f32054s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f39727c), false);
                return;
            case 24:
                Runnable runnable3 = (Runnable) this.f39727c;
                ds dsVar = ((ag0) this.f39726b).f32038f;
                int i13 = 0;
                while (true) {
                    gs[] gsVarArr2 = dsVar.f33074f;
                    if (i13 < gsVarArr2.length) {
                        gsVarArr2[i13].l(0.0f);
                        i13++;
                    } else {
                        runnable3.run();
                        dsVar.e = false;
                        return;
                    }
                }
            case 25:
                ((s3) this.f39726b).run((String) this.f39727c);
                return;
            case 26:
                zh0 zh0Var = (zh0) this.f39726b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f39727c;
                zh0Var.f40151c0 = false;
                if (tL_error3 == null) {
                    qh0 f02 = zh0Var.f0();
                    zh0Var.f40159j0.clear();
                    zh0Var.h0(f02);
                    return;
                }
                return;
            case 27:
                zh0 zh0Var2 = ((ph0) this.f39726b).f36486a;
                qh0 f03 = zh0Var2.f0();
                zh0Var2.f40158i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f39727c));
                TLRPC.ChatFull chatFull = zh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    zh0Var2.getMessagesStorage().saveChatLinksCount(zh0Var2.f40162n, zh0Var2.d.invitesCount);
                }
                zh0Var2.h0(f03);
                return;
            case 28:
                kj0 kj0Var = (kj0) this.f39726b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f39727c;
                if (kj0Var.getParentActivity() != null) {
                    Toast.makeText(kj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            default:
                ek0 ek0Var = (ek0) this.f39726b;
                ek0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f39727c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ek0Var.getContext().startActivity(intent);
                return;
        }
    }
}
