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
public final class wl implements org.telegram.ui.Cells.t0 {
    public final fm f42913a;

    public wl(fm fmVar) {
        this.f42913a = fmVar;
    }

    @Override
    public final void C1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        sn snVar = this.f42913a.Q;
        if (str == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            sg.l1 l1Var = new sg.l1(snVar, i10, snVar.i(), new sg.k(tL_premiumGiftOption), null, snVar.f41226ea);
            l1Var.J0 = false;
            l1Var.f46345c0 = w0Var.getMessageObject().isOut();
            snVar.showDialog(l1Var);
            return;
        }
        b(w0Var);
        pf.c cVar = snVar.Ab;
        ug.f0 f0Var = ug.f0.S0;
        ug.b0.U(LaunchActivity.R(), str, cVar);
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 L0() {
        return this.f42913a.Q;
    }

    @Override
    public final void X(org.telegram.ui.Cells.w0 w0Var, int i10) {
        i4 i4Var = new i4(this, w0Var, i10, 4);
        sn snVar = this.f42913a.Q;
        if (snVar.A0.N) {
            snVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(i4Var, 80L);
            return;
        }
        i4Var.run();
    }

    @Override
    public final void X1(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        sn snVar = this.f42913a.Q;
        ug.b0.U(snVar, str, snVar.Ab);
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        xm xmVar;
        sn snVar = this.f42913a.Q;
        pf.c cVar = snVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        if (w0Var.getMessageObject() == null) {
            xmVar = null;
        } else {
            xmVar = new xm(this, w0Var, 6);
        }
        snVar.Ab = xmVar;
    }

    @Override
    public final void b0(org.telegram.ui.Cells.w0 w0Var) {
        sj sjVar;
        sn snVar = this.f42913a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        pj pjVar = snVar.f41454x0;
        if (pjVar != null && (sjVar = snVar.f41479z0) != null && sjVar.f45955y < 0) {
            int childCount = pjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = snVar.f41454x0.getChildAt(childCount);
                snVar.f41454x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            snVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        snVar.Q8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        snVar.vc(messageObject, false);
    }

    @Override
    public final void c1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        int i10;
        rk rkVar = this.f42913a.Q.f41464xa;
        FrameLayout frameLayout = rkVar.G;
        HashMap hashMap = rkVar.f40548f;
        Random random = rkVar.h;
        ArrayList arrayList = rkVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight > 0.0f && imageWidth > 0.0f) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < arrayList.size()) {
                    if (((py) arrayList.get(i11)).f40274p == w0Var.getMessageObject().getId()) {
                        i12++;
                        if (((py) arrayList.get(i11)).f40276r.getLottieAnimation() == null || ((py) arrayList.get(i11)).f40276r.getLottieAnimation().y()) {
                            return;
                        }
                    }
                    if (((py) arrayList.get(i11)).f40275q != null && document != null) {
                        i10 = i11;
                        if (((py) arrayList.get(i11)).f40275q.f20285id == document.f20285id) {
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
                    if (!pyVar.f40267i) {
                        pyVar.f40265f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                        pyVar.f40266g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
                    }
                    pyVar.f40274p = w0Var.getMessageObject().getId();
                    pyVar.f40271m = true;
                    pyVar.f40276r.setAllowStartAnimation(true);
                    int f7 = qy.f();
                    if (i13 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.f20285id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.f20285id), Integer.valueOf((intValue + 1) % 4));
                        pyVar.f40276r.setUniqKeyPrefix(intValue + "_" + pyVar.f40274p + "_");
                    }
                    pyVar.f40275q = document;
                    pyVar.f40276r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", rkVar.f40547c, 1);
                    pyVar.f40276r.setLayerNum(Integer.MAX_VALUE);
                    pyVar.f40276r.setAutoRepeat(0);
                    if (pyVar.f40276r.getLottieAnimation() != null) {
                        if (pyVar.h) {
                            pyVar.f40276r.getLottieAnimation().N(0, false, true);
                        }
                        pyVar.f40276r.getLottieAnimation().start();
                    }
                    arrayList.add(pyVar);
                    if (rkVar.f40549n) {
                        pyVar.f40276r.onAttachedToWindow();
                        pyVar.f40276r.setParentView(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final long d() {
        return this.f42913a.Q.d();
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        sn snVar = this.f42913a.Q;
        if (snVar.A0.N) {
            snVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
            return;
        }
        zVar.run();
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        sn snVar = this.f42913a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return snVar.L7(w0Var, false, false, f7, f10, true, true, false);
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
        sn snVar = this.f42913a.Q;
        t12.K2(null, snVar, snVar.f41226ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ci.aa orCreateStoryViewer = snVar.getOrCreateStoryViewer();
            pj pjVar = snVar.f41454x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (snVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(snVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ci.r7.a(pjVar));
                return;
            }
            return;
        }
        boolean z11 = false;
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.J1;
            if (radialProgress2 != null && radialProgress2.f24312i.f28726q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                snVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.P0;
            if (messageObject3 != null && w0Var.O(messageObject3) && w0Var.f23752x1 != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        uh1 uh1Var = new uh1(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion, null);
                        wallPaper = uh1Var;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            uh1Var.f42011g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = uh1Var;
                        }
                    }
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    vb1 vb1Var = new vb1(wallPaper, snVar, q6);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z12 = wallPaperSettings3.blur;
                        boolean z13 = wallPaperSettings3.motion;
                        vb1Var.F1 = z12;
                        vb1Var.E1 = z13;
                        vb1Var.f39161n1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    vb1Var.f39166q0 = messageObject;
                    vb1Var.c1(messageObject.getDialogId());
                    vb1Var.f39122a.f39111a = snVar.f41226ea;
                    vb1Var.f39165p1 = new wb1(snVar, q6);
                    snVar.presentFragment(vb1Var);
                    return;
                }
                return;
            }
            snVar.Bb();
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
                    e50Var.f25812a = snVar;
                    e50Var.e();
                    e50Var.f25814c.f30593j0.r0(null, videoSize2, 0L);
                    e50Var.f25813b = new ai.u3(snVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], snVar.getUserConfig().getClientUserId(), 8);
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
                PhotoViewer.t1().g2(arrayList2, 0, 1, false, new vl(this, messageObject, photoEntry), null);
                if (photoEntry.isVideo) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                } else {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                }
                org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(1, snVar.getUserConfig().getCurrentUser());
                if (videoSize != null) {
                    z11 = true;
                }
                c50Var.e = z11;
                c50Var.f25093b = snVar.getMessagesController().getUser(Long.valueOf(snVar.T5));
                PhotoViewer.t1().x2(c50Var);
            }
        } else if (videoSize != null) {
            PhotoViewer.t1().e2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), snVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
            }
        } else if (closestPhotoSizeWithSize != null) {
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), snVar.Ga);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
            }
        } else {
            PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, snVar.Ga);
        }
    }

    @Override
    public final void k2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f42913a.Q.Z7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        sn snVar = this.f42913a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.getResourceProvider());
            alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
            snVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21231q7));
            }
        }
    }

    @Override
    public final void s1(long j10) {
        sn snVar = this.f42913a.Q;
        int i10 = sn.Hc;
        snVar.sa(j10);
    }

    @Override
    public final void t1(org.telegram.ui.Cells.w0 w0Var) {
        sn snVar = this.f42913a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || snVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(snVar.e)) {
            snVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            snVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override
    public final void N0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
