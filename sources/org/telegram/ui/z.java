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
public final class z implements Utilities.Callback {
    public final int f44577a;
    public final Object f44578b;
    public final Object f44579c;
    public final Object d;

    public z(Object obj, Object obj2, Object obj3, int i10) {
        this.f44577a = i10;
        this.f44578b = obj;
        this.f44579c = obj2;
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
        switch (this.f44577a) {
            case 0:
                i4 i4Var = (i4) this.f44578b;
                m3 m3Var = (m3) this.f44579c;
                Activity activity = (Activity) this.d;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && m3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i13 = 0;
                    for (int i14 = 0; i14 < uRLSpanArr.length; i14++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i14]), length);
                        i13 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i14]), i13);
                    }
                    i4Var.f38649h0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length > 0 && length == 0 && i13 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = of.f.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        m3Var.getWebView().loadUrl(str2);
                        return;
                    }
                    org.telegram.ui.web.k.b(activity, str2);
                    org.telegram.ui.web.y0 webView = m3Var.getWebView();
                    String str3 = org.telegram.ui.web.n1.a().f43351b;
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
                i4 i4Var2 = (i4) this.f44578b;
                String str4 = (String) this.f44579c;
                String str5 = (String) this.d;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(i4Var2.X).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(i4Var2.X).addWebBrowserException(str5, true);
                }
                if (!bool.booleanValue()) {
                    i4Var2.c0();
                    return;
                } else {
                    LaunchActivity.I1 = new b0(i4Var2, 8);
                    return;
                }
            case 2:
                eo eoVar = (eo) this.f44578b;
                TLRPC.User user2 = (TLRPC.User) this.f44579c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (eoVar.getParentActivity() != null) {
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
                        TLRPC.User currentUser = eoVar.getUserConfig().getCurrentUser();
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
                                obj2.f44156a = split[2];
                                String str7 = split[0];
                                obj2.f44158c = str7;
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
                                            String str10 = ((xt) list2.get(0)).f44158c;
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
                    eoVar.getParentActivity().startActivity(intent);
                    return;
                }
                return;
            case 3:
                eo eoVar2 = (eo) this.f44578b;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f44579c;
                MessageObject messageObject = (MessageObject) this.d;
                Long l4 = (Long) obj;
                if (groupedMessages != null) {
                    eoVar2.getClass();
                    for (int i16 = 0; i16 < groupedMessages.messages.size(); i16++) {
                        if (!eoVar2.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i16), false, l4.longValue())) {
                            z13 = false;
                        }
                    }
                    if (z13 && eoVar2.R3 == 0) {
                        eoVar2.T9(false);
                        return;
                    }
                    return;
                } else if (eoVar2.getSendMessagesHelper().retrySendMessage(messageObject, false, l4.longValue())) {
                    eoVar2.ad(false);
                    if (eoVar2.R3 == 0) {
                        eoVar2.T9(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                Boolean bool3 = (Boolean) obj;
                eo.s1((eo) this.f44578b, (TLRPC.User) this.f44579c, (TLRPC.TL_attachMenuBot) this.d);
                return;
            case 5:
                pn pnVar = (pn) this.f44578b;
                MessageObject messageObject2 = (MessageObject) this.f44579c;
                bn bnVar = (bn) this.d;
                if (((Boolean) obj).booleanValue()) {
                    eo eoVar3 = pnVar.f40998a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    tc tcVar = new tc(10, pnVar, messageObject2);
                    int i17 = v91.f42731d0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(eoVar3.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(eoVar3.getContext(), eoVar3.getResourceProvider());
                        acVar.f24275a.setScaleX(1.25f);
                        acVar.f24275a.setScaleY(1.25f);
                        if (diceValue == 1) {
                            acVar.f24275a.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            acVar.f24275a.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            acVar.f24275a.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            acVar.f24275a.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            acVar.f24275a.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            acVar.f24275a.setImageResource(R.drawable.dice6);
                        } else {
                            acVar.f24275a.setScaleX(0.8f);
                            acVar.f24275a.setScaleY(0.8f);
                            acVar.f24275a.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) yh.p7.N0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.cd.b(LocaleController.getString(R.string.StakeDiceToastChange), new w31(8, eoVar3, tcVar), eoVar3.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(acVar.f24276b);
                        org.telegram.ui.Components.bd bdVar = new org.telegram.ui.Components.bd(eoVar3.getContext());
                        acVar.f24276b = bdVar;
                        bdVar.setSingleLine();
                        acVar.f24276b.setTypeface(Typeface.SANS_SERIF);
                        acVar.f24276b.setTextSize(1, 15.0f);
                        acVar.f24276b.setEllipsize(TextUtils.TruncateAt.END);
                        acVar.f24276b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        acVar.addView(acVar.f24276b, w7.w5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        acVar.f24276b.setText(yh.p7.Q0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        acVar.f24276b.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, eoVar3.getResourceProvider()));
                        acVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Hi, eoVar3.getResourceProvider()));
                        acVar.f24276b.setSingleLine(false);
                        acVar.f24276b.setMaxLines(2);
                        org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(eoVar3.getContext(), eoVar3.getResourceProvider(), true);
                        qcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        qcVar.f29816a = new ai.j(tcVar, j3, 29);
                        acVar.setButton(qcVar);
                        org.telegram.ui.Components.zc.a0(eoVar3).b(acVar, 2750).j();
                        return;
                    }
                    return;
                }
                bnVar.run();
                return;
            case 6:
                pn pnVar2 = (pn) this.f44578b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.a2) this.f44579c).c(200L);
                eo eoVar4 = pnVar2.f40998a;
                if (eoVar4.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(eoVar4.getMessagesController().verifyAgeBotUsername)) {
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
                FrameLayout frameLayout = new FrameLayout(eoVar4.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(eoVar4.getParentActivity(), 1, eoVar4.getResourceProvider());
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
                    frameLayout.addView(a2Var, w7.w5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
                    a2Var.setOnClickListener(new o8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar4.getParentActivity(), 0, eoVar4.getResourceProvider());
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                if (z12) {
                    i10 = R.string.MessageShowSensitiveContentMediaTextClosed;
                } else {
                    i10 = R.string.MessageShowSensitiveContentMediaText;
                }
                alertDialog$Builder.f20141a.T = LocaleController.getString(i10);
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.f20141a.G = 9;
                if (z12) {
                    i11 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                } else {
                    i11 = R.string.Cancel;
                }
                alertDialog$Builder.h(LocaleController.getString(i11), null);
                if (!z12) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.sk(pnVar2, u1Var, zArr, z11, contentsettings));
                }
                eoVar4.showDialog(alertDialog$Builder.f20141a);
                return;
            case 7:
                Boolean bool4 = (Boolean) obj;
                vy.e0((vy) this.f44578b, (TLRPC.TL_attachMenuBot) this.f44579c, (LaunchActivity) this.d);
                return;
            case 8:
                vy vyVar = (vy) this.f44578b;
                Long l10 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.a2) this.f44579c).q(150L);
                Boolean bool5 = vyVar.G.bot_participant;
                if (bool5 != null && bool5.booleanValue()) {
                    vyVar.getMessagesController().addUserToChat(l10.longValue(), vyVar.getMessagesController().getUser(Long.valueOf(vyVar.H)), 0, null, vyVar, false, runnable, new sf(3, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.f44578b;
                of.e eVar = (of.e) this.f44579c;
                int[] iArr = (int[]) this.d;
                Long l11 = (Long) obj;
                Pattern pattern = LaunchActivity.B1;
                if (eVar != null) {
                    launchActivity.getClass();
                    eVar.b();
                }
                if (MessagesController.getInstance(launchActivity.O).getUserOrChat(l11.longValue()) == null) {
                    org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                    if (R != null && (R instanceof eo)) {
                        ((eo) R).ub();
                        return;
                    }
                    return;
                }
                new xh.q1(launchActivity, iArr[0], l11.longValue(), null, null).show();
                return;
            case 10:
                fc0 fc0Var = (fc0) this.f44578b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f44579c;
                org.telegram.ui.Components.uo0 uo0Var = (org.telegram.ui.Components.uo0) this.d;
                Long l12 = (Long) obj;
                if (l12 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(fc0Var.f37711b).getUser(l12);
                }
                userArr[0] = user;
                if (user == null) {
                    fc0Var.c();
                    org.telegram.messenger.am.q(R.string.NoUsernameFound, fc0.d(), null);
                    return;
                }
                uo0Var.run();
                return;
            case 11:
                o11 o11Var = (o11) this.f44578b;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = ((HashSet) this.f44579c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = n71.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = n71.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = r11.f41466s;
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
                    o11Var.f40535e.add(imageReceiver);
                    imageReceiver.setDelegate(new p11(new Runnable[]{new hu0(24, o11Var, imageReceiver)}));
                    imageReceiver.setImage(ImageLocation.getForDocument((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.onAttachedToWindow();
                    hashMap3.put(num2, imageReceiver);
                }
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    Integer num3 = (Integer) arrayList4.get(i18);
                    num3.getClass();
                    o11Var.d.add((q11) hashMap3.get(num3));
                }
                o11Var.f40537g[0] = true;
                o11Var.a();
                return;
            case 12:
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i19 = ((n71) this.f44578b).V;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) this.f44579c);
                String i20 = sc.v.i(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i21 = 0; i21 < stickerSets.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i21);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.f19829id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(i20)) {
                                arrayList5.add(new k71(translitSafe2));
                                arrayList5.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f19829id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i12 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i12);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19829id))) {
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
                                    arrayList5.add(new k71(stickerSetCovered.set.title));
                                    arrayList5.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.f19829id));
                                }
                            }
                        }
                        i12++;
                    }
                }
                runnable2.run();
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f44579c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.s5.h(((n71) this.f44578b).V).f(arrayList6);
                int size = arrayList6.size();
                while (i12 < size) {
                    Object obj3 = arrayList6.get(i12);
                    i12++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj3).f19808id));
                }
                runnable3.run();
                return;
        }
    }
}
