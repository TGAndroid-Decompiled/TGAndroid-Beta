package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

public final class uh implements ViewTreeObserver.OnPreDrawListener {

    public final int f43228a;

    public final Object f43229b;

    public uh(Object obj, int i10) {
        this.f43228a = i10;
        this.f43229b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        final int i10 = 0;
        final int i11 = 1;
        switch (this.f43228a) {
            case 0:
                rn rnVar = (rn) this.f43229b;
                fj fjVar = rnVar.W0;
                if (fjVar != null) {
                    fjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return rnVar.s8();
            case 1:
                ((ag.t0) this.f43229b).invalidate();
                return true;
            case 2:
                View view = ((e70) this.f43229b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((e70) this.f43229b).f37648f.setOrientation(0);
                    } else {
                        ((e70) this.f43229b).f37648f.setOrientation(1);
                    }
                    View view2 = ((e70) this.f43229b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((e70) this.f43229b).fragmentView.getPaddingRight(), ((e70) this.f43229b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                jp0 jp0Var = (jp0) this.f43229b;
                if (jp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    jp0Var.f39465f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        jp0Var.f39465f = 4;
                    }
                    jp0Var.f39466n.l();
                }
                org.telegram.ui.Components.zk0 zk0Var = ((jp0) this.f43229b).h;
                if (zk0Var != null) {
                    zk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f43229b;
                photoViewer.f35749s3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f35758t3;
                if (imageView != null) {
                    if (photoViewer.F3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                            public final uh f39500b;

                            {
                                this.f39500b = this;
                            }

                            @Override
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f39500b.f43229b;
                                        photoViewer2.f35758t3.setVisibility(4);
                                        photoViewer2.f35758t3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.f35804y3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.f35804y3 = null;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f39500b.f43229b;
                                        if (photoViewer3.F3) {
                                            photoViewer3.S0();
                                        }
                                        break;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.f35758t3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.f35804y3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f35804y3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final uh f39500b;

                    {
                        this.f39500b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f39500b.f43229b;
                                photoViewer2.f35758t3.setVisibility(4);
                                photoViewer2.f35758t3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.f35804y3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.f35804y3 = null;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f39500b.f43229b;
                                if (photoViewer3.F3) {
                                    photoViewer3.S0();
                                }
                                break;
                        }
                    }
                });
                photoViewer.C3 = 0;
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f43229b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f43229b;
                int[][] iArr = WallpapersListActivity.f36299g0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.N = 5;
                    } else {
                        wallpapersListActivity.N = 3;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.zk0 zk0Var2 = ((WallpapersListActivity) this.f43229b).D;
                if (zk0Var2 != null) {
                    zk0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
