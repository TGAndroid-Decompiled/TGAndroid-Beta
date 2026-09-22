package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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
import java.util.Map;
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
public final class rv0 implements org.telegram.ui.Components.c5, GenericProvider, org.telegram.ui.ActionBar.a2, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.nl0, org.telegram.ui.Components.ol0, zv0, MessagesStorage.BooleanCallback, v11, OnSuccessListener, pa.a, OnFailureListener, t5.b {
    public final int f37256a;
    public final Object f37257b;
    public final Object f37258c;

    public rv0(int i10, Object obj, Object obj2) {
        this.f37256a = i10;
        this.f37257b = obj;
        this.f37258c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f37256a) {
            case 0:
                aw0 aw0Var = ((sv0) this.f37257b).f37583a;
                aw0Var.f32203e0.a((TLRPC.TL_messageMediaToDo) this.f37258c);
                aw0Var.finishFragment();
                return;
            default:
                aw0 aw0Var2 = ((sv0) this.f37257b).f37583a;
                aw0Var2.f32203e0.a((TLRPC.TL_messageMediaPoll) this.f37258c);
                aw0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        me1 me1Var = (me1) this.f37257b;
        zn znVar = (zn) this.f37258c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = me1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        me1Var.G.messageOwner.media = messageMedia;
        znVar.getSendMessagesHelper().editMessage(me1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f37257b, (Context) this.f37258c, view, i10, f7);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final hc1 hc1Var = (hc1) this.f37257b;
        final jc1 jc1Var = (jc1) this.f37258c;
        ThemeActivity themeActivity = hc1Var.e;
        if (i10 >= 0 && i10 < jc1Var.e.size()) {
            final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) jc1Var.e.get(i10);
            if (h6Var.f18942a >= 100 && !h6Var.f18963z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = h6Var.f18956r;
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
                                org.telegram.ui.Components.d5.W(themeActivity2, i12, h6Var2.f18943b, h6Var2);
                            } else if (i11 == 1) {
                                if (h6Var2.f18956r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(h6Var2.f18943b, h6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var2.f18943b, h6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + h6Var2.f18956r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.wq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new ce1(h6Var2.f18943b, h6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f18669a;
                                b2Var.R = string3;
                                b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new b7(hc1Var2, jc1Var, h6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19330p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public Object g() {
        switch (this.f37256a) {
            case 27:
                Iterable iterable = (Iterable) this.f37258c;
                s5.h hVar = (s5.h) ((s5.d) ((da.b) this.f37257b).f7582c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.h.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.b bVar = (da.b) this.f37257b;
                for (Map.Entry entry : ((HashMap) this.f37258c).entrySet()) {
                    ((s5.h) ((s5.c) bVar.f7585i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void h(pa.b bVar) {
        ((pa.a) this.f37257b).h(bVar);
        ((pa.a) this.f37258c).h(bVar);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        boolean z11;
        switch (this.f37256a) {
            case 3:
                ((PrivacyControlActivity) this.f37257b).t0();
                ((SharedPreferences) this.f37258c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37257b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new dc0(14, privacySettingsActivity, (org.telegram.ui.Cells.x8) this.f37258c));
                return;
            case 5:
                ProfileActivity.c0((ProfileActivity) this.f37257b, (org.telegram.ui.Cells.a2[]) this.f37258c);
                return;
            case 6:
                h01 h01Var = (h01) this.f37257b;
                TLRPC.User user = (TLRPC.User) this.f37258c;
                h01Var.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                ProfileActivity profileActivity = h01Var.f34055b;
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
                rg.j0.Q((rg.j0) this.f37257b, (ArrayList) this.f37258c);
                return;
            case 9:
                t71 t71Var = (t71) this.f37257b;
                TLRPC.User user2 = (TLRPC.User) this.f37258c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    t71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(t71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f31896b0 = b7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 10:
                jb1.m((jb1) this.f37257b, (uy) this.f37258c);
                return;
            case 11:
                ThemeActivity.X((ThemeActivity) this.f37257b, (w81) this.f37258c);
                return;
            case 14:
                hc1 hc1Var = (hc1) this.f37257b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f37258c;
                hc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(i6Var.E);
                if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(i6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.j6.H;
                if (i6Var.f18990b == null) {
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
                    hashMap.remove(i6Var.f18988a);
                    org.telegram.ui.ActionBar.b6 b6Var = i6Var.f19000i0;
                    if (b6Var != null) {
                        org.telegram.ui.ActionBar.b6.a(b6Var);
                    }
                    org.telegram.ui.ActionBar.j6.F.remove(i6Var);
                    new File(i6Var.f18990b).delete();
                    org.telegram.ui.ActionBar.j6.s1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(hc1Var.e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 18:
                ih1.W((ih1) this.f37257b, (byte[]) this.f37258c);
                return;
            case 19:
                ti1 ti1Var = (ti1) this.f37257b;
                ti1Var.getClass();
                ((boolean[]) this.f37258c)[0] = true;
                ti1Var.f37823p0 = 17;
                Intent intent = new Intent(ti1Var.f37795b, VoIPService.class);
                intent.putExtra("user_id", ti1Var.d.f18490id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ti1Var.f37792a);
                try {
                    ti1Var.f37795b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 21:
                ((e2.h) this.f37257b).accept(Boolean.TRUE);
                ((boolean[]) this.f37258c)[0] = true;
                b2Var.dismiss();
                return;
            case 22:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.f37257b, (HashSet) this.f37258c);
                return;
            case 23:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f37257b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(d1Var.M).getInputUser(d1Var.U);
                ConnectionsManager.getInstance(d1Var.M).sendRequest(allowsendmessage, new ai.t5(d1Var, (String[]) this.f37258c, b2Var, 15));
                return;
            case 24:
                boolean[] zArr2 = (boolean[]) this.f37257b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f37258c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.y1 y1Var = (qg.y1) this.f37257b;
        Bitmap bitmap = (Bitmap) this.f37258c;
        y1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && y1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(12, y1Var, bitmap), 2000L);
        } else {
            y1Var.C0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((cf.c) this.f37257b).d));
        ((ci.d) this.f37258c).setLoading(false);
        kj1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = kj1.f35222c;
        if (f3Var != null) {
            f3Var.dismiss();
            kj1.f35222c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        hx0 hx0Var = (hx0) this.f37258c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((ix0) this.f37257b).d.f35026n;
        premiumPreviewFragment.f31477n0.d(0, 0.0f, 0, hx0Var.getMeasuredWidth(), -hx0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f31477n0.f42875f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f37258c;
        fg1 fg1Var = ((pf1) this.f37257b).f36585b;
        NotificationCenter notificationCenter = fg1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(fg1Var, i10);
        fg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        fg1Var.finishFragment();
        fg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f18343id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(wk0 wk0Var) {
        lg1 lg1Var = ((ig1) this.f37257b).f34582a;
        lg1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f37258c).f18395id));
        lg1Var.V();
    }

    public rv0(sv0 sv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f37256a = 1;
        this.f37257b = sv0Var;
        this.f37258c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f37257b;
        Runnable runnable = (Runnable) this.f37258c;
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
    public void q0(View view, float f7, float f10) {
    }
}
