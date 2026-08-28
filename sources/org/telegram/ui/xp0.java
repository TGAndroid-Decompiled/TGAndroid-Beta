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
public final class xp0 extends org.telegram.ui.Components.vk0 {
    public final Context f44568c;
    public final zp0 d;

    public xp0(zp0 zp0Var, Context context) {
        this.d = zp0Var;
        this.f44568c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        zp0 zp0Var = this.d;
        if (zp0Var.F == null) {
            if (TextUtils.isEmpty(zp0Var.v)) {
                if (q1Var.f5505f != 3) {
                    return false;
                }
                return true;
            } else if (q1Var.b() >= zp0Var.f45215f.size()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        zp0 zp0Var = this.d;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (albumEntry == null) {
            if (zp0Var.f45215f.isEmpty()) {
                if (!TextUtils.isEmpty(zp0Var.v) || zp0Var.f45223n.isEmpty()) {
                    return 0;
                }
                return zp0Var.f45223n.size() + 2;
            }
            return zp0Var.f45215f.size() + (!zp0Var.f45230s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i9) {
        return i9;
    }

    @Override
    public final int j(int i9) {
        zp0 zp0Var = this.d;
        if (zp0Var.U) {
            return 2;
        }
        if (zp0Var.F != null) {
            return 0;
        }
        if (zp0Var.f45215f.isEmpty()) {
            if (i9 == zp0Var.f45223n.size()) {
                return 4;
            }
            return 3;
        } else if (i9 < zp0Var.f45215f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean L1;
        boolean z10;
        zp0 zp0Var = this.d;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        ArrayList arrayList = zp0Var.f45223n;
        ArrayList arrayList2 = zp0Var.f45210c;
        HashMap hashMap = zp0Var.f45208b;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        int i11 = -1;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                        if (i9 < arrayList.size()) {
                            p8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i9), false);
                            return;
                        } else {
                            p8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
                            return;
                        }
                    }
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i9);
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                i7Var.setPhotoEntry(photoEntry);
                i7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                i7Var.setTag(Integer.valueOf(i9));
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = zp0Var.N;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        t5Var.setItemSize(zp0Var.N);
        org.telegram.ui.Components.o9 imageView = t5Var.getImageView();
        t5Var.setTag(Integer.valueOf(i9));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i9);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            t5Var.d(photoEntry2, z10, true, false, false);
            if (zp0Var.f45213e) {
                i11 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            t5Var.b(i11, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            L1 = PhotoViewer.L1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f45215f.get(i9);
            t5Var.e(searchImage);
            t5Var.getVideoInfoContainer().setVisibility(4);
            if (zp0Var.f45213e) {
                i11 = arrayList2.indexOf(searchImage.f19643id);
            }
            t5Var.b(i11, hashMap.containsKey(searchImage.f19643id), false);
            L1 = PhotoViewer.L1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!L1, true);
        t5Var.getCheckBox().setVisibility((zp0Var.P != 0 || L1) ? 8 : 8);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        zp0 zp0Var = this.d;
        boolean z10 = zp0Var.f45224n0;
        int i10 = 0;
        Context context = this.f44568c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                        c3Var.setForceDarkTheme(z10);
                        viewGroup3 = c3Var;
                    } else {
                        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(23, context, true);
                        p8Var.setLayoutParams(new f2.a1(-1, -2));
                        viewGroup2 = p8Var;
                        if (z10) {
                            p8Var.f24872a.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, zp0Var.f45229r0, false));
                            p8Var.f24875e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23258rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = p8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.i7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new f2.a1(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, g7.e6.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new f2.q1(viewGroup3);
        }
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context, null);
        t5Var.setDelegate(new wp0(this));
        FrameLayout checkFrame = t5Var.getCheckFrame();
        if (zp0Var.P != 0) {
            i10 = 8;
        }
        checkFrame.setVisibility(i10);
        viewGroup2 = t5Var;
        viewGroup3 = viewGroup2;
        return new f2.q1(viewGroup3);
    }
}
