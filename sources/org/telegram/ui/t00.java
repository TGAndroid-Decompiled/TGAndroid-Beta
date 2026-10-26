package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class t00 extends gu0 {
    public final h10 f43639a;

    public t00(h10 h10Var) {
        this.f43639a = h10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f43639a.f39834f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.y9 y9Var;
        if (messageObject != null) {
            bi.r1 r1Var = this.f43639a.f39828b;
            int childCount = r1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = r1Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.x7) {
                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= x7Var.e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = x7Var.f25720b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= x7Var.e) {
                                y9Var = null;
                            } else {
                                y9Var = x7Var.f25719a[i13].f25452a;
                            }
                            ImageReceiver imageReceiver = y9Var.getImageReceiver();
                            y9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    if (o7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.y9 imageView = o7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        MessageObject messageObject3 = (MessageObject) d2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = d2Var.getPhotoImage();
                            d2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    qu0 qu0Var = new qu0();
                    qu0Var.f42920b = iArr[0];
                    qu0Var.f42921c = iArr[1];
                    qu0Var.d = r1Var;
                    r1Var.getLocationInWindow(iArr);
                    qu0Var.f42929n = -iArr[1];
                    qu0Var.f42919a = photoImage;
                    qu0Var.f42930o = false;
                    qu0Var.h = photoImage.getRoundRadius(true);
                    qu0Var.e = qu0Var.f42919a.getBitmapSafe();
                    qu0Var.d.getLocationInWindow(iArr);
                    qu0Var.f42925j = 0;
                    if (PhotoViewer.P1(messageObject) && (pinnedHeader = r1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.o7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - qu0Var.f42921c;
                        if (i14 > childAt.getHeight()) {
                            r1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return qu0Var;
                        }
                        int height = qu0Var.f42921c - r1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.o7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            r1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return qu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        h10 h10Var = this.f43639a;
        if (!h10Var.N) {
            h10Var.h(h10Var.E, h10Var.F, h10Var.H, h10Var.G, h10Var.f39852y, h10Var.J, h10Var.f39850w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i10) {
        return h10.d((MessageObject) this.f43639a.f39834f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f43639a.O;
    }
}
