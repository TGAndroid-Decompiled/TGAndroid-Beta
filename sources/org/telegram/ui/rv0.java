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
public final class rv0 implements org.telegram.ui.Components.b5, GenericProvider, org.telegram.ui.ActionBar.a2, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, zv0, MessagesStorage.BooleanCallback, v11, OnSuccessListener, pa.a, OnFailureListener, t5.b, s5.e {
    public final int f37193a;
    public final Object f37194b;
    public final Object f37195c;

    public rv0(int i10, Object obj, Object obj2) {
        this.f37193a = i10;
        this.f37194b = obj;
        this.f37195c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        aw0 aw0Var = ((sv0) this.f37194b).f37487a;
        aw0Var.f31974e0.a((TLRPC.TL_messageMediaPoll) this.f37195c);
        aw0Var.finishFragment();
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        ke1 ke1Var = (ke1) this.f37194b;
        bo boVar = (bo) this.f37195c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = ke1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        ke1Var.G.messageOwner.media = messageMedia;
        boVar.getSendMessagesHelper().editMessage(ke1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f37194b;
        l5.i iVar = (l5.i) this.f37195c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f42846b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f13899c) {
                int size = aVar.f42846b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f42848a);
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
            long j10 = bVar.f42848a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.f42850c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.f42851a, fVar.f42852b);
                }
                listIterator.set(new s5.b(j10, bVar.f42849b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.V((ThemeActivity) this.f37194b, (Context) this.f37195c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final fc1 fc1Var = (fc1) this.f37194b;
        final hc1 hc1Var = (hc1) this.f37195c;
        ThemeActivity themeActivity = fc1Var.e;
        if (i10 >= 0 && i10 < hc1Var.e.size()) {
            final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) hc1Var.e.get(i10);
            if (g6Var.f18692a >= 100 && !g6Var.f18713z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = g6Var.f18706r;
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
                        fc1 fc1Var2 = fc1.this;
                        ThemeActivity themeActivity2 = fc1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.c5.W(themeActivity2, i12, g6Var2.f18693b, g6Var2);
                            } else if (i11 == 1) {
                                if (g6Var2.f18706r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(g6Var2.f18693b, g6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, g6Var2.f18693b, g6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + g6Var2.f18706r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.hq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new ae1(g6Var2.f18693b, g6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f18437a;
                                b2Var.R = string3;
                                b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new b7(fc1Var2, hc1Var, g6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19056p7, false));
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        boolean z11;
        switch (this.f37193a) {
            case 2:
                ((PrivacyControlActivity) this.f37194b).t0();
                ((SharedPreferences) this.f37195c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37194b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new bc0(14, privacySettingsActivity, (org.telegram.ui.Cells.w8) this.f37195c));
                return;
            case 4:
                ProfileActivity.c0((ProfileActivity) this.f37194b, (org.telegram.ui.Cells.z1[]) this.f37195c);
                return;
            case 5:
                h01 h01Var = (h01) this.f37194b;
                TLRPC.User user = (TLRPC.User) this.f37195c;
                h01Var.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                ProfileActivity profileActivity = h01Var.f34081b;
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
                rg.j0.Q((rg.j0) this.f37194b, (ArrayList) this.f37195c);
                return;
            case 8:
                q71 q71Var = (q71) this.f37194b;
                TLRPC.User user2 = (TLRPC.User) this.f37195c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    q71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(q71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f31591b0 = b7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 9:
                gb1.m((gb1) this.f37194b, (uy) this.f37195c);
                return;
            case 10:
                ThemeActivity.U((ThemeActivity) this.f37194b, (iy0) this.f37195c);
                return;
            case 13:
                fc1 fc1Var = (fc1) this.f37194b;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f37195c;
                fc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(h6Var.E);
                if (h6Var == org.telegram.ui.ActionBar.i6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(h6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.i6.H;
                if (h6Var.f18731b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.i6.I == h6Var) {
                        org.telegram.ui.ActionBar.i6.t(org.telegram.ui.ActionBar.i6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (h6Var == org.telegram.ui.ActionBar.i6.J) {
                        org.telegram.ui.ActionBar.i6.J = (org.telegram.ui.ActionBar.h6) hashMap.get("Dark Blue");
                    }
                    h6Var.t();
                    org.telegram.ui.ActionBar.i6.G.remove(h6Var);
                    hashMap.remove(h6Var.f18729a);
                    org.telegram.ui.ActionBar.b6 b6Var = h6Var.f18741i0;
                    if (b6Var != null) {
                        org.telegram.ui.ActionBar.b6.a(b6Var);
                    }
                    org.telegram.ui.ActionBar.i6.F.remove(h6Var);
                    new File(h6Var.f18731b).delete();
                    org.telegram.ui.ActionBar.i6.s1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(fc1Var.e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 17:
                gh1.W((gh1) this.f37194b, (byte[]) this.f37195c);
                return;
            case 18:
                ti1 ti1Var = (ti1) this.f37194b;
                ti1Var.getClass();
                ((boolean[]) this.f37195c)[0] = true;
                ti1Var.f37724p0 = 17;
                Intent intent = new Intent(ti1Var.f37696b, VoIPService.class);
                intent.putExtra("user_id", ti1Var.d.f18259id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ti1Var.f37693a);
                try {
                    ti1Var.f37696b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 20:
                ((e2.h) this.f37194b).accept(Boolean.TRUE);
                ((boolean[]) this.f37195c)[0] = true;
                b2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.f37194b, (HashSet) this.f37195c);
                return;
            case 22:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f37194b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(d1Var.M).getInputUser(d1Var.U);
                ConnectionsManager.getInstance(d1Var.M).sendRequest(allowsendmessage, new ai.t5(d1Var, (String[]) this.f37195c, b2Var, 15));
                return;
            case 23:
                boolean[] zArr2 = (boolean[]) this.f37194b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f37195c;
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
        switch (this.f37193a) {
            case 26:
                Iterable iterable = (Iterable) this.f37195c;
                s5.g gVar = (s5.g) ((s5.d) ((da.b) this.f37194b).f7578c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.b bVar = (da.b) this.f37194b;
                for (Map.Entry entry : ((HashMap) this.f37195c).entrySet()) {
                    ((s5.g) ((s5.c) bVar.f7581i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void j(pa.b bVar) {
        ((pa.a) this.f37194b).j(bVar);
        ((pa.a) this.f37195c).j(bVar);
    }

    @Override
    public void onFailure(Exception exc) {
        qg.a2 a2Var = (qg.a2) this.f37194b;
        Bitmap bitmap = (Bitmap) this.f37195c;
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
        FileLog.d("wear-auth: /token delivered to " + ((String) ((cf.c) this.f37194b).d));
        ((ci.d) this.f37195c).setLoading(false);
        kj1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = kj1.f35180c;
        if (f3Var != null) {
            f3Var.dismiss();
            kj1.f35180c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        hx0 hx0Var = (hx0) this.f37195c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ix0) this.f37194b).d.f34997n;
        premiumPreviewFragment.f31171n0.d(0, 0.0f, 0, hx0Var.getMeasuredWidth(), -hx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f31171n0.f42556f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f37195c;
        dg1 dg1Var = ((nf1) this.f37194b).f35971b;
        NotificationCenter notificationCenter = dg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(dg1Var, i10);
        dg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        dg1Var.finishFragment();
        dg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f18112id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(tk0 tk0Var) {
        jg1 jg1Var = ((gg1) this.f37194b).f33901a;
        jg1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f37195c).f18164id));
        jg1Var.V();
    }

    public rv0(sv0 sv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f37193a = 0;
        this.f37194b = sv0Var;
        this.f37195c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f37194b;
        Runnable runnable = (Runnable) this.f37195c;
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
