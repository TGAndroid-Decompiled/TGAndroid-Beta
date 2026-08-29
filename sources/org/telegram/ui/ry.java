package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class ry implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet H = new HashSet();
    public static final HashSet I;
    public od.i A;
    public final FrameLayout C;
    public final org.telegram.ui.Components.jl0 D;
    public final long E;
    public final long F;
    public HashMap G;
    public final tn f42225a;
    public int f42226b;
    public TLRPC.TL_messages_stickerSet f42227c;
    public boolean f42230n;
    public String v;
    public ui f42235y;
    public boolean d = false;
    public final HashMap f42228e = new HashMap();
    public final HashMap f42229f = new HashMap();
    public final Random h = new Random();
    public int f42231r = -1;
    public long f42232s = 0;
    public final ArrayList f42233w = new ArrayList();
    public final ArrayList f42234x = new ArrayList();
    public final ArrayList B = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        I = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public ry(int i10, FrameLayout frameLayout) {
        this.C = frameLayout;
        this.f42226b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.s1 s1Var, float f9, int i10) {
        float centerY = s1Var.getPhotoImage().getCenterY() + s1Var.getY();
        if (centerY > f9 && centerY < i10) {
            return true;
        }
        return false;
    }

    public static int f() {
        float min;
        float f9;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f9 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f9 = 0.5f;
        }
        return (int) ((((int) (min * f9)) * 2.0f) / AndroidUtilities.density);
    }

    public static java.lang.String q(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ry.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f42226b).getStickerSetByName("EmojiAnimations");
            this.f42227c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f42227c = MediaDataController.getInstance(this.f42226b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f42227c == null) {
                MediaDataController.getInstance(this.f42226b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f42227c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f42227c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f42227c.documents.get(i10).f22398id), this.f42227c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f42227c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f42227c.packs.get(i11);
                    if (!I.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = H;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f42228e;
                        hashMap2.put(str2, arrayList);
                        for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                            arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i12)));
                        }
                        if (tL_stickerPack.emoticon.equals("❤")) {
                            String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                            for (int i13 = 0; i13 < 8; i13++) {
                                String str3 = strArr[i13];
                                hashSet.add(str3);
                                hashMap2.put(str3, arrayList);
                            }
                        }
                    }
                }
                this.d = true;
            }
        }
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 < arrayList.size()) {
                ((qy) arrayList.get(i10)).f41812r.onDetachedFromWindow();
                if (((qy) arrayList.get(i10)).f41804j != null) {
                    ((qy) arrayList.get(i10)).f41804j.d(this.C);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, MessageObject messageObject, int i11, boolean z10, boolean z11, float f9, float f10, boolean z12) {
        boolean z13;
        boolean z14;
        Random random;
        long j10;
        TLRPC.Document document2;
        int intValue;
        Boolean bool;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z15;
        boolean z16;
        String str2;
        int intValue2;
        ui uiVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12 = i11;
        if (messageObject != null && messageObject.isPremiumSticker()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (messageObject != null && messageObject.getEffect() != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || z13 || H.contains(str)) {
            ArrayList arrayList = (ArrayList) this.f42228e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.B;
                    if (i13 < arrayList2.size()) {
                        if (((qy) arrayList2.get(i13)).f41810p == i10) {
                            i14++;
                            if (!z14 && (((qy) arrayList2.get(i13)).f41812r.getLottieAnimation() == null || ((qy) arrayList2.get(i13)).f41812r.getLottieAnimation().w())) {
                                return false;
                            }
                        }
                        if (((qy) arrayList2.get(i13)).f41811q != null && document != null) {
                            if (((qy) arrayList2.get(i13)).f41811q.f22398id == document.f22398id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
                        if (mcVar != null && mcVar.f30646b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f42226b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f42226b).getStickerSetById(inputStickerSet.f22412id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f42226b).sendRequest(tL_messages_getStickerSet, new zg(21, this, messageObject));
                            return false;
                        }
                        p(tL_messages_stickerSet, messageObject);
                        return false;
                    } else if (i14 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z14) {
                            TLRPC.TL_availableEffect effect = messageObject.getEffect();
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f42226b).getAvailableEffects();
                            if (availableEffects == null) {
                                return false;
                            }
                            j10 = 0;
                            long j11 = effect.effect_animation_id;
                            if (j11 == 0) {
                                j11 = effect.effect_sticker_id;
                            }
                            random = random2;
                            int i16 = 0;
                            while (true) {
                                if (i16 < availableEffects.documents.size()) {
                                    document2 = availableEffects.documents.get(i16);
                                    long j12 = j11;
                                    if (document2 != null && document2.f22398id == j12) {
                                        break;
                                    }
                                    i16++;
                                    j11 = j12;
                                } else {
                                    document2 = null;
                                    break;
                                }
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (effect.effect_sticker_id != 0) {
                                premiumStickerAnimation = MessageObject.getPremiumStickerAnimation(document2);
                                if (premiumStickerAnimation != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            premiumStickerAnimation = null;
                        } else {
                            random = random2;
                            j10 = 0;
                            if (z13) {
                                document2 = messageObject.getDocument();
                                premiumStickerAnimation = messageObject.getPremiumStickerAnimation();
                            } else {
                                if (messageObject != null && messageObject.isAnimatedAnimatedEmoji()) {
                                    if (i12 >= 0 && i12 <= arrayList.size() - 1) {
                                        intValue = i12;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                                            if (document3 != null) {
                                                HashMap hashMap = this.G;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f22398id));
                                                } else {
                                                    bool = null;
                                                }
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i17));
                                                }
                                            }
                                        }
                                        if (arrayList3.isEmpty()) {
                                            intValue = Math.abs(random.nextInt()) % arrayList.size();
                                        } else {
                                            intValue = ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                        }
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(intValue);
                                    i12 = intValue;
                                } else {
                                    if (i12 < 0 || i12 > arrayList.size() - 1) {
                                        i12 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i12);
                                }
                                premiumStickerAnimation = null;
                            }
                        }
                        if (document2 == null && premiumStickerAnimation == null) {
                            return false;
                        }
                        qy qyVar = new qy();
                        qyVar.h = z13;
                        qyVar.f41803i = z14;
                        if (!z14) {
                            qyVar.f41801f = ((random.nextInt() % 101) / 100.0f) * (f9 / 4.0f);
                            qyVar.f41802g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        qyVar.f41810p = i10;
                        qyVar.f41811q = document2;
                        qyVar.f41807m = z12;
                        qyVar.f41812r.setAllowStartAnimation(true);
                        qyVar.f41812r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f42229f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f22398id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f22398id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            qyVar.f41812r.setUniqKeyPrefix(i19 + "_" + qyVar.f41810p + "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f11);
                            sb2.append("_");
                            sb2.append(f11);
                            if (!z17) {
                                str3 = "";
                            } else {
                                str3 = "_pcache";
                            }
                            sb2.append(str3);
                            qyVar.f41812r.setImage(forDocument, sb2.toString(), null, "tgs", this.f42227c, 1);
                            qyVar.f41812r.setDelegate(new py(this, qyVar, z10, messageObject));
                            if (qyVar.f41812r.getLottieAnimation() != null) {
                                qyVar.f41812r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f22398id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f22398id), Integer.valueOf((intValue2 + 1) % 4));
                                qyVar.f41812r.setUniqKeyPrefix(intValue2 + "_" + qyVar.f41810p + "_");
                            }
                            qyVar.f41811q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            if (!z18) {
                                str2 = "";
                            } else {
                                str2 = "_pcache";
                            }
                            sb3.append(str2);
                            qyVar.f41812r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f42227c, 1);
                        }
                        qyVar.f41812r.setLayerNum(Integer.MAX_VALUE);
                        qyVar.f41812r.setAutoRepeat(0);
                        if (qyVar.f41812r.getLottieAnimation() != null) {
                            if (qyVar.h) {
                                qyVar.f41812r.getLottieAnimation().L(0, false, true);
                            }
                            qyVar.f41812r.getLottieAnimation().start();
                        }
                        arrayList2.add(qyVar);
                        qyVar.f41812r.onAttachedToWindow();
                        ImageReceiver imageReceiver = qyVar.f41812r;
                        FrameLayout frameLayout = this.C;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f42226b).clientUserId != this.E) {
                            int i20 = this.f42231r;
                            if (i20 != 0 && i20 != i10 && (uiVar = this.f42235y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(uiVar);
                                this.f42235y.run();
                            }
                            this.f42231r = i10;
                            this.v = str;
                            long j13 = this.f42232s;
                            ArrayList arrayList4 = this.f42234x;
                            ArrayList arrayList5 = this.f42233w;
                            if (j13 == j10) {
                                this.f42232s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f42232s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            ui uiVar2 = this.f42235y;
                            if (uiVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(uiVar2);
                                this.f42235y = null;
                            }
                            ui uiVar3 = new ui(this, 27);
                            this.f42235y = uiVar3;
                            AndroidUtilities.runOnUIThread(uiVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f42226b).sendTyping(this.E, this.F, 11, str, 0);
                            return true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Integer printingStringType;
        if (i10 == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.onEmojiInteractionsReceived;
        long j10 = this.E;
        if (i10 == i12) {
            if (this.f42225a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j10 && H.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pc0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f42226b).getPrintingStringType(j10, this.F)) != null && printingStringType.intValue() == 5) {
            od.i iVar = this.A;
            if (iVar != null) {
                AndroidUtilities.cancelRunOnUIThread(iVar);
            }
            this.A = null;
        }
    }

    public final void e(Canvas canvas) {
        float f9;
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        float f11;
        if (!this.B.isEmpty()) {
            int i10 = 0;
            while (i10 < this.B.size()) {
                qy qyVar = (qy) this.B.get(i10);
                float f12 = 3.0f;
                if (this.f42225a != null) {
                    qyVar.f41799c = false;
                    int i11 = 0;
                    while (true) {
                        if (i11 < this.D.getChildCount()) {
                            View childAt = this.D.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                                messageObject = s1Var.getMessageObject();
                                imageReceiver = s1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                                messageObject = v0Var.getMessageObject();
                                imageReceiver = v0Var.getPhotoImage();
                            } else {
                                messageObject = null;
                                imageReceiver = null;
                            }
                            if (messageObject != null && messageObject.getId() == qyVar.f41810p) {
                                qyVar.f41799c = true;
                                float x4 = childAt.getX() + this.D.getX();
                                float y8 = childAt.getY() + this.D.getY();
                                f10 = childAt.getY();
                                qyVar.d = imageReceiver.getImageWidth();
                                qyVar.f41800e = imageReceiver.getImageHeight();
                                if (qyVar.f41803i && (childAt instanceof org.telegram.ui.Cells.s1)) {
                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                                    float f13 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f14 = f13 / f12;
                                    qyVar.d = f14;
                                    qyVar.f41800e = f14;
                                    float timeX = s1Var2.getTimeX() + x4;
                                    float f15 = f13 / 2.0f;
                                    f9 = 3.0f;
                                    qyVar.f41797a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                                    qyVar.f41798b = (s1Var2.getTimeY() + y8) - f15;
                                } else {
                                    f9 = 3.0f;
                                    if (qyVar.h) {
                                        qyVar.f41797a = imageReceiver.getImageX() + x4;
                                        qyVar.f41798b = imageReceiver.getImageY() + y8;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x4;
                                        float imageY = imageReceiver.getImageY() + y8;
                                        if (qyVar.f41807m) {
                                            f11 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f11 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        qyVar.f41797a = f11;
                                        qyVar.f41798b = imageY - imageReceiver.getImageWidth();
                                    }
                                }
                            } else {
                                i11++;
                                f12 = 3.0f;
                            }
                        } else {
                            f9 = 3.0f;
                            f10 = 0.0f;
                            break;
                        }
                    }
                    if (!qyVar.f41799c || qyVar.f41800e + f10 < this.f42225a.f42921o9 || f10 > this.D.getMeasuredHeight() - this.f42225a.f43023wa) {
                        qyVar.f41808n = true;
                    }
                    if (qyVar.h) {
                        float f16 = qyVar.f41800e / 2.0f;
                        if (this.D.getMeasuredHeight() - f10 <= f16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f10 - this.f42225a.f42921o9) + f16 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            qyVar.f41808n = true;
                        }
                    }
                    if (qyVar.f41808n) {
                        float f17 = qyVar.f41809o;
                        if (f17 != 1.0f) {
                            float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                            qyVar.f41809o = clamp;
                            qyVar.f41812r.setAlpha(1.0f - clamp);
                            this.f42225a.T0.invalidate();
                        }
                    }
                } else {
                    f9 = 3.0f;
                    h(qyVar);
                }
                if (!qyVar.f41806l && qyVar.f41808n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (qyVar.h && !qyVar.f41803i) {
                        float f18 = qyVar.f41800e;
                        float f19 = 1.49926f * f18;
                        float f20 = 0.0546875f * f19;
                        float f21 = (((f18 / 2.0f) + qyVar.f41798b) - (f19 / 2.0f)) - (0.00279f * f19);
                        if (!qyVar.f41807m) {
                            qyVar.f41812r.setImageCoords(qyVar.f41797a - f20, f21, f19, f19);
                        } else {
                            qyVar.f41812r.setImageCoords(((qyVar.f41797a + qyVar.d) - f19) + f20, f21, f19, f19);
                        }
                        if (!qyVar.f41807m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, qyVar.f41812r.getCenterX(), qyVar.f41812r.getCenterY());
                            qyVar.f41812r.draw(canvas);
                            canvas.restore();
                        } else {
                            qyVar.f41812r.draw(canvas);
                        }
                    } else {
                        kg.d dVar = qyVar.f41804j;
                        if (dVar != null) {
                            float f22 = qyVar.f41797a + qyVar.f41801f;
                            float f23 = qyVar.f41798b + qyVar.f41802g;
                            float f24 = qyVar.d * f9;
                            dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                            qyVar.f41804j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = qyVar.f41812r;
                            float f25 = qyVar.f41797a + qyVar.f41801f;
                            float f26 = qyVar.f41798b + qyVar.f41802g;
                            float f27 = qyVar.d * f9;
                            imageReceiver2.setImageCoords(f25, f26, f27, f27);
                            if (!qyVar.f41807m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, qyVar.f41812r.getCenterX(), qyVar.f41812r.getCenterY());
                                qyVar.f41812r.draw(canvas);
                                canvas.restore();
                            } else {
                                qyVar.f41812r.draw(canvas);
                            }
                        }
                    }
                }
                kg.d dVar2 = qyVar.f41804j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (qyVar.f41806l && qyVar.f41812r.getLottieAnimation() != null && qyVar.f41812r.getLottieAnimation().X >= qyVar.f41812r.getLottieAnimation().f34737e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qyVar.f41809o != 1.0f && !z11 && !z10) {
                    if (qyVar.f41812r.getLottieAnimation() != null && qyVar.f41812r.getLottieAnimation().f34742h0) {
                        qyVar.f41806l = true;
                    } else if (qyVar.f41812r.getLottieAnimation() != null && !qyVar.f41812r.getLottieAnimation().f34742h0) {
                        qyVar.f41812r.getLottieAnimation().L(0, true, false);
                        qyVar.f41812r.getLottieAnimation().start();
                    }
                } else {
                    qy qyVar2 = (qy) this.B.remove(i10);
                    if (qyVar.h && qyVar.f41812r.getLottieAnimation() != null) {
                        qyVar2.f41812r.getLottieAnimation().L(0, true, true);
                    }
                    qyVar2.f41812r.onDetachedFromWindow();
                    kg.d dVar3 = qyVar2.f41804j;
                    if (dVar3 != null) {
                        dVar3.d(this.C);
                    }
                    i10--;
                }
                i10++;
            }
            if (this.B.isEmpty()) {
                i();
            }
            this.C.invalidate();
        }
    }

    public final boolean g() {
        return this.B.isEmpty();
    }

    public final void j() {
        this.f42230n = true;
        b();
        NotificationCenter.getInstance(this.f42226b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f42226b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f42226b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 < arrayList.size()) {
                ((qy) arrayList.get(i10)).f41812r.onAttachedToWindow();
                if (((qy) arrayList.get(i10)).f41804j != null) {
                    ((qy) arrayList.get(i10)).f41804j.f(this.C);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i10 = 0;
        this.f42230n = false;
        NotificationCenter.getInstance(this.f42226b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f42226b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f42226b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 < arrayList.size()) {
                ((qy) arrayList.get(i10)).f41812r.onDetachedFromWindow();
                if (((qy) arrayList.get(i10)).f41804j != null) {
                    ((qy) arrayList.get(i10)).f41804j.d(this.C);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void l(org.telegram.ui.Cells.s1 s1Var, tn tnVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!tnVar.w() && s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() >= 0) {
            if (s1Var.getMessageObject().isPremiumSticker() || tnVar.f42801f != null) {
                boolean o10 = o(s1Var, -1, z10, false);
                if (z10 && o10 && !EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                    try {
                        s1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                boolean isPremiumSticker = s1Var.getMessageObject().isPremiumSticker();
                long j10 = this.E;
                if (!isPremiumSticker && s1Var.getEffect() == null && (z10 || !s1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                    Integer printingStringType = MessagesController.getInstance(this.f42226b).getPrintingStringType(j10, this.F);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.A == null && o10) {
                        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
                        if ((mcVar == null || !mcVar.f30654l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f42226b).getClientUserId() != tnVar.f42801f.f22539id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = s1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f42226b).getEmojiAnimatedSticker(s1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.sw0 sw0Var = new org.telegram.ui.Components.sw0(tnVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, tnVar.getResourceProvider());
                            sw0Var.f29365c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, tnVar.f42801f.first_name));
                            TextView textView = sw0Var.f29364b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            od.i iVar = new od.i(3, this, org.telegram.ui.Components.mc.g(tnVar, sw0Var, 2750));
                            this.A = iVar;
                            AndroidUtilities.runOnUIThread(iVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s1Var.getMessageObject().forcePlayEffect = false;
                s1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                tnVar.getMessagesStorage().updateMessageCustomParams(j10, s1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.G;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f22398id))) {
                return;
            }
            if (this.G == null) {
                this.G = new HashMap();
            }
            this.G.put(Long.valueOf(document.f22398id), Boolean.TRUE);
            MediaDataController.getInstance(this.f42226b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void n(org.telegram.ui.Cells.s1 s1Var) {
        ArrayList arrayList;
        MessageObject messageObject = s1Var.getMessageObject();
        if (!messageObject.isPremiumSticker()) {
            String stickerEmoji = messageObject.getStickerEmoji();
            if (stickerEmoji == null) {
                stickerEmoji = messageObject.messageOwner.message;
            }
            String q6 = q(stickerEmoji);
            if (H.contains(q6) && (arrayList = (ArrayList) this.f42228e.get(q6)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    m((TLRPC.Document) arrayList.get(i10));
                }
            }
        }
    }

    public final boolean o(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10, boolean z11) {
        if (s1Var != null && this.B.size() <= 12) {
            MessageObject messageObject = s1Var.getMessageObject();
            if (s1Var.getEffect() != null || s1Var.getPhotoImage().hasNotThumb()) {
                String stickerEmoji = messageObject.getStickerEmoji();
                if (stickerEmoji == null) {
                    stickerEmoji = messageObject.messageOwner.message;
                }
                if (s1Var.getEffect() != null || stickerEmoji != null) {
                    float imageHeight = s1Var.getPhotoImage().getImageHeight();
                    float imageWidth = s1Var.getPhotoImage().getImageWidth();
                    if (s1Var.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
                        return d(q(stickerEmoji), s1Var.getMessageObject().getId(), s1Var.getMessageObject().getDocument(), messageObject, i10, z10, z11, imageWidth, imageHeight, s1Var.getMessageObject().isOutOwner());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void p(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        tn tnVar = this.f42225a;
        if (tnVar != null && !MessagesController.getInstance(this.f42226b).premiumFeaturesBlocked() && tnVar.getParentActivity() != null) {
            org.telegram.ui.Components.sw0 sw0Var = new org.telegram.ui.Components.sw0(this.C.getContext(), null, 1, -1, messageObject.getDocument(), tnVar.getResourceProvider());
            sw0Var.f29364b.setText(tL_messages_stickerSet.set.title);
            sw0Var.f29365c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(tnVar.getParentActivity(), tnVar.getResourceProvider(), true);
            sw0Var.setButton(kcVar);
            kcVar.f30007a = new org.telegram.ui.Components.voip.o(15, this, messageObject);
            kcVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.mc g10 = org.telegram.ui.Components.mc.g(tnVar, sw0Var, 2750);
            g10.f30646b = messageObject.getId();
            g10.j();
        }
    }

    public ry(tn tnVar, FrameLayout frameLayout, org.telegram.ui.Components.jl0 jl0Var, int i10, long j10, long j11) {
        this.f42225a = tnVar;
        this.C = frameLayout;
        this.D = jl0Var;
        this.f42226b = i10;
        this.E = j10;
        this.F = j11;
    }

    public void h(qy qyVar) {
    }

    public void i() {
    }
}
