package org.telegram.ui;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
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
    public final int f44208a;
    public final Object f44209b;
    public final Object f44210c;
    public final Object d;

    public y(Object obj, Object obj2, Object obj3, int i10) {
        this.f44208a = i10;
        this.f44209b = obj;
        this.f44210c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        Intent intent;
        boolean z10;
        String country;
        BufferedReader bufferedReader;
        boolean z11;
        boolean z12;
        int dp;
        int dp2;
        int i10;
        int i11;
        TLRPC.User user;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        String str = null;
        boolean z13 = true;
        int i12 = 0;
        switch (this.f44208a) {
            case 0:
                h4 h4Var = (h4) this.f44209b;
                l3 l3Var = (l3) this.f44210c;
                Activity activity = (Activity) this.d;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && l3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i13 = 0;
                    for (int i14 = 0; i14 < uRLSpanArr.length; i14++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i14]), length);
                        i13 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i14]), i13);
                    }
                    h4Var.f38273h0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length > 0 && length == 0 && i13 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = of.f.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        l3Var.getWebView().loadUrl(str2);
                        return;
                    }
                    org.telegram.ui.web.k.b(activity, str2);
                    org.telegram.ui.web.y0 webView = l3Var.getWebView();
                    String str3 = org.telegram.ui.web.n1.a().f43597b;
                    if (str3 != null) {
                        StringBuilder v = a1.g.v(str3);
                        v.append(URLEncoder.encode(str2));
                        str = v.toString();
                    }
                    webView.loadUrl(str);
                    return;
                }
                return;
            case 1:
                h4 h4Var2 = (h4) this.f44209b;
                String str4 = (String) this.f44210c;
                String str5 = (String) this.d;
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
                zn znVar = (zn) this.f44209b;
                TLRPC.User user2 = (TLRPC.User) this.f44210c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (znVar.getParentActivity() != null) {
                    if (bool2.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    if (user2 != null) {
                        intent.putExtra("name", ContactsController.formatName(user2.first_name, user2.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (!str6.startsWith("+")) {
                        TLRPC.User currentUser = znVar.getUserConfig().getCurrentUser();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                ?? obj2 = new Object();
                                obj2.f42259a = split[2];
                                String str7 = split[0];
                                obj2.f42261c = str7;
                                obj2.d = split[1];
                                List list = (List) hashMap.get(str7);
                                if (list == null) {
                                    String str8 = split[0];
                                    ArrayList arrayList3 = new ArrayList();
                                    hashMap.put(str8, arrayList3);
                                    list = arrayList3;
                                }
                                list.add(obj2);
                            } else {
                                bufferedReader.close();
                                String str9 = currentUser.phone;
                                int i15 = 4;
                                while (true) {
                                    if (i15 >= 1) {
                                        List list2 = (List) hashMap.get(str9.substring(0, i15));
                                        if (list2 != null && list2.size() > 0) {
                                            String str10 = ((tt) list2.get(0)).f42261c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a1.g.q("+", str10, str6);
                                            z10 = true;
                                        } else {
                                            i15--;
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                }
                                if (!z10) {
                                    Context context = ApplicationLoader.applicationContext;
                                    if (context != null) {
                                        country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                                    } else {
                                        country = Locale.getDefault().getCountry();
                                    }
                                    if (country.endsWith("0") && str6.startsWith("0")) {
                                        str6 = str6.substring(1);
                                    }
                                    str6 = a1.g.q("+", country, str6);
                                }
                            }
                        }
                    }
                    contentValues.put("data1", str6);
                    contentValues.put("data2", (Integer) 2);
                    arrayList2.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList2);
                    znVar.getParentActivity().startActivity(intent);
                    return;
                }
                return;
            case 3:
                zn znVar2 = (zn) this.f44209b;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f44210c;
                MessageObject messageObject = (MessageObject) this.d;
                Long l4 = (Long) obj;
                if (groupedMessages != null) {
                    znVar2.getClass();
                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                        if (!znVar2.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i16), false, l4.longValue())) {
                            z13 = false;
                        }
                    }
                    if (z13 && znVar2.R3 == 0) {
                        znVar2.T9(false);
                        return;
                    }
                    return;
                } else if (znVar2.getSendMessagesHelper().retrySendMessage(messageObject, false, l4.longValue())) {
                    znVar2.ad(false);
                    if (znVar2.R3 == 0) {
                        znVar2.T9(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                Boolean bool3 = (Boolean) obj;
                zn.s1((zn) this.f44209b, (TLRPC.User) this.f44210c, (TLRPC.TL_attachMenuBot) this.d);
                return;
            case 5:
                ln lnVar = (ln) this.f44209b;
                MessageObject messageObject2 = (MessageObject) this.f44210c;
                xm xmVar = (xm) this.d;
                if (((Boolean) obj).booleanValue()) {
                    zn znVar3 = lnVar.f39701a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    oc ocVar = new oc(10, lnVar, messageObject2);
                    int i17 = s91.f41655d0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(znVar3.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(znVar3.getContext(), znVar3.getResourceProvider());
                        acVar.f24487a.setScaleX(1.25f);
                        acVar.f24487a.setScaleY(1.25f);
                        if (diceValue == 1) {
                            acVar.f24487a.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            acVar.f24487a.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            acVar.f24487a.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            acVar.f24487a.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            acVar.f24487a.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            acVar.f24487a.setImageResource(R.drawable.dice6);
                        } else {
                            acVar.f24487a.setScaleX(0.8f);
                            acVar.f24487a.setScaleY(0.8f);
                            acVar.f24487a.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) yh.p7.N0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.dd.b(LocaleController.getString(R.string.StakeDiceToastChange), new m31(10, znVar3, ocVar), znVar3.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(acVar.f24488b);
                        org.telegram.ui.Components.cd cdVar = new org.telegram.ui.Components.cd(znVar3.getContext());
                        acVar.f24488b = cdVar;
                        cdVar.setSingleLine();
                        acVar.f24488b.setTypeface(Typeface.SANS_SERIF);
                        acVar.f24488b.setTextSize(1, 15.0f);
                        acVar.f24488b.setEllipsize(TextUtils.TruncateAt.END);
                        acVar.f24488b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        acVar.addView(acVar.f24488b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        acVar.f24488b.setText(yh.p7.Q0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        acVar.f24488b.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, znVar3.getResourceProvider()));
                        acVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Hi, znVar3.getResourceProvider()));
                        acVar.f24488b.setSingleLine(false);
                        acVar.f24488b.setMaxLines(2);
                        org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(znVar3.getContext(), znVar3.getResourceProvider(), true);
                        qcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        qcVar.f30123a = new ai.j(ocVar, j3, 29);
                        acVar.setButton(qcVar);
                        org.telegram.ui.Components.ad.a0(znVar3).b(acVar, 2750).j();
                        return;
                    }
                    return;
                }
                xmVar.run();
                return;
            case 6:
                ln lnVar2 = (ln) this.f44209b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.a2) this.f44210c).c(200L);
                zn znVar4 = lnVar2.f39701a;
                if (znVar4.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(znVar4.getMessagesController().verifyAgeBotUsername)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(znVar4.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(znVar4.getParentActivity(), 1, znVar4.getResourceProvider());
                    a2Var.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
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
                    frameLayout.addView(a2Var, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
                    a2Var.setOnClickListener(new k8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar4.getParentActivity(), 0, znVar4.getResourceProvider());
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                if (z12) {
                    i10 = R.string.MessageShowSensitiveContentMediaTextClosed;
                } else {
                    i10 = R.string.MessageShowSensitiveContentMediaText;
                }
                alertDialog$Builder.f20368a.T = LocaleController.getString(i10);
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.f20368a.G = 9;
                if (z12) {
                    i11 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                } else {
                    i11 = R.string.Cancel;
                }
                alertDialog$Builder.h(LocaleController.getString(i11), null);
                if (!z12) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.mk(lnVar2, u1Var, zArr, z11, contentsettings));
                }
                znVar4.showDialog(alertDialog$Builder.f20368a);
                return;
            case 7:
                Boolean bool4 = (Boolean) obj;
                sy.e0((sy) this.f44209b, (TLRPC.TL_attachMenuBot) this.f44210c, (LaunchActivity) this.d);
                return;
            case 8:
                sy syVar = (sy) this.f44209b;
                Long l10 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.a2) this.f44210c).q(150L);
                Boolean bool5 = syVar.G.bot_participant;
                if (bool5 != null && bool5.booleanValue()) {
                    syVar.getMessagesController().addUserToChat(l10.longValue(), syVar.getMessagesController().getUser(Long.valueOf(syVar.H)), 0, null, syVar, false, runnable, new nf(3, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.f44209b;
                of.e eVar = (of.e) this.f44210c;
                int[] iArr = (int[]) this.d;
                Long l11 = (Long) obj;
                Pattern pattern = LaunchActivity.B1;
                if (eVar != null) {
                    launchActivity.getClass();
                    eVar.b();
                }
                if (MessagesController.getInstance(launchActivity.O).getUserOrChat(l11.longValue()) == null) {
                    org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                    if (R != null && (R instanceof zn)) {
                        ((zn) R).ub();
                        return;
                    }
                    return;
                }
                new xh.r1(launchActivity, iArr[0], l11.longValue(), null, null).show();
                return;
            case 10:
                dc0 dc0Var = (dc0) this.f44209b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f44210c;
                org.telegram.ui.Components.qo0 qo0Var = (org.telegram.ui.Components.qo0) this.d;
                Long l12 = (Long) obj;
                if (l12 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(dc0Var.f36976b).getUser(l12);
                }
                userArr[0] = user;
                if (user == null) {
                    dc0Var.c();
                    org.telegram.messenger.ai.q(R.string.NoUsernameFound, dc0.d(), null);
                    return;
                }
                qo0Var.run();
                return;
            case 11:
                l11 l11Var = (l11) this.f44209b;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = ((HashSet) this.f44210c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = j71.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = j71.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = o11.f40381s;
                        FileLog.e("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        return;
                    }
                    hashMap2.put(num, k10);
                }
                HashMap hashMap3 = new HashMap();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ImageReceiver imageReceiver = new ImageReceiver();
                    l11Var.f39483e.add(imageReceiver);
                    imageReceiver.setDelegate(new m11(new Runnable[]{new tt0(26, l11Var, imageReceiver)}));
                    imageReceiver.setImage(ImageLocation.getForDocument((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.onAttachedToWindow();
                    hashMap3.put(num2, imageReceiver);
                }
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    Integer num3 = (Integer) arrayList4.get(i18);
                    num3.getClass();
                    l11Var.d.add((n11) hashMap3.get(num3));
                }
                l11Var.f39485g[0] = true;
                l11Var.a();
                return;
            case 12:
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i19 = ((j71) this.f44209b).V;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) this.f44210c);
                String i20 = sc.v.i(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i21 = 0; i21 < stickerSets.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i21);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.f20059id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(i20)) {
                                arrayList5.add(new g71(translitSafe2));
                                arrayList5.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f20059id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i12 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i12);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20059id))) {
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
                                    arrayList5.add(new g71(stickerSetCovered.set.title));
                                    arrayList5.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.f20059id));
                                }
                            }
                        }
                        i12++;
                    }
                }
                runnable2.run();
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f44210c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.s5.h(((j71) this.f44209b).V).f(arrayList6);
                int size = arrayList6.size();
                while (i12 < size) {
                    Object obj3 = arrayList6.get(i12);
                    i12++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj3).f20038id));
                }
                runnable3.run();
                return;
        }
    }
}
