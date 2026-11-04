package org.telegram.ui;

import android.util.Log;
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
public final class rn implements Runnable {
    public final int f49245a;
    public final boolean f49246b;
    public final Object f49247c;
    public final Object d;
    public final Object f49248e;

    public rn(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.f49245a = i3;
        this.f49247c = obj;
        this.d = obj2;
        this.f49248e = obj3;
        this.f49246b = z10;
    }

    @Override
    public final void run() {
        int i3;
        int i10;
        boolean z10;
        byte[] bArr;
        byte[] bArr2;
        ?? r12;
        boolean z11;
        int i11;
        int i12;
        String M0;
        int i13;
        String M02;
        int i14;
        String str = null;
        r9 = null;
        byte[] bArr3 = null;
        r9 = null;
        String str2 = null;
        switch (this.f49245a) {
            case 0:
                bo boVar = (bo) this.f49247c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f49248e;
                boolean z12 = this.f49246b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    boVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = boVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z12) {
                        if (boVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity());
                            alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131746035, null);
                            alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131746033, null);
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                            boVar.showDialog(alertDialog$Builder.f27343a);
                        } else {
                            return;
                        }
                    }
                }
                org.telegram.ui.Components.m70 m70Var = boVar.H;
                if (m70Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = boVar.m0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    m70Var.setLink(str);
                    boVar.H.c(boVar.m0, boVar.f44089a0);
                    return;
                }
                return;
            case 1:
                mo moVar = (mo) this.f49247c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = this.f49246b;
                chat.join_to_send = z13;
                org.telegram.messenger.hp messagesController = moVar.f47718y.d.getMessagesController();
                long j10 = chat.f27001id;
                ci.v6 v6Var = new ci.v6(moVar, z13, chat, 17);
                lo loVar = new lo(0, moVar, (org.telegram.ui.Components.a70) this.f49248e);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.h1(j10);
                tL_channels_toggleJoinToSend.enabled = z13;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.uh(messagesController, v6Var, loVar, 8), 64);
                return;
            case 2:
                mo moVar2 = (mo) this.f49247c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z14 = this.f49246b;
                chat2.join_request = z14;
                moVar2.f47718y.d.getMessagesController().c5(chat2.f27001id, 0L, z14, false, false, new ko(moVar2, 0), new sc(29, moVar2, (org.telegram.ui.Components.z60) this.f49248e));
                return;
            case 3:
                boolean z15 = this.f49246b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f49247c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f49248e;
                if (z15 && org.telegram.messenger.t3.T(chat3)) {
                    View d = alertDialog$Builder2.f27343a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (org.telegram.messenger.t3.V(chat3)) {
                                i3 = 2131752422;
                            } else {
                                i3 = 2131751531;
                            }
                            textView.setText(org.telegram.messenger.bd.M0(i3, null));
                            return;
                        } else if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.bd.M0(2131749003, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.bd.M0(2131748999, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.bd.M0(2131749012, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.tj tjVar = (org.telegram.ui.Components.tj) this.f49247c;
                boolean z16 = this.f49246b;
                ArrayList arrayList = (ArrayList) this.f49248e;
                tjVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new lo(25, tjVar, new ArrayList()));
                    return;
                }
                String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    str2 = S0;
                }
                if (str2 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i15 = i10 + 1;
                String[] strArr = new String[i15];
                strArr[0] = lowerCase;
                if (str2 != null) {
                    strArr[1] = str2;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!z16) {
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.oj ojVar = (org.telegram.ui.Components.oj) arrayList.get(i16);
                        File file = ojVar.f36843f;
                        if (file != null && !file.isDirectory()) {
                            int i17 = 0;
                            while (true) {
                                if (i17 < i15) {
                                    String str3 = strArr[i17];
                                    String str4 = ojVar.f36840b;
                                    if (str4 != null) {
                                        z10 = str4.toLowerCase().contains(str3);
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList2.add(ojVar);
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new lo(25, tjVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) this.f49247c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z17 = this.f49246b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f49248e;
                org.telegram.ui.ActionBar.d2 d2Var = x60Var.f40248l1;
                if (d2Var != null && d2Var.getParentActivity() != null) {
                    if (tL_error2 != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                            x60Var.setOnDismissListener(new org.telegram.ui.Components.s60(1, x60Var, z17));
                        } else {
                            org.telegram.ui.Components.t4.e0(x60Var.f28583a, tL_error2, d2Var, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    x60Var.dismiss();
                    return;
                }
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.f49248e;
                boolean z18 = this.f49246b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
                org.telegram.ui.Components.xv0 xv0Var = ((org.telegram.ui.Components.mv0) this.f49247c).f36258a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).I1(tL_messages_stickerSet, true);
                    if (z18) {
                        org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).f2(null, tLObject2, 0, null, false, false);
                    } else {
                        xv0Var.K1 = tL_messages_stickerSet;
                        xv0Var.R0();
                        xv0Var.Z0();
                    }
                }
                s1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f49247c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z19 = this.f49246b;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) this.f49248e;
                if (t2Var != null && !t2Var.J) {
                    t2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z19) {
                        org.telegram.messenger.g0.h3(new og(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                } else if (s1Var2 != null && s1Var2.isShowing()) {
                    s1Var2.l(true);
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
                x30 x30Var = (x30) this.f49247c;
                TLObject tLObject3 = (TLObject) this.f49248e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z20 = this.f49246b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        x30Var.w1(null, tL_chatInviteExported3.link, true, z20);
                        return;
                    }
                }
                return;
            case 9:
                a50 a50Var = (a50) this.f49247c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.f49248e;
                boolean z21 = this.f49246b;
                if (tL_error3 == null) {
                    a50Var.f43606f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z21) {
                        if (a50Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(a50Var.getParentActivity());
                            alertDialog$Builder3.f27343a.U = org.telegram.messenger.bd.M0(2131746035, null);
                            alertDialog$Builder3.f27343a.S = org.telegram.messenger.bd.M0(2131746033, null);
                            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                            a50Var.showDialog(alertDialog$Builder3.f27343a);
                        } else {
                            return;
                        }
                    }
                }
                a50Var.f43605e = false;
                a50Var.f43602a.f();
                return;
            case 10:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f49248e;
                boolean z22 = this.f49246b;
                yj0 yj0Var = ((mj0) this.f49247c).f47688e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    yj0Var.K = password;
                    TwoStepVerificationActivity.r0(password);
                    yj0Var.F1(z22);
                    return;
                }
                return;
            case 11:
                mj0 mj0Var = (mj0) this.f49247c;
                String str5 = (String) this.d;
                boolean z23 = this.f49246b;
                yj0 yj0Var2 = mj0Var.f47688e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.f49248e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    yj0Var2.f52294d1 = tL_secureSecretSettings.secure_secret;
                    yj0Var2.f52292c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        yj0Var2.f52300f1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        yj0Var2.f52300f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        org.telegram.messenger.g0.h3(new rn(mj0Var, passwordsettings, z23, bArr2, 12));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        org.telegram.messenger.g0.h3(new sg0(mj0Var, 6));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = yj0Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        yj0Var2.f52300f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    yj0Var2.f52294d1 = null;
                    yj0Var2.f52292c1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.h3(new rn(mj0Var, passwordsettings, z23, bArr2, 12));
                return;
            case 12:
                mj0 mj0Var2 = (mj0) this.f49247c;
                boolean z24 = this.f49246b;
                byte[] bArr6 = (byte[]) this.f49248e;
                yj0 yj0Var3 = mj0Var2.f47688e;
                yj0Var3.f52297e1 = ((TL_account.passwordSettings) this.d).email;
                if (z24) {
                    yj0Var3.f52300f1 = yj0Var3.Q0;
                }
                byte[] bArr7 = yj0Var3.f52294d1;
                byte[] bArr8 = yj0Var3.f52300f1;
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
                if (yj0.d1(bArr3, Long.valueOf(yj0Var3.f52292c1)) && bArr6.length != 0 && yj0Var3.f52292c1 != 0) {
                    if (yj0Var3.f52290c == 0) {
                        ConnectionsManager.getInstance(yj0.x0(yj0Var3)).sendRequest(new TL_account.getAllSecureValues(), new kj0(mj0Var2, 0));
                        return;
                    }
                    mj0Var2.a();
                    return;
                } else if (z24) {
                    org.telegram.messenger.h10.i(yj0.w0(yj0Var3)).u();
                    yj0Var3.O0 = 0;
                    yj0Var3.W1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = yj0Var3.E;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        yj0Var3.E.errors.clear();
                    }
                    byte[] bArr12 = yj0Var3.f52294d1;
                    if (bArr12 != null && bArr12.length != 0) {
                        mj0Var2.b();
                        return;
                    } else {
                        Utilities.f21387e.c(new hc0(mj0Var2, mj0Var2.f47686b, mj0Var2.d, 15));
                        return;
                    }
                }
            case 13:
                dl0 dl0Var = (dl0) this.f49247c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f49248e;
                boolean z25 = this.f49246b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject6;
                    dl0Var.f44740b0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    dl0Var.G0(z25);
                    return;
                }
                return;
            case 14:
                ra1.h0((ra1) this.f49247c, (TLRPC.TL_error) this.d, (TLObject) this.f49248e, this.f49246b);
                return;
            case 15:
                tg.i0 i0Var = (tg.i0) this.f49247c;
                boolean z26 = this.f49246b;
                i0Var.f55193f.f(new tg.g0(i0Var, (b8.kg) this.d, 0));
                i0Var.f55193f.f(new tg.g0(i0Var, (b8.kg) this.f49248e, 0));
                i0Var.E = z26;
                return;
            case 16:
                wi.t0 t0Var = (wi.t0) this.f49247c;
                wi.w wVar = (wi.w) this.d;
                boolean z27 = this.f49246b;
                wi.p0 p0Var = (wi.p0) this.f49248e;
                long j11 = t0Var.f58068q;
                long nanoTime = System.nanoTime();
                try {
                    wVar.g();
                    long h = wVar.h();
                    r12 = t0Var.f58064m;
                    r12.b("active output finalized: size=" + wVar.f58099a.length() + ", durationMs=" + h + ", elapsedMs=" + wi.t0.f(nanoTime));
                    t0Var.g();
                    if (h > j11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    try {
                        if (z27 && !z11) {
                            File file2 = wVar.f58099a;
                            ?? r02 = t0Var.f58062k;
                            ?? f0Var = new wi.f0(t0Var, p0Var, file2, h, true);
                            r02.execute(f0Var);
                            t0Var = f0Var;
                        } else {
                            File file3 = wVar.f58099a;
                            try {
                                synchronized (wVar) {
                                    try {
                                        i11 = wVar.f58115s;
                                    } finally {
                                        th = th;
                                        File file4 = file3;
                                        while (true) {
                                            try {
                                                try {
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    x7.u5.c(file4);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                }
                                long min = Math.min(j11, h);
                                if (z11) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                t0Var.t(file3, i11, 0L, min, z27, i12);
                                x7.u5.c(file3);
                                t0Var = t0Var;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        r12.f58060i.post(new wi.d0(r12, e, 2));
                        return;
                    }
                } catch (Exception e11) {
                    e = e11;
                    r12 = t0Var;
                }
            case 17:
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) this.f49247c;
                boolean z28 = this.f49246b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f49248e;
                if (z28) {
                    M0 = org.telegram.messenger.bd.M0(2131753481, "BoostingGiveawayCreated");
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131753592, "BoostingAwardsCreated");
                }
                if (z28) {
                    if (org.telegram.messenger.t3.V(chat4)) {
                        i14 = 2131753555;
                    } else {
                        i14 = 2131753554;
                    }
                    M02 = org.telegram.messenger.bd.M0(i14, null);
                } else {
                    if (org.telegram.messenger.t3.V(chat4)) {
                        i13 = 2131753557;
                    } else {
                        i13 = 2131753556;
                    }
                    M02 = org.telegram.messenger.bd.M0(i13, null);
                }
                org.telegram.ui.Components.ac I = fcVar.I(2131624216, M0, org.telegram.messenger.g0.S2(M02, org.telegram.ui.ActionBar.k6.uj, 0, new ci.w2(chat4), e6Var));
                I.f31792j = 5000;
                I.j();
                return;
            default:
                z9.x xVar = (z9.x) this.f49247c;
                ca.q2 q2Var = (ca.q2) this.d;
                ba.c cVar = (ba.c) this.f49248e;
                boolean z29 = this.f49246b;
                xVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                xVar.f60258b.e(q2Var, cVar.f3174a, z29);
                return;
        }
    }

    public rn(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.f49245a = i3;
        this.f49247c = obj;
        this.d = obj2;
        this.f49246b = z10;
        this.f49248e = obj3;
    }

    public rn(Object obj, TLObject tLObject, Object obj2, boolean z10, int i3) {
        this.f49245a = i3;
        this.f49247c = obj;
        this.f49248e = tLObject;
        this.d = obj2;
        this.f49246b = z10;
    }

    public rn(org.telegram.ui.Components.fc fcVar, boolean z10, TLRPC.Chat chat, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f49245a = 17;
        this.f49247c = fcVar;
        this.f49246b = z10;
        this.d = chat;
        this.f49248e = e6Var;
    }

    public rn(org.telegram.ui.Components.mv0 mv0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.s1 s1Var) {
        this.f49245a = 6;
        this.f49247c = mv0Var;
        this.f49248e = tLObject;
        this.f49246b = z10;
        this.d = s1Var;
    }

    public rn(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f49245a = 3;
        this.f49246b = z10;
        this.f49247c = chat;
        this.d = alertDialog$Builder;
        this.f49248e = zArr;
    }
}
