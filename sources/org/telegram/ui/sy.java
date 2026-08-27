package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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

public class sy implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet H = new HashSet();
    public static final HashSet I;
    public o0.m A;
    public final FrameLayout C;
    public final org.telegram.ui.Components.zk0 D;
    public final long E;
    public final long F;
    public HashMap G;

    public final rn f42712a;

    public int f42713b;

    public TLRPC.TL_messages_stickerSet f42714c;

    public boolean f42717n;
    public String v;

    public ti f42722y;
    public boolean d = false;

    public final HashMap f42715e = new HashMap();

    public final HashMap f42716f = new HashMap();
    public final Random h = new Random();

    public int f42718r = -1;

    public long f42719s = 0;

    public final ArrayList f42720w = new ArrayList();

    public final ArrayList f42721x = new ArrayList();
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

    public sy(int i10, FrameLayout frameLayout) {
        this.C = frameLayout;
        this.f42713b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.s1 s1Var, float f10, int i10) {
        float centerY = s1Var.getPhotoImage().getCenterY() + s1Var.getY();
        return centerY > f10 && centerY < ((float) i10);
    }

    public static int f() {
        float fMin;
        float f10;
        if (AndroidUtilities.isTablet()) {
            fMin = AndroidUtilities.getMinTabletSide();
            f10 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (fMin * f10)) * 2.0f) / AndroidUtilities.density);
    }

    public static String q(String str) {
        CharSequence charSequenceConcat;
        int i10;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            if (i11 >= length - 1) {
                charSequenceConcat = str;
                if (charSequenceConcat.charAt(i11) == 65039) {
                    length--;
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i11), charSequenceConcat.subSequence(i11 + 1, charSequenceConcat.length()));
                    i11--;
                }
            } else if (charSequenceConcat.charAt(i11) == 55356) {
                int i12 = i11 + 1;
                if (charSequenceConcat.charAt(i12) < 57339 || charSequenceConcat.charAt(i12) > 57343) {
                    charSequenceConcat = str;
                    charSequenceConcat = str;
                    charSequenceConcat = str;
                    if (charSequenceConcat.charAt(i11) == 8205) {
                        i10 = i11 + 1;
                        if (charSequenceConcat.charAt(i10) != 9792 || charSequenceConcat.charAt(i10) == 9794) {
                        }
                        i11--;
                    }
                    charSequenceConcat = str;
                    if (charSequenceConcat.charAt(i11) == 65039) {
                        length--;
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i11), charSequenceConcat.subSequence(i11 + 1, charSequenceConcat.length()));
                        i11--;
                    }
                }
                charSequenceConcat = str;
                length -= 2;
                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i11), charSequenceConcat.subSequence(i11 + 2, charSequenceConcat.length()));
                i11--;
            } else {
                charSequenceConcat = str;
                charSequenceConcat = str;
                charSequenceConcat = str;
                if (charSequenceConcat.charAt(i11) == 8205) {
                    i10 = i11 + 1;
                    if (charSequenceConcat.charAt(i10) != 9792) {
                    }
                    charSequenceConcat = str;
                    length -= 2;
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i11), charSequenceConcat.subSequence(i11 + 2, charSequenceConcat.length()));
                    i11--;
                }
                charSequenceConcat = str;
                if (charSequenceConcat.charAt(i11) == 65039) {
                    length--;
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i11), charSequenceConcat.subSequence(i11 + 1, charSequenceConcat.length()));
                    i11--;
                }
            }
            i11++;
            charSequenceConcat = charSequenceConcat;
        }
        charSequenceConcat = str;
        return charSequenceConcat.toString();
    }

    public final void b() {
        if (this.d) {
            return;
        }
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f42713b).getStickerSetByName("EmojiAnimations");
        this.f42714c = stickerSetByName;
        if (stickerSetByName == null) {
            this.f42714c = MediaDataController.getInstance(this.f42713b).getStickerSetByEmojiOrName("EmojiAnimations");
        }
        if (this.f42714c == null) {
            MediaDataController.getInstance(this.f42713b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
        }
        if (this.f42714c != null) {
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < this.f42714c.documents.size(); i10++) {
                map.put(Long.valueOf(this.f42714c.documents.get(i10).f22386id), this.f42714c.documents.get(i10));
            }
            for (int i11 = 0; i11 < this.f42714c.packs.size(); i11++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.f42714c.packs.get(i11);
                if (!I.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = H;
                    hashSet.add(str);
                    ArrayList arrayList = new ArrayList();
                    String str2 = tL_stickerPack.emoticon;
                    HashMap map2 = this.f42715e;
                    map2.put(str2, arrayList);
                    for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                        arrayList.add((TLRPC.Document) map.get(tL_stickerPack.documents.get(i12)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i13 = 0; i13 < 8; i13++) {
                            String str3 = strArr[i13];
                            hashSet.add(str3);
                            map2.put(str3, arrayList);
                        }
                    }
                }
            }
            this.d = true;
        }
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ry) arrayList.get(i10)).f42374r.onDetachedFromWindow();
            if (((ry) arrayList.get(i10)).f42366j != null) {
                ((ry) arrayList.get(i10)).f42366j.d(this.C);
            }
            i10++;
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, MessageObject messageObject, int i11, boolean z10, boolean z11, float f10, float f11, boolean z12) {
        Random random;
        long j10;
        TLRPC.Document document2;
        int iAbs;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z13;
        ti tiVar;
        int iAbs2 = i11;
        boolean z14 = messageObject != null && messageObject.isPremiumSticker();
        boolean z15 = (messageObject == null || messageObject.getEffect() == null) ? false : true;
        if (z15 || z14 || H.contains(str)) {
            ArrayList arrayList = (ArrayList) this.f42715e.get(str);
            if (z15 || ((arrayList != null && !arrayList.isEmpty()) || z14)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.B;
                    if (i12 >= arrayList2.size()) {
                        if (z10 && z14 && i13 > 0) {
                            org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
                            if (ecVar != null && ecVar.f28014b == messageObject.getId()) {
                                return false;
                            }
                            TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                            TLRPC.TL_messages_stickerSet stickerSetByName = inputStickerSet.short_name != null ? MediaDataController.getInstance(this.f42713b).getStickerSetByName(inputStickerSet.short_name) : null;
                            if (stickerSetByName == null) {
                                stickerSetByName = MediaDataController.getInstance(this.f42713b).getStickerSetById(inputStickerSet.f22400id);
                            }
                            if (stickerSetByName != null) {
                                p(stickerSetByName, messageObject);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f42713b).sendRequest(tL_messages_getStickerSet, new gg(22, this, messageObject));
                            return false;
                        }
                        if (i13 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z15) {
                            TLRPC.TL_availableEffect effect = messageObject.getEffect();
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f42713b).getAvailableEffects();
                            if (availableEffects == null) {
                                return false;
                            }
                            j10 = 0;
                            long j11 = effect.effect_animation_id;
                            if (j11 == 0) {
                                j11 = effect.effect_sticker_id;
                            }
                            random = random2;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= availableEffects.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = availableEffects.documents.get(i15);
                                long j12 = j11;
                                if (document2 != null && document2.f22386id == j12) {
                                    break;
                                }
                                i15++;
                                j11 = j12;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (effect.effect_sticker_id != 0) {
                                premiumStickerAnimation = MessageObject.getPremiumStickerAnimation(document2);
                                z14 = premiumStickerAnimation != null;
                            } else {
                                premiumStickerAnimation = null;
                            }
                        } else {
                            random = random2;
                            j10 = 0;
                            if (z14) {
                                document2 = messageObject.getDocument();
                                premiumStickerAnimation = messageObject.getPremiumStickerAnimation();
                            } else {
                                if (messageObject == null || !messageObject.isAnimatedAnimatedEmoji()) {
                                    if (iAbs2 < 0 || iAbs2 > arrayList.size() - 1) {
                                        iAbs2 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(iAbs2);
                                } else {
                                    if (iAbs2 < 0 || iAbs2 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap map = this.G;
                                                Boolean bool = map != null ? (Boolean) map.get(Long.valueOf(document3.f22386id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i16));
                                                }
                                            }
                                        }
                                        iAbs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        iAbs = iAbs2;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(iAbs);
                                    iAbs2 = iAbs;
                                }
                                premiumStickerAnimation = null;
                            }
                        }
                        if (document2 == null && premiumStickerAnimation == null) {
                            return false;
                        }
                        ry ryVar = new ry();
                        ryVar.h = z14;
                        ryVar.f42365i = z15;
                        if (!z15) {
                            ryVar.f42363f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            ryVar.f42364g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        ryVar.f42372p = i10;
                        ryVar.f42373q = document2;
                        ryVar.f42369m = z12;
                        ryVar.f42374r.setAllowStartAnimation(true);
                        ryVar.f42374r.setAllowLottieVibration(z10);
                        boolean z16 = SharedConfig.getDevicePerformanceClass() <= 1 || !BuildVars.DEBUG_VERSION;
                        HashMap map2 = this.f42716f;
                        int i17 = iAbs2;
                        if (premiumStickerAnimation == null) {
                            int iF = f();
                            z13 = z14;
                            boolean z17 = z16;
                            Integer num = (Integer) map2.get(Long.valueOf(document2.f22386id));
                            int iIntValue = (num == null ? 0 : num.intValue()) + 1;
                            map2.put(Long.valueOf(document2.f22386id), Integer.valueOf(iIntValue));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            ryVar.f42374r.setUniqKeyPrefix(iIntValue + "_" + ryVar.f42372p + "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(iF);
                            sb2.append("_");
                            sb2.append(iF);
                            sb2.append(z17 ? "_pcache" : "");
                            ryVar.f42374r.setImage(forDocument, sb2.toString(), null, "tgs", this.f42714c, 1);
                            ryVar.f42374r.setDelegate(new qy(this, ryVar, z10, messageObject));
                            if (ryVar.f42374r.getLottieAnimation() != null) {
                                ryVar.f42374r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z13 = z14;
                            boolean z18 = z16;
                            int iF2 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) map2.get(Long.valueOf(document2.f22386id));
                                int iIntValue2 = num2 == null ? 0 : num2.intValue();
                                map2.put(Long.valueOf(document2.f22386id), Integer.valueOf((iIntValue2 + 1) % 4));
                                ryVar.f42374r.setUniqKeyPrefix(iIntValue2 + "_" + ryVar.f42372p + "_");
                            }
                            ryVar.f42373q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(iF2);
                            sb3.append("_");
                            sb3.append(iF2);
                            sb3.append(z18 ? "_pcache" : "");
                            ryVar.f42374r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f42714c, 1);
                        }
                        ryVar.f42374r.setLayerNum(Integer.MAX_VALUE);
                        ryVar.f42374r.setAutoRepeat(0);
                        if (ryVar.f42374r.getLottieAnimation() != null) {
                            if (ryVar.h) {
                                ryVar.f42374r.getLottieAnimation().L(0, false, true);
                            }
                            ryVar.f42374r.getLottieAnimation().start();
                        }
                        arrayList2.add(ryVar);
                        ryVar.f42374r.onAttachedToWindow();
                        ImageReceiver imageReceiver = ryVar.f42374r;
                        FrameLayout frameLayout = this.C;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z13 && UserConfig.getInstance(this.f42713b).clientUserId != this.E) {
                            int i18 = this.f42718r;
                            if (i18 != 0 && i18 != i10 && (tiVar = this.f42722y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(tiVar);
                                this.f42722y.run();
                            }
                            this.f42718r = i10;
                            this.v = str;
                            long j13 = this.f42719s;
                            ArrayList arrayList4 = this.f42721x;
                            ArrayList arrayList5 = this.f42720w;
                            if (j13 == j10) {
                                this.f42719s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f42719s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            ti tiVar2 = this.f42722y;
                            if (tiVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(tiVar2);
                                this.f42722y = null;
                            }
                            ti tiVar3 = new ti(this, 27);
                            this.f42722y = tiVar3;
                            AndroidUtilities.runOnUIThread(tiVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        MessagesController.getInstance(this.f42713b).sendTyping(this.E, this.F, 11, str, 0);
                        return true;
                    }
                    if (((ry) arrayList2.get(i12)).f42372p == i10) {
                        i13++;
                        if (!z15 && (((ry) arrayList2.get(i12)).f42374r.getLottieAnimation() == null || ((ry) arrayList2.get(i12)).f42374r.getLottieAnimation().w())) {
                            return false;
                        }
                    }
                    if (((ry) arrayList2.get(i12)).f42373q != null && document != null) {
                        if (((ry) arrayList2.get(i12)).f42373q.f22386id == document.f22386id) {
                            i14++;
                        }
                    }
                    i12++;
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
        if (i10 != i12) {
            if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f42713b).getPrintingStringType(j10, this.F)) != null && printingStringType.intValue() == 5) {
                o0.m mVar = this.A;
                if (mVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(mVar);
                }
                this.A = null;
                return;
            }
            return;
        }
        if (this.f42712a == null) {
            return;
        }
        long jLongValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (jLongValue == j10 && H.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i13 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i14);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ec0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e9) {
                    e9.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        boolean zC;
        float y10;
        MessageObject messageObject;
        ImageReceiver photoImage;
        if (this.B.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (i10 < this.B.size()) {
            ry ryVar = (ry) this.B.get(i10);
            float f11 = 3.0f;
            if (this.f42712a != null) {
                ryVar.f42361c = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.D.getChildCount()) {
                        f10 = 3.0f;
                        y10 = 0.0f;
                        break;
                    }
                    View childAt = this.D.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        messageObject = s1Var.getMessageObject();
                        photoImage = s1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        messageObject = v0Var.getMessageObject();
                        photoImage = v0Var.getPhotoImage();
                    } else {
                        messageObject = null;
                        photoImage = null;
                    }
                    if (messageObject != null && messageObject.getId() == ryVar.f42372p) {
                        ryVar.f42361c = true;
                        float x8 = childAt.getX() + this.D.getX();
                        float y11 = childAt.getY() + this.D.getY();
                        y10 = childAt.getY();
                        ryVar.d = photoImage.getImageWidth();
                        ryVar.f42362e = photoImage.getImageHeight();
                        if (!ryVar.f42365i || !(childAt instanceof org.telegram.ui.Cells.s1)) {
                            f10 = 3.0f;
                            if (!ryVar.h) {
                                float imageX = photoImage.getImageX() + x8;
                                float imageY = photoImage.getImageY() + y11;
                                float fDp = ryVar.f42369m ? ((-photoImage.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX : (-AndroidUtilities.dp(24.0f)) + imageX;
                                float imageWidth = imageY - photoImage.getImageWidth();
                                ryVar.f42359a = fDp;
                                ryVar.f42360b = imageWidth;
                                break;
                            }
                            ryVar.f42359a = photoImage.getImageX() + x8;
                            ryVar.f42360b = photoImage.getImageY() + y11;
                            break;
                        }
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        float f12 = (f() * AndroidUtilities.density) / 1.3f;
                        float f13 = f12 / f11;
                        ryVar.d = f13;
                        ryVar.f42362e = f13;
                        float timeX = s1Var2.getTimeX() + x8;
                        float f14 = f12 / 2.0f;
                        f10 = 3.0f;
                        ryVar.f42359a = Utilities.clamp(timeX - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
                        ryVar.f42360b = (s1Var2.getTimeY() + y11) - f14;
                        break;
                    }
                    i11++;
                    f11 = 3.0f;
                }
                if (!ryVar.f42361c || ryVar.f42362e + y10 < this.f42712a.f42160o9 || y10 > this.D.getMeasuredHeight() - this.f42712a.wa) {
                    ryVar.f42370n = true;
                }
                if (ryVar.h) {
                    float f15 = ryVar.f42362e / 2.0f;
                    boolean z10 = ((float) this.D.getMeasuredHeight()) - y10 <= f15;
                    boolean z11 = (y10 - this.f42712a.f42160o9) + f15 <= 0.0f;
                    if (z10 || z11) {
                        ryVar.f42370n = true;
                    }
                }
                if (ryVar.f42370n) {
                    float f16 = ryVar.f42371o;
                    if (f16 != 1.0f) {
                        float fClamp = Utilities.clamp(f16 + 0.10666667f, 1.0f, 0.0f);
                        ryVar.f42371o = fClamp;
                        ryVar.f42374r.setAlpha(1.0f - fClamp);
                        this.f42712a.T0.invalidate();
                    }
                }
            } else {
                f10 = 3.0f;
                h(ryVar);
            }
            boolean z12 = !ryVar.f42368l && ryVar.f42370n;
            if (!z12) {
                if (!ryVar.h || ryVar.f42365i) {
                    ig.d dVar = ryVar.f42366j;
                    if (dVar != null) {
                        float f17 = ryVar.f42359a + ryVar.f42363f;
                        float f18 = ryVar.f42360b + ryVar.f42364g;
                        float f19 = ryVar.d * f10;
                        dVar.e((int) f17, (int) f18, (int) (f17 + f19), (int) (f18 + f19));
                        ryVar.f42366j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver = ryVar.f42374r;
                        float f20 = ryVar.f42359a + ryVar.f42363f;
                        float f21 = ryVar.f42360b + ryVar.f42364g;
                        float f22 = ryVar.d * f10;
                        imageReceiver.setImageCoords(f20, f21, f22, f22);
                        if (ryVar.f42369m) {
                            ryVar.f42374r.draw(canvas);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, ryVar.f42374r.getCenterX(), ryVar.f42374r.getCenterY());
                            ryVar.f42374r.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    float f23 = ryVar.f42362e;
                    float f24 = 1.49926f * f23;
                    float f25 = 0.0546875f * f24;
                    float f26 = (((f23 / 2.0f) + ryVar.f42360b) - (f24 / 2.0f)) - (0.00279f * f24);
                    if (ryVar.f42369m) {
                        ryVar.f42374r.setImageCoords(((ryVar.f42359a + ryVar.d) - f24) + f25, f26, f24, f24);
                    } else {
                        ryVar.f42374r.setImageCoords(ryVar.f42359a - f25, f26, f24, f24);
                    }
                    if (ryVar.f42369m) {
                        ryVar.f42374r.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, ryVar.f42374r.getCenterX(), ryVar.f42374r.getCenterY());
                        ryVar.f42374r.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            ig.d dVar2 = ryVar.f42366j;
            if (dVar2 != null) {
                zC = dVar2.c();
            } else {
                zC = ryVar.f42368l && ryVar.f42374r.getLottieAnimation() != null && ryVar.f42374r.getLottieAnimation().X >= ryVar.f42374r.getLottieAnimation().f31312e[0] + (-2);
            }
            if (ryVar.f42371o == 1.0f || zC || z12) {
                ry ryVar2 = (ry) this.B.remove(i10);
                if (ryVar.h && ryVar.f42374r.getLottieAnimation() != null) {
                    ryVar2.f42374r.getLottieAnimation().L(0, true, true);
                }
                ryVar2.f42374r.onDetachedFromWindow();
                ig.d dVar3 = ryVar2.f42366j;
                if (dVar3 != null) {
                    dVar3.d(this.C);
                }
                i10--;
            } else if (ryVar.f42374r.getLottieAnimation() != null && ryVar.f42374r.getLottieAnimation().f31317h0) {
                ryVar.f42368l = true;
            } else if (ryVar.f42374r.getLottieAnimation() != null && !ryVar.f42374r.getLottieAnimation().f31317h0) {
                ryVar.f42374r.getLottieAnimation().L(0, true, false);
                ryVar.f42374r.getLottieAnimation().start();
            }
            i10++;
        }
        if (this.B.isEmpty()) {
            i();
        }
        this.C.invalidate();
    }

    public final boolean g() {
        return this.B.isEmpty();
    }

    public final void j() {
        this.f42717n = true;
        b();
        NotificationCenter.getInstance(this.f42713b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f42713b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f42713b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((ry) arrayList.get(i10)).f42374r.onAttachedToWindow();
            if (((ry) arrayList.get(i10)).f42366j != null) {
                ((ry) arrayList.get(i10)).f42366j.f(this.C);
            }
            i10++;
        }
    }

    public final void k() {
        int i10 = 0;
        this.f42717n = false;
        NotificationCenter.getInstance(this.f42713b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f42713b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f42713b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((ry) arrayList.get(i10)).f42374r.onDetachedFromWindow();
            if (((ry) arrayList.get(i10)).f42366j != null) {
                ((ry) arrayList.get(i10)).f42366j.d(this.C);
            }
            i10++;
        }
    }

    public final void l(org.telegram.ui.Cells.s1 s1Var, rn rnVar, boolean z10) {
        if (rnVar.x() || s1Var.getMessageObject() == null || s1Var.getMessageObject().getId() < 0) {
            return;
        }
        if (s1Var.getMessageObject().isPremiumSticker() || rnVar.f42039f != null) {
            boolean z11 = false;
            boolean zO = o(s1Var, -1, z10, false);
            int i10 = 3;
            if (z10 && zO && !EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                try {
                    s1Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            boolean zIsPremiumSticker = s1Var.getMessageObject().isPremiumSticker();
            long j10 = this.E;
            if (zIsPremiumSticker || s1Var.getEffect() != null || (!z10 && s1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                s1Var.getMessageObject().forcePlayEffect = false;
                s1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                rnVar.getMessagesStorage().updateMessageCustomParams(j10, s1Var.getMessageObject().messageOwner);
                return;
            }
            Integer printingStringType = MessagesController.getInstance(this.f42713b).getPrintingStringType(j10, this.F);
            if ((printingStringType == null || printingStringType.intValue() != 5) && this.A == null && zO) {
                org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
                if ((ecVar == null || !ecVar.f28022l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f42713b).getClientUserId() != rnVar.f42039f.f22527id) {
                    SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                    org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(rnVar.getParentActivity(), null, 1, -1, s1Var.getMessageObject().isAnimatedAnimatedEmoji() ? s1Var.getMessageObject().getDocument() : MediaDataController.getInstance(this.f42713b).getEmojiAnimatedSticker(s1Var.getMessageObject().getStickerEmoji()), rnVar.getResourceProvider());
                    kw0Var.f26725c.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, rnVar.f42039f.first_name));
                    TextView textView = kw0Var.f26724b;
                    textView.setText(Emoji.replaceEmoji(spannableStringBuilderReplaceTags, textView.getPaint().getFontMetricsInt(), false));
                    textView.setTypeface(null);
                    textView.setMaxLines(3);
                    textView.setSingleLine(false);
                    o0.m mVar = new o0.m(this, org.telegram.ui.Components.ec.g(rnVar, kw0Var, 2750), z11, i10);
                    this.A = mVar;
                    AndroidUtilities.runOnUIThread(mVar, 1500L);
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap map = this.G;
        if (map == null || !map.containsKey(Long.valueOf(document.f22386id))) {
            if (this.G == null) {
                this.G = new HashMap();
            }
            this.G.put(Long.valueOf(document.f22386id), Boolean.TRUE);
            MediaDataController.getInstance(this.f42713b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void n(org.telegram.ui.Cells.s1 s1Var) {
        ArrayList arrayList;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.isPremiumSticker()) {
            return;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        String strQ = q(stickerEmoji);
        if (!H.contains(strQ) || (arrayList = (ArrayList) this.f42715e.get(strQ)) == null || arrayList.isEmpty()) {
            return;
        }
        int iMin = Math.min(1, arrayList.size());
        for (int i10 = 0; i10 < iMin; i10++) {
            m((TLRPC.Document) arrayList.get(i10));
        }
    }

    public final boolean o(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10, boolean z11) {
        if (s1Var == null || this.B.size() > 12) {
            return false;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (s1Var.getEffect() == null && !s1Var.getPhotoImage().hasNotThumb()) {
            return false;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        if (s1Var.getEffect() == null && stickerEmoji == null) {
            return false;
        }
        float imageHeight = s1Var.getPhotoImage().getImageHeight();
        float imageWidth = s1Var.getPhotoImage().getImageWidth();
        if (s1Var.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
            return d(q(stickerEmoji), s1Var.getMessageObject().getId(), s1Var.getMessageObject().getDocument(), messageObject, i10, z10, z11, imageWidth, imageHeight, s1Var.getMessageObject().isOutOwner());
        }
        return false;
    }

    public final void p(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        rn rnVar = this.f42712a;
        if (rnVar == null || MessagesController.getInstance(this.f42713b).premiumFeaturesBlocked() || rnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(this.C.getContext(), null, 1, -1, messageObject.getDocument(), rnVar.getResourceProvider());
        kw0Var.f26724b.setText(tL_messages_stickerSet.set.title);
        kw0Var.f26725c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
        org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(rnVar.getParentActivity(), rnVar.getResourceProvider(), true);
        kw0Var.setButton(ccVar);
        ccVar.f27402a = new org.telegram.ui.Components.r61(18, this, messageObject);
        ccVar.e(LocaleController.getString(R.string.ViewAction));
        org.telegram.ui.Components.ec ecVarG = org.telegram.ui.Components.ec.g(rnVar, kw0Var, 2750);
        ecVarG.f28014b = messageObject.getId();
        ecVarG.j();
    }

    public sy(rn rnVar, FrameLayout frameLayout, org.telegram.ui.Components.zk0 zk0Var, int i10, long j10, long j11) {
        this.f42712a = rnVar;
        this.C = frameLayout;
        this.D = zk0Var;
        this.f42713b = i10;
        this.E = j10;
        this.F = j11;
    }

    public void h(ry ryVar) {
    }

    public void i() {
    }
}
