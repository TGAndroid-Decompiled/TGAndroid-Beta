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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x implements org.telegram.messenger.w10 {
    public final int f53803a;
    public final Object f53804b;
    public final Object f53805c;
    public final Object d;

    public x(Object obj, Object obj2, Object obj3, int i7) {
        this.f53803a = i7;
        this.f53804b = obj;
        this.f53805c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        Uri uri;
        Intent intent;
        boolean z10;
        String country;
        BufferedReader bufferedReader;
        boolean z11;
        Object[] objArr;
        int L;
        int L2;
        int i7;
        int i10;
        TLRPC.User c22;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        String str = null;
        TLObject tLObject = null;
        boolean z12 = true;
        int i11 = 0;
        switch (this.f53803a) {
            case 0:
                g4 g4Var = (g4) this.f53804b;
                k3 k3Var = (k3) this.f53805c;
                Activity activity = (Activity) this.d;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && k3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i12 = 0;
                    for (int i13 = 0; i13 < uRLSpanArr.length; i13++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i13]), length);
                        i12 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i13]), i12);
                    }
                    g4Var.f48072i0.k(false);
                    Pattern pattern = Utilities.f22874a;
                    try {
                        uri = Uri.parse(str2);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if ((uRLSpanArr.length > 0 && length == 0 && i12 > 0) || (uri != null && uri.getScheme() != null)) {
                        if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                            str2 = vf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                        }
                        k3Var.getWebView().loadUrl(str2);
                        return;
                    }
                    org.telegram.ui.web.k.b(activity, str2);
                    org.telegram.ui.web.s0 webView = k3Var.getWebView();
                    String str3 = org.telegram.ui.web.e1.a().f53362b;
                    if (str3 != null) {
                        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str3);
                        m10.append(URLEncoder.encode(str2));
                        str = m10.toString();
                    }
                    webView.loadUrl(str);
                    return;
                }
                return;
            case 1:
                g4 g4Var2 = (g4) this.f53804b;
                String str4 = (String) this.f53805c;
                String str5 = (String) this.d;
                Boolean bool = (Boolean) obj;
                org.telegram.messenger.mp.u1(g4Var2.Y).p(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    org.telegram.messenger.mp.u1(g4Var2.Y).p(str5, true);
                }
                if (!bool.booleanValue()) {
                    g4Var2.a0();
                    return;
                } else {
                    LaunchActivity.J1 = new z(g4Var2, 8);
                    return;
                }
            case 2:
                bn bnVar = (bn) this.f53804b;
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) this.f53805c;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.d;
                Long l10 = (Long) obj;
                if (ajVar != null) {
                    bnVar.getClass();
                    ArrayList arrayList2 = ajVar.d;
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        if (!bnVar.getSendMessagesHelper().k0(l10.longValue(), (org.telegram.messenger.fj) arrayList2.get(i14), false)) {
                            z12 = false;
                        }
                    }
                    if (z12 && bnVar.f46204g4 == 0) {
                        bnVar.ra(false);
                        return;
                    }
                    return;
                } else if (bnVar.getSendMessagesHelper().k0(l10.longValue(), fjVar, false)) {
                    bnVar.Gd(false);
                    if (bnVar.f46204g4 == 0) {
                        bnVar.ra(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 3:
                bn bnVar2 = (bn) this.f53804b;
                TLRPC.User user = (TLRPC.User) this.f53805c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (bnVar2.getParentActivity() != null) {
                    if (bool2.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    if (user != null) {
                        intent.putExtra("name", org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (!str6.startsWith("+")) {
                        TLRPC.User f10 = bnVar2.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(org.telegram.messenger.t0.f27013b.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                ?? obj2 = new Object();
                                obj2.f51135a = split[2];
                                String str7 = split[0];
                                obj2.f51137c = str7;
                                obj2.d = split[1];
                                List list = (List) hashMap.get(str7);
                                if (list == null) {
                                    String str8 = split[0];
                                    ArrayList arrayList4 = new ArrayList();
                                    hashMap.put(str8, arrayList4);
                                    list = arrayList4;
                                }
                                list.add(obj2);
                            } else {
                                bufferedReader.close();
                                String str9 = f10.phone;
                                int i15 = 4;
                                while (true) {
                                    if (i15 >= 1) {
                                        List list2 = (List) hashMap.get(str9.substring(0, i15));
                                        if (list2 != null && list2.size() > 0) {
                                            String str10 = ((ps) list2.get(0)).f51137c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a8.p0.p("+", str10, str6);
                                            z10 = true;
                                        } else {
                                            i15--;
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                }
                                if (!z10) {
                                    Context context = org.telegram.messenger.t0.f27013b;
                                    if (context != null) {
                                        country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                                    } else {
                                        country = Locale.getDefault().getCountry();
                                    }
                                    if (country.endsWith("0") && str6.startsWith("0")) {
                                        str6 = str6.substring(1);
                                    }
                                    str6 = a8.p0.p("+", country, str6);
                                }
                            }
                        }
                    }
                    contentValues.put("data1", str6);
                    contentValues.put("data2", (Integer) 2);
                    arrayList3.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList3);
                    bnVar2.getParentActivity().startActivity(intent);
                    return;
                }
                return;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bn.q1((bn) this.f53804b, (TLRPC.User) this.f53805c, (TLRPC.TL_attachMenuBot) this.d);
                return;
            case 5:
                mm mmVar = (mm) this.f53804b;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.f53805c;
                wl wlVar = (wl) this.d;
                if (((Boolean) obj).booleanValue()) {
                    bn bnVar3 = mmVar.f50079a;
                    int D0 = fjVar2.D0();
                    TLRPC.MessageMedia n1 = org.telegram.messenger.fj.n1(fjVar2.f24073k);
                    if (n1 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome;
                    }
                    ki.n2 n2Var = new ki.n2(22, mmVar, fjVar2);
                    int i16 = t31.Z1;
                    TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.mp.u1(bnVar3.getCurrentAccount()).C8;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(bnVar3.getContext(), bnVar3.getResourceProvider());
                        nbVar.f37751a.setScaleX(1.25f);
                        nbVar.f37751a.setScaleY(1.25f);
                        if (D0 == 1) {
                            nbVar.f37751a.setImageResource(2131231058);
                        } else if (D0 == 2) {
                            nbVar.f37751a.setImageResource(2131231059);
                        } else if (D0 == 3) {
                            nbVar.f37751a.setImageResource(2131231060);
                        } else if (D0 == 4) {
                            nbVar.f37751a.setImageResource(2131231061);
                        } else if (D0 == 5) {
                            nbVar.f37751a.setImageResource(2131231062);
                        } else if (D0 == 6) {
                            nbVar.f37751a.setImageResource(2131231063);
                        } else {
                            nbVar.f37751a.setScaleX(0.8f);
                            nbVar.f37751a.setScaleY(0.8f);
                            nbVar.f37751a.setImageDrawable(org.telegram.messenger.j6.f("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131744995, null));
                        spannableStringBuilder2.append((CharSequence) di.pb.P0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.nc.b(org.telegram.messenger.gd.N0(2131744993, null), new iy0(8, bnVar3, n2Var), bnVar3.getResourceProvider(), null));
                        org.telegram.messenger.g0.E2(nbVar.f37752b);
                        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(bnVar3.getContext());
                        nbVar.f37752b = mcVar;
                        mcVar.setSingleLine();
                        nbVar.f37752b.setTypeface(Typeface.SANS_SERIF);
                        nbVar.f37752b.setTextSize(1, 15.0f);
                        nbVar.f37752b.setEllipsize(TextUtils.TruncateAt.END);
                        nbVar.f37752b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        nbVar.addView(nbVar.f37752b, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        nbVar.f37752b.setText(di.pb.S0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        org.telegram.ui.ActionBar.u6.G(nbVar.f37752b, org.telegram.ui.ActionBar.n6.xj, bnVar3.getResourceProvider());
                        nbVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, bnVar3.getResourceProvider()));
                        nbVar.f37752b.setSingleLine(false);
                        nbVar.f37752b.setMaxLines(2);
                        org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(bnVar3.getContext(), bnVar3.getResourceProvider(), true);
                        dcVar.e(org.telegram.messenger.gd.N0(2131744994, null));
                        dcVar.f34267b = new ox0(n2Var, j3, 1);
                        nbVar.setButton(dcVar);
                        org.telegram.ui.Components.kc.b0(bnVar3).b(nbVar, 2750).j();
                        return;
                    }
                    return;
                }
                wlVar.run();
                return;
            case 6:
                mm mmVar2 = (mm) this.f53804b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.t1) this.f53805c).c(200L);
                bn bnVar4 = mmVar2.f50079a;
                if (((org.telegram.messenger.h0) bnVar4.getMessagesController().A7.f26248m.f17372b).f24439c && !TextUtils.isEmpty(bnVar4.getMessagesController().f25901x6)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z11) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(bnVar4.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, bnVar4.getParentActivity(), bnVar4.getResourceProvider());
                    d2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                    d2Var.e(org.telegram.messenger.gd.N0(2131748289, null), "", zArr[0], false, false);
                    if (org.telegram.messenger.gd.f24314a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.gd.f24314a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    d2Var.setPadding(L, 0, L2, 0);
                    frameLayout.addView(d2Var, c8.na.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    d2Var.setOnClickListener(new l8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar4.getParentActivity(), bnVar4.getResourceProvider());
                alertDialog$Builder.f28835a.S = org.telegram.messenger.gd.N0(2131748280, null);
                if (objArr != null) {
                    i7 = 2131748282;
                } else {
                    i7 = 2131748283;
                }
                alertDialog$Builder.f28835a.U = org.telegram.messenger.gd.N0(i7, null);
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.f28835a.H = 9;
                if (objArr != null) {
                    i10 = 2131748281;
                } else {
                    i10 = 2131752577;
                }
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(i10, null), null);
                if (objArr == null) {
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748288, null), new zl(mmVar2, r1Var, zArr, z11, contentsettings));
                }
                bnVar4.showDialog(alertDialog$Builder.f28835a);
                return;
            case 7:
                Boolean bool4 = (Boolean) obj;
                bx.J0((bx) this.f53804b, (TLRPC.TL_attachMenuBot) this.f53805c, (LaunchActivity) this.d);
                return;
            case 8:
                bx bxVar = (bx) this.f53804b;
                Long l11 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) this.f53805c).r(150L);
                Boolean bool5 = bxVar.H.bot_participant;
                if (bool5 != null && bool5.booleanValue()) {
                    bxVar.getMessagesController().m(l11.longValue(), bxVar.getMessagesController().c2(Long.valueOf(bxVar.I)), 0, null, bxVar, false, runnable, new ve(5, runnable), null);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.f53804b;
                vf.b bVar = (vf.b) this.f53805c;
                int[] iArr = (int[]) this.d;
                Long l12 = (Long) obj;
                String str11 = LaunchActivity.C1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if (l12 != null) {
                    tLObject = org.telegram.messenger.mp.u1(launchActivity.P).g2(l12.longValue());
                }
                if (tLObject == null) {
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof bn)) {
                        ((bn) Q).Xb();
                        return;
                    }
                    return;
                }
                new bi.p3(launchActivity, iArr[0], l12.longValue(), null, null).show();
                return;
            case 10:
                r90 r90Var = (r90) this.f53804b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f53805c;
                org.telegram.ui.Components.xz xzVar = (org.telegram.ui.Components.xz) this.d;
                Long l13 = (Long) obj;
                if (l13 == null) {
                    c22 = null;
                } else {
                    c22 = org.telegram.messenger.mp.u1(r90Var.f51668b).c2(l13);
                }
                userArr[0] = c22;
                if (c22 == null) {
                    r90Var.c();
                    org.telegram.messenger.f3.o(null, 2131747941, r90.d(), null);
                    return;
                }
                xzVar.run();
                return;
            case 11:
                yw0 yw0Var = (yw0) this.f53804b;
                ArrayList arrayList5 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = ((HashSet) this.f53805c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = q11.k(tL_messages_stickerSet, num + "️⃣");
                    if (k10 == null) {
                        k10 = q11.k(tL_messages_stickerSet, num + "⃣");
                    }
                    if (k10 == null) {
                        String[] strArr = bx0.f46655s;
                        org.telegram.messenger.a8.d("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        return;
                    }
                    hashMap2.put(num, k10);
                }
                HashMap hashMap3 = new HashMap();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    yw0Var.f54440e.add(imageReceiver);
                    imageReceiver.f22737h1 = new zw0(new Runnable[]{new mp0(27, yw0Var, imageReceiver)});
                    imageReceiver.r0(org.telegram.messenger.fc.b((TLRPC.Document) entry.getValue()), "80_80", null, null, tL_messages_stickerSet, 0);
                    imageReceiver.Q();
                    hashMap3.put(num2, imageReceiver);
                }
                for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                    Integer num3 = (Integer) arrayList5.get(i17);
                    num3.getClass();
                    yw0Var.d.add((ax0) hashMap3.get(num3));
                }
                yw0Var.f54442g[0] = true;
                yw0Var.a();
                return;
            case 12:
                ArrayList arrayList6 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i18 = ((q11) this.f53804b).W;
                ArrayList u02 = org.telegram.messenger.ri.d0(i18).u0(5);
                HashSet hashSet = new HashSet();
                String M3 = org.telegram.messenger.g0.M3((String) this.f53805c);
                String concat = " ".concat(M3);
                if (u02 != null) {
                    for (int i19 = 0; i19 < u02.size(); i19++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) u02.get(i19);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.f28519id))) {
                            String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet2.set.title);
                            if (M32.startsWith(M3) || M32.contains(concat)) {
                                arrayList6.add(new n11(M32));
                                arrayList6.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f28519id));
                            }
                        }
                    }
                }
                ArrayList arrayList7 = org.telegram.messenger.ri.d0(i18).f26740t0[1];
                if (arrayList7 != null) {
                    while (i11 < arrayList7.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i11);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f28519id))) {
                            String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title);
                            if (M33.startsWith(M3) || M33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i18).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    if (n02 != null) {
                                        arrayList = n02.documents;
                                    } else {
                                        arrayList = null;
                                    }
                                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                } else {
                                    arrayList = stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList6.add(new n11(stickerSetCovered.set.title));
                                    arrayList6.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.f28519id));
                                }
                            }
                        }
                        i11++;
                    }
                }
                runnable2.run();
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f53805c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.o5.g(((q11) this.f53804b).W).f(arrayList8);
                int size = arrayList8.size();
                while (i11 < size) {
                    Object obj3 = arrayList8.get(i11);
                    i11++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj3).f28498id));
                }
                runnable3.run();
                return;
        }
    }
}
