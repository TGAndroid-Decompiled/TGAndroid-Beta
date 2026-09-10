package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class qq0 extends tu0 {
    public final br0 f36119a;

    public qq0(br0 br0Var) {
        this.f36119a = br0Var;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        br0 br0Var = this.f36119a;
        org.telegram.ui.Cells.t5 V = br0.V(br0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            ev0 ev0Var = new ev0();
            ev0Var.f32617b = iArr[0];
            ev0Var.f32618c = iArr[1];
            ev0Var.d = br0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            ev0Var.f32616a = imageReceiver;
            ev0Var.e = imageReceiver.getBitmapSafe();
            ev0Var.f32623k = V.getScale();
            V.g(false);
            return ev0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        br0 br0Var = this.f36119a;
        int childCount = br0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = br0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f36119a.f31365b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f14639id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        br0 br0Var = this.f36119a;
        if (!br0Var.f31365b.containsKey(obj2)) {
            return -1;
        }
        br0Var.f31365b.remove(obj2);
        int indexOf = br0Var.f31367c.indexOf(obj2);
        if (indexOf >= 0) {
            br0Var.f31367c.remove(indexOf);
        }
        if (br0Var.e) {
            br0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        br0 br0Var = this.f36119a;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        org.telegram.ui.Cells.t5 V = br0.V(br0Var, i10);
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
            V.e((MediaController.SearchImage) br0Var.f31371f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        br0 br0Var = this.f36119a;
        int childCount = br0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = br0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = br0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= br0Var.f31371f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f36119a.f31367c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = br0.V(this.f36119a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        br0 br0Var = this.f36119a;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = br0Var.J.photos.get(i10);
            Y = br0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = br0Var.f31367c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= br0Var.f31371f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) br0Var.f31371f.get(i10);
            Y = br0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = br0Var.f31367c.indexOf(searchImage.f14639id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = br0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = br0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (br0Var.e) {
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
        br0Var.i0(i12);
        br0Var.f31387s0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        br0 br0Var = this.f36119a;
        ArrayList arrayList = br0Var.f31371f;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        if (br0Var.f31365b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    br0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                br0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        br0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        br0 br0Var = this.f36119a;
        br0Var.f31387s0.h(0, true, true);
        br0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f36119a.f31365b;
    }

    @Override
    public final boolean x(int i10) {
        br0 br0Var = this.f36119a;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !br0Var.f31365b.containsKey(Integer.valueOf(br0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= br0Var.f31371f.size() || !br0Var.f31365b.containsKey(((MediaController.SearchImage) br0Var.f31371f.get(i10)).f14639id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f36119a.E;
    }
}
