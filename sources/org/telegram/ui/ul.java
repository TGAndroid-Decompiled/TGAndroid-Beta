package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;

public final class ul implements org.telegram.ui.Cells.t0 {

    public final dm f43247a;

    public ul(dm dmVar) {
        this.f43247a = dmVar;
    }

    @Override
    public final void A1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        rn rnVar = this.f43247a.M;
        if (str != null) {
            c(v0Var);
            we.d dVar = rnVar.wb;
            cg.k1 k1Var = cg.k1.O0;
            cg.g1.T(LaunchActivity.R(), str, dVar);
            return;
        }
        ag.y2 y2Var = new ag.y2(rnVar, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.i(), new ag.p(tL_premiumGiftOption), null, rnVar.f41983aa);
        y2Var.F0 = false;
        y2Var.Y = v0Var.getMessageObject().isOut();
        rnVar.showDialog(y2Var);
    }

    @Override
    public final void C(org.telegram.ui.Cells.v0 v0Var, int i10) {
        d5.i iVar = new d5.i(this, v0Var, i10, 29);
        rn rnVar = this.f43247a.M;
        if (!rnVar.f42252w0.J) {
            iVar.run();
        } else {
            rnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(iVar, 80L);
        }
    }

    @Override
    public final void I(org.telegram.ui.Cells.v0 v0Var) {
        nj njVar;
        rn rnVar = this.f43247a.M;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        kj kjVar = rnVar.f42213t0;
        if (kjVar != null && (njVar = rnVar.f42239v0) != null && njVar.f5729y < 0) {
            for (int childCount = kjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = rnVar.f42213t0.getChildAt(childCount);
                rnVar.f42213t0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (!(childAt instanceof org.telegram.ui.Cells.s1)) {
                        if (childAt instanceof org.telegram.ui.Cells.v0) {
                            rnVar.L8(childAt);
                            break;
                        }
                    } else {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            rnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
        }
        rnVar.rc(messageObject, false);
    }

    @Override
    public final void J(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        h3.f0 f0Var = new h3.f0(this, v0Var, i10, i11, 3);
        rn rnVar = this.f43247a.M;
        if (!rnVar.f42252w0.J) {
            f0Var.run();
        } else {
            rnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(f0Var, 80L);
        }
    }

    @Override
    public final void K(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize closestVideoSizeWithSize;
        TLRPC.VideoSize emojiMarkup;
        Object obj;
        String str;
        MessageObject messageObject = v0Var.getMessageObject();
        PhotoViewer photoViewerT1 = PhotoViewer.t1();
        rn rnVar = this.f43247a.M;
        photoViewerT1.K2(null, rnVar, rnVar.f41983aa);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            jh.i9 orCreateStoryViewer = rnVar.getOrCreateStoryViewer();
            kj kjVar = rnVar.f42213t0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (rnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(rnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, jh.b7.a(kjVar));
                return;
            }
            return;
        }
        if (v0Var.getMessageObject().type == 22) {
            MessagesController messagesController = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount);
            RadialProgress2 radialProgress2 = v0Var.f25783x1;
            if (radialProgress2 != null && radialProgress2.f26470i.f28309q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                rnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.D0;
            if (messageObject3 == null || !v0Var.L(messageObject3) || v0Var.l1 == null) {
                rnVar.xb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper.pattern || wallPaper.document == null) {
                    String str2 = wallPaper.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                    int i10 = wallPaperSettings.background_color;
                    int i11 = wallPaperSettings.second_background_color;
                    int i12 = wallPaperSettings.third_background_color;
                    int i13 = wallPaperSettings.fourth_background_color;
                    int wallpaperRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                    TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper.settings;
                    wh1 wh1Var = new wh1(str2, i10, i11, i12, i13, wallpaperRotation, wallPaperSettings2.intensity / 100.0f, wallPaperSettings2.motion, null);
                    obj = wh1Var;
                    if (wallPaper instanceof TLRPC.TL_wallPaper) {
                        wh1Var.f44125g = (TLRPC.TL_wallPaper) wallPaper;
                        obj = wh1Var;
                    }
                } else {
                    obj = wallPaper;
                }
                boolean zQ = org.telegram.ui.ActionBar.g6.I.q();
                vb1 vb1Var = new vb1(obj, rnVar, zQ);
                TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
                if (wallPaperSettings3 != null) {
                    boolean z10 = wallPaperSettings3.blur;
                    boolean z11 = wallPaperSettings3.motion;
                    float f10 = wallPaperSettings3.intensity / 100.0f;
                    vb1Var.B1 = z10;
                    vb1Var.A1 = z11;
                    vb1Var.f40764j1 = f10;
                }
                vb1Var.m0 = messageObject;
                vb1Var.c1(messageObject.getDialogId());
                vb1Var.f40735a.f40429a = rnVar.f41983aa;
                vb1Var.l1 = new wb1(rnVar, zQ);
                rnVar.presentFragment(vb1Var);
                return;
            }
            return;
        }
        ArrayList<TLRPC.VideoSize> arrayList = messageObject.messageOwner.action.photo.video_sizes;
        if (arrayList == null || arrayList.isEmpty()) {
            closestVideoSizeWithSize = null;
            emojiMarkup = null;
        } else {
            closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(messageObject.messageOwner.action.photo.video_sizes, 1000);
            emojiMarkup = FileLoader.getEmojiMarkup(messageObject.messageOwner.action.photo.video_sizes);
        }
        if (v0Var.getMessageObject().type != 21 || messageObject.isOutOwner()) {
            if (closestVideoSizeWithSize != null) {
                PhotoViewer.t1().d2(closestVideoSizeWithSize.location, ImageLocation.getForPhoto(closestVideoSizeWithSize, messageObject.messageOwner.action.photo), rnVar.Ba);
                if (v0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, rnVar.Ba);
                return;
            }
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), rnVar.Ba);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                return;
            }
            return;
        }
        if (messageObject.settingAvatar) {
            return;
        }
        if (emojiMarkup != null) {
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(0, true, true);
            j40Var.f29569a = rnVar;
            j40Var.f();
            j40Var.f29571c.f28650f0.r0(null, emojiMarkup, 0L);
            j40Var.f29570b = new a9.d(rnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], rnVar.getUserConfig().getClientUserId(), 3);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(closestVideoSizeWithSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = rnVar.getFileLoader();
        File pathToAttach = closestVideoSizeWithSize == null ? fileLoader.getPathToAttach(messageObject.messageOwner.action.photo) : fileLoader.getPathToAttach(closestVideoSizeWithSize);
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        if (!pathToAttach.exists()) {
            if (!file.exists()) {
                return;
            } else {
                pathToAttach = file;
            }
        }
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, pathToAttach.getAbsolutePath(), 0, false, 0, 0, 0L);
        photoEntry.caption = rnVar.U.getFieldText();
        photoEntry.isVideo = closestVideoSizeWithSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().f2(arrayList2, 0, 1, false, new tl(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.h40 h40Var = new org.telegram.ui.Components.h40(1, rnVar.getUserConfig().getCurrentUser());
        h40Var.f28927e = closestVideoSizeWithSize != null;
        h40Var.f28925b = rnVar.getMessagesController().getUser(Long.valueOf(rnVar.P5));
        PhotoViewer.t1().x2(h40Var);
    }

    @Override
    public final void S(org.telegram.ui.Cells.v0 v0Var) {
        rn rnVar = this.f43247a.M;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.getResourceProvider());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            rnVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
            }
        }
    }

    @Override
    public final void T1(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        rn rnVar = this.f43247a.M;
        cg.g1.T(rnVar, str, rnVar.wb);
    }

    @Override
    public final void Z0(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        nk nkVar = this.f43247a.M.f42223ta;
        FrameLayout frameLayout = nkVar.C;
        HashMap map = nkVar.f42716f;
        Random random = nkVar.h;
        ArrayList arrayList = nkVar.B;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = v0Var.getPhotoImage().getImageHeight();
            float imageWidth = v0Var.getPhotoImage().getImageWidth();
            if (imageHeight <= 0.0f || imageWidth <= 0.0f) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < arrayList.size()) {
                if (((ry) arrayList.get(i11)).f42372p == v0Var.getMessageObject().getId()) {
                    i12++;
                    if (((ry) arrayList.get(i11)).f42374r.getLottieAnimation() == null || ((ry) arrayList.get(i11)).f42374r.getLottieAnimation().w()) {
                        return;
                    }
                }
                if (((ry) arrayList.get(i11)).f42373q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((ry) arrayList.get(i11)).f42373q.f22386id == document.f22386id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            ry ryVar = new ry();
            ryVar.h = true;
            if (!ryVar.f42365i) {
                ryVar.f42363f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                ryVar.f42364g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            ryVar.f42372p = v0Var.getMessageObject().getId();
            ryVar.f42369m = true;
            ryVar.f42374r.setAllowStartAnimation(true);
            int iF = sy.f();
            if (i13 > 0) {
                Integer num = (Integer) map.get(Long.valueOf(document.f22386id));
                int iIntValue = num == null ? 0 : num.intValue();
                map.put(Long.valueOf(document.f22386id), Integer.valueOf((iIntValue + 1) % 4));
                ryVar.f42374r.setUniqKeyPrefix(iIntValue + "_" + ryVar.f42372p + "_");
            }
            ryVar.f42373q = document;
            ryVar.f42374r.setImage(ImageLocation.getForDocument(videoSize, document), com.google.android.recaptcha.internal.a.l(iF, "_", iF), null, "tgs", nkVar.f42714c, 1);
            ryVar.f42374r.setLayerNum(Integer.MAX_VALUE);
            ryVar.f42374r.setAutoRepeat(0);
            if (ryVar.f42374r.getLottieAnimation() != null) {
                if (ryVar.h) {
                    ryVar.f42374r.getLottieAnimation().L(0, false, true);
                }
                ryVar.f42374r.getLottieAnimation().start();
            }
            arrayList.add(ryVar);
            if (nkVar.f42717n) {
                ryVar.f42374r.onAttachedToWindow();
                ryVar.f42374r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f43247a.M.b();
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        rn rnVar = this.f43247a.M;
        we.d dVar = rnVar.wb;
        if (dVar != null) {
            dVar.a(true);
        }
        rnVar.wb = v0Var.getMessageObject() == null ? null : new wm(this, v0Var, 6);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean g2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        rn rnVar = this.f43247a.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode) {
            return false;
        }
        return rnVar.I7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final void j2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f43247a.M.W7(v0Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void p1(long j10) {
        rn rnVar = this.f43247a.M;
        int i10 = rn.Dc;
        rnVar.na(j10);
    }

    @Override
    public final void q1(org.telegram.ui.Cells.v0 v0Var) {
        rn rnVar = this.f43247a.M;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || rnVar.N1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(rnVar.f42026e)) {
            rnVar.N1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            rnVar.N1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 y0() {
        return this.f43247a.M;
    }

    @Override
    public final void z0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
