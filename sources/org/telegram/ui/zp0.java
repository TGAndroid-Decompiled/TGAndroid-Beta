package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class zp0 extends bu0 {
    public final kq0 f43792a;

    public zp0(kq0 kq0Var) {
        this.f43792a = kq0Var;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.f43792a;
        org.telegram.ui.Cells.s5 V = kq0.V(kq0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            lu0 lu0Var = new lu0();
            lu0Var.f38938b = iArr[0];
            lu0Var.f38939c = iArr[1];
            lu0Var.d = kq0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            lu0Var.f38937a = imageReceiver;
            lu0Var.e = imageReceiver.getBitmapSafe();
            lu0Var.f38944k = V.getScale();
            V.g(false);
            return lu0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        kq0 kq0Var = this.f43792a;
        int childCount = kq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = kq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f43792a.f38639b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f17789id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        kq0 kq0Var = this.f43792a;
        if (!kq0Var.f38639b.containsKey(obj2)) {
            return -1;
        }
        kq0Var.f38639b.remove(obj2);
        int indexOf = kq0Var.f38641c.indexOf(obj2);
        if (indexOf >= 0) {
            kq0Var.f38641c.remove(indexOf);
        }
        if (kq0Var.e) {
            kq0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i10) {
        kq0 kq0Var = this.f43792a;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        org.telegram.ui.Cells.s5 V = kq0.V(kq0Var, i10);
        if (V != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.w9 imageView = V.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.f(str, null, org.telegram.ui.ActionBar.h6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
                        return;
                    }
                    imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.h6.R4);
                    return;
                }
            }
            V.e((MediaController.SearchImage) kq0Var.f38645f.get(i10));
        }
    }

    @Override
    public final void a0(int i10) {
        kq0 kq0Var = this.f43792a;
        int childCount = kq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = kq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = kq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= kq0Var.f38645f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        s5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f43792a.f38641c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 V = kq0.V(this.f43792a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        kq0 kq0Var = this.f43792a;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = kq0Var.J.photos.get(i10);
            Y = kq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = kq0Var.f38641c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= kq0Var.f38645f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) kq0Var.f38645f.get(i10);
            Y = kq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = kq0Var.f38641c.indexOf(searchImage.f17789id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = kq0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = kq0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                if (kq0Var.e) {
                    i11 = Y;
                }
                s5Var.b(i11, z10, false);
            } else {
                i13++;
            }
        }
        if (!z10) {
            i12 = 2;
        }
        kq0Var.i0(i12);
        kq0Var.f38661s0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        kq0 kq0Var = this.f43792a;
        ArrayList arrayList = kq0Var.f38645f;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        if (kq0Var.f38639b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    kq0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                kq0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        kq0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        kq0 kq0Var = this.f43792a;
        kq0Var.f38661s0.h(0, true, true);
        kq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f43792a.f38639b;
    }

    @Override
    public final boolean x(int i10) {
        kq0 kq0Var = this.f43792a;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !kq0Var.f38639b.containsKey(Integer.valueOf(kq0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= kq0Var.f38645f.size() || !kq0Var.f38639b.containsKey(((MediaController.SearchImage) kq0Var.f38645f.get(i10)).f17789id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f43792a.E;
    }
}
