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
public final class tl implements org.telegram.ui.Cells.t0 {
    public final bm f43027a;

    public tl(bm bmVar) {
        this.f43027a = bmVar;
    }

    @Override
    public final void E(org.telegram.ui.Cells.w0 w0Var, int i9) {
        rl rlVar = new rl(this, w0Var, i9, 0);
        qn qnVar = this.f43027a.M;
        if (qnVar.f42114w0.J) {
            qnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(rlVar, 80L);
            return;
        }
        rlVar.run();
    }

    @Override
    public final void I(org.telegram.ui.Cells.w0 w0Var) {
        lj ljVar;
        qn qnVar = this.f43027a.M;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        ij ijVar = qnVar.f42077t0;
        if (ijVar != null && (ljVar = qnVar.f42103v0) != null && ljVar.f5441y < 0) {
            int childCount = ijVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = qnVar.f42077t0.getChildAt(childCount);
                qnVar.f42077t0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            qnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        qnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        qnVar.rc(messageObject, false);
    }

    @Override
    public final void L(org.telegram.ui.Cells.w0 w0Var, int i9, int i10) {
        h3.e0 e0Var = new h3.e0(this, w0Var, i9, i10, 3);
        qn qnVar = this.f43027a.M;
        if (qnVar.f42114w0.J) {
            qnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(e0Var, 80L);
            return;
        }
        e0Var.run();
    }

    @Override
    public final void N1(org.telegram.ui.Cells.w0 w0Var, String str) {
        c(w0Var);
        qn qnVar = this.f43027a.M;
        bg.l1.S(qnVar, str, qnVar.f42124wb);
    }

    @Override
    public final void O(org.telegram.ui.Cells.w0 w0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File pathToAttach;
        boolean z10;
        int i9;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = w0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        qn qnVar = this.f43027a.M;
        t12.K2(null, qnVar, qnVar.f41848aa);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ih.m9 orCreateStoryViewer = qnVar.getOrCreateStoryViewer();
            ij ijVar = qnVar.f42077t0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (qnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(qnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ih.e7.a(ijVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i9);
            RadialProgress2 radialProgress2 = w0Var.f25880x1;
            if (radialProgress2 != null && radialProgress2.f26474i.f27111q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                qnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.D0;
            if (messageObject3 != null && w0Var.K(messageObject3) && w0Var.l1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        xh1 xh1Var = new xh1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = xh1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            xh1Var.f44525g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = xh1Var;
                        }
                    }
                    boolean q10 = org.telegram.ui.ActionBar.f6.I.q();
                    xb1 xb1Var = new xb1(wallPaper, qnVar, q10);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        xb1Var.B1 = z12;
                        xb1Var.A1 = z13;
                        xb1Var.f41085j1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    xb1Var.m0 = messageObject;
                    xb1Var.c1(messageObject.getDialogId());
                    xb1Var.f41056a.f41043a = qnVar.f41848aa;
                    xb1Var.l1 = new yb1(qnVar, q10);
                    qnVar.presentFragment(xb1Var);
                    return;
                }
                return;
            }
            qnVar.xb();
            return;
        }
        ArrayList<TLRPC.VideoSize> arrayList = messageObject.messageOwner.action.photo.video_sizes;
        if (arrayList != null && !arrayList.isEmpty()) {
            videoSize = FileLoader.getClosestVideoSizeWithSize(messageObject.messageOwner.action.photo.video_sizes, 1000);
            videoSize2 = FileLoader.getEmojiMarkup(messageObject.messageOwner.action.photo.video_sizes);
        } else {
            videoSize = null;
            videoSize2 = null;
        }
        if (w0Var.getMessageObject().type == 21 && !messageObject.isOutOwner()) {
            if (!messageObject.settingAvatar) {
                if (videoSize2 != null) {
                    org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
                    e40Var.f27909a = qnVar;
                    e40Var.f();
                    e40Var.f27911c.f30114f0.q0(null, videoSize2, 0L);
                    e40Var.f27910b = new c3.g(qnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], qnVar.getUserConfig().getClientUserId(), 1);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = qnVar.getFileLoader();
                if (videoSize == null) {
                    pathToAttach = fileLoader.getPathToAttach(messageObject.messageOwner.action.photo);
                } else {
                    pathToAttach = fileLoader.getPathToAttach(videoSize);
                }
                File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
                if (!pathToAttach.exists()) {
                    if (file.exists()) {
                        pathToAttach = file;
                    } else {
                        return;
                    }
                }
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, pathToAttach.getAbsolutePath(), 0, false, 0, 0, 0L);
                photoEntry.caption = qnVar.U.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().f2(arrayList2, 0, 1, false, new sl(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.c40 c40Var = new org.telegram.ui.Components.c40(1, qnVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                c40Var.f27363e = z11;
                c40Var.f27361b = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.P5));
                PhotoViewer.t1().x2(c40Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), qnVar.Ba);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), qnVar.Ba);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, qnVar.Ba);
        }
    }

    @Override
    public final void V0(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i9;
        lk lkVar = this.f43027a.M.f42087ta;
        FrameLayout frameLayout = lkVar.C;
        HashMap hashMap = lkVar.f41620f;
        Random random = lkVar.h;
        ArrayList arrayList = lkVar.B;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < arrayList.size()) {
                    if (((oy) arrayList.get(i10)).f41275p == w0Var.getMessageObject().getId()) {
                        i11++;
                        if (((oy) arrayList.get(i10)).f41277r.getLottieAnimation() == null || ((oy) arrayList.get(i10)).f41277r.getLottieAnimation().w()) {
                            return;
                        }
                    }
                    if (((oy) arrayList.get(i10)).f41276q != null && document != null) {
                        i9 = i10;
                        if (((oy) arrayList.get(i10)).f41276q.f22386id == document.f22386id) {
                            i12++;
                        }
                    } else {
                        i9 = i10;
                    }
                    i10 = i9 + 1;
                }
                if (i11 < 4) {
                    oy oyVar = new oy();
                    oyVar.h = true;
                    if (!oyVar.f41268i) {
                        oyVar.f41266f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        oyVar.f41267g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    oyVar.f41275p = w0Var.getMessageObject().getId();
                    oyVar.f41272m = true;
                    oyVar.f41277r.setAllowStartAnimation(true);
                    int f10 = py.f();
                    if (i12 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f22386id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f22386id), Integer.valueOf((intValue + 1) % 4));
                        oyVar.f41277r.setUniqKeyPrefix(intValue + "_" + oyVar.f41275p + "_");
                    }
                    oyVar.f41276q = document;
                    oyVar.f41277r.setImage(ImageLocation.getForDocument(videoSize, document), e2.c.l(f10, "_", f10), null, "tgs", lkVar.f41618c, 1);
                    oyVar.f41277r.setLayerNum(Integer.MAX_VALUE);
                    oyVar.f41277r.setAutoRepeat(0);
                    if (oyVar.f41277r.getLottieAnimation() != null) {
                        if (oyVar.h) {
                            oyVar.f41277r.getLottieAnimation().L(0, false, true);
                        }
                        oyVar.f41277r.getLottieAnimation().start();
                    }
                    arrayList.add(oyVar);
                    if (lkVar.f41621n) {
                        oyVar.f41277r.onAttachedToWindow();
                        oyVar.f41277r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.w0 w0Var, float f10, float f11) {
        boolean z10;
        qn qnVar = this.f43027a.M;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return qnVar.I7(w0Var, false, false, f10, f11, true, true, false);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final void a2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f43027a.M.W7(w0Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final long b() {
        return this.f43027a.M.b();
    }

    public final void c(org.telegram.ui.Cells.w0 w0Var) {
        vm vmVar;
        qn qnVar = this.f43027a.M;
        ve.d dVar = qnVar.f42124wb;
        if (dVar != null) {
            dVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            vmVar = null;
        } else {
            vmVar = new vm(this, w0Var, 6);
        }
        qnVar.f42124wb = vmVar;
    }

    @Override
    public final void c0(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.f43027a.M;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.getResourceProvider());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            qnVar.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
            }
        }
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void o1(long j10) {
        qn qnVar = this.f43027a.M;
        int i9 = qn.Dc;
        qnVar.na(j10);
    }

    @Override
    public final void p1(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.f43027a.M;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || qnVar.N1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(qnVar.f41890e)) {
            qnVar.N1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            qnVar.N1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void v1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i9;
        qn qnVar = this.f43027a.M;
        if (str == null) {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            zf.k1 k1Var = new zf.k1(qnVar, i9, qnVar.i(), new zf.k(tL_premiumGiftOption), null, qnVar.f41848aa);
            k1Var.F0 = false;
            k1Var.Y = w0Var.getMessageObject().isOut();
            qnVar.showDialog(k1Var);
            return;
        }
        c(w0Var);
        ve.d dVar = qnVar.f42124wb;
        bg.p1 p1Var = bg.p1.O0;
        bg.l1.S(LaunchActivity.R(), str, dVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.o2 y0() {
        return this.f43027a.M;
    }

    @Override
    public final void C0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
