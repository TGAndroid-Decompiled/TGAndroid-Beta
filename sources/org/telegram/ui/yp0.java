package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class yp0 extends zt0 {
    public final jq0 f43539a;

    public yp0(jq0 jq0Var) {
        this.f43539a = jq0Var;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.f43539a;
        org.telegram.ui.Cells.s5 V = jq0.V(jq0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            ju0 ju0Var = new ju0();
            ju0Var.f38355b = iArr[0];
            ju0Var.f38356c = iArr[1];
            ju0Var.d = jq0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            ju0Var.f38354a = imageReceiver;
            ju0Var.e = imageReceiver.getBitmapSafe();
            ju0Var.f38361k = V.getScale();
            V.g(false);
            return ju0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        jq0 jq0Var = this.f43539a;
        int childCount = jq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f43539a.f38306b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f17793id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        jq0 jq0Var = this.f43539a;
        if (!jq0Var.f38306b.containsKey(obj2)) {
            return -1;
        }
        jq0Var.f38306b.remove(obj2);
        int indexOf = jq0Var.f38308c.indexOf(obj2);
        if (indexOf >= 0) {
            jq0Var.f38308c.remove(indexOf);
        }
        if (jq0Var.e) {
            jq0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i10) {
        jq0 jq0Var = this.f43539a;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        org.telegram.ui.Cells.s5 V = jq0.V(jq0Var, i10);
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
            V.e((MediaController.SearchImage) jq0Var.f38312f.get(i10));
        }
    }

    @Override
    public final void a0(int i10) {
        jq0 jq0Var = this.f43539a;
        int childCount = jq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = jq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = jq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= jq0Var.f38312f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f43539a.f38308c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 V = jq0.V(this.f43539a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        jq0 jq0Var = this.f43539a;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = jq0Var.J.photos.get(i10);
            Y = jq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = jq0Var.f38308c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= jq0Var.f38312f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) jq0Var.f38312f.get(i10);
            Y = jq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = jq0Var.f38308c.indexOf(searchImage.f17793id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = jq0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = jq0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                if (jq0Var.e) {
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
        jq0Var.i0(i12);
        jq0Var.f38328s0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        jq0 jq0Var = this.f43539a;
        ArrayList arrayList = jq0Var.f38312f;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        if (jq0Var.f38306b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    jq0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                jq0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        jq0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        jq0 jq0Var = this.f43539a;
        jq0Var.f38328s0.h(0, true, true);
        jq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f43539a.f38306b;
    }

    @Override
    public final boolean x(int i10) {
        jq0 jq0Var = this.f43539a;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !jq0Var.f38306b.containsKey(Integer.valueOf(jq0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= jq0Var.f38312f.size() || !jq0Var.f38306b.containsKey(((MediaController.SearchImage) jq0Var.f38312f.get(i10)).f17793id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f43539a.E;
    }
}
