package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class t00 extends bu0 {
    public final g10 f41544a;

    public t00(g10 g10Var) {
        this.f41544a = g10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f41544a.f37024f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.w9 w9Var;
        if (messageObject != null) {
            ai.u1 u1Var = this.f41544a.f37018b;
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
                            messageObject2 = t7Var.f23197b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= t7Var.e) {
                                w9Var = null;
                            } else {
                                w9Var = t7Var.f23196a[i13].f22749a;
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
                    lu0 lu0Var = new lu0();
                    lu0Var.f38918b = iArr[0];
                    lu0Var.f38919c = iArr[1];
                    lu0Var.d = u1Var;
                    u1Var.getLocationInWindow(iArr);
                    lu0Var.f38927n = -iArr[1];
                    lu0Var.f38917a = photoImage;
                    lu0Var.f38928o = false;
                    lu0Var.h = photoImage.getRoundRadius(true);
                    lu0Var.e = lu0Var.f38917a.getBitmapSafe();
                    lu0Var.d.getLocationInWindow(iArr);
                    lu0Var.f38923j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = u1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - lu0Var.f38919c;
                        if (i14 > childAt.getHeight()) {
                            u1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return lu0Var;
                        }
                        int height = lu0Var.f38919c - u1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
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
        g10 g10Var = this.f41544a;
        if (!g10Var.N) {
            g10Var.h(g10Var.E, g10Var.F, g10Var.H, g10Var.G, g10Var.f37042y, g10Var.J, g10Var.f37040w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i10) {
        return g10.d((MessageObject) this.f41544a.f37024f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f41544a.O;
    }
}
