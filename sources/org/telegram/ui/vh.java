package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class vh implements ViewTreeObserver.OnPreDrawListener {
    public final int f42772a;
    public final Object f42773b;

    public vh(Object obj, int i10) {
        this.f42772a = i10;
        this.f42773b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42772a) {
            case 0:
                sn snVar = (sn) this.f42773b;
                hj hjVar = snVar.f41597m1;
                if (hjVar != null) {
                    hjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return snVar.w8();
            case 1:
                ((ei.g6) this.f42773b).invalidate();
                return true;
            case 2:
                View view = ((g70) this.f42773b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((g70) this.f42773b).f37511f.setOrientation(1);
                    } else {
                        ((g70) this.f42773b).f37511f.setOrientation(0);
                    }
                    View view2 = ((g70) this.f42773b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((g70) this.f42773b).fragmentView.getPaddingRight(), ((g70) this.f42773b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                vp0 vp0Var = (vp0) this.f42773b;
                if (vp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    vp0Var.f42807f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        vp0Var.f42807f = 4;
                    }
                    vp0Var.f42808n.l();
                }
                org.telegram.ui.Components.mm0 mm0Var = ((vp0) this.f42773b).h;
                if (mm0Var != null) {
                    mm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f42773b;
                photoViewer.f33743w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33753x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final vh f42074b;

                            {
                                this.f42074b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f42074b.f42773b;
                                        photoViewer2.f33753x3.setVisibility(4);
                                        photoViewer2.f33753x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f42074b.f42773b;
                                        if (photoViewer3.J3) {
                                            photoViewer3.U0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f33753x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final vh f42074b;

                    {
                        this.f42074b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f42074b.f42773b;
                                photoViewer2.f33753x3.setVisibility(4);
                                photoViewer2.f33753x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f42074b.f42773b;
                                if (photoViewer3.J3) {
                                    photoViewer3.U0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.G3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f42773b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.C3();
                    profileActivity.m4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f42773b;
                int[][] iArr = WallpapersListActivity.f35515k0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.R = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.R = 3;
                    } else {
                        wallpapersListActivity.R = 5;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.mm0 mm0Var2 = ((WallpapersListActivity) this.f42773b).H;
                if (mm0Var2 != null) {
                    mm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
