package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class sh implements ViewTreeObserver.OnPreDrawListener {
    public final int f42697a;
    public final Object f42698b;

    public sh(Object obj, int i9) {
        this.f42697a = i9;
        this.f42698b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42697a) {
            case 0:
                qn qnVar = (qn) this.f42698b;
                dj djVar = qnVar.W0;
                if (djVar != null) {
                    djVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return qnVar.s8();
            case 1:
                ((kh.h6) this.f42698b).invalidate();
                return true;
            case 2:
                View view = ((b70) this.f42698b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((b70) this.f42698b).f36728f.setOrientation(1);
                    } else {
                        ((b70) this.f42698b).f36728f.setOrientation(0);
                    }
                    View view2 = ((b70) this.f42698b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((b70) this.f42698b).fragmentView.getPaddingRight(), ((b70) this.f42698b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                ip0 ip0Var = (ip0) this.f42698b;
                if (ip0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    ip0Var.f39243f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        ip0Var.f39243f = 4;
                    }
                    ip0Var.f39244n.l();
                }
                org.telegram.ui.Components.wk0 wk0Var = ((ip0) this.f42698b).h;
                if (wk0Var != null) {
                    wk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f42698b;
                photoViewer.f35746s3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f35755t3;
                if (imageView != null) {
                    if (photoViewer.F3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final sh f39283b;

                            {
                                this.f39283b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f39283b.f42698b;
                                        photoViewer2.f35755t3.setVisibility(4);
                                        photoViewer2.f35755t3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.f35801y3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.f35801y3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f39283b.f42698b;
                                        if (photoViewer3.F3) {
                                            photoViewer3.S0();
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f35755t3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.f35801y3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f35801y3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final sh f39283b;

                    {
                        this.f39283b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f39283b.f42698b;
                                photoViewer2.f35755t3.setVisibility(4);
                                photoViewer2.f35755t3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.f35801y3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.f35801y3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f39283b.f42698b;
                                if (photoViewer3.F3) {
                                    photoViewer3.S0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                photoViewer.C3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f42698b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f42698b;
                int[][] iArr = WallpapersListActivity.f36296g0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.N = 3;
                    } else {
                        wallpapersListActivity.N = 5;
                    }
                    wallpapersListActivity.B0();
                }
                org.telegram.ui.Components.wk0 wk0Var2 = ((WallpapersListActivity) this.f42698b).D;
                if (wk0Var2 != null) {
                    wk0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
