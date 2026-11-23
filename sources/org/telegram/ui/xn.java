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
    public final int f53998a;
    public final boolean f53999b;
    public final Object f54000c;
    public final Object d;
    public final Object f54001e;

    public xn(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f53998a = i7;
        this.f54000c = obj;
        this.d = obj2;
        this.f54001e = obj3;
        this.f53999b = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        boolean z10;
        byte[] bArr;
        byte[] bArr2;
        int i11;
        String N0;
        int i12;
        String N02;
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
        switch (this.f53998a) {
            case 0:
                io ioVar = (io) this.f54000c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f54001e;
                boolean z12 = this.f53999b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    ioVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = ioVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z12) {
                        if (ioVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ioVar.getParentActivity());
                            alertDialog$Builder.f28835a.U = org.telegram.messenger.gd.N0(2131745829, null);
                            alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131745827, null);
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747637, null), null);
                            ioVar.showDialog(alertDialog$Builder.f28835a);
                        } else {
                            return;
                        }
                    }
                }
                org.telegram.ui.Components.d80 d80Var = ioVar.H;
                if (d80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ioVar.m0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    d80Var.setLink(str);
                    ioVar.H.c(ioVar.m0, ioVar.f48862a0);
                    return;
                }
                return;
            case 1:
                qo qoVar = (qo) this.f54000c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = this.f53999b;
                chat.join_to_send = z13;
                org.telegram.messenger.mp messagesController = qoVar.f51498y.d.getMessagesController();
                long j3 = chat.f28492id;
                di.p6 p6Var = new di.p6(qoVar, z13, chat, 17);
                ah ahVar = new ah(14, qoVar, (org.telegram.ui.Components.r70) this.f54001e);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.j1(j3);
                tL_channels_toggleJoinToSend.enabled = z13;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.ci(messagesController, p6Var, ahVar, 8), 64);
                return;
            case 2:
                qo qoVar2 = (qo) this.f54000c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z14 = this.f53999b;
                chat2.join_request = z14;
                qoVar2.f51498y.d.getMessagesController().o5(chat2.f28492id, 0L, z14, false, false, new po(qoVar2, 0), new ah(13, qoVar2, (org.telegram.ui.Components.q70) this.f54001e));
                return;
            case 3:
                boolean z15 = this.f53999b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f54000c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f54001e;
                if (z15 && org.telegram.messenger.v3.T(chat3)) {
                    View d = alertDialog$Builder2.f28835a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (org.telegram.messenger.v3.V(chat3)) {
                                i7 = 2131752410;
                            } else {
                                i7 = 2131751518;
                            }
                            textView.setText(org.telegram.messenger.gd.N0(i7, null));
                            return;
                        } else if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.gd.N0(2131748802, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.gd.N0(2131748798, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.gd.N0(2131748811, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.f54000c;
                boolean z16 = this.f53999b;
                ArrayList arrayList = (ArrayList) this.f54001e;
                jkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xd(14, jkVar, new ArrayList()));
                    return;
                }
                String T0 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
                if (!lowerCase.equals(T0) && T0.length() != 0) {
                    str2 = T0;
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
                        org.telegram.ui.Components.ek ekVar = (org.telegram.ui.Components.ek) arrayList.get(i17);
                        File file = ekVar.f34735f;
                        if (file != null && !file.isDirectory()) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < i16) {
                                    String str3 = strArr[i18];
                                    String str4 = ekVar.f34732b;
                                    if (str4 != null) {
                                        z10 = str4.toLowerCase().contains(str3);
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList2.add(ekVar);
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xd(14, jkVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) this.f54000c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z17 = this.f53999b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f54001e;
                org.telegram.ui.ActionBar.g2 g2Var = o70Var.f38053o1;
                if (g2Var != null && g2Var.getParentActivity() != null) {
                    if (tL_error2 != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                            o70Var.setOnDismissListener(new org.telegram.ui.Components.k70(1, o70Var, z17));
                        } else {
                            org.telegram.ui.Components.b5.c0(o70Var.f30223a, tL_error2, g2Var, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    o70Var.dismiss();
                    return;
                }
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.f54001e;
                boolean z18 = this.f53999b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                org.telegram.ui.Components.jw0 jw0Var = ((org.telegram.ui.Components.yv0) this.f54000c).f42567a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).N1(tL_messages_stickerSet, true);
                    if (z18) {
                        org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).k2(null, tLObject2, 0, null, false, false);
                    } else {
                        jw0Var.N1 = tL_messages_stickerSet;
                        jw0Var.S0();
                        jw0Var.a1();
                    }
                }
                t1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f54000c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z19 = this.f53999b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.f54001e;
                if (w2Var != null && !w2Var.J) {
                    w2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z19) {
                        org.telegram.messenger.g0.g3(new qg(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                } else if (t1Var2 != null && t1Var2.isShowing()) {
                    t1Var2.l(true);
                    editTextBoldCursor.requestFocus();
                    if (z19) {
                        org.telegram.messenger.g0.g3(new qg(editTextBoldCursor, 4));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                e40 e40Var = (e40) this.f54000c;
                TLObject tLObject3 = (TLObject) this.f54001e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z20 = this.f53999b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        e40Var.A1(null, tL_chatInviteExported3.link, true, z20);
                        return;
                    }
                }
                return;
            case 9:
                g50 g50Var = (g50) this.f54000c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.f54001e;
                boolean z21 = this.f53999b;
                if (tL_error3 == null) {
                    g50Var.f48107f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z21) {
                        if (g50Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g50Var.getParentActivity());
                            alertDialog$Builder3.f28835a.U = org.telegram.messenger.gd.N0(2131745829, null);
                            alertDialog$Builder3.f28835a.S = org.telegram.messenger.gd.N0(2131745827, null);
                            alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131747637, null), null);
                            g50Var.showDialog(alertDialog$Builder3.f28835a);
                        } else {
                            return;
                        }
                    }
                }
                g50Var.f48106e = false;
                g50Var.f48103a.f();
                return;
            case 10:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f54001e;
                boolean z22 = this.f53999b;
                fk0 fk0Var = ((tj0) this.f54000c).f52419e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    fk0Var.K = password;
                    TwoStepVerificationActivity.r0(password);
                    fk0Var.F1(z22);
                    return;
                }
                return;
            case 11:
                tj0 tj0Var = (tj0) this.f54000c;
                String str5 = (String) this.d;
                boolean z23 = this.f53999b;
                fk0 fk0Var2 = tj0Var.f52419e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.f54001e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    fk0Var2.f47861d1 = tL_secureSecretSettings.secure_secret;
                    fk0Var2.f47859c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        fk0Var2.f47867f1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        fk0Var2.f47867f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        org.telegram.messenger.g0.g3(new xn(tj0Var, passwordsettings, z23, bArr2, 12));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        org.telegram.messenger.g0.g3(new gf0(tj0Var, 7));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = fk0Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        fk0Var2.f47867f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    fk0Var2.f47861d1 = null;
                    fk0Var2.f47859c1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.g3(new xn(tj0Var, passwordsettings, z23, bArr2, 12));
                return;
            case 12:
                tj0 tj0Var2 = (tj0) this.f54000c;
                boolean z24 = this.f53999b;
                byte[] bArr6 = (byte[]) this.f54001e;
                fk0 fk0Var3 = tj0Var2.f52419e;
                fk0Var3.f47864e1 = ((TL_account.passwordSettings) this.d).email;
                if (z24) {
                    fk0Var3.f47867f1 = fk0Var3.Q0;
                }
                byte[] bArr7 = fk0Var3.f47861d1;
                byte[] bArr8 = fk0Var3.f47867f1;
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
                if (fk0.d1(bArr3, Long.valueOf(fk0Var3.f47859c1)) && bArr6.length != 0 && fk0Var3.f47859c1 != 0) {
                    if (fk0Var3.f47857c == 0) {
                        ConnectionsManager.getInstance(fk0.x0(fk0Var3)).sendRequest(new TL_account.getAllSecureValues(), new rj0(tj0Var2, 0));
                        return;
                    }
                    tj0Var2.a();
                    return;
                } else if (z24) {
                    org.telegram.messenger.i10.i(fk0.w0(fk0Var3)).u();
                    fk0Var3.O0 = 0;
                    fk0Var3.W1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = fk0Var3.E;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        fk0Var3.E.errors.clear();
                    }
                    byte[] bArr12 = fk0Var3.f47861d1;
                    if (bArr12 != null && bArr12.length != 0) {
                        tj0Var2.b();
                        return;
                    } else {
                        Utilities.f22877e.c(new lc0(tj0Var2, tj0Var2.f52417b, tj0Var2.d, 14));
                        return;
                    }
                }
            case 13:
                kl0 kl0Var = (kl0) this.f54000c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f54001e;
                boolean z25 = this.f53999b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject6;
                    kl0Var.f49457b0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    kl0Var.G0(z25);
                    return;
                }
                return;
            case 14:
                za1.h0((za1) this.f54000c, (TLRPC.TL_error) this.d, (TLObject) this.f54001e, this.f53999b);
                return;
            case 15:
                p4.d0 d0Var = (p4.d0) this.f54000c;
                boolean z26 = this.f53999b;
                p4.v vVar = (p4.v) this.d;
                Runnable runnable = (Runnable) this.f54001e;
                p4.d1 d1Var = d0Var.f55312g;
                if (z26) {
                    p4.j1 j1Var = new p4.j1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.t y10 = d1Var.f55331b.y(vVar);
                        if (y10 != null) {
                            i11 = y10.b(p4.d0.B).f55415n;
                        } else if (!d0Var.h(vVar)) {
                            c8.u9.b(new p4.n1(-100));
                        } else {
                            c8.u9.b(new p4.n1(0));
                            i11 = 0;
                        }
                        p4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.j(i11, j1Var);
                        }
                    } catch (DeadObjectException unused) {
                        d1Var.f55331b.K(vVar);
                        c8.u9.b(new p4.n1(-100));
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        c8.u9.b(new p4.n1(-1));
                    }
                }
                runnable.run();
                d1Var.f55331b.m(vVar);
                return;
            case 16:
                sg.h0 h0Var = (sg.h0) this.f54000c;
                boolean z27 = this.f53999b;
                h0Var.f57343f.f(new sg.f0(h0Var, (a8.xa) this.d, 0));
                h0Var.f57343f.f(new sg.f0(h0Var, (a8.xa) this.f54001e, 0));
                h0Var.E = z27;
                return;
            case 17:
                org.telegram.ui.Components.kc kcVar = (org.telegram.ui.Components.kc) this.f54000c;
                boolean z28 = this.f53999b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f54001e;
                if (z28) {
                    N0 = org.telegram.messenger.gd.N0(2131753478, "BoostingGiveawayCreated");
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131753589, "BoostingAwardsCreated");
                }
                if (z28) {
                    if (org.telegram.messenger.v3.V(chat4)) {
                        i13 = 2131753552;
                    } else {
                        i13 = 2131753551;
                    }
                    N02 = org.telegram.messenger.gd.N0(i13, null);
                } else {
                    if (org.telegram.messenger.v3.V(chat4)) {
                        i12 = 2131753554;
                    } else {
                        i12 = 2131753553;
                    }
                    N02 = org.telegram.messenger.gd.N0(i12, null);
                }
                org.telegram.ui.Components.fc I = kcVar.I(2131624217, N0, org.telegram.messenger.g0.R2(N02, org.telegram.ui.ActionBar.n6.xj, 0, new di.u2(chat4), i6Var));
                I.f35091j = 5000;
                I.j();
                return;
            default:
                zi.u0 u0Var = (zi.u0) this.f54000c;
                zi.x xVar = (zi.x) this.d;
                boolean z29 = this.f53999b;
                zi.q0 q0Var = (zi.q0) this.f54001e;
                long j10 = u0Var.f62455q;
                long nanoTime = System.nanoTime();
                try {
                    xVar.g();
                    long h = xVar.h();
                    u0Var.f62451m.b("active output finalized: size=" + xVar.f62486a.length() + ", durationMs=" + h + ", elapsedMs=" + zi.u0.f(nanoTime));
                    u0Var.g();
                    if (h > j10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z29 && !z11) {
                        u0Var.f62449k.execute(new zi.g0(u0Var, q0Var, xVar.f62486a, h, true));
                        return;
                    }
                    File file2 = xVar.f62486a;
                    try {
                        synchronized (xVar) {
                            i14 = xVar.f62502s;
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
                        u0Var.u(file2, i14, 0L, min, z29, i15);
                        c8.pe.c(file2);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        c8.pe.c(file2);
                        throw th;
                    }
                } catch (Exception e11) {
                    u0Var.f62447i.post(new zi.e0(u0Var, e11, 2));
                    return;
                }
        }
    }

    public xn(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f53998a = i7;
        this.f54000c = obj;
        this.d = obj2;
        this.f53999b = z10;
        this.f54001e = obj3;
    }

    public xn(Object obj, TLObject tLObject, Object obj2, boolean z10, int i7) {
        this.f53998a = i7;
        this.f54000c = obj;
        this.f54001e = tLObject;
        this.d = obj2;
        this.f53999b = z10;
    }

    public xn(Object obj, boolean z10, Object obj2, Object obj3, int i7) {
        this.f53998a = i7;
        this.f54000c = obj;
        this.f53999b = z10;
        this.d = obj2;
        this.f54001e = obj3;
    }

    public xn(org.telegram.ui.Components.yv0 yv0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f53998a = 6;
        this.f54000c = yv0Var;
        this.f54001e = tLObject;
        this.f53999b = z10;
        this.d = t1Var;
    }

    public xn(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f53998a = 3;
        this.f53999b = z10;
        this.f54000c = chat;
        this.d = alertDialog$Builder;
        this.f54001e = zArr;
    }
}
