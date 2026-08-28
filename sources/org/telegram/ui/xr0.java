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
public final class xr0 implements Runnable {
    public final int f44581a;
    public final PhotoViewer f44582b;

    public xr0(PhotoViewer photoViewer, int i9) {
        this.f44581a = i9;
        this.f44582b = photoViewer;
    }

    @Override
    public final void run() {
        float f10;
        gt0 gt0Var;
        switch (this.f44581a) {
            case 0:
                PhotoViewer photoViewer = this.f44582b;
                if (photoViewer.f35648h3 && photoViewer.L3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.f44582b.f35672k0;
                    if (w0Var == null || !w0Var.t()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.f44582b.f35681l0;
                        if (w0Var2 == null || !w0Var2.t()) {
                            zs0 zs0Var = this.f44582b.P1;
                            if (zs0Var == null || zs0Var.getScrollY() == 0) {
                                gd gdVar = this.f44582b.T0;
                                if (gdVar == null || gdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.W8;
                                    PhotoViewer photoViewer3 = this.f44582b;
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
                PhotoViewer photoViewer4 = this.f44582b;
                if (photoViewer4.B2 != null || ((gt0Var = photoViewer4.f35588b0) != null && gt0Var.f35295x)) {
                    if (photoViewer4.f35699n1) {
                        if (!photoViewer4.N7.f33289r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f44582b.A1());
                            PhotoViewer photoViewer5 = this.f44582b;
                            if (!photoViewer5.w8 && (photoViewer5.f35727q4 != 0 || photoViewer5.M7.getVisibility() == 0)) {
                                if (o12 >= this.f44582b.N7.getRightProgress()) {
                                    vr0 vr0Var = this.f44582b.N7;
                                    vr0Var.setProgress(vr0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f44582b;
                                    photoViewer6.B2.L((int) (photoViewer6.N7.getLeftProgress() * ((float) this.f44582b.A1())));
                                    PhotoViewer photoViewer7 = this.f44582b;
                                    photoViewer7.D2 = false;
                                    photoViewer7.t0();
                                    PhotoViewer photoViewer8 = this.f44582b;
                                    if (!photoViewer8.f35732r && photoViewer8.Y1 != 1 && photoViewer8.f35727q4 == 0 && photoViewer8.f35678k6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f44582b.f35580a0.invalidate();
                                } else {
                                    this.f44582b.N7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f44582b;
                                if (photoViewer9.Y1 != 1) {
                                    photoViewer9.N7.setProgress(o12);
                                }
                            }
                            this.f44582b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f44582b.A1());
                        if (this.f44582b.f35612d5) {
                            f10 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f44582b.O3) >= 500) {
                                PhotoViewer photoViewer10 = this.f44582b;
                                gt0 gt0Var2 = photoViewer10.f35588b0;
                                if (gt0Var2 != null && gt0Var2.f35295x) {
                                    f10 = gt0Var2.getBufferedPosition();
                                } else if (photoViewer10.M3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.P);
                                    PhotoViewer photoViewer11 = this.f44582b;
                                    float f11 = photoViewer11.W2;
                                    if (f11 == 0.0f) {
                                        f11 = o13;
                                    }
                                    f10 = fileLoader.getBufferedProgressFromPosition(f11, photoViewer11.Y4[0]);
                                } else {
                                    f10 = 1.0f;
                                }
                                this.f44582b.O3 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f44582b;
                        if (!photoViewer12.w8 && photoViewer12.M7.getVisibility() == 0) {
                            if (o13 >= this.f44582b.N7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f44582b;
                                photoViewer13.D2 = false;
                                photoViewer13.g2();
                                this.f44582b.f35691m3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f44582b;
                                photoViewer14.t2((int) (photoViewer14.N7.getLeftProgress() * ((float) this.f44582b.A1())));
                                this.f44582b.f35580a0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f44582b.N7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f44582b.N7.getRightProgress() - this.f44582b.N7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f44582b.f35691m3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f44582b;
                            if (photoViewer15.W2 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer15.W3;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer15.Y3.rewindByBackSeek)) {
                                    photoViewer15.f35691m3.h(o13, false);
                                }
                            }
                            if (f10 != -1.0f) {
                                this.f44582b.f35691m3.f(f10);
                                org.telegram.ui.Components.pf0 pf0Var = org.telegram.ui.Components.pf0.f31622l0;
                                if (f10 > pf0Var.W) {
                                    pf0Var.W = f10;
                                    ih.b3 b3Var = pf0Var.X;
                                    if (b3Var != null) {
                                        b3Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f44582b.f35701n3.invalidate();
                        if (this.f44582b.X2 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f44582b;
                            if (elapsedRealtime2 - photoViewer16.Z2 >= 1000) {
                                String str = photoViewer16.X2;
                                photoViewer16.Z2 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f44582b.P4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new d0(str, o13, 4));
                            }
                        }
                        this.f44582b.C3();
                    }
                }
                st0 st0Var = this.f44582b.A2;
                if (st0Var != null) {
                    st0.a(st0Var);
                }
                PhotoViewer photoViewer17 = this.f44582b;
                if (photoViewer17.L3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f35611d4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f44582b;
                if (org.telegram.ui.Components.pf0.f31622l0.L) {
                    org.telegram.ui.Components.pf0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    return;
                }
                photoViewer18.H3 = false;
                Bitmap bitmap = photoViewer18.f35801y3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer18.f35801y3 = null;
                }
                photoViewer18.B3 = true;
                Activity activity = photoViewer18.f35797y;
                fh.v vVar = new fh.v(activity, 26);
                ImageReceiver imageReceiver = new ImageReceiver(vVar);
                vVar.f6810c = imageReceiver;
                TextureView textureView = new TextureView(activity);
                vVar.f6809b = textureView;
                vVar.addView(textureView);
                try {
                    if (photoViewer18.f35809z2) {
                        Drawable drawable = photoViewer18.f35755t3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.f35801y3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f35755t3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f35755t3.setImageBitmap(photoViewer18.f35801y3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.f35801y3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.f35800y2.getWidth(), photoViewer18.f35800y2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.f35801y3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.f35800y2, createBitmap, new ys0(0, this, vVar));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.f35790x2.getWidth(), photoViewer18.f35790x2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.f35801y3 = createBitmap2;
                        photoViewer18.f35790x2.getBitmap(createBitmap2);
                        if (photoViewer18.f35801y3 != null) {
                            ImageView imageView2 = photoViewer18.f35755t3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f35755t3.setImageBitmap(photoViewer18.f35801y3);
                            }
                            imageReceiver.setImageBitmap(photoViewer18.f35801y3);
                        }
                    }
                } catch (Throwable th) {
                    Bitmap bitmap3 = photoViewer18.f35801y3;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        photoViewer18.f35801y3 = null;
                    }
                    FileLog.e(th);
                }
                photoViewer18.F3 = true;
                photoViewer18.f35746s3 = (TextureView) vVar.f6809b;
                if (org.telegram.ui.Components.pf0.x(false, photoViewer18.f35797y, null, vVar, photoViewer18.Q, photoViewer18.R, photoViewer18.G3)) {
                    org.telegram.ui.Components.pf0.w(photoViewer18);
                }
                photoViewer18.G3 = true;
                if (photoViewer18.f35809z2) {
                    ps0 ps0Var = photoViewer18.f35763u2;
                    if (ps0Var != null) {
                        ps0Var.removeView(photoViewer18.f35790x2);
                        photoViewer18.f35763u2.removeView(photoViewer18.f35800y2);
                    }
                    photoViewer18.B2.V(null);
                    photoViewer18.B2.W(null);
                    photoViewer18.B2.D();
                    photoViewer18.B2.W(photoViewer18.f35746s3);
                    photoViewer18.w0(true);
                    photoViewer18.f35746s3.setVisibility(0);
                    return;
                }
                photoViewer18.f35746s3.setVisibility(4);
                ps0 ps0Var2 = photoViewer18.f35763u2;
                if (ps0Var2 != null) {
                    ps0Var2.removeView(photoViewer18.f35790x2);
                    photoViewer18.f35763u2.removeView(photoViewer18.f35800y2);
                    return;
                }
                return;
        }
    }
}
