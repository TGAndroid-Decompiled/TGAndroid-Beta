package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class s00 extends rt0 {
    public final f10 f42518a;

    public s00(f10 f10Var) {
        this.f42518a = f10Var;
    }

    @Override
    public final CharSequence C(int i9) {
        return LocaleController.formatDateAudio(((MessageObject) this.f42518a.f38094f.get(i9)).messageOwner.date, false);
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i10;
        MessageObject messageObject2;
        org.telegram.ui.Components.o9 o9Var;
        if (messageObject != null) {
            gh.f1 f1Var = this.f42518a.f38087b;
            int childCount = f1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = f1Var.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    photoImage = null;
                    for (int i12 = 0; i12 < 6; i12++) {
                        if (i12 >= s7Var.f25283e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = s7Var.f25281b[i12];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i12 >= s7Var.f25283e) {
                                o9Var = null;
                            } else {
                                o9Var = s7Var.f25280a[i12].f24832a;
                            }
                            ImageReceiver imageReceiver = o9Var.getImageReceiver();
                            o9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (i7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.o9 imageView = i7Var.getImageView();
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
                    bu0 bu0Var = new bu0();
                    bu0Var.f36979b = iArr[0];
                    bu0Var.f36980c = iArr[1];
                    bu0Var.d = f1Var;
                    f1Var.getLocationInWindow(iArr);
                    bu0Var.f36989n = -iArr[1];
                    bu0Var.f36978a = photoImage;
                    bu0Var.f36990o = false;
                    bu0Var.h = photoImage.getRoundRadius(true);
                    bu0Var.f36981e = bu0Var.f36978a.getBitmapSafe();
                    bu0Var.d.getLocationInWindow(iArr);
                    bu0Var.f36985j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = f1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            i10 = AndroidUtilities.dp(8.0f);
                        } else {
                            i10 = 0;
                        }
                        int i13 = i10 - bu0Var.f36980c;
                        if (i13 > childAt.getHeight()) {
                            f1Var.scrollBy(0, -(pinnedHeader.getHeight() + i13));
                            return bu0Var;
                        }
                        int height = bu0Var.f36980c - f1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            f1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return bu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        f10 f10Var = this.f42518a;
        if (!f10Var.J) {
            f10Var.h(f10Var.A, f10Var.B, f10Var.D, f10Var.C, f10Var.f38108y, f10Var.F, f10Var.f38106w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i9) {
        return f10.d((MessageObject) this.f42518a.f38094f.get(i9), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f42518a.K;
    }
}
