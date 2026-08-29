package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class u00 extends pt0 {
    public final h10 f43121a;

    public u00(h10 h10Var) {
        this.f43121a = h10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f43121a.f38727f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.t9 t9Var;
        if (messageObject != null) {
            jh.e1 e1Var = this.f43121a.f38720b;
            int childCount = e1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = e1Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.q7) {
                    org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= q7Var.f25075e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = q7Var.f25073b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= q7Var.f25075e) {
                                t9Var = null;
                            } else {
                                t9Var = q7Var.f25072a[i13].f24701a;
                            }
                            ImageReceiver imageReceiver = t9Var.getImageReceiver();
                            t9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.t9 imageView = g7Var.getImageView();
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
                    zt0 zt0Var = new zt0();
                    zt0Var.f45317b = iArr[0];
                    zt0Var.f45318c = iArr[1];
                    zt0Var.d = e1Var;
                    e1Var.getLocationInWindow(iArr);
                    zt0Var.f45327n = -iArr[1];
                    zt0Var.f45316a = photoImage;
                    zt0Var.f45328o = false;
                    zt0Var.h = photoImage.getRoundRadius(true);
                    zt0Var.f45319e = zt0Var.f45316a.getBitmapSafe();
                    zt0Var.d.getLocationInWindow(iArr);
                    zt0Var.f45323j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = e1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - zt0Var.f45318c;
                        if (i14 > childAt.getHeight()) {
                            e1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return zt0Var;
                        }
                        int height = zt0Var.f45318c - e1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            e1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return zt0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        h10 h10Var = this.f43121a;
        if (!h10Var.J) {
            h10Var.h(h10Var.A, h10Var.B, h10Var.D, h10Var.C, h10Var.f38741y, h10Var.F, h10Var.f38739w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return h10.d((MessageObject) this.f43121a.f38727f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f43121a.K;
    }
}
