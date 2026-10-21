package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class vh implements ViewTreeObserver.OnPreDrawListener {
    public final int f42257a;
    public final Object f42258b;

    public vh(Object obj, int i10) {
        this.f42257a = i10;
        this.f42258b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42257a) {
            case 0:
                qn qnVar = (qn) this.f42258b;
                hj hjVar = qnVar.f40613a1;
                if (hjVar != null) {
                    hjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return qnVar.w8();
            case 1:
                ((ei.g6) this.f42258b).invalidate();
                return true;
            case 2:
                View view = ((c70) this.f42258b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((c70) this.f42258b).f35855f.setOrientation(1);
                    } else {
                        ((c70) this.f42258b).f35855f.setOrientation(0);
                    }
                    View view2 = ((c70) this.f42258b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((c70) this.f42258b).fragmentView.getPaddingRight(), ((c70) this.f42258b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                sp0 sp0Var = (sp0) this.f42258b;
                if (sp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    sp0Var.f41509f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        sp0Var.f41509f = 4;
                    }
                    sp0Var.f41510n.l();
                }
                org.telegram.ui.Components.jm0 jm0Var = ((sp0) this.f42258b).h;
                if (jm0Var != null) {
                    jm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f42258b;
                photoViewer.f33442w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33452x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final vh f40968b;

                            {
                                this.f40968b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f40968b.f42258b;
                                        photoViewer2.f33452x3.setVisibility(4);
                                        photoViewer2.f33452x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f40968b.f42258b;
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
                        photoViewer.f33452x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final vh f40968b;

                    {
                        this.f40968b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f40968b.f42258b;
                                photoViewer2.f33452x3.setVisibility(4);
                                photoViewer2.f33452x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f40968b.f42258b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f42258b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f42258b;
                int[][] iArr = WallpapersListActivity.f35207k0;
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
                org.telegram.ui.Components.jm0 jm0Var2 = ((WallpapersListActivity) this.f42258b).H;
                if (jm0Var2 != null) {
                    jm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
