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
public final class zq0 extends org.telegram.ui.Components.ul0 {
    public final Context f39429c;
    public final br0 d;

    public zq0(br0 br0Var, Context context) {
        this.d = br0Var;
        this.f39429c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        br0 br0Var = this.d;
        if (br0Var.J == null) {
            if (TextUtils.isEmpty(br0Var.v)) {
                if (c1Var.f41613f != 3) {
                    return false;
                }
                return true;
            } else if (c1Var.b() >= br0Var.f31371f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        br0 br0Var = this.d;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        if (albumEntry == null) {
            if (br0Var.f31371f.isEmpty()) {
                if (!TextUtils.isEmpty(br0Var.v) || br0Var.f31379n.isEmpty()) {
                    return 0;
                }
                return br0Var.f31379n.size() + 2;
            }
            return br0Var.f31371f.size() + (!br0Var.f31386s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        br0 br0Var = this.d;
        if (br0Var.Y) {
            return 2;
        }
        if (br0Var.J != null) {
            return 0;
        }
        if (br0Var.f31371f.isEmpty()) {
            if (i10 == br0Var.f31379n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < br0Var.f31371f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean L1;
        boolean z10;
        br0 br0Var = this.d;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        ArrayList arrayList = br0Var.f31379n;
        ArrayList arrayList2 = br0Var.f31367c;
        HashMap hashMap = br0Var.f31365b;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
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
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                l7Var.setPhotoEntry(photoEntry);
                l7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                l7Var.setTag(Integer.valueOf(i10));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = br0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        t5Var.setItemSize(br0Var.R);
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
            if (br0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            t5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            L1 = PhotoViewer.L1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) br0Var.f31371f.get(i10);
            t5Var.e(searchImage);
            t5Var.getVideoInfoContainer().setVisibility(4);
            if (br0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f14639id);
            }
            t5Var.b(i12, hashMap.containsKey(searchImage.f14639id), false);
            L1 = PhotoViewer.L1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!L1, true);
        t5Var.getCheckBox().setVisibility((br0Var.T != 0 || L1) ? 8 : 8);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        br0 br0Var = this.d;
        boolean z10 = br0Var.f31385r0;
        int i11 = 0;
        Context context = this.f39429c;
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
                            s8Var.f20037a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, br0Var.f31390v0, false));
                            s8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18190rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = s8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.l7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.p0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, w7.a6.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new s4.c1(viewGroup3);
        }
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context, null);
        t5Var.setDelegate(new yq0(this));
        FrameLayout checkFrame = t5Var.getCheckFrame();
        if (br0Var.T != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = t5Var;
        viewGroup3 = viewGroup2;
        return new s4.c1(viewGroup3);
    }
}
