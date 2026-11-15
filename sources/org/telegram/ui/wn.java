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
public final class wn implements Runnable {
    public final int f52934a;
    public final boolean f52935b;
    public final Object f52936c;
    public final Object d;
    public final Object f52937e;

    public wn(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f52934a = i7;
        this.f52936c = obj;
        this.d = obj2;
        this.f52937e = obj3;
        this.f52935b = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        boolean z10;
        byte[] bArr;
        byte[] bArr2;
        int i11;
        String M0;
        int i12;
        String M02;
        int i13;
        boolean z11;
        int i14;
        long min;
        int i15;
        String str = null;
        r10 = null;
        byte[] bArr3 = null;
        r10 = null;
        String str2 = null;
        switch (this.f52934a) {
            case 0:
                ho hoVar = (ho) this.f52936c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f52937e;
                boolean z12 = this.f52935b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    hoVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = hoVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z12) {
                        if (hoVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hoVar.getParentActivity());
                            alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131746025, null);
                            alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131746023, null);
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                            hoVar.showDialog(alertDialog$Builder.f28392a);
                        } else {
                            return;
                        }
                    }
                }
                org.telegram.ui.Components.t70 t70Var = hoVar.H;
                if (t70Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hoVar.m0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    t70Var.setLink(str);
                    hoVar.H.c(hoVar.m0, hoVar.f47749a0);
                    return;
                }
                return;
            case 1:
                po poVar = (po) this.f52936c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = this.f52935b;
                chat.join_to_send = z13;
                org.telegram.messenger.np messagesController = poVar.f50320y.d.getMessagesController();
                long j3 = chat.f28051id;
                di.m6 m6Var = new di.m6(poVar, z13, chat, 17);
                zg zgVar = new zg(14, poVar, (org.telegram.ui.Components.h70) this.f52937e);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.h1(j3);
                tL_channels_toggleJoinToSend.enabled = z13;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.bi(messagesController, m6Var, zgVar, 8), 64);
                return;
            case 2:
                po poVar2 = (po) this.f52936c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z14 = this.f52935b;
                chat2.join_request = z14;
                poVar2.f50320y.d.getMessagesController().d5(chat2.f28051id, 0L, z14, false, false, new oo(poVar2, 0), new zg(13, poVar2, (org.telegram.ui.Components.g70) this.f52937e));
                return;
            case 3:
                boolean z15 = this.f52935b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f52936c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f52937e;
                if (z15 && org.telegram.messenger.t3.T(chat3)) {
                    View d = alertDialog$Builder2.f28392a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (org.telegram.messenger.t3.V(chat3)) {
                                i7 = 2131752422;
                            } else {
                                i7 = 2131751530;
                            }
                            textView.setText(org.telegram.messenger.hd.M0(i7, null));
                            return;
                        } else if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.hd.M0(2131748995, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.hd.M0(2131748991, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.hd.M0(2131749004, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.ck ckVar = (org.telegram.ui.Components.ck) this.f52936c;
                boolean z16 = this.f52935b;
                ArrayList arrayList = (ArrayList) this.f52937e;
                ckVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.od(14, ckVar, new ArrayList()));
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
                if (!z16) {
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        org.telegram.ui.Components.wj wjVar = (org.telegram.ui.Components.wj) arrayList.get(i17);
                        File file = wjVar.f41369f;
                        if (file != null && !file.isDirectory()) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < i16) {
                                    String str3 = strArr[i18];
                                    String str4 = wjVar.f41366b;
                                    if (str4 != null) {
                                        z10 = str4.toLowerCase().contains(str3);
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList2.add(wjVar);
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.od(14, ckVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.e70 e70Var = (org.telegram.ui.Components.e70) this.f52936c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z17 = this.f52935b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f52937e;
                org.telegram.ui.ActionBar.e2 e2Var = e70Var.f34230o1;
                if (e2Var != null && e2Var.getParentActivity() != null) {
                    if (tL_error2 != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                            e70Var.setOnDismissListener(new org.telegram.ui.Components.a70(1, e70Var, z17));
                        } else {
                            org.telegram.ui.Components.t4.c0(e70Var.f29679a, tL_error2, e2Var, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    e70Var.dismiss();
                    return;
                }
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.f52937e;
                boolean z18 = this.f52935b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                org.telegram.ui.Components.bw0 bw0Var = ((org.telegram.ui.Components.pv0) this.f52936c).f38416a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24940t0).I1(tL_messages_stickerSet, true);
                    if (z18) {
                        org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24940t0).f2(null, tLObject2, 0, null, false, false);
                    } else {
                        bw0Var.N1 = tL_messages_stickerSet;
                        bw0Var.R0();
                        bw0Var.Z0();
                    }
                }
                t1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f52936c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z19 = this.f52935b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.f52937e;
                if (u2Var != null && !u2Var.J) {
                    u2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z19) {
                        org.telegram.messenger.g0.h3(new og(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                } else if (t1Var2 != null && t1Var2.isShowing()) {
                    t1Var2.l(true);
                    editTextBoldCursor.requestFocus();
                    if (z19) {
                        org.telegram.messenger.g0.h3(new og(editTextBoldCursor, 4));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                c40 c40Var = (c40) this.f52936c;
                TLObject tLObject3 = (TLObject) this.f52937e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z20 = this.f52935b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        c40Var.z1(null, tL_chatInviteExported3.link, true, z20);
                        return;
                    }
                }
                return;
            case 9:
                e50 e50Var = (e50) this.f52936c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.f52937e;
                boolean z21 = this.f52935b;
                if (tL_error3 == null) {
                    e50Var.f46559f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z21) {
                        if (e50Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e50Var.getParentActivity());
                            alertDialog$Builder3.f28392a.U = org.telegram.messenger.hd.M0(2131746025, null);
                            alertDialog$Builder3.f28392a.S = org.telegram.messenger.hd.M0(2131746023, null);
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                            e50Var.showDialog(alertDialog$Builder3.f28392a);
                        } else {
                            return;
                        }
                    }
                }
                e50Var.f46558e = false;
                e50Var.f46555a.f();
                return;
            case 10:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f52937e;
                boolean z22 = this.f52935b;
                ek0 ek0Var = ((sj0) this.f52936c).f51233e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    ek0Var.K = password;
                    TwoStepVerificationActivity.r0(password);
                    ek0Var.F1(z22);
                    return;
                }
                return;
            case 11:
                sj0 sj0Var = (sj0) this.f52936c;
                String str5 = (String) this.d;
                boolean z23 = this.f52935b;
                ek0 ek0Var2 = sj0Var.f51233e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.f52937e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    ek0Var2.f46802d1 = tL_secureSecretSettings.secure_secret;
                    ek0Var2.f46800c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        ek0Var2.f46808f1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        ek0Var2.f46808f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        org.telegram.messenger.g0.h3(new wn(sj0Var, passwordsettings, z23, bArr2, 12));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        org.telegram.messenger.g0.h3(new ef0(sj0Var, 7));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = ek0Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        ek0Var2.f46808f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    ek0Var2.f46802d1 = null;
                    ek0Var2.f46800c1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.h3(new wn(sj0Var, passwordsettings, z23, bArr2, 12));
                return;
            case 12:
                sj0 sj0Var2 = (sj0) this.f52936c;
                boolean z24 = this.f52935b;
                byte[] bArr6 = (byte[]) this.f52937e;
                ek0 ek0Var3 = sj0Var2.f51233e;
                ek0Var3.f46805e1 = ((TL_account.passwordSettings) this.d).email;
                if (z24) {
                    ek0Var3.f46808f1 = ek0Var3.Q0;
                }
                byte[] bArr7 = ek0Var3.f46802d1;
                byte[] bArr8 = ek0Var3.f46808f1;
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
                if (ek0.d1(bArr3, Long.valueOf(ek0Var3.f46800c1)) && bArr6.length != 0 && ek0Var3.f46800c1 != 0) {
                    if (ek0Var3.f46798c == 0) {
                        ConnectionsManager.getInstance(ek0.x0(ek0Var3)).sendRequest(new TL_account.getAllSecureValues(), new qj0(sj0Var2, 0));
                        return;
                    }
                    sj0Var2.a();
                    return;
                } else if (z24) {
                    org.telegram.messenger.m10.i(ek0.w0(ek0Var3)).u();
                    ek0Var3.O0 = 0;
                    ek0Var3.W1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = ek0Var3.E;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        ek0Var3.E.errors.clear();
                    }
                    byte[] bArr12 = ek0Var3.f46802d1;
                    if (bArr12 != null && bArr12.length != 0) {
                        sj0Var2.b();
                        return;
                    } else {
                        Utilities.f22416e.c(new lc0(sj0Var2, sj0Var2.f51231b, sj0Var2.d, 14));
                        return;
                    }
                }
            case 13:
                kl0 kl0Var = (kl0) this.f52936c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f52937e;
                boolean z25 = this.f52935b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject6;
                    kl0Var.f48678b0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    kl0Var.G0(z25);
                    return;
                }
                return;
            case 14:
                xa1.h0((xa1) this.f52936c, (TLRPC.TL_error) this.d, (TLObject) this.f52937e, this.f52935b);
                return;
            case 15:
                p4.d0 d0Var = (p4.d0) this.f52936c;
                boolean z26 = this.f52935b;
                p4.v vVar = (p4.v) this.d;
                Runnable runnable = (Runnable) this.f52937e;
                p4.c1 c1Var = d0Var.f54623g;
                if (z26) {
                    p4.i1 i1Var = new p4.i1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.t u10 = c1Var.f54601b.u(vVar);
                        if (u10 != null) {
                            i11 = u10.b(p4.d0.B).f54708n;
                        } else if (!d0Var.h(vVar)) {
                            c8.r9.b(new p4.m1(-100));
                        } else {
                            c8.r9.b(new p4.m1(0));
                            i11 = 0;
                        }
                        p4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.j(i11, i1Var);
                        }
                    } catch (DeadObjectException unused) {
                        c1Var.f54601b.H(vVar);
                        c8.r9.b(new p4.m1(-100));
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        c8.r9.b(new p4.m1(-1));
                    }
                }
                runnable.run();
                c1Var.f54601b.l(vVar);
                return;
            case 16:
                sg.i0 i0Var = (sg.i0) this.f52936c;
                boolean z27 = this.f52935b;
                i0Var.f56651f.f(new sg.f0(i0Var, (a8.xa) this.d, 0));
                i0Var.f56651f.f(new sg.f0(i0Var, (a8.xa) this.f52937e, 0));
                i0Var.E = z27;
                return;
            case 17:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.f52936c;
                boolean z28 = this.f52935b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f52937e;
                if (z28) {
                    M0 = org.telegram.messenger.hd.M0(2131753481, "BoostingGiveawayCreated");
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131753592, "BoostingAwardsCreated");
                }
                if (z28) {
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
                org.telegram.ui.Components.xb I = ccVar.I(2131624217, M0, org.telegram.messenger.g0.S2(M02, org.telegram.ui.ActionBar.j6.xj, 0, new di.q2(chat4), e6Var));
                I.f41635j = 5000;
                I.j();
                return;
            default:
                zi.v0 v0Var = (zi.v0) this.f52936c;
                zi.y yVar = (zi.y) this.d;
                boolean z29 = this.f52935b;
                zi.r0 r0Var = (zi.r0) this.f52937e;
                long j10 = v0Var.f61760q;
                long nanoTime = System.nanoTime();
                try {
                    yVar.g();
                    long h = yVar.h();
                    v0Var.f61756m.b("active output finalized: size=" + yVar.f61791a.length() + ", durationMs=" + h + ", elapsedMs=" + zi.v0.f(nanoTime));
                    v0Var.g();
                    if (h > j10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z29 && !z11) {
                        v0Var.f61754k.execute(new zi.h0(v0Var, r0Var, yVar.f61791a, h, true));
                        return;
                    }
                    File file2 = yVar.f61791a;
                    try {
                        synchronized (yVar) {
                            i14 = yVar.f61807s;
                        }
                        min = Math.min(j10, h);
                        if (z11) {
                            i15 = 1;
                        } else {
                            i15 = 2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        v0Var.u(file2, i14, 0L, min, z29, i15);
                        c8.le.c(file2);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        c8.le.c(file2);
                        throw th;
                    }
                } catch (Exception e11) {
                    v0Var.f61752i.post(new zi.f0(v0Var, e11, 2));
                    return;
                }
        }
    }

    public wn(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f52934a = i7;
        this.f52936c = obj;
        this.d = obj2;
        this.f52935b = z10;
        this.f52937e = obj3;
    }

    public wn(Object obj, TLObject tLObject, Object obj2, boolean z10, int i7) {
        this.f52934a = i7;
        this.f52936c = obj;
        this.f52937e = tLObject;
        this.d = obj2;
        this.f52935b = z10;
    }

    public wn(Object obj, boolean z10, Object obj2, Object obj3, int i7) {
        this.f52934a = i7;
        this.f52936c = obj;
        this.f52935b = z10;
        this.d = obj2;
        this.f52937e = obj3;
    }

    public wn(org.telegram.ui.Components.pv0 pv0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f52934a = 6;
        this.f52936c = pv0Var;
        this.f52937e = tLObject;
        this.f52935b = z10;
        this.d = t1Var;
    }

    public wn(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f52934a = 3;
        this.f52935b = z10;
        this.f52936c = chat;
        this.d = alertDialog$Builder;
        this.f52937e = zArr;
    }
}
