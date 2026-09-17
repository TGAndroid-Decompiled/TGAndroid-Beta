package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class zs0 implements Runnable {
    public final int f43511a;
    public final PhotoViewer f43512b;

    public zs0(PhotoViewer photoViewer, int i10) {
        this.f43511a = i10;
        this.f43512b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        hu0 hu0Var;
        switch (this.f43511a) {
            case 0:
                PhotoViewer photoViewer = this.f43512b;
                if (photoViewer.f33613l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.v0 v0Var = this.f43512b.f33636o0;
                    if (v0Var == null || !v0Var.t()) {
                        org.telegram.ui.ActionBar.v0 v0Var2 = this.f43512b.f33645p0;
                        if (v0Var2 == null || !v0Var2.t()) {
                            au0 au0Var = this.f43512b.T1;
                            if (au0Var == null || au0Var.getScrollY() == 0) {
                                kd kdVar = this.f43512b.X0;
                                if (kdVar == null || kdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.f33510a9;
                                    PhotoViewer photoViewer3 = this.f43512b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.j3(false, true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                PhotoViewer photoViewer4 = this.f43512b;
                if (photoViewer4.F2 != null || ((hu0Var = photoViewer4.f33559f0) != null && hu0Var.f29717x)) {
                    if (photoViewer4.f33663r1) {
                        if (!photoViewer4.R7.f29981r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f43512b.A1());
                            PhotoViewer photoViewer5 = this.f43512b;
                            if (!photoViewer5.A8 && (photoViewer5.f33694u4 != 0 || photoViewer5.Q7.getVisibility() == 0)) {
                                if (o12 >= this.f43512b.R7.getRightProgress()) {
                                    xs0 xs0Var = this.f43512b.R7;
                                    xs0Var.setProgress(xs0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f43512b;
                                    photoViewer6.F2.K((int) (photoViewer6.R7.getLeftProgress() * ((float) this.f43512b.A1())));
                                    PhotoViewer photoViewer7 = this.f43512b;
                                    photoViewer7.H2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f43512b;
                                    if (!photoViewer8.f33661r && photoViewer8.f33533c2 != 1 && photoViewer8.f33694u4 == 0 && photoViewer8.f33642o6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f43512b.f33550e0.invalidate();
                                } else {
                                    this.f43512b.R7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f43512b;
                                if (photoViewer9.f33533c2 != 1) {
                                    photoViewer9.R7.setProgress(o12);
                                }
                            }
                            this.f43512b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f43512b.A1());
                        if (this.f43512b.f33581h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f43512b.S3) >= 500) {
                                PhotoViewer photoViewer10 = this.f43512b;
                                hu0 hu0Var2 = photoViewer10.f33559f0;
                                if (hu0Var2 != null && hu0Var2.f29717x) {
                                    f7 = hu0Var2.getBufferedPosition();
                                } else if (photoViewer10.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.T);
                                    PhotoViewer photoViewer11 = this.f43512b;
                                    float f10 = photoViewer11.f33514a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer11.f33536c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f43512b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f43512b;
                        if (!photoViewer12.A8 && photoViewer12.Q7.getVisibility() == 0) {
                            if (o13 >= this.f43512b.R7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f43512b;
                                photoViewer13.H2 = false;
                                photoViewer13.g2();
                                this.f43512b.f33656q3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f43512b;
                                photoViewer14.t2((int) (photoViewer14.R7.getLeftProgress() * ((float) this.f43512b.A1())));
                                this.f43512b.f33550e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f43512b.R7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f43512b.R7.getRightProgress() - this.f43512b.R7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f43512b.f33656q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f43512b;
                            if (photoViewer15.f33514a3 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer15.f33515a4;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer15.f33535c4.rewindByBackSeek)) {
                                    photoViewer15.f33656q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f43512b.f33656q3.f(f7);
                                org.telegram.ui.Components.eg0 eg0Var = org.telegram.ui.Components.eg0.f25676p0;
                                if (f7 > eg0Var.f25678a0) {
                                    eg0Var.f25678a0 = f7;
                                    bi.a4 a4Var = eg0Var.f25680b0;
                                    if (a4Var != null) {
                                        a4Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f43512b.f33665r3.invalidate();
                        if (this.f43512b.f33524b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f43512b;
                            if (elapsedRealtime2 - photoViewer16.f33543d3 >= 1000) {
                                String str = photoViewer16.f33524b3;
                                photoViewer16.f33543d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f43512b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new b0(str, o13, 4));
                            }
                        }
                        this.f43512b.C3();
                    }
                }
                tu0 tu0Var = this.f43512b.E2;
                if (tu0Var != null) {
                    tu0.a(tu0Var);
                }
                PhotoViewer photoViewer17 = this.f43512b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f33580h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f43512b;
                if (org.telegram.ui.Components.eg0.f25676p0.P) {
                    org.telegram.ui.Components.eg0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    return;
                }
                photoViewer18.L3 = false;
                Bitmap bitmap = photoViewer18.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer18.C3 = null;
                }
                photoViewer18.F3 = true;
                Activity activity = photoViewer18.f33728y;
                ah.w wVar = new ah.w(activity, 26);
                ImageReceiver imageReceiver = new ImageReceiver(wVar);
                wVar.f712b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                wVar.f713c = textureView;
                wVar.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f33722x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f33722x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f33722x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new ej0(24, this, wVar));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f33722x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f33722x3.setImageBitmap(photoViewer18.C3);
                            }
                            imageReceiver.setImageBitmap(photoViewer18.C3);
                        }
                    }
                } catch (Throwable th2) {
                    Bitmap bitmap3 = photoViewer18.C3;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        photoViewer18.C3 = null;
                    }
                    FileLog.e(th2);
                }
                photoViewer18.J3 = true;
                photoViewer18.f33712w3 = (TextureView) wVar.f713c;
                if (org.telegram.ui.Components.eg0.x(false, photoViewer18.f33728y, null, wVar, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.eg0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    rt0 rt0Var = photoViewer18.f33731y2;
                    if (rt0Var != null) {
                        rt0Var.removeView(photoViewer18.B2);
                        photoViewer18.f33731y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f33712w3);
                    photoViewer18.x0(true);
                    photoViewer18.f33712w3.setVisibility(0);
                    return;
                }
                photoViewer18.f33712w3.setVisibility(4);
                rt0 rt0Var2 = photoViewer18.f33731y2;
                if (rt0Var2 != null) {
                    rt0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f33731y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
