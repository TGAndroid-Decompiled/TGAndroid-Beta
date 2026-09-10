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
    public final int f39437a;
    public final PhotoViewer f39438b;

    public zs0(PhotoViewer photoViewer, int i10) {
        this.f39437a = i10;
        this.f39438b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        hu0 hu0Var;
        switch (this.f39437a) {
            case 0:
                PhotoViewer photoViewer = this.f39438b;
                if (photoViewer.f30112l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.f39438b.f30135o0;
                    if (w0Var == null || !w0Var.t()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.f39438b.f30144p0;
                        if (w0Var2 == null || !w0Var2.t()) {
                            au0 au0Var = this.f39438b.T1;
                            if (au0Var == null || au0Var.getScrollY() == 0) {
                                ld ldVar = this.f39438b.X0;
                                if (ldVar == null || ldVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.f30010a9;
                                    PhotoViewer photoViewer3 = this.f39438b;
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
                PhotoViewer photoViewer4 = this.f39438b;
                if (photoViewer4.F2 != null || ((hu0Var = photoViewer4.f30058f0) != null && hu0Var.f29666x)) {
                    if (photoViewer4.f30162r1) {
                        if (!photoViewer4.R7.f22626r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f39438b.A1());
                            PhotoViewer photoViewer5 = this.f39438b;
                            if (!photoViewer5.A8 && (photoViewer5.f30193u4 != 0 || photoViewer5.Q7.getVisibility() == 0)) {
                                if (o12 >= this.f39438b.R7.getRightProgress()) {
                                    xs0 xs0Var = this.f39438b.R7;
                                    xs0Var.setProgress(xs0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f39438b;
                                    photoViewer6.F2.K((int) (photoViewer6.R7.getLeftProgress() * ((float) this.f39438b.A1())));
                                    PhotoViewer photoViewer7 = this.f39438b;
                                    photoViewer7.H2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f39438b;
                                    if (!photoViewer8.f30160r && photoViewer8.f30033c2 != 1 && photoViewer8.f30193u4 == 0 && photoViewer8.f30141o6 <= 0) {
                                        photoViewer8.g2();
                                    } else {
                                        photoViewer8.i2();
                                    }
                                    this.f39438b.f30049e0.invalidate();
                                } else {
                                    this.f39438b.R7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f39438b;
                                if (photoViewer9.f30033c2 != 1) {
                                    photoViewer9.R7.setProgress(o12);
                                }
                            }
                            this.f39438b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f39438b.A1());
                        if (this.f39438b.f30080h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f39438b.S3) >= 500) {
                                PhotoViewer photoViewer10 = this.f39438b;
                                hu0 hu0Var2 = photoViewer10.f30058f0;
                                if (hu0Var2 != null && hu0Var2.f29666x) {
                                    f7 = hu0Var2.getBufferedPosition();
                                } else if (photoViewer10.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.T);
                                    PhotoViewer photoViewer11 = this.f39438b;
                                    float f10 = photoViewer11.f30014a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer11.f30036c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f39438b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f39438b;
                        if (!photoViewer12.A8 && photoViewer12.Q7.getVisibility() == 0) {
                            if (o13 >= this.f39438b.R7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f39438b;
                                photoViewer13.H2 = false;
                                photoViewer13.g2();
                                this.f39438b.f30155q3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f39438b;
                                photoViewer14.t2((int) (photoViewer14.R7.getLeftProgress() * ((float) this.f39438b.A1())));
                                this.f39438b.f30049e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f39438b.R7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f39438b.R7.getRightProgress() - this.f39438b.R7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f39438b.f30155q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f39438b;
                            if (photoViewer15.f30014a3 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer15.f30015a4;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer15.f30035c4.rewindByBackSeek)) {
                                    photoViewer15.f30155q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f39438b.f30155q3.f(f7);
                                org.telegram.ui.Components.og0 og0Var = org.telegram.ui.Components.og0.f25781p0;
                                if (f7 > og0Var.f25783a0) {
                                    og0Var.f25783a0 = f7;
                                    u7 u7Var = og0Var.f25785b0;
                                    if (u7Var != null) {
                                        u7Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f39438b.f30164r3.invalidate();
                        if (this.f39438b.f30024b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f39438b;
                            if (elapsedRealtime2 - photoViewer16.f30043d3 >= 1000) {
                                String str = photoViewer16.f30024b3;
                                photoViewer16.f30043d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f39438b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new c0(str, o13, 4));
                            }
                        }
                        this.f39438b.C3();
                    }
                }
                vu0 vu0Var = this.f39438b.E2;
                if (vu0Var != null) {
                    vu0.a(vu0Var);
                }
                PhotoViewer photoViewer17 = this.f39438b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f30079h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f39438b;
                if (org.telegram.ui.Components.og0.f25781p0.P) {
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
                Activity activity = photoViewer18.f30227y;
                bi.n7 n7Var = new bi.n7(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(n7Var);
                n7Var.f3239b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                n7Var.f3240c = textureView;
                n7Var.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f30221x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f30221x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f30221x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new ak0(21, this, n7Var));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f30221x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f30221x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f30211w3 = (TextureView) n7Var.f3240c;
                if (org.telegram.ui.Components.og0.x(false, photoViewer18.f30227y, null, n7Var, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.og0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    rt0 rt0Var = photoViewer18.f30230y2;
                    if (rt0Var != null) {
                        rt0Var.removeView(photoViewer18.B2);
                        photoViewer18.f30230y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f30211w3);
                    photoViewer18.x0(true);
                    photoViewer18.f30211w3.setVisibility(0);
                    return;
                }
                photoViewer18.f30211w3.setVisibility(4);
                rt0 rt0Var2 = photoViewer18.f30230y2;
                if (rt0Var2 != null) {
                    rt0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f30230y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
