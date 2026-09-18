package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tv0 implements org.telegram.ui.Components.b5, GenericProvider, org.telegram.ui.ActionBar.b2, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.bl0, org.telegram.ui.Components.cl0, bw0, MessagesStorage.BooleanCallback, x11, OnSuccessListener, pa.a, OnFailureListener, t5.b, s5.e {
    public final int f37877a;
    public final Object f37878b;
    public final Object f37879c;

    public tv0(int i10, Object obj, Object obj2) {
        this.f37877a = i10;
        this.f37878b = obj;
        this.f37879c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        cw0 cw0Var = ((uv0) this.f37878b).f38236a;
        cw0Var.f32941e0.a((TLRPC.TL_messageMediaPoll) this.f37879c);
        cw0Var.finishFragment();
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        me1 me1Var = (me1) this.f37878b;
        bo boVar = (bo) this.f37879c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = me1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        me1Var.G.messageOwner.media = messageMedia;
        boVar.getSendMessagesHelper().editMessage(me1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f37878b;
        l5.i iVar = (l5.i) this.f37879c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f42873b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f13909c) {
                int size = aVar.f42873b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f42875a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j10 = bVar.f42875a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.f42877c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.f42878a, fVar.f42879b);
                }
                listIterator.set(new s5.b(j10, bVar.f42876b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f37878b, (Context) this.f37879c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final hc1 hc1Var = (hc1) this.f37878b;
        final jc1 jc1Var = (jc1) this.f37879c;
        ThemeActivity themeActivity = hc1Var.e;
        if (i10 >= 0 && i10 < jc1Var.e.size()) {
            final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) jc1Var.e.get(i10);
            if (h6Var.f18721a >= 100 && !h6Var.f18742z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = h6Var.f18735r;
                if (tL_theme != null && tL_theme.creator) {
                    str = LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl);
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {string, string2, str, LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        hc1 hc1Var2 = hc1.this;
                        ThemeActivity themeActivity2 = hc1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.c5.W(themeActivity2, i12, h6Var2.f18722b, h6Var2);
                            } else if (i11 == 1) {
                                if (h6Var2.f18735r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(h6Var2.f18722b, h6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var2.f18722b, h6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + h6Var2.f18735r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.iq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new ce1(h6Var2.f18722b, h6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f18447a;
                                c2Var.R = string3;
                                c2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new c7(hc1Var2, jc1Var, h6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.P = charSequenceArr;
                c2Var.Q = iArr;
                c2Var.M = onClickListener;
                themeActivity.showDialog(c2Var);
                c2Var.l(c2Var.N0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19083p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean z10;
        boolean z11;
        switch (this.f37877a) {
            case 2:
                ((PrivacyControlActivity) this.f37878b).t0();
                ((SharedPreferences) this.f37879c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37878b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new dc0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f37879c));
                return;
            case 4:
                ProfileActivity.c0((ProfileActivity) this.f37878b, (org.telegram.ui.Cells.z1[]) this.f37879c);
                return;
            case 5:
                j01 j01Var = (j01) this.f37878b;
                TLRPC.User user = (TLRPC.User) this.f37879c;
                j01Var.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                ProfileActivity profileActivity = j01Var.f34748b;
                profileActivity.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 6:
            case 7:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 19:
            default:
                rg.j0.Q((rg.j0) this.f37878b, (ArrayList) this.f37879c);
                return;
            case 8:
                s71 s71Var = (s71) this.f37878b;
                TLRPC.User user2 = (TLRPC.User) this.f37879c;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    s71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    c7 c7Var = new c7(s71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f31608b0 = c7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 9:
                ib1.m((ib1) this.f37878b, (wy) this.f37879c);
                return;
            case 10:
                ThemeActivity.X((ThemeActivity) this.f37878b, (ky0) this.f37879c);
                return;
            case 13:
                hc1 hc1Var = (hc1) this.f37878b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f37879c;
                hc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(i6Var.E);
                if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(i6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.j6.H;
                if (i6Var.f18759b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.j6.I == i6Var) {
                        org.telegram.ui.ActionBar.j6.t(org.telegram.ui.ActionBar.j6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                        org.telegram.ui.ActionBar.j6.J = (org.telegram.ui.ActionBar.i6) hashMap.get("Dark Blue");
                    }
                    i6Var.t();
                    org.telegram.ui.ActionBar.j6.G.remove(i6Var);
                    hashMap.remove(i6Var.f18757a);
                    org.telegram.ui.ActionBar.c6 c6Var = i6Var.f18769i0;
                    if (c6Var != null) {
                        org.telegram.ui.ActionBar.c6.a(c6Var);
                    }
                    org.telegram.ui.ActionBar.j6.F.remove(i6Var);
                    new File(i6Var.f18759b).delete();
                    org.telegram.ui.ActionBar.j6.s1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(hc1Var.e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 17:
                ih1.W((ih1) this.f37878b, (byte[]) this.f37879c);
                return;
            case 18:
                ti1 ti1Var = (ti1) this.f37878b;
                ti1Var.getClass();
                ((boolean[]) this.f37879c)[0] = true;
                ti1Var.f37792p0 = 17;
                Intent intent = new Intent(ti1Var.f37764b, VoIPService.class);
                intent.putExtra("user_id", ti1Var.d.f18268id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ti1Var.f37761a);
                try {
                    ti1Var.f37764b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 20:
                ((e2.h) this.f37878b).accept(Boolean.TRUE);
                ((boolean[]) this.f37879c)[0] = true;
                c2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.f37878b, (HashSet) this.f37879c);
                return;
            case 22:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f37878b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(d1Var.M).getInputUser(d1Var.U);
                ConnectionsManager.getInstance(d1Var.M).sendRequest(allowsendmessage, new ai.t5(d1Var, (String[]) this.f37879c, c2Var, 15));
                return;
            case 23:
                boolean[] zArr2 = (boolean[]) this.f37878b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f37879c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
        }
    }

    @Override
    public Object i() {
        switch (this.f37877a) {
            case 26:
                Iterable iterable = (Iterable) this.f37879c;
                s5.g gVar = (s5.g) ((s5.d) ((da.b) this.f37878b).f7583c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.b bVar = (da.b) this.f37878b;
                for (Map.Entry entry : ((HashMap) this.f37879c).entrySet()) {
                    ((s5.g) ((s5.c) bVar.f7586i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void j(pa.b bVar) {
        ((pa.a) this.f37878b).j(bVar);
        ((pa.a) this.f37879c).j(bVar);
    }

    @Override
    public void onFailure(Exception exc) {
        qg.a2 a2Var = (qg.a2) this.f37878b;
        Bitmap bitmap = (Bitmap) this.f37879c;
        a2Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && a2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new p2.b(6, a2Var, bitmap), 2000L);
        } else {
            a2Var.C0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((cf.c) this.f37878b).d));
        ((ci.d) this.f37879c).setLoading(false);
        kj1.d = null;
        org.telegram.ui.ActionBar.g3 g3Var = kj1.f35301c;
        if (g3Var != null) {
            g3Var.dismiss();
            kj1.f35301c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        jx0 jx0Var = (jx0) this.f37879c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((kx0) this.f37878b).d.f35652n;
        premiumPreviewFragment.f31189n0.d(0, 0.0f, 0, jx0Var.getMeasuredWidth(), -jx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f31189n0.f42583f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f37879c;
        fg1 fg1Var = ((pf1) this.f37878b).f36625b;
        NotificationCenter notificationCenter = fg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(fg1Var, i10);
        fg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        fg1Var.finishFragment();
        fg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f18121id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(vk0 vk0Var) {
        lg1 lg1Var = ((ig1) this.f37878b).f34569a;
        lg1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f37879c).f18173id));
        lg1Var.V();
    }

    public tv0(uv0 uv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f37877a = 0;
        this.f37878b = uv0Var;
        this.f37879c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f37878b;
        Runnable runnable = (Runnable) this.f37879c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                    if (Emoji.getEmojiDrawable(fixEmoji) != null) {
                        linkedHashSet.add(fixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void c0() {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
