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
public final class wr0 implements Runnable {
    public final int f44365a;
    public final PhotoViewer f44366b;

    public wr0(PhotoViewer photoViewer, int i10) {
        this.f44365a = i10;
        this.f44366b = photoViewer;
    }

    @Override
    public final void run() {
        float f9;
        et0 et0Var;
        switch (this.f44365a) {
            case 0:
                PhotoViewer photoViewer = this.f44366b;
                if (photoViewer.f35714h3 && photoViewer.L3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.f44366b.f35738k0;
                    if (w0Var == null || !w0Var.t()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.f44366b.f35747l0;
                        if (w0Var2 == null || !w0Var2.t()) {
                            xs0 xs0Var = this.f44366b.P1;
                            if (xs0Var == null || xs0Var.getScrollY() == 0) {
                                fd fdVar = this.f44366b.T0;
                                if (fdVar == null || fdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.W8;
                                    PhotoViewer photoViewer3 = this.f44366b;
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
                PhotoViewer photoViewer4 = this.f44366b;
                if (photoViewer4.B2 != null || ((et0Var = photoViewer4.f35656b0) != null && et0Var.f30680x)) {
                    if (photoViewer4.f35765n1) {
                        if (!photoViewer4.N7.f29104r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f44366b.A1());
                            PhotoViewer photoViewer5 = this.f44366b;
                            if (!photoViewer5.f35854w8 && (photoViewer5.f35795q4 != 0 || photoViewer5.M7.getVisibility() == 0)) {
                                if (o12 >= this.f44366b.N7.getRightProgress()) {
                                    ur0 ur0Var = this.f44366b.N7;
                                    ur0Var.setProgress(ur0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f44366b;
                                    photoViewer6.B2.L((int) (photoViewer6.N7.getLeftProgress() * ((float) this.f44366b.A1())));
                                    PhotoViewer photoViewer7 = this.f44366b;
                                    photoViewer7.D2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f44366b;
                                    if (!photoViewer8.f35799r && photoViewer8.Y1 != 1 && photoViewer8.f35795q4 == 0 && photoViewer8.f35744k6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f44366b.f35647a0.invalidate();
                                } else {
                                    this.f44366b.N7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f44366b;
                                if (photoViewer9.Y1 != 1) {
                                    photoViewer9.N7.setProgress(o12);
                                }
                            }
                            this.f44366b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f44366b.A1());
                        if (this.f44366b.f35678d5) {
                            f9 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f44366b.O3) >= 500) {
                                PhotoViewer photoViewer10 = this.f44366b;
                                et0 et0Var2 = photoViewer10.f35656b0;
                                if (et0Var2 != null && et0Var2.f30680x) {
                                    f9 = et0Var2.getBufferedPosition();
                                } else if (photoViewer10.M3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.P);
                                    PhotoViewer photoViewer11 = this.f44366b;
                                    float f10 = photoViewer11.W2;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f9 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer11.Y4[0]);
                                } else {
                                    f9 = 1.0f;
                                }
                                this.f44366b.O3 = elapsedRealtime;
                            } else {
                                f9 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f44366b;
                        if (!photoViewer12.f35854w8 && photoViewer12.M7.getVisibility() == 0) {
                            if (o13 >= this.f44366b.N7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f44366b;
                                photoViewer13.D2 = false;
                                photoViewer13.g2();
                                this.f44366b.f35757m3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f44366b;
                                photoViewer14.t2((int) (photoViewer14.N7.getLeftProgress() * ((float) this.f44366b.A1())));
                                this.f44366b.f35647a0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f44366b.N7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f44366b.N7.getRightProgress() - this.f44366b.N7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f44366b.f35757m3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f44366b;
                            if (photoViewer15.W2 == 0.0f) {
                                org.telegram.ui.Cells.f1 f1Var = photoViewer15.W3;
                                if (f1Var.rewindCount == 0 || (!f1Var.rewindByBackSeek && !photoViewer15.Y3.rewindByBackSeek)) {
                                    photoViewer15.f35757m3.h(o13, false);
                                }
                            }
                            if (f9 != -1.0f) {
                                this.f44366b.f35757m3.f(f9);
                                org.telegram.ui.Components.bg0 bg0Var = org.telegram.ui.Components.bg0.f27076l0;
                                if (f9 > bg0Var.W) {
                                    bg0Var.W = f9;
                                    lh.z2 z2Var = bg0Var.X;
                                    if (z2Var != null) {
                                        z2Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f44366b.f35767n3.invalidate();
                        if (this.f44366b.X2 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f44366b;
                            if (elapsedRealtime2 - photoViewer16.Z2 >= 1000) {
                                String str = photoViewer16.X2;
                                photoViewer16.Z2 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f44366b.P4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new e0(str, o13, 4));
                            }
                        }
                        this.f44366b.C3();
                    }
                }
                qt0 qt0Var = this.f44366b.A2;
                if (qt0Var != null) {
                    qt0.a(qt0Var);
                }
                PhotoViewer photoViewer17 = this.f44366b;
                if (photoViewer17.L3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f35677d4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f44366b;
                if (org.telegram.ui.Components.bg0.f27076l0.L) {
                    org.telegram.ui.Components.bg0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    return;
                }
                photoViewer18.H3 = false;
                Bitmap bitmap = photoViewer18.f35868y3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer18.f35868y3 = null;
                }
                photoViewer18.B3 = true;
                Activity activity = photoViewer18.f35864y;
                bg.d1 d1Var = new bg.d1(activity, 27);
                ImageReceiver imageReceiver = new ImageReceiver(d1Var);
                d1Var.f2146b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                d1Var.f2147c = textureView;
                d1Var.addView(textureView);
                try {
                    if (photoViewer18.f35875z2) {
                        Drawable drawable = photoViewer18.f35821t3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.f35868y3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f35821t3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f35821t3.setImageBitmap(photoViewer18.f35868y3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.f35868y3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.f35867y2.getWidth(), photoViewer18.f35867y2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.f35868y3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.f35867y2, createBitmap, new lf0(27, this, d1Var));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.f35858x2.getWidth(), photoViewer18.f35858x2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.f35868y3 = createBitmap2;
                        photoViewer18.f35858x2.getBitmap(createBitmap2);
                        if (photoViewer18.f35868y3 != null) {
                            ImageView imageView2 = photoViewer18.f35821t3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f35821t3.setImageBitmap(photoViewer18.f35868y3);
                            }
                            imageReceiver.setImageBitmap(photoViewer18.f35868y3);
                        }
                    }
                } catch (Throwable th2) {
                    Bitmap bitmap3 = photoViewer18.f35868y3;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        photoViewer18.f35868y3 = null;
                    }
                    FileLog.e(th2);
                }
                photoViewer18.F3 = true;
                photoViewer18.f35812s3 = (TextureView) d1Var.f2147c;
                if (org.telegram.ui.Components.bg0.x(false, photoViewer18.f35864y, null, d1Var, photoViewer18.Q, photoViewer18.R, photoViewer18.G3)) {
                    org.telegram.ui.Components.bg0.w(photoViewer18);
                }
                photoViewer18.G3 = true;
                if (photoViewer18.f35875z2) {
                    os0 os0Var = photoViewer18.f35829u2;
                    if (os0Var != null) {
                        os0Var.removeView(photoViewer18.f35858x2);
                        photoViewer18.f35829u2.removeView(photoViewer18.f35867y2);
                    }
                    photoViewer18.B2.V(null);
                    photoViewer18.B2.W(null);
                    photoViewer18.B2.D();
                    photoViewer18.B2.W(photoViewer18.f35812s3);
                    photoViewer18.x0(true);
                    photoViewer18.f35812s3.setVisibility(0);
                    return;
                }
                photoViewer18.f35812s3.setVisibility(4);
                os0 os0Var2 = photoViewer18.f35829u2;
                if (os0Var2 != null) {
                    os0Var2.removeView(photoViewer18.f35858x2);
                    photoViewer18.f35829u2.removeView(photoViewer18.f35867y2);
                    return;
                }
                return;
        }
    }
}
