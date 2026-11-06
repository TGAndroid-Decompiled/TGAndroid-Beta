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
public final class vn implements Runnable {
    public final int f50760a;
    public final boolean f50761b;
    public final Object f50762c;
    public final Object d;
    public final Object f50763e;

    public vn(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f50760a = i7;
        this.f50762c = obj;
        this.d = obj2;
        this.f50763e = obj3;
        this.f50761b = z9;
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
        switch (this.f50760a) {
            case 0:
                go goVar = (go) this.f50762c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f50763e;
                boolean z11 = this.f50761b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    goVar.f46062l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = goVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z11) {
                        if (goVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(goVar.getParentActivity());
                            alertDialog$Builder.f27292a.T = org.telegram.messenger.hd.M0(2131746026, null);
                            alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131746024, null);
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747830, null), null);
                            goVar.showDialog(alertDialog$Builder.f27292a);
                        } else {
                            return;
                        }
                    }
                }
                org.telegram.ui.Components.q70 q70Var = goVar.G;
                if (q70Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = goVar.f46062l0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    q70Var.setLink(str);
                    goVar.G.c(goVar.f46062l0, goVar.Z);
                    return;
                }
                return;
            case 1:
                oo ooVar = (oo) this.f50762c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z12 = this.f50761b;
                chat.join_to_send = z12;
                org.telegram.messenger.qp messagesController = ooVar.f48463y.d.getMessagesController();
                long j3 = chat.f26952id;
                bi.u7 u7Var = new bi.u7(ooVar, z12, chat, 17);
                qf qfVar = new qf(25, ooVar, (org.telegram.ui.Components.e70) this.f50763e);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.h1(j3);
                tL_channels_toggleJoinToSend.enabled = z12;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.di(messagesController, u7Var, qfVar, 8), 64);
                return;
            case 2:
                oo ooVar2 = (oo) this.f50762c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z13 = this.f50761b;
                chat2.join_request = z13;
                ooVar2.f48463y.d.getMessagesController().c5(chat2.f26952id, 0L, z13, false, false, new no(ooVar2, 0), new qf(24, ooVar2, (org.telegram.ui.Components.d70) this.f50763e));
                return;
            case 3:
                boolean z14 = this.f50761b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f50762c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f50763e;
                if (z14 && org.telegram.messenger.t3.T(chat3)) {
                    View d = alertDialog$Builder2.f27292a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (org.telegram.messenger.t3.V(chat3)) {
                                i7 = 2131752422;
                            } else {
                                i7 = 2131751531;
                            }
                            textView.setText(org.telegram.messenger.hd.M0(i7, null));
                            return;
                        } else if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.hd.M0(2131748994, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.hd.M0(2131748990, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.hd.M0(2131749003, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.uj ujVar = (org.telegram.ui.Components.uj) this.f50762c;
                boolean z15 = this.f50761b;
                ArrayList arrayList = (ArrayList) this.f50763e;
                ujVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f(20, ujVar, new ArrayList()));
                    return;
                }
                String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
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
                        org.telegram.ui.Components.pj pjVar = (org.telegram.ui.Components.pj) arrayList.get(i17);
                        File file = pjVar.f36910f;
                        if (file != null && !file.isDirectory()) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < i16) {
                                    String str3 = strArr[i18];
                                    String str4 = pjVar.f36907b;
                                    if (str4 != null) {
                                        z9 = str4.toLowerCase().contains(str3);
                                    } else {
                                        z9 = false;
                                    }
                                    if (z9) {
                                        arrayList2.add(pjVar);
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.f(20, ujVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.b70 b70Var = (org.telegram.ui.Components.b70) this.f50762c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z16 = this.f50761b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f50763e;
                org.telegram.ui.ActionBar.f2 f2Var = b70Var.f32022k1;
                if (f2Var != null && f2Var.getParentActivity() != null) {
                    if (tL_error2 != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                            b70Var.setOnDismissListener(new org.telegram.ui.Components.x60(1, b70Var, z16));
                        } else {
                            org.telegram.ui.Components.v4.c0(b70Var.f28612a, tL_error2, f2Var, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    b70Var.dismiss();
                    return;
                }
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.f50763e;
                boolean z17 = this.f50761b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                org.telegram.ui.Components.yv0 yv0Var = ((org.telegram.ui.Components.nv0) this.f50762c).f36391a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24459s0).I1(tL_messages_stickerSet, true);
                    if (z17) {
                        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24459s0).f2(null, tLObject2, 0, null, false, false);
                    } else {
                        yv0Var.J1 = tL_messages_stickerSet;
                        yv0Var.R0();
                        yv0Var.Z0();
                    }
                }
                u1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f50762c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z18 = this.f50761b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.f50763e;
                if (v2Var != null && !v2Var.I) {
                    v2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z18) {
                        org.telegram.messenger.g0.h3(new sg(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                } else if (u1Var2 != null && u1Var2.isShowing()) {
                    u1Var2.l(true);
                    editTextBoldCursor.requestFocus();
                    if (z18) {
                        org.telegram.messenger.g0.h3(new sg(editTextBoldCursor, 4));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                c40 c40Var = (c40) this.f50762c;
                TLObject tLObject3 = (TLObject) this.f50763e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z19 = this.f50761b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        c40Var.z1(null, tL_chatInviteExported3.link, true, z19);
                        return;
                    }
                }
                return;
            case 9:
                f50 f50Var = (f50) this.f50762c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.f50763e;
                boolean z20 = this.f50761b;
                if (tL_error3 == null) {
                    f50Var.f45494f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z20) {
                        if (f50Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(f50Var.getParentActivity());
                            alertDialog$Builder3.f27292a.T = org.telegram.messenger.hd.M0(2131746026, null);
                            alertDialog$Builder3.f27292a.R = org.telegram.messenger.hd.M0(2131746024, null);
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131747830, null), null);
                            f50Var.showDialog(alertDialog$Builder3.f27292a);
                        } else {
                            return;
                        }
                    }
                }
                f50Var.f45493e = false;
                f50Var.f45490a.f();
                return;
            case 10:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f50763e;
                boolean z21 = this.f50761b;
                bk0 bk0Var = ((pj0) this.f50762c).f48845e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    bk0Var.J = password;
                    TwoStepVerificationActivity.r0(password);
                    bk0Var.F1(z21);
                    return;
                }
                return;
            case 11:
                pj0 pj0Var = (pj0) this.f50762c;
                String str5 = (String) this.d;
                boolean z22 = this.f50761b;
                bk0 bk0Var2 = pj0Var.f48845e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.f50763e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    bk0Var2.f44368c1 = tL_secureSecretSettings.secure_secret;
                    bk0Var2.f44365b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        bk0Var2.f44373e1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        bk0Var2.f44373e1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        org.telegram.messenger.g0.h3(new vn(pj0Var, passwordsettings, z22, bArr2, 12));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        org.telegram.messenger.g0.h3(new ef0(pj0Var, 7));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = bk0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        bk0Var2.f44373e1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    bk0Var2.f44368c1 = null;
                    bk0Var2.f44365b1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.h3(new vn(pj0Var, passwordsettings, z22, bArr2, 12));
                return;
            case 12:
                pj0 pj0Var2 = (pj0) this.f50762c;
                boolean z23 = this.f50761b;
                byte[] bArr6 = (byte[]) this.f50763e;
                bk0 bk0Var3 = pj0Var2.f48845e;
                bk0Var3.f44370d1 = ((TL_account.passwordSettings) this.d).email;
                if (z23) {
                    bk0Var3.f44373e1 = bk0Var3.P0;
                }
                byte[] bArr7 = bk0Var3.f44368c1;
                byte[] bArr8 = bk0Var3.f44373e1;
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
                if (bk0.d1(bArr3, Long.valueOf(bk0Var3.f44365b1)) && bArr6.length != 0 && bk0Var3.f44365b1 != 0) {
                    if (bk0Var3.f44366c == 0) {
                        ConnectionsManager.getInstance(bk0.x0(bk0Var3)).sendRequest(new TL_account.getAllSecureValues(), new nj0(pj0Var2, 0));
                        return;
                    }
                    pj0Var2.a();
                    return;
                } else if (z23) {
                    org.telegram.messenger.p10.i(bk0.w0(bk0Var3)).u();
                    bk0Var3.N0 = 0;
                    bk0Var3.W1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = bk0Var3.D;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        bk0Var3.D.errors.clear();
                    }
                    byte[] bArr12 = bk0Var3.f44368c1;
                    if (bArr12 != null && bArr12.length != 0) {
                        pj0Var2.b();
                        return;
                    } else {
                        Utilities.f21333e.c(new mc0(pj0Var2, pj0Var2.f48843b, pj0Var2.d, 14));
                        return;
                    }
                }
            case 13:
                hl0 hl0Var = (hl0) this.f50762c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f50763e;
                boolean z24 = this.f50761b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject6;
                    hl0Var.f46408a0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    hl0Var.G0(z24);
                    return;
                }
                return;
            case 14:
                ya1.h0((ya1) this.f50762c, (TLRPC.TL_error) this.d, (TLObject) this.f50763e, this.f50761b);
                return;
            case 15:
                p4.d0 d0Var = (p4.d0) this.f50762c;
                boolean z25 = this.f50761b;
                p4.v vVar = (p4.v) this.d;
                Runnable runnable = (Runnable) this.f50763e;
                p4.c1 c1Var = d0Var.f53114g;
                if (z25) {
                    p4.i1 i1Var = new p4.i1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.s C = c1Var.f53092b.C(vVar);
                        if (C != null) {
                            i11 = C.b(p4.d0.B).f53199n;
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
                        c1Var.f53092b.T(vVar);
                        c8.s9.b(new p4.m1(-100));
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        c8.s9.b(new p4.m1(-1));
                    }
                }
                runnable.run();
                c1Var.f53092b.q(vVar);
                return;
            case 16:
                sg.j0 j0Var = (sg.j0) this.f50762c;
                boolean z26 = this.f50761b;
                j0Var.f54998f.f(new sg.g0(j0Var, (a8.wa) this.d, 0));
                j0Var.f54998f.f(new sg.g0(j0Var, (a8.wa) this.f50763e, 0));
                j0Var.E = z26;
                return;
            case 17:
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) this.f50762c;
                boolean z27 = this.f50761b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f50763e;
                if (z27) {
                    M0 = org.telegram.messenger.hd.M0(2131753481, "BoostingGiveawayCreated");
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131753592, "BoostingAwardsCreated");
                }
                if (z27) {
                    if (org.telegram.messenger.t3.V(chat4)) {
                        i13 = 2131753555;
                    } else {
                        i13 = 2131753554;
                    }
                    M02 = org.telegram.messenger.hd.M0(i13, null);
                } else {
                    if (org.telegram.messenger.t3.V(chat4)) {
                        i12 = 2131753557;
                    } else {
                        i12 = 2131753556;
                    }
                    M02 = org.telegram.messenger.hd.M0(i12, null);
                }
                org.telegram.ui.Components.cc I = hcVar.I(2131624216, M0, org.telegram.messenger.g0.S2(M02, org.telegram.ui.ActionBar.k6.uj, 0, new bi.j3(chat4), f6Var));
                I.f32527j = 5000;
                I.j();
                return;
            default:
                wi.t0 t0Var = (wi.t0) this.f50762c;
                wi.x xVar = (wi.x) this.d;
                boolean z28 = this.f50761b;
                wi.p0 p0Var = (wi.p0) this.f50763e;
                long j10 = t0Var.f58113q;
                long nanoTime = System.nanoTime();
                try {
                    xVar.g();
                    h = xVar.h();
                    r12 = t0Var.f58109m;
                    r12.b("active output finalized: size=" + xVar.f58144a.length() + ", durationMs=" + h + ", elapsedMs=" + wi.t0.f(nanoTime));
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
                        File file2 = xVar.f58144a;
                        ?? r02 = t0Var.f58107k;
                        ?? g0Var = new wi.g0(t0Var, p0Var, file2, h, true);
                        r02.execute(g0Var);
                        t0Var = g0Var;
                    } else {
                        File file3 = xVar.f58144a;
                        try {
                            synchronized (xVar) {
                                try {
                                    i14 = xVar.f58160s;
                                } finally {
                                    th = th;
                                    File file4 = file3;
                                    while (true) {
                                        try {
                                            try {
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c8.id.c(file4);
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
                            t0Var.t(file3, i14, 0L, min, z28, i15);
                            c8.id.c(file3);
                            t0Var = t0Var;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    return;
                } catch (Exception e12) {
                    e = e12;
                    r12.f58105i.post(new wi.e0(r12, e, 2));
                    return;
                }
        }
    }

    public vn(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.f50760a = i7;
        this.f50762c = obj;
        this.d = obj2;
        this.f50761b = z9;
        this.f50763e = obj3;
    }

    public vn(Object obj, TLObject tLObject, Object obj2, boolean z9, int i7) {
        this.f50760a = i7;
        this.f50762c = obj;
        this.f50763e = tLObject;
        this.d = obj2;
        this.f50761b = z9;
    }

    public vn(Object obj, boolean z9, Object obj2, Object obj3, int i7) {
        this.f50760a = i7;
        this.f50762c = obj;
        this.f50761b = z9;
        this.d = obj2;
        this.f50763e = obj3;
    }

    public vn(org.telegram.ui.Components.nv0 nv0Var, TLObject tLObject, boolean z9, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f50760a = 6;
        this.f50762c = nv0Var;
        this.f50763e = tLObject;
        this.f50761b = z9;
        this.d = u1Var;
    }

    public vn(boolean z9, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f50760a = 3;
        this.f50761b = z9;
        this.f50762c = chat;
        this.d = alertDialog$Builder;
        this.f50763e = zArr;
    }
}
