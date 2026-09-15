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
public final class yq0 extends org.telegram.ui.Components.kl0 {
    public final Context f39965c;
    public final ar0 d;

    public yq0(ar0 ar0Var, Context context) {
        this.d = ar0Var;
        this.f39965c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        ar0 ar0Var = this.d;
        if (ar0Var.J == null) {
            if (TextUtils.isEmpty(ar0Var.v)) {
                if (c1Var.f42678f != 3) {
                    return false;
                }
                return true;
            } else if (c1Var.b() >= ar0Var.f31916f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        ar0 ar0Var = this.d;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        if (albumEntry == null) {
            if (ar0Var.f31916f.isEmpty()) {
                if (!TextUtils.isEmpty(ar0Var.v) || ar0Var.f31924n.isEmpty()) {
                    return 0;
                }
                return ar0Var.f31924n.size() + 2;
            }
            return ar0Var.f31916f.size() + (!ar0Var.f31931s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        ar0 ar0Var = this.d;
        if (ar0Var.Y) {
            return 2;
        }
        if (ar0Var.J != null) {
            return 0;
        }
        if (ar0Var.f31916f.isEmpty()) {
            if (i10 == ar0Var.f31924n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < ar0Var.f31916f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean L1;
        boolean z10;
        ar0 ar0Var = this.d;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        ArrayList arrayList = ar0Var.f31924n;
        ArrayList arrayList2 = ar0Var.f31912c;
        HashMap hashMap = ar0Var.f31910b;
        int i11 = c1Var.f42678f;
        View view = c1Var.f42675a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        if (i10 < arrayList.size()) {
                            r8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            r8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
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
                layoutParams.height = ar0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        s5Var.setItemSize(ar0Var.R);
        org.telegram.ui.Components.u9 imageView = s5Var.getImageView();
        s5Var.setTag(Integer.valueOf(i10));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s5Var.d(photoEntry2, z10, true, false, false);
            if (ar0Var.e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            s5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            L1 = PhotoViewer.L1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) ar0Var.f31916f.get(i10);
            s5Var.e(searchImage);
            s5Var.getVideoInfoContainer().setVisibility(4);
            if (ar0Var.e) {
                i12 = arrayList2.indexOf(searchImage.f15597id);
            }
            s5Var.b(i12, hashMap.containsKey(searchImage.f15597id), false);
            L1 = PhotoViewer.L1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!L1, true);
        s5Var.getCheckBox().setVisibility((ar0Var.T != 0 || L1) ? 8 : 8);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ar0 ar0Var = this.d;
        boolean z10 = ar0Var.f31930r0;
        int i11 = 0;
        Context context = this.f39965c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                        c3Var.setForceDarkTheme(z10);
                        viewGroup3 = c3Var;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, context, true);
                        r8Var.setLayoutParams(new s4.p0(-1, -2));
                        viewGroup2 = r8Var;
                        if (z10) {
                            r8Var.f20804a.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, ar0Var.f31935v0, false));
                            r8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19102rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = r8Var;
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
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context, null);
        s5Var.setDelegate(new xq0(this));
        FrameLayout checkFrame = s5Var.getCheckFrame();
        if (ar0Var.T != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = s5Var;
        viewGroup3 = viewGroup2;
        return new s4.c1(viewGroup3);
    }
}
