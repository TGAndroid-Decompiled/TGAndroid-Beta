package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class xp0 extends au0 {
    public final hq0 f43446a;

    public xp0(hq0 hq0Var) {
        this.f43446a = hq0Var;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        hq0 hq0Var = this.f43446a;
        org.telegram.ui.Cells.t5 V = hq0.V(hq0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.p9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            lu0 lu0Var = new lu0();
            lu0Var.f38865b = iArr[0];
            lu0Var.f38866c = iArr[1];
            lu0Var.d = hq0Var.H;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            lu0Var.f38864a = imageReceiver;
            lu0Var.f38867e = imageReceiver.getBitmapSafe();
            lu0Var.f38872k = V.getScale();
            V.g(false);
            return lu0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        hq0 hq0Var = this.f43446a;
        int childCount = hq0Var.H.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = hq0Var.H.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f43446a.f37573b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f18049id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        hq0 hq0Var = this.f43446a;
        if (!hq0Var.f37573b.containsKey(obj2)) {
            return -1;
        }
        hq0Var.f37573b.remove(obj2);
        int indexOf = hq0Var.f37575c.indexOf(obj2);
        if (indexOf >= 0) {
            hq0Var.f37575c.remove(indexOf);
        }
        if (hq0Var.f37578e) {
            hq0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        hq0 hq0Var = this.f43446a;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        org.telegram.ui.Cells.t5 V = hq0.V(hq0Var, i10);
        if (V != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.p9 imageView = V.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.f(str, null, org.telegram.ui.ActionBar.k6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.k6.R4);
                        return;
                    }
                    imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.k6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                    return;
                }
            }
            V.e((MediaController.SearchImage) hq0Var.f37580f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        hq0 hq0Var = this.f43446a;
        int childCount = hq0Var.H.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = hq0Var.H.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = hq0Var.G;
                if (albumEntry == null ? !(intValue < 0 || intValue >= hq0Var.f37580f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f43446a.f37575c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = hq0.V(this.f43446a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z4;
        hq0 hq0Var = this.f43446a;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = hq0Var.G.photos.get(i10);
            Y = hq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = hq0Var.f37575c.indexOf(Integer.valueOf(photoEntry.imageId));
                z4 = true;
            } else {
                photoEntry.editedInfo = null;
                z4 = false;
            }
        } else if (i10 < 0 || i10 >= hq0Var.f37580f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) hq0Var.f37580f.get(i10);
            Y = hq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = hq0Var.f37575c.indexOf(searchImage.f18049id);
                z4 = true;
            } else {
                searchImage.editedInfo = null;
                z4 = false;
            }
        }
        int childCount = hq0Var.H.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = hq0Var.H.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (hq0Var.f37578e) {
                    i11 = Y;
                }
                t5Var.b(i11, z4, false);
            } else {
                i13++;
            }
        }
        if (!z4) {
            i12 = 2;
        }
        hq0Var.i0(i12);
        hq0Var.f37591p0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        hq0 hq0Var = this.f43446a;
        ArrayList arrayList = hq0Var.f37580f;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        if (hq0Var.f37573b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    hq0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                hq0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        hq0Var.e0(i11, z4);
    }

    @Override
    public final boolean u() {
        hq0 hq0Var = this.f43446a;
        hq0Var.f37591p0.f(0, true, true);
        hq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f43446a.f37573b;
    }

    @Override
    public final boolean x(int i10) {
        hq0 hq0Var = this.f43446a;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !hq0Var.f37573b.containsKey(Integer.valueOf(hq0Var.G.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= hq0Var.f37580f.size() || !hq0Var.f37573b.containsKey(((MediaController.SearchImage) hq0Var.f37580f.get(i10)).f18049id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f43446a.B;
    }
}
