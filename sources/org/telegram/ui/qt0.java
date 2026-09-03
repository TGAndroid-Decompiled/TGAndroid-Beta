package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class qt0 extends fu0 {
    public final ImageReceiver.BitmapHolder f37479a;
    public final ou0 f37480b;
    public final MessageObject f37481c;
    public final MediaController.PhotoEntry d;
    public final boolean e;
    public final boolean f37482f;
    public final PhotoViewer f37483g;

    public qt0(PhotoViewer photoViewer, ou0 ou0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z4, boolean z10) {
        this.f37483g = photoViewer;
        this.f37480b = ou0Var;
        this.f37481c = messageObject;
        this.d = photoEntry;
        this.e = z4;
        this.f37482f = z10;
        this.f37479a = photoViewer.z4.getBitmapSafe();
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ou0 ou0Var = this.f37480b;
        if (ou0Var != null) {
            return ou0Var.E(this.f37481c, null, 0, z4, false);
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
        return this.f37481c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z4, int i10, boolean z10, boolean z11) {
        MessageObject messageObject;
        PhotoViewer photoViewer = this.f37483g;
        if (photoViewer.f31746i4 != null) {
            pn pnVar = null;
            MessageObject messageObject2 = this.f37481c;
            if (z10) {
                messageObject = messageObject2;
            } else {
                messageObject = null;
            }
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject.editingMessage = photoEntry.caption;
                messageObject.editingMessageEntities = photoEntry.entities;
            }
            if (z10 || messageObject2 == null) {
                zn znVar = photoViewer.f31746i4;
                messageObject2 = znVar.f40642k5;
                pnVar = znVar.f40618i5;
            }
            pn pnVar2 = pnVar;
            MessageObject messageObject3 = messageObject2;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.f31746i4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.f31746i4.a();
                    zn znVar2 = photoViewer.f31746i4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, znVar2.U3, null, pnVar2, photoEntry.entities, photoEntry.ttl, messageObject, z4, i10, 0, z11, photoEntry.hasSpoiler, photoEntry.caption, znVar2.C8(), 0L, 0L, photoViewer.f31746i4.N8(), photoViewer.f31746i4.f40555d5);
                    return;
                }
                MessageObject messageObject4 = messageObject;
                AccountInstance accountInstance2 = photoViewer.f31746i4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.f31746i4.a();
                zn znVar3 = photoViewer.f31746i4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, znVar3.U3, null, pnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z4, i10, 0, z11, photoEntry.hasSpoiler, photoEntry.caption, znVar3.C8(), 0L, 0L, photoViewer.f31746i4.N8(), photoViewer.f31746i4.f40555d5);
                return;
            }
            MessageObject messageObject5 = messageObject;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.f31746i4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.f31746i4.a();
                zn znVar4 = photoViewer.f31746i4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, znVar4.U3, null, pnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z4, i10, 0, 0, z11, photoEntry.caption, znVar4.C8(), 0L, 0L, photoViewer.f31746i4.N8(), photoViewer.f31746i4.f40555d5);
            } else if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.f31746i4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.f31746i4.a();
                zn znVar5 = photoViewer.f31746i4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, znVar5.U3, null, pnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z4, i10, 0, 0, z11, photoEntry.caption, znVar5.C8(), 0L, 0L, photoViewer.f31746i4.N8(), photoViewer.f31746i4.f40555d5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.f37479a;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        c0(videoEditedInfo, z4, i11, false, z10);
    }

    @Override
    public final boolean p() {
        if (this.f37480b != null && this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f37480b != null && this.f37482f) {
            return true;
        }
        return false;
    }
}
