package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class qp0 extends st0 {

    public final aq0 f41729a;

    public qp0(aq0 aq0Var) {
        this.f41729a = aq0Var;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        aq0 aq0Var = this.f41729a;
        org.telegram.ui.Cells.q5 q5VarV = aq0.V(aq0Var, i10);
        if (q5VarV == null) {
            return null;
        }
        org.telegram.ui.Components.n9 imageView = q5VarV.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        cu0 cu0Var = new cu0();
        cu0Var.f37154b = iArr[0];
        cu0Var.f37155c = iArr[1];
        cu0Var.d = aq0Var.G;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        cu0Var.f37153a = imageReceiver;
        cu0Var.f37156e = imageReceiver.getBitmapSafe();
        cu0Var.f37161k = q5VarV.getScale();
        q5VarV.g(false);
        return cu0Var;
    }

    @Override
    public final void G() {
        aq0 aq0Var = this.f41729a;
        int childCount = aq0Var.G.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = aq0Var.G.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f41729a.f36598b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object objValueOf;
        if (obj instanceof MediaController.PhotoEntry) {
            objValueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else {
            objValueOf = obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).f19616id : null;
        }
        if (objValueOf == null) {
            return -1;
        }
        aq0 aq0Var = this.f41729a;
        if (!aq0Var.f36598b.containsKey(objValueOf)) {
            return -1;
        }
        aq0Var.f36598b.remove(objValueOf);
        int iIndexOf = aq0Var.f36600c.indexOf(objValueOf);
        if (iIndexOf >= 0) {
            aq0Var.f36600c.remove(iIndexOf);
        }
        if (aq0Var.f36603e) {
            aq0Var.h0();
        }
        return iIndexOf;
    }

    @Override
    public final void W(int i10) {
        aq0 aq0Var = this.f41729a;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        org.telegram.ui.Cells.q5 q5VarV = aq0.V(aq0Var, i10);
        if (q5VarV != null) {
            if (albumEntry == null) {
                q5VarV.e((MediaController.SearchImage) aq0Var.f36605f.get(i10));
                return;
            }
            org.telegram.ui.Components.n9 imageView = q5VarV.getImageView();
            imageView.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            String str = photoEntry.thumbPath;
            if (str != null) {
                imageView.f(str, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            if (photoEntry.path == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            imageView.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                return;
            }
            imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
        }
    }

    @Override
    public final void Z(int i10) {
        aq0 aq0Var = this.f41729a;
        int childCount = aq0Var.G.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = aq0Var.G.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int iIntValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = aq0Var.F;
                if (albumEntry != null) {
                    if (iIntValue >= 0 && iIntValue < albumEntry.photos.size()) {
                        if (iIntValue == i10) {
                            q5Var.g(true);
                            return;
                        }
                    }
                } else if (iIntValue >= 0 && iIntValue < aq0Var.f36605f.size()) {
                    if (iIntValue == i10) {
                        q5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f41729a.f36600c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.q5 q5VarV = aq0.V(this.f41729a, i10);
        if (q5VarV != null) {
            return q5VarV.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int iY;
        boolean z10;
        aq0 aq0Var = this.f41729a;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = aq0Var.F.photos.get(i10);
            iY = aq0Var.Y(-1, photoEntry);
            if (iY == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                iY = aq0Var.f36600c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= aq0Var.f36605f.size()) {
                return -1;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) aq0Var.f36605f.get(i10);
            iY = aq0Var.Y(-1, searchImage);
            if (iY == -1) {
                searchImage.editedInfo = videoEditedInfo;
                iY = aq0Var.f36600c.indexOf(searchImage.f19616id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = aq0Var.G.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = aq0Var.G.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.q5) childAt).b(aq0Var.f36603e ? iY : -1, z10, false);
                break;
            }
        }
        aq0Var.i0(z10 ? 1 : 2);
        aq0Var.f36615o0.a();
        return iY;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        aq0 aq0Var = this.f41729a;
        ArrayList arrayList = aq0Var.f36605f;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        if (aq0Var.f36598b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                photoEntry.editedInfo = videoEditedInfo;
                aq0Var.Y(-1, photoEntry);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                aq0Var.Y(-1, searchImage);
            }
        }
        aq0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        aq0 aq0Var = this.f41729a;
        aq0Var.f36615o0.i(0, true, true);
        aq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f41729a.f36598b;
    }

    @Override
    public final boolean x(int i10) {
        aq0 aq0Var = this.f41729a;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        if (albumEntry != null) {
            return i10 >= 0 && i10 < albumEntry.photos.size() && aq0Var.f36598b.containsKey(Integer.valueOf(aq0Var.F.photos.get(i10).imageId));
        }
        return i10 >= 0 && i10 < aq0Var.f36605f.size() && aq0Var.f36598b.containsKey(((MediaController.SearchImage) aq0Var.f36605f.get(i10)).f19616id);
    }

    @Override
    public final boolean z() {
        return this.f41729a.A;
    }
}
