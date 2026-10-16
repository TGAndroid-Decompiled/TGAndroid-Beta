package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class uq0 extends zu0 {
    public final fr0 f40470a;

    public uq0(fr0 fr0Var) {
        this.f40470a = fr0Var;
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        fr0 fr0Var = this.f40470a;
        org.telegram.ui.Cells.t5 V = fr0.V(fr0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.z9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            jv0 jv0Var = new jv0();
            jv0Var.f37146b = iArr[0];
            jv0Var.f37147c = iArr[1];
            jv0Var.d = fr0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            jv0Var.f37145a = imageReceiver;
            jv0Var.e = imageReceiver.getBitmapSafe();
            jv0Var.f37152k = V.getScale();
            V.g(false);
            return jv0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        fr0 fr0Var = this.f40470a;
        int childCount = fr0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fr0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f40470a.f35913b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f16394id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        fr0 fr0Var = this.f40470a;
        if (!fr0Var.f35913b.containsKey(obj2)) {
            return -1;
        }
        fr0Var.f35913b.remove(obj2);
        int indexOf = fr0Var.f35915c.indexOf(obj2);
        if (indexOf >= 0) {
            fr0Var.f35915c.remove(indexOf);
        }
        if (fr0Var.e) {
            fr0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i10) {
        fr0 fr0Var = this.f40470a;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        org.telegram.ui.Cells.t5 V = fr0.V(fr0Var, i10);
        if (V != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.z9 imageView = V.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.f(str, null, org.telegram.ui.ActionBar.g6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                        return;
                    }
                    imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                    return;
                }
            }
            V.e((MediaController.SearchImage) fr0Var.f35919f.get(i10));
        }
    }

    @Override
    public final void a0(int i10) {
        fr0 fr0Var = this.f40470a;
        int childCount = fr0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = fr0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = fr0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= fr0Var.f35919f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f40470a.f35915c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = fr0.V(this.f40470a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        fr0 fr0Var = this.f40470a;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = fr0Var.J.photos.get(i10);
            Y = fr0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = fr0Var.f35915c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= fr0Var.f35919f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) fr0Var.f35919f.get(i10);
            Y = fr0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = fr0Var.f35915c.indexOf(searchImage.f16394id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = fr0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = fr0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (fr0Var.e) {
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
        fr0Var.i0(i12);
        fr0Var.f35935s0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        fr0 fr0Var = this.f40470a;
        ArrayList arrayList = fr0Var.f35919f;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        if (fr0Var.f35913b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    fr0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                fr0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        fr0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        fr0 fr0Var = this.f40470a;
        fr0Var.f35935s0.h(0, true, true);
        fr0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f40470a.f35913b;
    }

    @Override
    public final boolean x(int i10) {
        fr0 fr0Var = this.f40470a;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !fr0Var.f35913b.containsKey(Integer.valueOf(fr0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= fr0Var.f35919f.size() || !fr0Var.f35913b.containsKey(((MediaController.SearchImage) fr0Var.f35919f.get(i10)).f16394id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f40470a.E;
    }
}
