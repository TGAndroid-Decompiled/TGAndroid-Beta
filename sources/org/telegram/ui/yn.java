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
public final class yn implements Runnable {
    public final int f54231a;
    public final boolean f54232b;
    public final Object f54233c;
    public final Object d;
    public final Object f54234e;

    public yn(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f54231a = i7;
        this.f54233c = obj;
        this.d = obj2;
        this.f54234e = obj3;
        this.f54232b = z10;
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
        switch (this.f54231a) {
            case 0:
                jo joVar = (jo) this.f54233c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f54234e;
                boolean z12 = this.f54232b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    joVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = joVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z12) {
                        if (joVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(joVar.getParentActivity());
                            alertDialog$Builder.f28746a.U = org.telegram.messenger.gd.M0(2131745830, null);
                            alertDialog$Builder.f28746a.S = org.telegram.messenger.gd.M0(2131745828, null);
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131747638, null), null);
                            joVar.showDialog(alertDialog$Builder.f28746a);
                        } else {
                            return;
                        }
                    }
                }
                org.telegram.ui.Components.e80 e80Var = joVar.H;
                if (e80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = joVar.m0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    e80Var.setLink(str);
                    joVar.H.c(joVar.m0, joVar.f49019a0);
                    return;
                }
                return;
            case 1:
                ro roVar = (ro) this.f54233c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z13 = this.f54232b;
                chat.join_to_send = z13;
                org.telegram.messenger.mp messagesController = roVar.f51719y.d.getMessagesController();
                long j3 = chat.f28405id;
                di.p6 p6Var = new di.p6(roVar, z13, chat, 17);
                ci ciVar = new ci(10, roVar, (org.telegram.ui.Components.s70) this.f54234e);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.j1(j3);
                tL_channels_toggleJoinToSend.enabled = z13;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.ci(messagesController, p6Var, ciVar, 8), 64);
                return;
            case 2:
                ro roVar2 = (ro) this.f54233c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z14 = this.f54232b;
                chat2.join_request = z14;
                roVar2.f51719y.d.getMessagesController().o5(chat2.f28405id, 0L, z14, false, false, new qo(roVar2, 0), new ci(9, roVar2, (org.telegram.ui.Components.r70) this.f54234e));
                return;
            case 3:
                boolean z15 = this.f54232b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f54233c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.f54234e;
                if (z15 && org.telegram.messenger.v3.T(chat3)) {
                    View d = alertDialog$Builder2.f28746a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            if (org.telegram.messenger.v3.V(chat3)) {
                                i7 = 2131752411;
                            } else {
                                i7 = 2131751519;
                            }
                            textView.setText(org.telegram.messenger.gd.M0(i7, null));
                            return;
                        } else if (chat3.monoforum) {
                            textView.setText(org.telegram.messenger.gd.M0(2131748803, null));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(org.telegram.messenger.gd.M0(2131748799, null));
                            return;
                        } else {
                            textView.setText(org.telegram.messenger.gd.M0(2131748812, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.f54233c;
                boolean z16 = this.f54232b;
                ArrayList arrayList = (ArrayList) this.f54234e;
                jkVar.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.mg(10, jkVar, new ArrayList()));
                    return;
                }
                String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
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
                        org.telegram.ui.Components.dk dkVar = (org.telegram.ui.Components.dk) arrayList.get(i17);
                        File file = dkVar.f34456f;
                        if (file != null && !file.isDirectory()) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < i16) {
                                    String str3 = strArr[i18];
                                    String str4 = dkVar.f34453b;
                                    if (str4 != null) {
                                        z10 = str4.toLowerCase().contains(str3);
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList2.add(dkVar);
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.mg(10, jkVar, arrayList2));
                return;
            case 5:
                org.telegram.ui.Components.p70 p70Var = (org.telegram.ui.Components.p70) this.f54233c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                boolean z17 = this.f54232b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f54234e;
                org.telegram.ui.ActionBar.h2 h2Var = p70Var.f38305o1;
                if (h2Var != null && h2Var.getParentActivity() != null) {
                    if (tL_error2 != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error2.text)) {
                            p70Var.setOnDismissListener(new org.telegram.ui.Components.l70(1, p70Var, z17));
                        } else {
                            org.telegram.ui.Components.b5.c0(p70Var.f30189a, tL_error2, h2Var, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    p70Var.dismiss();
                    return;
                }
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.f54234e;
                boolean z18 = this.f54232b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                org.telegram.ui.Components.iw0 iw0Var = ((org.telegram.ui.Components.xv0) this.f54233c).f42197a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).N1(tL_messages_stickerSet, true);
                    if (z18) {
                        org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).k2(null, tLObject2, 0, null, false, false);
                    } else {
                        iw0Var.N1 = tL_messages_stickerSet;
                        iw0Var.S0();
                        iw0Var.a1();
                    }
                }
                u1Var.dismiss();
                return;
            case 7:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f54233c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z19 = this.f54232b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.f54234e;
                if (x2Var != null && !x2Var.J) {
                    x2Var.A0(true);
                    editTextBoldCursor.requestFocus();
                    if (z19) {
                        org.telegram.messenger.g0.g3(new qg(editTextBoldCursor, 3));
                        return;
                    }
                    return;
                } else if (u1Var2 != null && u1Var2.isShowing()) {
                    u1Var2.l(true);
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
                f40 f40Var = (f40) this.f54233c;
                TLObject tLObject3 = (TLObject) this.f54234e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z20 = this.f54232b;
                if (tLObject3 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject3;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        f40Var.A1(null, tL_chatInviteExported3.link, true, z20);
                        return;
                    }
                }
                return;
            case 9:
                h50 h50Var = (h50) this.f54233c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.f54234e;
                boolean z21 = this.f54232b;
                if (tL_error3 == null) {
                    h50Var.f48231f = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (z21) {
                        if (h50Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h50Var.getParentActivity());
                            alertDialog$Builder3.f28746a.U = org.telegram.messenger.gd.M0(2131745830, null);
                            alertDialog$Builder3.f28746a.S = org.telegram.messenger.gd.M0(2131745828, null);
                            alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131747638, null), null);
                            h50Var.showDialog(alertDialog$Builder3.f28746a);
                        } else {
                            return;
                        }
                    }
                }
                h50Var.f48230e = false;
                h50Var.f48227a.f();
                return;
            case 10:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.f54234e;
                boolean z22 = this.f54232b;
                hk0 hk0Var = ((vj0) this.f54233c).f52805e;
                if (tL_error4 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    hk0Var.K = password;
                    TwoStepVerificationActivity.r0(password);
                    hk0Var.F1(z22);
                    return;
                }
                return;
            case 11:
                vj0 vj0Var = (vj0) this.f54233c;
                String str5 = (String) this.d;
                boolean z23 = this.f54232b;
                hk0 hk0Var2 = vj0Var.f52805e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) ((TLObject) this.f54234e);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    hk0Var2.f48423d1 = tL_secureSecretSettings.secure_secret;
                    hk0Var2.f48421c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        hk0Var2.f48429f1 = Utilities.s(bArr, org.telegram.messenger.g0.h1(str5), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        hk0Var2.f48429f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        org.telegram.messenger.g0.g3(new yn(vj0Var, passwordsettings, z23, bArr2, 12));
                        return;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        org.telegram.messenger.g0.g3(new hf0(vj0Var, 7));
                        return;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = hk0Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        hk0Var2.f48429f1 = Utilities.m(org.telegram.messenger.g0.h1(str5), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    hk0Var2.f48423d1 = null;
                    hk0Var2.f48421c1 = 0L;
                }
                bArr2 = bArr;
                org.telegram.messenger.g0.g3(new yn(vj0Var, passwordsettings, z23, bArr2, 12));
                return;
            case 12:
                vj0 vj0Var2 = (vj0) this.f54233c;
                boolean z24 = this.f54232b;
                byte[] bArr6 = (byte[]) this.f54234e;
                hk0 hk0Var3 = vj0Var2.f52805e;
                hk0Var3.f48426e1 = ((TL_account.passwordSettings) this.d).email;
                if (z24) {
                    hk0Var3.f48429f1 = hk0Var3.Q0;
                }
                byte[] bArr7 = hk0Var3.f48423d1;
                byte[] bArr8 = hk0Var3.f48429f1;
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
                if (hk0.d1(bArr3, Long.valueOf(hk0Var3.f48421c1)) && bArr6.length != 0 && hk0Var3.f48421c1 != 0) {
                    if (hk0Var3.f48419c == 0) {
                        ConnectionsManager.getInstance(hk0.x0(hk0Var3)).sendRequest(new TL_account.getAllSecureValues(), new tj0(vj0Var2, 0));
                        return;
                    }
                    vj0Var2.a();
                    return;
                } else if (z24) {
                    org.telegram.messenger.j10.i(hk0.w0(hk0Var3)).u();
                    hk0Var3.O0 = 0;
                    hk0Var3.W1();
                    return;
                } else {
                    TL_account.authorizationForm authorizationform = hk0Var3.E;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        hk0Var3.E.errors.clear();
                    }
                    byte[] bArr12 = hk0Var3.f48423d1;
                    if (bArr12 != null && bArr12.length != 0) {
                        vj0Var2.b();
                        return;
                    } else {
                        Utilities.f22782e.c(new lc0(vj0Var2, vj0Var2.f52803b, vj0Var2.d, 14));
                        return;
                    }
                }
            case 13:
                ml0 ml0Var = (ml0) this.f54233c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.f54234e;
                boolean z25 = this.f54232b;
                if (tL_error5 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject6;
                    ml0Var.f49883b0 = password2;
                    TwoStepVerificationActivity.r0(password2);
                    ml0Var.G0(z25);
                    return;
                }
                return;
            case 14:
                bb1.h0((bb1) this.f54233c, (TLRPC.TL_error) this.d, (TLObject) this.f54234e, this.f54232b);
                return;
            case 15:
                p4.d0 d0Var = (p4.d0) this.f54233c;
                boolean z26 = this.f54232b;
                p4.v vVar = (p4.v) this.d;
                Runnable runnable = (Runnable) this.f54234e;
                p4.e1 e1Var = d0Var.f55183g;
                if (z26) {
                    p4.k1 k1Var = new p4.k1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.t v = e1Var.f55210b.v(vVar);
                        if (v != null) {
                            i11 = v.b(p4.d0.B).f55313n;
                        } else if (!d0Var.h(vVar)) {
                            c8.t9.b(new p4.o1(-100));
                        } else {
                            c8.t9.b(new p4.o1(0));
                            i11 = 0;
                        }
                        p4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.j(i11, k1Var);
                        }
                    } catch (DeadObjectException unused) {
                        e1Var.f55210b.K(vVar);
                        c8.t9.b(new p4.o1(-100));
                    } catch (RemoteException e10) {
                        h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        c8.t9.b(new p4.o1(-1));
                    }
                }
                runnable.run();
                e1Var.f55210b.l(vVar);
                return;
            case 16:
                sg.i0 i0Var = (sg.i0) this.f54233c;
                boolean z27 = this.f54232b;
                i0Var.f57225f.f(new sg.f0(i0Var, (a8.xa) this.d, 0));
                i0Var.f57225f.f(new sg.f0(i0Var, (a8.xa) this.f54234e, 0));
                i0Var.E = z27;
                return;
            case 17:
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) this.f54233c;
                boolean z28 = this.f54232b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f54234e;
                if (z28) {
                    M0 = org.telegram.messenger.gd.M0(2131753479, "BoostingGiveawayCreated");
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131753590, "BoostingAwardsCreated");
                }
                if (z28) {
                    if (org.telegram.messenger.v3.V(chat4)) {
                        i13 = 2131753553;
                    } else {
                        i13 = 2131753552;
                    }
                    M02 = org.telegram.messenger.gd.M0(i13, null);
                } else {
                    if (org.telegram.messenger.v3.V(chat4)) {
                        i12 = 2131753555;
                    } else {
                        i12 = 2131753554;
                    }
                    M02 = org.telegram.messenger.gd.M0(i12, null);
                }
                org.telegram.ui.Components.gc I = lcVar.I(2131624217, M0, org.telegram.messenger.g0.R2(M02, org.telegram.ui.ActionBar.n6.xj, 0, new di.t2(chat4), i6Var));
                I.f35461j = 5000;
                I.j();
                return;
            default:
                zi.u0 u0Var = (zi.u0) this.f54233c;
                zi.x xVar = (zi.x) this.d;
                boolean z29 = this.f54232b;
                zi.q0 q0Var = (zi.q0) this.f54234e;
                long j10 = u0Var.f62324q;
                long nanoTime = System.nanoTime();
                try {
                    xVar.g();
                    long h = xVar.h();
                    u0Var.f62320m.b("active output finalized: size=" + xVar.f62355a.length() + ", durationMs=" + h + ", elapsedMs=" + zi.u0.f(nanoTime));
                    u0Var.g();
                    if (h > j10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z29 && !z11) {
                        u0Var.f62318k.execute(new zi.g0(u0Var, q0Var, xVar.f62355a, h, true));
                        return;
                    }
                    File file2 = xVar.f62355a;
                    try {
                        synchronized (xVar) {
                            i14 = xVar.f62371s;
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
                        c8.oe.c(file2);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        c8.oe.c(file2);
                        throw th;
                    }
                } catch (Exception e11) {
                    u0Var.f62316i.post(new zi.e0(u0Var, e11, 2));
                    return;
                }
        }
    }

    public yn(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f54231a = i7;
        this.f54233c = obj;
        this.d = obj2;
        this.f54232b = z10;
        this.f54234e = obj3;
    }

    public yn(Object obj, TLObject tLObject, Object obj2, boolean z10, int i7) {
        this.f54231a = i7;
        this.f54233c = obj;
        this.f54234e = tLObject;
        this.d = obj2;
        this.f54232b = z10;
    }

    public yn(Object obj, boolean z10, Object obj2, Object obj3, int i7) {
        this.f54231a = i7;
        this.f54233c = obj;
        this.f54232b = z10;
        this.d = obj2;
        this.f54234e = obj3;
    }

    public yn(org.telegram.ui.Components.xv0 xv0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f54231a = 6;
        this.f54233c = xv0Var;
        this.f54234e = tLObject;
        this.f54232b = z10;
        this.d = u1Var;
    }

    public yn(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.f54231a = 3;
        this.f54232b = z10;
        this.f54233c = chat;
        this.d = alertDialog$Builder;
        this.f54234e = zArr;
    }
}
