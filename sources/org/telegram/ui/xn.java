package org.telegram.ui;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xn implements Runnable {
    public final int f51748a;
    public final boolean f51749b;
    public final Object f51750c;
    public final Object d;
    public final Object f51751e;

    public xn(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f51748a = i7;
        this.f51750c = obj;
        this.d = obj2;
        this.f51751e = obj3;
        this.f51749b = z9;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        boolean z9;
        byte[] bArr;
        byte[] bArr2;
        int i11;
        String M0;
        int i12;
        String M02;
        int i13;
        ?? r12;
        long h;
        boolean z10;
        int i14;
        int i15;
        String str = null;
        r9 = null;
        byte[] bArr3 = null;
        r9 = null;
        String str2 = null;
        switch (this.f51748a) {
            case 0:
                io ioVar = (io) this.f51750c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f51751e;
                boolean z11 = this.f51749b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    ioVar.f46697l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = ioVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z11) {
                        if (ioVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ioVar.getParentActivity());
                            alertDialog$Builder.f27300a.T = org.telegram.messenger.id.M0(2131746025, null);
                            alertDialog$Builder.f27300a.R = org.telegram.messenger.id.M0(2131746023, null);
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747831, null), null);
                            ioVar.showDialog(alertDialog$Builder.f27300a);
                        } else {
                            return;
                        }
                    }
                }
                org.telegram.ui.Components.q70 q70Var = ioVar.G;
                if (q70Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ioVar.f46697l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    q70Var.setLink(str);
                    ioVar.G.c(ioVar.f46697l0, ioVar.Z);
                    return;
                }
                return;
            case 1:
                qo qoVar = (qo) this.f51750c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z12 = this.f51749b;
                chat.join_to_send = z12;
                org.telegram.messenger.qp messagesController = qoVar.f49112y.d.getMessagesController();
                long j3 = chat.f26960id;
                bi.u7 u7Var = new bi.u7(qoVar, z12, chat, 17);
                oe oeVar = new oe(26, qoVar, (org.telegram.ui.Components.e70) this.f51751e);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.h1(j3);
                tL_channels_toggleJoinToSend.enabled = z12;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.di(messagesController, u7Var, oeVar, 8), 64);
                return;
            case 2:
                qo qoVar2 = (qo) this.f51750c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z13 = this.f51749b;
                chat2.join_request = z13;
                qoVar2.f49112y.d.getMessagesController().c5(chat2.f26960id, 0L, z13, false, false, new po(qoVar2, 0), new oe(25, qoVar2, (org.telegram.ui.Components.d70) this.f51751e));
                return;
            case 3:
                boolean z14 = this.f51749b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f51750c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f51751e;
                if (z14 && org.telegram.messenger.t3.T(chat3)) {
                    View d = alertDialog$Builder2.f27300a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (org.telegram.messenger.t3.V(chat3)) {
                                i7 = 2131752422;
                            } else {
                                i7 = 2131751530;
                            }
                            textView.setText(org.telegram.messenger.id.M0(i7, null));
                            return;
                        } else if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.id.M0(2131748995, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.id.M0(2131748991, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.id.M0(2131749004, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.tj tjVar = (org.telegram.ui.Components.tj) this.f51750c;
                boolean z15 = this.f51749b;
                ArrayList arrayList = (ArrayList) this.f51751e;
                tjVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new fq(21, tjVar, new ArrayList()));
                    return;
                }
                String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    str2 = S0;
                }
                if (str2 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i16 = i10 + 1;
                String[] strArr = new String[i16];
                strArr[0] = lowerCase;
                if (str2 != null) {
                    strArr[1] = str2;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!z15) {
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        org.telegram.ui.Components.oj ojVar = (org.telegram.ui.Components.oj) arrayList.get(i17);
                        File file = ojVar.f36624f;
                        if (file != null && !file.isDirectory()) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < i16) {
                                    String str3 = strArr[i18];
                                    String str4 = ojVar.f36621b;
                                    if (str4 != null) {
                                        z9 = str4.toLowerCase().contains(str3);
                                    } else {
                                        z9 = false;
                                    }
                                    if (z9) {
                                        arrayList2.add(ojVar);
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new fq(21, tjVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.b70 b70Var = (org.telegram.ui.Components.b70) this.f51750c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z16 = this.f51749b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f51751e;
                org.telegram.ui.ActionBar.f2 f2Var = b70Var.n1;
                if (f2Var != null && f2Var.getParentActivity() != null) {
                    if (tL_error2 != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                            b70Var.setOnDismissListener(new org.telegram.ui.Components.x60(1, b70Var, z16));
                        } else {
                            org.telegram.ui.Components.u4.c0(b70Var.f28669a, tL_error2, f2Var, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    b70Var.dismiss();
                    return;
                }
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.f51751e;
                boolean z17 = this.f51749b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                org.telegram.ui.Components.yv0 yv0Var = ((org.telegram.ui.Components.nv0) this.f51750c).f36400a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).I1(tL_messages_stickerSet, true);
                    if (z17) {
                        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).f2(null, tLObject2, 0, null, false, false);
                    } else {
                        yv0Var.M1 = tL_messages_stickerSet;
                        yv0Var.R0();
                        yv0Var.Z0();
                    }
                }
                u1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f51750c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z18 = this.f51749b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.f51751e;
                if (w2Var != null && !w2Var.I) {
                    w2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z18) {
                        org.telegram.messenger.g0.h3(new rg(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                } else if (u1Var2 != null && u1Var2.isShowing()) {
                    u1Var2.l(true);
                    editTextBoldCursor.requestFocus();
                    if (z18) {
                        org.telegram.messenger.g0.h3(new rg(editTextBoldCursor, 4));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                f40 f40Var = (f40) this.f51750c;
                TLObject tLObject3 = (TLObject) this.f51751e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z19 = this.f51749b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        f40Var.z1(null, tL_chatInviteExported3.link, true, z19);
                        return;
                    }
                }
                return;
            case 9:
                i50 i50Var = (i50) this.f51750c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.f51751e;
                boolean z20 = this.f51749b;
                if (tL_error3 == null) {
                    i50Var.f46504f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z20) {
                        if (i50Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i50Var.getParentActivity());
                            alertDialog$Builder3.f27300a.T = org.telegram.messenger.id.M0(2131746025, null);
                            alertDialog$Builder3.f27300a.R = org.telegram.messenger.id.M0(2131746023, null);
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131747831, null), null);
                            i50Var.showDialog(alertDialog$Builder3.f27300a);
                        } else {
                            return;
                        }
                    }
                }
                i50Var.f46503e = false;
                i50Var.f46500a.f();
                return;
            case 10:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f51751e;
                boolean z21 = this.f51749b;
                ek0 ek0Var = ((sj0) this.f51750c).f49868e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    ek0Var.J = password;
                    TwoStepVerificationActivity.r0(password);
                    ek0Var.F1(z21);
                    return;
                }
                return;
            case 11:
                sj0 sj0Var = (sj0) this.f51750c;
                String str5 = (String) this.d;
                boolean z22 = this.f51749b;
                ek0 ek0Var2 = sj0Var.f49868e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.f51751e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    ek0Var2.f45323c1 = tL_secureSecretSettings.secure_secret;
                    ek0Var2.f45320b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        ek0Var2.f45328e1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        ek0Var2.f45328e1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        org.telegram.messenger.g0.h3(new xn(sj0Var, passwordsettings, z22, bArr2, 12));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        org.telegram.messenger.g0.h3(new hf0(sj0Var, 7));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = ek0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        ek0Var2.f45328e1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    ek0Var2.f45323c1 = null;
                    ek0Var2.f45320b1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.h3(new xn(sj0Var, passwordsettings, z22, bArr2, 12));
                return;
            case 12:
                sj0 sj0Var2 = (sj0) this.f51750c;
                boolean z23 = this.f51749b;
                byte[] bArr6 = (byte[]) this.f51751e;
                ek0 ek0Var3 = sj0Var2.f49868e;
                ek0Var3.f45325d1 = ((TL_account.passwordSettings) this.d).email;
                if (z23) {
                    ek0Var3.f45328e1 = ek0Var3.P0;
                }
                byte[] bArr7 = ek0Var3.f45323c1;
                byte[] bArr8 = ek0Var3.f45328e1;
                if (bArr7 != null && bArr7.length == 32) {
                    byte[] bArr9 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr9, 0, 32);
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 32, bArr10, 0, 16);
                    byte[] bArr11 = new byte[32];
                    System.arraycopy(bArr7, 0, bArr11, 0, 32);
                    Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 0);
                    bArr3 = bArr11;
                }
                if (ek0.d1(bArr3, Long.valueOf(ek0Var3.f45320b1)) && bArr6.length != 0 && ek0Var3.f45320b1 != 0) {
                    if (ek0Var3.f45321c == 0) {
                        ConnectionsManager.getInstance(ek0.x0(ek0Var3)).sendRequest(new TL_account.getAllSecureValues(), new qj0(sj0Var2, 0));
                        return;
                    }
                    sj0Var2.a();
                    return;
                } else if (z23) {
                    org.telegram.messenger.p10.i(ek0.w0(ek0Var3)).u();
                    ek0Var3.N0 = 0;
                    ek0Var3.W1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = ek0Var3.D;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        ek0Var3.D.errors.clear();
                    }
                    byte[] bArr12 = ek0Var3.f45323c1;
                    if (bArr12 != null && bArr12.length != 0) {
                        sj0Var2.b();
                        return;
                    } else {
                        Utilities.f21341e.c(new pc0(sj0Var2, sj0Var2.f49866b, sj0Var2.d, 14));
                        return;
                    }
                }
            case 13:
                kl0 kl0Var = (kl0) this.f51750c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f51751e;
                boolean z24 = this.f51749b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject6;
                    kl0Var.f47326a0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    kl0Var.G0(z24);
                    return;
                }
                return;
            case 14:
                cb1.h0((cb1) this.f51750c, (TLRPC.TL_error) this.d, (TLObject) this.f51751e, this.f51749b);
                return;
            case 15:
                p4.d0 d0Var = (p4.d0) this.f51750c;
                boolean z25 = this.f51749b;
                p4.v vVar = (p4.v) this.d;
                Runnable runnable = (Runnable) this.f51751e;
                p4.c1 c1Var = d0Var.f53217g;
                if (z25) {
                    p4.i1 i1Var = new p4.i1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.s C = c1Var.f53195b.C(vVar);
                        if (C != null) {
                            i11 = C.b(p4.d0.B).f53302n;
                        } else if (!d0Var.h(vVar)) {
                            c8.s9.b(new p4.m1(-100));
                        } else {
                            c8.s9.b(new p4.m1(0));
                            i11 = 0;
                        }
                        p4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.j(i11, i1Var);
                        }
                    } catch (DeadObjectException unused) {
                        c1Var.f53195b.T(vVar);
                        c8.s9.b(new p4.m1(-100));
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        c8.s9.b(new p4.m1(-1));
                    }
                }
                runnable.run();
                c1Var.f53195b.q(vVar);
                return;
            case 16:
                sg.j0 j0Var = (sg.j0) this.f51750c;
                boolean z26 = this.f51749b;
                j0Var.f55102f.f(new sg.g0(j0Var, (a8.wa) this.d, 0));
                j0Var.f55102f.f(new sg.g0(j0Var, (a8.wa) this.f51751e, 0));
                j0Var.E = z26;
                return;
            case 17:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.f51750c;
                boolean z27 = this.f51749b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f51751e;
                if (z27) {
                    M0 = org.telegram.messenger.id.M0(2131753481, "BoostingGiveawayCreated");
                } else {
                    M0 = org.telegram.messenger.id.M0(2131753592, "BoostingAwardsCreated");
                }
                if (z27) {
                    if (org.telegram.messenger.t3.V(chat4)) {
                        i13 = 2131753555;
                    } else {
                        i13 = 2131753554;
                    }
                    M02 = org.telegram.messenger.id.M0(i13, null);
                } else {
                    if (org.telegram.messenger.t3.V(chat4)) {
                        i12 = 2131753557;
                    } else {
                        i12 = 2131753556;
                    }
                    M02 = org.telegram.messenger.id.M0(i12, null);
                }
                org.telegram.ui.Components.bc I = gcVar.I(2131624216, M0, org.telegram.messenger.g0.S2(M02, org.telegram.ui.ActionBar.m6.uj, 0, new bi.j3(chat4), h6Var));
                I.f32203j = 5000;
                I.j();
                return;
            default:
                wi.t0 t0Var = (wi.t0) this.f51750c;
                wi.x xVar = (wi.x) this.d;
                boolean z28 = this.f51749b;
                wi.p0 p0Var = (wi.p0) this.f51751e;
                long j10 = t0Var.f58221q;
                long nanoTime = System.nanoTime();
                try {
                    xVar.g();
                    h = xVar.h();
                    r12 = t0Var.f58217m;
                    r12.b("active output finalized: size=" + xVar.f58252a.length() + ", durationMs=" + h + ", elapsedMs=" + wi.t0.f(nanoTime));
                    t0Var.g();
                    if (h > j10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    r12 = t0Var;
                }
                try {
                    if (z28 && !z10) {
                        File file2 = xVar.f58252a;
                        ?? r02 = t0Var.f58215k;
                        ?? g0Var = new wi.g0(t0Var, p0Var, file2, h, true);
                        r02.execute(g0Var);
                        t0Var = g0Var;
                    } else {
                        File file3 = xVar.f58252a;
                        try {
                            synchronized (xVar) {
                                try {
                                    i14 = xVar.f58268s;
                                } finally {
                                    th = th;
                                    File file4 = file3;
                                    while (true) {
                                        try {
                                            try {
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c8.jd.c(file4);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            }
                            long min = Math.min(j10, h);
                            if (z10) {
                                i15 = 1;
                            } else {
                                i15 = 2;
                            }
                            t0Var.u(file3, i14, 0L, min, z28, i15);
                            c8.jd.c(file3);
                            t0Var = t0Var;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    return;
                } catch (Exception e12) {
                    e = e12;
                    r12.f58213i.post(new wi.e0(r12, e, 2));
                    return;
                }
        }
    }

    public xn(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.f51748a = i7;
        this.f51750c = obj;
        this.d = obj2;
        this.f51749b = z9;
        this.f51751e = obj3;
    }

    public xn(Object obj, TLObject tLObject, Object obj2, boolean z9, int i7) {
        this.f51748a = i7;
        this.f51750c = obj;
        this.f51751e = tLObject;
        this.d = obj2;
        this.f51749b = z9;
    }

    public xn(Object obj, boolean z9, Object obj2, Object obj3, int i7) {
        this.f51748a = i7;
        this.f51750c = obj;
        this.f51749b = z9;
        this.d = obj2;
        this.f51751e = obj3;
    }

    public xn(org.telegram.ui.Components.nv0 nv0Var, TLObject tLObject, boolean z9, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f51748a = 6;
        this.f51750c = nv0Var;
        this.f51751e = tLObject;
        this.f51749b = z9;
        this.d = u1Var;
    }

    public xn(boolean z9, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f51748a = 3;
        this.f51749b = z9;
        this.f51750c = chat;
        this.d = alertDialog$Builder;
        this.f51751e = zArr;
    }
}
