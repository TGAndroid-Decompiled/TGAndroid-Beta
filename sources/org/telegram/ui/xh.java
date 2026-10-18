package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class xh implements ViewTreeObserver.OnPreDrawListener {
    public final int f43159a;
    public final Object f43160b;

    public xh(Object obj, int i10) {
        this.f43159a = i10;
        this.f43160b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f43159a) {
            case 0:
                sn snVar = (sn) this.f43160b;
                jj jjVar = snVar.f41166a1;
                if (jjVar != null) {
                    jjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return snVar.w8();
            case 1:
                ((ei.g6) this.f43160b).invalidate();
                return true;
            case 2:
                View view = ((e70) this.f43160b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((e70) this.f43160b).f36419f.setOrientation(1);
                    } else {
                        ((e70) this.f43160b).f36419f.setOrientation(0);
                    }
                    View view2 = ((e70) this.f43160b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((e70) this.f43160b).fragmentView.getPaddingRight(), ((e70) this.f43160b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                up0 up0Var = (up0) this.f43160b;
                if (up0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    up0Var.f42044f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        up0Var.f42044f = 4;
                    }
                    up0Var.f42045n.l();
                }
                org.telegram.ui.Components.im0 im0Var = ((up0) this.f43160b).h;
                if (im0Var != null) {
                    im0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f43160b;
                photoViewer.f33436w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33446x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final xh f41521b;

                            {
                                this.f41521b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f41521b.f43160b;
                                        photoViewer2.f33446x3.setVisibility(4);
                                        photoViewer2.f33446x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f41521b.f43160b;
                                        if (photoViewer3.J3) {
                                            photoViewer3.T0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f33446x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final xh f41521b;

                    {
                        this.f41521b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f41521b.f43160b;
                                photoViewer2.f33446x3.setVisibility(4);
                                photoViewer2.f33446x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f41521b.f43160b;
                                if (photoViewer3.J3) {
                                    photoViewer3.T0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.G3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f43160b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f43160b;
                int[][] iArr = WallpapersListActivity.f35243k0;
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
                org.telegram.ui.Components.im0 im0Var2 = ((WallpapersListActivity) this.f43160b).H;
                if (im0Var2 != null) {
                    im0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
