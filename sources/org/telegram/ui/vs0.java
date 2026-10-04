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
public final class vs0 implements Runnable {
    public final int f41818a;
    public final PhotoViewer f41819b;

    public vs0(PhotoViewer photoViewer, int i10) {
        this.f41818a = i10;
        this.f41819b = photoViewer;
    }

    @Override
    public final void run() {
        float f7;
        du0 du0Var;
        switch (this.f41818a) {
            case 0:
                PhotoViewer photoViewer = this.f41819b;
                if (photoViewer.f33964l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.v0 v0Var = this.f41819b.f33987o0;
                    if (v0Var == null || !v0Var.t()) {
                        org.telegram.ui.ActionBar.v0 v0Var2 = this.f41819b.f33996p0;
                        if (v0Var2 == null || !v0Var2.t()) {
                            wt0 wt0Var = this.f41819b.T1;
                            if (wt0Var == null || wt0Var.getScrollY() == 0) {
                                ld ldVar = this.f41819b.X0;
                                if (ldVar == null || ldVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.f33861b9;
                                    PhotoViewer photoViewer3 = this.f41819b;
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
                PhotoViewer photoViewer4 = this.f41819b;
                if (photoViewer4.F2 != null || ((du0Var = photoViewer4.f33910f0) != null && du0Var.f25729x)) {
                    if (photoViewer4.f34014r1) {
                        if (!photoViewer4.S7.f29299r) {
                            float o12 = ((float) photoViewer4.o1()) / ((float) this.f41819b.A1());
                            PhotoViewer photoViewer5 = this.f41819b;
                            if (!photoViewer5.B8 && (photoViewer5.f34045u4 != 0 || photoViewer5.R7.getVisibility() == 0)) {
                                if (o12 >= this.f41819b.S7.getRightProgress()) {
                                    ts0 ts0Var = this.f41819b.S7;
                                    ts0Var.setProgress(ts0Var.getLeftProgress());
                                    PhotoViewer photoViewer6 = this.f41819b;
                                    photoViewer6.F2.K((int) (photoViewer6.S7.getLeftProgress() * ((float) this.f41819b.A1())));
                                    PhotoViewer photoViewer7 = this.f41819b;
                                    photoViewer7.H2 = false;
                                    photoViewer7.u0();
                                    PhotoViewer photoViewer8 = this.f41819b;
                                    if (!photoViewer8.f34012r && photoViewer8.f33884c2 != 1 && photoViewer8.f34045u4 == 0 && photoViewer8.f33993o6 <= 0) {
                                        photoViewer8.h2();
                                    } else {
                                        photoViewer8.j2();
                                    }
                                    this.f41819b.f33901e0.invalidate();
                                } else {
                                    this.f41819b.S7.setProgress(o12);
                                }
                            } else {
                                PhotoViewer photoViewer9 = this.f41819b;
                                if (photoViewer9.f33884c2 != 1) {
                                    photoViewer9.S7.setProgress(o12);
                                }
                            }
                            this.f41819b.C3();
                        }
                    } else {
                        float o13 = ((float) photoViewer4.o1()) / ((float) this.f41819b.A1());
                        if (this.f41819b.f33932h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.f41819b.S3) >= 500) {
                                PhotoViewer photoViewer10 = this.f41819b;
                                du0 du0Var2 = photoViewer10.f33910f0;
                                if (du0Var2 != null && du0Var2.f25729x) {
                                    f7 = du0Var2.getBufferedPosition();
                                } else if (photoViewer10.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer10.T);
                                    PhotoViewer photoViewer11 = this.f41819b;
                                    float f10 = photoViewer11.f33865a3;
                                    if (f10 == 0.0f) {
                                        f10 = o13;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer11.f33887c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.f41819b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer12 = this.f41819b;
                        if (!photoViewer12.B8 && photoViewer12.R7.getVisibility() == 0) {
                            if (o13 >= this.f41819b.S7.getRightProgress()) {
                                PhotoViewer photoViewer13 = this.f41819b;
                                photoViewer13.H2 = false;
                                photoViewer13.h2();
                                this.f41819b.f34007q3.h(0.0f, false);
                                PhotoViewer photoViewer14 = this.f41819b;
                                photoViewer14.t2((int) (photoViewer14.S7.getLeftProgress() * ((float) this.f41819b.A1())));
                                this.f41819b.f33901e0.invalidate();
                            } else {
                                float leftProgress = o13 - this.f41819b.S7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                o13 = leftProgress / (this.f41819b.S7.getRightProgress() - this.f41819b.S7.getLeftProgress());
                                if (o13 > 1.0f) {
                                    o13 = 1.0f;
                                }
                                this.f41819b.f34007q3.h(o13, false);
                            }
                        } else {
                            PhotoViewer photoViewer15 = this.f41819b;
                            if (photoViewer15.f33865a3 == 0.0f) {
                                org.telegram.ui.Cells.h1 h1Var = photoViewer15.f33866a4;
                                if (h1Var.rewindCount == 0 || (!h1Var.rewindByBackSeek && !photoViewer15.f33886c4.rewindByBackSeek)) {
                                    photoViewer15.f34007q3.h(o13, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.f41819b.f34007q3.f(f7);
                                org.telegram.ui.Components.rg0 rg0Var = org.telegram.ui.Components.rg0.f30384p0;
                                if (f7 > rg0Var.f30386a0) {
                                    rg0Var.f30386a0 = f7;
                                    ai.n4 n4Var = rg0Var.f30388b0;
                                    if (n4Var != null) {
                                        n4Var.invalidate();
                                    }
                                }
                            }
                        }
                        this.f41819b.f34016r3.invalidate();
                        if (this.f41819b.f33875b3 != null && o13 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer16 = this.f41819b;
                            if (elapsedRealtime2 - photoViewer16.f33894d3 >= 1000) {
                                String str = photoViewer16.f33875b3;
                                photoViewer16.f33894d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f41819b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o13);
                                }
                                Utilities.globalQueue.postRunnable(new c0(str, o13, 4));
                            }
                        }
                        this.f41819b.C3();
                    }
                }
                pu0 pu0Var = this.f41819b.E2;
                if (pu0Var != null) {
                    pu0.a(pu0Var);
                }
                PhotoViewer photoViewer17 = this.f41819b;
                if (photoViewer17.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f33931h4, 17L);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer18 = this.f41819b;
                if (org.telegram.ui.Components.rg0.f30384p0.P) {
                    org.telegram.ui.Components.rg0.j(false);
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
                Activity activity = photoViewer18.f34079y;
                ci.m6 m6Var = new ci.m6(activity, 24);
                ImageReceiver imageReceiver = new ImageReceiver(m6Var);
                m6Var.f5570b = imageReceiver;
                TextureView textureView = new TextureView(activity);
                m6Var.f5571c = textureView;
                m6Var.addView(textureView);
                try {
                    if (photoViewer18.D2) {
                        Drawable drawable = photoViewer18.f34073x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer18.C3 = bitmap2;
                            if (bitmap2 != null) {
                                ImageView imageView = photoViewer18.f34073x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer18.f34073x3.setImageBitmap(photoViewer18.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.C3);
                            }
                        } else {
                            Bitmap createBitmap = Bitmaps.createBitmap(photoViewer18.C2.getWidth(), photoViewer18.C2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.C3 = createBitmap;
                            AndroidUtilities.getBitmapFromSurface(photoViewer18.C2, createBitmap, new wj0(21, this, m6Var));
                        }
                    } else {
                        Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer18.B2.getWidth(), photoViewer18.B2.getHeight(), Bitmap.Config.ARGB_8888);
                        photoViewer18.C3 = createBitmap2;
                        photoViewer18.B2.getBitmap(createBitmap2);
                        if (photoViewer18.C3 != null) {
                            ImageView imageView2 = photoViewer18.f34073x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer18.f34073x3.setImageBitmap(photoViewer18.C3);
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
                photoViewer18.f34063w3 = (TextureView) m6Var.f5571c;
                if (org.telegram.ui.Components.rg0.x(false, photoViewer18.f34079y, null, m6Var, photoViewer18.U, photoViewer18.V, photoViewer18.K3)) {
                    org.telegram.ui.Components.rg0.w(photoViewer18);
                }
                photoViewer18.K3 = true;
                if (photoViewer18.D2) {
                    nt0 nt0Var = photoViewer18.f34082y2;
                    if (nt0Var != null) {
                        nt0Var.removeView(photoViewer18.B2);
                        photoViewer18.f34082y2.removeView(photoViewer18.C2);
                    }
                    photoViewer18.F2.U(null);
                    photoViewer18.F2.V(null);
                    photoViewer18.F2.C();
                    photoViewer18.F2.V(photoViewer18.f34063w3);
                    photoViewer18.x0(true);
                    photoViewer18.f34063w3.setVisibility(0);
                    return;
                }
                photoViewer18.f34063w3.setVisibility(4);
                nt0 nt0Var2 = photoViewer18.f34082y2;
                if (nt0Var2 != null) {
                    nt0Var2.removeView(photoViewer18.B2);
                    photoViewer18.f34082y2.removeView(photoViewer18.C2);
                    return;
                }
                return;
        }
    }
}
