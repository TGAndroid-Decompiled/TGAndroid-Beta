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
public final class yl implements org.telegram.ui.Cells.s0 {
    public final hm f46046a;

    public yl(hm hmVar) {
        this.f46046a = hmVar;
    }

    @Override
    public final void G(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        tk tkVar = this.f46046a.Q.Na;
        FrameLayout frameLayout = tkVar.G;
        HashMap hashMap = tkVar.f42809f;
        Random random = tkVar.h;
        ArrayList arrayList = tkVar.F;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = v0Var.getPhotoImage().getImageHeight();
            float imageWidth = v0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((py) arrayList.get(i11)).f42539p == v0Var.getMessageObject().getId()) {
                        i12++;
                        if (((py) arrayList.get(i11)).f42541r.getLottieAnimation() == null || ((py) arrayList.get(i11)).f42541r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((py) arrayList.get(i11)).f42540q != null && document != null) {
                        i10 = i11;
                        if (((py) arrayList.get(i11)).f42540q.f22034id == document.f22034id) {
                            i13++;
                        }
                    } else {
                        i10 = i11;
                    }
                    i11 = i10 + 1;
                }
                if (i12 < 4) {
                    py pyVar = new py();
                    pyVar.h = true;
                    if (!pyVar.f42532i) {
                        pyVar.f42530f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        pyVar.f42531g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    pyVar.f42539p = v0Var.getMessageObject().getId();
                    pyVar.f42536m = true;
                    pyVar.f42541r.setAllowStartAnimation(true);
                    int f7 = qy.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f22034id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f22034id), Integer.valueOf((intValue + 1) % 4));
                        pyVar.f42541r.setUniqKeyPrefix(intValue + "_" + pyVar.f42539p + "_");
                    }
                    pyVar.f42540q = document;
                    pyVar.f42541r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", tkVar.f42808c, 1);
                    pyVar.f42541r.setLayerNum(Integer.MAX_VALUE);
                    pyVar.f42541r.setAutoRepeat(0);
                    if (pyVar.f42541r.getLottieAnimation() != null) {
                        if (pyVar.h) {
                            pyVar.f42541r.getLottieAnimation().N(0, false, true);
                        }
                        pyVar.f42541r.getLottieAnimation().start();
                    }
                    arrayList.add(pyVar);
                    if (tkVar.f42810n) {
                        pyVar.f42541r.onAttachedToWindow();
                        pyVar.f42541r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final void H0(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        wn wnVar = this.f46046a.Q;
        vg.c0.T(wnVar, str, wnVar.f45056ac);
    }

    @Override
    public final boolean M0(org.telegram.ui.Cells.v0 v0Var, float f7, float f10) {
        boolean z10;
        wn wnVar = this.f46046a.Q;
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return wnVar.R7(v0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void P0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f46046a.Q.f8(v0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final long b() {
        return this.f46046a.Q.b();
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        an anVar;
        wn wnVar = this.f46046a.Q;
        qf.c cVar = wnVar.f45056ac;
        if (cVar != null) {
            cVar.a(true);
        }
        if (v0Var.getMessageObject() == null) {
            anVar = null;
        } else {
            anVar = new an(this, v0Var, 6);
        }
        wnVar.f45056ac = anVar;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e(org.telegram.ui.Cells.v0 v0Var, int i10) {
        g4 g4Var = new g4(this, v0Var, i10, 4);
        wn wnVar = this.f46046a.Q;
        if (wnVar.A0.N) {
            wnVar.Ab(false, true, true);
            AndroidUtilities.runOnUIThread(g4Var, 80L);
            return;
        }
        g4Var.run();
    }

    @Override
    public final void f(org.telegram.ui.Cells.v0 v0Var) {
        uj ujVar;
        wn wnVar = this.f46046a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        rj rjVar = wnVar.f45339x0;
        if (rjVar != null && (ujVar = wnVar.f45364z0) != null && ujVar.f47752y < 0) {
            int childCount = rjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = wnVar.f45339x0.getChildAt(childCount);
                wnVar.f45339x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            wnVar.Y8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        wnVar.Y8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        wnVar.Ic(messageObject, false);
    }

    @Override
    public final void g(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        i2.b0 b0Var = new i2.b0(this, v0Var, i10, i11, 3);
        wn wnVar = this.f46046a.Q;
        if (wnVar.A0.N) {
            wnVar.Ab(false, true, true);
            AndroidUtilities.runOnUIThread(b0Var, 80L);
            return;
        }
        b0Var.run();
    }

    @Override
    public final void i0(long j10) {
        wn wnVar = this.f46046a.Q;
        int i10 = wn.f45035fd;
        wnVar.Aa(j10);
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
        PhotoViewer v12 = PhotoViewer.v1();
        wn wnVar = this.f46046a.Q;
        v12.N2(null, wnVar, wnVar.f45309ua);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            di.y9 orCreateStoryViewer = wnVar.getOrCreateStoryViewer();
            rj rjVar = wnVar.f45339x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (wnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(wnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, di.q7.a(rjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.J1;
            if (radialProgress2 != null && radialProgress2.f26250i.f31839q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                wnVar.Sa(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.P0;
            if (messageObject3 != null && v0Var.N(messageObject3) && v0Var.f25570x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        di1 di1Var = new di1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = di1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            di1Var.f38626g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = di1Var;
                        }
                    }
                    boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
                    dc1 dc1Var = new dc1(wallPaper, wnVar, q5);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        dc1Var.G1 = z12;
                        dc1Var.F1 = z13;
                        dc1Var.f44288o1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    dc1Var.f44294r0 = messageObject;
                    dc1Var.d1(messageObject.getDialogId());
                    dc1Var.f44246a.f43971a = wnVar.f45309ua;
                    dc1Var.f44292q1 = new ec1(wnVar, q5);
                    wnVar.presentFragment(dc1Var);
                    return;
                }
                return;
            }
            wnVar.Nb();
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
                    g50Var.f28388a = wnVar;
                    g50Var.e();
                    g50Var.f28390c.f33002j0.s0(null, videoSize2, 0L);
                    g50Var.f28389b = new ag.j0(wnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], wnVar.getUserConfig().getClientUserId(), 0);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = wnVar.getFileLoader();
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
                photoEntry.caption = wnVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.v1().j2(arrayList2, 0, 1, false, new xl(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.v1().R2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.v1().R2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(1, wnVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                e50Var.e = z11;
                e50Var.f27714b = wnVar.getMessagesController().getUser(Long.valueOf(wnVar.f45168j6));
                PhotoViewer.v1().A2(e50Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.v1().g2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), wnVar.Wa);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.v1().R2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.v1().g2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), wnVar.Wa);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.v1().R2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, wnVar.Wa);
        }
    }

    @Override
    public final void l0(org.telegram.ui.Cells.v0 v0Var) {
        wn wnVar = this.f46046a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || wnVar.f45089d2 == null) {
            return;
        }
        if (ChatObject.isMonoForum(wnVar.e)) {
            wnVar.f45089d2.n(messageObject.getMonoForumTopicId(), true);
        } else {
            wnVar.f45089d2.n(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void t(org.telegram.ui.Cells.v0 v0Var) {
        wn wnVar = this.f46046a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.getResourceProvider());
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            wnVar.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, wnVar.getResourceProvider());
            }
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        wn wnVar = this.f46046a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            tg.m1 m1Var = new tg.m1(wnVar, i10, wnVar.i(), new tg.k(tL_premiumGiftOption), null, wnVar.f45309ua);
            m1Var.J0 = false;
            m1Var.f48970c0 = v0Var.getMessageObject().isOut();
            wnVar.showDialog(m1Var);
            return;
        }
        c(v0Var);
        qf.c cVar = wnVar.f45056ac;
        vg.g0 g0Var = vg.g0.S0;
        vg.c0.T(LaunchActivity.R(), str, cVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.r2 y() {
        return this.f46046a.Q;
    }

    @Override
    public final void z(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
