package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class vh implements ViewTreeObserver.OnPreDrawListener {
    public final int f42743a;
    public final Object f42744b;

    public vh(Object obj, int i10) {
        this.f42743a = i10;
        this.f42744b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42743a) {
            case 0:
                sn snVar = (sn) this.f42744b;
                hj hjVar = snVar.f41594m1;
                if (hjVar != null) {
                    hjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return snVar.w8();
            case 1:
                ((ei.g6) this.f42744b).invalidate();
                return true;
            case 2:
                View view = ((g70) this.f42744b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((g70) this.f42744b).f37471f.setOrientation(1);
                    } else {
                        ((g70) this.f42744b).f37471f.setOrientation(0);
                    }
                    View view2 = ((g70) this.f42744b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((g70) this.f42744b).fragmentView.getPaddingRight(), ((g70) this.f42744b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                up0 up0Var = (up0) this.f42744b;
                if (up0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    up0Var.f42466f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        up0Var.f42466f = 4;
                    }
                    up0Var.f42467n.l();
                }
                org.telegram.ui.Components.lm0 lm0Var = ((up0) this.f42744b).h;
                if (lm0Var != null) {
                    lm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f42744b;
                photoViewer.f33745w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33755x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final vh f41800b;

                            {
                                this.f41800b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f41800b.f42744b;
                                        photoViewer2.f33755x3.setVisibility(4);
                                        photoViewer2.f33755x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f41800b.f42744b;
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
                        photoViewer.f33755x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final vh f41800b;

                    {
                        this.f41800b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f41800b.f42744b;
                                photoViewer2.f33755x3.setVisibility(4);
                                photoViewer2.f33755x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f41800b.f42744b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f42744b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.C3();
                    profileActivity.m4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f42744b;
                int[][] iArr = WallpapersListActivity.f35517k0;
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
                org.telegram.ui.Components.lm0 lm0Var2 = ((WallpapersListActivity) this.f42744b).H;
                if (lm0Var2 != null) {
                    lm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
