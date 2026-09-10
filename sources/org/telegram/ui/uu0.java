package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class uu0 implements Runnable {
    public final int f37343a;
    public final Object f37344b;
    public final int f37345c;
    public final Object d;

    public uu0(Object obj, int i10, Object obj2, int i11) {
        this.f37343a = i11;
        this.f37344b = obj;
        this.f37345c = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wc a02;
        int i10;
        int i11;
        boolean z10;
        int i12 = this.f37343a;
        String str = null;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = true;
        int i14 = this.f37345c;
        Object obj = this.d;
        Object obj2 = this.f37344b;
        switch (i12) {
            case 0:
                vu0 vu0Var = (vu0) obj2;
                Uri uri = (Uri) obj;
                vu0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i15 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(file, true, 0L, 0, null, null, null, 0L, i15, false, point.x, point.y, null, 0, true);
                    Bitmap q6 = c6Var.q(0L, false);
                    c6Var.u();
                    AndroidUtilities.runOnUIThread(new uu0(vu0Var, i14, q6, 1));
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new ql0(vu0Var, 22));
                    return;
                }
            case 1:
                vu0 vu0Var2 = (vu0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i14 == vu0Var2.f37624a) {
                    vu0Var2.setImageBitmap(bitmap);
                    vu0Var2.f37626c = true;
                    vu0Var2.f37625b = false;
                    return;
                }
                return;
            case 2:
                ow0 ow0Var = (ow0) obj2;
                ((df) obj).run(Integer.valueOf(i14));
                ow0Var.c((i14 == 1 || i14 == 13) ? true : true);
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i14 == profileActivity.W2) {
                    a02 = org.telegram.ui.Components.wc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.wc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.em.o(i10, a02);
                return;
            case 4:
                f11 f11Var = (f11) obj2;
                s4.c1 c1Var = (s4.c1) obj;
                f11Var.getClass();
                if (c1Var.b() == i14 && f11Var.e.U2 == i14 && c1Var.f41613f == 2) {
                    f11Var.v(c1Var, i14);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.wc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i14).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.hy) obj);
                return;
            case 6:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i14).disableAds(false);
                return;
            case 7:
                pe1 pe1Var = (pe1) obj2;
                ((df) obj).run(Integer.valueOf(i14));
                pe1Var.c((i14 == 1 || i14 == 13) ? true : true);
                return;
            case 8:
                nj1 nj1Var = (nj1) obj2;
                TLObject tLObject = (TLObject) obj;
                HashMap hashMap = nj1Var.e;
                WallpapersListActivity wallpapersListActivity = nj1Var.E;
                ArrayList arrayList = nj1Var.d;
                if (i14 == nj1Var.v) {
                    nj1Var.f35297s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        nj1Var.f35296r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i16);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.f17193id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                    if (closestPhotoSizeWithSize != null) {
                                        searchImage.width = closestPhotoSizeWithSize.f17220w;
                                        searchImage.height = closestPhotoSizeWithSize.h;
                                        searchImage.photoSize = closestPhotoSizeWithSize;
                                        searchImage.photo = botInlineResult.photo;
                                        searchImage.size = closestPhotoSizeWithSize.size;
                                        searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                        searchImage.f14639id = botInlineResult.f17193id;
                                        searchImage.type = 0;
                                        arrayList.add(searchImage);
                                        hashMap.put(searchImage.f14639id, searchImage);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i17);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.f17202w;
                                                searchImage.height = documentAttribute.h;
                                            } else {
                                                i17++;
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
                                    searchImage.f14639id = botInlineResult.f17193id;
                                    searchImage.type = 0;
                                    arrayList.add(searchImage);
                                    hashMap.put(searchImage.f14639id, searchImage);
                                }
                            }
                        }
                        nj1Var.f35294f = (size == arrayList.size() || nj1Var.f35296r == null) ? true : true;
                    }
                    if (size != arrayList.size()) {
                        int i18 = size % wallpapersListActivity.R;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / i11);
                        if (i18 != 0) {
                            nj1Var.m(((int) Math.ceil(f7 / wallpapersListActivity.R)) - 1);
                        }
                        wallpapersListActivity.J.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.R)) - ceil);
                    }
                    wallpapersListActivity.N.c();
                    return;
                }
                return;
            case 9:
                pg.m0 m0Var = (pg.m0) obj2;
                og.l lVar = (og.l) obj;
                if (m0Var.W0.getCurrentBrush() instanceof og.l) {
                    m0Var.f40142k1 = true;
                }
                m0Var.B(lVar);
                pg.r1 r1Var = m0Var.f40154t1;
                int i19 = r1Var.d + 1;
                r1Var.a(i19);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.f40272a[i19], i14);
                r1Var.e = true;
                return;
            case 10:
                ((r4.c) ((p4.s0) obj2).f39777c).x(i14, obj);
                return;
            case 11:
                org.telegram.ui.Components.wr0 wr0Var = (org.telegram.ui.Components.wr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                xh.l5 l5Var = wr0Var.e;
                if (i14 != -1) {
                    int i20 = tL_starGiftCollection.collection_id;
                    int i21 = l5Var.f45662a;
                    int f10 = l5Var.f(i20);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) l5Var.e.remove(f10);
                        l5Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i21).getInputPeer(l5Var.f45663b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i21).sendRequest(deletestargiftcollection, null);
                    }
                    wr0Var.f(true);
                    org.telegram.ui.Components.u81 u81Var = wr0Var.f44321n;
                    if (i14 < l5Var.d().size()) {
                        i14++;
                    }
                    u81Var.d(-1, i14);
                    wr0Var.n();
                    return;
                }
                return;
            case 12:
                xh.x2 x2Var = (xh.x2) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int[] iArr = x2Var.V;
                xh.t2 t2Var = x2Var.f46252f;
                xh.q2 q2Var = x2Var.h;
                if (starGift != null) {
                    xh.v2 v2Var = new xh.v2(x2Var.getContext());
                    v2Var.a(starGift, false);
                    v2Var.setRotation(180.0f);
                    q2Var.f(i14, v2Var);
                    v2Var.setScaleX(0.5f);
                    v2Var.setScaleY(0.5f);
                    v2Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = v2Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(wrVar);
                    interpolator.setUpdateListener(new qg.o(x2Var, 7));
                    interpolator.start();
                    q2Var.f45912a[i14].setVisibility(8);
                    t2Var.setVisibility(0);
                    t2Var.setAlpha(0.0f);
                    t2Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(wrVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(x2Var.getContext());
                ?? imageView = new ImageView(x2Var.getContext());
                imageView.f(R.raw.gift_broken, 32, 32, null);
                frameLayout.addView((View) imageView, w7.a6.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                x2Var.f46259l0 = imageView;
                frameLayout.setBackground(new xh.k3(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.l1(0.075f, -1)));
                q2Var.f45912a[i14].setVisibility(8);
                frameLayout.setRotation(180.0f);
                q2Var.f(i14, frameLayout);
                x2Var.F.a(iArr[2], iArr[3]);
                xh.w2 w2Var = x2Var.f46246b;
                int[] iArr2 = x2Var.U;
                w2Var.a(iArr2[2], iArr2[3]);
                t2Var.a(iArr[3], iArr[2]);
                return;
            case 13:
                ((Utilities.Callback3) obj).run(LocaleController.formatString(R.string.Gift2RarityHint, di.m.G0(i14)), (xh.n3) obj2, Boolean.FALSE);
                return;
            case 14:
                xh.v5 v5Var = (xh.v5) obj2;
                TLObject tLObject2 = (TLObject) obj;
                boolean[] zArr = v5Var.f46190r;
                ArrayList[] arrayListArr = v5Var.f46189q;
                int i22 = v5Var.f46176a;
                v5Var.f46192t[i14] = false;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i22).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i22).putChats(starsStatus.chats, false);
                    arrayListArr[i14].addAll(starsStatus.history);
                    if (arrayListArr[i14].isEmpty() && !zArr[i14]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr[i14] = z10;
                    boolean[] zArr2 = v5Var.f46193u;
                    if ((starsStatus.flags & 1) != 0) {
                        z14 = false;
                    }
                    zArr2[i14] = z14;
                    String[] strArr = v5Var.f46191s;
                    if (!z14) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i14] = str;
                    v5Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 15:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i14).linkPrefix + "/nft/" + ((String) obj));
                return;
            case 16:
                yg.s sVar = (yg.s) obj2;
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj;
                Editable text = sVar.f47137n.getText();
                int spanStart = text.getSpanStart(y5Var);
                int spanEnd = text.getSpanEnd(y5Var);
                int i23 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.f47137n.getText().delete(spanStart, spanEnd);
                    yg.p pVar = sVar.f47137n;
                    pVar.setSelection(Math.min(i14 - i23, pVar.getText().length()));
                    return;
                }
                return;
            case 17:
                ((zh.t0) obj2).F.put((String) obj, Integer.valueOf(i14));
                return;
            case 18:
                TLObject tLObject3 = (TLObject) obj2;
                ta0 ta0Var = (ta0) obj;
                if (tLObject3 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList2 = ((TL_stories.TL_albums) tLObject3).albums;
                    int size3 = arrayList2.size();
                    while (i13 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList2.get(i13);
                        i13++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i14) {
                            ta0Var.accept(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                ta0Var.accept(null);
                return;
            default:
                zh.u7 u7Var = ((zh.l7) obj2).d;
                zh.k7 k7Var = u7Var.f48947n0;
                int i24 = u7Var.h;
                k7Var.A0 = (ArrayList) obj;
                k7Var.f48419y0 = i24;
                k7Var.setAdapter(null);
                k7Var.setAdapter(k7Var.f48420z0);
                k7Var.setCurrentItem(i14);
                k7Var.C0 = true;
                return;
        }
    }

    public uu0(Object obj, Object obj2, int i10, int i11) {
        this.f37343a = i11;
        this.f37344b = obj;
        this.d = obj2;
        this.f37345c = i10;
    }
}
