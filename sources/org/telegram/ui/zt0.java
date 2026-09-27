package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class zt0 extends ou0 {
    public final ImageReceiver.BitmapHolder f40589a;
    public final wu0 f40590b;
    public final MessageObject f40591c;
    public final MediaController.PhotoEntry d;
    public final boolean e;
    public final boolean f40592f;
    public final PhotoViewer f40593g;

    public zt0(PhotoViewer photoViewer, wu0 wu0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.f40593g = photoViewer;
        this.f40590b = wu0Var;
        this.f40591c = messageObject;
        this.d = photoEntry;
        this.e = z10;
        this.f40592f = z11;
        this.f40589a = photoViewer.C4.getBitmapSafe();
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        wu0 wu0Var = this.f40590b;
        if (wu0Var != null) {
            return wu0Var.E(this.f40591c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void L(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null && TextUtils.isEmpty(photoEntry.caption)) {
            return;
        }
        c0(videoEditedInfo, false, 0, true, false);
    }

    @Override
    public final MessageObject U() {
        return this.f40591c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z10, int i10, boolean z11, boolean z12) {
        MessageObject messageObject;
        PhotoViewer photoViewer = this.f40593g;
        if (photoViewer.l4 != null) {
            nn nnVar = null;
            MessageObject messageObject2 = this.f40591c;
            if (z11) {
                messageObject = messageObject2;
            } else {
                messageObject = null;
            }
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject.editingMessage = photoEntry.caption;
                messageObject.editingMessageEntities = photoEntry.entities;
            }
            if (z11 || messageObject2 == null) {
                xn xnVar = photoViewer.l4;
                messageObject2 = xnVar.f39856n5;
                nnVar = xnVar.f39830l5;
            }
            nn nnVar2 = nnVar;
            MessageObject messageObject3 = messageObject2;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.l4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.l4.a();
                    xn xnVar2 = photoViewer.l4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, xnVar2.X3, null, nnVar2, photoEntry.entities, photoEntry.ttl, messageObject, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, xnVar2.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.f39770g5);
                    return;
                }
                MessageObject messageObject4 = messageObject;
                AccountInstance accountInstance2 = photoViewer.l4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.l4.a();
                xn xnVar3 = photoViewer.l4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, xnVar3.X3, null, nnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, xnVar3.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.f39770g5);
                return;
            }
            MessageObject messageObject5 = messageObject;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.l4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.l4.a();
                xn xnVar4 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, xnVar4.X3, null, nnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, xnVar4.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.f39770g5);
            } else if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.l4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.l4.a();
                xn xnVar5 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, xnVar5.X3, null, nnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, xnVar5.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.f39770g5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.f40589a;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        c0(videoEditedInfo, z10, i11, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f40590b != null && this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f40590b != null && this.f40592f) {
            return true;
        }
        return false;
    }
}
