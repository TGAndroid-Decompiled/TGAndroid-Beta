package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class zt0 implements Runnable {
    public final int f40861a;
    public final Object f40862b;
    public final int f40863c;
    public final Object d;

    public zt0(Object obj, int i10, Object obj2, int i11) {
        this.f40861a = i11;
        this.f40862b = obj;
        this.f40863c = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        int i11;
        switch (this.f40861a) {
            case 0:
                au0 au0Var = (au0) this.f40862b;
                Uri uri = (Uri) this.d;
                int i12 = this.f40863c;
                au0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i13 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(file, true, 0L, 0, null, null, null, 0L, i13, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = y5Var.q(0L, false);
                    y5Var.u();
                    AndroidUtilities.runOnUIThread(new zt0(au0Var, i12, q10, 1));
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new el0(au0Var, 23));
                    return;
                }
            case 1:
                au0 au0Var2 = (au0) this.f40862b;
                Bitmap bitmap = (Bitmap) this.d;
                if (this.f40863c == au0Var2.f32702a) {
                    au0Var2.setImageBitmap(bitmap);
                    au0Var2.f32704c = true;
                    au0Var2.f32703b = false;
                    return;
                }
                return;
            case 2:
                rv0 rv0Var = (rv0) this.f40862b;
                int i14 = this.f40863c;
                ((xe) this.d).run(Integer.valueOf(i14));
                boolean z4 = true;
                if (i14 != 1 && i14 != 13) {
                    z4 = false;
                }
                rv0Var.c(z4);
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f40862b;
                AndroidUtilities.addToClipboard((String) this.d);
                if (this.f40863c == profileActivity.T2) {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                b.m(i10, a02);
                return;
            case 4:
                g01 g01Var = (g01) this.f40862b;
                f2.l1 l1Var = (f2.l1) this.d;
                g01Var.getClass();
                int b10 = l1Var.b();
                int i15 = this.f40863c;
                if (b10 == i15 && g01Var.e.R2 == i15 && l1Var.f5788f == 2) {
                    g01Var.v(l1Var, i15);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) this.f40862b).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f40863c).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.i80) this.d);
                return;
            case 6:
                ((org.telegram.messenger.video.a) this.f40862b).run();
                ((org.telegram.ui.Components.qc) this.d).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f40863c).disableAds(false);
                return;
            case 7:
                rd1 rd1Var = (rd1) this.f40862b;
                int i16 = this.f40863c;
                ((xe) this.d).run(Integer.valueOf(i16));
                boolean z10 = true;
                if (i16 != 1 && i16 != 13) {
                    z10 = false;
                }
                rd1Var.c(z10);
                return;
            case 8:
                pi1 pi1Var = (pi1) this.f40862b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = pi1Var.e;
                WallpapersListActivity wallpapersListActivity = pi1Var.B;
                ArrayList arrayList = pi1Var.d;
                if (this.f40863c == pi1Var.v) {
                    boolean z11 = false;
                    pi1Var.f37349s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        pi1Var.f37348r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i17);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.f19182id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                    if (closestPhotoSizeWithSize != null) {
                                        searchImage.width = closestPhotoSizeWithSize.f19209w;
                                        searchImage.height = closestPhotoSizeWithSize.h;
                                        searchImage.photoSize = closestPhotoSizeWithSize;
                                        searchImage.photo = botInlineResult.photo;
                                        searchImage.size = closestPhotoSizeWithSize.size;
                                        searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                        searchImage.f16663id = botInlineResult.f19182id;
                                        searchImage.type = 0;
                                        arrayList.add(searchImage);
                                        hashMap.put(searchImage.f16663id, searchImage);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i18);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.f19191w;
                                                searchImage.height = documentAttribute.h;
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument2.url;
                                    searchImage.size = webDocument2.size;
                                    searchImage.f16663id = botInlineResult.f19182id;
                                    searchImage.type = 0;
                                    arrayList.add(searchImage);
                                    hashMap.put(searchImage.f16663id, searchImage);
                                }
                            }
                        }
                        pi1Var.f37346f = (size == arrayList.size() || pi1Var.f37348r == null) ? true : true;
                    }
                    if (size != arrayList.size()) {
                        int i19 = size % wallpapersListActivity.O;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / i11);
                        if (i19 != 0) {
                            pi1Var.m(((int) Math.ceil(f10 / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.G.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f40862b;
                int i20 = this.f40863c;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.d;
                SendMessagesHelper.getInstance(a1Var.J).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var.J).getCurrentUser(), a1Var.R.f19331id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    org.telegram.ui.web.a1.u(i20, w0Var, "phone_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 10:
                ((FfmpegAudioWaveformLoader) this.f40862b).lambda$new$0((String) this.d, this.f40863c);
                return;
            case 11:
                ((FfmpegAudioWaveformLoader) this.f40862b).lambda$receiveChunk$1((short[]) this.d, this.f40863c);
                return;
            case 12:
                ph.c5 c5Var = (ph.c5) this.f40862b;
                cg.l lVar = (cg.l) this.d;
                if (c5Var.L0.getCurrentBrush() instanceof cg.l) {
                    c5Var.Z0 = true;
                }
                c5Var.x(lVar);
                dg.o2 o2Var = c5Var.f41339h1;
                int i21 = o2Var.d + 1;
                o2Var.a(i21);
                AndroidUtilities.updateImageViewImageAnimated(o2Var.f4691a[i21], this.f40863c);
                o2Var.e = true;
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hm(this.f40863c, ((MessagesStorage) this.f40862b).getUsers(new ArrayList<>((HashSet) this.d))));
                return;
            case 14:
                ((ph.ha) this.f40862b).b((short[]) this.d, this.f40863c);
                return;
            case 15:
                int[] iArr = (int[]) this.f40862b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                int i22 = iArr[0];
                int i23 = this.f40863c;
                if (i22 >= 0) {
                    ConnectionsManager.getInstance(i23).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i23).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    return;
                }
                return;
            case 16:
                rh.o3 o3Var = (rh.o3) this.f40862b;
                TLObject tLObject2 = (TLObject) this.d;
                rh.j3 j3Var = o3Var.f43641n;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    o3Var.f43645x = tL_webViewResultUrl.query_id;
                    if (tL_webViewResultUrl.same_origin) {
                        j3Var.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    j3Var.r(this.f40863c, tL_webViewResultUrl.url);
                    AndroidUtilities.runOnUIThread(o3Var.R);
                    return;
                }
                return;
            case 17:
                tf.z zVar = (tf.z) this.f40862b;
                String str = (String) this.d;
                int i24 = zVar.f44908p0;
                zVar.f44910r = null;
                int i25 = zVar.f44891a0;
                int i26 = this.f40863c;
                if (i26 == i25) {
                    if (zVar.f44905n >= 0) {
                        ConnectionsManager.getInstance(i24).cancelRequest(zVar.f44905n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    zVar.f44905n = ConnectionsManager.getInstance(i24).sendRequest(tL_channels_searchPosts, new gg.l0(zVar, i26, str, 10));
                    return;
                }
                return;
            case 18:
                uf.t tVar = (uf.t) this.f40862b;
                tVar.f45441b.add(this.f40863c, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(tVar.f45440a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 19:
                vh.l5 m9 = ((vh.i5) this.f40862b).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m9 != null) {
                    vh.d1 d1Var = m9.f46006a;
                    d1Var.r();
                    d1Var.setSelection(Math.max(0, Math.min(this.f40863c, d1Var.length())));
                    return;
                }
                return;
            default:
                vh.a aVar = (vh.a) this.d;
                vh.v5 v5Var = ((vh.q5) this.f40862b).f46096a;
                if (v5Var.f46246y != null) {
                    vh.v5.f(aVar.f45775b, "");
                    ((vh.a3) v5Var.f46246y).c(aVar, this.f40863c);
                    return;
                }
                return;
        }
    }

    public zt0(Object obj, Object obj2, int i10, int i11) {
        this.f40861a = i11;
        this.f40862b = obj;
        this.d = obj2;
        this.f40863c = i10;
    }
}
