package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class rm implements du0 {
    public final TL_iv.RichMessage f38082a;
    public final ArrayList f38083b;
    public final MessageObject f38084c;

    public rm(TL_iv.RichMessage richMessage, ArrayList arrayList, MessageObject messageObject) {
        this.f38082a = richMessage;
        this.f38083b = arrayList;
        this.f38084c = messageObject;
    }

    @Override
    public final boolean a(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f38083b;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    TLRPC.Document b10 = i4.b(this.f38082a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                    if (b10 != null) {
                        return MessageObject.isVideoDocument(b10);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final File b(int i10) {
        TLRPC.Document b10;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 >= 0) {
            ArrayList arrayList = this.f38083b;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                boolean z4 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f38082a;
                if (z4) {
                    TLRPC.Photo f10 = i4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f10 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(f10.sizes, AndroidUtilities.getPhotoSize())) != null) {
                        return i4.c(closestPhotoSizeWithSize);
                    }
                    return null;
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b10 = i4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return i4.c(b10);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final String c(int i10) {
        TLObject d = d(i10);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override
    public final TLObject d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f38083b;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                boolean z4 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f38082a;
                if (z4) {
                    return i4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                }
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return i4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean e(int i10) {
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize != null) {
                int i10 = closestPhotoSizeWithSize.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize;
            }
            iArr[0] = -1;
            return null;
        }
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
            if (closestPhotoSizeWithSize2 == null) {
                closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            }
            if (closestPhotoSizeWithSize2 != null) {
                int i11 = closestPhotoSizeWithSize2.size;
                iArr[0] = i11;
                if (i11 == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize2;
            }
        }
        return null;
    }

    @Override
    public final Object g() {
        MessageObject messageObject = this.f38084c;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f38082a;
    }

    @Override
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.f38083b.get(i10);
    }

    @Override
    public final List getAll() {
        return this.f38083b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        RichMessageLayout richMessageLayout;
        MessageObject messageObject = this.f38084c;
        if (messageObject != null && (richMessageLayout = messageObject.richLayout) != null) {
            richMessageLayout.setSlideshowPage(pageBlock);
        }
    }

    @Override
    public final CharSequence i(int i10) {
        return null;
    }

    @Override
    public final int j() {
        return this.f38083b.size();
    }
}
