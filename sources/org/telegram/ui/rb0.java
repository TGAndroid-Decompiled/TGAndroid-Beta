package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rb0 implements org.telegram.ui.ActionBar.p1, OnCompleteListener, org.telegram.ui.Components.gj0, ns, org.telegram.ui.Components.r4, org.telegram.messenger.e9, org.telegram.messenger.ii, org.telegram.ui.Components.hj0, er0, org.telegram.messenger.ir, xw0 {
    public final int f49186a;
    public final Object f49187b;
    public final Object f49188c;

    public rb0(int i3, Object obj, Object obj2) {
        this.f49186a = i3;
        this.f49187b = obj;
        this.f49188c = obj2;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        switch (this.f49186a) {
            case 13:
                fr0 fr0Var = ((xq0) this.f49187b).f52079a;
                fr0Var.f45337f0.a((TLRPC.TL_messageMediaToDo) this.f49188c);
                fr0Var.finishFragment();
                return;
            default:
                fr0 fr0Var2 = ((xq0) this.f49187b).f52079a;
                fr0Var2.f45337f0.a((TLRPC.TL_messageMediaPoll) this.f49188c);
                fr0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        w71 w71Var = (w71) this.f49187b;
        wm wmVar = (wm) this.f49188c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = w71Var.H.f26868k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        w71Var.H.f26868k.media = messageMedia;
        wmVar.getSendMessagesHelper().t(w71Var.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        switch (this.f49186a) {
            case 3:
                NotificationsCustomSettingsActivity.Z((NotificationsCustomSettingsActivity) this.f49187b, (Context) this.f49188c, view, i3, f10, f11);
                return;
            default:
                ThemeActivity.b0((ThemeActivity) this.f49187b, (Context) this.f49188c, view, i3, f10);
                return;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f49186a) {
            case 3:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c(ks ksVar) {
        yj0 yj0Var = (yj0) this.f49187b;
        int intValue = ((Integer) ((View) this.f49188c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = yj0Var.Z[intValue];
        if (intValue == 5) {
            yj0Var.f52324s = ksVar.d;
        } else {
            yj0Var.f52333w = ksVar.d;
        }
        editTextBoldCursor.setText(ksVar.f47004a);
    }

    public File d() {
        switch (this.f49186a) {
            case 9:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f49187b).U);
                return org.telegram.messenger.w7.K((TLObject) this.f49188c, null, true, true);
            default:
                org.telegram.messenger.w7.G(((PhotoViewer) this.f49187b).U);
                return org.telegram.messenger.w7.N((TLRPC.Message) this.f49188c, false, true);
        }
    }

    @Override
    public boolean f(int i3, View view) {
        String str;
        final v51 v51Var = (v51) this.f49187b;
        final x51 x51Var = (x51) this.f49188c;
        ThemeActivity themeActivity = v51Var.f50398e;
        if (i3 >= 0 && i3 < x51Var.f51834e.size()) {
            final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) x51Var.f51834e.get(i3);
            if (g6Var.f27525a >= 100 && !g6Var.f27547z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131747805, "OpenInEditor");
                String M02 = org.telegram.messenger.bd.M0(2131745436, "ShareTheme");
                TLRPC.TL_theme tL_theme = g6Var.f27540r;
                if (tL_theme != null && tL_theme.creator) {
                    str = org.telegram.messenger.bd.M0(2131744155, "ThemeSetUrl");
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {M0, M02, str, org.telegram.messenger.bd.M0(2131751487, "DeleteTheme")};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        v51 v51Var2 = v51.this;
                        ThemeActivity themeActivity2 = v51Var2.f50398e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                            int i11 = 2;
                            if (i10 == 0) {
                                if (i10 != 1) {
                                    i11 = 1;
                                }
                                org.telegram.ui.Components.t4.V(themeActivity2, i11, g6Var2.f27526b, g6Var2);
                            } else if (i10 == 1) {
                                if (g6Var2.f27540r == null) {
                                    themeActivity2.getMessagesController().y4(g6Var2.f27526b, g6Var2);
                                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23303s4, g6Var2.f27526b, g6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().V2 + "/addtheme/" + g6Var2.f27540r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.oo0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i10 == 2) {
                                themeActivity2.presentFragment(new o71(g6Var2.f27526b, g6Var2, false));
                            } else if (i10 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String M03 = org.telegram.messenger.bd.M0(2131751485, "DeleteThemeTitle");
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.f27343a;
                                s1Var.S = M03;
                                s1Var.U = org.telegram.messenger.bd.M0(2131751486, "DeleteThemeAlert");
                                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751599, "Delete"), new b7(v51Var2, x51Var, g6Var2, 22));
                                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                                themeActivity2.showDialog(s1Var);
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.Q = charSequenceArr;
                s1Var.R = new int[]{2131232116, 2131232363, 2131232203, 2131232108};
                s1Var.N = onClickListener;
                themeActivity.showDialog(s1Var);
                s1Var.m(s1Var.Q0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28102p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.q4 q4Var;
        int i11 = this.f49186a;
        int i12 = 1;
        Object obj = this.f49188c;
        Object obj2 = this.f49187b;
        switch (i11) {
            case 0:
                vb0 vb0Var = (vb0) obj2;
                vb0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", vb0Var.f50447r);
                bundle.putString("requestPhone", vb0Var.f50448s);
                bundle.putString("phoneHash", vb0Var.f50449w);
                bundle.putString("phoneCode", vb0Var.f50450x);
                vb0Var.E.D1(7, true, bundle, false);
                return;
            case 1:
            case 3:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            case 20:
            case 21:
            default:
                v51 v51Var = (v51) obj2;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                v51Var.getClass();
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(j6Var.F);
                if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s12.x4(j6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.k6.H;
                if (j6Var.f27677b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.k6.I == j6Var) {
                        org.telegram.ui.ActionBar.k6.u(org.telegram.ui.ActionBar.k6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                        org.telegram.ui.ActionBar.k6.J = (org.telegram.ui.ActionBar.j6) hashMap.get("Dark Blue");
                    }
                    j6Var.t();
                    org.telegram.ui.ActionBar.k6.G.remove(j6Var);
                    hashMap.remove(j6Var.f27675a);
                    org.telegram.ui.ActionBar.b6 b6Var = j6Var.f27689j0;
                    if (b6Var != null) {
                        org.telegram.ui.ActionBar.b6.a(b6Var);
                    }
                    org.telegram.ui.ActionBar.k6.F.remove(j6Var);
                    new File(j6Var.f27677b).delete();
                    org.telegram.ui.ActionBar.k6.y1(true, false);
                }
                if (z11) {
                    q4Var = ((org.telegram.ui.ActionBar.d2) v51Var.f50398e).parentLayout;
                    ((ActionBarLayout) q4Var).X(true, true);
                }
                org.telegram.messenger.hs.e().k(265, new Object[0]);
                return;
            case 2:
                dd0.n((dd0) obj2, (Context) obj);
                return;
            case 4:
                yj0 yj0Var = (yj0) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!yj0Var.f52334w0) {
                    yj0Var.f52328t1.clear();
                }
                yj0Var.f52330u1.clear();
                dj0 dj0Var = (dj0) yj0Var.C1;
                dj0Var.d.n1(yj0Var.F, yj0Var.G, yj0Var.H, zArr[0], null, null, dj0Var.f44723b);
                yj0Var.finishFragment();
                return;
            case 5:
                int[] iArr = ((yj0) obj2).f52339y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.bd.M0(2131747502, null));
                return;
            case 7:
                yj0.Z((yj0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                return;
            case 8:
                dl0 dl0Var = (dl0) obj2;
                dl0Var.f44743c0 = true;
                dl0Var.f44740b0.email_unconfirmed_pattern = (String) obj;
                dl0Var.P0();
                return;
            case 11:
                PhotoViewer.C(((ho0) obj2).f45959b, (ArrayList) obj);
                return;
            case 12:
                boolean[] zArr2 = (boolean[]) obj;
                PhotoViewer photoViewer = ((ho0) obj2).f45959b;
                kq0 kq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.f41389b7;
                ArrayList arrayList3 = photoViewer.f41417e7;
                ArrayList arrayList4 = photoViewer.Z6;
                ArrayList arrayList5 = photoViewer.f41427f7;
                ArrayList arrayList6 = photoViewer.g7;
                if (!kq0Var.N()) {
                    photoViewer.H0(false, false);
                    return;
                } else if (!arrayList4.isEmpty()) {
                    int i13 = photoViewer.Q4;
                    if (i13 >= 0 && i13 < arrayList4.size()) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList4.get(photoViewer.Q4);
                        if (ziVar.r4()) {
                            photoViewer.H0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i14 = photoViewer.f41567w;
                            if (i14 != 0) {
                                arrayList7.add(Integer.valueOf(i14));
                            } else {
                                arrayList7.add(Integer.valueOf(ziVar.f1()));
                            }
                            if (org.telegram.messenger.m5.C(org.telegram.messenger.zi.B0(ziVar.f26868k)) && ziVar.f26868k.random_id != 0) {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(ziVar.f26868k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.hp.s1(photoViewer.U).a1(Integer.valueOf((int) (org.telegram.messenger.zi.B0(ziVar.f26868k) & 4294967295L)));
                            } else {
                                arrayList = null;
                                encryptedChat = null;
                            }
                            org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(photoViewer.U);
                            long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                            int J1 = org.telegram.messenger.zi.J1(ziVar.f26868k);
                            boolean z12 = zArr2[0];
                            if (!ziVar.f26887p1) {
                                if (org.telegram.messenger.zi.e5(ziVar.f26868k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.zi.c4(ziVar.f26868k)) {
                                    i12 = 5;
                                } else {
                                    i10 = 0;
                                    s13.Z(arrayList7, arrayList, encryptedChat, B0, J1, z12, i10);
                                    return;
                                }
                            }
                            i10 = i12;
                            s13.Z(arrayList7, arrayList, encryptedChat, B0, J1, z12, i10);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList6.isEmpty()) {
                    int i15 = photoViewer.Q4;
                    if (i15 >= 0 && i15 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.Q4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.f27022id));
                            org.telegram.messenger.hp.s1(photoViewer.U).Z(arrayList9, null, null, org.telegram.messenger.zi.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.hs.f(photoViewer.U).k(39, new Object[0]);
                        }
                        if (photoViewer.L1()) {
                            if (photoViewer.A5 > 0) {
                                org.telegram.messenger.hp.s1(photoViewer.U).l0(null);
                            } else {
                                org.telegram.messenger.hp.s1(photoViewer.U).B(-photoViewer.A5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.H0(false, false);
                            return;
                        }
                        TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.Q4);
                        if (photo != null) {
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_inputPhoto.f27020id = photo.f27025id;
                            tL_inputPhoto.access_hash = photo.access_hash;
                            byte[] bArr = photo.file_reference;
                            tL_inputPhoto.file_reference = bArr;
                            if (bArr == null) {
                                tL_inputPhoto.file_reference = new byte[0];
                            }
                            if (photoViewer.A5 > 0) {
                                org.telegram.messenger.hp.s1(photoViewer.U).l0(tL_inputPhoto);
                            }
                            org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(photoViewer.U);
                            a02.f24934a.c(new org.telegram.messenger.mp(4, photoViewer.A5, photo.f27025id, a02));
                            arrayList2.remove(photoViewer.Q4);
                            photoViewer.f41407d7.remove(photoViewer.Q4);
                            photoViewer.f41398c7.remove(photoViewer.Q4);
                            arrayList3.remove(photoViewer.Q4);
                            arrayList6.remove(photoViewer.Q4);
                            if (arrayList2.isEmpty()) {
                                photoViewer.H0(false, false);
                            } else {
                                int i16 = photoViewer.Q4;
                                if (i16 >= arrayList6.size()) {
                                    i16 = arrayList6.size() - 1;
                                }
                                photoViewer.Q4 = -1;
                                photoViewer.E2(i16);
                            }
                            if (message == null) {
                                org.telegram.messenger.hs.f(photoViewer.U).k(39, new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.Q4);
                    photoViewer.d.B(photoViewer.Q4);
                    if (arrayList5.isEmpty()) {
                        photoViewer.H0(false, false);
                        return;
                    }
                    int i17 = photoViewer.Q4;
                    if (i17 >= arrayList5.size()) {
                        i17 = arrayList5.size() - 1;
                    }
                    photoViewer.Q4 = -1;
                    photoViewer.E2(i17);
                    return;
                } else {
                    return;
                }
            case 16:
                ((PrivacyControlActivity) obj2).E0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr3 = privacySettingsActivity.f41705a0;
                tL_payments_clearSavedInfo.credentials = zArr3[1];
                tL_payments_clearSavedInfo.info = zArr3[0];
                privacySettingsActivity.getUserConfig().f22859y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new xy(23, privacySettingsActivity, (org.telegram.ui.Cells.q8) obj));
                return;
            case 18:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                return;
            case 19:
                iv0 iv0Var = (iv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                iv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = iv0Var.f46427b;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.D5(false, false);
                    return;
                }
                return;
            case 22:
                q11 q11Var = (q11) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    q11Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(q11Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.f42083a0 = 0;
                    twoStepVerificationActivity.f42087c0 = b7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 23:
                ThemeActivity.c0((ThemeActivity) obj2, (qv0) obj);
                return;
        }
    }

    @Override
    public void h(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f49187b;
        Runnable runnable = (Runnable) this.f49188c;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            try {
                if (!((org.telegram.messenger.hi) arrayList.get(i3)).f22931a.startsWith("animated_")) {
                    String c2 = org.telegram.messenger.i6.c(((org.telegram.messenger.hi) arrayList.get(i3)).f22931a);
                    if (org.telegram.messenger.i6.g(c2) != null) {
                        linkedHashSet.add(c2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public Object k(Object obj) {
        is0 is0Var = (is0) this.f49188c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((js0) this.f49187b).d.f47012n;
        premiumPreviewFragment.f41651o0.d(0, 0.0f, 0, is0Var.getMeasuredWidth(), -is0Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.f41651o0.f56911f;
    }

    @Override
    public void l(lh0 lh0Var) {
        s91 s91Var = ((p91) this.f49187b).f48498a;
        s91Var.f49454e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f49188c).f27053id));
        s91Var.a0();
    }

    @Override
    public void o(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f49188c;
        m91 m91Var = ((y81) this.f49187b).f52227b;
        org.telegram.messenger.hs notificationCenter = m91Var.getNotificationCenter();
        int i3 = org.telegram.messenger.hs.f23305t;
        notificationCenter.n(m91Var, i3);
        m91Var.getNotificationCenter().k(i3, new Object[0]);
        m91Var.finishFragment();
        m91Var.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(-chat.f27001id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void onComplete(Task task) {
        a9.j0 j0Var = (a9.j0) this.f49188c;
        xd0 xd0Var = ((qc0) this.f49187b).F;
        if (xd0Var.getParentActivity() != null && !xd0Var.getParentActivity().isFinishing()) {
            xd0Var.getParentActivity().startActivityForResult(j0Var.f(), 200);
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i3 = this.f49186a;
    }

    public rb0(xq0 xq0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f49186a = 14;
        this.f49187b = xq0Var;
        this.f49188c = tL_messageMediaPoll;
    }

    @Override
    public void a0() {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void i(View view, float f10, float f11) {
    }
}
