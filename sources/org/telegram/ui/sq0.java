package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadialProgressView;
public final class sq0 extends org.telegram.ui.Components.ll0 {
    public final Context f37403c;
    public final uq0 d;

    public sq0(uq0 uq0Var, Context context) {
        this.d = uq0Var;
        this.f37403c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        uq0 uq0Var = this.d;
        if (uq0Var.J == null) {
            if (TextUtils.isEmpty(uq0Var.v)) {
                if (c1Var.f42630f != 3) {
                    return false;
                }
                return true;
            } else if (c1Var.b() >= uq0Var.f38175f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        uq0 uq0Var = this.d;
        MediaController.AlbumEntry albumEntry = uq0Var.J;
        if (albumEntry == null) {
            if (uq0Var.f38175f.isEmpty()) {
                if (!TextUtils.isEmpty(uq0Var.v) || uq0Var.f38183n.isEmpty()) {
                    return 0;
                }
                return uq0Var.f38183n.size() + 2;
            }
            return uq0Var.f38175f.size() + (!uq0Var.f38190s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        uq0 uq0Var = this.d;
        if (uq0Var.Y) {
            return 2;
        }
        if (uq0Var.J != null) {
            return 0;
        }
        if (uq0Var.f38175f.isEmpty()) {
            if (i10 == uq0Var.f38183n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < uq0Var.f38175f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean L1;
        boolean z10;
        uq0 uq0Var = this.d;
        MediaController.AlbumEntry albumEntry = uq0Var.J;
        ArrayList arrayList = uq0Var.f38183n;
        ArrayList arrayList2 = uq0Var.f38171c;
        HashMap hashMap = uq0Var.f38169b;
        int i11 = c1Var.f42630f;
        View view = c1Var.f42627a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        if (i10 < arrayList.size()) {
                            s8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            s8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
                            return;
                        }
                    }
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                j7Var.setPhotoEntry(photoEntry);
                j7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                j7Var.setTag(Integer.valueOf(i10));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = uq0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        t5Var.setItemSize(uq0Var.R);
        org.telegram.ui.Components.w9 imageView = t5Var.getImageView();
        t5Var.setTag(Integer.valueOf(i10));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t5Var.d(photoEntry2, z10, true, false, false);
            if (uq0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            t5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            L1 = PhotoViewer.L1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) uq0Var.f38175f.get(i10);
            t5Var.e(searchImage);
            t5Var.getVideoInfoContainer().setVisibility(4);
            if (uq0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f15571id);
            }
            t5Var.b(i12, hashMap.containsKey(searchImage.f15571id), false);
            L1 = PhotoViewer.L1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!L1, true);
        t5Var.getCheckBox().setVisibility((uq0Var.T != 0 || L1) ? 8 : 8);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        uq0 uq0Var = this.d;
        boolean z10 = uq0Var.f38189r0;
        int i11 = 0;
        Context context = this.f37403c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                        c3Var.setForceDarkTheme(z10);
                        viewGroup3 = c3Var;
                    } else {
                        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(23, context, true);
                        s8Var.setLayoutParams(new s4.p0(-1, -2));
                        viewGroup2 = s8Var;
                        if (z10) {
                            s8Var.f20926a.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, uq0Var.f38194v0, false));
                            s8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19054rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = s8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.j7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.p0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, w7.x5.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new s4.c1(viewGroup3);
        }
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context, null);
        t5Var.setDelegate(new rq0(this));
        FrameLayout checkFrame = t5Var.getCheckFrame();
        if (uq0Var.T != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = t5Var;
        viewGroup3 = viewGroup2;
        return new s4.c1(viewGroup3);
    }
}
