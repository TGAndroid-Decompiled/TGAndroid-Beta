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
public final class zq0 extends org.telegram.ui.Components.pm0 {
    public final Context f45047c;
    public final br0 d;

    public zq0(br0 br0Var, Context context) {
        this.d = br0Var;
        this.f45047c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        br0 br0Var = this.d;
        if (br0Var.J == null) {
            if (TextUtils.isEmpty(br0Var.v)) {
                if (d1Var.f47662f != 3) {
                    return false;
                }
                return true;
            } else if (d1Var.b() >= br0Var.f36398f.size()) {
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
            if (br0Var.f36398f.isEmpty()) {
                if (!TextUtils.isEmpty(br0Var.v) || br0Var.f36406n.isEmpty()) {
                    return 0;
                }
                return br0Var.f36406n.size() + 2;
            }
            return br0Var.f36398f.size() + (!br0Var.f36413s ? 1 : 0);
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
        if (br0Var.f36398f.isEmpty()) {
            if (i10 == br0Var.f36406n.size()) {
                return 4;
            }
            return 3;
        } else if (i10 < br0Var.f36398f.size()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean M1;
        boolean z10;
        br0 br0Var = this.d;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        ArrayList arrayList = br0Var.f36406n;
        ArrayList arrayList2 = br0Var.f36393c;
        HashMap hashMap = br0Var.f36391b;
        int i11 = d1Var.f47662f;
        View view = d1Var.f47658a;
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
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                k7Var.setPhotoEntry(photoEntry);
                k7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                k7Var.setTag(Integer.valueOf(i10));
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
        org.telegram.ui.Components.y9 imageView = t5Var.getImageView();
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
            if (br0Var.f36396e) {
                i12 = arrayList2.indexOf(Integer.valueOf(photoEntry2.imageId));
            }
            t5Var.b(i12, hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            M1 = PhotoViewer.M1(photoEntry2.path);
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) br0Var.f36398f.get(i10);
            t5Var.e(searchImage);
            t5Var.getVideoInfoContainer().setVisibility(4);
            if (br0Var.f36396e) {
                i12 = arrayList2.indexOf(searchImage.f17246id);
            }
            t5Var.b(i12, hashMap.containsKey(searchImage.f17246id), false);
            M1 = PhotoViewer.M1(searchImage.getPathToAttach());
        }
        imageView.getImageReceiver().setVisible(!M1, true);
        t5Var.getCheckBox().setVisibility((br0Var.T != 0 || M1) ? 8 : 8);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        br0 br0Var = this.d;
        boolean z10 = br0Var.f36412r0;
        int i11 = 0;
        Context context = this.f45047c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        org.telegram.ui.Cells.d3 d3Var = new org.telegram.ui.Cells.d3(context, null);
                        d3Var.setForceDarkTheme(z10);
                        viewGroup3 = d3Var;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, context, true);
                        r8Var.setLayoutParams(new s4.q0(-1, -2));
                        viewGroup2 = r8Var;
                        if (z10) {
                            r8Var.f22717a.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, br0Var.f36417v0, false));
                            r8Var.f22720e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21064rg, false), PorterDuff.Mode.MULTIPLY));
                            viewGroup2 = r8Var;
                        }
                    }
                } else {
                    viewGroup3 = new org.telegram.ui.Cells.k7(context, 1, null);
                }
            } else {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.q0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, w7.x5.d(-1.0f, -1));
                viewGroup3 = frameLayout;
            }
            return new s4.d1(viewGroup3);
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
        return new s4.d1(viewGroup3);
    }
}
