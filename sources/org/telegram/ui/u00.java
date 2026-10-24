package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class u00 extends bu0 {
    public final i10 f42169a;

    public u00(i10 i10Var) {
        this.f42169a = i10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f42169a.f38101f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.u9 u9Var;
        if (messageObject != null) {
            ai.u1 u1Var = this.f42169a.f38095b;
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
                            messageObject2 = t7Var.f23706b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= t7Var.e) {
                                u9Var = null;
                            } else {
                                u9Var = t7Var.f23705a[i13].f22894a;
                            }
                            ImageReceiver imageReceiver = u9Var.getImageReceiver();
                            u9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.u9 imageView = k7Var.getImageView();
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
                    lu0 lu0Var = new lu0();
                    lu0Var.f39382b = iArr[0];
                    lu0Var.f39383c = iArr[1];
                    lu0Var.d = u1Var;
                    u1Var.getLocationInWindow(iArr);
                    lu0Var.f39391n = -iArr[1];
                    lu0Var.f39381a = photoImage;
                    lu0Var.f39392o = false;
                    lu0Var.h = photoImage.getRoundRadius(true);
                    lu0Var.e = lu0Var.f39381a.getBitmapSafe();
                    lu0Var.d.getLocationInWindow(iArr);
                    lu0Var.f39387j = 0;
                    if (PhotoViewer.P1(messageObject) && (pinnedHeader = u1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - lu0Var.f39383c;
                        if (i14 > childAt.getHeight()) {
                            u1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return lu0Var;
                        }
                        int height = lu0Var.f39383c - u1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            u1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return lu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        i10 i10Var = this.f42169a;
        if (!i10Var.N) {
            i10Var.h(i10Var.E, i10Var.F, i10Var.H, i10Var.G, i10Var.f38119y, i10Var.J, i10Var.f38117w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i10) {
        return i10.d((MessageObject) this.f42169a.f38101f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f42169a.O;
    }
}
