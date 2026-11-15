package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xi0 implements org.telegram.ui.ActionBar.q1, ss, org.telegram.ui.Components.r4, org.telegram.messenger.j9, org.telegram.messenger.pi, org.telegram.ui.Components.hj0, org.telegram.ui.Components.ij0, mr0, org.telegram.messenger.nr, ex0 {
    public final int f53248a;
    public final Object f53249b;
    public final Object f53250c;

    public xi0(int i7, Object obj, Object obj2) {
        this.f53248a = i7;
        this.f53249b = obj;
        this.f53250c = obj2;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f53248a) {
            case 9:
                nr0 nr0Var = ((fr0) this.f53249b).f47172a;
                nr0Var.f49614f0.a((TLRPC.TL_messageMediaToDo) this.f53250c);
                nr0Var.finishFragment();
                return;
            default:
                nr0 nr0Var2 = ((fr0) this.f53249b).f47172a;
                nr0Var2.f49614f0.a((TLRPC.TL_messageMediaPoll) this.f53250c);
                nr0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        e81 e81Var = (e81) this.f53249b;
        an anVar = (an) this.f53250c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = e81Var.H.f23819k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        e81Var.H.f23819k.media = messageMedia;
        anVar.getSendMessagesHelper().t(e81Var.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean b(int i7, View view) {
        String str;
        final c61 c61Var = (c61) this.f53249b;
        final e61 e61Var = (e61) this.f53250c;
        ThemeActivity themeActivity = c61Var.f46027e;
        if (i7 >= 0 && i7 < e61Var.f46574e.size()) {
            final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) e61Var.f46574e.get(i7);
            if (g6Var.f28602a >= 100 && !g6Var.f28624z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131747797, "OpenInEditor");
                String M02 = org.telegram.messenger.hd.M0(2131745426, "ShareTheme");
                TLRPC.TL_theme tL_theme = g6Var.f28617r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.hd.M0(2131744145, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {M0, M02, str, org.telegram.messenger.hd.M0(2131751486, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        c61 c61Var2 = c61.this;
                        ThemeActivity themeActivity2 = c61Var2.f46027e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                            int i11 = 2;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    i11 = 1;
                                }
                                org.telegram.ui.Components.t4.T(themeActivity2, i11, g6Var2.f28603b, g6Var2);
                            } else if (i10 == 1) {
                                if (g6Var2.f28617r == null) {
                                    themeActivity2.getMessagesController().y4(g6Var2.f28603b, g6Var2);
                                    org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25572s4, g6Var2.f28603b, g6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().V2 + "/addtheme/" + g6Var2.f28617r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.po0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i10 == 2) {
                                themeActivity2.presentFragment(new w71(g6Var2.f28603b, g6Var2, false));
                            } else if (i10 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String M03 = org.telegram.messenger.hd.M0(2131751484, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28392a;
                                t1Var.S = M03;
                                t1Var.U = org.telegram.messenger.hd.M0(2131751485, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131751598, "Delete"), new a7(c61Var2, e61Var, g6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                                themeActivity2.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.Q = charSequenceArr;
                t1Var.R = new int[]{2131232117, 2131232364, 2131232204, 2131232109};
                t1Var.N = onClickListener;
                themeActivity.showDialog(t1Var);
                t1Var.m(t1Var.O0.size() - 1, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29090q7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29070p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f53249b;
        Runnable runnable = (Runnable) this.f53250c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (!((org.telegram.messenger.oi) arrayList.get(i7)).f25765a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.j6.c(((org.telegram.messenger.oi) arrayList.get(i7)).f25765a);
                    if (org.telegram.messenger.j6.g(c10) != null) {
                        linkedHashSet.add(c10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(qh0 qh0Var) {
        aa1 aa1Var = ((x91) this.f53249b).f53132a;
        aa1Var.f44983e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f53250c).f28103id));
        aa1Var.a0();
    }

    @Override
    public void e(ps psVar) {
        ek0 ek0Var = (ek0) this.f53249b;
        int intValue = ((Integer) ((View) this.f53250c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = ek0Var.Z[intValue];
        if (intValue == 5) {
            ek0Var.f46832s = psVar.d;
        } else {
            ek0Var.f46841w = psVar.d;
        }
        editTextBoldCursor.setText(psVar.f50349a);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ThemeActivity.b0((ThemeActivity) this.f53249b, (Context) this.f53250c, view, i7, f10);
    }

    public File g() {
        switch (this.f53248a) {
            case 5:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f53249b).U);
                return org.telegram.messenger.w7.J((TLObject) this.f53250c, null, true, true);
            default:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f53249b).U);
                return org.telegram.messenger.w7.M((TLRPC.Message) this.f53250c, false, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.o4 o4Var;
        int i11 = this.f53248a;
        int i12 = 0;
        Object obj = this.f53250c;
        Object obj2 = this.f53249b;
        switch (i11) {
            case 0:
                ek0 ek0Var = (ek0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!ek0Var.f46842w0) {
                    ek0Var.f46836t1.clear();
                }
                ek0Var.f46838u1.clear();
                jj0 jj0Var = (jj0) ek0Var.C1;
                jj0Var.d.n1(ek0Var.F, ek0Var.G, ek0Var.H, zArr[0], null, null, jj0Var.f48354b);
                ek0Var.finishFragment();
                return;
            case 1:
                int[] iArr = ((ek0) obj2).f46847y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.hd.M0(2131747494, null));
                return;
            case 2:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 16:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            default:
                org.telegram.ui.Wallet.p8 p8Var = (org.telegram.ui.Wallet.p8) obj2;
                p8Var.getClass();
                t1Var.dismiss();
                org.telegram.ui.Wallet.f8 f8Var = new org.telegram.ui.Wallet.f8();
                f8Var.f43845r = !((Boolean) obj).booleanValue();
                p8Var.presentFragment(f8Var);
                return;
            case 3:
                ek0.Z((ek0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 4:
                kl0 kl0Var = (kl0) obj2;
                kl0Var.f48681c0 = true;
                kl0Var.f48678b0.email_unconfirmed_pattern = (String) obj;
                kl0Var.P0();
                return;
            case 7:
                PhotoViewer.u(((oo0) obj2).f50016b, (ArrayList) obj);
                return;
            case 8:
                boolean[] zArr2 = (boolean[]) obj;
                PhotoViewer photoViewer = ((oo0) obj2).f50016b;
                sq0 sq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f42722a7;
                ArrayList arrayList3 = photoViewer.f42750d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.f42760e7;
                ArrayList arrayList6 = photoViewer.f42770f7;
                if (!sq0Var.N()) {
                    photoViewer.z0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList4.get(photoViewer.P4);
                        if (gjVar.q4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.f42910w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(gjVar.e1()));
                            }
                            if (org.telegram.messenger.m5.C(org.telegram.messenger.gj.B0(gjVar.f23819k)) && gjVar.f23819k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(gjVar.f23819k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.np.s1(photoViewer.U).a1(Integer.valueOf((int) (org.telegram.messenger.gj.B0(gjVar.f23819k) & 4294967295L)));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(photoViewer.U);
                            long B0 = org.telegram.messenger.gj.B0(gjVar.f23819k);
                            int I1 = org.telegram.messenger.gj.I1(gjVar.f23819k);
                            boolean z12 = zArr2[0];
                            if (gjVar.f23848r1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.gj.d5(gjVar.f23819k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.gj.b4(gjVar.f23819k)) {
                                    i12 = 5;
                                }
                                i10 = i12;
                            }
                            s12.Z(arrayList7, arrayList, encryptedChat, B0, I1, z12, i10);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.P4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.f28072id));
                            org.telegram.messenger.np.s1(photoViewer.U).Z(arrayList9, null, null, org.telegram.messenger.gj.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.ns.f(photoViewer.U).k(39, new Object[0]);
                        }
                        if (photoViewer.G1()) {
                            if (photoViewer.f42945z5 > 0) {
                                org.telegram.messenger.np.s1(photoViewer.U).l0(null);
                            } else {
                                org.telegram.messenger.np.s1(photoViewer.U).B(-photoViewer.f42945z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.z0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f28070id = photo.f28075id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f42945z5 > 0) {
                                org.telegram.messenger.np.s1(photoViewer.U).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(photoViewer.U);
                            a02.f27219a.c(new org.telegram.messenger.pp(4, photoViewer.f42945z5, photo.f28075id, a02));
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f42742c7.remove(photoViewer.P4);
                            photoViewer.f42732b7.remove(photoViewer.P4);
                            arrayList3.remove(photoViewer.P4);
                            arrayList6.remove(photoViewer.P4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.z0(false, false);
                            } else {
                                int i16 = photoViewer.P4;
                                if (i16 >= arrayList6.size()) {
                                    i16 = arrayList6.size() - 1;
                                }
                                photoViewer.P4 = -1;
                                photoViewer.z2(i16);
                            }
                            if (message == null) {
                                org.telegram.messenger.ns.f(photoViewer.U).k(39, new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (arrayList5.isEmpty()) {
                        photoViewer.z0(false, false);
                        return;
                    }
                    int i17 = photoViewer.P4;
                    if (i17 >= arrayList5.size()) {
                        i17 = arrayList5.size() - 1;
                    }
                    photoViewer.P4 = -1;
                    photoViewer.z2(i17);
                    return;
                } else {
                    return;
                }
            case 12:
                ((PrivacyControlActivity) obj2).E0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.f43048a0;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().f24970y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new b00(22, privacySettingsActivity, (org.telegram.ui.Cells.q8) obj));
                return;
            case 14:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                return;
            case 15:
                pv0 pv0Var = (pv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                pv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = pv0Var.f50374b;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.G5(false, false);
                    return;
                }
                return;
            case 18:
                x11 x11Var = (x11) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    x11Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(x11Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.f43426a0 = 0;
                    twoStepVerificationActivity.f43430c0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 19:
                ThemeActivity.c0((ThemeActivity) obj2, (fy0) obj);
                return;
            case 22:
                c61 c61Var = (c61) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                c61Var.getClass();
                org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(i6Var.F);
                if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s13.x4(i6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.j6.H;
                if (i6Var.f28700b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.j6.I == i6Var) {
                        org.telegram.ui.ActionBar.j6.u(org.telegram.ui.ActionBar.j6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                        org.telegram.ui.ActionBar.j6.J = (org.telegram.ui.ActionBar.i6) hashMap.get("Dark Blue");
                    }
                    i6Var.t();
                    org.telegram.ui.ActionBar.j6.G.remove(i6Var);
                    hashMap.remove(i6Var.f28698a);
                    org.telegram.ui.ActionBar.b6 b6Var = i6Var.f28712j0;
                    if (b6Var != null) {
                        org.telegram.ui.ActionBar.b6.a(b6Var);
                    }
                    org.telegram.ui.ActionBar.j6.F.remove(i6Var);
                    new File(i6Var.f28700b).delete();
                    org.telegram.ui.ActionBar.j6.y1(true, false);
                }
                if (z11) {
                    o4Var = ((org.telegram.ui.ActionBar.e2) c61Var.f46027e).parentLayout;
                    ((ActionBarLayout) o4Var).X(true, true);
                }
                org.telegram.messenger.ns.e().k(265, new Object[0]);
                return;
            case 26:
                xa1.b0((xa1) obj2, (byte[]) obj);
                return;
            case 27:
                ec1 ec1Var = (ec1) obj2;
                ((boolean[]) obj)[0] = true;
                ec1Var.f46702p0 = 17;
                Intent intent = new Intent(ec1Var.f46674b, VoIPService.class);
                intent.putExtra("user_id", ec1Var.d.f28200id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ec1Var.f46671a);
                try {
                    ec1Var.f46674b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
        }
    }

    @Override
    public void j(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f53250c;
        u91 u91Var = ((f91) this.f53249b).f47078b;
        org.telegram.messenger.ns notificationCenter = u91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.ns.f25573t;
        notificationCenter.n(u91Var, i7);
        u91Var.getNotificationCenter().k(i7, new Object[0]);
        u91Var.finishFragment();
        u91Var.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(-chat.f28051id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public Object o(Object obj) {
        ps0 ps0Var = (ps0) this.f53250c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((qs0) this.f53249b).d.f51016n;
        premiumPreviewFragment.f42994o0.d(0, 0.0f, 0, ps0Var.getMeasuredWidth(), -ps0Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.f42994o0.f58392f;
    }

    public xi0(fr0 fr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f53248a = 10;
        this.f53249b = fr0Var;
        this.f53250c = tL_messageMediaPoll;
    }

    @Override
    public void b0() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
