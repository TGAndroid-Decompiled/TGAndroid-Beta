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
    public final int f39742a;
    public final Object f39743b;
    public final Object f39744c;
    public final Object d;

    public y(Object obj, Object obj2, Object obj3, int i10) {
        this.f39742a = i10;
        this.f39743b = obj;
        this.f39744c = obj2;
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
        int i12 = this.f39742a;
        String str = null;
        int i13 = 0;
        boolean z12 = true;
        Object obj2 = this.d;
        Object obj3 = this.f39744c;
        Object obj4 = this.f39743b;
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
                    h4Var.f34161h0.k(false);
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
                    String str3 = org.telegram.ui.web.o1.a().f38895b;
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
                bo.d1((bo) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                return;
            case 3:
                bo boVar = (bo) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l4 = (Long) obj;
                if (groupedMessages != null) {
                    boVar.getClass();
                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                        if (!boVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i16), false, l4.longValue())) {
                            z12 = false;
                        }
                    }
                    if (z12 && boVar.R3 == 0) {
                        boVar.O9(false);
                        return;
                    }
                    return;
                } else if (boVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l4.longValue())) {
                    boVar.Wc(false);
                    if (boVar.R3 == 0) {
                        boVar.O9(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                nn nnVar = (nn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                zm zmVar = (zm) obj2;
                if (((Boolean) obj).booleanValue()) {
                    bo boVar2 = nnVar.f36139a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    pf pfVar = new pf(5, nnVar, messageObject2);
                    int i17 = s91.f37430d0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(boVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(boVar2.getContext(), boVar2.getResourceProvider());
                        org.telegram.ui.Components.bj0 bj0Var = wbVar.f29625a;
                        bj0Var.setScaleX(1.25f);
                        bj0Var.setScaleY(1.25f);
                        if (diceValue == 1) {
                            bj0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            bj0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            bj0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            bj0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            bj0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            bj0Var.setImageResource(R.drawable.dice6);
                        } else {
                            bj0Var.setScaleX(0.8f);
                            bj0Var.setScaleY(0.8f);
                            bj0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) yh.y7.M0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.yc.b(LocaleController.getString(R.string.StakeDiceToastChange), new ky0(27, boVar2, pfVar), boVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(wbVar.f29626b);
                        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(boVar2.getContext(), null);
                        wbVar.f29626b = c90Var;
                        c90Var.setSingleLine();
                        wbVar.f29626b.setTypeface(Typeface.SANS_SERIF);
                        wbVar.f29626b.setTextSize(1, 15.0f);
                        wbVar.f29626b.setEllipsize(TextUtils.TruncateAt.END);
                        wbVar.f29626b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        wbVar.addView(wbVar.f29626b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        wbVar.f29626b.setText(yh.y7.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        wbVar.f29626b.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, boVar2.getResourceProvider()));
                        wbVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, boVar2.getResourceProvider()));
                        wbVar.f29626b.setSingleLine(false);
                        wbVar.f29626b.setMaxLines(2);
                        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(boVar2.getContext(), boVar2.getResourceProvider(), true);
                        mcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        mcVar.f26125a = new ai.j(pfVar, j3, 27);
                        wbVar.setButton(mcVar);
                        org.telegram.ui.Components.vc.a0(boVar2).b(wbVar, 2750).j();
                        return;
                    }
                    return;
                }
                zmVar.run();
                return;
            case 5:
                nn nnVar2 = (nn) obj4;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).c(200L);
                bo boVar3 = nnVar2.f36139a;
                if (boVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(boVar3.getMessagesController().verifyAgeBotUsername)) {
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
                FrameLayout frameLayout = new FrameLayout(boVar3.getParentActivity());
                if (z13) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(boVar3.getParentActivity(), 1, boVar3.getResourceProvider());
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
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
                    z1Var.setPadding(dp, 0, dp2, 0);
                    frameLayout.addView(z1Var, w7.x5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    z1Var.setOnClickListener(new o8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar3.getParentActivity(), 0, boVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.R = string;
                if (z11) {
                    i10 = R.string.MessageShowSensitiveContentMediaTextClosed;
                } else {
                    i10 = R.string.MessageShowSensitiveContentMediaText;
                }
                c2Var.T = LocaleController.getString(i10);
                alertDialog$Builder.n(frameLayout);
                c2Var.G = 9;
                if (z11) {
                    i11 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                } else {
                    i11 = R.string.Cancel;
                }
                alertDialog$Builder.h(LocaleController.getString(i11), null);
                if (!z11) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.bk(nnVar2, t1Var, zArr, z13, contentsettings));
                }
                boVar3.showDialog(c2Var);
                return;
            case 6:
                wy wyVar = (wy) obj4;
                Long l10 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) obj3).q(150L);
                Boolean bool2 = wyVar.G.bot_participant;
                if (bool2 != null && bool2.booleanValue()) {
                    wyVar.getMessagesController().addUserToChat(l10.longValue(), wyVar.getMessagesController().getUser(Long.valueOf(wyVar.H)), 0, null, wyVar, false, runnable, new nf(3, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 7:
                p11 p11Var = (p11) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = i71.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = i71.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = s11.f37365s;
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
                    p11Var.e.add(imageReceiver);
                    imageReceiver.setDelegate(new q11(new Runnable[]{new ky0(13, p11Var, imageReceiver)}));
                    imageReceiver.setImage(ImageLocation.getForDocument((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.onAttachedToWindow();
                    hashMap2.put(num2, imageReceiver);
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    Integer num3 = (Integer) arrayList2.get(i18);
                    num3.getClass();
                    p11Var.d.add((r11) hashMap2.get(num3));
                }
                p11Var.f36494g[0] = true;
                p11Var.a();
                return;
            case 8:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i19 = ((i71) obj4).V;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String i20 = org.telegram.ui.Cells.p6.i(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i21 = 0; i21 < stickerSets.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i21);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.f18148id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(i20)) {
                                arrayList3.add(new f71(translitSafe2));
                                arrayList3.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f18148id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i13 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i13);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18148id))) {
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
                                    arrayList3.add(new f71(stickerSetCovered.set.title));
                                    arrayList3.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.f18148id));
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
                org.telegram.ui.Components.o5.h(((i71) obj4).V).f(arrayList4);
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj5 = arrayList4.get(i13);
                    i13++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).f18127id));
                }
                runnable3.run();
                return;
        }
    }
}
