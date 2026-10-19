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
    public final dm f42006a;

    public ul(dm dmVar) {
        this.f42006a = dmVar;
    }

    @Override
    public final void C1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        qn qnVar = this.f42006a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            sg.m1 m1Var = new sg.m1(qnVar, i10, qnVar.i(), new sg.k(tL_premiumGiftOption), null, qnVar.f40675ea);
            m1Var.J0 = false;
            m1Var.f46322c0 = w0Var.getMessageObject().isOut();
            qnVar.showDialog(m1Var);
            return;
        }
        b(w0Var);
        pf.c cVar = qnVar.Ab;
        ug.f0 f0Var = ug.f0.S0;
        ug.b0.U(LaunchActivity.R(), str, cVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 L0() {
        return this.f42006a.Q;
    }

    @Override
    public final void X(org.telegram.ui.Cells.w0 w0Var, int i10) {
        i4 i4Var = new i4(this, w0Var, i10, 4);
        qn qnVar = this.f42006a.Q;
        if (qnVar.A0.N) {
            qnVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(i4Var, 80L);
            return;
        }
        i4Var.run();
    }

    @Override
    public final void X1(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        qn qnVar = this.f42006a.Q;
        ug.b0.U(qnVar, str, qnVar.Ab);
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        vm vmVar;
        qn qnVar = this.f42006a.Q;
        pf.c cVar = qnVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            vmVar = null;
        } else {
            vmVar = new vm(this, w0Var, 6);
        }
        qnVar.Ab = vmVar;
    }

    @Override
    public final void b0(org.telegram.ui.Cells.w0 w0Var) {
        qj qjVar;
        qn qnVar = this.f42006a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        nj njVar = qnVar.f40903x0;
        if (njVar != null && (qjVar = qnVar.f40928z0) != null && qjVar.f45907y < 0) {
            int childCount = njVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = qnVar.f40903x0.getChildAt(childCount);
                qnVar.f40903x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            qnVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        qnVar.Q8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        qnVar.vc(messageObject, false);
    }

    @Override
    public final void c1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        pk pkVar = this.f42006a.Q.f40913xa;
        FrameLayout frameLayout = pkVar.G;
        HashMap hashMap = pkVar.f40006f;
        Random random = pkVar.h;
        ArrayList arrayList = pkVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((ny) arrayList.get(i11)).f39711p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((ny) arrayList.get(i11)).f39713r.getLottieAnimation() == null || ((ny) arrayList.get(i11)).f39713r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((ny) arrayList.get(i11)).f39712q != null && document != null) {
                        i10 = i11;
                        if (((ny) arrayList.get(i11)).f39712q.f20281id == document.f20281id) {
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
                    if (!nyVar.f39704i) {
                        nyVar.f39702f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        nyVar.f39703g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    nyVar.f39711p = w0Var.getMessageObject().getId();
                    nyVar.f39708m = true;
                    nyVar.f39713r.setAllowStartAnimation(true);
                    int f7 = oy.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f20281id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f20281id), Integer.valueOf((intValue + 1) % 4));
                        nyVar.f39713r.setUniqKeyPrefix(intValue + "_" + nyVar.f39711p + "_");
                    }
                    nyVar.f39712q = document;
                    nyVar.f39713r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", pkVar.f40005c, 1);
                    nyVar.f39713r.setLayerNum(Integer.MAX_VALUE);
                    nyVar.f39713r.setAutoRepeat(0);
                    if (nyVar.f39713r.getLottieAnimation() != null) {
                        if (nyVar.h) {
                            nyVar.f39713r.getLottieAnimation().N(0, false, true);
                        }
                        nyVar.f39713r.getLottieAnimation().start();
                    }
                    arrayList.add(nyVar);
                    if (pkVar.f40007n) {
                        nyVar.f39713r.onAttachedToWindow();
                        nyVar.f39713r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final long d() {
        return this.f42006a.Q.d();
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        qn qnVar = this.f42006a.Q;
        if (qnVar.A0.N) {
            qnVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
            return;
        }
        a0Var.run();
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        qn qnVar = this.f42006a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return qnVar.L7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File pathToAttach;
        boolean z10;
        int i10;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = w0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        qn qnVar = this.f42006a.Q;
        t12.K2(null, qnVar, qnVar.f40675ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ci.aa orCreateStoryViewer = qnVar.getOrCreateStoryViewer();
            nj njVar = qnVar.f40903x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (qnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(qnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ci.r7.a(njVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.J1;
            if (radialProgress2 != null && radialProgress2.f24308i.f28737q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                qnVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.P0;
            if (messageObject3 != null && w0Var.O(messageObject3) && w0Var.f23748x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        sh1 sh1Var = new sh1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = sh1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            sh1Var.f41469g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = sh1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    tb1 tb1Var = new tb1(wallPaper, qnVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        tb1Var.F1 = z12;
                        tb1Var.E1 = z13;
                        tb1Var.f38548n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    tb1Var.f38553q0 = messageObject;
                    tb1Var.c1(messageObject.getDialogId());
                    tb1Var.f38509a.f38498a = qnVar.f40675ea;
                    tb1Var.f38552p1 = new ub1(qnVar, q6);
                    qnVar.presentFragment(tb1Var);
                    return;
                }
                return;
            }
            qnVar.Bb();
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
                    org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
                    e50Var.f25777a = qnVar;
                    e50Var.e();
                    e50Var.f25779c.f30548j0.r0(null, videoSize2, 0L);
                    e50Var.f25778b = new ai.w2(qnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], qnVar.getUserConfig().getClientUserId(), 9);
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
                photoEntry.caption = qnVar.Y.getFieldText();
                if (videoSize != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                photoEntry.isVideo = z10;
                arrayList2.add(photoEntry);
                PhotoViewer.t1().g2(arrayList2, 0, 1, false, new tl(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(1, qnVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                c50Var.e = z11;
                c50Var.f25077b = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.T5));
                PhotoViewer.t1().x2(c50Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().e2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), qnVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), qnVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, qnVar.Ga);
        }
    }

    @Override
    public final void k2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f42006a.Q.Z7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.f42006a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.getResourceProvider());
            alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
            qnVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21227q7));
            }
        }
    }

    @Override
    public final void s1(long j10) {
        qn qnVar = this.f42006a.Q;
        int i10 = qn.Ic;
        qnVar.sa(j10);
    }

    @Override
    public final void t1(org.telegram.ui.Cells.w0 w0Var) {
        qn qnVar = this.f42006a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || qnVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(qnVar.e)) {
            qnVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            qnVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
