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
public final class xp0 extends org.telegram.ui.Components.il0 {
    public final Context f44637c;
    public final zp0 d;

    public xp0(zp0 zp0Var, Context context) {
        this.d = zp0Var;
        this.f44637c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        zp0 zp0Var = this.d;
        if (zp0Var.F == null) {
            if (TextUtils.isEmpty(zp0Var.v)) {
                if (n1Var.f6436f != 3) {
                    return false;
                }
                return true;
            } else if (n1Var.b() >= zp0Var.f45280f.size()) {
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
            if (zp0Var.f45280f.isEmpty()) {
                if (!TextUtils.isEmpty(zp0Var.v) || zp0Var.f45288n.isEmpty()) {
                    return 0;
                }
                return zp0Var.f45288n.size() + 2;
            }
            return zp0Var.f45280f.size() + (!zp0Var.f45295s ? 1 : 0);
        }
        return albumEntry.photos.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        zp0 zp0Var = this.d;
        if (zp0Var.U) {
            return 2;
        }
        if (zp0Var.F != null) {
            return 0;
        }
        if (zp0Var.f45280f.isEmpty()) {
            if (i10 == zp0Var.f45288n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < zp0Var.f45280f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean L1;
        boolean z10;
        zp0 zp0Var = this.d;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        ArrayList arrayList = zp0Var.f45288n;
        ArrayList arrayList2 = zp0Var.f45275c;
        HashMap hashMap = zp0Var.f45273b;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        int i12 = -1;
        int i13 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                        if (i10 < arrayList.size()) {
                            m8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
                            return;
                        } else {
                            m8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
                            return;
                        }
                    }
                    return;
                }
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                g7Var.setPhotoEntry(photoEntry);
                g7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                g7Var.setTag(Integer.valueOf(i10));
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
        org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
        r5Var.setItemSize(zp0Var.N);
        org.telegram.ui.Components.t9 imageView = r5Var.getImageView();
        r5Var.setTag(Integer.valueOf(i10));
        imageView.q(0, true);
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            if (arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r5Var.d(photoEntry2, z10, true, false, false);
            if (zp0Var.f45278e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            r5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            L1 = PhotoViewer.L1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f45280f.get(i10);
            r5Var.e(searchImage);
            r5Var.getVideoInfoContainer().setVisibility(4);
            if (zp0Var.f45278e) {
                i12 = arrayList2.indexOf(searchImage.f19614id);
            }
            r5Var.b(i12, hashMap.containsKey(searchImage.f19614id), false);
            L1 = PhotoViewer.L1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!L1, true);
        r5Var.getCheckBox().setVisibility((zp0Var.P != 0 || L1) ? 8 : 8);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        zp0 zp0Var = this.d;
        boolean z10 = zp0Var.f45289n0;
        int i11 = 0;
        Context context = this.f44637c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.a3 a3Var = new org.telegram.ui.Cells.a3(context, null);
                        a3Var.setForceDarkTheme(z10);
                        viewGroup3 = a3Var;
                    } else {
                        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, context, true);
                        m8Var.setLayoutParams(new f2.x0(-1, -2));
                        viewGroup2 = m8Var;
                        if (z10) {
                            m8Var.f24708a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, zp0Var.f45294r0, false));
                            m8Var.f24711e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23318rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = m8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.g7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new f2.x0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, i7.f6.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new f2.n1(viewGroup3);
        }
        org.telegram.ui.Cells.r5 r5Var = new org.telegram.ui.Cells.r5(context, null);
        r5Var.setDelegate(new wp0(this));
        FrameLayout checkFrame = r5Var.getCheckFrame();
        if (zp0Var.P != 0) {
            i11 = 8;
        }
        checkFrame.setVisibility(i11);
        viewGroup2 = r5Var;
        viewGroup3 = viewGroup2;
        return new f2.n1(viewGroup3);
    }
}
