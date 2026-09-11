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
public final class qv0 implements org.telegram.ui.Components.d5, GenericProvider, org.telegram.ui.ActionBar.a2, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, yv0, MessagesStorage.BooleanCallback, x11, OnSuccessListener, pa.a, t5.b, OnFailureListener, s5.e {
    public final int f39984a;
    public final Object f39985b;
    public final Object f39986c;

    public qv0(int i10, Object obj, Object obj2) {
        this.f39984a = i10;
        this.f39985b = obj;
        this.f39986c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f39984a) {
            case 0:
                zv0 zv0Var = ((rv0) this.f39985b).f40246a;
                zv0Var.f43535e0.b((TLRPC.TL_messageMediaToDo) this.f39986c);
                zv0Var.finishFragment();
                return;
            default:
                zv0 zv0Var2 = ((rv0) this.f39985b).f40246a;
                zv0Var2.f43535e0.b((TLRPC.TL_messageMediaPoll) this.f39986c);
                zv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        String str;
        final gc1 gc1Var = (gc1) this.f39985b;
        final ic1 ic1Var = (ic1) this.f39986c;
        ThemeActivity themeActivity = gc1Var.f36626e;
        if (i10 >= 0 && i10 < ic1Var.f37298e.size()) {
            final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) ic1Var.f37298e.get(i10);
            if (h6Var.f20490a >= 100 && !h6Var.f20512z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = h6Var.f20505r;
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
                        gc1 gc1Var2 = gc1.this;
                        ThemeActivity themeActivity2 = gc1Var2.f36626e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.e5.W(themeActivity2, i12, h6Var2.f20491b, h6Var2);
                            } else if (i11 == 1) {
                                if (h6Var2.f20505r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(h6Var2.f20491b, h6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var2.f20491b, h6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + h6Var2.f20505r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.hq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new be1(h6Var2.f20491b, h6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20198a;
                                b2Var.R = string3;
                                b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new b7(gc1Var2, ic1Var, h6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20880p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f39985b;
        l5.i iVar = (l5.i) this.f39986c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f45929b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f15285c) {
                int size = aVar.f45929b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f45932a);
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
            long j10 = bVar.f45932a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.f45934c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.f45935a, fVar.f45936b);
                }
                listIterator.set(new s5.b(j10, bVar.f45933b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        le1 le1Var = (le1) this.f39985b;
        co coVar = (co) this.f39986c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = le1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        le1Var.G.messageOwner.media = messageMedia;
        coVar.getSendMessagesHelper().editMessage(le1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f39985b, (Context) this.f39986c, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        boolean z11;
        switch (this.f39984a) {
            case 3:
                ((PrivacyControlActivity) this.f39985b).t0();
                ((SharedPreferences) this.f39986c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f39985b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new bc0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f39986c));
                return;
            case 5:
                ProfileActivity.c0((ProfileActivity) this.f39985b, (org.telegram.ui.Cells.z1[]) this.f39986c);
                return;
            case 6:
                i01 i01Var = (i01) this.f39985b;
                TLRPC.User user = (TLRPC.User) this.f39986c;
                i01Var.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                ProfileActivity profileActivity = i01Var.f37149b;
                profileActivity.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 7:
            case 8:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 20:
            default:
                boolean[] zArr2 = (boolean[]) this.f39985b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f39986c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 9:
                t71 t71Var = (t71) this.f39985b;
                TLRPC.User user2 = (TLRPC.User) this.f39986c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    t71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(t71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f34218b0 = b7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 10:
                jb1.m((jb1) this.f39985b, (uy) this.f39986c);
                return;
            case 11:
                ThemeActivity.X((ThemeActivity) this.f39985b, (w81) this.f39986c);
                return;
            case 14:
                gc1 gc1Var = (gc1) this.f39985b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f39986c;
                gc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(i6Var.E);
                if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(i6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.j6.H;
                if (i6Var.f20542b == null) {
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
                    hashMap.remove(i6Var.f20540a);
                    org.telegram.ui.ActionBar.b6 b6Var = i6Var.f20553i0;
                    if (b6Var != null) {
                        org.telegram.ui.ActionBar.b6.a(b6Var);
                    }
                    org.telegram.ui.ActionBar.j6.F.remove(i6Var);
                    new File(i6Var.f20542b).delete();
                    org.telegram.ui.ActionBar.j6.s1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(gc1Var.f36626e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 18:
                hh1.W((hh1) this.f39985b, (byte[]) this.f39986c);
                return;
            case 19:
                ui1 ui1Var = (ui1) this.f39985b;
                ui1Var.getClass();
                ((boolean[]) this.f39986c)[0] = true;
                ui1Var.f41139p0 = 17;
                Intent intent = new Intent(ui1Var.f41110b, VoIPService.class);
                intent.putExtra("user_id", ui1Var.d.f20016id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ui1Var.f41107a);
                try {
                    ui1Var.f41110b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 21:
                ((e2.h) this.f39985b).accept(Boolean.TRUE);
                ((boolean[]) this.f39986c)[0] = true;
                b2Var.dismiss();
                return;
            case 22:
                org.telegram.ui.web.q.Y((org.telegram.ui.web.q) this.f39985b, (HashSet) this.f39986c);
                return;
            case 23:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f39985b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(d1Var.M).getInputUser(d1Var.U);
                ConnectionsManager.getInstance(d1Var.M).sendRequest(allowsendmessage, new bi.c5(d1Var, (String[]) this.f39986c, b2Var, 15));
                return;
        }
    }

    @Override
    public void h(pa.b bVar) {
        ((pa.a) this.f39985b).h(bVar);
        ((pa.a) this.f39986c).h(bVar);
    }

    @Override
    public Object i() {
        switch (this.f39984a) {
            case 26:
                Iterable iterable = (Iterable) this.f39986c;
                s5.g gVar = (s5.g) ((s5.d) ((da.b) this.f39985b).f6653c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.b bVar = (da.b) this.f39985b;
                for (Map.Entry entry : ((HashMap) this.f39986c).entrySet()) {
                    ((s5.g) ((s5.c) bVar.f6657i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        rg.z1 z1Var = (rg.z1) this.f39985b;
        Bitmap bitmap = (Bitmap) this.f39986c;
        z1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && z1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(16, z1Var, bitmap), 2000L);
        } else {
            z1Var.C0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((cf.c) this.f39985b).d));
        ((di.d) this.f39986c).setLoading(false);
        lj1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = lj1.f38397c;
        if (f3Var != null) {
            f3Var.dismiss();
            lj1.f38397c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        hx0 hx0Var = (hx0) this.f39986c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ix0) this.f39985b).d.f37864n;
        premiumPreviewFragment.f33788n0.d(0, 0.0f, 0, hx0Var.getMeasuredWidth(), -hx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f33788n0.f46035f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f39986c;
        eg1 eg1Var = ((of1) this.f39985b).f39237b;
        NotificationCenter notificationCenter = eg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(eg1Var, i10);
        eg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        eg1Var.finishFragment();
        eg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f19869id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(wk0 wk0Var) {
        kg1 kg1Var = ((hg1) this.f39985b).f36997a;
        kg1Var.f38066e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f39986c).f19921id));
        kg1Var.V();
    }

    public qv0(rv0 rv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f39984a = 1;
        this.f39985b = rv0Var;
        this.f39986c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f39985b;
        Runnable runnable = (Runnable) this.f39986c;
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
    public void b0() {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
