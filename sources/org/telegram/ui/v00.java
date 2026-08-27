package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class v00 extends st0 {

    public final i10 f43318a;

    public v00(i10 i10Var) {
        this.f43318a = i10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f43318a.f38943f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        if (messageObject != null) {
            hh.f1 f1Var = this.f43318a.f38936b;
            int childCount = f1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = f1Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    photoImage = null;
                    int i12 = 0;
                    while (i12 < 6) {
                        MessageObject messageObject2 = i12 >= p7Var.f24995e ? null : p7Var.f24993b[i12];
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            org.telegram.ui.Components.n9 n9Var = i12 >= p7Var.f24995e ? null : p7Var.f24992a[i12].f24621a;
                            ImageReceiver imageReceiver = n9Var.getImageReceiver();
                            n9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                        i12++;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                    if (f7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.n9 imageView = f7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    } else {
                        photoImage = null;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                    MessageObject messageObject3 = (MessageObject) d2Var.getParentObject();
                    if (messageObject3 == null || messageObject3.getId() != messageObject.getId()) {
                        photoImage = null;
                    } else {
                        photoImage = d2Var.getPhotoImage();
                        d2Var.getLocationInWindow(iArr);
                    }
                } else {
                    photoImage = null;
                }
                if (photoImage != null) {
                    cu0 cu0Var = new cu0();
                    cu0Var.f37154b = iArr[0];
                    cu0Var.f37155c = iArr[1];
                    cu0Var.d = f1Var;
                    f1Var.getLocationInWindow(iArr);
                    cu0Var.f37164n = -iArr[1];
                    cu0Var.f37153a = photoImage;
                    cu0Var.f37165o = false;
                    cu0Var.h = photoImage.getRoundRadius(true);
                    cu0Var.f37156e = cu0Var.f37153a.getBitmapSafe();
                    cu0Var.d.getLocationInWindow(iArr);
                    cu0Var.f37160j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = f1Var.getPinnedHeader()) != null) {
                        int iDp = (childAt instanceof org.telegram.ui.Cells.f7 ? AndroidUtilities.dp(8.0f) : 0) - cu0Var.f37155c;
                        if (iDp > childAt.getHeight()) {
                            f1Var.scrollBy(0, -(pinnedHeader.getHeight() + iDp));
                            return cu0Var;
                        }
                        int height = cu0Var.f37155c - f1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.f7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            f1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return cu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        i10 i10Var = this.f43318a;
        if (i10Var.J) {
            return true;
        }
        i10Var.h(i10Var.A, i10Var.B, i10Var.D, i10Var.C, i10Var.f38957y, i10Var.F, i10Var.f38955w, false);
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return i10.d((MessageObject) this.f43318a.f38943f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f43318a.K;
    }
}
