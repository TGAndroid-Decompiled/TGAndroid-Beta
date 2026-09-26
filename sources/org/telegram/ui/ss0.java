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
public final class ss0 implements Runnable {
    public final int f37858a;
    public final PhotoViewer f37859b;

    public ss0(PhotoViewer photoViewer, int i10) {
        this.f37858a = i10;
        this.f37859b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        au0 au0Var;
        switch (this.f37858a) {
            case 0:
                PhotoViewer photoViewer = this.f37859b;
                if (photoViewer.f31286l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.u0 u0Var = this.f37859b.f31309o0;
                    if (u0Var == null || !u0Var.t()) {
                        org.telegram.ui.ActionBar.u0 u0Var2 = this.f37859b.f31318p0;
                        if (u0Var2 == null || !u0Var2.t()) {
                            tt0 tt0Var = this.f37859b.T1;
                            if (tt0Var == null || tt0Var.getScrollY() == 0) {
                                jd jdVar = this.f37859b.X0;
                                if (jdVar == null || jdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.f31184b9;
                                    PhotoViewer photoViewer3 = this.f37859b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.i3(false, true);
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
                PhotoViewer photoViewer4 = this.f37859b;
                if (photoViewer4.F2 != null || ((au0Var = photoViewer4.f31232f0) != null && au0Var.f22683x)) {
                    if (photoViewer4.f31336r1) {
                        if (!photoViewer4.S7.f23871r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f37859b.A1());
                            PhotoViewer photoViewer5 = this.f37859b;
                            if (!photoViewer5.B8 && (photoViewer5.f31367u4 != 0 || photoViewer5.R7.getVisibility() == 0)) {
                                if (o12 >= this.f37859b.S7.getRightProgress()) {
                                    qs0 qs0Var = this.f37859b.S7;
                                    qs0Var.setProgress(qs0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f37859b;
                                    photoViewer6.F2.K((int) (photoViewer6.S7.getLeftProgress() * ((float) this.f37859b.A1())));
                                    PhotoViewer photoViewer7 = this.f37859b;
                                    photoViewer7.H2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f37859b;
                                    if (!photoViewer8.f31334r && photoViewer8.f31207c2 != 1 && photoViewer8.f31367u4 == 0 && photoViewer8.f31315o6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f37859b.f31223e0.invalidate();
                                } else {
                                    this.f37859b.S7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f37859b;
                                if (photoViewer9.f31207c2 != 1) {
                                    photoViewer9.S7.setProgress(o12);
                                }
                            }
                            this.f37859b.B3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f37859b.A1());
                        if (this.f37859b.f31254h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f37859b.S3) >= 500) {
                                PhotoViewer photoViewer10 = this.f37859b;
                                au0 au0Var2 = photoViewer10.f31232f0;
                                if (au0Var2 != null && au0Var2.f22683x) {
                                    f7 = au0Var2.getBufferedPosition();
                                } else if (photoViewer10.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.T);
                                    PhotoViewer photoViewer11 = this.f37859b;
                                    float f10 = photoViewer11.f31188a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer11.f31210c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f37859b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f37859b;
                        if (!photoViewer12.B8 && photoViewer12.R7.getVisibility() == 0) {
                            if (o13 >= this.f37859b.S7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f37859b;
                                photoViewer13.H2 = false;
                                photoViewer13.g2();
                                this.f37859b.f31329q3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f37859b;
                                photoViewer14.s2((int) (photoViewer14.S7.getLeftProgress() * ((float) this.f37859b.A1())));
                                this.f37859b.f31223e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f37859b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f37859b.S7.getRightProgress() - this.f37859b.S7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f37859b.f31329q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f37859b;
                            if (photoViewer15.f31188a3 == 0.0f) {
                                org.telegram.ui.Cells.h1 h1Var = photoViewer15.f31189a4;
                                if (h1Var.rewindCount == 0 || (!h1Var.rewindByBackSeek && !photoViewer15.f31209c4.rewindByBackSeek)) {
                                    photoViewer15.f31329q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f37859b.f31329q3.f(f7);
                                org.telegram.ui.Components.og0 og0Var = org.telegram.ui.Components.og0.f27046p0;
                                if (f7 > og0Var.f27048a0) {
                                    og0Var.f27048a0 = f7;
                                    ai.n4 n4Var = og0Var.f27050b0;
                                    if (n4Var != null) {
                                        n4Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f37859b.f31338r3.invalidate();
                        if (this.f37859b.f31198b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f37859b;
                            if (elapsedRealtime2 - photoViewer16.f31217d3 >= 1000) {
                                String str = photoViewer16.f31198b3;
                                photoViewer16.f31217d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f37859b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new c0(str, o13, 4));
                            }
                        }
                        this.f37859b.B3();
                    }
                }
                mu0 mu0Var = this.f37859b.E2;
                if (mu0Var != null) {
                    mu0.a(mu0Var);
                }
                PhotoViewer photoViewer17 = this.f37859b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f31253h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f37859b;
                if (org.telegram.ui.Components.og0.f27046p0.P) {
                    org.telegram.ui.Components.og0.j(false);
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
                Activity activity = photoViewer18.f31401y;
                ci.m6 m6Var = new ci.m6(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(m6Var);
                m6Var.f5171b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                m6Var.f5172c = textureView;
                m6Var.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f31395x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f31395x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f31395x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new sj0(23, this, m6Var));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f31395x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f31395x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f31385w3 = (TextureView) m6Var.f5172c;
                if (org.telegram.ui.Components.og0.x(false, photoViewer18.f31401y, null, m6Var, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.og0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    kt0 kt0Var = photoViewer18.f31404y2;
                    if (kt0Var != null) {
                        kt0Var.removeView(photoViewer18.B2);
                        photoViewer18.f31404y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f31385w3);
                    photoViewer18.x0(true);
                    photoViewer18.f31385w3.setVisibility(0);
                    return;
                }
                photoViewer18.f31385w3.setVisibility(4);
                kt0 kt0Var2 = photoViewer18.f31404y2;
                if (kt0Var2 != null) {
                    kt0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f31404y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
