package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class vh implements ViewTreeObserver.OnPreDrawListener {
    public final int f42250a;
    public final Object f42251b;

    public vh(Object obj, int i10) {
        this.f42250a = i10;
        this.f42251b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42250a) {
            case 0:
                qn qnVar = (qn) this.f42251b;
                hj hjVar = qnVar.f40615a1;
                if (hjVar != null) {
                    hjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return qnVar.w8();
            case 1:
                ((ei.g6) this.f42251b).invalidate();
                return true;
            case 2:
                View view = ((c70) this.f42251b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((c70) this.f42251b).f35855f.setOrientation(1);
                    } else {
                        ((c70) this.f42251b).f35855f.setOrientation(0);
                    }
                    View view2 = ((c70) this.f42251b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((c70) this.f42251b).fragmentView.getPaddingRight(), ((c70) this.f42251b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                sp0 sp0Var = (sp0) this.f42251b;
                if (sp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    sp0Var.f41504f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        sp0Var.f41504f = 4;
                    }
                    sp0Var.f41505n.l();
                }
                org.telegram.ui.Components.im0 im0Var = ((sp0) this.f42251b).h;
                if (im0Var != null) {
                    im0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f42251b;
                photoViewer.f33435w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f33445x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final vh f40970b;

                            {
                                this.f40970b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f40970b.f42251b;
                                        photoViewer2.f33445x3.setVisibility(4);
                                        photoViewer2.f33445x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f40970b.f42251b;
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
                        photoViewer.f33445x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final vh f40970b;

                    {
                        this.f40970b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f40970b.f42251b;
                                photoViewer2.f33445x3.setVisibility(4);
                                photoViewer2.f33445x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f40970b.f42251b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f42251b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f42251b;
                int[][] iArr = WallpapersListActivity.f35198k0;
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
                org.telegram.ui.Components.im0 im0Var2 = ((WallpapersListActivity) this.f42251b).H;
                if (im0Var2 != null) {
                    im0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
