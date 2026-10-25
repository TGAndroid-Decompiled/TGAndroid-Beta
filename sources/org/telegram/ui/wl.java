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
public final class wl implements org.telegram.ui.Cells.s0 {
    public final fm f45515a;

    public wl(fm fmVar) {
        this.f45515a = fmVar;
    }

    @Override
    public final void G(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        rk rkVar = this.f45515a.Q.Ja;
        FrameLayout frameLayout = rkVar.G;
        HashMap hashMap = rkVar.f42304f;
        Random random = rkVar.h;
        ArrayList arrayList = rkVar.F;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = v0Var.getPhotoImage().getImageHeight();
            float imageWidth = v0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((ny) arrayList.get(i11)).f42028p == v0Var.getMessageObject().getId()) {
                        i12++;
                        if (((ny) arrayList.get(i11)).f42030r.getLottieAnimation() == null || ((ny) arrayList.get(i11)).f42030r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((ny) arrayList.get(i11)).f42029q != null && document != null) {
                        i10 = i11;
                        if (((ny) arrayList.get(i11)).f42029q.f22033id == document.f22033id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    ny nyVar = new ny();
                    nyVar.h = true;
                    if (!nyVar.f42021i) {
                        nyVar.f42019f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        nyVar.f42020g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    nyVar.f42028p = v0Var.getMessageObject().getId();
                    nyVar.f42025m = true;
                    nyVar.f42030r.setAllowStartAnimation(true);
                    int f7 = oy.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f22033id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f22033id), Integer.valueOf((intValue + 1) % 4));
                        nyVar.f42030r.setUniqKeyPrefix(intValue + "_" + nyVar.f42028p + "_");
                    }
                    nyVar.f42029q = document;
                    nyVar.f42030r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", rkVar.f42303c, 1);
                    nyVar.f42030r.setLayerNum(Integer.MAX_VALUE);
                    nyVar.f42030r.setAutoRepeat(0);
                    if (nyVar.f42030r.getLottieAnimation() != null) {
                        if (nyVar.h) {
                            nyVar.f42030r.getLottieAnimation().N(0, false, true);
                        }
                        nyVar.f42030r.getLottieAnimation().start();
                    }
                    arrayList.add(nyVar);
                    if (rkVar.f42305n) {
                        nyVar.f42030r.onAttachedToWindow();
                        nyVar.f42030r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void H0(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        un unVar = this.f45515a.Q;
        vg.c0.T(unVar, str, unVar.Wb);
    }

    @Override
    public final boolean M0(org.telegram.ui.Cells.v0 v0Var, float f7, float f10) {
        boolean z10;
        un unVar = this.f45515a.Q;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return unVar.P7(v0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void P0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f45515a.Q.d8(v0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f45515a.Q.b();
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        ym ymVar;
        un unVar = this.f45515a.Q;
        qf.c cVar = unVar.Wb;
        if (cVar != null) {
            cVar.a(true);
        }
        if (v0Var.getMessageObject() == null) {
            ymVar = null;
        } else {
            ymVar = new ym(this, v0Var, 6);
        }
        unVar.Wb = ymVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e(org.telegram.ui.Cells.v0 v0Var, int i10) {
        g4 g4Var = new g4(this, v0Var, i10, 4);
        un unVar = this.f45515a.Q;
        if (unVar.A0.N) {
            unVar.wb(false, true, true);
            AndroidUtilities.runOnUIThread(g4Var, 80L);
            return;
        }
        g4Var.run();
    }

    @Override
    public final void f(org.telegram.ui.Cells.v0 v0Var) {
        rj rjVar;
        un unVar = this.f45515a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        oj ojVar = unVar.f44468x0;
        if (ojVar != null && (rjVar = unVar.f44493z0) != null && rjVar.f47714y < 0) {
            int childCount = ojVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = unVar.f44468x0.getChildAt(childCount);
                unVar.f44468x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            unVar.V8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        unVar.V8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        unVar.Ec(messageObject, false);
    }

    @Override
    public final void g(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        i2.b0 b0Var = new i2.b0(this, v0Var, i10, i11, 3);
        un unVar = this.f45515a.Q;
        if (unVar.A0.N) {
            unVar.wb(false, true, true);
            AndroidUtilities.runOnUIThread(b0Var, 80L);
            return;
        }
        b0Var.run();
    }

    @Override
    public final void i0(long j10) {
        un unVar = this.f45515a.Q;
        int i10 = un.f44168bd;
        unVar.xa(j10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File pathToAttach;
        boolean z10;
        int i10;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = v0Var.getMessageObject();
        PhotoViewer u12 = PhotoViewer.u1();
        un unVar = this.f45515a.Q;
        u12.M2(null, unVar, unVar.f44385qa);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            di.y9 orCreateStoryViewer = unVar.getOrCreateStoryViewer();
            oj ojVar = unVar.f44468x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (unVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(unVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, di.q7.a(ojVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.J1;
            if (radialProgress2 != null && radialProgress2.f26246i.f31505q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                unVar.Pa(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.P0;
            if (messageObject3 != null && v0Var.N(messageObject3) && v0Var.f25566x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        bi1 bi1Var = new bi1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = bi1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            bi1Var.f38104g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = bi1Var;
                        }
                    }
                    boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
                    bc1 bc1Var = new bc1(wallPaper, unVar, q5);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        bc1Var.G1 = z12;
                        bc1Var.F1 = z13;
                        bc1Var.f43775o1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    bc1Var.f43781r0 = messageObject;
                    bc1Var.d1(messageObject.getDialogId());
                    bc1Var.f43733a.f43452a = unVar.f44385qa;
                    bc1Var.f43779q1 = new cc1(unVar, q5);
                    unVar.presentFragment(bc1Var);
                    return;
                }
                return;
            }
            unVar.Jb();
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
        if (v0Var.getMessageObject().type == 21 && !messageObject.isOutOwner()) {
            if (!messageObject.settingAvatar) {
                if (videoSize2 != null) {
                    org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
                    g50Var.f28419a = unVar;
                    g50Var.e();
                    g50Var.f28421c.f33030j0.r0(null, videoSize2, 0L);
                    g50Var.f28420b = new ag.j0(unVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], unVar.getUserConfig().getClientUserId(), 0);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = unVar.getFileLoader();
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
                photoEntry.caption = unVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.u1().i2(arrayList2, 0, 1, false, new vl(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(1, unVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                e50Var.e = z11;
                e50Var.f27742b = unVar.getMessagesController().getUser(Long.valueOf(unVar.f44249f6));
                PhotoViewer.u1().z2(e50Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.u1().f2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), unVar.Sa);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.u1().f2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), unVar.Sa);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.u1().h2(messageObject, null, 0L, 0L, 0L, unVar.Sa);
        }
    }

    @Override
    public final void l0(org.telegram.ui.Cells.v0 v0Var) {
        un unVar = this.f45515a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || unVar.f44219d2 == null) {
            return;
        }
        if (ChatObject.isMonoForum(unVar.e)) {
            unVar.f44219d2.n(messageObject.getMonoForumTopicId(), true);
        } else {
            unVar.f44219d2.n(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void t(org.telegram.ui.Cells.v0 v0Var) {
        un unVar = this.f45515a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.getResourceProvider());
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
            unVar.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, unVar.getResourceProvider());
            }
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        un unVar = this.f45515a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            tg.m1 m1Var = new tg.m1(unVar, i10, unVar.i(), new tg.k(tL_premiumGiftOption), null, unVar.f44385qa);
            m1Var.J0 = false;
            m1Var.f48932c0 = v0Var.getMessageObject().isOut();
            unVar.showDialog(m1Var);
            return;
        }
        c(v0Var);
        qf.c cVar = unVar.Wb;
        vg.g0 g0Var = vg.g0.S0;
        vg.c0.T(LaunchActivity.R(), str, cVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.r2 y() {
        return this.f45515a.Q;
    }

    @Override
    public final void z(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
