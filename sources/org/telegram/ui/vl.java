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
public final class vl implements org.telegram.ui.Cells.s0 {
    public final em f42759a;

    public vl(em emVar) {
        this.f42759a = emVar;
    }

    @Override
    public final void C1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        sn snVar = this.f42759a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            sg.m1 m1Var = new sg.m1(snVar, i10, snVar.i(), new sg.k(tL_premiumGiftOption), null, snVar.f41651qa);
            m1Var.J0 = false;
            m1Var.f46756c0 = v0Var.getMessageObject().isOut();
            snVar.showDialog(m1Var);
            return;
        }
        b(v0Var);
        pf.c cVar = snVar.Nb;
        ug.e0 e0Var = ug.e0.S0;
        ug.a0.T(LaunchActivity.R(), str, cVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.o2 L0() {
        return this.f42759a.Q;
    }

    @Override
    public final void X(org.telegram.ui.Cells.v0 v0Var, int i10) {
        h4 h4Var = new h4(this, v0Var, i10, 4);
        sn snVar = this.f42759a.Q;
        if (snVar.A0.N) {
            snVar.rb(false, true, true);
            AndroidUtilities.runOnUIThread(h4Var, 80L);
            return;
        }
        h4Var.run();
    }

    @Override
    public final void X1(org.telegram.ui.Cells.v0 v0Var, String str) {
        b(v0Var);
        sn snVar = this.f42759a.Q;
        ug.a0.T(snVar, str, snVar.Nb);
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.v0 v0Var) {
        wm wmVar;
        sn snVar = this.f42759a.Q;
        pf.c cVar = snVar.Nb;
        if (cVar != null) {
            cVar.a(true);
        }
        if (v0Var.getMessageObject() == null) {
            wmVar = null;
        } else {
            wmVar = new wm(this, v0Var, 6);
        }
        snVar.Nb = wmVar;
    }

    @Override
    public final void b0(org.telegram.ui.Cells.v0 v0Var) {
        qj qjVar;
        sn snVar = this.f42759a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        nj njVar = snVar.f41734x0;
        if (njVar != null && (qjVar = snVar.f41759z0) != null && qjVar.f46339y < 0) {
            int childCount = njVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = snVar.f41734x0.getChildAt(childCount);
                snVar.f41734x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            snVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        snVar.Q8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        snVar.yc(messageObject, false);
    }

    @Override
    public final void c1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        qk qkVar = this.f42759a.Q.Ja;
        FrameLayout frameLayout = qkVar.G;
        HashMap hashMap = qkVar.f40953f;
        Random random = qkVar.h;
        ArrayList arrayList = qkVar.F;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = v0Var.getPhotoImage().getImageHeight();
            float imageWidth = v0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((py) arrayList.get(i11)).f40659p == v0Var.getMessageObject().getId()) {
                        i12++;
                        if (((py) arrayList.get(i11)).f40661r.getLottieAnimation() == null || ((py) arrayList.get(i11)).f40661r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((py) arrayList.get(i11)).f40660q != null && document != null) {
                        i10 = i11;
                        if (((py) arrayList.get(i11)).f40660q.f20350id == document.f20350id) {
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
                    if (!pyVar.f40652i) {
                        pyVar.f40650f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        pyVar.f40651g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    pyVar.f40659p = v0Var.getMessageObject().getId();
                    pyVar.f40656m = true;
                    pyVar.f40661r.setAllowStartAnimation(true);
                    int f7 = qy.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f20350id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f20350id), Integer.valueOf((intValue + 1) % 4));
                        pyVar.f40661r.setUniqKeyPrefix(intValue + "_" + pyVar.f40659p + "_");
                    }
                    pyVar.f40660q = document;
                    pyVar.f40661r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", qkVar.f40952c, 1);
                    pyVar.f40661r.setLayerNum(Integer.MAX_VALUE);
                    pyVar.f40661r.setAutoRepeat(0);
                    if (pyVar.f40661r.getLottieAnimation() != null) {
                        if (pyVar.h) {
                            pyVar.f40661r.getLottieAnimation().N(0, false, true);
                        }
                        pyVar.f40661r.getLottieAnimation().start();
                    }
                    arrayList.add(pyVar);
                    if (qkVar.f40954n) {
                        pyVar.f40661r.onAttachedToWindow();
                        pyVar.f40661r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final long d() {
        return this.f42759a.Q.d();
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, v0Var, i10, i11, 3);
        sn snVar = this.f42759a.Q;
        if (snVar.A0.N) {
            snVar.rb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
            return;
        }
        zVar.run();
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.v0 v0Var, float f7, float f10) {
        boolean z10;
        sn snVar = this.f42759a.Q;
        z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return snVar.L7(v0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void k0(org.telegram.ui.Cells.v0 v0Var) {
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
        sn snVar = this.f42759a.Q;
        u12.M2(null, snVar, snVar.f41651qa);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            ci.z9 orCreateStoryViewer = snVar.getOrCreateStoryViewer();
            nj njVar = snVar.f41734x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (snVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(snVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ci.q7.a(njVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.J1;
            if (radialProgress2 != null && radialProgress2.f24456i.f28563q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                snVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.P0;
            if (messageObject3 != null && v0Var.N(messageObject3) && v0Var.f23824x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        yh1 yh1Var = new yh1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = yh1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            yh1Var.f43867g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = yh1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
                    yb1 yb1Var = new yb1(wallPaper, snVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        yb1Var.G1 = z12;
                        yb1Var.F1 = z13;
                        yb1Var.f40484o1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    yb1Var.f40490r0 = messageObject;
                    yb1Var.c1(messageObject.getDialogId());
                    yb1Var.f40442a.f40426a = snVar.f41651qa;
                    yb1Var.f40488q1 = new zb1(snVar, q6);
                    snVar.presentFragment(yb1Var);
                    return;
                }
                return;
            }
            snVar.Db();
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
                    org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(0, true, true);
                    c50Var.f25185a = snVar;
                    c50Var.e();
                    c50Var.f25187c.f30158j0.r0(null, videoSize2, 0L);
                    c50Var.f25186b = new ai.y3(snVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], snVar.getUserConfig().getClientUserId(), 8);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
                FileLoader fileLoader = snVar.getFileLoader();
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
                photoEntry.caption = snVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.u1().i2(arrayList2, 0, 1, false, new ul(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(1, snVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                a50Var.e = z11;
                a50Var.f24629b = snVar.getMessagesController().getUser(Long.valueOf(snVar.f41516f6));
                PhotoViewer.u1().z2(a50Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.u1().f2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), snVar.Sa);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.u1().f2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), snVar.Sa);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.u1().Q2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.u1().h2(messageObject, null, 0L, 0L, 0L, snVar.Sa);
        }
    }

    @Override
    public final void k2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f42759a.Q.Z7(v0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void r0(org.telegram.ui.Cells.v0 v0Var) {
        sn snVar = this.f42759a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.getResourceProvider());
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            snVar.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, snVar.getResourceProvider());
            }
        }
    }

    @Override
    public final void s1(long j10) {
        sn snVar = this.f42759a.Q;
        int i10 = sn.Vc;
        snVar.sa(j10);
    }

    @Override
    public final void t1(org.telegram.ui.Cells.v0 v0Var) {
        sn snVar = this.f42759a.Q;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || snVar.f41487d2 == null) {
            return;
        }
        if (ChatObject.isMonoForum(snVar.e)) {
            snVar.f41487d2.n(messageObject.getMonoForumTopicId(), true);
        } else {
            snVar.f41487d2.n(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
