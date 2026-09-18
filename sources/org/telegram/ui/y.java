package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y implements Utilities.Callback {
    public final int f39649a;
    public final Object f39650b;
    public final Object f39651c;
    public final Object d;

    public y(Object obj, Object obj2, Object obj3, int i10) {
        this.f39649a = i10;
        this.f39650b = obj;
        this.f39651c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        int dp;
        int dp2;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i12 = this.f39649a;
        String str = null;
        int i13 = 0;
        boolean z12 = true;
        Object obj2 = this.d;
        Object obj3 = this.f39651c;
        Object obj4 = this.f39650b;
        switch (i12) {
            case 0:
                h4 h4Var = (h4) obj4;
                l3 l3Var = (l3) obj3;
                Activity activity = (Activity) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && l3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i14 = 0;
                    for (int i15 = 0; i15 < uRLSpanArr.length; i15++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i14 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i14);
                    }
                    h4Var.f34062h0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length > 0 && length == 0 && i14 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = nf.f.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        l3Var.getWebView().loadUrl(str2);
                        return;
                    }
                    org.telegram.ui.web.k.b(activity, str2);
                    org.telegram.ui.web.z0 webView = l3Var.getWebView();
                    String str3 = org.telegram.ui.web.o1.a().f39002b;
                    if (str3 != null) {
                        StringBuilder u10 = a4.a.u(str3);
                        u10.append(URLEncoder.encode(str2));
                        str = u10.toString();
                    }
                    webView.loadUrl(str);
                    return;
                }
                return;
            case 1:
                h4 h4Var2 = (h4) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(h4Var2.X).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(h4Var2.X).addWebBrowserException(str5, true);
                }
                if (!bool.booleanValue()) {
                    h4Var2.c0();
                    return;
                } else {
                    LaunchActivity.I1 = new a0(h4Var2, 8);
                    return;
                }
            case 2:
                zn.J0((zn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                return;
            case 3:
                zn znVar = (zn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l4 = (Long) obj;
                if (groupedMessages != null) {
                    znVar.getClass();
                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                        if (!znVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i16), false, l4.longValue())) {
                            z12 = false;
                        }
                    }
                    if (z12 && znVar.R3 == 0) {
                        znVar.O9(false);
                        return;
                    }
                    return;
                } else if (znVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l4.longValue())) {
                    znVar.Wc(false);
                    if (znVar.R3 == 0) {
                        znVar.O9(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                ln lnVar = (ln) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                xm xmVar = (xm) obj2;
                if (((Boolean) obj).booleanValue()) {
                    zn znVar2 = lnVar.f35408a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    of ofVar = new of(5, lnVar, messageObject2);
                    int i17 = r91.f36997d0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(znVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(znVar2.getContext(), znVar2.getResourceProvider());
                        org.telegram.ui.Components.lj0 lj0Var = ybVar.f30529a;
                        lj0Var.setScaleX(1.25f);
                        lj0Var.setScaleY(1.25f);
                        if (diceValue == 1) {
                            lj0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            lj0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            lj0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            lj0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            lj0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            lj0Var.setImageResource(R.drawable.dice6);
                        } else {
                            lj0Var.setScaleX(0.8f);
                            lj0Var.setScaleY(0.8f);
                            lj0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) yh.v7.M0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.ad.b(LocaleController.getString(R.string.StakeDiceToastChange), new x81(1, znVar2, ofVar), znVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(ybVar.f30530b);
                        org.telegram.ui.Components.l90 l90Var = new org.telegram.ui.Components.l90(znVar2.getContext(), null);
                        ybVar.f30530b = l90Var;
                        l90Var.setSingleLine();
                        ybVar.f30530b.setTypeface(Typeface.SANS_SERIF);
                        ybVar.f30530b.setTextSize(1, 15.0f);
                        ybVar.f30530b.setEllipsize(TextUtils.TruncateAt.END);
                        ybVar.f30530b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        ybVar.addView(ybVar.f30530b, w7.y5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        ybVar.f30530b.setText(yh.v7.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        ybVar.f30530b.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, znVar2.getResourceProvider()));
                        ybVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, znVar2.getResourceProvider()));
                        ybVar.f30530b.setSingleLine(false);
                        ybVar.f30530b.setMaxLines(2);
                        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(znVar2.getContext(), znVar2.getResourceProvider(), true);
                        ocVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        ocVar.f26906a = new ai.j(ofVar, j3, 27);
                        ybVar.setButton(ocVar);
                        org.telegram.ui.Components.xc.a0(znVar2).b(ybVar, 2750).j();
                        return;
                    }
                    return;
                }
                xmVar.run();
                return;
            case 5:
                ln lnVar2 = (ln) obj4;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.b2) obj3).c(200L);
                zn znVar3 = lnVar2.f35408a;
                if (znVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(znVar3.getMessagesController().verifyAgeBotUsername)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(znVar3.getParentActivity());
                if (z13) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(znVar3.getParentActivity(), 1, znVar3.getResourceProvider());
                    a2Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    a2Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        dp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        dp2 = AndroidUtilities.dp(16.0f);
                    }
                    a2Var.setPadding(dp, 0, dp2, 0);
                    frameLayout.addView(a2Var, w7.y5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    a2Var.setOnClickListener(new n8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar3.getParentActivity(), 0, znVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                b2Var.R = string;
                if (z11) {
                    i10 = R.string.MessageShowSensitiveContentMediaTextClosed;
                } else {
                    i10 = R.string.MessageShowSensitiveContentMediaText;
                }
                b2Var.T = LocaleController.getString(i10);
                alertDialog$Builder.n(frameLayout);
                b2Var.G = 9;
                if (z11) {
                    i11 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                } else {
                    i11 = R.string.Cancel;
                }
                alertDialog$Builder.h(LocaleController.getString(i11), null);
                if (!z11) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.bk(lnVar2, u1Var, zArr, z13, contentsettings));
                }
                znVar3.showDialog(b2Var);
                return;
            case 6:
                uy uyVar = (uy) obj4;
                Long l10 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) obj3).q(150L);
                Boolean bool2 = uyVar.G.bot_participant;
                if (bool2 != null && bool2.booleanValue()) {
                    uyVar.getMessagesController().addUserToChat(l10.longValue(), uyVar.getMessagesController().getUser(Long.valueOf(uyVar.H)), 0, null, uyVar, false, runnable, new mf(3, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 7:
                n11 n11Var = (n11) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = g71.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = g71.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = q11.f36656s;
                        FileLog.e("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        return;
                    }
                    hashMap.put(num, k10);
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ImageReceiver imageReceiver = new ImageReceiver();
                    n11Var.e.add(imageReceiver);
                    imageReceiver.setDelegate(new o11(new Runnable[]{new cy0(17, n11Var, imageReceiver)}));
                    imageReceiver.setImage(ImageLocation.getForDocument((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.onAttachedToWindow();
                    hashMap2.put(num2, imageReceiver);
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    Integer num3 = (Integer) arrayList2.get(i18);
                    num3.getClass();
                    n11Var.d.add((p11) hashMap2.get(num3));
                }
                n11Var.f35802g[0] = true;
                n11Var.a();
                return;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i19 = ((g71) obj4).V;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String i20 = t8.b.i(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i21 = 0; i21 < stickerSets.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i21);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.f18323id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(i20)) {
                                arrayList3.add(new d71(translitSafe2));
                                arrayList3.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f18323id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i13 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i13);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18323id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(i20)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    if (stickerSet3 != null) {
                                        arrayList = stickerSet3.documents;
                                    } else {
                                        arrayList = null;
                                    }
                                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                } else {
                                    arrayList = stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList3.add(new d71(stickerSetCovered.set.title));
                                    arrayList3.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.f18323id));
                                }
                            }
                        }
                        i13++;
                    }
                }
                runnable2.run();
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                Runnable runnable3 = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.q5.h(((g71) obj4).V).f(arrayList4);
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj5 = arrayList4.get(i13);
                    i13++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).f18302id));
                }
                runnable3.run();
                return;
        }
    }
}
