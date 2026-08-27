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

public final class yr0 implements Runnable {

    public final int f44889a;

    public final PhotoViewer f44890b;

    public yr0(PhotoViewer photoViewer, int i10) {
        this.f44889a = i10;
        this.f44890b = photoViewer;
    }

    @Override
    public final void run() {
        float bufferedProgressFromPosition;
        ht0 ht0Var;
        switch (this.f44889a) {
            case 0:
                PhotoViewer photoViewer = this.f44890b;
                if (photoViewer.f35651h3 && photoViewer.L3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.v0 v0Var = this.f44890b.f35675k0;
                    if (v0Var == null || !v0Var.t()) {
                        org.telegram.ui.ActionBar.v0 v0Var2 = this.f44890b.f35684l0;
                        if (v0Var2 == null || !v0Var2.t()) {
                            at0 at0Var = this.f44890b.P1;
                            if (at0Var == null || at0Var.getScrollY() == 0) {
                                gd gdVar = this.f44890b.T0;
                                if (gdVar == null || gdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.W8;
                                    PhotoViewer photoViewer3 = this.f44890b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.j3(false, true);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                PhotoViewer photoViewer4 = this.f44890b;
                if (photoViewer4.B2 != null || ((ht0Var = photoViewer4.f35591b0) != null && ht0Var.f27746x)) {
                    if (!photoViewer4.f35702n1) {
                        float fO1 = photoViewer4.o1() / this.f44890b.A1();
                        if (this.f44890b.f35615d5) {
                            bufferedProgressFromPosition = 1.0f;
                        } else {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(jElapsedRealtime - this.f44890b.O3) >= 500) {
                                PhotoViewer photoViewer5 = this.f44890b;
                                ht0 ht0Var2 = photoViewer5.f35591b0;
                                if (ht0Var2 != null && ht0Var2.f27746x) {
                                    bufferedProgressFromPosition = ht0Var2.getBufferedPosition();
                                } else if (photoViewer5.M3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer5.P);
                                    PhotoViewer photoViewer6 = this.f44890b;
                                    float f10 = photoViewer6.W2;
                                    if (f10 == 0.0f) {
                                        f10 = fO1;
                                    }
                                    bufferedProgressFromPosition = fileLoader.getBufferedProgressFromPosition(f10, photoViewer6.Y4[0]);
                                } else {
                                    bufferedProgressFromPosition = 1.0f;
                                }
                                this.f44890b.O3 = jElapsedRealtime;
                            } else {
                                bufferedProgressFromPosition = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.f44890b;
                        if (photoViewer7.f35790w8 || photoViewer7.M7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.f44890b;
                            if (photoViewer8.W2 == 0.0f) {
                                org.telegram.ui.Cells.f1 f1Var = photoViewer8.W3;
                                if (f1Var.rewindCount == 0 || (!f1Var.rewindByBackSeek && !photoViewer8.Y3.rewindByBackSeek)) {
                                    photoViewer8.f35694m3.h(fO1, false);
                                }
                            }
                            if (bufferedProgressFromPosition != -1.0f) {
                                this.f44890b.f35694m3.f(bufferedProgressFromPosition);
                                org.telegram.ui.Components.sf0 sf0Var = org.telegram.ui.Components.sf0.f32415l0;
                                if (bufferedProgressFromPosition > sf0Var.W) {
                                    sf0Var.W = bufferedProgressFromPosition;
                                    jh.a3 a3Var = sf0Var.X;
                                    if (a3Var != null) {
                                        a3Var.invalidate();
                                    }
                                }
                            }
                        } else if (fO1 >= this.f44890b.N7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.f44890b;
                            photoViewer9.D2 = false;
                            photoViewer9.g2();
                            this.f44890b.f35694m3.h(0.0f, false);
                            PhotoViewer photoViewer10 = this.f44890b;
                            photoViewer10.t2((int) (photoViewer10.N7.getLeftProgress() * this.f44890b.A1()));
                            this.f44890b.f35583a0.invalidate();
                        } else {
                            float leftProgress = fO1 - this.f44890b.N7.getLeftProgress();
                            if (leftProgress < 0.0f) {
                                leftProgress = 0.0f;
                            }
                            fO1 = leftProgress / (this.f44890b.N7.getRightProgress() - this.f44890b.N7.getLeftProgress());
                            if (fO1 > 1.0f) {
                                fO1 = 1.0f;
                            }
                            this.f44890b.f35694m3.h(fO1, false);
                        }
                        this.f44890b.f35704n3.invalidate();
                        if (this.f44890b.X2 != null && fO1 >= 0.0f) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer11 = this.f44890b;
                            if (jElapsedRealtime2 - photoViewer11.Z2 >= 1000) {
                                String str = photoViewer11.X2;
                                photoViewer11.Z2 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.f44890b.P4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(fO1);
                                }
                                Utilities.globalQueue.postRunnable(new e0(str, fO1, 4));
                            }
                        }
                        this.f44890b.C3();
                    } else if (!photoViewer4.N7.f34521r) {
                        float fO2 = photoViewer4.o1() / this.f44890b.A1();
                        PhotoViewer photoViewer12 = this.f44890b;
                        if (photoViewer12.f35790w8 || (photoViewer12.f35731q4 == 0 && photoViewer12.M7.getVisibility() != 0)) {
                            PhotoViewer photoViewer13 = this.f44890b;
                            if (photoViewer13.Y1 != 1) {
                                photoViewer13.N7.setProgress(fO2);
                            }
                        } else if (fO2 >= this.f44890b.N7.getRightProgress()) {
                            wr0 wr0Var = this.f44890b.N7;
                            wr0Var.setProgress(wr0Var.getLeftProgress());
                            PhotoViewer photoViewer14 = this.f44890b;
                            photoViewer14.B2.L((int) (photoViewer14.N7.getLeftProgress() * this.f44890b.A1()));
                            PhotoViewer photoViewer15 = this.f44890b;
                            photoViewer15.D2 = false;
                            photoViewer15.u0();
                            PhotoViewer photoViewer16 = this.f44890b;
                            if (photoViewer16.f35735r || photoViewer16.Y1 == 1 || photoViewer16.f35731q4 != 0 || photoViewer16.f35681k6 > 0) {
                                photoViewer16.i2();
                            } else {
                                photoViewer16.g2();
                            }
                            this.f44890b.f35583a0.invalidate();
                        } else {
                            this.f44890b.N7.setProgress(fO2);
                        }
                        this.f44890b.C3();
                    }
                }
                tt0 tt0Var = this.f44890b.A2;
                if (tt0Var != null) {
                    tt0.a(tt0Var);
                }
                PhotoViewer photoViewer17 = this.f44890b;
                if (photoViewer17.L3) {
                    AndroidUtilities.runOnUIThread(photoViewer17.f35614d4, 17L);
                }
                break;
            default:
                PhotoViewer photoViewer18 = this.f44890b;
                if (!org.telegram.ui.Components.sf0.f32415l0.L) {
                    photoViewer18.H3 = false;
                    Bitmap bitmap = photoViewer18.f35804y3;
                    if (bitmap != null) {
                        bitmap.recycle();
                        photoViewer18.f35804y3 = null;
                    }
                    photoViewer18.B3 = true;
                    Activity activity = photoViewer18.f35800y;
                    ag.y1 y1Var = new ag.y1(activity, 26);
                    ImageReceiver imageReceiver = new ImageReceiver(y1Var);
                    y1Var.f706b = imageReceiver;
                    TextureView textureView = new TextureView(activity);
                    y1Var.f707c = textureView;
                    y1Var.addView(textureView);
                    try {
                        if (photoViewer18.f35812z2) {
                            Drawable drawable = photoViewer18.f35758t3.getDrawable();
                            if (drawable instanceof BitmapDrawable) {
                                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                                photoViewer18.f35804y3 = bitmap2;
                                if (bitmap2 != null) {
                                    ImageView imageView = photoViewer18.f35758t3;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                        photoViewer18.f35758t3.setImageBitmap(photoViewer18.f35804y3);
                                    }
                                    imageReceiver.setImageBitmap(photoViewer18.f35804y3);
                                }
                            } else {
                                Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(photoViewer18.f35803y2.getWidth(), photoViewer18.f35803y2.getHeight(), Bitmap.Config.ARGB_8888);
                                photoViewer18.f35804y3 = bitmapCreateBitmap;
                                AndroidUtilities.getBitmapFromSurface(photoViewer18.f35803y2, bitmapCreateBitmap, new zs0(0, this, y1Var));
                            }
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmaps.createBitmap(photoViewer18.f35794x2.getWidth(), photoViewer18.f35794x2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer18.f35804y3 = bitmapCreateBitmap2;
                            photoViewer18.f35794x2.getBitmap(bitmapCreateBitmap2);
                            if (photoViewer18.f35804y3 != null) {
                                ImageView imageView2 = photoViewer18.f35758t3;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    photoViewer18.f35758t3.setImageBitmap(photoViewer18.f35804y3);
                                }
                                imageReceiver.setImageBitmap(photoViewer18.f35804y3);
                            }
                        }
                    } catch (Throwable th) {
                        Bitmap bitmap3 = photoViewer18.f35804y3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer18.f35804y3 = null;
                        }
                        FileLog.e(th);
                    }
                    photoViewer18.F3 = true;
                    photoViewer18.f35749s3 = (TextureView) y1Var.f707c;
                    if (org.telegram.ui.Components.sf0.x(false, photoViewer18.f35800y, null, y1Var, photoViewer18.Q, photoViewer18.R, photoViewer18.G3)) {
                        org.telegram.ui.Components.sf0.w(photoViewer18);
                    }
                    photoViewer18.G3 = true;
                    if (!photoViewer18.f35812z2) {
                        photoViewer18.f35749s3.setVisibility(4);
                        qs0 qs0Var = photoViewer18.f35766u2;
                        if (qs0Var != null) {
                            qs0Var.removeView(photoViewer18.f35794x2);
                            photoViewer18.f35766u2.removeView(photoViewer18.f35803y2);
                        }
                    } else {
                        qs0 qs0Var2 = photoViewer18.f35766u2;
                        if (qs0Var2 != null) {
                            qs0Var2.removeView(photoViewer18.f35794x2);
                            photoViewer18.f35766u2.removeView(photoViewer18.f35803y2);
                        }
                        photoViewer18.B2.V(null);
                        photoViewer18.B2.W(null);
                        photoViewer18.B2.D();
                        photoViewer18.B2.W(photoViewer18.f35749s3);
                        photoViewer18.x0(true);
                        photoViewer18.f35749s3.setVisibility(0);
                    }
                } else {
                    org.telegram.ui.Components.sf0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                }
                break;
        }
    }
}
