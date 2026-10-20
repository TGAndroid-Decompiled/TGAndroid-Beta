package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class r00 extends zt0 {
    public final e10 f41026a;

    public r00(e10 e10Var) {
        this.f41026a = e10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f41026a.f36499f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.w9 w9Var;
        if (messageObject != null) {
            ai.u1 u1Var = this.f41026a.f36493b;
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
                            messageObject2 = t7Var.f23201b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= t7Var.e) {
                                w9Var = null;
                            } else {
                                w9Var = t7Var.f23200a[i13].f22753a;
                            }
                            ImageReceiver imageReceiver = w9Var.getImageReceiver();
                            w9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (i7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = i7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        MessageObject messageObject3 = (MessageObject) f2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = f2Var.getPhotoImage();
                            f2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    ju0 ju0Var = new ju0();
                    ju0Var.f38351b = iArr[0];
                    ju0Var.f38352c = iArr[1];
                    ju0Var.d = u1Var;
                    u1Var.getLocationInWindow(iArr);
                    ju0Var.f38360n = -iArr[1];
                    ju0Var.f38350a = photoImage;
                    ju0Var.f38361o = false;
                    ju0Var.h = photoImage.getRoundRadius(true);
                    ju0Var.e = ju0Var.f38350a.getBitmapSafe();
                    ju0Var.d.getLocationInWindow(iArr);
                    ju0Var.f38356j = 0;
                    if (PhotoViewer.P1(messageObject) && (pinnedHeader = u1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - ju0Var.f38352c;
                        if (i14 > childAt.getHeight()) {
                            u1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return ju0Var;
                        }
                        int height = ju0Var.f38352c - u1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            u1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return ju0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        e10 e10Var = this.f41026a;
        if (!e10Var.N) {
            e10Var.h(e10Var.E, e10Var.F, e10Var.H, e10Var.G, e10Var.f36517y, e10Var.J, e10Var.f36515w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i10) {
        return e10.d((MessageObject) this.f41026a.f36499f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f41026a.O;
    }
}
