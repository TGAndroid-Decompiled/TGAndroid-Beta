package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tm implements Utilities.Callback {
    public final int f42727a;
    public final Object f42728b;
    public final Object f42729c;

    public tm(int i10, Object obj, Object obj2) {
        this.f42727a = i10;
        this.f42728b = obj;
        this.f42729c = obj2;
    }

    @Override
    public final void run(Object obj) {
        MessageObject threadMessage;
        boolean z10;
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f9;
        int[] iArr;
        int i10;
        TLRPC.Document document;
        int i11 = this.f42727a;
        float f10 = -0.04f;
        float f11 = 0.25f;
        SendMessageChatArguments sendMessageChatArguments = null;
        int i12 = 0;
        Object obj2 = this.f42729c;
        Object obj3 = this.f42728b;
        switch (i11) {
            case 0:
                MessageObject messageObject = (MessageObject) obj2;
                Long l10 = (Long) obj;
                tn tnVar = ((fn) obj3).f38212a;
                if (tnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageObject.getDiceEmoji(), tnVar.P5, tnVar.f42856j5, tnVar.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = tnVar.C8();
                    of2.dice_stake = l10.longValue();
                    tnVar.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                tn tnVar2 = ((fn) obj3).f38212a;
                if (((Boolean) obj).booleanValue()) {
                    while (i12 < tnVar2.f42973t0.getChildCount()) {
                        View childAt = tnVar2.f42973t0.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().isSensitive()) {
                                s1Var2.h4();
                            }
                        }
                        i12++;
                    }
                    return;
                }
                if (s1Var.getMessageObject() != null) {
                    s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                s1Var.h4();
                return;
            case 2:
                fn fnVar = (fn) obj3;
                tm tmVar = (tm) obj2;
                tn tnVar3 = fnVar.f38212a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.tc.a0(tnVar3).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                tnVar3.getMessagesController().setContentSettings(true);
                org.telegram.ui.Components.tc.a0(tnVar3).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new pm(fnVar, 8)), true)).k(true);
                tmVar.run(Boolean.TRUE);
                return;
            case 3:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((fn) obj3).f38212a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f22413id, (String) obj);
                return;
            case 4:
                wn wnVar = (wn) obj3;
                wnVar.f44333f.t(((of.a) obj).f19547b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = wnVar.f44330b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 5:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.hf) obj3).f29173a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject2 = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((String) obj2, j10, messageObject2, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                tn tnVar4 = chatActivityEnterView.K2;
                if (tnVar4 != null) {
                    sendMessageChatArguments = tnVar4.C8();
                }
                of3.sendMessageChatArguments = sendMessageChatArguments;
                of3.effect_id = chatActivityEnterView.N4;
                of3.payStars = l11.longValue();
                of3.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of3.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.f26137i0.c();
                org.telegram.ui.Components.re reVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                reVar.setEffect(0L);
                return;
            case 6:
                org.telegram.ui.Components.ni niVar = (org.telegram.ui.Components.ni) obj3;
                ((tn) obj2).f42768c5 = (MessageSuggestionParams) obj;
                boolean G1 = niVar.G1(0, true, 0, niVar.s1(), niVar.J0);
                org.telegram.ui.Components.ff ffVar = niVar.f30997d0;
                if (ffVar != null) {
                    ffVar.h(!G1);
                    niVar.f30997d0 = null;
                    return;
                }
                return;
            case 7:
                ((ph.n3) obj3).getWebViewContainer().C((String) obj2, (String) obj, false);
                return;
            case 8:
                org.telegram.ui.Components.bl blVar = ((org.telegram.ui.Components.yk) obj3).f35086b;
                blVar.f27173t0.d(((org.telegram.ui.Components.al) obj2).f26799c, blVar.f27174u0, true, 0, ((Long) obj).longValue());
                blVar.f28403b.dismiss(true);
                return;
            case 9:
                org.telegram.ui.Components.gv gvVar = (org.telegram.ui.Components.gv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fv(gvVar, 1));
                    return;
                }
                return;
            case 10:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.gt gtVar = (org.telegram.ui.Components.gt) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                gtVar.run();
                return;
            case 11:
                org.telegram.ui.Components.dy dyVar = (org.telegram.ui.Components.dy) obj3;
                org.telegram.ui.Components.ey eyVar = dyVar.f27885a;
                org.telegram.ui.Components.fz fzVar = eyVar.B;
                MediaDataController mediaDataController = MediaDataController.getInstance(fzVar.Y0);
                String[] strArr = fzVar.S0;
                String str = eyVar.v;
                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(25, dyVar, (Runnable) obj, (String) obj2);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(fzVar.Y0).isPremium()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str, false, aVar, null, z10, false, true, 25);
                return;
            case 12:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ey eyVar2 = ((org.telegram.ui.Components.dy) obj3).f27885a;
                if (ConnectionsManager.getInstance(eyVar2.B.Y0).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    org.telegram.ui.Components.ey.E(eyVar2, runnable, arrayList2, false);
                    return;
                }
            case 13:
                org.telegram.ui.Components.yy yyVar = (org.telegram.ui.Components.yy) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj4 = arrayList3.get(i12);
                    i12++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(yyVar.f35157w.M.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        yyVar.f35154n.add(new org.telegram.ui.Components.wx(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 14:
                org.telegram.ui.Components.y00 y00Var = (org.telegram.ui.Components.y00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (y00Var.W == null && !(y00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.mc M = org.telegram.ui.Components.tc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, y00Var.f34865b0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f30652j = 5000;
                    M.j();
                    return;
                }
                org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(o2Var);
                int i13 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, y00Var.f34865b0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", y00Var.f34867d0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                org.telegram.ui.Components.mc M2 = a02.M(replaceTags, formatPluralString, i13);
                M2.f30652j = 5000;
                M2.j();
                return;
            case 15:
                View view2 = (View) obj3;
                org.telegram.ui.Components.d dVar = (org.telegram.ui.Components.d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                    view2.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((iArr[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view2.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view2.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f11 = 0.04f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                float f12 = -0.07f;
                if (!org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f9 = 2.0f;
                } else {
                    f9 = 3.0f;
                }
                colorMatrix2.setSaturation(f9);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f12 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 16:
                MessagesController messagesController = (MessagesController) obj3;
                org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) obj2;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.tc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.md(2, U)), true)).k(true);
                    }
                    zq0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    org.telegram.ui.Components.tc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 17:
                org.telegram.ui.Components.qu0.j((org.telegram.ui.Components.qu0) obj3, (TL_stories.StoryItem) obj2, (lh.l6) obj);
                return;
            case 18:
                ht htVar = (ht) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                Long l12 = (Long) obj;
                htVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                o2Var2.presentFragment(new ProfileActivity(bundle, null));
                htVar.p();
                return;
            case 19:
                dt dtVar = (dt) obj3;
                Boolean bool = (Boolean) obj;
                dtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    dtVar.f37629a.p();
                    return;
                }
                return;
            case 20:
                fy fyVar = (fy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    fyVar.showDialog(new nj0(activity, !org.telegram.ui.Components.yd0.c(), new tv(activity, 0)));
                    return;
                }
                return;
            case 21:
                wo0 wo0Var = (wo0) obj2;
                Integer num = (Integer) obj;
                p00 p00Var = ((m00) obj3).f40336e;
                if (!p00Var.getUserConfig().isPremium()) {
                    p00Var.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) p00Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                p00Var.A = intValue;
                wo0Var.a(intValue, true);
                d00 d00Var = p00Var.E;
                if (d00Var != null) {
                    if (!p00Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = p00Var.A;
                    }
                    d00Var.d(i10, true);
                }
                p00Var.i0(true);
                return;
            case 22:
                a50 a50Var = (a50) obj3;
                cg.h0 h0Var = (cg.h0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (h0Var != null) {
                    a50Var.getClass();
                    h0Var.setVisibility(0);
                }
                a50Var.f36430c = bitmap2;
                Paint paint = new Paint(1);
                a50Var.d = paint;
                Bitmap bitmap3 = a50Var.f36430c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                a50Var.f36431e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, f11);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = -0.02f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, f10);
                a50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 23:
                mb0 mb0Var = (mb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                mb0Var.a();
                if (user != null) {
                    long j11 = userArr[0].f22539id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f22539id);
                    mb0Var.n(new lb0(bundle2, user, userArr, j11), false);
                    return;
                }
                return;
            case 24:
                zi0 zi0Var = (zi0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = zi0Var.f45238b0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f22539id)) && zi0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.f22539id));
                        }
                    }
                }
                Boolean bool2 = zi0Var.f45249n0;
                if (bool2 != null && bool2.booleanValue()) {
                    tm tmVar2 = new tm(25, zi0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str2 != null && !str2.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f22438q = str2;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new bg.h3(2, messagesController2, tmVar2));
                    } else {
                        AndroidUtilities.runOnUIThread(new cg.m2(tmVar2, 9));
                    }
                    zi0Var.f45245i0 = i12;
                    return;
                }
                zi0Var.U(true, true);
                return;
            case 25:
                zi0 zi0Var2 = (zi0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f22539id)) && zi0Var2.R(user3)) {
                            zi0Var2.f45238b0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f22539id));
                        }
                    }
                }
                zi0Var2.U(true, true);
                return;
            case 26:
                kj0 kj0Var = (kj0) obj3;
                String str3 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    kj0Var.N.setImageDrawable(null);
                    kj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new lf0(4, kj0Var, str3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = kj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(kj0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23383v6), PorterDuff.Mode.SRC_IN));
                    kj0Var.N.setImageDrawable(mutate);
                    if (user4.contact) {
                        kj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new lf0(5, kj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        kj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                kj0Var.w(false);
                return;
            case 27:
                ArrayList arrayList6 = (ArrayList) obj3;
                org.telegram.ui.Components.t9[] t9VarArr = (org.telegram.ui.Components.t9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        String str4 = (String) arrayList6.get(i14);
                        int i15 = 0;
                        while (true) {
                            if (i15 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i15).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i15).emoticon, str4)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i15).documents.get(0).longValue();
                                    for (int i16 = 0; i16 < tL_messages_stickerSet.documents.size(); i16++) {
                                        if (tL_messages_stickerSet.documents.get(i16).f22398id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i16);
                                        }
                                    }
                                } else {
                                    i15++;
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            t9VarArr[i14].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str4), null);
                        }
                    }
                    return;
                }
                return;
            case 28:
                ((String[]) obj3)[0] = (String) obj;
                ((nk0) obj2).run();
                return;
            default:
                yo0 yo0Var = (yo0) obj3;
                yo0Var.f44946n = false;
                ((to0) obj2).f43076f.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    yo0Var.v0();
                    yo0Var.finishFragment();
                    yo0Var.y0();
                    return;
                }
                return;
        }
    }
}
