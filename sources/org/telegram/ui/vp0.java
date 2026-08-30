package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class vp0 extends yt0 {
    public final fq0 f39230a;

    public vp0(fq0 fq0Var) {
        this.f39230a = fq0Var;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        fq0 fq0Var = this.f39230a;
        org.telegram.ui.Cells.t5 V = fq0.V(fq0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.p9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            ju0 ju0Var = new ju0();
            ju0Var.f35496b = iArr[0];
            ju0Var.f35497c = iArr[1];
            ju0Var.d = fq0Var.H;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            ju0Var.f35495a = imageReceiver;
            ju0Var.e = imageReceiver.getBitmapSafe();
            ju0Var.f35502k = V.getScale();
            V.g(false);
            return ju0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        fq0 fq0Var = this.f39230a;
        int childCount = fq0Var.H.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fq0Var.H.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f39230a.f34315b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f16663id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        fq0 fq0Var = this.f39230a;
        if (!fq0Var.f34315b.containsKey(obj2)) {
            return -1;
        }
        fq0Var.f34315b.remove(obj2);
        int indexOf = fq0Var.f34317c.indexOf(obj2);
        if (indexOf >= 0) {
            fq0Var.f34317c.remove(indexOf);
        }
        if (fq0Var.e) {
            fq0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        fq0 fq0Var = this.f39230a;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        org.telegram.ui.Cells.t5 V = fq0.V(fq0Var, i10);
        if (V != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.p9 imageView = V.getImageView();
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
            V.e((MediaController.SearchImage) fq0Var.f34321f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        fq0 fq0Var = this.f39230a;
        int childCount = fq0Var.H.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = fq0Var.H.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = fq0Var.G;
                if (albumEntry == null ? !(intValue < 0 || intValue >= fq0Var.f34321f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f39230a.f34317c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = fq0.V(this.f39230a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z4;
        fq0 fq0Var = this.f39230a;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = fq0Var.G.photos.get(i10);
            Y = fq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = fq0Var.f34317c.indexOf(Integer.valueOf(photoEntry.imageId));
                z4 = true;
            } else {
                photoEntry.editedInfo = null;
                z4 = false;
            }
        } else if (i10 < 0 || i10 >= fq0Var.f34321f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) fq0Var.f34321f.get(i10);
            Y = fq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = fq0Var.f34317c.indexOf(searchImage.f16663id);
                z4 = true;
            } else {
                searchImage.editedInfo = null;
                z4 = false;
            }
        }
        int childCount = fq0Var.H.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = fq0Var.H.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (fq0Var.e) {
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
        fq0Var.i0(i12);
        fq0Var.f34332p0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        fq0 fq0Var = this.f39230a;
        ArrayList arrayList = fq0Var.f34321f;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        if (fq0Var.f34315b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    fq0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                fq0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        fq0Var.e0(i11, z4);
    }

    @Override
    public final boolean u() {
        fq0 fq0Var = this.f39230a;
        fq0Var.f34332p0.f(0, true, true);
        fq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f39230a.f34315b;
    }

    @Override
    public final boolean x(int i10) {
        fq0 fq0Var = this.f39230a;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !fq0Var.f34315b.containsKey(Integer.valueOf(fq0Var.G.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= fq0Var.f34321f.size() || !fq0Var.f34315b.containsKey(((MediaController.SearchImage) fq0Var.f34321f.get(i10)).f16663id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f39230a.B;
    }
}
