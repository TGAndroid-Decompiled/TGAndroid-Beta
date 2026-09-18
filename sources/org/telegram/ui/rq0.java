package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class rq0 extends tu0 {
    public final cr0 f37116a;

    public rq0(cr0 cr0Var) {
        this.f37116a = cr0Var;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        cr0 cr0Var = this.f37116a;
        org.telegram.ui.Cells.t5 V = cr0.V(cr0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            dv0 dv0Var = new dv0();
            dv0Var.f33093b = iArr[0];
            dv0Var.f33094c = iArr[1];
            dv0Var.d = cr0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            dv0Var.f33092a = imageReceiver;
            dv0Var.e = imageReceiver.getBitmapSafe();
            dv0Var.f33099k = V.getScale();
            V.g(false);
            return dv0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        cr0 cr0Var = this.f37116a;
        int childCount = cr0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cr0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f37116a.f32762b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f15784id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        cr0 cr0Var = this.f37116a;
        if (!cr0Var.f32762b.containsKey(obj2)) {
            return -1;
        }
        cr0Var.f32762b.remove(obj2);
        int indexOf = cr0Var.f32764c.indexOf(obj2);
        if (indexOf >= 0) {
            cr0Var.f32764c.remove(indexOf);
        }
        if (cr0Var.e) {
            cr0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        cr0 cr0Var = this.f37116a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        org.telegram.ui.Cells.t5 V = cr0.V(cr0Var, i10);
        if (V != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.w9 imageView = V.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.f(str, null, org.telegram.ui.ActionBar.j6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
                        return;
                    }
                    imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                    return;
                }
            }
            V.e((MediaController.SearchImage) cr0Var.f32768f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        cr0 cr0Var = this.f37116a;
        int childCount = cr0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = cr0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = cr0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= cr0Var.f32768f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        t5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f37116a.f32764c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = cr0.V(this.f37116a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        cr0 cr0Var = this.f37116a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = cr0Var.J.photos.get(i10);
            Y = cr0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = cr0Var.f32764c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= cr0Var.f32768f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) cr0Var.f32768f.get(i10);
            Y = cr0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = cr0Var.f32764c.indexOf(searchImage.f15784id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = cr0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = cr0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (cr0Var.e) {
                    i11 = Y;
                }
                t5Var.b(i11, z10, false);
            } else {
                i13++;
            }
        }
        if (!z10) {
            i12 = 2;
        }
        cr0Var.i0(i12);
        cr0Var.f32784s0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        cr0 cr0Var = this.f37116a;
        ArrayList arrayList = cr0Var.f32768f;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        if (cr0Var.f32762b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    cr0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                cr0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        cr0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        cr0 cr0Var = this.f37116a;
        cr0Var.f32784s0.i(0, true, true);
        cr0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f37116a.f32762b;
    }

    @Override
    public final boolean x(int i10) {
        cr0 cr0Var = this.f37116a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !cr0Var.f32762b.containsKey(Integer.valueOf(cr0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= cr0Var.f32768f.size() || !cr0Var.f32762b.containsKey(((MediaController.SearchImage) cr0Var.f32768f.get(i10)).f15784id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f37116a.E;
    }
}
