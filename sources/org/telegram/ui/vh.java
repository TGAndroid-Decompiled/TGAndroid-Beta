package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
public final class vh implements ViewTreeObserver.OnPreDrawListener {
    public final int f43600a;
    public final Object f43601b;

    public vh(Object obj, int i10) {
        this.f43600a = i10;
        this.f43601b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f43600a) {
            case 0:
                tn tnVar = (tn) this.f43601b;
                gj gjVar = tnVar.W0;
                if (gjVar != null) {
                    gjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return tnVar.s8();
            case 1:
                ((cg.i0) this.f43601b).invalidate();
                return true;
            case 2:
                View view = ((e70) this.f43601b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 3 && rotation != 1) {
                        ((e70) this.f43601b).f37713f.setOrientation(1);
                    } else {
                        ((e70) this.f43601b).f37713f.setOrientation(0);
                    }
                    View view2 = ((e70) this.f43601b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((e70) this.f43601b).fragmentView.getPaddingRight(), ((e70) this.f43601b).fragmentView.getPaddingBottom());
                }
                return true;
            case 3:
                hp0 hp0Var = (hp0) this.f43601b;
                if (hp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    hp0Var.f38988f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        hp0Var.f38988f = 4;
                    }
                    hp0Var.f38989n.l();
                }
                org.telegram.ui.Components.jl0 jl0Var = ((hp0) this.f43601b).h;
                if (jl0Var != null) {
                    jl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.f43601b;
                photoViewer.f35812s3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.f35821t3;
                if (imageView != null) {
                    if (photoViewer.F3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final vh f38661b;

                            {
                                this.f38661b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.f38661b.f43601b;
                                        photoViewer2.f35821t3.setVisibility(4);
                                        photoViewer2.f35821t3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.f35868y3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.f35868y3 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.f38661b.f43601b;
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
                        photoViewer.f35821t3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.f35868y3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f35868y3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final vh f38661b;

                    {
                        this.f38661b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.f38661b.f43601b;
                                photoViewer2.f35821t3.setVisibility(4);
                                photoViewer2.f35821t3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.f35868y3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.f35868y3 = null;
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.f38661b.f43601b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f43601b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f43601b;
                int[][] iArr = WallpapersListActivity.f36361g0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 != 3 && rotation3 != 1) {
                        wallpapersListActivity.N = 3;
                    } else {
                        wallpapersListActivity.N = 5;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.jl0 jl0Var2 = ((WallpapersListActivity) this.f43601b).D;
                if (jl0Var2 != null) {
                    jl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
        }
    }
}
