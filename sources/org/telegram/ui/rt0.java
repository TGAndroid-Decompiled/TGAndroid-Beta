package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class rt0 extends gu0 {
    public final ImageReceiver.BitmapHolder f43285a;
    public final ou0 f43286b;
    public final MessageObject f43287c;
    public final MediaController.PhotoEntry d;
    public final boolean e;
    public final boolean f43288f;
    public final PhotoViewer f43289g;

    public rt0(PhotoViewer photoViewer, ou0 ou0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.f43289g = photoViewer;
        this.f43286b = ou0Var;
        this.f43287c = messageObject;
        this.d = photoEntry;
        this.e = z10;
        this.f43288f = z11;
        this.f43285a = photoViewer.C4.getBitmapSafe();
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ou0 ou0Var = this.f43286b;
        if (ou0Var != null) {
            return ou0Var.E(this.f43287c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null && TextUtils.isEmpty(photoEntry.caption)) {
            return;
        }
        d0(videoEditedInfo, false, 0, true, false);
    }

    @Override
    public final MessageObject V() {
        return this.f43287c;
    }

    public final void d0(VideoEditedInfo videoEditedInfo, boolean z10, int i10, boolean z11, boolean z12) {
        MessageObject messageObject;
        PhotoViewer photoViewer = this.f43289g;
        if (photoViewer.l4 != null) {
            kn knVar = null;
            MessageObject messageObject2 = this.f43287c;
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
                un unVar = photoViewer.l4;
                messageObject2 = unVar.f44501z5;
                knVar = unVar.f44476x5;
            }
            kn knVar2 = knVar;
            MessageObject messageObject3 = messageObject2;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.l4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.l4.a();
                    un unVar2 = photoViewer.l4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, unVar2.f44298j4, null, knVar2, photoEntry.entities, photoEntry.ttl, messageObject, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, unVar2.L8(), 0L, 0L, photoViewer.l4.X8(), photoViewer.l4.f44410s5);
                    return;
                }
                MessageObject messageObject4 = messageObject;
                AccountInstance accountInstance2 = photoViewer.l4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.l4.a();
                un unVar3 = photoViewer.l4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, unVar3.f44298j4, null, knVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, unVar3.L8(), 0L, 0L, photoViewer.l4.X8(), photoViewer.l4.f44410s5);
                return;
            }
            MessageObject messageObject5 = messageObject;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.l4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.l4.a();
                un unVar4 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, unVar4.f44298j4, null, knVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, unVar4.L8(), 0L, 0L, photoViewer.l4.X8(), photoViewer.l4.f44410s5);
            } else if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.l4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.l4.a();
                un unVar5 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, unVar5.f44298j4, null, knVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, unVar5.L8(), 0L, 0L, photoViewer.l4.X8(), photoViewer.l4.f44410s5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.f43285a;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        d0(videoEditedInfo, z10, i11, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f43286b != null && this.e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f43286b != null && this.f43288f) {
            return true;
        }
        return false;
    }
}
