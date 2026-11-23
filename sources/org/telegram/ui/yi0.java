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
public final class yi0 implements org.telegram.ui.ActionBar.q1, ss, org.telegram.ui.Components.z4, org.telegram.messenger.i9, org.telegram.messenger.oi, org.telegram.ui.Components.rj0, org.telegram.ui.Components.sj0, or0, org.telegram.messenger.lr, gx0 {
    public final int f54384a;
    public final Object f54385b;
    public final Object f54386c;

    public yi0(int i7, Object obj, Object obj2) {
        this.f54384a = i7;
        this.f54385b = obj;
        this.f54386c = obj2;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        switch (this.f54384a) {
            case 8:
                pr0 pr0Var = ((hr0) this.f54385b).f48617a;
                pr0Var.f51109f0.a((TLRPC.TL_messageMediaToDo) this.f54386c);
                pr0Var.finishFragment();
                return;
            default:
                pr0 pr0Var2 = ((hr0) this.f54385b).f48617a;
                pr0Var2.f51109f0.a((TLRPC.TL_messageMediaPoll) this.f54386c);
                pr0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        g81 g81Var = (g81) this.f54385b;
        bn bnVar = (bn) this.f54386c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = g81Var.H.f24073k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        g81Var.H.f24073k.media = messageMedia;
        bnVar.getSendMessagesHelper().t(g81Var.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public boolean b(int i7, View view) {
        String str;
        final e61 e61Var = (e61) this.f54385b;
        final g61 g61Var = (g61) this.f54386c;
        ThemeActivity themeActivity = e61Var.f47460e;
        if (i7 >= 0 && i7 < g61Var.f48119e.size()) {
            final org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) g61Var.f48119e.get(i7);
            if (k6Var.f29224a >= 100 && !k6Var.f29246z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131747603, "OpenInEditor");
                String N02 = org.telegram.messenger.gd.N0(2131745230, "ShareTheme");
                TLRPC.TL_theme tL_theme = k6Var.f29239r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.gd.N0(2131743900, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {N0, N02, str, org.telegram.messenger.gd.N0(2131751474, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        e61 e61Var2 = e61.this;
                        ThemeActivity themeActivity2 = e61Var2.f47460e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.k6 k6Var2 = k6Var;
                            int i11 = 2;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    i11 = 1;
                                }
                                org.telegram.ui.Components.b5.T(themeActivity2, i11, k6Var2.f29225b, k6Var2);
                            } else if (i10 == 1) {
                                if (k6Var2.f29239r == null) {
                                    themeActivity2.getMessagesController().H4(k6Var2.f29225b, k6Var2);
                                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25307v4, k6Var2.f29225b, k6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().X2 + "/addtheme/" + k6Var2.f29239r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.zo0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i10 == 2) {
                                themeActivity2.presentFragment(new y71(k6Var2.f29225b, k6Var2, false));
                            } else if (i10 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String N03 = org.telegram.messenger.gd.N0(2131751472, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28835a;
                                t1Var.S = N03;
                                t1Var.U = org.telegram.messenger.gd.N0(2131751473, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131751586, "Delete"), new a7(e61Var2, g61Var, k6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                                themeActivity2.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.Q = charSequenceArr;
                t1Var.R = new int[]{2131232121, 2131232368, 2131232208, 2131232113};
                t1Var.N = onClickListener;
                themeActivity.showDialog(t1Var);
                t1Var.m(t1Var.O0.size() - 1, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29692q7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29672p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f54385b;
        Runnable runnable = (Runnable) this.f54386c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (!((org.telegram.messenger.ni) arrayList.get(i7)).f26023a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.j6.c(((org.telegram.messenger.ni) arrayList.get(i7)).f26023a);
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
    public void d(ps psVar) {
        fk0 fk0Var = (fk0) this.f54385b;
        int intValue = ((Integer) ((View) this.f54386c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = fk0Var.Z[intValue];
        if (intValue == 5) {
            fk0Var.f47891s = psVar.d;
        } else {
            fk0Var.f47900w = psVar.d;
        }
        editTextBoldCursor.setText(psVar.f51135a);
    }

    public File e() {
        switch (this.f54384a) {
            case 4:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f54385b).U);
                return org.telegram.messenger.w7.J((TLObject) this.f54386c, null, true, true);
            default:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f54385b).U);
                return org.telegram.messenger.w7.M((TLRPC.Message) this.f54386c, false, true);
        }
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        ThemeActivity.b0((ThemeActivity) this.f54385b, (Context) this.f54386c, view, i7, f10);
    }

    @Override
    public Object h(Object obj) {
        ss0 ss0Var = (ss0) this.f54386c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ts0) this.f54385b).d.f52725n;
        premiumPreviewFragment.f43565o0.d(0, 0.0f, 0, ss0Var.getMeasuredWidth(), -ss0Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.f43565o0.f58727f;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.r4 r4Var;
        int i11 = this.f54384a;
        int i12 = 0;
        Object obj = this.f54386c;
        Object obj2 = this.f54385b;
        switch (i11) {
            case 0:
                int[] iArr = ((fk0) obj2).f47906y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.gd.N0(2131747300, null));
                return;
            case 1:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 15:
            case 16:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                org.telegram.ui.Wallet.a9 a9Var = new org.telegram.ui.Wallet.a9((org.telegram.ui.Wallet.e9) obj2, h, 1);
                org.telegram.ui.Wallet.v0.P("disableBackupWithoutUpdatingPhrase");
                v0Var.x0(new h2.n0((Object) v0Var, (Object) new a31(7, v0Var, a9Var), true, false, 4));
                return;
            case 2:
                fk0.Z((fk0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 3:
                kl0 kl0Var = (kl0) obj2;
                kl0Var.f49460c0 = true;
                kl0Var.f49457b0.email_unconfirmed_pattern = (String) obj;
                kl0Var.P0();
                return;
            case 6:
                PhotoViewer.u(((ro0) obj2).f51804b, (ArrayList) obj);
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((ro0) obj2).f51804b;
                uq0 uq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f43288a7;
                ArrayList arrayList3 = photoViewer.f43319d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.f43330e7;
                ArrayList arrayList6 = photoViewer.f43341f7;
                if (!uq0Var.N()) {
                    photoViewer.z0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.P4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(photoViewer.P4);
                        if (fjVar.q4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.f43481w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(fjVar.e1()));
                            }
                            if (org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(fjVar.f24073k)) && fjVar.f24073k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(fjVar.f24073k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.mp.u1(photoViewer.U).c1(Integer.valueOf((int) (org.telegram.messenger.fj.B0(fjVar.f24073k) & 4294967295L)));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(photoViewer.U);
                            long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                            int I1 = org.telegram.messenger.fj.I1(fjVar.f24073k);
                            boolean z12 = zArr[0];
                            if (fjVar.f24102r1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.fj.d5(fjVar.f24073k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.fj.b4(fjVar.f24073k)) {
                                    i12 = 5;
                                }
                                i10 = i12;
                            }
                            u12.Z(arrayList7, arrayList, encryptedChat, B0, I1, z12, i10);
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
                            arrayList9.add(Integer.valueOf(message.f28513id));
                            org.telegram.messenger.mp.u1(photoViewer.U).Z(arrayList9, null, null, org.telegram.messenger.fj.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.ks.f(photoViewer.U).k(39, new Object[0]);
                        }
                        if (photoViewer.G1()) {
                            if (photoViewer.f43516z5 > 0) {
                                org.telegram.messenger.mp.u1(photoViewer.U).l0(null);
                            } else {
                                org.telegram.messenger.mp.u1(photoViewer.U).B(-photoViewer.f43516z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.z0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f28511id = photo.f28516id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.f43516z5 > 0) {
                                org.telegram.messenger.mp.u1(photoViewer.U).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(photoViewer.U);
                            a02.f27149a.c(new org.telegram.messenger.np(4, photoViewer.f43516z5, photo.f28516id, a02));
                            arrayList2.remove(photoViewer.P4);
                            photoViewer.f43310c7.remove(photoViewer.P4);
                            photoViewer.f43299b7.remove(photoViewer.P4);
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
                                photoViewer.A2(i16);
                            }
                            if (message == null) {
                                org.telegram.messenger.ks.f(photoViewer.U).k(39, new Object[0]);
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
                    photoViewer.A2(i17);
                    return;
                } else {
                    return;
                }
            case 11:
                ((PrivacyControlActivity) obj2).E0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.f43619a0;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().f24667y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new d00(22, privacySettingsActivity, (org.telegram.ui.Cells.r8) obj));
                return;
            case 13:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.d2[]) obj);
                return;
            case 14:
                qv0 qv0Var = (qv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                qv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = qv0Var.f51546b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.H5(false, false);
                    return;
                }
                return;
            case 17:
                a21 a21Var = (a21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    a21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(a21Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.f43998a0 = 0;
                    twoStepVerificationActivity.f44002c0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 18:
                ThemeActivity.c0((ThemeActivity) obj2, (iy0) obj);
                return;
            case 21:
                e61 e61Var = (e61) obj2;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) obj;
                e61Var.getClass();
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(m6Var.F);
                if (m6Var == org.telegram.ui.ActionBar.n6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u13.G4(m6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.n6.H;
                if (m6Var.f29322b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.n6.I == m6Var) {
                        org.telegram.ui.ActionBar.n6.u(org.telegram.ui.ActionBar.n6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (m6Var == org.telegram.ui.ActionBar.n6.J) {
                        org.telegram.ui.ActionBar.n6.J = (org.telegram.ui.ActionBar.m6) hashMap.get("Dark Blue");
                    }
                    m6Var.t();
                    org.telegram.ui.ActionBar.n6.G.remove(m6Var);
                    hashMap.remove(m6Var.f29320a);
                    org.telegram.ui.ActionBar.e6 e6Var = m6Var.f29334j0;
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.e6.a(e6Var);
                    }
                    org.telegram.ui.ActionBar.n6.F.remove(m6Var);
                    new File(m6Var.f29322b).delete();
                    org.telegram.ui.ActionBar.n6.y1(true, false);
                }
                if (z11) {
                    r4Var = ((org.telegram.ui.ActionBar.g2) e61Var.f47460e).parentLayout;
                    ((ActionBarLayout) r4Var).X(true, true);
                }
                org.telegram.messenger.ks.e().k(268, new Object[0]);
                return;
            case 25:
                za1.b0((za1) obj2, (byte[]) obj);
                return;
            case 26:
                fc1 fc1Var = (fc1) obj2;
                ((boolean[]) obj)[0] = true;
                fc1Var.f47783p0 = 17;
                Intent intent = new Intent(fc1Var.f47755b, VoIPService.class);
                intent.putExtra("user_id", fc1Var.d.f28641id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", fc1Var.f47752a);
                try {
                    fc1Var.f47755b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 27:
                org.telegram.ui.Wallet.e9 e9Var = (org.telegram.ui.Wallet.e9) obj2;
                e9Var.getClass();
                t1Var.dismiss();
                org.telegram.ui.Wallet.v8 v8Var = new org.telegram.ui.Wallet.v8();
                v8Var.f45315r = !((Boolean) obj).booleanValue();
                e9Var.presentFragment(v8Var);
                return;
            case 28:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                return;
        }
    }

    @Override
    public void n(sh0 sh0Var) {
        ca1 ca1Var = ((z91) this.f54385b).f54556a;
        ca1Var.f46755e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f54386c).f28544id));
        ca1Var.a0();
    }

    @Override
    public void q(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f54386c;
        w91 w91Var = ((h91) this.f54385b).f48513b;
        org.telegram.messenger.ks notificationCenter = w91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.ks.f25289t;
        notificationCenter.n(w91Var, i7);
        w91Var.getNotificationCenter().k(i7, new Object[0]);
        w91Var.finishFragment();
        w91Var.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(-chat.f28492id), null, chat, Boolean.valueOf(z10));
    }

    public yi0(hr0 hr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f54384a = 9;
        this.f54385b = hr0Var;
        this.f54386c = tL_messageMediaPoll;
    }

    @Override
    public void Q() {
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
