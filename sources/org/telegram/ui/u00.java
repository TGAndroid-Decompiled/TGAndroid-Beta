package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class u00 extends cu0 {
    public final i10 f42120a;

    public u00(i10 i10Var) {
        this.f42120a = i10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f42120a.f38018f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.w9 w9Var;
        if (messageObject != null) {
            ai.u1 u1Var = this.f42120a.f38012b;
            int childCount = u1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = u1Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= t7Var.e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = t7Var.f23705b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= t7Var.e) {
                                w9Var = null;
                            } else {
                                w9Var = t7Var.f23704a[i13].f22893a;
                            }
                            ImageReceiver imageReceiver = w9Var.getImageReceiver();
                            w9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = k7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        MessageObject messageObject3 = (MessageObject) e2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = e2Var.getPhotoImage();
                            e2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    mu0 mu0Var = new mu0();
                    mu0Var.f39693b = iArr[0];
                    mu0Var.f39694c = iArr[1];
                    mu0Var.d = u1Var;
                    u1Var.getLocationInWindow(iArr);
                    mu0Var.f39702n = -iArr[1];
                    mu0Var.f39692a = photoImage;
                    mu0Var.f39703o = false;
                    mu0Var.h = photoImage.getRoundRadius(true);
                    mu0Var.e = mu0Var.f39692a.getBitmapSafe();
                    mu0Var.d.getLocationInWindow(iArr);
                    mu0Var.f39698j = 0;
                    if (PhotoViewer.P1(messageObject) && (pinnedHeader = u1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - mu0Var.f39694c;
                        if (i14 > childAt.getHeight()) {
                            u1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return mu0Var;
                        }
                        int height = mu0Var.f39694c - u1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            u1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return mu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        i10 i10Var = this.f42120a;
        if (!i10Var.N) {
            i10Var.h(i10Var.E, i10Var.F, i10Var.H, i10Var.G, i10Var.f38036y, i10Var.J, i10Var.f38034w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i10) {
        return i10.d((MessageObject) this.f42120a.f38018f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f42120a.O;
    }
}
